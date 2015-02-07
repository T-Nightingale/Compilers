package parse;
import java.util.ArrayList;
import java.util.List;
import errorMsg.*;
import syntaxtree.*;

public class MJGrammar
		implements wrangLR.runtime.MessageObject, wrangLR.runtime.FilePosObject {
	
	public static final boolean FILTER_GRAMMAR = true;
	
	// constructor
	public MJGrammar(ErrorMsg em) {
		errorMsg = em;
		topObject = null;
	}
	
	// error message object
	private ErrorMsg errorMsg;
	
	// object returned by the parse
	private Program topObject;

	// method for printing error message
	public void error(int pos, String msg) {
		errorMsg.error(pos, msg);
	}

	// method for printing warning message
	public void warning(int pos, String msg) {
		errorMsg.warning(pos, msg);
	}

	// method for converting file position to line/character
	// position
	public String filePosString(int pos) {
		return errorMsg.lineAndChar(pos);
	}
	
	// method to register a newline
	public void registerNewline(int pos) {
		errorMsg.newline(pos-1);
	}

	// returns the object produced by the parse
	public Program parseResult() {
		return topObject;
	}
	
	//===============================================================
	// start symbol
	//===============================================================

	//: <start> ::= ws* <program> =>
	public void topLevel(Program obj) {
		topObject = obj;
	}
	
	//================================================================
	//top-level program constructs
	//================================================================

	//: <program> ::= # <class decl>+ =>
	public Program createProgram(int pos, List<ClassDecl> vec) {
		return new Program(pos, new ClassDeclList(vec));
	}

	//: <class decl> ::= `class # ID `{ <decl in class>* `} =>
	public ClassDecl createBasicClassDecl(int pos, String name, List<Decl> vec) {
		return new ClassDecl(pos, name, "Object", new DeclList(vec));
	}
    //: <class decl> ::= `class # ID `extends ID `{ <decl in class>* `} =>
    public ClassDecl createExtendedClassDecl(int pos, String className, String extendId,  List<Decl> vec) {
        return new ClassDecl(pos, className, extendId, new DeclList(vec));
    }

	//: <decl in class> ::= <method decl> => pass
    //: <decl in class> ::= <inst var decl> => pass

	//: <method decl> ::= `public `void # ID <formal list> `{ <stmt>* `} =>
	public Decl createMethodDeclVoid(int pos, String name, VarDeclList params, List<Statement> stmts) {
		return new MethodDeclVoid(pos, name, params, new StatementList(stmts));
	}

    //: <method decl> ::= `public <type> # ID <formal list> `{ <stmt>* <return stmt>`} =>
    public Decl createMethodDeclNonVoid(Type t, int pos, String name, VarDeclList params, List<Statement> stmts, Exp returnStatment) {
        return new MethodDeclNonVoid(pos, t, name, params, new StatementList(stmts), returnStatment);
    }

	//: <type> ::= # `int =>
	public Type intType(int pos) {
		return new IntegerType(pos);
	}
	//: <type> ::= # `boolean =>
	public Type booleanType(int pos) {
		return new BooleanType(pos);
	}
	//: <type> ::= # ID =>
	public Type identifierType(int pos, String name) {
		return new IdentifierType(pos, name);
	}
	//: <type> ::= # <type> <empty bracket pair> =>
	public Type newArrayType(int pos, Type t, Object dummy) {
		return new ArrayType(pos, t);
	}

	//: <empty bracket pair> ::= `[ `] => null
    //: <empty paren pair> ::= `( `) => null

    //: <formal list> ::= <empty paren pair> =>
    public VarDeclList createEmptyVarDeclList(Object n) {
        return new VarDeclList();
    }
    //: <formal list> ::= `( <type> # ID <list element>* `) =>
    public VarDeclList createVarDeclList(Type firstType, int firstPos, String firstName, List<VarDecl> elements) {
        elements.add(new InstVarDecl(firstPos, firstType, firstName));
        return new VarDeclList(elements);
    }

    //: <list element> ::= `, <type> # ID =>
    public VarDecl createListVarDecl(Type t, int pos, String name) {
        return new InstVarDecl(pos, t, name);
    }

	//================================================================
	//statement-level program constructs
	//================================================================

    //: <stmt> ::= <assign> `; => pass
	//: <stmt> ::= # `{ <stmt>* `} =>
	public Statement newBlock(int pos, List<Statement> sl) {
		return new Block(pos, new StatementList(sl));
	}
    //: <stmt> ::= <local var decl> `; => pass
    //: <stmt> ::= # <call exp> `; =>
    public Statement newExpStatement(int pos, Exp call) {
        return new ExpStatement(pos, call);
    }
    //: <stmt> ::= # `while `( <exp> `) <stmt> =>
    public Statement newWhileBlock(int pos, Exp exp, Statement body) {
        return new While(pos, exp, body);
    }
    //: <stmt> ::= # `if `( <exp> `) <stmt> # !`else =>
    public Statement newIfBlock(int ifPos, Exp exp, Statement body, int elsePos) {
        return new If(ifPos, exp, body, new Block(elsePos, new StatementList()));
    }
    //: <stmt> ::= # `if `( <exp> `) <stmt> # `else <stmt> =>
    public Statement newIfElseBlock(int ifPos, Exp exp, Statement ifBody, int elsePos, Statement elseBody) {
        return new If(ifPos, exp, ifBody, elseBody);
    }
    //: <stmt> ::= # `break `; =>
    public Statement newBreak(int pos) {
        return new Break(pos);
    }
    //: <stmt> ::= # `; =>
    public Statement newEmptyStmt(int pos) {
        return new Block(pos, new StatementList());
    }
    //: <stmt> ::= # `for `( <for 1> `; <loop condition> `; <for 3> `) <stmt> =>
    public Statement newForLoop(int pos, Statement for1, Exp for2, Statement for3, Statement body) {
        // The contents of the while loop
        List<Statement> contents = new ArrayList<Statement>();
        contents.add(0, body);
        contents.add(1, for3);

        // Create the while loop, and through the contents in it
        Statement whileLoop = newWhileBlock(pos, for2, newBlock(pos, contents));

        // Put everything in a list of statements
        List<Statement> statements = new ArrayList<Statement>();
        statements.add(for1);
        statements.add(whileLoop);

        // turn the list of statements into a block
        return newBlock(pos, statements);
    }
    //: <stmt> ::= # `do # <stmt> `while `( <exp> `) `; =>
    public Statement newDoWhile(int whilePos, int bodyPos ,Statement body, Exp conditional) {

        // Create the if statement, if ( !( <exp> ) ) break; eles {}
        Not ifConditional = new Not(bodyPos, conditional);
        If ifStmt = new If(bodyPos, ifConditional, new Break(bodyPos), newEmptyStmt(bodyPos));

        // Put everything in a list of statements
        List<Statement> newBody = new ArrayList<Statement>();
        newBody.add(0, body);
        newBody.add(1, ifStmt);

        // Slap it all together in one happy while loop in the form:
        //    while (true) {
        //      <stmt>
        //      if ( !( <exp> ) ) break;
        //    }
        return new While(whilePos, new True(whilePos), new Block(bodyPos, new StatementList(newBody)));
    }
    //: <stmt> ::= # `switch `( <exp> `) `{ <case>* `} =>
    public Statement newSwitch(int switchPos, Exp condition, List<Statement> cases) {
        return new Switch(switchPos, condition, new StatementList(cases));
    }

    //: <case> ::= `case # <exp> `: =>
    public Statement newCase(int pos, Exp e) {
        return new Case(pos, e);
    }
    //: <case> ::= <stmt> => pass
    //: <case> ::= # `default `: =>
    public Statement newDefaultCase(int pos) {
        return new Case(pos, new Super(pos));
    }

    //: <for 1> ::= <local var decl> => pass
    //: <for 1> ::= <assign> => pass
    //: <for 1> ::= # <call exp> => Statement newExpStatement(int, Exp)
    //: <for 1> ::= # => Statement newEmptyStmt(int)

    //: <loop condition> ::= <exp> => pass
    //: <loop condition> ::= # => Exp newTrueExp(int)

    //: <for 3> ::= # <call exp> => Statement newExpStatement(int, Exp)
    //: <for 3> ::= <assign> => pass
    //: <for 3> ::= # => Statement newEmptyStmt(int)

    //: <return stmt> ::= `return <exp> `; => pass

	//: <assign> ::= <exp8> # `= <exp> =>
	public Statement assign(Exp lhs, int pos, Exp rhs) {
		return new Assign(pos, lhs, rhs);
	}
    //: <assign> ::= # `++ ID =>
    public Statement assignPlusPlus(int pos, String var) {
        // Convert var to an expression
        Exp lhs = new IdentifierExp(pos, var);

        // Add one to the var
        Exp rhs = new Plus(pos, lhs, new IntegerLiteral(pos, 1));

        // return the new assignment
        return new Assign(pos, lhs, rhs);
    }
    //: <assign> ::= # ID `++ => Statement assignPlusPlus(int, String)
    //: <assign> ::= # `-- ID =>
    public Statement assignMinusMinus(int pos, String var) {
        // Convert var to an expression
        Exp lhs = new IdentifierExp(pos, var);

        // Subtract one to the var
        Exp rhs = new Minus(pos, lhs, new IntegerLiteral(pos, 1));

        // return the new assignment
        return new Assign(pos, lhs, rhs);
    }
    //: <assign> ::= # ID `-- => Statement assignMinusMinus(int, String)


	//: <local var decl> ::= <type> # ID `= <exp> =>
	public Statement localVarDecl(Type t, int pos, String name, Exp init) {
		return new LocalVarDecl(pos, t, name, init);
	}

    //: <inst var decl> ::= <type> # ID `; =>
    public Decl instVarDecl(Type t, int pos, String name) {
        return new InstVarDecl(pos, t, name);
    }

	//================================================================
	//expressions
	//================================================================

	//: <exp> ::= <exp1> => pass

    //: <exp1> ::= <exp1> # `|| <exp2> =>
    public Exp  newOr(Exp e1, int pos, Exp e2) {
        return new Or(pos, e1, e2);
    }
    //: <exp1> ::= <exp2> => pass

    //: <exp2> ::= <exp2> # `&& <exp3> =>
    public Exp newAnd(Exp e1, int pos, Exp e2) {
        return new And(pos, e1, e2);
    }
    //: <exp2> ::= <exp3> => pass

    //: <exp3> ::= <exp3> # `== <exp4> =>
    public Exp newEqualTo(Exp e1, int pos, Exp e2) {
        return new Equals(pos, e1, e2);
    }
    //: <exp3> ::= <exp3> # `!= <exp4> =>
    public Exp newNotEqualTo(Exp e1, int pos, Exp e2) {
        // Convert to !(e1==e2)
        return newUnaryNot(pos, new Equals(pos, e1, e2));
    }
    //: <exp3> ::= <exp4> => pass

    //: <exp4> ::= <exp4> # `< <exp5> =>
    public Exp newLessThan(Exp e1, int pos, Exp e2) {
        return new LessThan(pos, e1, e2);
    }
    //: <exp4> ::= <exp4> # `> <exp5> =>
    public Exp newGreaterThan(Exp e1, int pos, Exp e2) {
        return new GreaterThan(pos, e1, e2);
    }
    //: <exp4> ::= <exp4> # `instanceof # ID =>
    public Exp newInstanceOf(Exp e, int operatorPos, int typePos, String typeName) {
        return new InstanceOf(operatorPos, e, new IdentifierType(typePos, typeName));
    }
    //: <exp4> ::= <exp4> # `<= <exp5> =>
    public Exp newLessThanEqualTo(Exp e1, int pos, Exp e2) {
        // convert to !(e1 > e2)
        return new Not(pos, new GreaterThan(pos, e1, e2));
    }
    //: <exp4> ::= <exp4> # `>= <exp5> =>
    public Exp newGreaterThanEqualTo(Exp e1, int pos, Exp e2) {
        // convert to !(e1 < e2)
        return new Not(pos, new LessThan(pos, e1, e2));
    }
    //: <exp4> ::= <exp5> => pass

	//: <exp5> ::= <exp5> # `+ <exp6> =>
	public Exp newPlus(Exp e1, int pos, Exp e2) {
		return new Plus(pos, e1, e2);
	}
    //: <exp5> ::= <exp5> # `- <exp6> =>
    public Exp newMinus(Exp e1, int pos, Exp e2) {
        return new Minus(pos, e1, e2);
    }
	//: <exp5> ::= <exp6> => pass

	//: <exp6> ::= <exp6> # `* <exp7> =>
	public Exp newTimes(Exp e1, int pos, Exp e2) {
		return new Times(pos, e1, e2);
	}
    //: <exp6> ::= <exp6> # `/ <exp7> =>
    public Exp newDivide(Exp e1, int pos, Exp e2) {
        return new Divide(pos, e1, e2);
    }
    //: <exp6> ::= <exp6> # `% <exp7> =>
    public Exp newRemainder(Exp e1, int pos, Exp e2) {
        return new Remainder(pos, e1, e2);
    }
    //: <exp6> ::= <exp7> => pass

    //: <exp7> ::= <cast exp> => pass
	//: <exp7> ::= <unary exp> => pass

	//: <exp8> ::= # INTLIT =>
	public Exp newIntegerLiteral(int pos, int n) {
		return new IntegerLiteral(pos, n);
	}
    //: <exp8> ::= # STRINGLIT =>
    public Exp newStringLiteral(int pos, String s) {
        return new StringLiteral(pos, s);
    }
    //: <exp8> ::= # CHARLIT =>
    public Exp newCharLiteral(int pos, int c) {
        return new IntegerLiteral(pos, c);
    }
    //: <exp8> ::= # `this =>
    public Exp newThis(int pos){
        return new This(pos);
    }
    //: <exp8> ::= # `false =>
    public Exp newFalseExp(int pos) {
        return new False(pos);
    }
    //: <exp8> ::= # `true =>
    public Exp newTrueExp(int pos) {
        return new True(pos);
    }
    //: <exp8> ::= # `null =>
    public Exp newNullExp(int pos) {
        return new Null(pos);
    }
    //: <exp8> ::= # ID =>
    public Exp newIdentifierExp(int pos, String name) {
        return new IdentifierExp(pos, name);
    }
    //: <exp8> ::= <exp8> !<empty bracket pair> # `[ <exp> `] =>
    public Exp newArrayLookup(Exp e1, int pos, Exp e2) {
        return new ArrayLookup(pos, e1, e2);
    }
    //: <exp8> ::= `new <type> !<empty bracket pair> # `[ <exp> `] <empty bracket pair>** =>
    public Exp newArray(Type t, int pos, Exp e, List<Object> o) {
        ArrayType a = new ArrayType(pos, t);
        for(int i = 0; i < o.size(); i++) {
            a = new ArrayType(pos, a);
        }
        return new NewArray(pos, a, e);
    }
    //: <exp8> ::= # `new # ID `( `) =>
    public Exp newObject(int objPos, int typePos, String name) {
        return new NewObject(objPos, new IdentifierType(typePos, name));
    }
    //: <exp8> ::= !<cast exp> `( <exp> `) => pass
    //: <exp8> ::= <call exp> => pass
    //: <exp8> ::= <exp8> `. # ID  =>
    public Exp newInstVarAccess(Exp exp, int pos, String varName) {
        return new InstVarAccess(pos, exp, varName);
    }

    //: <call exp> ::= # <exp8> `. ID <parameters> =>
    public Exp newMethodCall(int pos, Exp calledObj, String methodName, ExpList parameters) {
        return new Call(pos, calledObj, methodName, parameters);
    }
    //: <call exp> ::= # `super `. #  ID <parameters> =>
    public Exp newSuperMethodCall(int superPos, int idPos, String methodName, ExpList parameters) {
        return new Call(idPos, new Super(superPos), methodName, parameters);
    }
    //: <call exp> ::= #  ID <parameters> =>
    public Exp newThisMethodCall(int pos, String methodName, ExpList parameters) {
        return new Call(pos, new This(pos), methodName, parameters);
    }
    //: <parameters> ::= `( <exp list> `) => pass
    //: <exp list> ::= <exp> <next exp>* =>
    public ExpList newExpList(Exp firstExp, List<Exp> expressions) {
        expressions.add(firstExp);
        return new ExpList(expressions);
    }
    //: <exp list> ::=  =>
    public ExpList newEmptyExpList() {
        return new ExpList();
    }
    //: <next exp> ::= `, <exp> => pass


    //: <cast exp> ::= # `( <type> `) <cast exp> =>
    public Exp newCast(int pos, Type t, Exp e) {
        return new Cast(pos, t, e);
    }
    //: <cast exp> ::= # `( <type> `) <exp8> => Exp newCast(int, Type, Exp)

    //: <unary exp> ::= # `+ <unary exp> =>
    public Exp newUnaryPlus(int pos, Exp e) {
        return new Plus(pos, new IntegerLiteral(pos, 0), e);
    }
    //: <unary exp> ::= # `- <unary exp> =>
    public Exp newUnaryMinus(int pos, Exp e) {
        return new Minus(pos, new IntegerLiteral(pos, 0), e);
    }
    //: <unary exp> ::= # `! <unary exp> =>
    public Exp newUnaryNot(int pos, Exp e) {
        return new Not(pos, e);
    }
    //: <unary exp> ::= <exp8> => pass



	//================================================================
	// Lexical grammar for filtered language begins here: DO NOT MODIFY
	// ANYTHING BELOW THIS, UNLESS YOU REPLACE IT WITH YOUR ENTIRE
	// LEXICAL GRAMMAR, and set the constant FILTER_GRAMMAR (defined
	// near the top of this file) to false.
	//================================================================

	//: letter ::= {"a".."z" "A".."Z"} => pass
	//: letter128 ::= {225..250 193..218} =>
	public char sub128(char orig) {
		return (char)(orig-128);
	}
	//: digit ::= {"0".."9"} => pass
	//: digit128 ::= {176..185} => char sub128(char)
	//: any ::= {0..127} => pass
	//: any128 ::= {128..255} => char sub128(char)
	//: ws ::= " "
	//: ws ::= {10} registerNewline
	//: registerNewline ::= # => void registerNewline(int)
	//: `boolean ::= "#bo" ws*
	//: `class ::= "#cl" ws*
	//: `extends ::= "#ex" ws*
	//: `void ::= "#vo" ws*
	//: `int ::= "#it" ws*
	//: `while ::= "#wh" ws*
	//: `if ::= '#+' ws*
	//: `else ::= "#el" ws*
	//: `for ::= "#fo" ws*
	//: `break ::= "#br" ws*
	//: `this ::= "#th" ws*
	//: `false ::= '#fa' ws*
	//: `true ::= "#tr" ws*
	//: `super ::= "#su" ws*
	//: `null ::= "#nu" ws*
	//: `return ::= "#re" ws*
	//: `instanceof ::= "#in" ws*
	//: `new ::= "#ne" ws*
	//: `abstract ::= "#ab" ws*
	//: `assert ::= "#as" ws*
	//: `byte ::= "#by" ws*
	//: `case ::= "#ce" ws*
	//: `catch ::= "#ca" ws*
	//: `char ::= "#ch" ws*
	//: `const ::= "#ct" ws*
	//: `continue ::= "#co" ws*
	//: `default ::= "#de" ws*
	//: `do ::= "#-" ws*
	//: `double ::= "#do" ws*
	//: `enum ::= "#en" ws*
	//: `final ::= "#fi" ws*
	//: `finally ::= "#fy" ws*
	//: `float ::= "#fl" ws*
	//: `goto ::= "#go" ws*
	//: `implements ::= "#is" ws*
	//: `import ::= "#im" ws*
	//: `interface ::= "#ie" ws*
	//: `long ::= "#lo" ws*
	//: `native ::= "#na" ws*
	//: `package ::= "#pa" ws*
	//: `private ::= "#pr" ws*
	//: `protected ::= "#pd" ws*
	//: `public ::= "#pu" ws*
	//: `short ::= "#sh" ws*
	//: `static ::= '#sc' ws*
	//: `strictfp ::= "#st" ws*
	//: `switch ::= "#sw" ws*
	//: `synchronized ::= "#sy" ws*
	//: `throw ::= "#tw" ws*
	//: `throws ::= "#ts" ws*
	//: `transient ::= "#tt" ws*
	//: `try ::= "#ty" ws*
	//: `volatile ::= "#ve" ws*
	
	//: `! ::=  "!" ws* => void
	//: `!= ::=  "@!" ws* => void
	//: `% ::= "%" ws* => void
	//: `&& ::= "@&" ws* => void
	//: `* ::= "*" ws* => void
	//: `( ::= "(" ws* => void
	//: `) ::= ")" ws* => void
	//: `{ ::= "{" ws* => void
	//: `} ::= "}" ws* => void
	//: `- ::= "-" ws* => void
	//: `+ ::= "+" ws* => void
	//: `= ::= "=" ws* => void
	//: `== ::= "@=" ws* => void
	//: `[ ::= "[" ws* => void
	//: `] ::= "]" ws* => void
	//: `|| ::= "@|" ws* => void
	//: `< ::= "<" ws* => void
	//: `<= ::= "@<" ws* => void
	//: `, ::= "," ws* => void
	//: `> ::= ">"  !'=' ws* => void
	//: `>= ::= "@>" ws* => void
	//: `: ::= ":" ws* => void
	//: `. ::= "." ws* => void
	//: `; ::= ";" ws* => void
	//: `++ ::= "@+" ws* => void
	//: `-- ::= "@-" ws* => void
	//: `/ ::= "/" ws* => void

	
	//: ID ::= letter128 ws* => text
	//: ID ::= letter idChar* idChar128 ws* => text
	
	//: INTLIT ::= {"1".."9"} digit* digit128 ws* => 
	public int convertToInt(char c, List<Character> mid, char last) {
		return Integer.parseInt(""+c+mid+last);
	}
	//: INTLIT ::= digit128 ws* => 
	public int convertToInt(char c) {
		return Integer.parseInt(""+c);
	}
	//: INTLIT ::= "0" hexDigit* hexDigit128 ws* => 
	public int convert16ToInt(char c, List<Character> mid, char last) {
		return Integer.parseInt(""+c+mid+last, 16);
	}
	//: STRINGLIT ::= '@"' ws* =>
	public String emptyString(char x, char xx) {
		return "";
	}
	//: STRINGLIT ::= '"' any* any128 ws* =>
	public String string(char x, List<Character> mid, char last) {
		return ""+mid+last;
	}
	//: CHARLIT ::= "'" any ws* =>
	public int charVal(char x, char val) {
		return val;
	}
	
	//: idChar ::= letter => pass
	//: idChar ::= digit => pass
	//: idChar ::= "_" => pass
	//: idChar128 ::= letter128 => pass
	//: idChar128 ::= digit128 => pass
	//: idChar128 ::= {223} => 
	public char underscore(char x) {
		return '_';
	}
	//: hexDigit ::= {"0".."9" "a".."z" "A".."Z"} => pass
	//: hexDigit128 ::= {176..185 225..230 193..198} => char sub128(char)

}

