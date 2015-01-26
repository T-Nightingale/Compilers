package parse;
import java.util.List;

import errorMsg.*;

public class TokenGrammar implements wrangLR.runtime.MessageObject {

    public TokenGrammar(ErrorMsg em) {
        errorMsg = em;
    }
    private ErrorMsg errorMsg;

    public void error(int pos, String msg) {
        errorMsg.error(pos, msg);
    }

    public void warning(int pos, String msg) {
        errorMsg.warning(pos, msg);
    }

    public void reportTok(int pos, String s) {
        System.out.println(errorMsg.lineAndChar(pos)+": "+s);
    }

    /**
     * Converts escape characters found in string, and character literals to the correct ascii value.
     * @param escape - the character, "/"
     * @param c - the character found after the escape.
     * @return - the ascii value associated with the escaped character,
     *           or 0 if it does not match an escape character
     */
    public char convertEscapeChar(char escape, char c) {
        switch(c) {
            case 34: case 39: case 92: // " ' \
                return c;
            case 102: // formfeed
                return 12;
            case 110: // new line
                return 10;
            case 114: // carriage return
                break;
            case 116: // tab
                return 9;
        }
        return 0; // some mistake, should not reach this.
    }

    //: start ::= ws* token*


    //: token ::= # `boolean =>
    public void sawBoolean(int pos) {
        reportTok(pos, "`boolean");
    }
    //: token ::= # `class =>
    public void sawClass(int pos) {
        reportTok(pos, "`class");
    }
    //: token ::= # `extends =>
    public void sawExtends(int pos) {
        reportTok(pos, "`extends");
    }
    //: token ::= # `void =>
    public void sawVoid(int pos) {
        reportTok(pos, "`void");
    }
    //: token ::= # `int =>
    public void sawInt(int pos) {
        reportTok(pos, "`int");
    }
    //: token ::= # `while =>
    public void sawWhile(int pos) {
        reportTok(pos, "`while");
    }
    //: token ::= # `if =>
    public void sawIf(int pos) {
        reportTok(pos, "`if");
    }
    //: token ::= # `else =>
    public void sawElse(int pos) {
        reportTok(pos, "`else");
    }
    //: token ::= # `for =>
    public void sawFor(int pos) {
        reportTok(pos, "`for");
    }
    //: token ::= # `break =>
    public void sawBreak(int pos) {
        reportTok(pos, "`break");
    }
    //: token ::= # `this =>
    public void sawThis(int pos) {
        reportTok(pos, "`this");
    }
    //: token ::= # `false =>
    public void sawFalse(int pos) {
        reportTok(pos, "`false");
    }
    //: token ::= # `true =>
    public void sawTrue(int pos) {
        reportTok(pos, "`true");
    }
    //: token ::= # `super =>
    public void sawSuper(int pos) {
        reportTok(pos, "`super");
    }
    //: token ::= # `null =>
    public void sawNull(int pos) {
        reportTok(pos, "`null");
    }
    //: token ::= # `return =>
    public void sawReturn(int pos) {
        reportTok(pos, "`return");
    }
    //: token ::= # `instanceof =>
    public void sawInstanceof(int pos) {
        reportTok(pos, "`instanceof");
    }
    //: token ::= # `new =>
    public void sawNew(int pos) {
        reportTok(pos, "`new");
    }
    //: token ::= # `abstract =>
    public void sawAbstract(int pos) {
        reportTok(pos, "`abstract");
    }
    //: token ::= # `assert =>
    public void sawAssert(int pos) {
        reportTok(pos, "`assert");
    }
    //: token ::= # `byte =>
    public void sawByte(int pos) {
        reportTok(pos, "`byte");
    }
    //: token ::= # `case =>
    public void sawCase(int pos) {
        reportTok(pos, "`case");
    }
    //: token ::= # `catch =>
    public void sawCatch(int pos) {
        reportTok(pos, "`catch");
    }
    //: token ::= # `char =>
    public void sawChar(int pos) {
        reportTok(pos, "`char");
    }
    //: token ::= # `const =>
    public void sawConst(int pos) {
        reportTok(pos, "`const");
    }
    //: token ::= # `continue =>
    public void sawContinue(int pos) {
        reportTok(pos, "`continue");
    }
    //: token ::= # `default =>
    public void sawDefault(int pos) {
        reportTok(pos, "`default");
    }
    //: token ::= # `do =>
    public void sawDo(int pos) {
        reportTok(pos, "`do");
    }
    //: token ::= # `double =>
    public void sawDouble(int pos) {
        reportTok(pos, "`double");
    }
    //: token ::= # `enum =>
    public void sawEnum(int pos) {
        reportTok(pos, "`enum");
    }
    //: token ::= # `final =>
    public void sawFinal(int pos) {
        reportTok(pos, "`final");
    }
    //: token ::= # `finally =>
    public void sawFinally(int pos) {
        reportTok(pos, "`finally");
    }
    //: token ::= # `float =>
    public void sawFloat(int pos) {
        reportTok(pos, "`float");
    }
    //: token ::= # `goto =>
    public void sawGoto(int pos) {
        reportTok(pos, "`goto");
    }
    //: token ::= # `implements =>
    public void sawImplements(int pos) {
        reportTok(pos, "`implements");
    }
    //: token ::= # `import =>
    public void sawImport(int pos) {
        reportTok(pos, "`import");
    }
    //: token ::= # `interface =>
    public void sawInterface(int pos) {
        reportTok(pos, "`interface");
    }
    //: token ::= # `long =>
    public void sawLong(int pos) {
        reportTok(pos, "`long");
    }
    //: token ::= # `native =>
    public void sawNative(int pos) {
        reportTok(pos, "`native");
    }
    //: token ::= # `package =>
    public void sawPackage(int pos) {
        reportTok(pos, "`package");
    }
    //: token ::= # `private =>
    public void sawPrivate(int pos) {
        reportTok(pos, "`private");
    }
    //: token ::= # `protected =>
    public void sawProtected(int pos) {
        reportTok(pos, "`protected");
    }
    //: token ::= # `public =>
    public void sawPublic(int pos) {
        reportTok(pos, "`public");
    }
    //: token ::= # `short =>
    public void sawShort(int pos) {
        reportTok(pos, "`short");
    }
    //: token ::= # `static =>
    public void sawStatic(int pos) {
        reportTok(pos, "`static");
    }
    //: token ::= # `strictfp =>
    public void sawStrictfp(int pos) {
        reportTok(pos, "`strictfp");
    }
    //: token ::= # `switch =>
    public void sawSwitch(int pos) {
        reportTok(pos, "`switch");
    }
    //: token ::= # `synchronized =>
    public void sawSynchronized(int pos) {
        reportTok(pos, "`synchronized");
    }
    //: token ::= # `throw =>
    public void sawThrow(int pos) {
        reportTok(pos, "`throw");
    }
    //: token ::= # `throws =>
    public void sawThrows(int pos) {
        reportTok(pos, "`throws");
    }
    //: token ::= # `transient =>
    public void sawTransient(int pos) {
        reportTok(pos, "`transient");
    }
    //: token ::= # `try =>
    public void sawTry(int pos) {
        reportTok(pos, "`try");
    }
    //: token ::= # `volatile =>
    public void sawVolatile(int pos) {
        reportTok(pos, "`volatile");
    }

