package visitor;

import syntaxtree.*;
import java.util.*;
import errorMsg.*;
/**
 * @author Taylor Nightingale
 * The purpose of this class is to:
 * - link each variable reference to its corresponding VarDecl
 *    (via its 'link' instance variable)
 *    - undefined variable names are reported
 * - link each type reference to its corresponding ClassDecl
 *    - undefined type names are reported
 * - link each Break expression to its enclosing While
 *    statement
 *    - a break that is not inside any while loop is reported
 * - report conflicting local variable names (including formal
 *    parameter names)
 * - ensure that no instance variable has the name 'length'
 *
 * COMPLETED EXTENSIONS:
 * - Attempt some sort of spelling correction when an undefined name
 *   is encountered. For example, you might currently-defined names
 *   that are "one character" different, or that only differ in case.
 *   [up to +2/3 grade]
 *
 * - Give a warning message for each name (local variable, parameter
 *   or class) that is defined but never used. [+1/2 grade]
 *
 * - Give a warning message whenever the definition of a local variable
 *   "hides" an instance variable of the same name. [+1/4 grade]
 *
 * - Detect (and report an error) if a local variable is used to initialize
 *   itself; as in int x = x+1; [+1/4 grade]
 *
 **/
public class Sem3Visitor extends ASTvisitor {

    Hashtable<String, Integer> unused;           //  a list of unused names (local var, parameter, or class)
    Hashtable<String, ClassDecl> globalSymTab;   //  maps each class name to its corresponding ClassDecl node
    ClassDecl currentClass;                      //  the class that we are currently traversing
    Hashtable<String, VarDecl> localSymTab;      //  keeps track of the local variables
    ErrorMsg errorMsg;                           //  to print meaningful error message
    Stack<While> loopStack;                      //  keeps track of all the nested While objects that we are inside
    VarDecl currentLocalDecl;                    //  the local variable that we're presently processing

	public Sem3Visitor(Hashtable globalSymTb, ErrorMsg e) {
		errorMsg = e;
		initInstanceVars(globalSymTb);
	}

	private void initInstanceVars(Hashtable<String,ClassDecl> globalTab) {
		loopStack = new Stack<While>();
		globalSymTab = globalTab;
		localSymTab = new Hashtable<String,VarDecl>();
        unused = new Hashtable<String, Integer>();
        // Add classes to unused
        for(String key : globalSymTab.keySet()) {
            unused.put(key, globalSymTab.get(key).pos);
        }
        // Add local variables to unused
        for(String key : localSymTab.keySet()) {
            unused.put(key, localSymTab.get(key).pos);
        }
        // Remove Object, String, RunMain, and Lib
        unused.remove("Object");
        unused.remove("String");
        unused.remove("RunMain");
        unused.remove("Lib");

		currentClass = null;
		currentLocalDecl = null;
	}

    /**
     * Sets the visited class to the current class, and traverses the subnodes.
     *
     * @param n the visited class (ClassDecl)
     * @return the results of recursion
     */
    @Override
    public Object visitClassDecl(ClassDecl n) {
        this.currentClass = n;

        // It is declared but unused
        if(!globalSymTab.containsKey(currentClass.name)) {
            unused.put(currentClass.name, currentClass.pos);
        }

        return super.visitClassDecl(n);
    }

    /**
     * Resets the local symbol table, and traverses the subnodes.
     *
     * @param n the visited method (MethodDecl)
     * @return the results of recursion
     */
    @Override
    public Object visitMethodDecl(MethodDecl n) {
        this.localSymTab = new Hashtable<String, VarDecl>();
        return super.visitMethodDecl(n);
    }

    /**
     * Inserts the visited formal variable declaration to current one. Traverses the subnodes,
     * and adds the local variable to the symbol table.
     *
     * @param n the variable declaration we visited
     * @return null
     */
    @Override
    public Object visitFormalDecl(FormalDecl n) {
        // add the local declaration
        this.currentLocalDecl = n;

        // It is declared but unused
        if(!unused.containsKey(n.name)) {
            unused.put(n.name, n.pos);
        }

        // Traverse the subtree
        super.visitFormalDecl(n);

        // Add to the local symbol table
        if(!this.localSymTab.containsKey(n.name)) {
            this.localSymTab.put(n.name, n);

            // Hidden instance variable
            for(String key : globalSymTab.keySet()) {
                if(globalSymTab.get(key).instVarTable.containsKey(n.name)) {
                    errorMsg.warning(n.pos, "Local variable, " + n.name + " hides an instance variable of the same name.");
                }
            }
        }
        else {
            errorMsg.error(n.pos, "Error: duplicate variable name: " + n.name);
        }

        // Clear the local declaration
        this.currentLocalDecl = null;

        return null;
    }

