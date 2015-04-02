package visitor;

import syntaxtree.*;

import java.util.*;

import errorMsg.*;
// The purpose of this class is to do type-checking and related
// actions.  These include:
// - evaluate the type for each expression, filling in the 'type'
//   link for each
// - ensure that each expression follows MiniJava's type rules (e.g.,
//   that the arguments to '*' are both integer, the argument to
//   '.length' is an array, etc.)
// - ensure that each method-call follows Java's type rules:
//   - there exists a method for the given class (or a superclass)
//     for the receiver's object type
//   - the method has the correct number of parameters
//   - the types of each actual parameter is compatible with that
//     of its corresponding formal parameter
// - ensure that for each instance variable access (e.g., abc.foo),
//   there is an instance variable defined for the given class (or
//   in a superclass
//   - sets the 'varDec' link in the InstVarAccess to refer to the
//     method
// - ensure that the RHS expression in each assignment statement is
//   type-compatible with its corresponding LHS
//   - also checks that the LHS an lvalue
// - ensure that if a method with a given name is defined in both
//   a subclass and a superclass, that they have the same parameters
//   (with identical types) and the same return type
// - ensure that the declared return-type of a method is compatible
//   with its "return" expression
// - ensuring that the type of the control expression for an if- or
//   while-statement is boolean
public class Sem4Visitor extends ASTvisitor {

    public static final int NO_ERROR = -1;
	
	ClassDecl currentClass;                // The Class we are currently processing
	IdentifierType currentClassType;
	IdentifierType currentSuperclassType;
	ErrorMsg errorMsg;                     // Object to apply warnings and errors to.
	Hashtable<String,ClassDecl> globalSymTab;
	
	BooleanType theBoolType;
	IntegerType theIntType;
	NullType theNullType;
	VoidType theVoidType;
	IdentifierType theStringType;
	
	public Sem4Visitor(Hashtable<String,ClassDecl> globalSymTb, ErrorMsg e) {
		globalSymTab = globalSymTb;
		errorMsg = e;
		initInstanceVars();
	}

	private void initInstanceVars() {
		currentClass = null;
		
		theBoolType = new BooleanType(-1);
		theIntType = new IntegerType(-1);
		theNullType = new NullType(-1);
		theVoidType = new VoidType(-1);
		if (globalSymTab != null) {
			theStringType = new IdentifierType(-1, "String");
			theStringType.link = globalSymTab.get("String");
		}
	}


    /**
     * Visitors
     **/
    @Override
    public Object visitIntegerLiteral(IntegerLiteral n) {
        super.visitIntegerLiteral(n);
        n.type = theIntType;
        return null;
    }

    @Override
    public Object visitStringLiteral(StringLiteral s) {
        super.visitStringLiteral(s);
        s.type = theStringType;
        return null;
    }

    @Override
    public Object visitNull(Null n) {
        super.visitNull(n);
        n.type = theNullType;
        return null;
    }

    @Override
    public Object visitTrue(True t) {
        super.visitTrue(t);
        t.type = theBoolType;
        return null;
    }

    @Override
    public Object visitFalse(False f) {
        super.visitFalse(f);
        f.type = theBoolType;
        return null;
    }

    @Override
    public Object visitThis(This t) {
        super.visitThis(t);
        t.type = currentClassType;
        return null;
    }

    @Override
    public Object visitSuper(Super s) {
        super.visitSuper(s);
        s.type = currentSuperclassType;
        return null;
    }

    @Override
    public Object visitIdentifierExp(IdentifierExp i) {
        super.visitIdentifierExp(i);
        i.type = i.link.type;
        return null;
    }

    @Override
    public Object visitPlus(Plus p) {
        super.visitPlus(p);
        matchTypesExact(p.left.type, theIntType, p.left.pos);
        matchTypesExact(p.right.type, theIntType, p.right.pos);
        p.type = theIntType;
        return null;
    }

    @Override
    public Object visitMinus(Minus m) {
        super.visitMinus(m);
        matchTypesExact(m.left.type, theIntType, m.left.pos);
        matchTypesExact(m.right.type, theIntType, m.right.pos);
        m.type = theIntType;
        return null;
    }