    //: token ::= # `! =>
    public void sawNot(int pos) {
        reportTok(pos, "`!");
    }
    //: token ::= # `!= =>
    public void sawNotEqual(int pos) {
        reportTok(pos, "`!=");
    }
    //: token ::= # `% =>
    public void sawRemainder(int pos) {
        reportTok(pos, "`%");
    }
    //: token ::= # `&& =>
    public void sawAnd(int pos) {
        reportTok(pos, "`&&");
    }
    //: token ::= # `* =>
    public void sawTimes(int pos) {
        reportTok(pos, "`*");
    }
    //: token ::= # `( =>
    public void sawLpar(int pos) {
        reportTok(pos, "`(");
    }
    //: token ::= # `) =>
    public void sawRpar(int pos) {
        reportTok(pos, "`)");
    }
    //: token ::= # `{ =>
    public void sawLbrace(int pos) {
        reportTok(pos, "`{");
    }
    //: token ::= # `} =>
    public void sawRbrace(int pos) {
        reportTok(pos, "`}");
    }
    //: token ::= # `- =>
    public void sawMinus(int pos) {
        reportTok(pos, "`-");
    }
    //: token ::= # `+ =>
    public void sawPlus(int pos) {
        reportTok(pos, "`+");
    }
    //: token ::= # `= =>
    public void sawAssign(int pos) {
        reportTok(pos, "`=");
    }
    //: token ::= # `== =>
    public void sawEqual(int pos) {
        reportTok(pos, "`==");
    }
    //: token ::= # `[ =>
    public void sawLbrack(int pos) {
        reportTok(pos, "`[");
    }
    //: token ::= # `] =>
    public void sawRbrack(int pos) {
        reportTok(pos, "`]");
    }
    //: token ::= # `|| =>
    public void sawOr(int pos) {
        reportTok(pos, "`||");
    }
    //: token ::= # `< =>
    public void sawLess(int pos) {
        reportTok(pos, "`<");
    }
    //: token ::= # `<= =>
    public void sawLessEq(int pos) {
        reportTok(pos, "`<=");
    }
    //: token ::= # `, =>
    public void sawComma(int pos) {
        reportTok(pos, "`,");
    }
    //: token ::= # `> =>
    public void sawGreater(int pos) {
        reportTok(pos, "`>");
    }
    //: token ::= # `>= =>
    public void sawGreaterEq(int pos) {
        reportTok(pos, "`>=");
    }
    //: token ::= # `. =>
    public void sawDot(int pos) {
        reportTok(pos, "`.");
    }
    //: token ::= # `; =>
    public void sawSemi(int pos) {
        reportTok(pos, "`;");
    }
    //: token ::= # `++ =>
    public void sawPlusPlus(int pos) {
        reportTok(pos, "`++");
    }
    //: token ::= # `-- =>
    public void sawMinusMinus(int pos) {
        reportTok(pos, "`--");
    }
    //: token ::= # `/ =>
    public void sawSlash(int pos) {
        reportTok(pos, "`/");
    }