    /**
     * Inserts the visited local variable declaration to current one. Traverses the subnodes,
     * and adds the local variable to the symbol table.
     *
     * @param n the variable declaration we visited
     * @return null
     */
    @Override
    public Object visitLocalVarDecl(LocalVarDecl n) {
        // add the local declaration
        this.currentLocalDecl = n;

        // It is declared but unused
        if(!localSymTab.containsKey(n.name)) {
            unused.put(n.name, n.pos);
        }

        // Traverse the subtree
        super.visitLocalVarDecl(n);

        // Add to the local symbol table
        if(!this.localSymTab.containsKey(n.name)) {
            this.localSymTab.put(n.name, n);

            // Hidden instance variable
            for(String key : globalSymTab.keySet()) {
                if(globalSymTab.get(key).instVarTable.containsKey(n.name)) {
                    errorMsg.warning(n.pos, "Local variable, " + n.name + " hides an instance variable of the same name.");
                }
            }
        }
        else {
            errorMsg.error(n.pos, "Error: duplicate variable name: " + n.name);
        }

        // Clear the local declaration
        this.currentLocalDecl = null;

        return null;
    }

    /**
     * Make sure no variable is named length, and add it to the global symbol table
     *
     * @param n the visited instance variable to check
     * @return the results of recursion
     */
    @Override
    public Object visitInstVarDecl(InstVarDecl n) {
        if(n.name.equals("length")) {
            errorMsg.error(n.pos, "Error: variable cannot be named \"length\".");
        }

        return super.visitInstVarDecl(n);
    }

    /**
     * Handles removing all local variables once the scope has left.
     *
     * @param n the visited block to check
     * @return  null
     */
    @Override
    public Object visitBlock(Block n) {
        // traverse the subnodes
        super.visitBlock(n);

        // remove corresponding variables from the symbol table
        for(Statement s : n.stmts) {
            if(s instanceof LocalVarDecl) {
                localSymTab.remove(((LocalVarDecl)s).name);
            }
        }

        return null;
    }

    /**
     * Link the visited identifier name in an expression.
     *
     * @param n the identifier we are visiting
     * @return null
     */
    @Override
    public Object visitIdentifierExp(IdentifierExp n) {
        // a local decl is getting initialized
        if(currentLocalDecl != null) {
            // identifier's name is the same as currentLocalDecl
            if (n.name.equals(currentLocalDecl.name)) {
                errorMsg.error(n.pos, "Error: identifier " + currentLocalDecl.name + " is used to initialize itself.");
            }
        }

        VarDecl link = null;

        // Bind to local symbol first
        if(localSymTab.containsKey(n.name)) {
            link = localSymTab.get(n.name);
        }
        // Bind to class's/superclass' instance variable table
        else {
            ClassDecl c = currentClass;

            while(c.superLink != null) {
                if(c.instVarTable.containsKey(n.name)) {
                    link = c.instVarTable.get(n.name);
                    break;
                }
                c = c.superLink;
            }
        }

        // Set the link
        if(link != null) {
            n.link = link;
            // It is used!!!
            unused.remove(n.name);
        }
        // Identifier name is undefined
        else {
            handleUndefinedIdentifier(n.pos, n.name);
        }

        return null;
    }

    /**
     * Link the visited identifier type.
     *
     * @param n the visited identifier
     * @return null
     */
    @Override
    public Object visitIdentifierType(IdentifierType n) {
        if(globalSymTab.containsKey(n.name)) {
            n.link = globalSymTab.get(n.name);
            unused.remove(n.name);
        }
        // Identifier name is undefined
        else {
            handleUndefinedIdentifier(n.pos, n.name);
        }

        return null;
    }

    /**
     * Handle loops and traverse
     *
     * @param n the visited loop
     * @return null
     */
    @Override
    public Object visitWhile(While n) {
        loopStack.push(n);
        super.visitWhile(n);
        loopStack.pop();

        return null;
    }

    /**
     * Make sure break statements appear inside of loops
     *
     * @param n the visited break
     * @return null
     */
    @Override
    public Object visitBreak(Break n) {
        // loop stack is empty
        if(loopStack.size() <= 0) {
            errorMsg.error(n.pos,"Error: break statement outside of loop");
        }

        return null;
    }

    public Object visitProgram(Program n) {
        super.visitProgram(n);
        // Remove any extended classes
        for(String key : globalSymTab.keySet()) {
            // The super classes are used
            String superName = globalSymTab.get(key).superName;
            if(unused.containsKey(superName)) {
                unused.remove(superName);
            }
        }
        for(String key : unused.keySet()) {
            // not including main
            errorMsg.warning(unused.get(key), "Unused name: " + key);
        }

        return null;
    }

    /**
     * Creates an appropriate error message for an undefined identifier name
     *
     * @param idPos the position of the undefined identifier
     * @param idName the name of the undefined identifier
     */
    private void handleUndefinedIdentifier(int idPos, String idName) {
        if(idName.equals("Main")) {
            errorMsg.error(idPos, "Error: undefined name: " + idName);
            return;
        }
        // create a list of all of the identifiers.
        ArrayList<String> identifiers = new ArrayList<String>();
        identifiers.addAll(globalSymTab.keySet());
        identifiers.addAll(localSymTab.keySet());

        // find a similar identifier
        String similar = StringCompare.whichStringIsSimilar(idName, identifiers);

        // Give an error message to the user
        if(similar != null) {
            errorMsg.error(idPos, "Error: undefined name: " + idName + ". Did you mean: " + similar);
        }
        else {
            errorMsg.error(idPos, "Error: undefined name: " + idName);
        }
    }
}

	