    @Override
    public Object visitTimes(Times t) {
        super.visitTimes(t);
        matchTypesExact(t.left.type, theIntType, t.left.pos);
        matchTypesExact(t.right.type, theIntType, t.right.pos);
        t.type = theIntType;
        return null;
    }

    @Override
    public Object visitDivide(Divide d) {
        super.visitDivide(d);
        matchTypesExact(d.left.type, theIntType, d.left.pos);
        matchTypesExact(d.right.type, theIntType, d.right.pos);
        d.type = theIntType;
        return null;
    }

    @Override
    public Object visitRemainder(Remainder r) {
        super.visitRemainder(r);
        matchTypesExact(r.left.type, theIntType, r.left.pos);
        matchTypesExact(r.right.type, theIntType, r.right.pos);
        r.type = theIntType;
        return null;
    }

    @Override
    public Object visitGreaterThan(GreaterThan g) {
        super.visitGreaterThan(g);
        matchTypesExact(g.left.type, theIntType, g.left.pos);
        matchTypesExact(g.right.type, theIntType, g.right.pos);
        g.type = theBoolType;
        return null;
    }


    @Override
    public Object visitLessThan(LessThan l) {
        super.visitLessThan(l);
        matchTypesExact(l.left.type, theIntType, l.left.pos);
        matchTypesExact(l.right.type, theIntType, l.right.pos);
        l.type = theBoolType;
        return null;
    }

    @Override
    public Object visitEquals(Equals e) {
        super.visitEquals(e);
        matchTypesEqCompare(e.left.type, e.right.type, e.pos);
        e.type = theBoolType;
        return null;
    }

    @Override
    public Object visitNot(Not n) {
        super.visitNot(n);
        matchTypesExact(n.exp.type, theBoolType, n.pos);
        n.type = theBoolType;
        return null;
    }

    @Override
    public Object visitAnd(And a) {
        super.visitAnd(a);
        matchTypesExact(a.right.type, a.left.type, a.pos);
        a.type = theBoolType;
        return null;
    }

    @Override
    public Object visitOr(Or o) {
        super.visitOr(o);
        matchTypesExact(o.right.type, o.left.type, o.pos);
        o.type = theBoolType;
        return null;
    }

    @Override
    public Object visitArrayLength(ArrayLength a) {
        super.visitArrayLength(a);

        // the variable must be an array
        if(a.exp.type == null) {
            errorMsg.error(a.pos, "Error: expression type null");
        }
        else if(!(a.exp.type instanceof ArrayType)) {
            errorMsg.error(a.pos, "Error: expected 'ArrayType' found '" + a.exp.type.toString2() + "'");
        }

        a.type = theIntType;
        return null;
    }

    @Override
    public Object visitArrayLookup(ArrayLookup a) {
        super.visitArrayLookup(a);
        // index must be an int
        matchTypesExact(a.idxExp.type, theIntType, a.pos);

        // the variable must be an array
        if(a.arrExp.type == null) {
            errorMsg.error(a.pos, "Error: array expression type null");
            a.type = null;
            return null;
        }
        else if(!(a.arrExp.type instanceof ArrayType)) {
            errorMsg.error(a.pos, "Error: expected 'ArrayType' found '" + a.arrExp.type.toString2() + "'");
            a.type = null;
            return null;
        }

        a.type = ((ArrayType) a.arrExp.type).baseType;
        return null;
    }

    @Override
    public Object visitInstVarAccess(InstVarAccess i) {
        super.visitInstVarAccess(i);
        if(i.exp.type == null) {
            return null;
        }
        i.varDec = instVarLookup(i.varName, i.type, i.pos,
                "Error: instance variable '" + i.varName + "' not defined for'" + i.exp.type.toString2() + "'");
        if(i.varDec != null) {
            i.type = i.varDec.type;
        }
        else {
            errorMsg.error(i.pos,
                    "Error: instance variable '" + i.varName + "' not defined for '" + i.exp.type.toString2() + "'");
        }
        return null;
    }