    //: token ::= # ID =>
    public void identifier(int pos, String s) {
        reportTok(pos, "identifier: "+s);
    }

    //: token ::= # INTLIT =>
    public void intLit(int pos, int n) {
        reportTok(pos, "integer literal: "+n);
    }

    //: token ::= # STRINGLIT =>
    public void stringLit(int pos, String s) {
        reportTok(pos, "string literal: "+s);
    }

    //: token ::= # CHARLIT =>
    public void charLit(int pos, int n) {
        reportTok(pos, "chracter literal with ASCII value: "+n);
    }
    /////////////////////////////////////////////////////////////////
    ///////////// Your modifications should start here //////////////
    /////////////////////////////////////////////////////////////////

    //================================================================
    // the actual tokens
    //================================================================

    //: ID ::= !reserved letter idChar** ws* => text

    //================================================================
    // reserved words
    //================================================================
    //: `abstract ::= "abstract" !idChar ws*
    //: reserved ::= `abstract
    //: `assert ::= "assert" !idChar ws*
    //: reserved ::= `assert
    //: `boolean ::= "boolean" !idChar ws*
    //: reserved ::= `boolean
    //: `break ::= "break" !idChar ws*
    //: reserved ::= `break
    //: `byte ::= "byte" !idChar ws*
    //: reserved ::= `byte
    //: `case ::= "case" !idChar ws*
    //: reserved ::= `case
    //: `catch ::= "catch" !idChar ws*
    //: reserved ::= `catch
    //: `char ::= "char" !idChar ws*
    //: reserved ::= `char
    //: `class ::= "class" !idChar ws*
    //: reserved ::= `class
    //: `const ::= "const" !idChar ws*
    //: reserved ::= `const
    //: `continue ::= "continue" !idChar ws*
    //: reserved ::= `continue
    //: `default ::= "default" !idChar ws*
    //: reserved ::= `default
    //: `do ::= "do" !idChar ws*
    //: reserved ::= `do
    //: `double ::= "double" !idChar ws*
    //: reserved ::= `double
    //: `else ::= "else" !idChar ws*
    //: reserved ::= `else
    //: `enum ::= "enum" !idChar ws*
    //: reserved ::= `enum
    //: `extends ::= "extends" !idChar ws*
    //: reserved ::= `extends
    //: `false ::= "false" !idChar ws*
    //: reserved ::= `false
    //: `final ::= "final" !idChar ws*
    //: reserved ::= `final
    //: `finally ::= "finally" !idChar ws*
    //: reserved ::= `finally
    //: `float ::= "float" !idChar ws*
    //: reserved ::= `float
    //: `for ::= "for" !idChar ws*
    //: reserved ::= `for
    //: `goto ::= "goto" !idChar ws*
    //: reserved ::= `goto
    //: `if ::= "if" !idChar ws*
    //: reserved ::= `if
    //: `implements ::= "implements" !idChar ws*
    //: reserved ::= `implements
    //: `import ::= "import" !idChar ws*
    //: reserved ::= `import
    //: `instanceof ::= "instanceof" !idChar ws*
    //: reserved ::= `instanceof
    //: `int ::= "int" !idChar ws*
    //: reserved ::= `int
    //: `interface ::= "interface" !idChar ws*
    //: reserved ::= `interface
    //: `long ::= "long" !idChar ws*
    //: reserved ::= `long
    //: `native ::= "native" !idChar ws*
    //: reserved ::= `native
    //: `new ::= "new" !idChar ws*
    //: reserved ::= `new
    //: `null ::= "null" !idChar ws*
    //: reserved ::= `null
    //: `package ::= "package" !idChar ws*
    //: reserved ::= `package
    //: `private ::= "private" !idChar ws*
    //: reserved ::= `private
    //: `protected ::= "protected" !idChar ws*
    //: reserved ::= `protected
    //: `public ::= "public" !idChar ws*
    //: reserved ::= `public
    //: `return ::= "return" !idChar ws*
    //: reserved ::= `return
    //: `short ::= "short" !idChar ws*
    //: reserved ::= `short
    //: `static ::= "static" !idChar ws*
    //: reserved ::= `static
    //: `strictfp ::= "strictfp" !idChar ws*
    //: reserved ::= `strictfp
    //: `super ::= "super" !idChar ws*
    //: reserved ::= `super
    //: `switch ::= "switch" !idChar ws*
    //: reserved ::= `switch
    //: `synchronized ::= "synchronized" !idChar ws*
    //: reserved ::= `synchronized
    //: `this ::= "this" !idChar ws*
    //: reserved ::= `this
    //: `throw ::= "throw" !idChar ws*
    //: reserved ::= `throw
    //: `throws ::= "throws" !idChar ws*
    //: reserved ::= `throws
    //: `transient ::= "transient" !idChar ws*
    //: reserved ::= `transient
    //: `true ::= "true" !idChar ws*
    //: reserved ::= `true
    //: `try ::= "try" !idChar ws*
    //: reserved ::= `try
    //: `void ::= "void" !idChar ws*
    //: reserved ::= `void
    //: `volatile ::= "volatile" !idChar ws*
    //: reserved ::= `volatile
    //: `while ::= "while" !idChar ws*
    //: reserved ::= `while

