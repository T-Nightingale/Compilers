package visitor;

import syntaxtree.*;

import errorMsg.*;
import java.io.*;

public class CG3Visitor extends ASTvisitor {
	// the purpose here is to annotate things with their offsets:
	// - formal parameters, with respect to the (callee) frame
	// - local variables, with respect to the frame
	// - instance variables, with respect to their slot in the object
	// - methods, with respect to their slot in the v-table
	// - while statements, with respect to the stack-size at the time
	//   of loop-exit
	
	// IO stream to which we will emit code
	CodeStream code;

	// current stack height
	int stackHeight;
	
	// error-message object
	ErrorMsg errorMsg;
	
	public CG3Visitor(ErrorMsg e, PrintStream out) {
		initInstanceVars(e, out);
	}
	
	private void initInstanceVars(ErrorMsg e, PrintStream out) {
		errorMsg = e;
		code = new CodeStream(out, errorMsg);
		stackHeight = 0;
	}

	@Override
	public Object visitLocalVarDecl(LocalVarDecl n) {
		n.initExp.accept(this);
		n.offset = -stackHeight;
		//TODO: do we do more here?
		return null;
	}

	@Override
	public Object visitIntegerLiteral(IntegerLiteral n) {
		code.emit(n, "subu $sp, $sp, 8");
		stackHeight += 8;
		code.emit(n, "sw $s5, 4($sp)");
		code.emit(n, "li $t0, " + n.val);
		code.emit(n, "sw $t0, ($sp)");
		return null;
	}

	@Override
	public Object visitStringLiteral(StringLiteral n) {
		code.emit(n, "subu $sp, $sp, 4");
		stackHeight += 4;
		code.emit(n, "la $t0, strLit_" + n.uniqueCgRep.uniqueId);
		code.emit(n, "sw $t0, ($sp)");
		return null;
	}

	@Override
	public Object visitPlus(Plus n) {
		n.left.accept(this);
		n.right.accept(this);
		code.emit(n, "lw $t0, ($sp)");
		code.emit(n, "lw $t1, 8($sp)");
		code.emit(n, "addu $t0, $t0, $t1");
		code.emit(n, "addu $sp, $sp, 8");
		stackHeight -= 8;
		code.emit(n, "sw $t0, ($sp)");
		return null;
	}

	@Override
	public Object visitMinus(Minus n) {
		n.left.accept(this);
		n.right.accept(this);
		code.emit(n, "lw $t0, ($sp)");
		code.emit(n, "lw $t1, 8($sp)");
		code.emit(n, "subu $t0, $t0, $t1");
		code.emit(n, "addu $sp, $sp, 8");
		stackHeight -= 8;
		code.emit(n, "sw $t0, ($sp)");
		return null;
	}

	@Override
	public Object visitThis(This n) {
		code.emit(n, "subu $sp, $sp, 4");
		stackHeight += 4;
		code.emit(n, "sw $s2, ($sp)");
		return null;
	}

	@Override
	public Object visitSuper(Super n) {
		code.emit(n, "subu $sp, $sp, 4");
		stackHeight += 4;
		code.emit(n, "sw $s2, ($sp)");
		return null;
	}

	@Override
	public Object visitNewObject(NewObject n) {
//		code.emit(n, "li $s6, " + n.objType.link.numObjInstVars);
//		code.emit(n, "li $s6, " + (n.objType.link.numDataInstVars + 1));
//		code.emit(n, "jal newObject");
//		stackHeight += 4;
//		code.emit(n, "la $t0, CLASS_" + n.objType.name);
//		code.emit(n, "sw $t0, -12($s7)");

		code.emit(n, "subu $sp, $sp, 4");
		code.emit(n, "sw $zero, ($sp)");
		stackHeight += 4;
		return null;
	}