    @Override
    public Object visitCast(Cast c) {
        super.visitCast(c);
        if(!(
                matchTypesAssign(c.exp.type, c.castType, NO_ERROR) ||
                matchTypesAssign(c.castType, c.exp.type, NO_ERROR))) {
            if(c.castType != null && c.exp.type !=  null) {
                errorMsg.error(c.pos,
                        "Incompatible types for 'cast': '" + c.castType.toString2() + "' and '" + c.exp.type.toString2() + "'");
            }
        }
        c.type = c.castType;
        return null;
    }

    @Override
    public Object visitInstanceOf(InstanceOf i) {
        super.visitInstanceOf(i);
        if(!(
                matchTypesAssign(i.exp.type, i.checkType, NO_ERROR) ||
                matchTypesAssign(i.checkType, i.exp.type, NO_ERROR))) {
            if(i.checkType != null && i.exp.type !=  null) {
                errorMsg.error(i.pos,
                        "Incompatible types for 'instanceof': '" + i.checkType.toString2() + "' and '" + i.exp.type.toString2() + "'");
            }
        }
        i.type = theBoolType;
        return null;
    }

    @Override
    public Object visitNewObject(NewObject n) {
        super.visitNewObject(n);
        n.type = n.objType;
        return null;
    }

    @Override
    public Object visitNewArray(NewArray n) {
        super.visitNewArray(n);

        // the size must be an integer
        matchTypesExact(n.sizeExp.type, theIntType, n.sizeExp.pos);

        n.type = n.objType;
        return null;
    }

    @Override
    public Object visitCall(Call c) {
        super.visitCall(c);
        if(c.obj.type == null) {
            return null;
        }

        // Make sure method exists
        c.methodLink = methodLookup(c.methName, c.obj.type, c.pos,
                "Error: method '" + c.methName +"' does not exist in '" + c.obj.type.toString2() + "'");
        if(c.methodLink == null) {
            return null;
        }

        // Make sure parameters are correct
        if(c.parms.size() != c.methodLink.formals.size()) {
            errorMsg.error(c.pos,
                    "Error: incorrect number of parameters in call to '"
                            + c.methName + "': " + c.parms.size() + " (" + c.methodLink.formals.size() + " expected)");
        }
        else {
            for (int i = 0; i < c.parms.size(); i++) {
                matchTypesAssign(
                        c.parms.elementAt(i).type,
                        c.methodLink.formals.elementAt(i).type,
                        c.parms.elementAt(i).pos);
            }
        }


        c.type = this.returnTypeFor(c.methodLink);
        return  null;
    }

    @Override
    public Object visitAssign(Assign a) {
        super.visitAssign(a);
        if(!(a.lhs instanceof  IdentifierExp ||
                        a.lhs instanceof ArrayLookup || a.lhs instanceof InstVarAccess)) {
            errorMsg.error(a.pos, "Error: can only assign values to identifier expressions, array look-ups, or instance variable access");
            return null;
        }

        matchTypesAssign(a.rhs.type, a.lhs.type, a.pos);
        return null;
    }

    @Override
    public Object visitLocalVarDecl(LocalVarDecl l) {
        super.visitLocalVarDecl(l);
        matchTypesAssign(l.initExp.type, l.type, l.pos);
        return null;
    }

    @Override
    public Object visitIf(If i) {
        super.visitIf(i);
        matchTypesExact(i.exp.type, theBoolType, i.pos);
        return null;
    }

    @Override
    public Object visitWhile(While w) {
        super.visitWhile(w);
        matchTypesExact(w.exp.type, theBoolType, w.pos);
        return null;
    }