    //================================================================
    // special token characters
    //================================================================
    //: `! ::= "!" !"=" ws*
    //: `!= ::= "!=" ws*
    //: `% ::= "%" ws*
    //: `&& ::= "&&" ws*
    //: `|| ::= "||" ws*
    //: `+ ::= "+" !"+" ws*
    //: `++ ::= "++" ws*
    //: `, ::= "," ws*
    //: `- ::= "-" !"-"ws*
    //: `-- ::= "--" ws*
    //: `. ::= "." ws*
    //: `* ::= "*" !"/" ws*
    //: `/ ::= "/" !{"/" "*"} ws*
    //: `; ::= ";" ws*
    //: `< ::= "<" !"=" ws*
    //: `<= ::= "<=" ws*
    //: `= ::= "=" !"=" ws*
    //: `== ::= "==" ws*
    //: `> ::= ">" !"=" ws*
    //: `>= ::= ">=" ws*
    //: `( ::= "(" ws*
    //: `) ::= ")" ws*
    //: `[ ::= "[" ws*
    //: `] ::= "]" ws*
    //: `{ ::= "{" ws*
    //: `} ::= "}" ws*

    //================================================================
    // literals
    //================================================================
    // A numeric literal
    //: INTLIT ::= # intLit2 ws* =>
    public int convertToInt(int pos, String s) {
        try {
            return new Integer(s).intValue();
        }
        catch (NumberFormatException nfx) {
            error(pos, "Integer literal value "+s+" is out of range.");
            return 0;
        }
    }