	@Override
	public Object visitCall(Call n) {
		int savedStackHeight = stackHeight;
		n.obj.accept(this);
		n.parms.accept(this);

		// Object is a super
//		if(n.obj instanceof Super) {
			// Check if method is a library method or not
			if(n.methodLink.pos < 0) {
				code.emit(n, "jal " + n.methodLink.name);
			}
			else {
				code.emit(n, "jal fcn_" + n.methodLink.uniqueId + "_" + n.methodLink.name);
			}
//		}
//		// Object is not a super
//		else {
//			int mmm = n.methodLink.thisPtrOffset - 4;
//			int nnn = 4 * n.methodLink.vtableOffset;
//			code.emit(n, "lw $t0, " + mmm + "($sp)");
//			code.emit(n, "beq $t0, $zero, nullPtrException");
//			code.emit(n, "lw $t0, -12($t0)");
//			code.emit(n, "lw $t0, " + nnn +"($t0)");
//			code.emit(n, "jalr $t0");
//		}

		//TODO: make sure this is correct. (See slide 20.18)
		int expTypeOffset;
		if (n.type instanceof VoidType) {
			expTypeOffset = 0;
		}
		else if(n.type instanceof IntegerType) {
			expTypeOffset = 8;
		}
		else {
			expTypeOffset = 4;
		}

		stackHeight = savedStackHeight + expTypeOffset;

		return null;
	}

	@Override
	public Object visitIdentifierExp(IdentifierExp n) {
		if(n.link instanceof InstVarDecl) {
			code.emit(n, "lw $t0, " + n.link.offset + "($s2)");
		}
		else {
			int stackDepth = stackHeight + n.link.offset;
			code.emit(n, "lw $t0, " + stackDepth + "($sp)");
		}

		if(n.type instanceof IntegerType) {
			code.emit(n, "subu $sp, $sp, 8");
			stackHeight += 8;
			code.emit(n, "sw $s5, 4($sp)");
			code.emit(n, "sw $t0, ($sp)");
		}
		else {
			code.emit(n, "subu $sp, $sp, 4");
			stackHeight += 4;
			code.emit(n, "sw $t0, ($sp)");
		}

		return null;
	}

	@Override
	public Object visitProgram(Program n) {
		code.emit(n, ".text");

		code.emit(n, ".globl main");
		code.emit(n, "main:");

		// Initialize registers
		code.emit(n, "jal vm_init");
		stackHeight = 0;

		// Generate all the codes.
		n.mainStatement.accept(this);

		//Exit program
		code.emit(n, "li $v0, 10");
		code.emit(n, "syscall");

		// Generate all the class decls
		n.classDecls.accept(this);
		code.emit(n, "CLASS_String:"); //TODO: This is for part A, remove later
		code.emit(n, "CLASS_END_String:");
		code.emit(n, "CLASS_Object:");
		code.emit(n, "CLASS_END_Object:");

		// flush the code stream
		code.flush();

		return null;
	}

	@Override
	public Object visitMethodDeclVoid(MethodDeclVoid n) {
		code.emit(n, ".globl fcn_" + n.uniqueId + "_" + n.name);
		code.emit(n, "fcn_" + n.uniqueId + "_" + n.name + ":");
		code.emit(n, "subu $sp, $sp, 8");
		code.emit(n, "sw $ra, 4($sp)");
		code.emit(n, "sw $s2, ($sp)");
		stackHeight = 4;

		int stackTopRelativeLocation = 4 + n.thisPtrOffset;

		code.emit(n, "lw $s2, " + stackTopRelativeLocation + "($sp)");

		// Generate code for the body
		n.stmts.accept(this);

		// Determine the offset of the saved return address
		int offsetReturnAddress = stackHeight;
		code.emit(n, "lw $ra, " + offsetReturnAddress + "($sp)");

		// Determine the offset of the this-pointer (relative to the current stack height)
		int offsetSavedThisPointer = stackHeight - 4;
		code.emit(n, "lw $s2, " + offsetSavedThisPointer + "($sp)");

		// Compute amount to pop stack
		int spaceForReturnAddress = 4;
		int spaceForThisPointer = 4;
		int spaceForAllParams = 0;

		for(VarDecl v: n.formals) {
			int expTypeOffset;
			if(v.type instanceof IntegerType) {
				spaceForAllParams += 8;
			}
			else {
				spaceForAllParams += 4;
			}
		}

		int offsetPopStack = stackHeight + spaceForReturnAddress + spaceForAllParams + spaceForThisPointer;

		code.emit(n, "addu $sp, $sp, " + offsetPopStack);
		code.emit(n, "jr $ra");

		return null;
	}



//	@Override
//	public Object visitNull(Null n) {
//		code.emit(n, "subu $sp, $sp, 4");
//		stackHeight -= 4;
//		code.emit(n, "sw $zero, ($sp)");
//		return null;
//	}
	
}


	