    @Override
    public Object visitMethodDeclVoid(MethodDeclVoid m) {
        super.visitMethodDeclVoid(m);

        // Check if a superclass defines a method of the same name
        MethodDecl superMethod = getSuperMethod(m);
        if(superMethod != null) {
            // make sure super class method is a methodDeclVoid
            if(!(superMethod instanceof MethodDeclVoid)) {
                errorMsg.error(m.pos, "Error: expected '" + ((MethodDeclNonVoid)superMethod).rtnType.toString2() + "' return type, found 'void'");
            }
            // make sure the number of, and types of parameters match exactly
            if(!methodsMatch(m, superMethod)) {
                errorMsg.error(m.pos, "Error: '" + m.name + " and super class's formal parameters do not match.");
                return null;
            }

            m.superMethod = superMethod;
        }
        return null;
    }

    @Override
    public Object visitMethodDeclNonVoid(MethodDeclNonVoid m) {
        super.visitMethodDeclNonVoid(m);

        // Check that the type of the return expression is assign compat. with the declared return type
        matchTypesAssign(m.rtnExp.type, m.rtnType, m.rtnExp.pos);

        // Check if a superclass defines a method of the same name
        MethodDecl superMethod = getSuperMethod(m);
        if(superMethod != null) {
            // make sure super class method is a methodDeclNonVoid
            if(!(superMethod instanceof MethodDeclNonVoid)) {
                errorMsg.error(m.pos, "Error: expected 'void' return type, found '" + m.rtnType.toString2() + "'");
            }
            // make sure the number of, and types of parameters match exactly
            if(!methodsMatch(m, superMethod)) {
                errorMsg.error(m.pos, "Error: '" + m.name + " and super class's formal parameters do not match.");
                return null;
            }

            m.superMethod = superMethod;
        }

        return null;
    }

    @Override
    public Object visitClassDecl(ClassDecl c) {
        this.currentClass = c;
        this.currentClassType = new IdentifierType(c.pos, c.name);
        this.currentClassType.link = c;

        super.visitClassDecl(c);
        return null;
    }

    /**
     * Match Types
     *  - check if two types match
     *  - prints an error message (if file pos is positive)
     *      - Does not print an error message if either type is null
     **/
    private boolean matchTypesExact(Type have, Type need, int pos) {
        if(have == null || need == null) { //null
            return false;
        }
        else if(have.equals(need)) { //equal
            return true;
        }
        else { // not compatible
            if(pos > NO_ERROR) { // i.e. not negative
                errorMsg.error(pos,
                        "Error: incompatible types: " + have.toString2() + " should be " + need.toString2());
            }
            return false;
        }
    }

    private boolean matchTypesAssign(Type src, Type target, int pos) {
        if(src == null || target == null) { // null objects
            return false;
        }
        else if(src.equals(theVoidType) || target.equals(theVoidType)) { // void type
            if(pos > NO_ERROR) { // i.e. not negative
                errorMsg.error(pos, "Error: cannot assign the void type.");
            }
            return false;
        }
        else if(src.equals(target)) { // types are equal
            return true;
        }
        else if(src.equals(theNullType) &&
                (target instanceof  IdentifierType || target instanceof ArrayType)) { // src is NullType, and target is an IdentifierType or ArrayType
            return true;
        }
        else if(src instanceof ArrayType &&
                (target instanceof IdentifierType && ((IdentifierType)target).name == "Object")) { // src is ArrayType and target is Object
            return true;
        }
        else if(src instanceof IdentifierType
                && this.isXSuperClassOfY(src, target)) { // src is IdentifierType and target is a super class (direct or indirect)
            return true;
        }
        else { // not compatible
            if(pos > NO_ERROR) { // i.e. not negative
                errorMsg.error(pos,
                        "Error: incompatible types: " + src.toString2() + " should be " + target.toString2());
            }
            return false;
        }
    }

    private boolean matchTypesEqCompare(Type t1, Type t2, int pos) {
        if(t1 == null || t2 == null) { //null
            return false;
        }
        else if(this.matchTypesAssign(t1, t2, this.NO_ERROR) || this.matchTypesAssign(t2, t1, this.NO_ERROR)) {
            return true;
        }
        else {
            if(pos > NO_ERROR) { // i.e. not negative
                errorMsg.error(pos,
                        "Error: incompatible types: cannot compare " + t1.toString2() + " to " + t2.toString2());
            }
            return false;
        }
    }