    // A character literal
    //: CHARLIT ::= "'" charPrintable "'" ws* =>
    public int zero(char q1, char c, char q2) { return c;}

    // A string literal
    //: STRINGLIT ::= '"' stringPrintable* '"' ws* => text

    //================================================================
    // character patterns -- "helper symbols"
    //================================================================

    // pattern that represents an integer literal (without trailing whitespace)
    //: intLit2 ::= !"0" digit++ => text
    //: intLit2 ::= "0" !idChar => text

    // a character that can be a non-first character in an identifier
    //: idChar ::= letter => pass
    //: idChar ::= digit => pass
    //: idChar ::= "_" => pass

    //: escapeSequence ::= "\\" => Character convertEscapeChar(char, char)
    //: escapeSequence ::= '\"' => Character convertEscapeChar(char, char)
    //: escapeSequence ::= "\'" => Character convertEscapeChar(char, char)
    //: escapeSequence ::= "\n" => Character convertEscapeChar(char, char)
    //: escapeSequence ::= "\t" => Character convertEscapeChar(char, char)
    //: escapeSequence ::= "\f" => Character convertEscapeChar(char, char)
    //: escapeSequence ::= "\r" => Character convertEscapeChar(char, char)

    // any printable sans NEWLINE
    //: printable ::= {9 32..126}

    // any printable character sans " or \ or TAB or NEWLINE
    //: charPrintable ::= {32..38 40..91 93..126} => pass
    //: charPrintable ::= escapeSequence => pass

    // any printable character sans " or \ or TAB or NEWLINE
    //: stringPrintable ::= {32 33 35..91 93..126} => pass
    //: stringPrintable ::= escapeSequence => pass

    // any printable character for multi-line comments
    //: multilineCommentPrintable ::= {9 32..41 43..46 48..126}
    //: multilineCommentPrintable ::= "*" !"/"
    //: multilineCommentPrintable ::= "/" !"*"
    //: multilineCommentPrintable ::= # "/*" !"/" =>
    public void nestedCommentsWarning(int pos, char c1, char c2) {
        warning(pos, "Nested comments");
    }
    //: multilineCommentPrintable ::= eol



    // a letter
    //: letter ::= {"a".."z" "A".."Z"} => pass

    // a digit
    //: digit ::= {"0".."9"} => pass

    //================================================================
    // whitespace
    //================================================================

    //whitespace
    //: ws ::= {" " 9 12} // space or tab or formfeed

    // comment
    //: ws ::= comment

    //: comment ::= "//" printable** eol =>
    public void foundComment(char c1, char c2) {
        System.out.println("Found a // comment");
    }
    //: comment ::= "/*" multilineCommentPrintable** "/" "*/" =>
    public void foundmultiComment(char c1, char c2, char c3, char c4, char s5) {
        System.out.println("Found a /* comment");
    }

    //: comment ::= "/*" multilineCommentPrintable** "*/" =>
    public void foundOthermultiComment(char c1, char c2, char c3, char c4) {
        System.out.println("Found a /* comment");
    }

    // multilineCommentPrintable**

    //multilineCommentPrintable**

    // end of line
    //: ws ::= eol

    // to handle the common end-of-line sequences on different types
    // of systems, we treat the sequence CR+LF as an end of line.
    // Otherwise, we treat CR or LF appearing separately each as an
    // end of line.
    //: eol ::= {10} registerNewline
    //: eol ::= {13} {10} registerNewline
    //: eol ::= {13} !{10} registerNewline // CR alone only if not followed by LF

    // empty symbol which registers a new line at the position reduced
    //: registerNewline ::= # =>
    public void registerNewline(int pos) {
        errorMsg.newline(pos-1);
    }

}
