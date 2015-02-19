package visitor;

import syntaxtree.*;
import java.util.*;
import errorMsg.*;


/**
 * the purpose of this class is to
 * - link each ClassDecl to the ClassDecl for its superclass (via
 *   its 'superLink'
 * - link each ClassDecl to each of its subclasses (via the
 *   'subclasses' instance variable
 * - ensure that there are no cycles in the inheritance hierarchy
 * - ensure that no class has 'String' or 'RunMain' as its superclass
 */
public class Sem2Visitor extends ASTvisitor {

    public static final boolean DEBUG = false;

    Hashtable<String,ClassDecl> globalSymTab;
    ErrorMsg errorMsg;


    public Sem2Visitor(Hashtable<String,ClassDecl> globalSymTb, ErrorMsg e) {
        errorMsg = e;
        initInstanceVars(globalSymTb);
    }

    private void initInstanceVars(Hashtable<String,ClassDecl> globalTab) {
        globalSymTab = globalTab;
    }

    /**
     * Visit all of the subnotes and
     * - make sure that String or RunMain has no declared subclasses
     * - make sure that no class is part of a cycle
     *
     * @param n the program (Program)
     * @return null
     */
    public Object visitProgram(Program n) {
        // Visit all of our subnodes.
        super.visitProgram(n);

        // Look through all of the classes
        for(ClassDecl c : n.classDecls) {
            // Make sure no class is a child of String or RunMain
            if(c.superName.equals("String")) {
                errorMsg.error(c.pos, "Error: cannot extend String: " + c.name);
                return null;
            }
            else if(c.superName.equals("RunMain")) {
                errorMsg.error(c.pos, "Error: cannot extend RunMain: " + c.name);
                return null;
            }

            // Make sure there is no cycle of classes
            if(DEBUG) System.out.println("isClassCycle(" + c.name  + ")");
            if(isClassCycle(c, globalSymTab.size())) {
                errorMsg.error(c.pos, "Error: cyclical class definition: " + c.name);
                return null;
            }
        }

        return null;
    }

    public Object visitClassDecl(ClassDecl n) {
        if(n.superName != null) {
            if (globalSymTab.containsKey(n.superName)) {
                n.superLink = globalSymTab.get(n.superName);
                n.superLink.subclasses.addElement(n);
            }
            else {
                errorMsg.error(n.pos, "Error: undefined super class name: " + n.superName);
                return null;

            }
        } else {
            errorMsg.error(n.pos, "Error: undefined super class name: null");
            return null;
        }

        return null;
    }

    /**
     * Checks if there is a cyclical class definition for a given class.
     *
     * @param c the class the check
     * @param numClasses the number of classes in the global symbol table (int)
     * @return true if there is a cycle, false otherwise
     */
    private boolean isClassCycle(ClassDecl c, int numClasses) {
        // We iterate more times than the number of classes
        if(numClasses < 0) {
            if(DEBUG) System.out.println("A cycle.");
            return true;
        }
        // Reached the end of the list, so we are finished
        if (c == null) {
            if(DEBUG) System.out.println("Reached the end of the super class.");
            return false;
        }
        // Class extends itself
        if(c.superName.equals(c.name)) {
            if(DEBUG) System.out.println("Extends itself.");
            return true;
        }

        if(DEBUG) System.out.println("Continue on class: " + c.name + "  Super Name: " + c.superName + "  Num classes left: " + numClasses);
        // recurse
        return isClassCycle(c.superLink, numClasses - 1);
    }


}

	