    /**
     * Checks if identifier type x is a super class of identifier type y
     **/
    private boolean isXSuperClassOfY(Type x, Type y) {
        IdentifierType sub = null;
        IdentifierType sup = null;
        if(x instanceof IdentifierType) {
            sup = (IdentifierType)x;
        }
        if(y instanceof IdentifierType) {
            sub = (IdentifierType)y;
        }
        if(sub == null || sup == null) {
            return false;
        }

        ClassDecl c = sup.link;

        while(c != null) {
            if(c.name.equals(sub.name) ) {
                return true;
            }
            c = c.superLink;
        }
        return false;
    }

    /**
     * Look up methods
     **/
    private InstVarDecl instVarLookup(String name, ClassDecl clas, int pos, String msg) {
        InstVarDecl link = null;
        ClassDecl c = clas;

        do {
            if(c.instVarTable.containsKey(name)) {
                link = c.instVarTable.get(name);
                break;
            }
            c = c.superLink;
        } while(c.superLink != null);

            if(link == null) {
            if(pos > NO_ERROR) {
                errorMsg.error(pos, msg);
            }
        }
        return link;
    }

    private InstVarDecl instVarLookup(String name, Type t, int pos, String msg) {
        if(t == null) {
            return null;
        } else if (!(t instanceof IdentifierType)) {
            if(pos > NO_ERROR) {
                errorMsg.error(pos, msg);
            }
            return null;
        } else if (((IdentifierType) t).link.instVarTable.containsKey(name)) {
            return ((IdentifierType) t).link.instVarTable.get(name);
        }
        else {
            return null;
        }
    }

    private MethodDecl methodLookup(String name, ClassDecl clas, int pos, String msg) {
        if(clas == null) {
            return null;
        }

        MethodDecl link = null;
        ClassDecl c = clas;


         do {
            if(c.methodTable.containsKey(name)) {
                link = c.methodTable.get(name);
                break;
            }
            c = c.superLink;
        } while(c.superLink != null);

        if(link == null) {
            if(pos > NO_ERROR) {
                errorMsg.error(pos, msg);
            }
        }
        return link;
    }

    private MethodDecl methodLookup(String name, Type t, int pos, String msg) {
        if(t == null) {
            return null;
        } else if (!(t instanceof IdentifierType)) {
            if(pos > NO_ERROR) {
                errorMsg.error(pos, msg);
            }
            return null;
        } else if (((IdentifierType) t).link != null) {
            MethodDecl link = null;
            ClassDecl c = ((IdentifierType) t).link;

            do {
                if(c.methodTable.containsKey(name)) {
                    link = c.methodTable.get(name);
                    break;
                }
                c = c.superLink;
            } while(c.superLink != null);

            if(link == null && pos > NO_ERROR) {
                errorMsg.error(pos, msg);
            }

            return link;
        }
        else {
            if(pos > NO_ERROR) {
                errorMsg.error(pos, msg);
            }
            return null;
        }
    }

    /**
     * Only for visitMethodDecl...
     */
    private MethodDecl getSuperMethod(MethodDecl m) {
        MethodDecl superMethod = null;
        ClassDecl superClass = currentClass.superLink;

        while(superClass!= null) {
            if(superClass.methodTable.containsKey(m.name)) {
                superMethod = superClass.methodTable.get(m.name);
                break;
            }
            superClass = superClass.superLink;
        }

        return superMethod;
    }

    private Type returnTypeFor(MethodDecl md) {
        if(md instanceof MethodDeclVoid) {
            return theVoidType;
        }
        else {
            return ((MethodDeclNonVoid)md).rtnType;
        }
    }

    private boolean methodsMatch(MethodDecl m1, MethodDecl m2) {
        if(m1.formals.size() != m2.formals.size()) {
            return false;
        }

        for(int i = 0; i < m1.formals.size(); i++) {
            if(!matchTypesExact(m1.formals.elementAt(i).type, m2.formals.elementAt(i).type, NO_ERROR)) {
                return false;
            }
        }

        return true;
    }
}
	
