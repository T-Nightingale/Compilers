package
parse
;
import
java
.
util
.
List
;
import
errorMsg
.
*
;
public class TokenGrammarParseTable implements wrangLR.runtime.ParseTable {
public int getEofSym() { return 170; }
public int getNttSym() { return 171; }
private String[] symNameTable = {
"$$start",
"start",
"ws*",
"$$0",
"token",
"`boolean",
"`class",
"`extends",
"`void",
"`int",
"`while",
"`if",
"`else",
"`for",
"`break",
"`this",
"`false",
"`true",
"`super",
"`null",
"`return",
"`instanceof",
"`new",
"`abstract",
"`assert",
"`byte",
"`case",
"`catch",
"`char",
"`const",
"`continue",
"`default",
"`do",
"`double",
"`enum",
"`final",
"`finally",
"`float",
"`goto",
"`implements",
"`import",
"`interface",
"`long",
"`native",
"`package",
"`private",
"`protected",
"`public",
"`short",
"`static",
"`strictfp",
"`switch",
"`synchronized",
"`throw",
"`throws",
"`transient",
"`try",
"`volatile",
"`!",
"`!=",
"`%",
"`&&",
"`*",
"`(",
"`)",
"`{",
"`}",
"`-",
"`+",
"`=",
"`==",
"`[",
"`]",
"`||",
"`<",
"`<=",
"`,",
"`>",
"`>=",
"`.",
"`;",
"`++",
"`--",
"`/",
"ID",
"INTLIT",
"STRINGLIT",
"CHARLIT",
"reserved",
"letter",
"idChar**",
"$$1",
"idChar",
"\"a\"",
"\"b\"",
"\"s\"",
"\"t\"",
"\"r\"",
"\"c\"",
"\"e\"",
"\"o\"",
"\"l\"",
"\"n\"",
"\"k\"",
"\"y\"",
"\"h\"",
"\"i\"",
"\"u\"",
"\"d\"",
"\"f\"",
"\"m\"",
"\"x\"",
"\"g\"",
"\"p\"",
"\"v\"",
"\"w\"",
"\"z\"",
"\"!\"",
"\"=\"",
"\"%\"",
"\"&\"",
"\"|\"",
"\"+\"",
"\",\"",
"\"-\"",
"\".\"",
"\"*\"",
"\"/\"",
"\";\"",
"\"<\"",
"\">\"",
"\"(\"",
"\")\"",
"\"[\"",
"\"]\"",
"\"{\"",
"\"}\"",
"intLit2",
"\"\'\"",
"charPrintable",
"\'\"\'",
"stringPrintable*",
"$$2",
"\"0\"",
"digit++",
"digit",
"\"_\"",
"escapeSequence",
"\"\\\"",
"printable",
"{\"1\"..\"9\"}",
"{\"#\"..\"$\" \":\" \"?\"..\"@\" \"^\" \"`\" \"~\"}",
"{\"A\"..\"Z\" \"j\" \"q\"}",
"\" \"",
"9",
"stringPrintable",
"multilineCommentPrintable",
"eol",
"ws",
"12",
"comment",
"printable**",
"multilineCommentPrintable**",
"10",
"13",
"idChar*",
"multilineCommentPrintable*",
"printable*",
"token*",
"digit+",
"$",
"$NT",
};
public String symName(int n) {
 return n >= 0 && n < symNameTable.length ? symNameTable[n] : "??";
}
private TokenGrammar actionObject;
public int[][] getParseTable() { return parseTable; }
public int numSymbols() { return 172;}
private static final int MIN_REDUCTION = 1201;
public int minReduction() { return MIN_REDUCTION;}
private static final int MAX_ACCEPT_REDUCTION = MIN_REDUCTION+1;
public int maxAcceptReduction() { return MAX_ACCEPT_REDUCTION; }
private final int[][] parseTable;
public void error(int pos, String msg){
 if (((Object)actionObject) instanceof wrangLR.runtime.MessageObject)
 ((wrangLR.runtime.MessageObject)(Object)actionObject).error(pos,msg);
 else System.err.println("file position "+pos+": "+msg);}
public void warning(int pos, String msg){
 if (((Object)actionObject) instanceof wrangLR.runtime.MessageObject)
 ((wrangLR.runtime.MessageObject)(Object)actionObject).warning(pos,msg);
 else System.err.println("file position "+pos+"(warning): "+msg);}
public String filePosString(int pos){
 if (((Object)actionObject) instanceof wrangLR.runtime.FilePosObject)
 return ((wrangLR.runtime.FilePosObject)(Object)actionObject).filePosString(pos);
 else return ""+pos;}
public boolean parse(java.io.InputStream is) {
	return new wrangLR.runtime.BaseParser(this).parse(is);
}
public boolean parse(java.io.InputStream is, int verboseLevel, boolean verboseReductions) {
	return new wrangLR.runtime.BaseParser(this,verboseLevel,verboseReductions).parse(is);
}
private class Initter1{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 0
0x80000000|812, // match move
0x80000000|103, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 1
2,251, // ws*
157,550, // eol
158,1016, // ws
160,654, // comment
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 2
  }
,
{ // state 3
-1, // $$start
-1, // start
202, // ws*
-1, // $$0
MIN_REDUCTION+270, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+270, // $
-1, // $NT
  }
,
{ // state 4
101,502, // "l"
  }
,
{ // state 5
0x80000000|2, // match move
0x80000000|862, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 6
0x80000000|475, // match move
0x80000000|474, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 7
102,651, // "n"
  }
,
{ // state 8
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 9
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+283, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+283, // $
-1, // $NT
  }
,
{ // state 10
0x80000000|315, // match move
0x80000000|614, // no-match move
0x80000000|778, // NT-test-match state for multilineCommentPrintable
  }
,
{ // state 11
0x80000000|1090, // match move
0x80000000|320, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 12
105,88, // "h"
  }
,
{ // state 13
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 14
99,388, // "e"
  }
,
{ // state 15
97,739, // "r"
  }
,
{ // state 16
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 17
171,MIN_REDUCTION+110, // $NT
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 18
0x80000000|83, // match move
0x80000000|1058, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 19
0x80000000|271, // match move
0x80000000|485, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 20
171,MIN_REDUCTION+312, // $NT
  }
,
{ // state 21
-1, // $$start
-1, // start
938, // ws*
-1, // $$0
MIN_REDUCTION+147, // token
89, // `boolean
303, // `class
1154, // `extends
1010, // `void
802, // `int
41, // `while
198, // `if
427, // `else
336, // `for
1160, // `break
480, // `this
569, // `false
595, // `true
525, // `super
724, // `null
820, // `return
414, // `instanceof
181, // `new
629, // `abstract
133, // `assert
1091, // `byte
682, // `case
99, // `catch
371, // `char
130, // `const
1055, // `continue
1165, // `default
890, // `do
121, // `double
233, // `enum
779, // `final
859, // `finally
766, // `float
551, // `goto
187, // `implements
662, // `import
622, // `interface
413, // `long
479, // `native
1128, // `package
709, // `private
788, // `protected
806, // `public
344, // `short
702, // `static
824, // `strictfp
995, // `switch
447, // `synchronized
177, // `throw
1103, // `throws
1082, // `transient
8, // `try
549, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
-1, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
973, // "a"
1139, // "b"
914, // "s"
1059, // "t"
626, // "r"
223, // "c"
182, // "e"
MIN_REDUCTION+147, // "o"
1008, // "l"
437, // "n"
MIN_REDUCTION+147, // "k"
MIN_REDUCTION+147, // "y"
MIN_REDUCTION+147, // "h"
1006, // "i"
MIN_REDUCTION+147, // "u"
734, // "d"
879, // "f"
MIN_REDUCTION+147, // "m"
MIN_REDUCTION+147, // "x"
1068, // "g"
293, // "p"
94, // "v"
12, // "w"
MIN_REDUCTION+147, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
736, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+147, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+147, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+147, // $
MIN_REDUCTION+147, // $NT
  }
,
{ // state 22
0x80000000|65, // match move
0x80000000|1070, // no-match move
0x80000000|566, // NT-test-match state for digit
  }
,
{ // state 23
171,MIN_REDUCTION+97, // $NT
  }
,
{ // state 24
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+305, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+305, // $
-1, // $NT
  }
,
{ // state 25
108,472, // "d"
  }
,
{ // state 26
MIN_REDUCTION+349, // (default reduction)
  }
,
{ // state 27
0x80000000|753, // match move
0x80000000|179, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 28
0x80000000|1071, // match move
0x80000000|552, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 29
171,MIN_REDUCTION+221, // $NT
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 30
2,446, // ws*
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 31
-1, // $$start
-1, // start
601, // ws*
-1, // $$0
MIN_REDUCTION+254, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+254, // $
-1, // $NT
  }
,
{ // state 32
171,MIN_REDUCTION+230, // $NT
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 33
MIN_REDUCTION+329, // (default reduction)
  }
,
{ // state 34
2,60, // ws*
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 35
0x80000000|523, // match move
0x80000000|195, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 36
0x80000000|2, // match move
0x80000000|730, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 37
0x80000000|331, // match move
0x80000000|343, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 38
0x80000000|1060, // match move
0x80000000|279, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 39
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+281, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+281, // $
-1, // $NT
  }
,
{ // state 40
0x80000000|592, // match move
0x80000000|1037, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 41
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 42
171,MIN_REDUCTION+321, // $NT
  }
,
{ // state 43
93,7, // "a"
104,775, // "y"
106,76, // "i"
107,908, // "u"
  }
,
{ // state 44
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 45
171,MIN_REDUCTION+101, // $NT
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 46
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+182, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+182, // $
MIN_REDUCTION+182, // $NT
  }
,
{ // state 47
-1, // $$start
-1, // start
1188, // ws*
-1, // $$0
MIN_REDUCTION+201, // token
89, // `boolean
303, // `class
1154, // `extends
1010, // `void
802, // `int
41, // `while
198, // `if
427, // `else
336, // `for
1160, // `break
480, // `this
569, // `false
595, // `true
525, // `super
724, // `null
820, // `return
414, // `instanceof
181, // `new
629, // `abstract
133, // `assert
1091, // `byte
682, // `case
99, // `catch
371, // `char
130, // `const
1055, // `continue
1165, // `default
890, // `do
121, // `double
233, // `enum
779, // `final
859, // `finally
766, // `float
551, // `goto
187, // `implements
662, // `import
622, // `interface
413, // `long
479, // `native
1128, // `package
709, // `private
788, // `protected
806, // `public
344, // `short
702, // `static
824, // `strictfp
995, // `switch
447, // `synchronized
177, // `throw
1103, // `throws
1082, // `transient
8, // `try
549, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
-1, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
973, // "a"
1139, // "b"
914, // "s"
1059, // "t"
626, // "r"
223, // "c"
182, // "e"
MIN_REDUCTION+201, // "o"
1014, // "l"
437, // "n"
MIN_REDUCTION+201, // "k"
MIN_REDUCTION+201, // "y"
MIN_REDUCTION+201, // "h"
1006, // "i"
MIN_REDUCTION+201, // "u"
734, // "d"
879, // "f"
MIN_REDUCTION+201, // "m"
MIN_REDUCTION+201, // "x"
1068, // "g"
293, // "p"
94, // "v"
12, // "w"
MIN_REDUCTION+201, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
736, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+201, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+201, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+201, // $
MIN_REDUCTION+201, // $NT
  }
,
{ // state 48
110,5, // "m"
  }
,
{ // state 49
0x80000000|32, // match move
0x80000000|253, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 50
101,503, // "l"
  }
,
{ // state 51
0x80000000|611, // match move
0x80000000|116, // no-match move
0x80000000|1136, // NT-test-match state for printable
  }
,
{ // state 52
0x80000000|488, // match move
0x80000000|632, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 53
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 54
0x80000000|426, // match move
0x80000000|484, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 55
0x80000000|644, // match move
0x80000000|1127, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 56
0x80000000|1190, // match move
0x80000000|1053, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 57
0x80000000|252, // match move
0x80000000|964, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 58
-1, // $$start
-1, // start
610, // ws*
-1, // $$0
MIN_REDUCTION+237, // token
89, // `boolean
303, // `class
1154, // `extends
1010, // `void
802, // `int
41, // `while
198, // `if
427, // `else
336, // `for
1160, // `break
480, // `this
569, // `false
595, // `true
525, // `super
724, // `null
820, // `return
414, // `instanceof
181, // `new
629, // `abstract
133, // `assert
1091, // `byte
682, // `case
99, // `catch
371, // `char
130, // `const
1055, // `continue
1165, // `default
890, // `do
121, // `double
233, // `enum
779, // `final
859, // `finally
766, // `float
551, // `goto
187, // `implements
662, // `import
622, // `interface
413, // `long
479, // `native
1128, // `package
709, // `private
788, // `protected
806, // `public
344, // `short
702, // `static
824, // `strictfp
995, // `switch
447, // `synchronized
177, // `throw
1103, // `throws
1082, // `transient
8, // `try
549, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
-1, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
973, // "a"
1139, // "b"
914, // "s"
1059, // "t"
626, // "r"
223, // "c"
182, // "e"
MIN_REDUCTION+237, // "o"
1014, // "l"
437, // "n"
MIN_REDUCTION+237, // "k"
MIN_REDUCTION+237, // "y"
MIN_REDUCTION+237, // "h"
1006, // "i"
MIN_REDUCTION+237, // "u"
734, // "d"
879, // "f"
MIN_REDUCTION+237, // "m"
MIN_REDUCTION+237, // "x"
1068, // "g"
293, // "p"
94, // "v"
12, // "w"
MIN_REDUCTION+237, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
736, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+237, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+237, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+237, // $
MIN_REDUCTION+237, // $NT
  }
,
{ // state 59
0x80000000|932, // match move
0x80000000|811, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 60
0x80000000|876, // match move
0x80000000|1163, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 61
0x80000000|1019, // match move
0x80000000|1048, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 62
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+146, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+146, // $
MIN_REDUCTION+146, // $NT
  }
,
{ // state 63
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 64
0x80000000|2, // match move
0x80000000|823, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 65
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 66
171,MIN_REDUCTION+215, // $NT
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 67
0x80000000|2, // match move
0x80000000|384, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 68
0x80000000|780, // match move
0x80000000|412, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 69
171,MIN_REDUCTION+157, // $NT
  }
,
{ // state 70
-1, // $$start
-1, // start
1034, // ws*
-1, // $$0
MIN_REDUCTION+282, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+282, // $
-1, // $NT
  }
,
{ // state 71
171,MIN_REDUCTION+106, // $NT
  }
,
{ // state 72
0x80000000|870, // match move
0x80000000|396, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 73
93,977, // "a"
  }
,
{ // state 74
0x80000000|1086, // match move
0x80000000|685, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 75
0x80000000|881, // match move
0x80000000|748, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 76
98,421, // "c"
  }
,
{ // state 77
113,64, // "p"
  }
,
{ // state 78
0x80000000|645, // match move
0x80000000|613, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 79
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 80
0x80000000|283, // match move
0x80000000|268, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 81
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 82
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+248, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+248, // $
MIN_REDUCTION+248, // $NT
  }
,
{ // state 83
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 84
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+131, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+131, // $
MIN_REDUCTION+131, // $NT
  }
,
{ // state 85
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 86
171,MIN_REDUCTION+238, // $NT
  }
,
{ // state 87
0x80000000|184, // match move
0x80000000|1032, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 88
106,1144, // "i"
  }
,
{ // state 89
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 90
0x80000000|846, // match move
0x80000000|958, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 91
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 92
97,1029, // "r"
  }
,
{ // state 93
2,247, // ws*
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 94
100,925, // "o"
  }
,
{ // state 95
-1, // $$start
-1, // start
338, // ws*
-1, // $$0
MIN_REDUCTION+96, // token
89, // `boolean
303, // `class
1154, // `extends
1010, // `void
802, // `int
41, // `while
198, // `if
427, // `else
336, // `for
1160, // `break
480, // `this
569, // `false
595, // `true
525, // `super
724, // `null
820, // `return
414, // `instanceof
181, // `new
629, // `abstract
133, // `assert
1091, // `byte
682, // `case
99, // `catch
371, // `char
130, // `const
1055, // `continue
1165, // `default
890, // `do
121, // `double
233, // `enum
779, // `final
859, // `finally
766, // `float
551, // `goto
187, // `implements
662, // `import
622, // `interface
413, // `long
479, // `native
1128, // `package
709, // `private
788, // `protected
806, // `public
344, // `short
702, // `static
824, // `strictfp
995, // `switch
447, // `synchronized
177, // `throw
1103, // `throws
1082, // `transient
8, // `try
549, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
-1, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
973, // "a"
1139, // "b"
914, // "s"
1059, // "t"
626, // "r"
223, // "c"
182, // "e"
MIN_REDUCTION+96, // "o"
1014, // "l"
437, // "n"
MIN_REDUCTION+96, // "k"
MIN_REDUCTION+96, // "y"
MIN_REDUCTION+96, // "h"
1006, // "i"
MIN_REDUCTION+96, // "u"
734, // "d"
879, // "f"
MIN_REDUCTION+96, // "m"
MIN_REDUCTION+96, // "x"
1068, // "g"
293, // "p"
94, // "v"
12, // "w"
MIN_REDUCTION+96, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
736, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+96, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+96, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+96, // $
MIN_REDUCTION+96, // $NT
  }
,
{ // state 96
107,1077, // "u"
  }
,
{ // state 97
-1, // $$start
-1, // start
60, // ws*
-1, // $$0
MIN_REDUCTION+302, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+302, // $
-1, // $NT
  }
,
{ // state 98
102,313, // "n"
  }
,
{ // state 99
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 100
99,1114, // "e"
  }
,
{ // state 101
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 102
99,1108, // "e"
  }
,
{ // state 103
0x80000000|322, // match move
0x80000000|424, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 104
2,691, // ws*
157,550, // eol
158,1016, // ws
160,654, // comment
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 105
93,1135, // "a"
  }
,
{ // state 106
0x80000000|850, // match move
0x80000000|129, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 107
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 108
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+362, // (default reduction)
  }
,
{ // state 109
0x80000000|538, // match move
0x80000000|555, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 110
0x80000000|443, // match move
0x80000000|370, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 111
171,MIN_REDUCTION+233, // $NT
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 112
MIN_REDUCTION+358, // (default reduction)
  }
,
{ // state 113
0x80000000|66, // match move
0x80000000|326, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 114
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 115
0x80000000|942, // match move
0x80000000|288, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 116
MIN_REDUCTION+356, // (default reduction)
  }
,
{ // state 117
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+267, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+267, // $
-1, // $NT
  }
,
{ // state 118
3,643, // $$0
4,796, // token
58,984, // `!
59,1186, // `!=
60,801, // `%
61,772, // `&&
62,535, // `*
63,605, // `(
64,316, // `)
65,547, // `{
66,232, // `}
67,835, // `-
68,440, // `+
69,219, // `=
70,660, // `==
71,435, // `[
72,781, // `]
73,13, // `||
74,254, // `<
75,558, // `<=
76,420, // `,
77,1013, // `>
78,537, // `>=
79,459, // `.
80,1056, // `;
81,789, // `++
82,147, // `--
83,710, // `/
84,803, // ID
85,16, // INTLIT
86,286, // STRINGLIT
87,765, // CHARLIT
89,75, // letter
137,795, // intLit2
143,736, // "0"
157,550, // eol
158,387, // ws
160,654, // comment
168,1152, // token*
  }
,
{ // state 119
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+233, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+233, // $
MIN_REDUCTION+233, // $NT
  }
,
{ // state 120
112,1119, // "g"
  }
,
{ // state 121
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 122
171,MIN_REDUCTION+148, // $NT
  }
,
{ // state 123
171,MIN_REDUCTION+107, // $NT
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 124
0x80000000|861, // match move
0x80000000|746, // no-match move
// T-test match for {"*" "/"}:
126,
127,
  }
,
{ // state 125
93,249, // "a"
97,43, // "r"
105,638, // "h"
  }
,
{ // state 126
93,1085, // "a"
  }
,
{ // state 127
-1, // $$start
-1, // start
843, // ws*
-1, // $$0
MIN_REDUCTION+192, // token
89, // `boolean
303, // `class
1154, // `extends
1010, // `void
802, // `int
41, // `while
198, // `if
427, // `else
336, // `for
1160, // `break
480, // `this
569, // `false
595, // `true
525, // `super
724, // `null
820, // `return
414, // `instanceof
181, // `new
629, // `abstract
133, // `assert
1091, // `byte
682, // `case
99, // `catch
371, // `char
130, // `const
1055, // `continue
1165, // `default
890, // `do
121, // `double
233, // `enum
779, // `final
859, // `finally
766, // `float
551, // `goto
187, // `implements
662, // `import
622, // `interface
413, // `long
479, // `native
1128, // `package
709, // `private
788, // `protected
806, // `public
344, // `short
702, // `static
824, // `strictfp
995, // `switch
447, // `synchronized
177, // `throw
1103, // `throws
1082, // `transient
8, // `try
549, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
-1, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
973, // "a"
1139, // "b"
914, // "s"
1059, // "t"
626, // "r"
223, // "c"
182, // "e"
MIN_REDUCTION+192, // "o"
1014, // "l"
437, // "n"
MIN_REDUCTION+192, // "k"
MIN_REDUCTION+192, // "y"
MIN_REDUCTION+192, // "h"
1006, // "i"
MIN_REDUCTION+192, // "u"
734, // "d"
879, // "f"
MIN_REDUCTION+192, // "m"
MIN_REDUCTION+192, // "x"
1068, // "g"
293, // "p"
94, // "v"
12, // "w"
MIN_REDUCTION+192, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
736, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+192, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+192, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+192, // $
MIN_REDUCTION+192, // $NT
  }
,
{ // state 128
171,MIN_REDUCTION+337, // $NT
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 129
0x80000000|17, // match move
0x80000000|1110, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 130
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 131
MIN_REDUCTION+354, // (default reduction)
  }
,
{ // state 132
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+301, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+301, // $
-1, // $NT
  }
,
{ // state 133
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 134
97,521, // "r"
  }
,
{ // state 135
2,907, // ws*
157,550, // eol
158,1016, // ws
160,654, // comment
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 136
171,MIN_REDUCTION+196, // $NT
  }
,
{ // state 137
2,580, // ws*
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 138
-1, // $$start
-1, // start
667, // ws*
-1, // $$0
MIN_REDUCTION+117, // token
89, // `boolean
303, // `class
1154, // `extends
1010, // `void
802, // `int
41, // `while
198, // `if
427, // `else
336, // `for
1160, // `break
480, // `this
569, // `false
595, // `true
525, // `super
724, // `null
820, // `return
414, // `instanceof
181, // `new
629, // `abstract
133, // `assert
1091, // `byte
682, // `case
99, // `catch
371, // `char
130, // `const
1055, // `continue
1165, // `default
890, // `do
121, // `double
233, // `enum
779, // `final
859, // `finally
766, // `float
551, // `goto
187, // `implements
662, // `import
622, // `interface
413, // `long
479, // `native
1128, // `package
709, // `private
788, // `protected
806, // `public
344, // `short
702, // `static
824, // `strictfp
995, // `switch
447, // `synchronized
177, // `throw
1103, // `throws
1082, // `transient
8, // `try
549, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
-1, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
973, // "a"
1139, // "b"
914, // "s"
1059, // "t"
626, // "r"
223, // "c"
182, // "e"
MIN_REDUCTION+117, // "o"
1014, // "l"
437, // "n"
MIN_REDUCTION+117, // "k"
MIN_REDUCTION+117, // "y"
MIN_REDUCTION+117, // "h"
1006, // "i"
MIN_REDUCTION+117, // "u"
734, // "d"
879, // "f"
MIN_REDUCTION+117, // "m"
MIN_REDUCTION+117, // "x"
1068, // "g"
293, // "p"
94, // "v"
12, // "w"
MIN_REDUCTION+117, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
736, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+117, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+117, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+117, // $
MIN_REDUCTION+117, // $NT
  }
,
{ // state 139
MIN_REDUCTION+344, // (default reduction)
  }
,
{ // state 140
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+255, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+255, // $
-1, // $NT
  }
,
{ // state 141
-1, // $$start
-1, // start
532, // ws*
-1, // $$0
MIN_REDUCTION+159, // token
89, // `boolean
303, // `class
1154, // `extends
1010, // `void
802, // `int
41, // `while
198, // `if
427, // `else
336, // `for
1160, // `break
480, // `this
569, // `false
595, // `true
525, // `super
724, // `null
820, // `return
414, // `instanceof
181, // `new
629, // `abstract
133, // `assert
1091, // `byte
682, // `case
99, // `catch
371, // `char
130, // `const
1055, // `continue
1165, // `default
890, // `do
121, // `double
233, // `enum
779, // `final
859, // `finally
766, // `float
551, // `goto
187, // `implements
662, // `import
622, // `interface
413, // `long
479, // `native
1128, // `package
709, // `private
788, // `protected
806, // `public
344, // `short
702, // `static
824, // `strictfp
995, // `switch
447, // `synchronized
177, // `throw
1103, // `throws
1082, // `transient
8, // `try
549, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
-1, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
973, // "a"
1139, // "b"
914, // "s"
1059, // "t"
626, // "r"
223, // "c"
182, // "e"
MIN_REDUCTION+159, // "o"
1014, // "l"
437, // "n"
MIN_REDUCTION+159, // "k"
MIN_REDUCTION+159, // "y"
MIN_REDUCTION+159, // "h"
1006, // "i"
MIN_REDUCTION+159, // "u"
734, // "d"
879, // "f"
MIN_REDUCTION+159, // "m"
MIN_REDUCTION+159, // "x"
1068, // "g"
293, // "p"
94, // "v"
12, // "w"
MIN_REDUCTION+159, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
736, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+159, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+159, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+159, // $
MIN_REDUCTION+159, // $NT
  }
,
{ // state 142
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 143
171,MIN_REDUCTION+226, // $NT
  }
,
{ // state 144
99,391, // "e"
  }
,
{ // state 145
101,483, // "l"
  }
,
{ // state 146
171,MIN_REDUCTION+181, // $NT
  }
,
{ // state 147
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 148
171,MIN_REDUCTION+326, // $NT
  }
,
{ // state 149
0x80000000|880, // match move
0x80000000|919, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 150
102,120, // "n"
  }
,
{ // state 151
0x80000000|886, // match move
0x80000000|993, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 152
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 153
100,519, // "o"
  }
,
{ // state 154
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 155
0x80000000|2, // match move
0x80000000|211, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 156
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+149, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+149, // $
MIN_REDUCTION+149, // $NT
  }
,
{ // state 157
102,719, // "n"
  }
,
{ // state 158
2,691, // ws*
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 159
MIN_REDUCTION+345, // (default reduction)
  }
,
{ // state 160
171,MIN_REDUCTION+167, // $NT
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 161
-1, // $$start
-1, // start
609, // ws*
-1, // $$0
MIN_REDUCTION+294, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+294, // $
-1, // $NT
  }
,
{ // state 162
118,877, // "="
  }
,
{ // state 163
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 164
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+137, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+137, // $
MIN_REDUCTION+137, // $NT
  }
,
{ // state 165
105,429, // "h"
  }
,
{ // state 166
0x80000000|575, // match move
0x80000000|26, // no-match move
0x80000000|1136, // NT-test-match state for printable
  }
,
{ // state 167
98,165, // "c"
  }
,
{ // state 168
0x80000000|579, // match move
0x80000000|113, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 169
105,635, // "h"
  }
,
{ // state 170
0x80000000|2, // match move
0x80000000|496, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 171
0x80000000|945, // match move
0x80000000|377, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 172
2,251, // ws*
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 173
100,4, // "o"
  }
,
{ // state 174
0x80000000|852, // match move
0x80000000|463, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 175
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 176
171,MIN_REDUCTION+241, // $NT
  }
,
{ // state 177
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 178
99,972, // "e"
  }
,
{ // state 179
0x80000000|1141, // match move
0x80000000|911, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 180
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 181
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 182
101,199, // "l"
102,688, // "n"
111,598, // "x"
  }
,
{ // state 183
0x80000000|641, // match move
0x80000000|929, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 184
96,257, // "t"
104,98, // "y"
105,452, // "h"
107,237, // "u"
115,672, // "w"
  }
,
{ // state 185
171,MIN_REDUCTION+330, // $NT
  }
,
{ // state 186
0x80000000|836, // match move
0x80000000|1099, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 187
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 188
171,MIN_REDUCTION+179, // $NT
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 189
102,126, // "n"
  }
,
{ // state 190
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 191
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 192
171,MIN_REDUCTION+329, // $NT
  }
,
{ // state 193
2,580, // ws*
157,550, // eol
158,1016, // ws
160,654, // comment
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 194
0x80000000|726, // match move
0x80000000|1185, // no-match move
0x80000000|566, // NT-test-match state for digit
  }
,
{ // state 195
0x80000000|1035, // match move
0x80000000|392, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 196
0x80000000|493, // match move
0x80000000|118, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 197
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 198
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 199
95,282, // "s"
  }
,
{ // state 200
2,601, // ws*
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 201
2,476, // ws*
157,550, // eol
158,1016, // ws
160,654, // comment
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 202
0x80000000|1176, // match move
0x80000000|266, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 203
171,MIN_REDUCTION+194, // $NT
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 204
106,50, // "i"
  }
,
{ // state 205
171,MIN_REDUCTION+187, // $NT
  }
,
{ // state 206
171,MIN_REDUCTION+116, // $NT
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 207
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+245, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+245, // $
MIN_REDUCTION+245, // $NT
  }
};
}
private class Initter2{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 208
-1, // $$start
-1, // start
106, // ws*
-1, // $$0
MIN_REDUCTION+111, // token
89, // `boolean
303, // `class
1154, // `extends
1010, // `void
802, // `int
41, // `while
198, // `if
427, // `else
336, // `for
1160, // `break
480, // `this
569, // `false
595, // `true
525, // `super
724, // `null
820, // `return
414, // `instanceof
181, // `new
629, // `abstract
133, // `assert
1091, // `byte
682, // `case
99, // `catch
371, // `char
130, // `const
1055, // `continue
1165, // `default
890, // `do
121, // `double
233, // `enum
779, // `final
859, // `finally
766, // `float
551, // `goto
187, // `implements
662, // `import
622, // `interface
413, // `long
479, // `native
1128, // `package
709, // `private
788, // `protected
806, // `public
344, // `short
702, // `static
824, // `strictfp
995, // `switch
447, // `synchronized
177, // `throw
1103, // `throws
1082, // `transient
8, // `try
549, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
-1, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
973, // "a"
1139, // "b"
914, // "s"
1059, // "t"
626, // "r"
223, // "c"
182, // "e"
MIN_REDUCTION+111, // "o"
1014, // "l"
437, // "n"
MIN_REDUCTION+111, // "k"
MIN_REDUCTION+111, // "y"
MIN_REDUCTION+111, // "h"
1006, // "i"
MIN_REDUCTION+111, // "u"
734, // "d"
879, // "f"
MIN_REDUCTION+111, // "m"
MIN_REDUCTION+111, // "x"
1068, // "g"
293, // "p"
94, // "v"
12, // "w"
MIN_REDUCTION+111, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
736, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+111, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+111, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+111, // $
MIN_REDUCTION+111, // $NT
  }
,
{ // state 209
95,335, // "s"
96,1115, // "t"
  }
,
{ // state 210
93,607, // "a"
94,607, // "b"
95,607, // "s"
96,607, // "t"
97,607, // "r"
98,607, // "c"
99,607, // "e"
100,607, // "o"
101,607, // "l"
102,607, // "n"
103,607, // "k"
104,607, // "y"
105,607, // "h"
106,607, // "i"
107,607, // "u"
108,607, // "d"
109,607, // "f"
110,607, // "m"
111,607, // "x"
112,607, // "g"
113,607, // "p"
114,607, // "v"
115,607, // "w"
116,607, // "z"
117,607, // "!"
118,607, // "="
119,607, // "%"
120,607, // "&"
121,607, // "|"
122,607, // "+"
123,607, // ","
124,607, // "-"
125,607, // "."
126,607, // "*"
127,607, // "/"
128,607, // ";"
129,607, // "<"
130,607, // ">"
131,607, // "("
132,607, // ")"
133,607, // "["
134,607, // "]"
135,607, // "{"
136,607, // "}"
138,607, // "'"
140,1024, // '"'
141,565, // stringPrintable*
142,163, // $$2
143,607, // "0"
146,607, // "_"
147,847, // escapeSequence
148,867, // "\"
150,607, // {"1".."9"}
151,607, // {"#".."$" ":" "?".."@" "^" "`" "~"}
152,607, // {"A".."Z" "j" "q"}
153,607, // " "
155,139, // stringPrintable
  }
,
{ // state 211
-1, // $$start
-1, // start
74, // ws*
-1, // $$0
MIN_REDUCTION+249, // token
89, // `boolean
303, // `class
1154, // `extends
1010, // `void
802, // `int
41, // `while
198, // `if
427, // `else
336, // `for
1160, // `break
480, // `this
569, // `false
595, // `true
525, // `super
724, // `null
820, // `return
414, // `instanceof
181, // `new
629, // `abstract
133, // `assert
1091, // `byte
682, // `case
99, // `catch
371, // `char
130, // `const
1055, // `continue
1165, // `default
890, // `do
121, // `double
233, // `enum
779, // `final
859, // `finally
766, // `float
551, // `goto
187, // `implements
662, // `import
622, // `interface
413, // `long
479, // `native
1128, // `package
709, // `private
788, // `protected
806, // `public
344, // `short
702, // `static
824, // `strictfp
995, // `switch
447, // `synchronized
177, // `throw
1103, // `throws
1082, // `transient
8, // `try
549, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
-1, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
973, // "a"
1139, // "b"
914, // "s"
1059, // "t"
626, // "r"
223, // "c"
182, // "e"
MIN_REDUCTION+249, // "o"
1014, // "l"
437, // "n"
MIN_REDUCTION+249, // "k"
MIN_REDUCTION+249, // "y"
MIN_REDUCTION+249, // "h"
1006, // "i"
MIN_REDUCTION+249, // "u"
734, // "d"
879, // "f"
MIN_REDUCTION+249, // "m"
MIN_REDUCTION+249, // "x"
1068, // "g"
293, // "p"
94, // "v"
12, // "w"
MIN_REDUCTION+249, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
736, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+249, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+249, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+249, // $
MIN_REDUCTION+249, // $NT
  }
,
{ // state 212
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 213
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 214
93,670, // "a"
94,670, // "b"
95,670, // "s"
96,670, // "t"
97,670, // "r"
98,670, // "c"
99,670, // "e"
100,670, // "o"
101,670, // "l"
102,670, // "n"
103,670, // "k"
104,670, // "y"
105,670, // "h"
106,670, // "i"
107,670, // "u"
108,670, // "d"
109,670, // "f"
110,670, // "m"
111,670, // "x"
112,670, // "g"
113,670, // "p"
114,670, // "v"
115,670, // "w"
116,670, // "z"
117,670, // "!"
118,670, // "="
119,670, // "%"
120,670, // "&"
121,670, // "|"
122,670, // "+"
123,670, // ","
124,670, // "-"
125,670, // "."
126,670, // "*"
127,670, // "/"
128,670, // ";"
129,670, // "<"
130,670, // ">"
131,670, // "("
132,670, // ")"
133,670, // "["
134,670, // "]"
135,670, // "{"
136,670, // "}"
138,670, // "'"
140,670, // '"'
143,670, // "0"
146,670, // "_"
148,670, // "\"
149,51, // printable
150,670, // {"1".."9"}
151,670, // {"#".."$" ":" "?".."@" "^" "`" "~"}
152,670, // {"A".."Z" "j" "q"}
153,670, // " "
154,670, // {9}
161,1073, // printable**
167,166, // printable*
  }
,
{ // state 215
97,281, // "r"
  }
,
{ // state 216
115,333, // "w"
  }
,
{ // state 217
0x80000000|826, // match move
0x80000000|792, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 218
-1, // $$start
-1, // start
1092, // ws*
-1, // $$0
MIN_REDUCTION+171, // token
89, // `boolean
303, // `class
1154, // `extends
1010, // `void
802, // `int
41, // `while
198, // `if
427, // `else
336, // `for
1160, // `break
480, // `this
569, // `false
595, // `true
525, // `super
724, // `null
820, // `return
414, // `instanceof
181, // `new
629, // `abstract
133, // `assert
1091, // `byte
682, // `case
99, // `catch
371, // `char
130, // `const
1055, // `continue
1165, // `default
890, // `do
121, // `double
233, // `enum
779, // `final
859, // `finally
766, // `float
551, // `goto
187, // `implements
662, // `import
622, // `interface
413, // `long
479, // `native
1128, // `package
709, // `private
788, // `protected
806, // `public
344, // `short
702, // `static
824, // `strictfp
995, // `switch
447, // `synchronized
177, // `throw
1103, // `throws
1082, // `transient
8, // `try
549, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
-1, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
973, // "a"
1139, // "b"
914, // "s"
1059, // "t"
626, // "r"
223, // "c"
182, // "e"
MIN_REDUCTION+171, // "o"
1014, // "l"
437, // "n"
MIN_REDUCTION+171, // "k"
MIN_REDUCTION+171, // "y"
MIN_REDUCTION+171, // "h"
1006, // "i"
MIN_REDUCTION+171, // "u"
734, // "d"
879, // "f"
MIN_REDUCTION+171, // "m"
MIN_REDUCTION+171, // "x"
1068, // "g"
293, // "p"
94, // "v"
12, // "w"
MIN_REDUCTION+171, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
736, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+171, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+171, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+171, // $
MIN_REDUCTION+171, // $NT
  }
,
{ // state 219
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 220
0x80000000|873, // match move
0x80000000|458, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 221
0x80000000|104, // match move
0x80000000|263, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 222
171,MIN_REDUCTION+338, // $NT
MIN_REDUCTION+338, // (default reduction)
  }
,
{ // state 223
93,351, // "a"
100,274, // "o"
101,494, // "l"
105,793, // "h"
  }
,
{ // state 224
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+119, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+119, // $
MIN_REDUCTION+119, // $NT
  }
,
{ // state 225
0x80000000|640, // match move
0x80000000|758, // no-match move
// T-test match for "=":
118,
  }
,
{ // state 226
0x80000000|1, // match move
0x80000000|1117, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 227
96,628, // "t"
  }
,
{ // state 228
0x80000000|369, // match move
0x80000000|590, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 229
-1, // $$start
-1, // start
691, // ws*
-1, // $$0
MIN_REDUCTION+288, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
-1, // `=
-1, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
MIN_REDUCTION+288, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+288, // $
-1, // $NT
  }
,
{ // state 230
118,109, // "="
  }
,
{ // state 231
4,587, // token
5,89, // `boolean
6,303, // `class
7,1154, // `extends
8,1010, // `void
9,802, // `int
10,41, // `while
11,198, // `if
12,427, // `else
13,336, // `for
14,1160, // `break
15,480, // `this
16,569, // `false
17,595, // `true
18,525, // `super
19,724, // `null
20,820, // `return
21,414, // `instanceof
22,181, // `new
23,629, // `abstract
24,133, // `assert
25,1091, // `byte
26,682, // `case
27,99, // `catch
28,371, // `char
29,130, // `const
30,1055, // `continue
31,1165, // `default
32,890, // `do
33,121, // `double
34,233, // `enum
35,779, // `final
36,859, // `finally
37,766, // `float
38,551, // `goto
39,187, // `implements
40,662, // `import
41,622, // `interface
42,413, // `long
43,479, // `native
44,1128, // `package
45,709, // `private
46,788, // `protected
47,806, // `public
48,344, // `short
49,702, // `static
50,824, // `strictfp
51,995, // `switch
52,447, // `synchronized
53,177, // `throw
54,1103, // `throws
55,1082, // `transient
56,8, // `try
57,549, // `volatile
93,973, // "a"
94,1139, // "b"
95,914, // "s"
96,1059, // "t"
97,626, // "r"
98,223, // "c"
99,182, // "e"
101,1014, // "l"
102,437, // "n"
106,1006, // "i"
108,734, // "d"
109,879, // "f"
112,1068, // "g"
113,293, // "p"
114,94, // "v"
115,12, // "w"
MIN_REDUCTION+361, // (default reduction)
  }
,
{ // state 232
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 233
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 234
0x80000000|175, // match move
0x80000000|534, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 235
-1, // $$start
-1, // start
500, // ws*
-1, // $$0
MIN_REDUCTION+292, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+292, // $
-1, // $NT
  }
,
{ // state 236
171,MIN_REDUCTION+223, // $NT
  }
,
{ // state 237
113,785, // "p"
  }
,
{ // state 238
0x80000000|93, // match move
0x80000000|975, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 239
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 240
98,422, // "c"
  }
,
{ // state 241
171,MIN_REDUCTION+130, // $NT
  }
,
{ // state 242
0x80000000|556, // match move
0x80000000|24, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 243
171,MIN_REDUCTION+328, // $NT
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 244
2,907, // ws*
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 245
0x80000000|1087, // match move
0x80000000|747, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 246
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 247
0x80000000|1181, // match move
0x80000000|509, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 248
0x80000000|524, // match move
0x80000000|1097, // no-match move
// T-test match for 10:
163,
  }
,
{ // state 249
96,1184, // "t"
  }
,
{ // state 250
102,367, // "n"
  }
,
{ // state 251
0x80000000|1095, // match move
0x80000000|669, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 252
2,339, // ws*
157,550, // eol
158,1016, // ws
160,654, // comment
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 253
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+230, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+230, // $
MIN_REDUCTION+230, // $NT
  }
,
{ // state 254
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 255
99,363, // "e"
  }
,
{ // state 256
2,1131, // ws*
157,550, // eol
158,1016, // ws
160,654, // comment
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 257
93,249, // "a"
97,1063, // "r"
  }
,
{ // state 258
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 259
171,MIN_REDUCTION+118, // $NT
  }
,
{ // state 260
171,MIN_REDUCTION+235, // $NT
  }
,
{ // state 261
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+161, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+161, // $
MIN_REDUCTION+161, // $NT
  }
,
{ // state 262
0x80000000|738, // match move
0x80000000|299, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 263
0x80000000|158, // match move
0x80000000|229, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 264
4,587, // token
58,984, // `!
59,1186, // `!=
60,801, // `%
61,772, // `&&
62,535, // `*
63,605, // `(
64,316, // `)
65,547, // `{
66,232, // `}
67,835, // `-
68,440, // `+
69,219, // `=
70,660, // `==
71,435, // `[
72,781, // `]
73,13, // `||
74,254, // `<
75,558, // `<=
76,420, // `,
77,1013, // `>
78,537, // `>=
79,459, // `.
80,1056, // `;
81,789, // `++
82,147, // `--
83,710, // `/
84,803, // ID
85,16, // INTLIT
86,286, // STRINGLIT
87,765, // CHARLIT
89,75, // letter
93,68, // "a"
94,68, // "b"
95,68, // "s"
96,68, // "t"
97,68, // "r"
98,68, // "c"
99,68, // "e"
100,68, // "o"
101,68, // "l"
102,68, // "n"
103,68, // "k"
104,68, // "y"
105,68, // "h"
106,68, // "i"
107,68, // "u"
108,68, // "d"
109,68, // "f"
110,68, // "m"
111,68, // "x"
112,68, // "g"
113,68, // "p"
114,68, // "v"
115,68, // "w"
116,68, // "z"
117,225, // "!"
118,683, // "="
119,466, // "%"
120,506, // "&"
121,663, // "|"
122,658, // "+"
123,381, // ","
124,478, // "-"
125,390, // "."
126,680, // "*"
127,487, // "/"
128,226, // ";"
129,265, // "<"
130,1022, // ">"
131,405, // "("
132,686, // ")"
133,56, // "["
134,27, // "]"
135,892, // "{"
136,375, // "}"
137,795, // intLit2
138,1178, // "'"
140,210, // '"'
143,22, // "0"
144,418, // digit++
145,967, // digit
150,22, // {"1".."9"}
152,68, // {"A".."Z" "j" "q"}
169,194, // digit+
MIN_REDUCTION+361, // (default reduction)
  }
,
{ // state 265
0x80000000|162, // match move
0x80000000|35, // no-match move
// T-test match for "=":
118,
  }
,
{ // state 266
0x80000000|913, // match move
0x80000000|1124, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 267
-1, // $$start
-1, // start
-1, // ws*
643, // $$0
796, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
1152, // token*
194, // digit+
MIN_REDUCTION+3, // $
-1, // $NT
  }
,
{ // state 268
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+203, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+203, // $
MIN_REDUCTION+203, // $NT
  }
,
{ // state 269
0x80000000|1021, // match move
0x80000000|1145, // no-match move
0x80000000|778, // NT-test-match state for multilineCommentPrintable
  }
,
{ // state 270
0x80000000|783, // match move
0x80000000|599, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 271
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 272
-1, // $$start
-1, // start
314, // ws*
-1, // $$0
MIN_REDUCTION+264, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+264, // $
-1, // $NT
  }
,
{ // state 273
116,1050, // "z"
  }
,
{ // state 274
102,209, // "n"
  }
,
{ // state 275
0x80000000|1166, // match move
0x80000000|863, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 276
0x80000000|96, // match move
0x80000000|625, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 277
95,67, // "s"
  }
,
{ // state 278
0x80000000|361, // match move
0x80000000|1168, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 279
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+293, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+293, // $
-1, // $NT
  }
,
{ // state 280
0x80000000|1009, // match move
0x80000000|904, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 281
109,585, // "f"
  }
,
{ // state 282
99,692, // "e"
  }
,
{ // state 283
171,MIN_REDUCTION+203, // $NT
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 284
MIN_REDUCTION+315, // (default reduction)
  }
,
{ // state 285
127,128, // "/"
  }
,
{ // state 286
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 287
0x80000000|416, // match move
0x80000000|1134, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 288
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+273, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+273, // $
-1, // $NT
  }
,
{ // state 289
0x80000000|923, // match move
0x80000000|751, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 290
99,292, // "e"
  }
,
{ // state 291
2,500, // ws*
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 292
93,997, // "a"
  }
,
{ // state 293
93,857, // "a"
97,504, // "r"
107,489, // "u"
  }
,
{ // state 294
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 295
108,633, // "d"
  }
,
{ // state 296
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+104, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+104, // $
MIN_REDUCTION+104, // $NT
  }
,
{ // state 297
171,MIN_REDUCTION+122, // $NT
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 298
0x80000000|85, // match move
0x80000000|151, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 299
0x80000000|676, // match move
0x80000000|1116, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 300
0x80000000|630, // match move
0x80000000|21, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 301
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+92, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+92, // $
MIN_REDUCTION+92, // $NT
  }
,
{ // state 302
93,561, // "a"
  }
,
{ // state 303
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 304
98,1030, // "c"
  }
,
{ // state 305
114,14, // "v"
  }
,
{ // state 306
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 307
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 308
MIN_REDUCTION+327, // (default reduction)
  }
,
{ // state 309
171,MIN_REDUCTION+327, // $NT
  }
,
{ // state 310
0x80000000|2, // match move
0x80000000|441, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 311
-1, // $$start
-1, // start
723, // ws*
-1, // $$0
MIN_REDUCTION+123, // token
89, // `boolean
303, // `class
1154, // `extends
1010, // `void
802, // `int
41, // `while
198, // `if
427, // `else
336, // `for
1160, // `break
480, // `this
569, // `false
595, // `true
525, // `super
724, // `null
820, // `return
414, // `instanceof
181, // `new
629, // `abstract
133, // `assert
1091, // `byte
682, // `case
99, // `catch
371, // `char
130, // `const
1055, // `continue
1165, // `default
890, // `do
121, // `double
233, // `enum
779, // `final
859, // `finally
766, // `float
551, // `goto
187, // `implements
662, // `import
622, // `interface
413, // `long
479, // `native
1128, // `package
709, // `private
788, // `protected
806, // `public
344, // `short
702, // `static
824, // `strictfp
995, // `switch
447, // `synchronized
177, // `throw
1103, // `throws
1082, // `transient
8, // `try
549, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
-1, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
973, // "a"
1139, // "b"
914, // "s"
1059, // "t"
626, // "r"
223, // "c"
182, // "e"
MIN_REDUCTION+123, // "o"
1014, // "l"
437, // "n"
MIN_REDUCTION+123, // "k"
MIN_REDUCTION+123, // "y"
MIN_REDUCTION+123, // "h"
1006, // "i"
MIN_REDUCTION+123, // "u"
734, // "d"
879, // "f"
MIN_REDUCTION+123, // "m"
MIN_REDUCTION+123, // "x"
1068, // "g"
293, // "p"
94, // "v"
12, // "w"
MIN_REDUCTION+123, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
736, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+123, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+123, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+123, // $
MIN_REDUCTION+123, // $NT
  }
,
{ // state 312
0x80000000|815, // match move
0x80000000|604, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 313
98,362, // "c"
  }
,
{ // state 314
0x80000000|858, // match move
0x80000000|894, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 315
93,269, // "a"
94,269, // "b"
95,269, // "s"
96,269, // "t"
97,269, // "r"
98,269, // "c"
99,269, // "e"
100,269, // "o"
101,269, // "l"
102,269, // "n"
103,269, // "k"
104,269, // "y"
105,269, // "h"
106,269, // "i"
107,269, // "u"
108,269, // "d"
109,269, // "f"
110,269, // "m"
111,269, // "x"
112,269, // "g"
113,269, // "p"
114,269, // "v"
115,269, // "w"
116,269, // "z"
117,269, // "!"
118,269, // "="
119,269, // "%"
120,269, // "&"
121,269, // "|"
122,269, // "+"
123,269, // ","
124,269, // "-"
125,269, // "."
126,704, // "*"
127,762, // "/"
128,269, // ";"
129,269, // "<"
130,269, // ">"
131,269, // "("
132,269, // ")"
133,269, // "["
134,269, // "]"
135,269, // "{"
136,269, // "}"
138,269, // "'"
140,269, // '"'
143,269, // "0"
146,269, // "_"
148,269, // "\"
150,269, // {"1".."9"}
151,269, // {"#".."$" ":" "?".."@" "^" "`" "~"}
152,269, // {"A".."Z" "j" "q"}
153,269, // " "
154,269, // {9}
156,664, // multilineCommentPrintable
157,773, // eol
162,359, // multilineCommentPrintable**
163,1112, // {10}
164,248, // {13}
166,636, // multilineCommentPrintable*
  }
,
{ // state 316
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 317
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 318
0x80000000|649, // match move
0x80000000|616, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 319
0x80000000|531, // match move
0x80000000|1159, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 320
0x80000000|327, // match move
0x80000000|400, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 321
95,735, // "s"
  }
,
{ // state 322
1,790, // start
2,782, // ws*
3,306, // $$0
4,796, // token
5,89, // `boolean
6,303, // `class
7,1154, // `extends
8,1010, // `void
9,802, // `int
10,41, // `while
11,198, // `if
12,427, // `else
13,336, // `for
14,1160, // `break
15,480, // `this
16,569, // `false
17,595, // `true
18,525, // `super
19,724, // `null
20,820, // `return
21,414, // `instanceof
22,181, // `new
23,629, // `abstract
24,133, // `assert
25,1091, // `byte
26,682, // `case
27,99, // `catch
28,371, // `char
29,130, // `const
30,1055, // `continue
31,1165, // `default
32,890, // `do
33,121, // `double
34,233, // `enum
35,779, // `final
36,859, // `finally
37,766, // `float
38,551, // `goto
39,187, // `implements
40,662, // `import
41,622, // `interface
42,413, // `long
43,479, // `native
44,1128, // `package
45,709, // `private
46,788, // `protected
47,806, // `public
48,344, // `short
49,702, // `static
50,824, // `strictfp
51,995, // `switch
52,447, // `synchronized
53,177, // `throw
54,1103, // `throws
55,1082, // `transient
56,8, // `try
57,549, // `volatile
93,973, // "a"
94,1139, // "b"
95,914, // "s"
96,1059, // "t"
97,626, // "r"
98,223, // "c"
99,182, // "e"
101,1014, // "l"
102,437, // "n"
106,1006, // "i"
108,734, // "d"
109,879, // "f"
112,1068, // "g"
113,293, // "p"
114,94, // "v"
115,12, // "w"
168,1152, // token*
170,MIN_REDUCTION+1, // $
  }
,
{ // state 323
0x80000000|53, // match move
0x80000000|501, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 324
109,757, // "f"
  }
,
{ // state 325
MIN_REDUCTION+342, // (default reduction)
  }
,
{ // state 326
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+215, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+215, // $
MIN_REDUCTION+215, // $NT
  }
,
{ // state 327
171,MIN_REDUCTION+164, // $NT
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 328
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 329
0x80000000|2, // match move
0x80000000|399, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 330
0x80000000|2, // match move
0x80000000|411, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 331
171,MIN_REDUCTION+128, // $NT
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 332
101,1005, // "l"
  }
,
{ // state 333
0x80000000|2, // match move
0x80000000|722, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 334
0x80000000|142, // match move
0x80000000|318, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 335
96,786, // "t"
  }
,
{ // state 336
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 337
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 338
0x80000000|401, // match move
0x80000000|415, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 339
0x80000000|190, // match move
0x80000000|655, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 340
96,713, // "t"
  }
,
{ // state 341
0x80000000|838, // match move
0x80000000|460, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 342
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+287, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+287, // $
-1, // $NT
  }
,
{ // state 343
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+128, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+128, // $
MIN_REDUCTION+128, // $NT
  }
,
{ // state 344
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 345
0x80000000|934, // match move
0x80000000|976, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 346
0x80000000|705, // match move
0x80000000|70, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 347
118,275, // "="
  }
,
{ // state 348
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 349
97,36, // "r"
  }
,
{ // state 350
0x80000000|29, // match move
0x80000000|673, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 351
95,178, // "s"
96,799, // "t"
  }
,
{ // state 352
0x80000000|101, // match move
0x80000000|834, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 353
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 354
0x80000000|1045, // match move
0x80000000|935, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 355
97,250, // "r"
  }
,
{ // state 356
0x80000000|137, // match move
0x80000000|832, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 357
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 358
-1, // $$start
-1, // start
536, // ws*
-1, // $$0
MIN_REDUCTION+156, // token
89, // `boolean
303, // `class
1154, // `extends
1010, // `void
802, // `int
41, // `while
198, // `if
427, // `else
336, // `for
1160, // `break
480, // `this
569, // `false
595, // `true
525, // `super
724, // `null
820, // `return
414, // `instanceof
181, // `new
629, // `abstract
133, // `assert
1091, // `byte
682, // `case
99, // `catch
371, // `char
130, // `const
1055, // `continue
1165, // `default
890, // `do
121, // `double
233, // `enum
779, // `final
859, // `finally
766, // `float
551, // `goto
187, // `implements
662, // `import
622, // `interface
413, // `long
479, // `native
1128, // `package
709, // `private
788, // `protected
806, // `public
344, // `short
702, // `static
824, // `strictfp
995, // `switch
447, // `synchronized
177, // `throw
1103, // `throws
1082, // `transient
8, // `try
549, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
-1, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
973, // "a"
1139, // "b"
914, // "s"
1059, // "t"
626, // "r"
223, // "c"
182, // "e"
MIN_REDUCTION+156, // "o"
1014, // "l"
437, // "n"
MIN_REDUCTION+156, // "k"
MIN_REDUCTION+156, // "y"
MIN_REDUCTION+156, // "h"
1006, // "i"
MIN_REDUCTION+156, // "u"
734, // "d"
879, // "f"
MIN_REDUCTION+156, // "m"
MIN_REDUCTION+156, // "x"
1068, // "g"
293, // "p"
94, // "v"
12, // "w"
MIN_REDUCTION+156, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
736, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+156, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+156, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+156, // $
MIN_REDUCTION+156, // $NT
  }
,
{ // state 359
126,285, // "*"
  }
,
{ // state 360
171,MIN_REDUCTION+332, // $NT
  }
,
{ // state 361
MIN_REDUCTION+359, // (default reduction)
  }
,
{ // state 362
105,529, // "h"
  }
,
{ // state 363
0x80000000|2, // match move
0x80000000|963, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 364
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 365
0x80000000|848, // match move
0x80000000|37, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 366
171,MIN_REDUCTION+244, // $NT
  }
,
{ // state 367
0x80000000|2, // match move
0x80000000|1151, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 368
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 369
171,MIN_REDUCTION+212, // $NT
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 370
0x80000000|714, // match move
0x80000000|261, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 371
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 372
93,1170, // "a"
  }
,
{ // state 373
99,295, // "e"
  }
,
{ // state 374
101,406, // "l"
  }
,
{ // state 375
0x80000000|996, // match move
0x80000000|947, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 376
107,144, // "u"
  }
,
{ // state 377
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+176, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+176, // $
MIN_REDUCTION+176, // $NT
  }
,
{ // state 378
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 379
171,MIN_REDUCTION+142, // $NT
  }
,
{ // state 380
-1, // $$start
-1, // start
1138, // ws*
-1, // $$0
MIN_REDUCTION+246, // token
89, // `boolean
303, // `class
1154, // `extends
1010, // `void
802, // `int
41, // `while
198, // `if
427, // `else
336, // `for
1160, // `break
480, // `this
569, // `false
595, // `true
525, // `super
724, // `null
820, // `return
414, // `instanceof
181, // `new
629, // `abstract
133, // `assert
1091, // `byte
682, // `case
99, // `catch
371, // `char
130, // `const
1055, // `continue
1165, // `default
890, // `do
121, // `double
233, // `enum
779, // `final
859, // `finally
766, // `float
551, // `goto
187, // `implements
662, // `import
622, // `interface
413, // `long
479, // `native
1128, // `package
709, // `private
788, // `protected
806, // `public
344, // `short
702, // `static
824, // `strictfp
995, // `switch
447, // `synchronized
177, // `throw
1103, // `throws
1082, // `transient
8, // `try
549, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
-1, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
973, // "a"
1139, // "b"
914, // "s"
1059, // "t"
626, // "r"
223, // "c"
182, // "e"
MIN_REDUCTION+246, // "o"
1014, // "l"
437, // "n"
MIN_REDUCTION+246, // "k"
MIN_REDUCTION+246, // "y"
MIN_REDUCTION+246, // "h"
1006, // "i"
MIN_REDUCTION+246, // "u"
734, // "d"
879, // "f"
MIN_REDUCTION+246, // "m"
MIN_REDUCTION+246, // "x"
1068, // "g"
293, // "p"
94, // "v"
12, // "w"
MIN_REDUCTION+246, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
736, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+246, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+246, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+246, // $
MIN_REDUCTION+246, // $NT
  }
,
{ // state 381
0x80000000|193, // match move
0x80000000|356, // no-match move
// T-test match for "0":
143,
  }
};
}
private class Initter3{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 382
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+122, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+122, // $
MIN_REDUCTION+122, // $NT
  }
,
{ // state 383
3,643, // $$0
4,796, // token
5,89, // `boolean
6,303, // `class
7,1154, // `extends
8,1010, // `void
9,802, // `int
10,41, // `while
11,198, // `if
12,427, // `else
13,336, // `for
14,1160, // `break
15,480, // `this
16,569, // `false
17,595, // `true
18,525, // `super
19,724, // `null
20,820, // `return
21,414, // `instanceof
22,181, // `new
23,629, // `abstract
24,133, // `assert
25,1091, // `byte
26,682, // `case
27,99, // `catch
28,371, // `char
29,130, // `const
30,1055, // `continue
31,1165, // `default
32,890, // `do
33,121, // `double
34,233, // `enum
35,779, // `final
36,859, // `finally
37,766, // `float
38,551, // `goto
39,187, // `implements
40,662, // `import
41,622, // `interface
42,413, // `long
43,479, // `native
44,1128, // `package
45,709, // `private
46,788, // `protected
47,806, // `public
48,344, // `short
49,702, // `static
50,824, // `strictfp
51,995, // `switch
52,447, // `synchronized
53,177, // `throw
54,1103, // `throws
55,1082, // `transient
56,8, // `try
57,549, // `volatile
93,973, // "a"
94,1139, // "b"
95,914, // "s"
96,1059, // "t"
97,626, // "r"
98,223, // "c"
99,182, // "e"
101,1014, // "l"
102,437, // "n"
106,1006, // "i"
108,734, // "d"
109,879, // "f"
112,1068, // "g"
113,293, // "p"
114,94, // "v"
115,12, // "w"
168,1152, // token*
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 384
-1, // $$start
-1, // start
11, // ws*
-1, // $$0
MIN_REDUCTION+165, // token
89, // `boolean
303, // `class
1154, // `extends
1010, // `void
802, // `int
41, // `while
198, // `if
427, // `else
336, // `for
1160, // `break
480, // `this
569, // `false
595, // `true
525, // `super
724, // `null
820, // `return
414, // `instanceof
181, // `new
629, // `abstract
133, // `assert
1091, // `byte
682, // `case
99, // `catch
371, // `char
130, // `const
1055, // `continue
1165, // `default
890, // `do
121, // `double
233, // `enum
779, // `final
859, // `finally
766, // `float
551, // `goto
187, // `implements
662, // `import
622, // `interface
413, // `long
479, // `native
1128, // `package
709, // `private
788, // `protected
806, // `public
344, // `short
702, // `static
824, // `strictfp
995, // `switch
447, // `synchronized
177, // `throw
1103, // `throws
1082, // `transient
8, // `try
549, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
-1, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
973, // "a"
1139, // "b"
914, // "s"
1059, // "t"
626, // "r"
223, // "c"
182, // "e"
MIN_REDUCTION+165, // "o"
1014, // "l"
437, // "n"
MIN_REDUCTION+165, // "k"
MIN_REDUCTION+165, // "y"
MIN_REDUCTION+165, // "h"
1006, // "i"
MIN_REDUCTION+165, // "u"
734, // "d"
879, // "f"
MIN_REDUCTION+165, // "m"
MIN_REDUCTION+165, // "x"
1068, // "g"
293, // "p"
94, // "v"
12, // "w"
MIN_REDUCTION+165, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
736, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+165, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+165, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+165, // $
MIN_REDUCTION+165, // $NT
  }
,
{ // state 385
171,MIN_REDUCTION+98, // $NT
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 386
171,MIN_REDUCTION+335, // $NT
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 387
171,MIN_REDUCTION+346, // $NT
MIN_REDUCTION+346, // (default reduction)
  }
,
{ // state 388
0x80000000|2, // match move
0x80000000|573, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 389
0x80000000|544, // match move
0x80000000|62, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 390
0x80000000|874, // match move
0x80000000|238, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 391
0x80000000|2, // match move
0x80000000|311, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 392
-1, // $$start
-1, // start
298, // ws*
-1, // $$0
MIN_REDUCTION+280, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
-1, // `=
-1, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
MIN_REDUCTION+280, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+280, // $
-1, // $NT
  }
,
{ // state 393
171,MIN_REDUCTION+184, // $NT
  }
,
{ // state 394
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 395
0x80000000|559, // match move
0x80000000|937, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 396
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+224, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+224, // $
MIN_REDUCTION+224, // $NT
  }
,
{ // state 397
0x80000000|700, // match move
0x80000000|3, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 398
100,818, // "o"
  }
,
{ // state 399
-1, // $$start
-1, // start
930, // ws*
-1, // $$0
MIN_REDUCTION+177, // token
89, // `boolean
303, // `class
1154, // `extends
1010, // `void
802, // `int
41, // `while
198, // `if
427, // `else
336, // `for
1160, // `break
480, // `this
569, // `false
595, // `true
525, // `super
724, // `null
820, // `return
414, // `instanceof
181, // `new
629, // `abstract
133, // `assert
1091, // `byte
682, // `case
99, // `catch
371, // `char
130, // `const
1055, // `continue
1165, // `default
890, // `do
121, // `double
233, // `enum
779, // `final
859, // `finally
766, // `float
551, // `goto
187, // `implements
662, // `import
622, // `interface
413, // `long
479, // `native
1128, // `package
709, // `private
788, // `protected
806, // `public
344, // `short
702, // `static
824, // `strictfp
995, // `switch
447, // `synchronized
177, // `throw
1103, // `throws
1082, // `transient
8, // `try
549, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
-1, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
973, // "a"
1139, // "b"
914, // "s"
1059, // "t"
626, // "r"
223, // "c"
182, // "e"
MIN_REDUCTION+177, // "o"
1014, // "l"
437, // "n"
MIN_REDUCTION+177, // "k"
MIN_REDUCTION+177, // "y"
MIN_REDUCTION+177, // "h"
1006, // "i"
MIN_REDUCTION+177, // "u"
734, // "d"
879, // "f"
MIN_REDUCTION+177, // "m"
MIN_REDUCTION+177, // "x"
1068, // "g"
293, // "p"
94, // "v"
12, // "w"
MIN_REDUCTION+177, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
736, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+177, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+177, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+177, // $
MIN_REDUCTION+177, // $NT
  }
,
{ // state 400
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+164, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+164, // $
MIN_REDUCTION+164, // $NT
  }
,
{ // state 401
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 402
0x80000000|291, // match move
0x80000000|235, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 403
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 404
171,MIN_REDUCTION+200, // $NT
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 405
0x80000000|706, // match move
0x80000000|402, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 406
106,774, // "i"
  }
,
{ // state 407
MIN_REDUCTION+353, // (default reduction)
  }
,
{ // state 408
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+143, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+143, // $
MIN_REDUCTION+143, // $NT
  }
,
{ // state 409
171,MIN_REDUCTION+205, // $NT
  }
,
{ // state 410
171,MIN_REDUCTION+163, // $NT
  }
,
{ // state 411
-1, // $$start
-1, // start
61, // ws*
-1, // $$0
MIN_REDUCTION+144, // token
89, // `boolean
303, // `class
1154, // `extends
1010, // `void
802, // `int
41, // `while
198, // `if
427, // `else
336, // `for
1160, // `break
480, // `this
569, // `false
595, // `true
525, // `super
724, // `null
820, // `return
414, // `instanceof
181, // `new
629, // `abstract
133, // `assert
1091, // `byte
682, // `case
99, // `catch
371, // `char
130, // `const
1055, // `continue
1165, // `default
890, // `do
121, // `double
233, // `enum
779, // `final
859, // `finally
766, // `float
551, // `goto
187, // `implements
662, // `import
622, // `interface
413, // `long
479, // `native
1128, // `package
709, // `private
788, // `protected
806, // `public
344, // `short
702, // `static
824, // `strictfp
995, // `switch
447, // `synchronized
177, // `throw
1103, // `throws
1082, // `transient
8, // `try
549, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
-1, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
973, // "a"
1139, // "b"
914, // "s"
1059, // "t"
626, // "r"
223, // "c"
182, // "e"
MIN_REDUCTION+144, // "o"
1014, // "l"
437, // "n"
MIN_REDUCTION+144, // "k"
MIN_REDUCTION+144, // "y"
MIN_REDUCTION+144, // "h"
1006, // "i"
MIN_REDUCTION+144, // "u"
734, // "d"
879, // "f"
MIN_REDUCTION+144, // "m"
MIN_REDUCTION+144, // "x"
1068, // "g"
293, // "p"
94, // "v"
12, // "w"
MIN_REDUCTION+144, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
736, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+144, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+144, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+144, // $
MIN_REDUCTION+144, // $NT
  }
,
{ // state 412
90,MIN_REDUCTION+331, // idChar**
146,MIN_REDUCTION+331, // "_"
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 413
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 414
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 415
0x80000000|849, // match move
0x80000000|693, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 416
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 417
-1, // $$start
-1, // start
1131, // ws*
-1, // $$0
MIN_REDUCTION+306, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+306, // $
-1, // $NT
  }
,
{ // state 418
MIN_REDUCTION+309, // (default reduction)
  }
,
{ // state 419
171,MIN_REDUCTION+199, // $NT
  }
,
{ // state 420
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 421
96,436, // "t"
  }
,
{ // state 422
99,878, // "e"
  }
,
{ // state 423
-1, // $$start
-1, // start
827, // ws*
-1, // $$0
MIN_REDUCTION+228, // token
89, // `boolean
303, // `class
1154, // `extends
1010, // `void
802, // `int
41, // `while
198, // `if
427, // `else
336, // `for
1160, // `break
480, // `this
569, // `false
595, // `true
525, // `super
724, // `null
820, // `return
414, // `instanceof
181, // `new
629, // `abstract
133, // `assert
1091, // `byte
682, // `case
99, // `catch
371, // `char
130, // `const
1055, // `continue
1165, // `default
890, // `do
121, // `double
233, // `enum
779, // `final
859, // `finally
766, // `float
551, // `goto
187, // `implements
662, // `import
622, // `interface
413, // `long
479, // `native
1128, // `package
709, // `private
788, // `protected
806, // `public
344, // `short
702, // `static
824, // `strictfp
995, // `switch
447, // `synchronized
177, // `throw
1103, // `throws
1082, // `transient
8, // `try
549, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
-1, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
973, // "a"
1139, // "b"
87, // "s"
1059, // "t"
626, // "r"
223, // "c"
182, // "e"
MIN_REDUCTION+228, // "o"
1014, // "l"
437, // "n"
MIN_REDUCTION+228, // "k"
MIN_REDUCTION+228, // "y"
MIN_REDUCTION+228, // "h"
1006, // "i"
MIN_REDUCTION+228, // "u"
734, // "d"
879, // "f"
MIN_REDUCTION+228, // "m"
MIN_REDUCTION+228, // "x"
1068, // "g"
293, // "p"
94, // "v"
12, // "w"
MIN_REDUCTION+228, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
736, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+228, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+228, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+228, // $
MIN_REDUCTION+228, // $NT
  }
,
{ // state 424
-1, // $$start
790, // start
782, // ws*
306, // $$0
796, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
1152, // token*
194, // digit+
MIN_REDUCTION+1, // $
-1, // $NT
  }
,
{ // state 425
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+289, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+289, // $
-1, // $NT
  }
,
{ // state 426
2,601, // ws*
157,550, // eol
158,1016, // ws
160,654, // comment
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 427
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 428
97,543, // "r"
  }
,
{ // state 429
0x80000000|2, // match move
0x80000000|486, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 430
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 431
171,MIN_REDUCTION+149, // $NT
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 432
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 433
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 434
0x80000000|572, // match move
0x80000000|186, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 435
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 436
109,77, // "f"
  }
,
{ // state 437
93,989, // "a"
99,216, // "e"
107,464, // "u"
  }
,
{ // state 438
2,571, // ws*
157,550, // eol
158,1016, // ws
160,654, // comment
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 439
MIN_REDUCTION+342, // (default reduction)
  }
,
{ // state 440
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 441
-1, // $$start
-1, // start
245, // ws*
-1, // $$0
MIN_REDUCTION+210, // token
89, // `boolean
303, // `class
1154, // `extends
1010, // `void
802, // `int
41, // `while
198, // `if
427, // `else
336, // `for
1160, // `break
480, // `this
569, // `false
595, // `true
525, // `super
724, // `null
820, // `return
414, // `instanceof
181, // `new
629, // `abstract
133, // `assert
1091, // `byte
682, // `case
99, // `catch
371, // `char
130, // `const
1055, // `continue
1165, // `default
890, // `do
121, // `double
233, // `enum
779, // `final
859, // `finally
766, // `float
551, // `goto
187, // `implements
662, // `import
622, // `interface
413, // `long
479, // `native
1128, // `package
709, // `private
788, // `protected
806, // `public
344, // `short
702, // `static
824, // `strictfp
995, // `switch
447, // `synchronized
177, // `throw
1103, // `throws
1082, // `transient
8, // `try
549, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
-1, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
973, // "a"
1139, // "b"
914, // "s"
1059, // "t"
626, // "r"
223, // "c"
182, // "e"
MIN_REDUCTION+210, // "o"
1014, // "l"
437, // "n"
MIN_REDUCTION+210, // "k"
MIN_REDUCTION+210, // "y"
MIN_REDUCTION+210, // "h"
1006, // "i"
MIN_REDUCTION+210, // "u"
734, // "d"
879, // "f"
MIN_REDUCTION+210, // "m"
MIN_REDUCTION+210, // "x"
1068, // "g"
293, // "p"
94, // "v"
12, // "w"
MIN_REDUCTION+210, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
736, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+210, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+210, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+210, // $
MIN_REDUCTION+210, // $NT
  }
,
{ // state 442
0x80000000|2, // match move
0x80000000|928, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 443
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 444
0x80000000|674, // match move
0x80000000|960, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 445
-1, // $$start
-1, // start
810, // ws*
-1, // $$0
MIN_REDUCTION+296, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+296, // $
-1, // $NT
  }
,
{ // state 446
0x80000000|593, // match move
0x80000000|896, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 447
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 448
0x80000000|2, // match move
0x80000000|95, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 449
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 450
0x80000000|1156, // match move
0x80000000|131, // no-match move
0x80000000|566, // NT-test-match state for digit
  }
,
{ // state 451
0x80000000|2, // match move
0x80000000|634, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 452
100,15, // "o"
  }
,
{ // state 453
102,376, // "n"
  }
,
{ // state 454
171,MIN_REDUCTION+137, // $NT
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 455
126,671, // "*"
  }
,
{ // state 456
MIN_REDUCTION+340, // (default reduction)
  }
,
{ // state 457
103,105, // "k"
  }
,
{ // state 458
-1, // $$start
-1, // start
771, // ws*
-1, // $$0
MIN_REDUCTION+174, // token
89, // `boolean
303, // `class
1154, // `extends
1010, // `void
802, // `int
41, // `while
198, // `if
427, // `else
336, // `for
1160, // `break
480, // `this
569, // `false
595, // `true
525, // `super
724, // `null
820, // `return
414, // `instanceof
181, // `new
629, // `abstract
133, // `assert
1091, // `byte
682, // `case
99, // `catch
371, // `char
130, // `const
1055, // `continue
1165, // `default
890, // `do
121, // `double
233, // `enum
779, // `final
859, // `finally
766, // `float
551, // `goto
187, // `implements
662, // `import
622, // `interface
413, // `long
479, // `native
1128, // `package
709, // `private
788, // `protected
806, // `public
344, // `short
702, // `static
824, // `strictfp
995, // `switch
447, // `synchronized
177, // `throw
1103, // `throws
1082, // `transient
8, // `try
549, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
-1, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
973, // "a"
1139, // "b"
914, // "s"
1059, // "t"
626, // "r"
223, // "c"
814, // "e"
MIN_REDUCTION+174, // "o"
1014, // "l"
437, // "n"
MIN_REDUCTION+174, // "k"
MIN_REDUCTION+174, // "y"
MIN_REDUCTION+174, // "h"
1006, // "i"
MIN_REDUCTION+174, // "u"
734, // "d"
879, // "f"
MIN_REDUCTION+174, // "m"
MIN_REDUCTION+174, // "x"
1068, // "g"
293, // "p"
94, // "v"
12, // "w"
MIN_REDUCTION+174, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
736, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+174, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+174, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+174, // $
MIN_REDUCTION+174, // $NT
  }
,
{ // state 459
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 460
0x80000000|933, // match move
0x80000000|473, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 461
171,MIN_REDUCTION+127, // $NT
  }
,
{ // state 462
MIN_REDUCTION+341, // (default reduction)
  }
,
{ // state 463
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+285, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+285, // $
-1, // $NT
  }
,
{ // state 464
101,991, // "l"
  }
,
{ // state 465
MIN_REDUCTION+357, // (default reduction)
  }
,
{ // state 466
0x80000000|497, // match move
0x80000000|90, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 467
MIN_REDUCTION+340, // (default reduction)
  }
,
{ // state 468
171,MIN_REDUCTION+131, // $NT
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 469
2,1100, // ws*
157,550, // eol
158,1016, // ws
160,654, // comment
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 470
0x80000000|650, // match move
0x80000000|603, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 471
99,581, // "e"
  }
,
{ // state 472
0x80000000|2, // match move
0x80000000|1094, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 473
-1, // $$start
-1, // start
334, // ws*
-1, // $$0
MIN_REDUCTION+262, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
-1, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
-1, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
MIN_REDUCTION+262, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+262, // $
-1, // $NT
  }
,
{ // state 474
0x80000000|364, // match move
0x80000000|140, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 475
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 476
0x80000000|853, // match move
0x80000000|708, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 477
0x80000000|337, // match move
0x80000000|425, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 478
0x80000000|1062, // match move
0x80000000|57, // no-match move
// T-test match for "-":
124,
  }
,
{ // state 479
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 480
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 481
171,MIN_REDUCTION+193, // $NT
  }
,
{ // state 482
-1, // $$start
-1, // start
619, // ws*
-1, // $$0
MIN_REDUCTION+135, // token
89, // `boolean
303, // `class
1154, // `extends
1010, // `void
802, // `int
41, // `while
198, // `if
427, // `else
336, // `for
1160, // `break
480, // `this
569, // `false
595, // `true
525, // `super
724, // `null
820, // `return
414, // `instanceof
181, // `new
629, // `abstract
133, // `assert
1091, // `byte
682, // `case
99, // `catch
371, // `char
130, // `const
1055, // `continue
1165, // `default
890, // `do
121, // `double
233, // `enum
779, // `final
859, // `finally
766, // `float
551, // `goto
187, // `implements
662, // `import
622, // `interface
413, // `long
479, // `native
1128, // `package
709, // `private
788, // `protected
806, // `public
344, // `short
702, // `static
824, // `strictfp
995, // `switch
447, // `synchronized
177, // `throw
1103, // `throws
1082, // `transient
8, // `try
549, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
-1, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
973, // "a"
1139, // "b"
914, // "s"
1059, // "t"
626, // "r"
223, // "c"
182, // "e"
MIN_REDUCTION+135, // "o"
1014, // "l"
437, // "n"
MIN_REDUCTION+135, // "k"
MIN_REDUCTION+135, // "y"
MIN_REDUCTION+135, // "h"
1006, // "i"
MIN_REDUCTION+135, // "u"
734, // "d"
879, // "f"
MIN_REDUCTION+135, // "m"
MIN_REDUCTION+135, // "x"
1068, // "g"
293, // "p"
94, // "v"
12, // "w"
MIN_REDUCTION+135, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
736, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+135, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+135, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+135, // $
MIN_REDUCTION+135, // $NT
  }
,
{ // state 483
96,442, // "t"
  }
,
{ // state 484
0x80000000|200, // match move
0x80000000|31, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 485
0x80000000|805, // match move
0x80000000|743, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 486
-1, // $$start
-1, // start
1023, // ws*
-1, // $$0
MIN_REDUCTION+219, // token
89, // `boolean
303, // `class
1154, // `extends
1010, // `void
802, // `int
41, // `while
198, // `if
427, // `else
336, // `for
1160, // `break
480, // `this
569, // `false
595, // `true
525, // `super
724, // `null
820, // `return
414, // `instanceof
181, // `new
629, // `abstract
133, // `assert
1091, // `byte
682, // `case
99, // `catch
371, // `char
130, // `const
1055, // `continue
1165, // `default
890, // `do
121, // `double
233, // `enum
779, // `final
859, // `finally
766, // `float
551, // `goto
187, // `implements
662, // `import
622, // `interface
413, // `long
479, // `native
1128, // `package
709, // `private
788, // `protected
806, // `public
344, // `short
702, // `static
824, // `strictfp
995, // `switch
447, // `synchronized
177, // `throw
1103, // `throws
1082, // `transient
8, // `try
549, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
-1, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
973, // "a"
1139, // "b"
914, // "s"
1059, // "t"
626, // "r"
223, // "c"
182, // "e"
MIN_REDUCTION+219, // "o"
1014, // "l"
437, // "n"
MIN_REDUCTION+219, // "k"
MIN_REDUCTION+219, // "y"
MIN_REDUCTION+219, // "h"
1006, // "i"
MIN_REDUCTION+219, // "u"
734, // "d"
879, // "f"
MIN_REDUCTION+219, // "m"
MIN_REDUCTION+219, // "x"
1068, // "g"
293, // "p"
94, // "v"
12, // "w"
MIN_REDUCTION+219, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
736, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+219, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+219, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+219, // $
MIN_REDUCTION+219, // $NT
  }
,
{ // state 487
0x80000000|2, // match move
0x80000000|746, // no-match move
// T-test match for {"*" "/"}:
126,
127,
  }
,
{ // state 488
2,1100, // ws*
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 489
94,374, // "b"
  }
,
{ // state 490
171,MIN_REDUCTION+100, // $NT
  }
,
{ // state 491
95,170, // "s"
  }
,
{ // state 492
0x80000000|965, // match move
0x80000000|477, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 493
3,643, // $$0
4,796, // token
5,89, // `boolean
6,303, // `class
7,1154, // `extends
8,1010, // `void
9,802, // `int
10,41, // `while
11,198, // `if
12,427, // `else
13,336, // `for
14,1160, // `break
15,480, // `this
16,569, // `false
17,595, // `true
18,525, // `super
19,724, // `null
20,820, // `return
21,414, // `instanceof
22,181, // `new
23,629, // `abstract
24,133, // `assert
25,1091, // `byte
26,682, // `case
27,99, // `catch
28,371, // `char
29,130, // `const
30,1055, // `continue
31,1165, // `default
32,890, // `do
33,121, // `double
34,233, // `enum
35,779, // `final
36,859, // `finally
37,766, // `float
38,551, // `goto
39,187, // `implements
40,662, // `import
41,622, // `interface
42,413, // `long
43,479, // `native
44,1128, // `package
45,709, // `private
46,788, // `protected
47,806, // `public
48,344, // `short
49,702, // `static
50,824, // `strictfp
51,995, // `switch
52,447, // `synchronized
53,177, // `throw
54,1103, // `throws
55,1082, // `transient
56,8, // `try
57,549, // `volatile
168,1152, // token*
  }
,
{ // state 494
93,764, // "a"
  }
,
{ // state 495
0x80000000|45, // match move
0x80000000|652, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 496
-1, // $$start
-1, // start
1192, // ws*
-1, // $$0
MIN_REDUCTION+225, // token
89, // `boolean
303, // `class
1154, // `extends
1010, // `void
802, // `int
41, // `while
198, // `if
427, // `else
336, // `for
1160, // `break
480, // `this
569, // `false
595, // `true
525, // `super
724, // `null
820, // `return
414, // `instanceof
181, // `new
629, // `abstract
133, // `assert
1091, // `byte
682, // `case
99, // `catch
371, // `char
130, // `const
1055, // `continue
1165, // `default
890, // `do
121, // `double
233, // `enum
779, // `final
859, // `finally
766, // `float
551, // `goto
187, // `implements
662, // `import
622, // `interface
413, // `long
479, // `native
1128, // `package
709, // `private
788, // `protected
806, // `public
344, // `short
702, // `static
824, // `strictfp
995, // `switch
447, // `synchronized
177, // `throw
1103, // `throws
1082, // `transient
8, // `try
549, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
-1, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
973, // "a"
1139, // "b"
914, // "s"
1059, // "t"
626, // "r"
223, // "c"
182, // "e"
MIN_REDUCTION+225, // "o"
1014, // "l"
437, // "n"
MIN_REDUCTION+225, // "k"
MIN_REDUCTION+225, // "y"
MIN_REDUCTION+225, // "h"
1006, // "i"
MIN_REDUCTION+225, // "u"
734, // "d"
879, // "f"
MIN_REDUCTION+225, // "m"
MIN_REDUCTION+225, // "x"
1068, // "g"
293, // "p"
94, // "v"
12, // "w"
MIN_REDUCTION+225, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
736, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+225, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+225, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+225, // $
MIN_REDUCTION+225, // $NT
  }
,
{ // state 497
2,6, // ws*
157,550, // eol
158,1016, // ws
160,654, // comment
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 498
5,490, // `boolean
6,259, // `class
7,379, // `extends
8,366, // `void
9,727, // `int
10,1069, // `while
11,410, // `if
12,1142, // `else
13,69, // `for
14,954, // `break
15,143, // `this
16,618, // `false
17,86, // `true
18,953, // `super
19,920, // `null
20,409, // `return
21,1174, // `instanceof
22,205, // `new
23,637, // `abstract
24,23, // `assert
25,71, // `byte
26,687, // `case
27,1033, // `catch
28,508, // `char
29,725, // `const
30,707, // `continue
31,461, // `default
32,241, // `do
33,1120, // `double
34,940, // `enum
35,122, // `final
36,1075, // `finally
37,584, // `float
38,961, // `goto
39,694, // `implements
40,887, // `import
41,591, // `interface
42,146, // `long
43,393, // `native
44,481, // `package
45,136, // `private
46,419, // `protected
47,602, // `public
48,1104, // `short
49,527, // `static
50,1161, // `strictfp
51,916, // `switch
52,236, // `synchronized
53,983, // `throw
54,957, // `throws
55,260, // `transient
56,176, // `try
57,825, // `volatile
93,973, // "a"
94,1139, // "b"
95,914, // "s"
96,1059, // "t"
97,626, // "r"
98,223, // "c"
99,182, // "e"
101,1014, // "l"
102,437, // "n"
106,1006, // "i"
108,734, // "d"
109,879, // "f"
112,1068, // "g"
113,293, // "p"
114,94, // "v"
115,12, // "w"
  }
,
{ // state 499
171,MIN_REDUCTION+188, // $NT
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 500
0x80000000|1101, // match move
0x80000000|807, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 501
0x80000000|123, // match move
0x80000000|1147, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 502
99,372, // "e"
  }
,
{ // state 503
99,763, // "e"
  }
,
{ // state 504
100,567, // "o"
106,844, // "i"
  }
,
{ // state 505
-1, // $$start
-1, // start
510, // ws*
-1, // $$0
MIN_REDUCTION+207, // token
89, // `boolean
303, // `class
1154, // `extends
1010, // `void
802, // `int
41, // `while
198, // `if
427, // `else
336, // `for
1160, // `break
480, // `this
569, // `false
595, // `true
525, // `super
724, // `null
820, // `return
414, // `instanceof
181, // `new
629, // `abstract
133, // `assert
1091, // `byte
682, // `case
99, // `catch
371, // `char
130, // `const
1055, // `continue
1165, // `default
890, // `do
121, // `double
233, // `enum
779, // `final
859, // `finally
766, // `float
551, // `goto
187, // `implements
662, // `import
622, // `interface
413, // `long
479, // `native
1128, // `package
709, // `private
788, // `protected
806, // `public
344, // `short
702, // `static
824, // `strictfp
995, // `switch
447, // `synchronized
177, // `throw
1103, // `throws
1082, // `transient
8, // `try
549, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
-1, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
973, // "a"
1139, // "b"
914, // "s"
1059, // "t"
626, // "r"
223, // "c"
182, // "e"
MIN_REDUCTION+207, // "o"
1014, // "l"
437, // "n"
MIN_REDUCTION+207, // "k"
MIN_REDUCTION+207, // "y"
MIN_REDUCTION+207, // "h"
1006, // "i"
MIN_REDUCTION+207, // "u"
734, // "d"
879, // "f"
MIN_REDUCTION+207, // "m"
MIN_REDUCTION+207, // "x"
1068, // "g"
293, // "p"
94, // "v"
12, // "w"
MIN_REDUCTION+207, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
736, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+207, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+207, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+207, // $
MIN_REDUCTION+207, // $NT
  }
,
{ // state 506
120,1083, // "&"
  }
,
{ // state 507
0x80000000|898, // match move
0x80000000|718, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 508
171,MIN_REDUCTION+115, // $NT
  }
,
{ // state 509
0x80000000|839, // match move
0x80000000|768, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 510
0x80000000|348, // match move
0x80000000|59, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 511
-1, // $$start
-1, // start
666, // ws*
-1, // $$0
MIN_REDUCTION+195, // token
89, // `boolean
303, // `class
1154, // `extends
1010, // `void
802, // `int
41, // `while
198, // `if
427, // `else
336, // `for
1160, // `break
480, // `this
569, // `false
595, // `true
525, // `super
724, // `null
820, // `return
414, // `instanceof
181, // `new
629, // `abstract
133, // `assert
1091, // `byte
682, // `case
99, // `catch
371, // `char
130, // `const
1055, // `continue
1165, // `default
890, // `do
121, // `double
233, // `enum
779, // `final
859, // `finally
766, // `float
551, // `goto
187, // `implements
662, // `import
622, // `interface
413, // `long
479, // `native
1128, // `package
709, // `private
788, // `protected
806, // `public
344, // `short
702, // `static
824, // `strictfp
995, // `switch
447, // `synchronized
177, // `throw
1103, // `throws
1082, // `transient
8, // `try
549, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
-1, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
973, // "a"
1139, // "b"
914, // "s"
1059, // "t"
626, // "r"
223, // "c"
182, // "e"
MIN_REDUCTION+195, // "o"
1014, // "l"
437, // "n"
MIN_REDUCTION+195, // "k"
MIN_REDUCTION+195, // "y"
MIN_REDUCTION+195, // "h"
1006, // "i"
MIN_REDUCTION+195, // "u"
734, // "d"
879, // "f"
MIN_REDUCTION+195, // "m"
MIN_REDUCTION+195, // "x"
1068, // "g"
293, // "p"
94, // "v"
12, // "w"
MIN_REDUCTION+195, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
736, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+195, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+195, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+195, // $
MIN_REDUCTION+195, // $NT
  }
,
{ // state 512
93,831, // "a"
  }
,
{ // state 513
-1, // $$start
-1, // start
696, // ws*
-1, // $$0
MIN_REDUCTION+89, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
368, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+89, // $
-1, // $NT
  }
,
{ // state 514
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 515
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 516
-1, // $$start
-1, // start
270, // ws*
-1, // $$0
MIN_REDUCTION+114, // token
89, // `boolean
303, // `class
1154, // `extends
1010, // `void
802, // `int
41, // `while
198, // `if
427, // `else
336, // `for
1160, // `break
480, // `this
569, // `false
595, // `true
525, // `super
724, // `null
820, // `return
414, // `instanceof
181, // `new
629, // `abstract
133, // `assert
1091, // `byte
682, // `case
99, // `catch
371, // `char
130, // `const
1055, // `continue
1165, // `default
890, // `do
121, // `double
233, // `enum
779, // `final
859, // `finally
766, // `float
551, // `goto
187, // `implements
662, // `import
622, // `interface
413, // `long
479, // `native
1128, // `package
709, // `private
788, // `protected
806, // `public
344, // `short
702, // `static
824, // `strictfp
995, // `switch
447, // `synchronized
177, // `throw
1103, // `throws
1082, // `transient
8, // `try
549, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
-1, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
973, // "a"
1139, // "b"
914, // "s"
1059, // "t"
626, // "r"
223, // "c"
182, // "e"
MIN_REDUCTION+114, // "o"
1014, // "l"
437, // "n"
MIN_REDUCTION+114, // "k"
MIN_REDUCTION+114, // "y"
MIN_REDUCTION+114, // "h"
1006, // "i"
MIN_REDUCTION+114, // "u"
734, // "d"
879, // "f"
MIN_REDUCTION+114, // "m"
MIN_REDUCTION+114, // "x"
1068, // "g"
293, // "p"
94, // "v"
12, // "w"
MIN_REDUCTION+114, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
736, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+114, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+114, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+114, // $
MIN_REDUCTION+114, // $NT
  }
,
{ // state 517
MIN_REDUCTION+355, // (default reduction)
  }
,
{ // state 518
138,1183, // "'"
  }
,
{ // state 519
115,689, // "w"
  }
,
{ // state 520
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+170, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+170, // $
MIN_REDUCTION+170, // $NT
  }
};
}
private class Initter4{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 521
96,448, // "t"
  }
,
{ // state 522
-1, // $$start
-1, // start
978, // ws*
-1, // $$0
MIN_REDUCTION+102, // token
89, // `boolean
303, // `class
1154, // `extends
1010, // `void
802, // `int
41, // `while
198, // `if
427, // `else
336, // `for
1160, // `break
480, // `this
569, // `false
595, // `true
525, // `super
724, // `null
820, // `return
414, // `instanceof
181, // `new
629, // `abstract
133, // `assert
1091, // `byte
682, // `case
99, // `catch
371, // `char
130, // `const
1055, // `continue
1165, // `default
890, // `do
121, // `double
233, // `enum
779, // `final
859, // `finally
766, // `float
551, // `goto
187, // `implements
662, // `import
622, // `interface
413, // `long
479, // `native
1128, // `package
709, // `private
788, // `protected
806, // `public
344, // `short
702, // `static
824, // `strictfp
995, // `switch
447, // `synchronized
177, // `throw
1103, // `throws
1082, // `transient
8, // `try
549, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
-1, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
973, // "a"
1139, // "b"
914, // "s"
1059, // "t"
626, // "r"
223, // "c"
182, // "e"
MIN_REDUCTION+102, // "o"
1014, // "l"
437, // "n"
MIN_REDUCTION+102, // "k"
MIN_REDUCTION+102, // "y"
MIN_REDUCTION+102, // "h"
1006, // "i"
MIN_REDUCTION+102, // "u"
734, // "d"
879, // "f"
MIN_REDUCTION+102, // "m"
MIN_REDUCTION+102, // "x"
1068, // "g"
293, // "p"
94, // "v"
12, // "w"
MIN_REDUCTION+102, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
736, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+102, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+102, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+102, // $
MIN_REDUCTION+102, // $NT
  }
,
{ // state 523
2,298, // ws*
157,550, // eol
158,1016, // ws
160,654, // comment
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 524
163,1067, // {10}
  }
,
{ // state 525
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 526
0x80000000|2, // match move
0x80000000|608, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 527
171,MIN_REDUCTION+211, // $NT
  }
,
{ // state 528
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 529
97,883, // "r"
  }
,
{ // state 530
126,10, // "*"
127,943, // "/"
  }
,
{ // state 531
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 532
0x80000000|430, // match move
0x80000000|621, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 533
108,578, // "d"
  }
,
{ // state 534
0x80000000|970, // match move
0x80000000|224, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 535
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 536
0x80000000|239, // match move
0x80000000|926, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 537
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 538
2,563, // ws*
157,550, // eol
158,1016, // ws
160,654, // comment
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 539
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 540
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+303, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+303, // $
-1, // $NT
  }
,
{ // state 541
MIN_REDUCTION+329, // (default reduction)
  }
,
{ // state 542
95,903, // "s"
  }
,
{ // state 543
96,871, // "t"
  }
,
{ // state 544
171,MIN_REDUCTION+146, // $NT
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 545
0x80000000|1066, // match move
0x80000000|922, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 546
MIN_REDUCTION+330, // (default reduction)
  }
,
{ // state 547
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 548
96,167, // "t"
  }
,
{ // state 549
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 550
171,MIN_REDUCTION+339, // $NT
MIN_REDUCTION+339, // (default reduction)
  }
,
{ // state 551
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 552
0x80000000|111, // match move
0x80000000|119, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 553
98,979, // "c"
  }
,
{ // state 554
MIN_REDUCTION+355, // (default reduction)
  }
,
{ // state 555
0x80000000|816, // match move
0x80000000|1002, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 556
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 557
MIN_REDUCTION+362, // (default reduction)
  }
,
{ // state 558
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 559
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 560
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 561
96,1133, // "t"
  }
,
{ // state 562
0x80000000|2, // match move
0x80000000|522, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 563
0x80000000|659, // match move
0x80000000|174, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 564
157,797, // eol
161,1073, // printable**
163,1146, // {10}
164,733, // {13}
167,166, // printable*
  }
,
{ // state 565
93,607, // "a"
94,607, // "b"
95,607, // "s"
96,607, // "t"
97,607, // "r"
98,607, // "c"
99,607, // "e"
100,607, // "o"
101,607, // "l"
102,607, // "n"
103,607, // "k"
104,607, // "y"
105,607, // "h"
106,607, // "i"
107,607, // "u"
108,607, // "d"
109,607, // "f"
110,607, // "m"
111,607, // "x"
112,607, // "g"
113,607, // "p"
114,607, // "v"
115,607, // "w"
116,607, // "z"
117,607, // "!"
118,607, // "="
119,607, // "%"
120,607, // "&"
121,607, // "|"
122,607, // "+"
123,607, // ","
124,607, // "-"
125,607, // "."
126,607, // "*"
127,607, // "/"
128,607, // ";"
129,607, // "<"
130,607, // ">"
131,607, // "("
132,607, // ")"
133,607, // "["
134,607, // "]"
135,607, // "{"
136,607, // "}"
138,607, // "'"
140,1024, // '"'
142,864, // $$2
143,607, // "0"
146,607, // "_"
147,847, // escapeSequence
148,867, // "\"
150,607, // {"1".."9"}
151,607, // {"#".."$" ":" "?".."@" "^" "`" "~"}
152,607, // {"A".."Z" "j" "q"}
153,607, // " "
155,1196, // stringPrintable
  }
,
{ // state 566
143,360, // "0"
150,360, // {"1".."9"}
  }
,
{ // state 567
96,471, // "t"
  }
,
{ // state 568
0x80000000|2, // match move
0x80000000|47, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 569
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 570
-1, // $$start
-1, // start
661, // ws*
-1, // $$0
MIN_REDUCTION+231, // token
89, // `boolean
303, // `class
1154, // `extends
1010, // `void
802, // `int
41, // `while
198, // `if
427, // `else
336, // `for
1160, // `break
480, // `this
569, // `false
595, // `true
525, // `super
724, // `null
820, // `return
414, // `instanceof
181, // `new
629, // `abstract
133, // `assert
1091, // `byte
682, // `case
99, // `catch
371, // `char
130, // `const
1055, // `continue
1165, // `default
890, // `do
121, // `double
233, // `enum
779, // `final
859, // `finally
766, // `float
551, // `goto
187, // `implements
662, // `import
622, // `interface
413, // `long
479, // `native
1128, // `package
709, // `private
788, // `protected
806, // `public
344, // `short
702, // `static
824, // `strictfp
995, // `switch
447, // `synchronized
177, // `throw
1103, // `throws
1082, // `transient
8, // `try
549, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
-1, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
973, // "a"
1139, // "b"
914, // "s"
1059, // "t"
626, // "r"
223, // "c"
182, // "e"
MIN_REDUCTION+231, // "o"
1014, // "l"
437, // "n"
MIN_REDUCTION+231, // "k"
MIN_REDUCTION+231, // "y"
MIN_REDUCTION+231, // "h"
1006, // "i"
MIN_REDUCTION+231, // "u"
734, // "d"
879, // "f"
MIN_REDUCTION+231, // "m"
MIN_REDUCTION+231, // "x"
1068, // "g"
293, // "p"
94, // "v"
12, // "w"
MIN_REDUCTION+231, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
736, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+231, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+231, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+231, // $
MIN_REDUCTION+231, // $NT
  }
,
{ // state 571
0x80000000|44, // match move
0x80000000|982, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 572
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 573
-1, // $$start
-1, // start
1179, // ws*
-1, // $$0
MIN_REDUCTION+183, // token
89, // `boolean
303, // `class
1154, // `extends
1010, // `void
802, // `int
41, // `while
198, // `if
427, // `else
336, // `for
1160, // `break
480, // `this
569, // `false
595, // `true
525, // `super
724, // `null
820, // `return
414, // `instanceof
181, // `new
629, // `abstract
133, // `assert
1091, // `byte
682, // `case
99, // `catch
371, // `char
130, // `const
1055, // `continue
1165, // `default
890, // `do
121, // `double
233, // `enum
779, // `final
859, // `finally
766, // `float
551, // `goto
187, // `implements
662, // `import
622, // `interface
413, // `long
479, // `native
1128, // `package
709, // `private
788, // `protected
806, // `public
344, // `short
702, // `static
824, // `strictfp
995, // `switch
447, // `synchronized
177, // `throw
1103, // `throws
1082, // `transient
8, // `try
549, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
-1, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
973, // "a"
1139, // "b"
914, // "s"
1059, // "t"
626, // "r"
223, // "c"
182, // "e"
MIN_REDUCTION+183, // "o"
1014, // "l"
437, // "n"
MIN_REDUCTION+183, // "k"
MIN_REDUCTION+183, // "y"
MIN_REDUCTION+183, // "h"
1006, // "i"
MIN_REDUCTION+183, // "u"
734, // "d"
879, // "f"
MIN_REDUCTION+183, // "m"
MIN_REDUCTION+183, // "x"
1068, // "g"
293, // "p"
94, // "v"
12, // "w"
MIN_REDUCTION+183, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
736, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+183, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+183, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+183, // $
MIN_REDUCTION+183, // $NT
  }
,
{ // state 574
0x80000000|2, // match move
0x80000000|358, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 575
93,670, // "a"
94,670, // "b"
95,670, // "s"
96,670, // "t"
97,670, // "r"
98,670, // "c"
99,670, // "e"
100,670, // "o"
101,670, // "l"
102,670, // "n"
103,670, // "k"
104,670, // "y"
105,670, // "h"
106,670, // "i"
107,670, // "u"
108,670, // "d"
109,670, // "f"
110,670, // "m"
111,670, // "x"
112,670, // "g"
113,670, // "p"
114,670, // "v"
115,670, // "w"
116,670, // "z"
117,670, // "!"
118,670, // "="
119,670, // "%"
120,670, // "&"
121,670, // "|"
122,670, // "+"
123,670, // ","
124,670, // "-"
125,670, // "."
126,670, // "*"
127,670, // "/"
128,670, // ";"
129,670, // "<"
130,670, // ">"
131,670, // "("
132,670, // ")"
133,670, // "["
134,670, // "]"
135,670, // "{"
136,670, // "}"
138,670, // "'"
140,670, // '"'
143,670, // "0"
146,670, // "_"
148,670, // "\"
149,776, // printable
150,670, // {"1".."9"}
151,670, // {"#".."$" ":" "?".."@" "^" "`" "~"}
152,670, // {"A".."Z" "j" "q"}
153,670, // " "
154,670, // {9}
  }
,
{ // state 576
109,596, // "f"
  }
,
{ // state 577
99,905, // "e"
  }
,
{ // state 578
95,526, // "s"
  }
,
{ // state 579
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 580
0x80000000|378, // match move
0x80000000|854, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 581
98,992, // "c"
  }
,
{ // state 582
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 583
0x80000000|515, // match move
0x80000000|851, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 584
171,MIN_REDUCTION+154, // $NT
  }
,
{ // state 585
93,553, // "a"
  }
,
{ // state 586
2,696, // ws*
91,368, // $$1
157,550, // eol
158,1016, // ws
160,654, // comment
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 587
MIN_REDUCTION+350, // (default reduction)
  }
,
{ // state 588
0x80000000|1007, // match move
0x80000000|1012, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 589
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 590
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+212, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+212, // $
MIN_REDUCTION+212, // $NT
  }
,
{ // state 591
171,MIN_REDUCTION+178, // $NT
  }
,
{ // state 592
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 593
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 594
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 595
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 596
0x80000000|2, // match move
0x80000000|218, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 597
MIN_REDUCTION+357, // (default reduction)
  }
,
{ // state 598
96,102, // "t"
  }
,
{ // state 599
0x80000000|990, // match move
0x80000000|966, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 600
102,777, // "n"
  }
,
{ // state 601
0x80000000|1076, // match move
0x80000000|470, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 602
171,MIN_REDUCTION+202, // $NT
  }
,
{ // state 603
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+253, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+253, // $
-1, // $NT
  }
,
{ // state 604
0x80000000|721, // match move
0x80000000|272, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 605
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 606
0x80000000|2, // match move
0x80000000|936, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 607
MIN_REDUCTION+324, // (default reduction)
  }
,
{ // state 608
-1, // $$start
-1, // start
1126, // ws*
-1, // $$0
MIN_REDUCTION+141, // token
89, // `boolean
303, // `class
1154, // `extends
1010, // `void
802, // `int
41, // `while
198, // `if
427, // `else
336, // `for
1160, // `break
480, // `this
569, // `false
595, // `true
525, // `super
724, // `null
820, // `return
414, // `instanceof
181, // `new
629, // `abstract
133, // `assert
1091, // `byte
682, // `case
99, // `catch
371, // `char
130, // `const
1055, // `continue
1165, // `default
890, // `do
121, // `double
233, // `enum
779, // `final
859, // `finally
766, // `float
551, // `goto
187, // `implements
662, // `import
622, // `interface
413, // `long
479, // `native
1128, // `package
709, // `private
788, // `protected
806, // `public
344, // `short
702, // `static
824, // `strictfp
995, // `switch
447, // `synchronized
177, // `throw
1103, // `throws
1082, // `transient
8, // `try
549, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
-1, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
973, // "a"
1139, // "b"
914, // "s"
1059, // "t"
626, // "r"
223, // "c"
182, // "e"
MIN_REDUCTION+141, // "o"
1014, // "l"
437, // "n"
MIN_REDUCTION+141, // "k"
MIN_REDUCTION+141, // "y"
MIN_REDUCTION+141, // "h"
1006, // "i"
MIN_REDUCTION+141, // "u"
734, // "d"
879, // "f"
MIN_REDUCTION+141, // "m"
MIN_REDUCTION+141, // "x"
1068, // "g"
293, // "p"
94, // "v"
12, // "w"
MIN_REDUCTION+141, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
736, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+141, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+141, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+141, // $
MIN_REDUCTION+141, // $NT
  }
,
{ // state 609
0x80000000|1004, // match move
0x80000000|38, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 610
0x80000000|258, // match move
0x80000000|794, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 611
MIN_REDUCTION+356, // (default reduction)
  }
,
{ // state 612
171,MIN_REDUCTION+333, // $NT
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 613
0x80000000|624, // match move
0x80000000|731, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 614
126,675, // "*"
162,359, // multilineCommentPrintable**
166,636, // multilineCommentPrintable*
  }
,
{ // state 615
-1, // $$start
-1, // start
893, // ws*
-1, // $$0
MIN_REDUCTION+252, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
-1, // `=
-1, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
MIN_REDUCTION+252, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+252, // $
-1, // $NT
  }
,
{ // state 616
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+261, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+261, // $
-1, // $NT
  }
,
{ // state 617
-1, // $$start
-1, // start
78, // ws*
-1, // $$0
MIN_REDUCTION+364, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+364, // $
-1, // $NT
  }
,
{ // state 618
171,MIN_REDUCTION+145, // $NT
  }
,
{ // state 619
0x80000000|948, // match move
0x80000000|345, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 620
163,1052, // {10}
  }
,
{ // state 621
0x80000000|1001, // match move
0x80000000|1162, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 622
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 623
96,255, // "t"
  }
,
{ // state 624
MIN_REDUCTION+363, // (default reduction)
  }
,
{ // state 625
-1, // $$start
-1, // start
365, // ws*
-1, // $$0
MIN_REDUCTION+129, // token
89, // `boolean
303, // `class
1154, // `extends
1010, // `void
802, // `int
41, // `while
198, // `if
427, // `else
336, // `for
1160, // `break
480, // `this
569, // `false
595, // `true
525, // `super
724, // `null
820, // `return
414, // `instanceof
181, // `new
629, // `abstract
133, // `assert
1091, // `byte
682, // `case
99, // `catch
371, // `char
130, // `const
1055, // `continue
1165, // `default
890, // `do
121, // `double
233, // `enum
779, // `final
859, // `finally
766, // `float
551, // `goto
187, // `implements
662, // `import
622, // `interface
413, // `long
479, // `native
1128, // `package
709, // `private
788, // `protected
806, // `public
344, // `short
702, // `static
824, // `strictfp
995, // `switch
447, // `synchronized
177, // `throw
1103, // `throws
1082, // `transient
8, // `try
549, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
-1, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
973, // "a"
1139, // "b"
914, // "s"
1059, // "t"
626, // "r"
223, // "c"
182, // "e"
MIN_REDUCTION+129, // "o"
1014, // "l"
437, // "n"
MIN_REDUCTION+129, // "k"
MIN_REDUCTION+129, // "y"
MIN_REDUCTION+129, // "h"
1006, // "i"
1077, // "u"
734, // "d"
879, // "f"
MIN_REDUCTION+129, // "m"
MIN_REDUCTION+129, // "x"
1068, // "g"
293, // "p"
94, // "v"
12, // "w"
MIN_REDUCTION+129, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
736, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+129, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+129, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+129, // $
MIN_REDUCTION+129, // $NT
  }
,
{ // state 626
99,340, // "e"
  }
,
{ // state 627
171,MIN_REDUCTION+342, // $NT
MIN_REDUCTION+342, // (default reduction)
  }
,
{ // state 628
0x80000000|2, // match move
0x80000000|939, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 629
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 630
101,712, // "l"
  }
,
{ // state 631
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 632
-1, // $$start
-1, // start
1100, // ws*
-1, // $$0
MIN_REDUCTION+260, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+260, // $
-1, // $NT
  }
,
{ // state 633
0x80000000|2, // match move
0x80000000|698, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 634
-1, // $$start
-1, // start
1074, // ws*
-1, // $$0
MIN_REDUCTION+93, // token
89, // `boolean
303, // `class
1154, // `extends
1010, // `void
802, // `int
41, // `while
198, // `if
427, // `else
336, // `for
1160, // `break
480, // `this
569, // `false
595, // `true
525, // `super
724, // `null
820, // `return
414, // `instanceof
181, // `new
629, // `abstract
133, // `assert
1091, // `byte
682, // `case
99, // `catch
371, // `char
130, // `const
1055, // `continue
1165, // `default
890, // `do
121, // `double
233, // `enum
779, // `final
859, // `finally
766, // `float
551, // `goto
187, // `implements
662, // `import
622, // `interface
413, // `long
479, // `native
1128, // `package
709, // `private
788, // `protected
806, // `public
344, // `short
702, // `static
824, // `strictfp
995, // `switch
447, // `synchronized
177, // `throw
1103, // `throws
1082, // `transient
8, // `try
549, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
-1, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
973, // "a"
1139, // "b"
914, // "s"
1059, // "t"
626, // "r"
223, // "c"
182, // "e"
MIN_REDUCTION+93, // "o"
1014, // "l"
437, // "n"
MIN_REDUCTION+93, // "k"
MIN_REDUCTION+93, // "y"
MIN_REDUCTION+93, // "h"
1006, // "i"
MIN_REDUCTION+93, // "u"
734, // "d"
879, // "f"
MIN_REDUCTION+93, // "m"
MIN_REDUCTION+93, // "x"
1068, // "g"
293, // "p"
94, // "v"
12, // "w"
MIN_REDUCTION+93, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
736, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+93, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+93, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+93, // $
MIN_REDUCTION+93, // $NT
  }
,
{ // state 635
0x80000000|2, // match move
0x80000000|208, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 636
0x80000000|999, // match move
0x80000000|927, // no-match move
0x80000000|778, // NT-test-match state for multilineCommentPrintable
  }
,
{ // state 637
171,MIN_REDUCTION+94, // $NT
  }
,
{ // state 638
97,153, // "r"
106,491, // "i"
  }
,
{ // state 639
1,790, // start
2,782, // ws*
3,306, // $$0
4,796, // token
5,89, // `boolean
6,303, // `class
7,1154, // `extends
8,1010, // `void
9,802, // `int
10,41, // `while
11,198, // `if
12,427, // `else
13,336, // `for
14,1160, // `break
15,480, // `this
16,569, // `false
17,595, // `true
18,525, // `super
19,724, // `null
20,820, // `return
21,414, // `instanceof
22,181, // `new
23,629, // `abstract
24,133, // `assert
25,1091, // `byte
26,682, // `case
27,99, // `catch
28,371, // `char
29,130, // `const
30,1055, // `continue
31,1165, // `default
32,890, // `do
33,121, // `double
34,233, // `enum
35,779, // `final
36,859, // `finally
37,766, // `float
38,551, // `goto
39,187, // `implements
40,662, // `import
41,622, // `interface
42,413, // `long
43,479, // `native
44,1128, // `package
45,709, // `private
46,788, // `protected
47,806, // `public
48,344, // `short
49,702, // `static
50,824, // `strictfp
51,995, // `switch
52,447, // `synchronized
53,177, // `throw
54,1103, // `throws
55,1082, // `transient
56,8, // `try
57,549, // `volatile
168,1152, // token*
  }
,
{ // state 640
118,54, // "="
  }
,
{ // state 641
171,MIN_REDUCTION+173, // $NT
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 642
0x80000000|213, // match move
0x80000000|1018, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 643
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 644
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 645
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+363, // (default reduction)
  }
,
{ // state 646
96,398, // "t"
  }
,
{ // state 647
95,1157, // "s"
  }
,
{ // state 648
2,696, // ws*
91,368, // $$1
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 649
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 650
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 651
95,728, // "s"
  }
,
{ // state 652
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+101, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+101, // $
MIN_REDUCTION+101, // $NT
  }
,
{ // state 653
0x80000000|2, // match move
0x80000000|127, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 654
171,MIN_REDUCTION+334, // $NT
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 655
0x80000000|742, // match move
0x80000000|117, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 656
0x80000000|1171, // match move
0x80000000|1049, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 657
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+265, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+265, // $
-1, // $NT
  }
,
{ // state 658
0x80000000|787, // match move
0x80000000|341, // no-match move
// T-test match for "+":
122,
  }
,
{ // state 659
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 660
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 661
0x80000000|539, // match move
0x80000000|49, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 662
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 663
121,1191, // "|"
  }
,
{ // state 664
0x80000000|756, // match move
0x80000000|112, // no-match move
0x80000000|778, // NT-test-match state for multilineCommentPrintable
  }
,
{ // state 665
105,88, // "h"
106,548, // "i"
  }
,
{ // state 666
0x80000000|246, // match move
0x80000000|981, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 667
0x80000000|865, // match move
0x80000000|752, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 668
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+218, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+218, // $
MIN_REDUCTION+218, // $NT
  }
,
{ // state 669
0x80000000|357, // match move
0x80000000|1040, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 670
0x80000000|433, // match move
0x80000000|107, // no-match move
0x80000000|1136, // NT-test-match state for printable
  }
,
{ // state 671
0x80000000|33, // match move
0x80000000|541, // no-match move
0x80000000|778, // NT-test-match state for multilineCommentPrintable
  }
,
{ // state 672
106,548, // "i"
  }
,
{ // state 673
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+221, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+221, // $
MIN_REDUCTION+221, // $NT
  }
,
{ // state 674
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 675
127,222, // "/"
  }
,
{ // state 676
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 677
171,MIN_REDUCTION+125, // $NT
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 678
MIN_REDUCTION+360, // (default reduction)
  }
,
{ // state 679
2,78, // ws*
MIN_REDUCTION+364, // (default reduction)
  }
,
{ // state 680
0x80000000|2, // match move
0x80000000|1036, // no-match move
// T-test match for "/":
127,
  }
,
{ // state 681
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 682
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 683
0x80000000|230, // match move
0x80000000|588, // no-match move
// T-test match for "=":
118,
  }
,
{ // state 684
106,305, // "i"
  }
,
{ // state 685
0x80000000|784, // match move
0x80000000|82, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 686
0x80000000|845, // match move
0x80000000|840, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 687
171,MIN_REDUCTION+109, // $NT
  }
,
{ // state 688
107,48, // "u"
  }
,
{ // state 689
0x80000000|542, // match move
0x80000000|423, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 690
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+257, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+257, // $
-1, // $NT
  }
,
{ // state 691
0x80000000|514, // match move
0x80000000|1051, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 692
0x80000000|2, // match move
0x80000000|482, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 693
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+95, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+95, // $
MIN_REDUCTION+95, // $NT
  }
,
{ // state 694
171,MIN_REDUCTION+166, // $NT
  }
,
{ // state 695
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 696
0x80000000|108, // match move
0x80000000|1102, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 697
-1, // $$start
-1, // start
323, // ws*
-1, // $$0
MIN_REDUCTION+108, // token
89, // `boolean
303, // `class
1154, // `extends
1010, // `void
802, // `int
41, // `while
198, // `if
427, // `else
336, // `for
1160, // `break
480, // `this
569, // `false
595, // `true
525, // `super
724, // `null
820, // `return
414, // `instanceof
181, // `new
629, // `abstract
133, // `assert
1091, // `byte
682, // `case
99, // `catch
371, // `char
130, // `const
1055, // `continue
1165, // `default
890, // `do
121, // `double
233, // `enum
779, // `final
859, // `finally
766, // `float
551, // `goto
187, // `implements
662, // `import
622, // `interface
413, // `long
479, // `native
1128, // `package
709, // `private
788, // `protected
806, // `public
344, // `short
702, // `static
824, // `strictfp
995, // `switch
447, // `synchronized
177, // `throw
1103, // `throws
1082, // `transient
8, // `try
549, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
-1, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
973, // "a"
1139, // "b"
914, // "s"
1059, // "t"
626, // "r"
223, // "c"
182, // "e"
MIN_REDUCTION+108, // "o"
1014, // "l"
437, // "n"
MIN_REDUCTION+108, // "k"
MIN_REDUCTION+108, // "y"
MIN_REDUCTION+108, // "h"
1006, // "i"
MIN_REDUCTION+108, // "u"
734, // "d"
879, // "f"
MIN_REDUCTION+108, // "m"
MIN_REDUCTION+108, // "x"
1068, // "g"
293, // "p"
94, // "v"
12, // "w"
MIN_REDUCTION+108, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
736, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+108, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+108, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+108, // $
MIN_REDUCTION+108, // $NT
  }
,
{ // state 698
-1, // $$start
-1, // start
866, // ws*
-1, // $$0
MIN_REDUCTION+198, // token
89, // `boolean
303, // `class
1154, // `extends
1010, // `void
802, // `int
41, // `while
198, // `if
427, // `else
336, // `for
1160, // `break
480, // `this
569, // `false
595, // `true
525, // `super
724, // `null
820, // `return
414, // `instanceof
181, // `new
629, // `abstract
133, // `assert
1091, // `byte
682, // `case
99, // `catch
371, // `char
130, // `const
1055, // `continue
1165, // `default
890, // `do
121, // `double
233, // `enum
779, // `final
859, // `finally
766, // `float
551, // `goto
187, // `implements
662, // `import
622, // `interface
413, // `long
479, // `native
1128, // `package
709, // `private
788, // `protected
806, // `public
344, // `short
702, // `static
824, // `strictfp
995, // `switch
447, // `synchronized
177, // `throw
1103, // `throws
1082, // `transient
8, // `try
549, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
-1, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
973, // "a"
1139, // "b"
914, // "s"
1059, // "t"
626, // "r"
223, // "c"
182, // "e"
MIN_REDUCTION+198, // "o"
1014, // "l"
437, // "n"
MIN_REDUCTION+198, // "k"
MIN_REDUCTION+198, // "y"
MIN_REDUCTION+198, // "h"
1006, // "i"
MIN_REDUCTION+198, // "u"
734, // "d"
879, // "f"
MIN_REDUCTION+198, // "m"
MIN_REDUCTION+198, // "x"
1068, // "g"
293, // "p"
94, // "v"
12, // "w"
MIN_REDUCTION+198, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
736, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+198, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+198, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+198, // $
MIN_REDUCTION+198, // $NT
  }
,
{ // state 699
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+152, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+152, // $
MIN_REDUCTION+152, // $NT
  }
,
{ // state 700
2,202, // ws*
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 701
0x80000000|899, // match move
0x80000000|520, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 702
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 703
0x80000000|328, // match move
0x80000000|1193, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 704
0x80000000|2, // match move
0x80000000|1025, // no-match move
// T-test match for "/":
127,
  }
,
{ // state 705
2,1034, // ws*
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 706
2,500, // ws*
157,550, // eol
158,1016, // ws
160,654, // comment
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 707
171,MIN_REDUCTION+124, // $NT
  }
,
{ // state 708
0x80000000|294, // match move
0x80000000|690, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 709
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 710
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 711
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+179, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+179, // $
MIN_REDUCTION+179, // $NT
  }
,
{ // state 712
104,1057, // "y"
  }
,
{ // state 713
107,355, // "u"
  }
,
{ // state 714
171,MIN_REDUCTION+161, // $NT
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 715
0x80000000|800, // match move
0x80000000|115, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 716
0x80000000|2, // match move
0x80000000|505, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 717
0x80000000|2, // match move
0x80000000|516, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 718
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+227, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+227, // $
MIN_REDUCTION+227, // $NT
  }
,
{ // state 719
106,273, // "i"
  }
,
{ // state 720
0x80000000|2, // match move
0x80000000|889, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 721
2,314, // ws*
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 722
-1, // $$start
-1, // start
19, // ws*
-1, // $$0
MIN_REDUCTION+186, // token
89, // `boolean
303, // `class
1154, // `extends
1010, // `void
802, // `int
41, // `while
198, // `if
427, // `else
336, // `for
1160, // `break
480, // `this
569, // `false
595, // `true
525, // `super
724, // `null
820, // `return
414, // `instanceof
181, // `new
629, // `abstract
133, // `assert
1091, // `byte
682, // `case
99, // `catch
371, // `char
130, // `const
1055, // `continue
1165, // `default
890, // `do
121, // `double
233, // `enum
779, // `final
859, // `finally
766, // `float
551, // `goto
187, // `implements
662, // `import
622, // `interface
413, // `long
479, // `native
1128, // `package
709, // `private
788, // `protected
806, // `public
344, // `short
702, // `static
824, // `strictfp
995, // `switch
447, // `synchronized
177, // `throw
1103, // `throws
1082, // `transient
8, // `try
549, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
-1, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
973, // "a"
1139, // "b"
914, // "s"
1059, // "t"
626, // "r"
223, // "c"
182, // "e"
MIN_REDUCTION+186, // "o"
1014, // "l"
437, // "n"
MIN_REDUCTION+186, // "k"
MIN_REDUCTION+186, // "y"
MIN_REDUCTION+186, // "h"
1006, // "i"
MIN_REDUCTION+186, // "u"
734, // "d"
879, // "f"
MIN_REDUCTION+186, // "m"
MIN_REDUCTION+186, // "x"
1068, // "g"
293, // "p"
94, // "v"
12, // "w"
MIN_REDUCTION+186, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
736, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+186, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+186, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+186, // $
MIN_REDUCTION+186, // $NT
  }
};
}
private class Initter5{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 723
0x80000000|212, // match move
0x80000000|1000, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 724
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 725
171,MIN_REDUCTION+121, // $NT
  }
,
{ // state 726
143,22, // "0"
145,450, // digit
150,22, // {"1".."9"}
  }
,
{ // state 727
171,MIN_REDUCTION+175, // $NT
  }
,
{ // state 728
106,1046, // "i"
  }
,
{ // state 729
171,MIN_REDUCTION+155, // $NT
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 730
-1, // $$start
-1, // start
168, // ws*
-1, // $$0
MIN_REDUCTION+216, // token
89, // `boolean
303, // `class
1154, // `extends
1010, // `void
802, // `int
41, // `while
198, // `if
427, // `else
336, // `for
1160, // `break
480, // `this
569, // `false
595, // `true
525, // `super
724, // `null
820, // `return
414, // `instanceof
181, // `new
629, // `abstract
133, // `assert
1091, // `byte
682, // `case
99, // `catch
371, // `char
130, // `const
1055, // `continue
1165, // `default
890, // `do
121, // `double
233, // `enum
779, // `final
859, // `finally
766, // `float
551, // `goto
187, // `implements
662, // `import
622, // `interface
413, // `long
479, // `native
1128, // `package
709, // `private
788, // `protected
806, // `public
344, // `short
702, // `static
824, // `strictfp
995, // `switch
447, // `synchronized
177, // `throw
1103, // `throws
1082, // `transient
8, // `try
549, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
-1, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
973, // "a"
1139, // "b"
914, // "s"
1059, // "t"
626, // "r"
223, // "c"
182, // "e"
MIN_REDUCTION+216, // "o"
1014, // "l"
437, // "n"
MIN_REDUCTION+216, // "k"
MIN_REDUCTION+216, // "y"
MIN_REDUCTION+216, // "h"
1006, // "i"
MIN_REDUCTION+216, // "u"
734, // "d"
879, // "f"
MIN_REDUCTION+216, // "m"
MIN_REDUCTION+216, // "x"
1068, // "g"
293, // "p"
94, // "v"
12, // "w"
MIN_REDUCTION+216, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
736, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+216, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+216, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+216, // $
MIN_REDUCTION+216, // $NT
  }
,
{ // state 731
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+363, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+363, // $
-1, // $NT
  }
,
{ // state 732
MIN_REDUCTION+353, // (default reduction)
  }
,
{ // state 733
0x80000000|620, // match move
0x80000000|627, // no-match move
// T-test match for 10:
163,
  }
,
{ // state 734
99,324, // "e"
100,276, // "o"
  }
,
{ // state 735
96,92, // "t"
  }
,
{ // state 736
0x80000000|2, // match move
0x80000000|594, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 737
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+295, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+295, // $
-1, // $NT
  }
,
{ // state 738
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 739
96,716, // "t"
  }
,
{ // state 740
-1, // $$start
-1, // start
251, // ws*
-1, // $$0
MIN_REDUCTION+278, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+278, // $
-1, // $NT
  }
,
{ // state 741
4,587, // token
58,984, // `!
59,1186, // `!=
60,801, // `%
61,772, // `&&
62,535, // `*
63,605, // `(
64,316, // `)
65,547, // `{
66,232, // `}
67,835, // `-
68,440, // `+
69,219, // `=
70,660, // `==
71,435, // `[
72,781, // `]
73,13, // `||
74,254, // `<
75,558, // `<=
76,420, // `,
77,1013, // `>
78,537, // `>=
79,459, // `.
80,1056, // `;
81,789, // `++
82,147, // `--
83,710, // `/
84,803, // ID
85,16, // INTLIT
86,286, // STRINGLIT
87,765, // CHARLIT
89,75, // letter
137,795, // intLit2
143,736, // "0"
  }
,
{ // state 742
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 743
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+185, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+185, // $
MIN_REDUCTION+185, // $NT
  }
,
{ // state 744
0x80000000|244, // match move
0x80000000|1123, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 745
97,717, // "r"
  }
,
{ // state 746
2,262, // ws*
153,612, // " "
154,612, // {9}
157,550, // eol
158,1016, // ws
159,612, // {12}
163,1146, // {10}
164,733, // {13}
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 747
0x80000000|1172, // match move
0x80000000|798, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 748
-1, // $$start
-1, // start
696, // ws*
-1, // $$0
MIN_REDUCTION+91, // token
89, // `boolean
303, // `class
1154, // `extends
1010, // `void
802, // `int
41, // `while
198, // `if
427, // `else
336, // `for
1160, // `break
480, // `this
569, // `false
595, // `true
525, // `super
724, // `null
820, // `return
414, // `instanceof
181, // `new
629, // `abstract
133, // `assert
1091, // `byte
682, // `case
99, // `catch
371, // `char
130, // `const
1055, // `continue
1165, // `default
890, // `do
121, // `double
233, // `enum
779, // `final
859, // `finally
766, // `float
551, // `goto
187, // `implements
662, // `import
622, // `interface
413, // `long
479, // `native
1128, // `package
709, // `private
788, // `protected
806, // `public
344, // `short
702, // `static
824, // `strictfp
995, // `switch
447, // `synchronized
177, // `throw
1103, // `throws
1082, // `transient
8, // `try
549, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
-1, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
-1, // letter
1003, // idChar**
980, // $$1
-1, // idChar
973, // "a"
1139, // "b"
914, // "s"
1059, // "t"
626, // "r"
223, // "c"
182, // "e"
MIN_REDUCTION+91, // "o"
1014, // "l"
437, // "n"
MIN_REDUCTION+91, // "k"
MIN_REDUCTION+91, // "y"
MIN_REDUCTION+91, // "h"
1006, // "i"
MIN_REDUCTION+91, // "u"
734, // "d"
879, // "f"
MIN_REDUCTION+91, // "m"
MIN_REDUCTION+91, // "x"
1068, // "g"
293, // "p"
94, // "v"
12, // "w"
MIN_REDUCTION+91, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
736, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+91, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+91, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
1111, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+91, // $
-1, // $NT
  }
,
{ // state 749
0x80000000|760, // match move
0x80000000|737, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 750
93,7, // "a"
104,775, // "y"
107,908, // "u"
  }
,
{ // state 751
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+299, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+299, // $
-1, // $NT
  }
,
{ // state 752
0x80000000|206, // match move
0x80000000|1125, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 753
2,872, // ws*
157,550, // eol
158,1016, // ws
160,654, // comment
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 754
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+194, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+194, // $
MIN_REDUCTION+194, // $NT
  }
,
{ // state 755
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+263, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+263, // $
-1, // $NT
  }
,
{ // state 756
MIN_REDUCTION+358, // (default reduction)
  }
,
{ // state 757
93,817, // "a"
  }
,
{ // state 758
0x80000000|1026, // match move
0x80000000|955, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 759
-1, // $$start
-1, // start
444, // ws*
-1, // $$0
MIN_REDUCTION+150, // token
89, // `boolean
303, // `class
1154, // `extends
1010, // `void
802, // `int
41, // `while
198, // `if
427, // `else
336, // `for
1160, // `break
480, // `this
569, // `false
595, // `true
525, // `super
724, // `null
820, // `return
414, // `instanceof
181, // `new
629, // `abstract
133, // `assert
1091, // `byte
682, // `case
99, // `catch
371, // `char
130, // `const
1055, // `continue
1165, // `default
890, // `do
121, // `double
233, // `enum
779, // `final
859, // `finally
766, // `float
551, // `goto
187, // `implements
662, // `import
622, // `interface
413, // `long
479, // `native
1128, // `package
709, // `private
788, // `protected
806, // `public
344, // `short
702, // `static
824, // `strictfp
995, // `switch
447, // `synchronized
177, // `throw
1103, // `throws
1082, // `transient
8, // `try
549, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
-1, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
973, // "a"
1139, // "b"
914, // "s"
1059, // "t"
626, // "r"
223, // "c"
182, // "e"
MIN_REDUCTION+150, // "o"
1014, // "l"
437, // "n"
MIN_REDUCTION+150, // "k"
MIN_REDUCTION+150, // "y"
MIN_REDUCTION+150, // "h"
1006, // "i"
MIN_REDUCTION+150, // "u"
734, // "d"
879, // "f"
MIN_REDUCTION+150, // "m"
MIN_REDUCTION+150, // "x"
1068, // "g"
293, // "p"
94, // "v"
12, // "w"
MIN_REDUCTION+150, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
736, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+150, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+150, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+150, // $
MIN_REDUCTION+150, // $NT
  }
,
{ // state 760
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 761
-1, // $$start
-1, // start
234, // ws*
-1, // $$0
MIN_REDUCTION+120, // token
89, // `boolean
303, // `class
1154, // `extends
1010, // `void
802, // `int
41, // `while
198, // `if
427, // `else
336, // `for
1160, // `break
480, // `this
569, // `false
595, // `true
525, // `super
724, // `null
820, // `return
414, // `instanceof
181, // `new
629, // `abstract
133, // `assert
1091, // `byte
682, // `case
99, // `catch
371, // `char
130, // `const
1055, // `continue
1165, // `default
890, // `do
121, // `double
233, // `enum
779, // `final
859, // `finally
766, // `float
551, // `goto
187, // `implements
662, // `import
622, // `interface
413, // `long
479, // `native
1128, // `package
709, // `private
788, // `protected
806, // `public
344, // `short
702, // `static
824, // `strictfp
995, // `switch
447, // `synchronized
177, // `throw
1103, // `throws
1082, // `transient
8, // `try
549, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
-1, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
973, // "a"
1139, // "b"
914, // "s"
1059, // "t"
626, // "r"
223, // "c"
182, // "e"
MIN_REDUCTION+120, // "o"
1014, // "l"
437, // "n"
MIN_REDUCTION+120, // "k"
MIN_REDUCTION+120, // "y"
MIN_REDUCTION+120, // "h"
1006, // "i"
MIN_REDUCTION+120, // "u"
734, // "d"
879, // "f"
MIN_REDUCTION+120, // "m"
MIN_REDUCTION+120, // "x"
1068, // "g"
293, // "p"
94, // "v"
12, // "w"
MIN_REDUCTION+120, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
736, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+120, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+120, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+120, // $
MIN_REDUCTION+120, // $NT
  }
,
{ // state 762
0x80000000|455, // match move
0x80000000|243, // no-match move
// T-test match for "*":
126,
  }
,
{ // state 763
0x80000000|2, // match move
0x80000000|380, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 764
95,647, // "s"
  }
,
{ // state 765
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 766
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 767
0x80000000|1150, // match move
0x80000000|243, // no-match move
// T-test match for "*":
126,
  }
,
{ // state 768
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+271, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+271, // $
-1, // $NT
  }
,
{ // state 769
171,MIN_REDUCTION+311, // $NT
  }
,
{ // state 770
171,MIN_REDUCTION+331, // $NT
  }
,
{ // state 771
0x80000000|394, // match move
0x80000000|183, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 772
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 773
0x80000000|924, // match move
0x80000000|546, // no-match move
0x80000000|778, // NT-test-match state for multilineCommentPrintable
  }
,
{ // state 774
98,568, // "c"
  }
,
{ // state 775
0x80000000|2, // match move
0x80000000|1078, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 776
0x80000000|554, // match move
0x80000000|517, // no-match move
0x80000000|1136, // NT-test-match state for printable
  }
,
{ // state 777
96,277, // "t"
  }
,
{ // state 778
93,148, // "a"
94,148, // "b"
95,148, // "s"
96,148, // "t"
97,148, // "r"
98,148, // "c"
99,148, // "e"
100,148, // "o"
101,148, // "l"
102,148, // "n"
103,148, // "k"
104,148, // "y"
105,148, // "h"
106,148, // "i"
107,148, // "u"
108,148, // "d"
109,148, // "f"
110,148, // "m"
111,148, // "x"
112,148, // "g"
113,148, // "p"
114,148, // "v"
115,148, // "w"
116,148, // "z"
117,148, // "!"
118,148, // "="
119,148, // "%"
120,148, // "&"
121,148, // "|"
122,148, // "+"
123,148, // ","
124,148, // "-"
125,148, // "."
126,1038, // "*"
127,767, // "/"
128,148, // ";"
129,148, // "<"
130,148, // ">"
131,148, // "("
132,148, // ")"
133,148, // "["
134,148, // "]"
135,148, // "{"
136,148, // "}"
138,148, // "'"
140,148, // '"'
143,148, // "0"
146,148, // "_"
148,148, // "\"
150,148, // {"1".."9"}
151,148, // {"#".."$" ":" "?".."@" "^" "`" "~"}
152,148, // {"A".."Z" "j" "q"}
153,148, // " "
154,148, // {9}
157,185, // eol
163,1146, // {10}
164,733, // {13}
  }
,
{ // state 779
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 780
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 781
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 782
0x80000000|196, // match move
0x80000000|1132, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 783
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 784
171,MIN_REDUCTION+248, // $NT
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 785
99,349, // "e"
  }
,
{ // state 786
0x80000000|2, // match move
0x80000000|761, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 787
122,312, // "+"
  }
,
{ // state 788
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 789
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 790
170,MIN_REDUCTION+0, // $
  }
,
{ // state 791
171,MIN_REDUCTION+236, // $NT
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 792
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+140, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+140, // $
MIN_REDUCTION+140, // $NT
  }
,
{ // state 793
93,745, // "a"
  }
,
{ // state 794
0x80000000|791, // match move
0x80000000|1164, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 795
0x80000000|438, // match move
0x80000000|354, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 796
MIN_REDUCTION+351, // (default reduction)
  }
,
{ // state 797
171,MIN_REDUCTION+336, // $NT
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 798
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+209, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+209, // $
MIN_REDUCTION+209, // $NT
  }
,
{ // state 799
98,169, // "c"
  }
,
{ // state 800
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 801
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 802
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 803
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 804
0x80000000|2, // match move
0x80000000|1140, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 805
171,MIN_REDUCTION+185, // $NT
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 806
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 807
0x80000000|197, // match move
0x80000000|869, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 808
0x80000000|813, // match move
0x80000000|699, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 809
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+200, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+200, // $
MIN_REDUCTION+200, // $NT
  }
,
{ // state 810
0x80000000|921, // match move
0x80000000|749, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 811
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+206, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+206, // $
MIN_REDUCTION+206, // $NT
  }
,
{ // state 812
0x80000000|639, // match move
0x80000000|1081, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 813
171,MIN_REDUCTION+152, // $NT
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 814
97,281, // "r"
101,199, // "l"
102,688, // "n"
111,598, // "x"
  }
,
{ // state 815
2,314, // ws*
157,550, // eol
158,1016, // ws
160,654, // comment
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 816
2,563, // ws*
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 817
107,145, // "u"
  }
,
{ // state 818
0x80000000|2, // match move
0x80000000|141, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 819
-1, // $$start
-1, // start
1109, // ws*
-1, // $$0
MIN_REDUCTION+153, // token
89, // `boolean
303, // `class
1154, // `extends
1010, // `void
802, // `int
41, // `while
198, // `if
427, // `else
336, // `for
1160, // `break
480, // `this
569, // `false
595, // `true
525, // `super
724, // `null
820, // `return
414, // `instanceof
181, // `new
629, // `abstract
133, // `assert
1091, // `byte
682, // `case
99, // `catch
371, // `char
130, // `const
1055, // `continue
1165, // `default
890, // `do
121, // `double
233, // `enum
779, // `final
859, // `finally
766, // `float
551, // `goto
187, // `implements
662, // `import
622, // `interface
413, // `long
479, // `native
1128, // `package
709, // `private
788, // `protected
806, // `public
344, // `short
702, // `static
824, // `strictfp
995, // `switch
447, // `synchronized
177, // `throw
1103, // `throws
1082, // `transient
8, // `try
549, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
-1, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
973, // "a"
1139, // "b"
914, // "s"
1059, // "t"
626, // "r"
223, // "c"
182, // "e"
MIN_REDUCTION+153, // "o"
1014, // "l"
437, // "n"
MIN_REDUCTION+153, // "k"
MIN_REDUCTION+153, // "y"
MIN_REDUCTION+153, // "h"
1006, // "i"
MIN_REDUCTION+153, // "u"
734, // "d"
879, // "f"
MIN_REDUCTION+153, // "m"
MIN_REDUCTION+153, // "x"
1068, // "g"
293, // "p"
94, // "v"
12, // "w"
MIN_REDUCTION+153, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
736, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+153, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+153, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+153, // $
MIN_REDUCTION+153, // $NT
  }
,
{ // state 820
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 821
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 822
0x80000000|678, // match move
0x80000000|952, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 823
-1, // $$start
-1, // start
1011, // ws*
-1, // $$0
MIN_REDUCTION+213, // token
89, // `boolean
303, // `class
1154, // `extends
1010, // `void
802, // `int
41, // `while
198, // `if
427, // `else
336, // `for
1160, // `break
480, // `this
569, // `false
595, // `true
525, // `super
724, // `null
820, // `return
414, // `instanceof
181, // `new
629, // `abstract
133, // `assert
1091, // `byte
682, // `case
99, // `catch
371, // `char
130, // `const
1055, // `continue
1165, // `default
890, // `do
121, // `double
233, // `enum
779, // `final
859, // `finally
766, // `float
551, // `goto
187, // `implements
662, // `import
622, // `interface
413, // `long
479, // `native
1128, // `package
709, // `private
788, // `protected
806, // `public
344, // `short
702, // `static
824, // `strictfp
995, // `switch
447, // `synchronized
177, // `throw
1103, // `throws
1082, // `transient
8, // `try
549, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
-1, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
973, // "a"
1139, // "b"
914, // "s"
1059, // "t"
626, // "r"
223, // "c"
182, // "e"
MIN_REDUCTION+213, // "o"
1014, // "l"
437, // "n"
MIN_REDUCTION+213, // "k"
MIN_REDUCTION+213, // "y"
MIN_REDUCTION+213, // "h"
1006, // "i"
MIN_REDUCTION+213, // "u"
734, // "d"
879, // "f"
MIN_REDUCTION+213, // "m"
MIN_REDUCTION+213, // "x"
1068, // "g"
293, // "p"
94, // "v"
12, // "w"
MIN_REDUCTION+213, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
736, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+213, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+213, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+213, // $
MIN_REDUCTION+213, // $NT
  }
,
{ // state 824
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 825
171,MIN_REDUCTION+247, // $NT
  }
,
{ // state 826
171,MIN_REDUCTION+140, // $NT
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 827
0x80000000|1084, // match move
0x80000000|507, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 828
171,MIN_REDUCTION+191, // $NT
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 829
0x80000000|830, // match move
0x80000000|207, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 830
171,MIN_REDUCTION+245, // $NT
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 831
96,204, // "t"
  }
,
{ // state 832
-1, // $$start
-1, // start
580, // ws*
-1, // $$0
MIN_REDUCTION+266, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+266, // $
-1, // $NT
  }
,
{ // state 833
97,574, // "r"
  }
,
{ // state 834
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+251, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+251, // $
-1, // $NT
  }
,
{ // state 835
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 836
171,MIN_REDUCTION+242, // $NT
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 837
0x80000000|2, // match move
0x80000000|511, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 838
2,334, // ws*
157,550, // eol
158,1016, // ws
160,654, // comment
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 839
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 840
0x80000000|1167, // match move
0x80000000|161, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 841
2,202, // ws*
157,550, // eol
158,1016, // ws
160,654, // comment
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 842
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+155, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+155, // $
MIN_REDUCTION+155, // $NT
  }
,
{ // state 843
0x80000000|91, // match move
0x80000000|906, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 844
114,302, // "v"
  }
,
{ // state 845
2,609, // ws*
157,550, // eol
158,1016, // ws
160,654, // comment
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 846
2,6, // ws*
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 847
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 848
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 849
171,MIN_REDUCTION+95, // $NT
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 850
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 851
0x80000000|968, // match move
0x80000000|296, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 852
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 853
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 854
0x80000000|154, // match move
0x80000000|657, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 855
0x80000000|959, // match move
0x80000000|1169, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 856
99,653, // "e"
  }
,
{ // state 857
98,457, // "c"
  }
,
{ // state 858
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 859
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 860
0x80000000|2, // match move
0x80000000|58, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 861
126,10, // "*"
127,943, // "/"
  }
,
{ // state 862
-1, // $$start
-1, // start
703, // ws*
-1, // $$0
MIN_REDUCTION+138, // token
89, // `boolean
303, // `class
1154, // `extends
1010, // `void
802, // `int
41, // `while
198, // `if
427, // `else
336, // `for
1160, // `break
480, // `this
569, // `false
595, // `true
525, // `super
724, // `null
820, // `return
414, // `instanceof
181, // `new
629, // `abstract
133, // `assert
1091, // `byte
682, // `case
99, // `catch
371, // `char
130, // `const
1055, // `continue
1165, // `default
890, // `do
121, // `double
233, // `enum
779, // `final
859, // `finally
766, // `float
551, // `goto
187, // `implements
662, // `import
622, // `interface
413, // `long
479, // `native
1128, // `package
709, // `private
788, // `protected
806, // `public
344, // `short
702, // `static
824, // `strictfp
995, // `switch
447, // `synchronized
177, // `throw
1103, // `throws
1082, // `transient
8, // `try
549, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
-1, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
973, // "a"
1139, // "b"
914, // "s"
1059, // "t"
626, // "r"
223, // "c"
182, // "e"
MIN_REDUCTION+138, // "o"
1014, // "l"
437, // "n"
MIN_REDUCTION+138, // "k"
MIN_REDUCTION+138, // "y"
MIN_REDUCTION+138, // "h"
1006, // "i"
MIN_REDUCTION+138, // "u"
734, // "d"
879, // "f"
MIN_REDUCTION+138, // "m"
MIN_REDUCTION+138, // "x"
1068, // "g"
293, // "p"
94, // "v"
12, // "w"
MIN_REDUCTION+138, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
736, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+138, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+138, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+138, // $
MIN_REDUCTION+138, // $NT
  }
,
{ // state 863
0x80000000|1061, // match move
0x80000000|974, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 864
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 865
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 866
0x80000000|152, // match move
0x80000000|855, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 867
96,1175, // "t"
97,307, // "r"
102,1149, // "n"
109,1189, // "f"
138,1129, // "'"
140,284, // '"'
148,681, // "\"
  }
,
{ // state 868
99,155, // "e"
  }
,
{ // state 869
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+291, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+291, // $
-1, // $NT
  }
,
{ // state 870
171,MIN_REDUCTION+224, // $NT
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 871
0x80000000|2, // match move
0x80000000|1137, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 872
0x80000000|1044, // match move
0x80000000|1182, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 873
99,215, // "e"
  }
,
{ // state 874
2,247, // ws*
157,550, // eol
158,1016, // ws
160,654, // comment
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 875
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+191, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+191, // $
MIN_REDUCTION+191, // $NT
  }
,
{ // state 876
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 877
0x80000000|1096, // match move
0x80000000|346, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 878
100,576, // "o"
  }
,
{ // state 879
93,332, // "a"
100,833, // "o"
101,987, // "l"
106,189, // "i"
  }
,
{ // state 880
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 881
89,280, // letter
90,1003, // idChar**
92,822, // idChar
93,68, // "a"
94,68, // "b"
95,68, // "s"
96,68, // "t"
97,68, // "r"
98,68, // "c"
99,68, // "e"
100,68, // "o"
101,68, // "l"
102,68, // "n"
103,68, // "k"
104,68, // "y"
105,68, // "h"
106,68, // "i"
107,68, // "u"
108,68, // "d"
109,68, // "f"
110,68, // "m"
111,68, // "x"
112,68, // "g"
113,68, // "p"
114,68, // "v"
115,68, // "w"
116,68, // "z"
143,149, // "0"
145,642, // digit
146,901, // "_"
150,149, // {"1".."9"}
152,68, // {"A".."Z" "j" "q"}
165,1111, // idChar*
  }
,
{ // state 882
96,909, // "t"
  }
,
{ // state 883
100,157, // "o"
  }
,
{ // state 884
102,240, // "n"
  }
,
{ // state 885
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+239, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+239, // $
MIN_REDUCTION+239, // $NT
  }
,
{ // state 886
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 887
171,MIN_REDUCTION+169, // $NT
  }
,
{ // state 888
98,310, // "c"
  }
,
{ // state 889
-1, // $$start
-1, // start
110, // ws*
-1, // $$0
MIN_REDUCTION+162, // token
89, // `boolean
303, // `class
1154, // `extends
1010, // `void
802, // `int
41, // `while
198, // `if
427, // `else
336, // `for
1160, // `break
480, // `this
569, // `false
595, // `true
525, // `super
724, // `null
820, // `return
414, // `instanceof
181, // `new
629, // `abstract
133, // `assert
1091, // `byte
682, // `case
99, // `catch
371, // `char
130, // `const
1055, // `continue
1165, // `default
890, // `do
121, // `double
233, // `enum
779, // `final
859, // `finally
766, // `float
551, // `goto
187, // `implements
662, // `import
622, // `interface
413, // `long
479, // `native
1128, // `package
709, // `private
788, // `protected
806, // `public
344, // `short
702, // `static
824, // `strictfp
995, // `switch
447, // `synchronized
177, // `throw
1103, // `throws
1082, // `transient
8, // `try
549, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
-1, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
973, // "a"
1139, // "b"
914, // "s"
1059, // "t"
626, // "r"
223, // "c"
182, // "e"
MIN_REDUCTION+162, // "o"
1014, // "l"
437, // "n"
MIN_REDUCTION+162, // "k"
MIN_REDUCTION+162, // "y"
MIN_REDUCTION+162, // "h"
1006, // "i"
MIN_REDUCTION+162, // "u"
734, // "d"
879, // "f"
MIN_REDUCTION+162, // "m"
MIN_REDUCTION+162, // "x"
1068, // "g"
293, // "p"
94, // "v"
12, // "w"
MIN_REDUCTION+162, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
736, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+162, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+162, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+162, // $
MIN_REDUCTION+162, // $NT
  }
};
}
private class Initter6{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 890
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 891
0x80000000|597, // match move
0x80000000|465, // no-match move
0x80000000|778, // NT-test-match state for multilineCommentPrintable
  }
,
{ // state 892
0x80000000|135, // match move
0x80000000|744, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 893
0x80000000|432, // match move
0x80000000|352, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 894
0x80000000|631, // match move
0x80000000|755, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 895
95,949, // "s"
  }
,
{ // state 896
0x80000000|353, // match move
0x80000000|9, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 897
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 898
171,MIN_REDUCTION+227, // $NT
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 899
171,MIN_REDUCTION+170, // $NT
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 900
2,78, // ws*
157,550, // eol
158,1016, // ws
160,654, // comment
MIN_REDUCTION+364, // (default reduction)
  }
,
{ // state 901
0x80000000|897, // match move
0x80000000|821, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 902
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 903
0x80000000|2, // match move
0x80000000|570, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 904
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 905
0x80000000|2, // match move
0x80000000|944, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 906
0x80000000|828, // match move
0x80000000|875, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 907
0x80000000|191, // match move
0x80000000|289, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 908
99,860, // "e"
  }
,
{ // state 909
93,884, // "a"
  }
,
{ // state 910
MIN_REDUCTION+341, // (default reduction)
  }
,
{ // state 911
-1, // $$start
-1, // start
872, // ws*
-1, // $$0
MIN_REDUCTION+298, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+298, // $
-1, // $NT
  }
,
{ // state 912
-1, // $$start
-1, // start
319, // ws*
-1, // $$0
MIN_REDUCTION+99, // token
89, // `boolean
303, // `class
1154, // `extends
1010, // `void
802, // `int
41, // `while
198, // `if
427, // `else
336, // `for
1160, // `break
480, // `this
569, // `false
595, // `true
525, // `super
724, // `null
820, // `return
414, // `instanceof
181, // `new
629, // `abstract
133, // `assert
1091, // `byte
682, // `case
99, // `catch
371, // `char
130, // `const
1055, // `continue
1165, // `default
890, // `do
121, // `double
233, // `enum
779, // `final
859, // `finally
766, // `float
551, // `goto
187, // `implements
662, // `import
622, // `interface
413, // `long
479, // `native
1128, // `package
709, // `private
788, // `protected
806, // `public
344, // `short
702, // `static
824, // `strictfp
995, // `switch
447, // `synchronized
177, // `throw
1103, // `throws
1082, // `transient
8, // `try
549, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
-1, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
973, // "a"
1139, // "b"
914, // "s"
1059, // "t"
626, // "r"
223, // "c"
182, // "e"
MIN_REDUCTION+99, // "o"
1014, // "l"
437, // "n"
MIN_REDUCTION+99, // "k"
MIN_REDUCTION+99, // "y"
MIN_REDUCTION+99, // "h"
1006, // "i"
MIN_REDUCTION+99, // "u"
734, // "d"
879, // "f"
MIN_REDUCTION+99, // "m"
MIN_REDUCTION+99, // "x"
1068, // "g"
293, // "p"
94, // "v"
12, // "w"
MIN_REDUCTION+99, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
736, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+99, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+99, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+99, // $
MIN_REDUCTION+99, // $NT
  }
,
{ // state 913
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 914
96,257, // "t"
104,98, // "y"
105,452, // "h"
107,237, // "u"
115,672, // "w"
  }
,
{ // state 915
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 916
171,MIN_REDUCTION+220, // $NT
  }
,
{ // state 917
0x80000000|951, // match move
0x80000000|301, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 918
0x80000000|1143, // match move
0x80000000|46, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 919
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 920
171,MIN_REDUCTION+190, // $NT
  }
,
{ // state 921
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 922
-1, // $$start
-1, // start
476, // ws*
-1, // $$0
MIN_REDUCTION+258, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+258, // $
-1, // $NT
  }
,
{ // state 923
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 924
MIN_REDUCTION+330, // (default reduction)
  }
,
{ // state 925
101,512, // "l"
106,1054, // "i"
  }
,
{ // state 926
0x80000000|729, // match move
0x80000000|842, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 927
MIN_REDUCTION+348, // (default reduction)
  }
,
{ // state 928
-1, // $$start
-1, // start
1089, // ws*
-1, // $$0
MIN_REDUCTION+126, // token
89, // `boolean
303, // `class
1154, // `extends
1010, // `void
802, // `int
41, // `while
198, // `if
427, // `else
336, // `for
1160, // `break
480, // `this
569, // `false
595, // `true
525, // `super
724, // `null
820, // `return
414, // `instanceof
181, // `new
629, // `abstract
133, // `assert
1091, // `byte
682, // `case
99, // `catch
371, // `char
130, // `const
1055, // `continue
1165, // `default
890, // `do
121, // `double
233, // `enum
779, // `final
859, // `finally
766, // `float
551, // `goto
187, // `implements
662, // `import
622, // `interface
413, // `long
479, // `native
1128, // `package
709, // `private
788, // `protected
806, // `public
344, // `short
702, // `static
824, // `strictfp
995, // `switch
447, // `synchronized
177, // `throw
1103, // `throws
1082, // `transient
8, // `try
549, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
-1, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
973, // "a"
1139, // "b"
914, // "s"
1059, // "t"
626, // "r"
223, // "c"
182, // "e"
MIN_REDUCTION+126, // "o"
1014, // "l"
437, // "n"
MIN_REDUCTION+126, // "k"
MIN_REDUCTION+126, // "y"
MIN_REDUCTION+126, // "h"
1006, // "i"
MIN_REDUCTION+126, // "u"
734, // "d"
879, // "f"
MIN_REDUCTION+126, // "m"
MIN_REDUCTION+126, // "x"
1068, // "g"
293, // "p"
94, // "v"
12, // "w"
MIN_REDUCTION+126, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
736, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+126, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+126, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+126, // $
MIN_REDUCTION+126, // $NT
  }
,
{ // state 929
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+173, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+173, // $
MIN_REDUCTION+173, // $NT
  }
,
{ // state 930
0x80000000|695, // match move
0x80000000|171, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 931
102,227, // "n"
  }
,
{ // state 932
171,MIN_REDUCTION+206, // $NT
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 933
2,334, // ws*
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 934
171,MIN_REDUCTION+134, // $NT
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 935
-1, // $$start
-1, // start
571, // ws*
-1, // $$0
MIN_REDUCTION+304, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+304, // $
-1, // $NT
  }
,
{ // state 936
-1, // $$start
-1, // start
434, // ws*
-1, // $$0
MIN_REDUCTION+243, // token
89, // `boolean
303, // `class
1154, // `extends
1010, // `void
802, // `int
41, // `while
198, // `if
427, // `else
336, // `for
1160, // `break
480, // `this
569, // `false
595, // `true
525, // `super
724, // `null
820, // `return
414, // `instanceof
181, // `new
629, // `abstract
133, // `assert
1091, // `byte
682, // `case
99, // `catch
371, // `char
130, // `const
1055, // `continue
1165, // `default
890, // `do
121, // `double
233, // `enum
779, // `final
859, // `finally
766, // `float
551, // `goto
187, // `implements
662, // `import
622, // `interface
413, // `long
479, // `native
1128, // `package
709, // `private
788, // `protected
806, // `public
344, // `short
702, // `static
824, // `strictfp
995, // `switch
447, // `synchronized
177, // `throw
1103, // `throws
1082, // `transient
8, // `try
549, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
-1, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
973, // "a"
1139, // "b"
914, // "s"
1059, // "t"
626, // "r"
223, // "c"
182, // "e"
MIN_REDUCTION+243, // "o"
1014, // "l"
437, // "n"
MIN_REDUCTION+243, // "k"
MIN_REDUCTION+243, // "y"
MIN_REDUCTION+243, // "h"
1006, // "i"
MIN_REDUCTION+243, // "u"
734, // "d"
879, // "f"
MIN_REDUCTION+243, // "m"
MIN_REDUCTION+243, // "x"
1068, // "g"
293, // "p"
94, // "v"
12, // "w"
MIN_REDUCTION+243, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
736, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+243, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+243, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+243, // $
MIN_REDUCTION+243, // $NT
  }
,
{ // state 937
0x80000000|160, // match move
0x80000000|1065, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 938
0x80000000|915, // match move
0x80000000|389, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 939
-1, // $$start
-1, // start
28, // ws*
-1, // $$0
MIN_REDUCTION+234, // token
89, // `boolean
303, // `class
1154, // `extends
1010, // `void
802, // `int
41, // `while
198, // `if
427, // `else
336, // `for
1160, // `break
480, // `this
569, // `false
595, // `true
525, // `super
724, // `null
820, // `return
414, // `instanceof
181, // `new
629, // `abstract
133, // `assert
1091, // `byte
682, // `case
99, // `catch
371, // `char
130, // `const
1055, // `continue
1165, // `default
890, // `do
121, // `double
233, // `enum
779, // `final
859, // `finally
766, // `float
551, // `goto
187, // `implements
662, // `import
622, // `interface
413, // `long
479, // `native
1128, // `package
709, // `private
788, // `protected
806, // `public
344, // `short
702, // `static
824, // `strictfp
995, // `switch
447, // `synchronized
177, // `throw
1103, // `throws
1082, // `transient
8, // `try
549, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
-1, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
973, // "a"
1139, // "b"
914, // "s"
1059, // "t"
626, // "r"
223, // "c"
182, // "e"
MIN_REDUCTION+234, // "o"
1014, // "l"
437, // "n"
MIN_REDUCTION+234, // "k"
MIN_REDUCTION+234, // "y"
MIN_REDUCTION+234, // "h"
1006, // "i"
MIN_REDUCTION+234, // "u"
734, // "d"
879, // "f"
MIN_REDUCTION+234, // "m"
MIN_REDUCTION+234, // "x"
1068, // "g"
293, // "p"
94, // "v"
12, // "w"
MIN_REDUCTION+234, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
736, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+234, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+234, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+234, // $
MIN_REDUCTION+234, // $NT
  }
,
{ // state 940
171,MIN_REDUCTION+139, // $NT
  }
,
{ // state 941
100,428, // "o"
101,100, // "l"
  }
,
{ // state 942
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 943
0x80000000|214, // match move
0x80000000|564, // no-match move
0x80000000|1136, // NT-test-match state for printable
  }
,
{ // state 944
-1, // $$start
-1, // start
287, // ws*
-1, // $$0
MIN_REDUCTION+132, // token
89, // `boolean
303, // `class
1154, // `extends
1010, // `void
802, // `int
41, // `while
198, // `if
427, // `else
336, // `for
1160, // `break
480, // `this
569, // `false
595, // `true
525, // `super
724, // `null
820, // `return
414, // `instanceof
181, // `new
629, // `abstract
133, // `assert
1091, // `byte
682, // `case
99, // `catch
371, // `char
130, // `const
1055, // `continue
1165, // `default
890, // `do
121, // `double
233, // `enum
779, // `final
859, // `finally
766, // `float
551, // `goto
187, // `implements
662, // `import
622, // `interface
413, // `long
479, // `native
1128, // `package
709, // `private
788, // `protected
806, // `public
344, // `short
702, // `static
824, // `strictfp
995, // `switch
447, // `synchronized
177, // `throw
1103, // `throws
1082, // `transient
8, // `try
549, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
-1, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
973, // "a"
1139, // "b"
914, // "s"
1059, // "t"
626, // "r"
223, // "c"
182, // "e"
MIN_REDUCTION+132, // "o"
1014, // "l"
437, // "n"
MIN_REDUCTION+132, // "k"
MIN_REDUCTION+132, // "y"
MIN_REDUCTION+132, // "h"
1006, // "i"
MIN_REDUCTION+132, // "u"
734, // "d"
879, // "f"
MIN_REDUCTION+132, // "m"
MIN_REDUCTION+132, // "x"
1068, // "g"
293, // "p"
94, // "v"
12, // "w"
MIN_REDUCTION+132, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
736, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+132, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+132, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+132, // $
MIN_REDUCTION+132, // $NT
  }
,
{ // state 945
171,MIN_REDUCTION+176, // $NT
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 946
0x80000000|1122, // match move
0x80000000|417, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 947
0x80000000|34, // match move
0x80000000|97, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 948
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 949
99,134, // "e"
  }
,
{ // state 950
0x80000000|2, // match move
0x80000000|819, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 951
171,MIN_REDUCTION+92, // $NT
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 952
MIN_REDUCTION+360, // (default reduction)
  }
,
{ // state 953
171,MIN_REDUCTION+217, // $NT
  }
,
{ // state 954
171,MIN_REDUCTION+103, // $NT
  }
,
{ // state 955
0x80000000|1194, // match move
0x80000000|615, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 956
0x80000000|1148, // match move
0x80000000|668, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 957
171,MIN_REDUCTION+232, // $NT
  }
,
{ // state 958
-1, // $$start
-1, // start
6, // ws*
-1, // $$0
MIN_REDUCTION+256, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+256, // $
-1, // $NT
  }
,
{ // state 959
171,MIN_REDUCTION+197, // $NT
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 960
0x80000000|431, // match move
0x80000000|156, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 961
171,MIN_REDUCTION+160, // $NT
  }
,
{ // state 962
0x80000000|180, // match move
0x80000000|80, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 963
-1, // $$start
-1, // start
583, // ws*
-1, // $$0
MIN_REDUCTION+105, // token
89, // `boolean
303, // `class
1154, // `extends
1010, // `void
802, // `int
41, // `while
198, // `if
427, // `else
336, // `for
1160, // `break
480, // `this
569, // `false
595, // `true
525, // `super
724, // `null
820, // `return
414, // `instanceof
181, // `new
629, // `abstract
133, // `assert
1091, // `byte
682, // `case
99, // `catch
371, // `char
130, // `const
1055, // `continue
1165, // `default
890, // `do
121, // `double
233, // `enum
779, // `final
859, // `finally
766, // `float
551, // `goto
187, // `implements
662, // `import
622, // `interface
413, // `long
479, // `native
1128, // `package
709, // `private
788, // `protected
806, // `public
344, // `short
702, // `static
824, // `strictfp
995, // `switch
447, // `synchronized
177, // `throw
1103, // `throws
1082, // `transient
8, // `try
549, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
-1, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
973, // "a"
1139, // "b"
914, // "s"
1059, // "t"
626, // "r"
223, // "c"
182, // "e"
MIN_REDUCTION+105, // "o"
1014, // "l"
437, // "n"
MIN_REDUCTION+105, // "k"
MIN_REDUCTION+105, // "y"
MIN_REDUCTION+105, // "h"
1006, // "i"
MIN_REDUCTION+105, // "u"
734, // "d"
879, // "f"
MIN_REDUCTION+105, // "m"
MIN_REDUCTION+105, // "x"
1068, // "g"
293, // "p"
94, // "v"
12, // "w"
MIN_REDUCTION+105, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
736, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+105, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+105, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+105, // $
MIN_REDUCTION+105, // $NT
  }
,
{ // state 964
0x80000000|1107, // match move
0x80000000|1042, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 965
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 966
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+113, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+113, // $
MIN_REDUCTION+113, // $NT
  }
,
{ // state 967
0x80000000|732, // match move
0x80000000|407, // no-match move
0x80000000|566, // NT-test-match state for digit
  }
,
{ // state 968
171,MIN_REDUCTION+104, // $NT
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 969
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 970
171,MIN_REDUCTION+119, // $NT
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 971
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 972
0x80000000|2, // match move
0x80000000|697, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 973
94,321, // "b"
95,895, // "s"
  }
,
{ // state 974
-1, // $$start
-1, // start
492, // ws*
-1, // $$0
MIN_REDUCTION+290, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+290, // $
-1, // $NT
  }
,
{ // state 975
-1, // $$start
-1, // start
247, // ws*
-1, // $$0
MIN_REDUCTION+272, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+272, // $
-1, // $NT
  }
,
{ // state 976
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+134, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+134, // $
MIN_REDUCTION+134, // $NT
  }
,
{ // state 977
96,950, // "t"
  }
,
{ // state 978
0x80000000|902, // match move
0x80000000|495, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 979
99,329, // "e"
  }
,
{ // state 980
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 981
0x80000000|203, // match move
0x80000000|754, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 982
0x80000000|582, // match move
0x80000000|540, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 983
171,MIN_REDUCTION+229, // $NT
  }
,
{ // state 984
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 985
-1, // $$start
-1, // start
446, // ws*
-1, // $$0
MIN_REDUCTION+284, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
-1, // `=
-1, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
MIN_REDUCTION+284, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+284, // $
-1, // $NT
  }
,
{ // state 986
0x80000000|677, // match move
0x80000000|1130, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 987
100,73, // "o"
  }
,
{ // state 988
171,MIN_REDUCTION+143, // $NT
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 989
96,684, // "t"
  }
,
{ // state 990
171,MIN_REDUCTION+113, // $NT
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 991
101,804, // "l"
  }
,
{ // state 992
96,373, // "t"
  }
,
{ // state 993
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+279, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+279, // $
-1, // $NT
  }
,
{ // state 994
89,280, // letter
92,278, // idChar
93,68, // "a"
94,68, // "b"
95,68, // "s"
96,68, // "t"
97,68, // "r"
98,68, // "c"
99,68, // "e"
100,68, // "o"
101,68, // "l"
102,68, // "n"
103,68, // "k"
104,68, // "y"
105,68, // "h"
106,68, // "i"
107,68, // "u"
108,68, // "d"
109,68, // "f"
110,68, // "m"
111,68, // "x"
112,68, // "g"
113,68, // "p"
114,68, // "v"
115,68, // "w"
116,68, // "z"
143,149, // "0"
145,642, // digit
146,901, // "_"
150,149, // {"1".."9"}
152,68, // {"A".."Z" "j" "q"}
  }
,
{ // state 995
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 996
2,60, // ws*
157,550, // eol
158,1016, // ws
160,654, // comment
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 997
103,562, // "k"
  }
,
{ // state 998
101,577, // "l"
  }
,
{ // state 999
93,269, // "a"
94,269, // "b"
95,269, // "s"
96,269, // "t"
97,269, // "r"
98,269, // "c"
99,269, // "e"
100,269, // "o"
101,269, // "l"
102,269, // "n"
103,269, // "k"
104,269, // "y"
105,269, // "h"
106,269, // "i"
107,269, // "u"
108,269, // "d"
109,269, // "f"
110,269, // "m"
111,269, // "x"
112,269, // "g"
113,269, // "p"
114,269, // "v"
115,269, // "w"
116,269, // "z"
117,269, // "!"
118,269, // "="
119,269, // "%"
120,269, // "&"
121,269, // "|"
122,269, // "+"
123,269, // ","
124,269, // "-"
125,269, // "."
126,704, // "*"
127,762, // "/"
128,269, // ";"
129,269, // "<"
130,269, // ">"
131,269, // "("
132,269, // ")"
133,269, // "["
134,269, // "]"
135,269, // "{"
136,269, // "}"
138,269, // "'"
140,269, // '"'
143,269, // "0"
146,269, // "_"
148,269, // "\"
150,269, // {"1".."9"}
151,269, // {"#".."$" ":" "?".."@" "^" "`" "~"}
152,269, // {"A".."Z" "j" "q"}
153,269, // " "
154,269, // {9}
156,891, // multilineCommentPrintable
157,773, // eol
163,1112, // {10}
164,248, // {13}
  }
,
{ // state 1000
0x80000000|297, // match move
0x80000000|382, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 1001
171,MIN_REDUCTION+158, // $NT
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 1002
-1, // $$start
-1, // start
563, // ws*
-1, // $$0
MIN_REDUCTION+286, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+286, // $
-1, // $NT
  }
,
{ // state 1003
0x80000000|586, // match move
0x80000000|1113, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 1004
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 1005
95,1158, // "s"
  }
,
{ // state 1006
102,1187, // "n"
109,720, // "f"
110,1180, // "m"
  }
,
{ // state 1007
2,446, // ws*
157,550, // eol
158,1016, // ws
160,654, // comment
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 1008
100,150, // "o"
104,1057, // "y"
  }
,
{ // state 1009
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 1010
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 1011
0x80000000|1072, // match move
0x80000000|228, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 1012
0x80000000|30, // match move
0x80000000|985, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 1013
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 1014
100,150, // "o"
  }
,
{ // state 1015
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 1016
171,MIN_REDUCTION+347, // $NT
MIN_REDUCTION+347, // (default reduction)
  }
,
{ // state 1017
0x80000000|404, // match move
0x80000000|809, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 1018
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 1019
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 1020
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+188, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+188, // $
MIN_REDUCTION+188, // $NT
  }
,
{ // state 1021
MIN_REDUCTION+326, // (default reduction)
  }
,
{ // state 1022
0x80000000|347, // match move
0x80000000|221, // no-match move
// T-test match for "=":
118,
  }
,
{ // state 1023
0x80000000|1153, // match move
0x80000000|956, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 1024
0x80000000|900, // match move
0x80000000|1197, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 1025
0x80000000|308, // match move
0x80000000|1198, // no-match move
0x80000000|778, // NT-test-match state for multilineCommentPrintable
  }
,
{ // state 1026
2,893, // ws*
157,550, // eol
158,1016, // ws
160,654, // comment
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 1027
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 1028
4,587, // token
5,89, // `boolean
6,303, // `class
7,1154, // `extends
8,1010, // `void
9,802, // `int
10,41, // `while
11,198, // `if
12,427, // `else
13,336, // `for
14,1160, // `break
15,480, // `this
16,569, // `false
17,595, // `true
18,525, // `super
19,724, // `null
20,820, // `return
21,414, // `instanceof
22,181, // `new
23,629, // `abstract
24,133, // `assert
25,1091, // `byte
26,682, // `case
27,99, // `catch
28,371, // `char
29,130, // `const
30,1055, // `continue
31,1165, // `default
32,890, // `do
33,121, // `double
34,233, // `enum
35,779, // `final
36,859, // `finally
37,766, // `float
38,551, // `goto
39,187, // `implements
40,662, // `import
41,622, // `interface
42,413, // `long
43,479, // `native
44,1128, // `package
45,709, // `private
46,788, // `protected
47,806, // `public
48,344, // `short
49,702, // `static
50,824, // `strictfp
51,995, // `switch
52,447, // `synchronized
53,177, // `throw
54,1103, // `throws
55,1082, // `transient
56,8, // `try
57,549, // `volatile
  }
,
{ // state 1029
93,304, // "a"
  }
,
{ // state 1030
96,451, // "t"
  }
,
{ // state 1031
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 1032
-1, // $$start
-1, // start
661, // ws*
-1, // $$0
MIN_REDUCTION+231, // token
89, // `boolean
303, // `class
1154, // `extends
1010, // `void
802, // `int
41, // `while
198, // `if
427, // `else
336, // `for
1160, // `break
480, // `this
569, // `false
595, // `true
525, // `super
724, // `null
820, // `return
414, // `instanceof
181, // `new
629, // `abstract
133, // `assert
1091, // `byte
682, // `case
99, // `catch
371, // `char
130, // `const
1055, // `continue
1165, // `default
890, // `do
121, // `double
233, // `enum
779, // `final
859, // `finally
766, // `float
551, // `goto
187, // `implements
662, // `import
622, // `interface
413, // `long
479, // `native
1128, // `package
709, // `private
788, // `protected
806, // `public
344, // `short
702, // `static
824, // `strictfp
995, // `switch
447, // `synchronized
177, // `throw
1103, // `throws
1082, // `transient
8, // `try
549, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
-1, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
973, // "a"
1139, // "b"
914, // "s"
125, // "t"
626, // "r"
223, // "c"
182, // "e"
MIN_REDUCTION+231, // "o"
1014, // "l"
437, // "n"
MIN_REDUCTION+231, // "k"
98, // "y"
452, // "h"
1006, // "i"
237, // "u"
734, // "d"
879, // "f"
MIN_REDUCTION+231, // "m"
MIN_REDUCTION+231, // "x"
1068, // "g"
293, // "p"
94, // "v"
665, // "w"
MIN_REDUCTION+231, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
736, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+231, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+231, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+231, // $
MIN_REDUCTION+231, // $NT
  }
,
{ // state 1033
171,MIN_REDUCTION+112, // $NT
  }
,
{ // state 1034
0x80000000|560, // match move
0x80000000|1195, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 1035
2,298, // ws*
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 1036
2,715, // ws*
153,612, // " "
154,612, // {9}
157,550, // eol
158,1016, // ws
159,612, // {12}
163,1146, // {10}
164,733, // {13}
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 1037
0x80000000|188, // match move
0x80000000|711, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 1038
0x80000000|2, // match move
0x80000000|309, // no-match move
// T-test match for "/":
127,
  }
,
{ // state 1039
171,MIN_REDUCTION+239, // $NT
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 1040
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+277, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+277, // $
-1, // $NT
  }
,
{ // state 1041
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 1042
-1, // $$start
-1, // start
339, // ws*
-1, // $$0
MIN_REDUCTION+268, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
-1, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
-1, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
MIN_REDUCTION+268, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+268, // $
-1, // $NT
  }
,
{ // state 1043
89,769, // letter
93,770, // "a"
94,770, // "b"
95,770, // "s"
96,770, // "t"
97,770, // "r"
98,770, // "c"
99,770, // "e"
100,770, // "o"
101,770, // "l"
102,770, // "n"
103,770, // "k"
104,770, // "y"
105,770, // "h"
106,770, // "i"
107,770, // "u"
108,770, // "d"
109,770, // "f"
110,770, // "m"
111,770, // "x"
112,770, // "g"
113,770, // "p"
114,770, // "v"
115,770, // "w"
116,770, // "z"
143,360, // "0"
145,20, // digit
146,1118, // "_"
150,360, // {"1".."9"}
152,770, // {"A".."Z" "j" "q"}
  }
,
{ // state 1044
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 1045
2,571, // ws*
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 1046
99,931, // "e"
  }
,
{ // state 1047
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 1048
0x80000000|988, // match move
0x80000000|408, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 1049
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+259, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+259, // $
-1, // $NT
  }
,
{ // state 1050
99,25, // "e"
  }
,
{ // state 1051
0x80000000|1105, // match move
0x80000000|342, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 1052
171,MIN_REDUCTION+341, // $NT
MIN_REDUCTION+341, // (default reduction)
  }
,
{ // state 1053
0x80000000|1173, // match move
0x80000000|445, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 1054
108,606, // "d"
  }
,
{ // state 1055
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 1056
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 1057
0x80000000|2, // match move
0x80000000|759, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 1058
0x80000000|499, // match move
0x80000000|1020, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 1059
97,750, // "r"
105,638, // "h"
  }
,
{ // state 1060
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 1061
2,492, // ws*
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 1062
124,1177, // "-"
  }
,
{ // state 1063
106,76, // "i"
  }
,
{ // state 1064
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+98, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+98, // $
MIN_REDUCTION+98, // $NT
  }
,
{ // state 1065
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+167, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+167, // $
MIN_REDUCTION+167, // $NT
  }
};
}
private class Initter7{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 1066
2,476, // ws*
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 1067
0x80000000|910, // match move
0x80000000|462, // no-match move
0x80000000|778, // NT-test-match state for multilineCommentPrintable
  }
,
{ // state 1068
100,646, // "o"
  }
,
{ // state 1069
171,MIN_REDUCTION+250, // $NT
  }
,
{ // state 1070
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 1071
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 1072
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 1073
157,386, // eol
163,1146, // {10}
164,733, // {13}
  }
,
{ // state 1074
0x80000000|1093, // match move
0x80000000|917, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 1075
171,MIN_REDUCTION+151, // $NT
  }
,
{ // state 1076
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 1077
94,998, // "b"
  }
,
{ // state 1078
-1, // $$start
-1, // start
55, // ws*
-1, // $$0
MIN_REDUCTION+240, // token
89, // `boolean
303, // `class
1154, // `extends
1010, // `void
802, // `int
41, // `while
198, // `if
427, // `else
336, // `for
1160, // `break
480, // `this
569, // `false
595, // `true
525, // `super
724, // `null
820, // `return
414, // `instanceof
181, // `new
629, // `abstract
133, // `assert
1091, // `byte
682, // `case
99, // `catch
371, // `char
130, // `const
1055, // `continue
1165, // `default
890, // `do
121, // `double
233, // `enum
779, // `final
859, // `finally
766, // `float
551, // `goto
187, // `implements
662, // `import
622, // `interface
413, // `long
479, // `native
1128, // `package
709, // `private
788, // `protected
806, // `public
344, // `short
702, // `static
824, // `strictfp
995, // `switch
447, // `synchronized
177, // `throw
1103, // `throws
1082, // `transient
8, // `try
549, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
-1, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
973, // "a"
1139, // "b"
914, // "s"
1059, // "t"
626, // "r"
223, // "c"
182, // "e"
MIN_REDUCTION+240, // "o"
1014, // "l"
437, // "n"
MIN_REDUCTION+240, // "k"
MIN_REDUCTION+240, // "y"
MIN_REDUCTION+240, // "h"
1006, // "i"
MIN_REDUCTION+240, // "u"
734, // "d"
879, // "f"
MIN_REDUCTION+240, // "m"
MIN_REDUCTION+240, // "x"
1068, // "g"
293, // "p"
94, // "v"
12, // "w"
MIN_REDUCTION+240, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
736, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+240, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+240, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+240, // $
MIN_REDUCTION+240, // $NT
  }
,
{ // state 1079
0x80000000|528, // match move
0x80000000|350, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 1080
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+297, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+297, // $
-1, // $NT
  }
,
{ // state 1081
1,790, // start
2,782, // ws*
3,306, // $$0
4,796, // token
58,984, // `!
59,1186, // `!=
60,801, // `%
61,772, // `&&
62,535, // `*
63,605, // `(
64,316, // `)
65,547, // `{
66,232, // `}
67,835, // `-
68,440, // `+
69,219, // `=
70,660, // `==
71,435, // `[
72,781, // `]
73,13, // `||
74,254, // `<
75,558, // `<=
76,420, // `,
77,1013, // `>
78,537, // `>=
79,459, // `.
80,1056, // `;
81,789, // `++
82,147, // `--
83,710, // `/
84,803, // ID
85,16, // INTLIT
86,286, // STRINGLIT
87,765, // CHARLIT
89,75, // letter
137,795, // intLit2
143,736, // "0"
157,550, // eol
158,1016, // ws
160,654, // comment
168,1152, // token*
  }
,
{ // state 1082
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 1083
0x80000000|201, // match move
0x80000000|545, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 1084
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 1085
101,300, // "l"
  }
,
{ // state 1086
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 1087
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 1088
0x80000000|1028, // match move
0x80000000|741, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 1089
0x80000000|317, // match move
0x80000000|986, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 1090
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 1091
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 1092
0x80000000|1031, // match move
0x80000000|701, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 1093
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 1094
-1, // $$start
-1, // start
1079, // ws*
-1, // $$0
MIN_REDUCTION+222, // token
89, // `boolean
303, // `class
1154, // `extends
1010, // `void
802, // `int
41, // `while
198, // `if
427, // `else
336, // `for
1160, // `break
480, // `this
569, // `false
595, // `true
525, // `super
724, // `null
820, // `return
414, // `instanceof
181, // `new
629, // `abstract
133, // `assert
1091, // `byte
682, // `case
99, // `catch
371, // `char
130, // `const
1055, // `continue
1165, // `default
890, // `do
121, // `double
233, // `enum
779, // `final
859, // `finally
766, // `float
551, // `goto
187, // `implements
662, // `import
622, // `interface
413, // `long
479, // `native
1128, // `package
709, // `private
788, // `protected
806, // `public
344, // `short
702, // `static
824, // `strictfp
995, // `switch
447, // `synchronized
177, // `throw
1103, // `throws
1082, // `transient
8, // `try
549, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
-1, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
973, // "a"
1139, // "b"
914, // "s"
1059, // "t"
626, // "r"
223, // "c"
182, // "e"
MIN_REDUCTION+222, // "o"
1014, // "l"
437, // "n"
MIN_REDUCTION+222, // "k"
MIN_REDUCTION+222, // "y"
MIN_REDUCTION+222, // "h"
1006, // "i"
MIN_REDUCTION+222, // "u"
734, // "d"
879, // "f"
MIN_REDUCTION+222, // "m"
MIN_REDUCTION+222, // "x"
1068, // "g"
293, // "p"
94, // "v"
12, // "w"
MIN_REDUCTION+222, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
736, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+222, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+222, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+222, // $
MIN_REDUCTION+222, // $NT
  }
,
{ // state 1095
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 1096
2,1034, // ws*
157,550, // eol
158,1016, // ws
160,654, // comment
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 1097
0x80000000|439, // match move
0x80000000|325, // no-match move
0x80000000|778, // NT-test-match state for multilineCommentPrintable
  }
,
{ // state 1098
0x80000000|231, // match move
0x80000000|264, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 1099
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+242, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+242, // $
MIN_REDUCTION+242, // $NT
  }
,
{ // state 1100
0x80000000|971, // match move
0x80000000|656, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 1101
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 1102
0x80000000|557, // match move
0x80000000|1106, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 1103
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 1104
171,MIN_REDUCTION+208, // $NT
  }
,
{ // state 1105
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 1106
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+362, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+362, // $
-1, // $NT
  }
,
{ // state 1107
2,339, // ws*
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 1108
102,533, // "n"
  }
,
{ // state 1109
0x80000000|81, // match move
0x80000000|808, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 1110
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+110, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+110, // $
MIN_REDUCTION+110, // $NT
  }
,
{ // state 1111
0x80000000|994, // match move
0x80000000|159, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 1112
0x80000000|456, // match move
0x80000000|467, // no-match move
0x80000000|778, // NT-test-match state for multilineCommentPrintable
  }
,
{ // state 1113
0x80000000|648, // match move
0x80000000|513, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 1114
110,1155, // "m"
  }
,
{ // state 1115
106,453, // "i"
  }
,
{ // state 1116
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+275, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+275, // $
-1, // $NT
  }
,
{ // state 1117
0x80000000|172, // match move
0x80000000|740, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 1118
171,MIN_REDUCTION+313, // $NT
  }
,
{ // state 1119
0x80000000|2, // match move
0x80000000|1199, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 1120
171,MIN_REDUCTION+133, // $NT
  }
,
{ // state 1121
0x80000000|2, // match move
0x80000000|912, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 1122
2,1131, // ws*
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 1123
-1, // $$start
-1, // start
907, // ws*
-1, // $$0
MIN_REDUCTION+300, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+300, // $
-1, // $NT
  }
,
{ // state 1124
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+269, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+269, // $
-1, // $NT
  }
,
{ // state 1125
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+116, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+116, // $
MIN_REDUCTION+116, // $NT
  }
,
{ // state 1126
0x80000000|969, // match move
0x80000000|217, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 1127
0x80000000|1039, // match move
0x80000000|885, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 1128
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 1129
MIN_REDUCTION+316, // (default reduction)
  }
,
{ // state 1130
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+125, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+125, // $
MIN_REDUCTION+125, // $NT
  }
,
{ // state 1131
0x80000000|63, // match move
0x80000000|242, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 1132
0x80000000|383, // match move
0x80000000|267, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 1133
99,837, // "e"
  }
,
{ // state 1134
0x80000000|468, // match move
0x80000000|84, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 1135
112,856, // "g"
  }
,
{ // state 1136
93,42, // "a"
94,42, // "b"
95,42, // "s"
96,42, // "t"
97,42, // "r"
98,42, // "c"
99,42, // "e"
100,42, // "o"
101,42, // "l"
102,42, // "n"
103,42, // "k"
104,42, // "y"
105,42, // "h"
106,42, // "i"
107,42, // "u"
108,42, // "d"
109,42, // "f"
110,42, // "m"
111,42, // "x"
112,42, // "g"
113,42, // "p"
114,42, // "v"
115,42, // "w"
116,42, // "z"
117,42, // "!"
118,42, // "="
119,42, // "%"
120,42, // "&"
121,42, // "|"
122,42, // "+"
123,42, // ","
124,42, // "-"
125,42, // "."
126,42, // "*"
127,42, // "/"
128,42, // ";"
129,42, // "<"
130,42, // ">"
131,42, // "("
132,42, // ")"
133,42, // "["
134,42, // "]"
135,42, // "{"
136,42, // "}"
138,42, // "'"
140,42, // '"'
143,42, // "0"
146,42, // "_"
148,42, // "\"
150,42, // {"1".."9"}
151,42, // {"#".."$" ":" "?".."@" "^" "`" "~"}
152,42, // {"A".."Z" "j" "q"}
153,42, // " "
154,42, // {9}
  }
,
{ // state 1137
-1, // $$start
-1, // start
395, // ws*
-1, // $$0
MIN_REDUCTION+168, // token
89, // `boolean
303, // `class
1154, // `extends
1010, // `void
802, // `int
41, // `while
198, // `if
427, // `else
336, // `for
1160, // `break
480, // `this
569, // `false
595, // `true
525, // `super
724, // `null
820, // `return
414, // `instanceof
181, // `new
629, // `abstract
133, // `assert
1091, // `byte
682, // `case
99, // `catch
371, // `char
130, // `const
1055, // `continue
1165, // `default
890, // `do
121, // `double
233, // `enum
779, // `final
859, // `finally
766, // `float
551, // `goto
187, // `implements
662, // `import
622, // `interface
413, // `long
479, // `native
1128, // `package
709, // `private
788, // `protected
806, // `public
344, // `short
702, // `static
824, // `strictfp
995, // `switch
447, // `synchronized
177, // `throw
1103, // `throws
1082, // `transient
8, // `try
549, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
-1, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
973, // "a"
1139, // "b"
914, // "s"
1059, // "t"
626, // "r"
223, // "c"
182, // "e"
MIN_REDUCTION+168, // "o"
1014, // "l"
437, // "n"
MIN_REDUCTION+168, // "k"
MIN_REDUCTION+168, // "y"
MIN_REDUCTION+168, // "h"
1006, // "i"
MIN_REDUCTION+168, // "u"
734, // "d"
879, // "f"
MIN_REDUCTION+168, // "m"
MIN_REDUCTION+168, // "x"
1068, // "g"
293, // "p"
94, // "v"
12, // "w"
MIN_REDUCTION+168, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
736, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+168, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+168, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+168, // $
MIN_REDUCTION+168, // $NT
  }
,
{ // state 1138
0x80000000|1041, // match move
0x80000000|829, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 1139
97,290, // "r"
100,173, // "o"
104,623, // "y"
  }
,
{ // state 1140
-1, // $$start
-1, // start
18, // ws*
-1, // $$0
MIN_REDUCTION+189, // token
89, // `boolean
303, // `class
1154, // `extends
1010, // `void
802, // `int
41, // `while
198, // `if
427, // `else
336, // `for
1160, // `break
480, // `this
569, // `false
595, // `true
525, // `super
724, // `null
820, // `return
414, // `instanceof
181, // `new
629, // `abstract
133, // `assert
1091, // `byte
682, // `case
99, // `catch
371, // `char
130, // `const
1055, // `continue
1165, // `default
890, // `do
121, // `double
233, // `enum
779, // `final
859, // `finally
766, // `float
551, // `goto
187, // `implements
662, // `import
622, // `interface
413, // `long
479, // `native
1128, // `package
709, // `private
788, // `protected
806, // `public
344, // `short
702, // `static
824, // `strictfp
995, // `switch
447, // `synchronized
177, // `throw
1103, // `throws
1082, // `transient
8, // `try
549, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
-1, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
973, // "a"
1139, // "b"
914, // "s"
1059, // "t"
626, // "r"
223, // "c"
182, // "e"
MIN_REDUCTION+189, // "o"
1014, // "l"
437, // "n"
MIN_REDUCTION+189, // "k"
MIN_REDUCTION+189, // "y"
MIN_REDUCTION+189, // "h"
1006, // "i"
MIN_REDUCTION+189, // "u"
734, // "d"
879, // "f"
MIN_REDUCTION+189, // "m"
MIN_REDUCTION+189, // "x"
1068, // "g"
293, // "p"
94, // "v"
12, // "w"
MIN_REDUCTION+189, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
736, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+189, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+189, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+189, // $
MIN_REDUCTION+189, // $NT
  }
,
{ // state 1141
2,872, // ws*
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 1142
171,MIN_REDUCTION+136, // $NT
  }
,
{ // state 1143
171,MIN_REDUCTION+182, // $NT
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 1144
101,868, // "l"
  }
,
{ // state 1145
MIN_REDUCTION+326, // (default reduction)
  }
,
{ // state 1146
171,MIN_REDUCTION+340, // $NT
MIN_REDUCTION+340, // (default reduction)
  }
,
{ // state 1147
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+107, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+107, // $
MIN_REDUCTION+107, // $NT
  }
,
{ // state 1148
171,MIN_REDUCTION+218, // $NT
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 1149
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 1150
126,192, // "*"
  }
,
{ // state 1151
-1, // $$start
-1, // start
962, // ws*
-1, // $$0
MIN_REDUCTION+204, // token
89, // `boolean
303, // `class
1154, // `extends
1010, // `void
802, // `int
41, // `while
198, // `if
427, // `else
336, // `for
1160, // `break
480, // `this
569, // `false
595, // `true
525, // `super
724, // `null
820, // `return
414, // `instanceof
181, // `new
629, // `abstract
133, // `assert
1091, // `byte
682, // `case
99, // `catch
371, // `char
130, // `const
1055, // `continue
1165, // `default
890, // `do
121, // `double
233, // `enum
779, // `final
859, // `finally
766, // `float
551, // `goto
187, // `implements
662, // `import
622, // `interface
413, // `long
479, // `native
1128, // `package
709, // `private
788, // `protected
806, // `public
344, // `short
702, // `static
824, // `strictfp
995, // `switch
447, // `synchronized
177, // `throw
1103, // `throws
1082, // `transient
8, // `try
549, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
-1, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
973, // "a"
1139, // "b"
914, // "s"
1059, // "t"
626, // "r"
223, // "c"
182, // "e"
MIN_REDUCTION+204, // "o"
1014, // "l"
437, // "n"
MIN_REDUCTION+204, // "k"
MIN_REDUCTION+204, // "y"
MIN_REDUCTION+204, // "h"
1006, // "i"
MIN_REDUCTION+204, // "u"
734, // "d"
879, // "f"
MIN_REDUCTION+204, // "m"
MIN_REDUCTION+204, // "x"
1068, // "g"
293, // "p"
94, // "v"
12, // "w"
MIN_REDUCTION+204, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
736, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+204, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+204, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+204, // $
MIN_REDUCTION+204, // $NT
  }
,
{ // state 1152
0x80000000|1088, // match move
0x80000000|1098, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 1153
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 1154
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 1155
99,600, // "e"
  }
,
{ // state 1156
MIN_REDUCTION+354, // (default reduction)
  }
,
{ // state 1157
0x80000000|2, // match move
0x80000000|138, // no-match move
0x80000000|1043, // NT-test-match state for idChar
  }
,
{ // state 1158
99,330, // "e"
  }
,
{ // state 1159
0x80000000|385, // match move
0x80000000|1064, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 1160
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 1161
171,MIN_REDUCTION+214, // $NT
  }
,
{ // state 1162
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+158, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+158, // $
MIN_REDUCTION+158, // $NT
  }
,
{ // state 1163
0x80000000|403, // match move
0x80000000|132, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 1164
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+236, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+236, // $
MIN_REDUCTION+236, // $NT
  }
,
{ // state 1165
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 1166
2,492, // ws*
157,550, // eol
158,1016, // ws
160,654, // comment
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 1167
2,609, // ws*
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 1168
MIN_REDUCTION+359, // (default reduction)
  }
,
{ // state 1169
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+197, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
803, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
75, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
68, // "a"
68, // "b"
68, // "s"
68, // "t"
68, // "r"
68, // "c"
68, // "e"
68, // "o"
68, // "l"
68, // "n"
68, // "k"
68, // "y"
68, // "h"
68, // "i"
68, // "u"
68, // "d"
68, // "f"
68, // "m"
68, // "x"
68, // "g"
68, // "p"
68, // "v"
68, // "w"
68, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
22, // "0"
418, // digit++
967, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
22, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
68, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
387, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
194, // digit+
MIN_REDUCTION+197, // $
MIN_REDUCTION+197, // $NT
  }
,
{ // state 1170
102,1121, // "n"
  }
,
{ // state 1171
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 1172
171,MIN_REDUCTION+209, // $NT
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 1173
2,810, // ws*
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 1174
171,MIN_REDUCTION+172, // $NT
  }
,
{ // state 1175
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 1176
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 1177
0x80000000|841, // match move
0x80000000|397, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 1178
93,114, // "a"
94,114, // "b"
95,114, // "s"
96,114, // "t"
97,114, // "r"
98,114, // "c"
99,114, // "e"
100,114, // "o"
101,114, // "l"
102,114, // "n"
103,114, // "k"
104,114, // "y"
105,114, // "h"
106,114, // "i"
107,114, // "u"
108,114, // "d"
109,114, // "f"
110,114, // "m"
111,114, // "x"
112,114, // "g"
113,114, // "p"
114,114, // "v"
115,114, // "w"
116,114, // "z"
117,114, // "!"
118,114, // "="
119,114, // "%"
120,114, // "&"
121,114, // "|"
122,114, // "+"
123,114, // ","
124,114, // "-"
125,114, // "."
126,114, // "*"
127,114, // "/"
128,114, // ";"
129,114, // "<"
130,114, // ">"
131,114, // "("
132,114, // ")"
133,114, // "["
134,114, // "]"
135,114, // "{"
136,114, // "}"
139,518, // charPrintable
140,114, // '"'
143,114, // "0"
146,114, // "_"
147,589, // escapeSequence
148,867, // "\"
150,114, // {"1".."9"}
151,114, // {"#".."$" ":" "?".."@" "^" "`" "~"}
152,114, // {"A".."Z" "j" "q"}
153,114, // " "
  }
,
{ // state 1179
0x80000000|1015, // match move
0x80000000|918, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 1180
113,941, // "p"
  }
,
{ // state 1181
157,550, // eol
158,387, // ws
160,654, // comment
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 1182
0x80000000|1047, // match move
0x80000000|1080, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 1183
0x80000000|256, // match move
0x80000000|946, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 1184
106,888, // "i"
  }
,
{ // state 1185
MIN_REDUCTION+352, // (default reduction)
  }
,
{ // state 1186
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 1187
95,882, // "s"
96,220, // "t"
  }
,
{ // state 1188
0x80000000|449, // match move
0x80000000|1017, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 1189
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 1190
2,810, // ws*
157,550, // eol
158,1016, // ws
160,654, // comment
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 1191
0x80000000|469, // match move
0x80000000|52, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 1192
0x80000000|79, // match move
0x80000000|72, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 1193
0x80000000|454, // match move
0x80000000|164, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 1194
2,893, // ws*
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 1195
0x80000000|1027, // match move
0x80000000|39, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 1196
MIN_REDUCTION+343, // (default reduction)
  }
,
{ // state 1197
0x80000000|679, // match move
0x80000000|617, // no-match move
0x80000000|498, // NT-test-match state for reserved
  }
,
{ // state 1198
MIN_REDUCTION+327, // (default reduction)
  }
,
{ // state 1199
-1, // $$start
-1, // start
40, // ws*
-1, // $$0
MIN_REDUCTION+180, // token
89, // `boolean
303, // `class
1154, // `extends
1010, // `void
802, // `int
41, // `while
198, // `if
427, // `else
336, // `for
1160, // `break
480, // `this
569, // `false
595, // `true
525, // `super
724, // `null
820, // `return
414, // `instanceof
181, // `new
629, // `abstract
133, // `assert
1091, // `byte
682, // `case
99, // `catch
371, // `char
130, // `const
1055, // `continue
1165, // `default
890, // `do
121, // `double
233, // `enum
779, // `final
859, // `finally
766, // `float
551, // `goto
187, // `implements
662, // `import
622, // `interface
413, // `long
479, // `native
1128, // `package
709, // `private
788, // `protected
806, // `public
344, // `short
702, // `static
824, // `strictfp
995, // `switch
447, // `synchronized
177, // `throw
1103, // `throws
1082, // `transient
8, // `try
549, // `volatile
984, // `!
1186, // `!=
801, // `%
772, // `&&
535, // `*
605, // `(
316, // `)
547, // `{
232, // `}
835, // `-
440, // `+
219, // `=
660, // `==
435, // `[
781, // `]
13, // `||
254, // `<
558, // `<=
420, // `,
1013, // `>
537, // `>=
459, // `.
1056, // `;
789, // `++
147, // `--
710, // `/
-1, // ID
16, // INTLIT
286, // STRINGLIT
765, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
973, // "a"
1139, // "b"
914, // "s"
1059, // "t"
626, // "r"
223, // "c"
182, // "e"
MIN_REDUCTION+180, // "o"
1014, // "l"
437, // "n"
MIN_REDUCTION+180, // "k"
MIN_REDUCTION+180, // "y"
MIN_REDUCTION+180, // "h"
1006, // "i"
MIN_REDUCTION+180, // "u"
734, // "d"
879, // "f"
MIN_REDUCTION+180, // "m"
MIN_REDUCTION+180, // "x"
1068, // "g"
293, // "p"
94, // "v"
12, // "w"
MIN_REDUCTION+180, // "z"
225, // "!"
683, // "="
466, // "%"
506, // "&"
663, // "|"
658, // "+"
381, // ","
478, // "-"
390, // "."
680, // "*"
124, // "/"
226, // ";"
265, // "<"
1022, // ">"
405, // "("
686, // ")"
56, // "["
27, // "]"
892, // "{"
375, // "}"
795, // intLit2
1178, // "'"
-1, // charPrintable
210, // '"'
-1, // stringPrintable*
-1, // $$2
736, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+180, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+180, // {"A".."Z" "j" "q"}
612, // " "
612, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
550, // eol
1016, // ws
612, // {12}
654, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1146, // {10}
733, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+180, // $
MIN_REDUCTION+180, // $NT
  }
,
};
}
public TokenGrammarParseTable(TokenGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[1200][];
  int doneSoFar = 0;
  doneSoFar += new Initter1().doInit(doneSoFar);
  doneSoFar += new Initter2().doInit(doneSoFar);
  doneSoFar += new Initter3().doInit(doneSoFar);
  doneSoFar += new Initter4().doInit(doneSoFar);
  doneSoFar += new Initter5().doInit(doneSoFar);
  doneSoFar += new Initter6().doInit(doneSoFar);
  doneSoFar += new Initter7().doInit(doneSoFar);
}
public int[] getProdTable() { return prodTable; }
private static int[] prodTable = {
// $$start ::= start
(0<<16)+1,
// $$start ::=
(0<<16)+0,
// start ::= ws* $$0
(1<<16)+2,
// start ::= ws*
(1<<16)+1,
// start ::= $$0
(1<<16)+1,
// token ::= `boolean
(4<<16)+1,
// token ::= `class
(4<<16)+1,
// token ::= `extends
(4<<16)+1,
// token ::= `void
(4<<16)+1,
// token ::= `int
(4<<16)+1,
// token ::= `while
(4<<16)+1,
// token ::= `if
(4<<16)+1,
// token ::= `else
(4<<16)+1,
// token ::= `for
(4<<16)+1,
// token ::= `break
(4<<16)+1,
// token ::= `this
(4<<16)+1,
// token ::= `false
(4<<16)+1,
// token ::= `true
(4<<16)+1,
// token ::= `super
(4<<16)+1,
// token ::= `null
(4<<16)+1,
// token ::= `return
(4<<16)+1,
// token ::= `instanceof
(4<<16)+1,
// token ::= `new
(4<<16)+1,
// token ::= `abstract
(4<<16)+1,
// token ::= `assert
(4<<16)+1,
// token ::= `byte
(4<<16)+1,
// token ::= `case
(4<<16)+1,
// token ::= `catch
(4<<16)+1,
// token ::= `char
(4<<16)+1,
// token ::= `const
(4<<16)+1,
// token ::= `continue
(4<<16)+1,
// token ::= `default
(4<<16)+1,
// token ::= `do
(4<<16)+1,
// token ::= `double
(4<<16)+1,
// token ::= `enum
(4<<16)+1,
// token ::= `final
(4<<16)+1,
// token ::= `finally
(4<<16)+1,
// token ::= `float
(4<<16)+1,
// token ::= `goto
(4<<16)+1,
// token ::= `implements
(4<<16)+1,
// token ::= `import
(4<<16)+1,
// token ::= `interface
(4<<16)+1,
// token ::= `long
(4<<16)+1,
// token ::= `native
(4<<16)+1,
// token ::= `package
(4<<16)+1,
// token ::= `private
(4<<16)+1,
// token ::= `protected
(4<<16)+1,
// token ::= `public
(4<<16)+1,
// token ::= `short
(4<<16)+1,
// token ::= `static
(4<<16)+1,
// token ::= `strictfp
(4<<16)+1,
// token ::= `switch
(4<<16)+1,
// token ::= `synchronized
(4<<16)+1,
// token ::= `throw
(4<<16)+1,
// token ::= `throws
(4<<16)+1,
// token ::= `transient
(4<<16)+1,
// token ::= `try
(4<<16)+1,
// token ::= `volatile
(4<<16)+1,
// token ::= `!
(4<<16)+1,
// token ::= `!=
(4<<16)+1,
// token ::= `%
(4<<16)+1,
// token ::= `&&
(4<<16)+1,
// token ::= `*
(4<<16)+1,
// token ::= `(
(4<<16)+1,
// token ::= `)
(4<<16)+1,
// token ::= `{
(4<<16)+1,
// token ::= `}
(4<<16)+1,
// token ::= `-
(4<<16)+1,
// token ::= `+
(4<<16)+1,
// token ::= `=
(4<<16)+1,
// token ::= `==
(4<<16)+1,
// token ::= `[
(4<<16)+1,
// token ::= `]
(4<<16)+1,
// token ::= `||
(4<<16)+1,
// token ::= `<
(4<<16)+1,
// token ::= `<=
(4<<16)+1,
// token ::= `,
(4<<16)+1,
// token ::= `>
(4<<16)+1,
// token ::= `>=
(4<<16)+1,
// token ::= `.
(4<<16)+1,
// token ::= `;
(4<<16)+1,
// token ::= `++
(4<<16)+1,
// token ::= `--
(4<<16)+1,
// token ::= `/
(4<<16)+1,
// token ::= ID
(4<<16)+1,
// token ::= INTLIT
(4<<16)+1,
// token ::= STRINGLIT
(4<<16)+1,
// token ::= CHARLIT
(4<<16)+1,
// ID ::= !reserved letter idChar** $$1
(84<<16)+3,
// ID ::= !reserved letter idChar**
(84<<16)+2,
// ID ::= !reserved letter !idChar $$1
(84<<16)+2,
// ID ::= !reserved letter !idChar
(84<<16)+1,
// `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar ws*
(23<<16)+9,
// `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar
(23<<16)+8,
// reserved ::= `abstract
(88<<16)+1,
// `assert ::= "a" "s" "s" "e" "r" "t" !idChar ws*
(24<<16)+7,
// `assert ::= "a" "s" "s" "e" "r" "t" !idChar
(24<<16)+6,
// reserved ::= `assert
(88<<16)+1,
// `boolean ::= "b" "o" "o" "l" "e" "a" "n" !idChar ws*
(5<<16)+8,
// `boolean ::= "b" "o" "o" "l" "e" "a" "n" !idChar
(5<<16)+7,
// reserved ::= `boolean
(88<<16)+1,
// `break ::= "b" "r" "e" "a" "k" !idChar ws*
(14<<16)+6,
// `break ::= "b" "r" "e" "a" "k" !idChar
(14<<16)+5,
// reserved ::= `break
(88<<16)+1,
// `byte ::= "b" "y" "t" "e" !idChar ws*
(25<<16)+5,
// `byte ::= "b" "y" "t" "e" !idChar
(25<<16)+4,
// reserved ::= `byte
(88<<16)+1,
// `case ::= "c" "a" "s" "e" !idChar ws*
(26<<16)+5,
// `case ::= "c" "a" "s" "e" !idChar
(26<<16)+4,
// reserved ::= `case
(88<<16)+1,
// `catch ::= "c" "a" "t" "c" "h" !idChar ws*
(27<<16)+6,
// `catch ::= "c" "a" "t" "c" "h" !idChar
(27<<16)+5,
// reserved ::= `catch
(88<<16)+1,
// `char ::= "c" "h" "a" "r" !idChar ws*
(28<<16)+5,
// `char ::= "c" "h" "a" "r" !idChar
(28<<16)+4,
// reserved ::= `char
(88<<16)+1,
// `class ::= "c" "l" "a" "s" "s" !idChar ws*
(6<<16)+6,
// `class ::= "c" "l" "a" "s" "s" !idChar
(6<<16)+5,
// reserved ::= `class
(88<<16)+1,
// `const ::= "c" "o" "n" "s" "t" !idChar ws*
(29<<16)+6,
// `const ::= "c" "o" "n" "s" "t" !idChar
(29<<16)+5,
// reserved ::= `const
(88<<16)+1,
// `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar ws*
(30<<16)+9,
// `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar
(30<<16)+8,
// reserved ::= `continue
(88<<16)+1,
// `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar ws*
(31<<16)+8,
// `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar
(31<<16)+7,
// reserved ::= `default
(88<<16)+1,
// `do ::= "d" "o" !idChar ws*
(32<<16)+3,
// `do ::= "d" "o" !idChar
(32<<16)+2,
// reserved ::= `do
(88<<16)+1,
// `double ::= "d" "o" "u" "b" "l" "e" !idChar ws*
(33<<16)+7,
// `double ::= "d" "o" "u" "b" "l" "e" !idChar
(33<<16)+6,
// reserved ::= `double
(88<<16)+1,
// `else ::= "e" "l" "s" "e" !idChar ws*
(12<<16)+5,
// `else ::= "e" "l" "s" "e" !idChar
(12<<16)+4,
// reserved ::= `else
(88<<16)+1,
// `enum ::= "e" "n" "u" "m" !idChar ws*
(34<<16)+5,
// `enum ::= "e" "n" "u" "m" !idChar
(34<<16)+4,
// reserved ::= `enum
(88<<16)+1,
// `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar ws*
(7<<16)+8,
// `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar
(7<<16)+7,
// reserved ::= `extends
(88<<16)+1,
// `false ::= "f" "a" "l" "s" "e" !idChar ws*
(16<<16)+6,
// `false ::= "f" "a" "l" "s" "e" !idChar
(16<<16)+5,
// reserved ::= `false
(88<<16)+1,
// `final ::= "f" "i" "n" "a" "l" !idChar ws*
(35<<16)+6,
// `final ::= "f" "i" "n" "a" "l" !idChar
(35<<16)+5,
// reserved ::= `final
(88<<16)+1,
// `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar ws*
(36<<16)+8,
// `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar
(36<<16)+7,
// reserved ::= `finally
(88<<16)+1,
// `float ::= "f" "l" "o" "a" "t" !idChar ws*
(37<<16)+6,
// `float ::= "f" "l" "o" "a" "t" !idChar
(37<<16)+5,
// reserved ::= `float
(88<<16)+1,
// `for ::= "f" "o" "r" !idChar ws*
(13<<16)+4,
// `for ::= "f" "o" "r" !idChar
(13<<16)+3,
// reserved ::= `for
(88<<16)+1,
// `goto ::= "g" "o" "t" "o" !idChar ws*
(38<<16)+5,
// `goto ::= "g" "o" "t" "o" !idChar
(38<<16)+4,
// reserved ::= `goto
(88<<16)+1,
// `if ::= "i" "f" !idChar ws*
(11<<16)+3,
// `if ::= "i" "f" !idChar
(11<<16)+2,
// reserved ::= `if
(88<<16)+1,
// `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar ws*
(39<<16)+11,
// `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar
(39<<16)+10,
// reserved ::= `implements
(88<<16)+1,
// `import ::= "i" "m" "p" "o" "r" "t" !idChar ws*
(40<<16)+7,
// `import ::= "i" "m" "p" "o" "r" "t" !idChar
(40<<16)+6,
// reserved ::= `import
(88<<16)+1,
// `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar ws*
(21<<16)+11,
// `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar
(21<<16)+10,
// reserved ::= `instanceof
(88<<16)+1,
// `int ::= "i" "n" "t" !idChar ws*
(9<<16)+4,
// `int ::= "i" "n" "t" !idChar
(9<<16)+3,
// reserved ::= `int
(88<<16)+1,
// `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar ws*
(41<<16)+10,
// `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar
(41<<16)+9,
// reserved ::= `interface
(88<<16)+1,
// `long ::= "l" "o" "n" "g" !idChar ws*
(42<<16)+5,
// `long ::= "l" "o" "n" "g" !idChar
(42<<16)+4,
// reserved ::= `long
(88<<16)+1,
// `native ::= "n" "a" "t" "i" "v" "e" !idChar ws*
(43<<16)+7,
// `native ::= "n" "a" "t" "i" "v" "e" !idChar
(43<<16)+6,
// reserved ::= `native
(88<<16)+1,
// `new ::= "n" "e" "w" !idChar ws*
(22<<16)+4,
// `new ::= "n" "e" "w" !idChar
(22<<16)+3,
// reserved ::= `new
(88<<16)+1,
// `null ::= "n" "u" "l" "l" !idChar ws*
(19<<16)+5,
// `null ::= "n" "u" "l" "l" !idChar
(19<<16)+4,
// reserved ::= `null
(88<<16)+1,
// `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar ws*
(44<<16)+8,
// `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar
(44<<16)+7,
// reserved ::= `package
(88<<16)+1,
// `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar ws*
(45<<16)+8,
// `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar
(45<<16)+7,
// reserved ::= `private
(88<<16)+1,
// `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar ws*
(46<<16)+10,
// `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar
(46<<16)+9,
// reserved ::= `protected
(88<<16)+1,
// `public ::= "p" "u" "b" "l" "i" "c" !idChar ws*
(47<<16)+7,
// `public ::= "p" "u" "b" "l" "i" "c" !idChar
(47<<16)+6,
// reserved ::= `public
(88<<16)+1,
// `return ::= "r" "e" "t" "u" "r" "n" !idChar ws*
(20<<16)+7,
// `return ::= "r" "e" "t" "u" "r" "n" !idChar
(20<<16)+6,
// reserved ::= `return
(88<<16)+1,
// `short ::= "s" "h" "o" "r" "t" !idChar ws*
(48<<16)+6,
// `short ::= "s" "h" "o" "r" "t" !idChar
(48<<16)+5,
// reserved ::= `short
(88<<16)+1,
// `static ::= "s" "t" "a" "t" "i" "c" !idChar ws*
(49<<16)+7,
// `static ::= "s" "t" "a" "t" "i" "c" !idChar
(49<<16)+6,
// reserved ::= `static
(88<<16)+1,
// `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar ws*
(50<<16)+9,
// `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar
(50<<16)+8,
// reserved ::= `strictfp
(88<<16)+1,
// `super ::= "s" "u" "p" "e" "r" !idChar ws*
(18<<16)+6,
// `super ::= "s" "u" "p" "e" "r" !idChar
(18<<16)+5,
// reserved ::= `super
(88<<16)+1,
// `switch ::= "s" "w" "i" "t" "c" "h" !idChar ws*
(51<<16)+7,
// `switch ::= "s" "w" "i" "t" "c" "h" !idChar
(51<<16)+6,
// reserved ::= `switch
(88<<16)+1,
// `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar ws*
(52<<16)+13,
// `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar
(52<<16)+12,
// reserved ::= `synchronized
(88<<16)+1,
// `this ::= "t" "h" "i" "s" !idChar ws*
(15<<16)+5,
// `this ::= "t" "h" "i" "s" !idChar
(15<<16)+4,
// reserved ::= `this
(88<<16)+1,
// `throw ::= "t" "h" "r" "o" "w" !idChar ws*
(53<<16)+6,
// `throw ::= "t" "h" "r" "o" "w" !idChar
(53<<16)+5,
// reserved ::= `throw
(88<<16)+1,
// `throws ::= "t" "h" "r" "o" "w" "s" !idChar ws*
(54<<16)+7,
// `throws ::= "t" "h" "r" "o" "w" "s" !idChar
(54<<16)+6,
// reserved ::= `throws
(88<<16)+1,
// `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar ws*
(55<<16)+10,
// `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar
(55<<16)+9,
// reserved ::= `transient
(88<<16)+1,
// `true ::= "t" "r" "u" "e" !idChar ws*
(17<<16)+5,
// `true ::= "t" "r" "u" "e" !idChar
(17<<16)+4,
// reserved ::= `true
(88<<16)+1,
// `try ::= "t" "r" "y" !idChar ws*
(56<<16)+4,
// `try ::= "t" "r" "y" !idChar
(56<<16)+3,
// reserved ::= `try
(88<<16)+1,
// `void ::= "v" "o" "i" "d" !idChar ws*
(8<<16)+5,
// `void ::= "v" "o" "i" "d" !idChar
(8<<16)+4,
// reserved ::= `void
(88<<16)+1,
// `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar ws*
(57<<16)+9,
// `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar
(57<<16)+8,
// reserved ::= `volatile
(88<<16)+1,
// `while ::= "w" "h" "i" "l" "e" !idChar ws*
(10<<16)+6,
// `while ::= "w" "h" "i" "l" "e" !idChar
(10<<16)+5,
// reserved ::= `while
(88<<16)+1,
// `! ::= "!" !"=" ws*
(58<<16)+2,
// `! ::= "!" !"="
(58<<16)+1,
// `!= ::= "!" "=" ws*
(59<<16)+3,
// `!= ::= "!" "="
(59<<16)+2,
// `% ::= "%" ws*
(60<<16)+2,
// `% ::= "%"
(60<<16)+1,
// `&& ::= "&" "&" ws*
(61<<16)+3,
// `&& ::= "&" "&"
(61<<16)+2,
// `|| ::= "|" "|" ws*
(73<<16)+3,
// `|| ::= "|" "|"
(73<<16)+2,
// `+ ::= "+" !"+" ws*
(68<<16)+2,
// `+ ::= "+" !"+"
(68<<16)+1,
// `++ ::= "+" "+" ws*
(81<<16)+3,
// `++ ::= "+" "+"
(81<<16)+2,
// `, ::= "," ws*
(76<<16)+2,
// `, ::= ","
(76<<16)+1,
// `- ::= "-" !"-" ws*
(67<<16)+2,
// `- ::= "-" !"-"
(67<<16)+1,
// `-- ::= "-" "-" ws*
(82<<16)+3,
// `-- ::= "-" "-"
(82<<16)+2,
// `. ::= "." ws*
(79<<16)+2,
// `. ::= "."
(79<<16)+1,
// `* ::= "*" !"/" ws*
(62<<16)+2,
// `* ::= "*" !"/"
(62<<16)+1,
// `/ ::= "/" !{"*" "/"} ws*
(83<<16)+2,
// `/ ::= "/" !{"*" "/"}
(83<<16)+1,
// `; ::= ";" ws*
(80<<16)+2,
// `; ::= ";"
(80<<16)+1,
// `< ::= "<" !"=" ws*
(74<<16)+2,
// `< ::= "<" !"="
(74<<16)+1,
// `<= ::= "<" "=" ws*
(75<<16)+3,
// `<= ::= "<" "="
(75<<16)+2,
// `= ::= "=" !"=" ws*
(69<<16)+2,
// `= ::= "=" !"="
(69<<16)+1,
// `== ::= "=" "=" ws*
(70<<16)+3,
// `== ::= "=" "="
(70<<16)+2,
// `> ::= ">" !"=" ws*
(77<<16)+2,
// `> ::= ">" !"="
(77<<16)+1,
// `>= ::= ">" "=" ws*
(78<<16)+3,
// `>= ::= ">" "="
(78<<16)+2,
// `( ::= "(" ws*
(63<<16)+2,
// `( ::= "("
(63<<16)+1,
// `) ::= ")" ws*
(64<<16)+2,
// `) ::= ")"
(64<<16)+1,
// `[ ::= "[" ws*
(71<<16)+2,
// `[ ::= "["
(71<<16)+1,
// `] ::= "]" ws*
(72<<16)+2,
// `] ::= "]"
(72<<16)+1,
// `{ ::= "{" ws*
(65<<16)+2,
// `{ ::= "{"
(65<<16)+1,
// `} ::= "}" ws*
(66<<16)+2,
// `} ::= "}"
(66<<16)+1,
// INTLIT ::= intLit2 ws*
(85<<16)+2,
// INTLIT ::= intLit2
(85<<16)+1,
// CHARLIT ::= "'" charPrintable "'" ws*
(87<<16)+4,
// CHARLIT ::= "'" charPrintable "'"
(87<<16)+3,
// STRINGLIT ::= '"' stringPrintable* $$2
(86<<16)+3,
// STRINGLIT ::= '"' $$2
(86<<16)+2,
// intLit2 ::= !"0" digit++
(137<<16)+1,
// intLit2 ::= "0" !idChar
(137<<16)+1,
// idChar ::= letter
(92<<16)+1,
// idChar ::= digit
(92<<16)+1,
// idChar ::= "_"
(92<<16)+1,
// escapeSequence ::= "\" "\"
(147<<16)+2,
// escapeSequence ::= "\" '"'
(147<<16)+2,
// escapeSequence ::= "\" "'"
(147<<16)+2,
// escapeSequence ::= "\" "n"
(147<<16)+2,
// escapeSequence ::= "\" "t"
(147<<16)+2,
// escapeSequence ::= "\" "f"
(147<<16)+2,
// escapeSequence ::= "\" "r"
(147<<16)+2,
// printable ::= {9 " ".."~"}
(149<<16)+1,
// charPrintable ::= {" ".."&" "(".."[" "]".."~"}
(139<<16)+1,
// charPrintable ::= escapeSequence
(139<<16)+1,
// stringPrintable ::= {" ".."!" "#".."[" "]".."~"}
(155<<16)+1,
// stringPrintable ::= escapeSequence
(155<<16)+1,
// multilineCommentPrintable ::= {9 " "..")" "+".."." "0".."~"}
(156<<16)+1,
// multilineCommentPrintable ::= "*" !"/"
(156<<16)+1,
// multilineCommentPrintable ::= "/" !"*"
(156<<16)+1,
// multilineCommentPrintable ::= "/" "*"
(156<<16)+2,
// multilineCommentPrintable ::= eol
(156<<16)+1,
// letter ::= {"A".."Z" "a".."z"}
(89<<16)+1,
// digit ::= {"0".."9"}
(145<<16)+1,
// ws ::= {9 12 " "}
(158<<16)+1,
// ws ::= comment
(158<<16)+1,
// comment ::= "/" "/" printable** eol
(160<<16)+4,
// comment ::= "/" "/" !printable eol
(160<<16)+3,
// comment ::= "/" "*" multilineCommentPrintable** "*" "/"
(160<<16)+5,
// comment ::= "/" "*" !multilineCommentPrintable "*" "/"
(160<<16)+4,
// ws ::= eol
(158<<16)+1,
// eol ::= {10}
(157<<16)+1,
// eol ::= {13} {10}
(157<<16)+2,
// eol ::= {13} !10
(157<<16)+1,
// stringPrintable* ::= stringPrintable* stringPrintable
(141<<16)+2,
// stringPrintable* ::= stringPrintable
(141<<16)+1,
// idChar** ::= idChar* !idChar
(90<<16)+1,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// multilineCommentPrintable** ::= multilineCommentPrintable* !multilineCommentPrintable
(162<<16)+1,
// printable** ::= printable* !printable
(161<<16)+1,
// token* ::= token* token
(168<<16)+2,
// token* ::= token
(168<<16)+1,
// digit++ ::= digit+ !digit
(144<<16)+1,
// digit+ ::= digit
(169<<16)+1,
// digit+ ::= digit+ digit
(169<<16)+2,
// printable* ::= printable* printable
(167<<16)+2,
// printable* ::= printable
(167<<16)+1,
// multilineCommentPrintable* ::= multilineCommentPrintable* multilineCommentPrintable
(166<<16)+2,
// multilineCommentPrintable* ::= multilineCommentPrintable
(166<<16)+1,
// idChar* ::= idChar* idChar
(165<<16)+2,
// idChar* ::= idChar
(165<<16)+1,
// $$0 ::= token*
(3<<16)+1,
// $$1 ::= ws*
(91<<16)+1,
// $$2 ::= '"' ws*
(142<<16)+2,
// $$2 ::= '"'
(142<<16)+1,
};
public int[] getCharMapTable() { return charMapTable; }
private static int[] charMapTable = {
-1, // 0
-1, // 1
-1, // 2
-1, // 3
-1, // 4
-1, // 5
-1, // 6
-1, // 7
-1, // 8
154, // 9
163, // 10
-1, // 11
159, // 12
164, // 13
-1, // 14
-1, // 15
-1, // 16
-1, // 17
-1, // 18
-1, // 19
-1, // 20
-1, // 21
-1, // 22
-1, // 23
-1, // 24
-1, // 25
-1, // 26
-1, // 27
-1, // 28
-1, // 29
-1, // 30
-1, // 31
153, // " "
117, // "!"
140, // '"'
151, // "#"
151, // "$"
119, // "%"
120, // "&"
138, // "'"
131, // "("
132, // ")"
126, // "*"
122, // "+"
123, // ","
124, // "-"
125, // "."
127, // "/"
143, // "0"
150, // "1"
150, // "2"
150, // "3"
150, // "4"
150, // "5"
150, // "6"
150, // "7"
150, // "8"
150, // "9"
151, // ":"
128, // ";"
129, // "<"
118, // "="
130, // ">"
151, // "?"
151, // "@"
152, // "A"
152, // "B"
152, // "C"
152, // "D"
152, // "E"
152, // "F"
152, // "G"
152, // "H"
152, // "I"
152, // "J"
152, // "K"
152, // "L"
152, // "M"
152, // "N"
152, // "O"
152, // "P"
152, // "Q"
152, // "R"
152, // "S"
152, // "T"
152, // "U"
152, // "V"
152, // "W"
152, // "X"
152, // "Y"
152, // "Z"
133, // "["
148, // "\"
134, // "]"
151, // "^"
146, // "_"
151, // "`"
93, // "a"
94, // "b"
98, // "c"
108, // "d"
99, // "e"
109, // "f"
112, // "g"
105, // "h"
106, // "i"
152, // "j"
103, // "k"
101, // "l"
110, // "m"
102, // "n"
100, // "o"
113, // "p"
152, // "q"
97, // "r"
95, // "s"
96, // "t"
107, // "u"
114, // "v"
115, // "w"
111, // "x"
104, // "y"
116, // "z"
135, // "{"
121, // "|"
136, // "}"
151, // "~"
-1, // 127
-1, // 128
-1, // 129
-1, // 130
-1, // 131
-1, // 132
-1, // 133
-1, // 134
-1, // 135
-1, // 136
-1, // 137
-1, // 138
-1, // 139
-1, // 140
-1, // 141
-1, // 142
-1, // 143
-1, // 144
-1, // 145
-1, // 146
-1, // 147
-1, // 148
-1, // 149
-1, // 150
-1, // 151
-1, // 152
-1, // 153
-1, // 154
-1, // 155
-1, // 156
-1, // 157
-1, // 158
-1, // 159
-1, // 160
-1, // 161
-1, // 162
-1, // 163
-1, // 164
-1, // 165
-1, // 166
-1, // 167
-1, // 168
-1, // 169
-1, // 170
-1, // 171
-1, // 172
-1, // 173
-1, // 174
-1, // 175
-1, // 176
-1, // 177
-1, // 178
-1, // 179
-1, // 180
-1, // 181
-1, // 182
-1, // 183
-1, // 184
-1, // 185
-1, // 186
-1, // 187
-1, // 188
-1, // 189
-1, // 190
-1, // 191
-1, // 192
-1, // 193
-1, // 194
-1, // 195
-1, // 196
-1, // 197
-1, // 198
-1, // 199
-1, // 200
-1, // 201
-1, // 202
-1, // 203
-1, // 204
-1, // 205
-1, // 206
-1, // 207
-1, // 208
-1, // 209
-1, // 210
-1, // 211
-1, // 212
-1, // 213
-1, // 214
-1, // 215
-1, // 216
-1, // 217
-1, // 218
-1, // 219
-1, // 220
-1, // 221
-1, // 222
-1, // 223
-1, // 224
-1, // 225
-1, // 226
-1, // 227
-1, // 228
-1, // 229
-1, // 230
-1, // 231
-1, // 232
-1, // 233
-1, // 234
-1, // 235
-1, // 236
-1, // 237
-1, // 238
-1, // 239
-1, // 240
-1, // 241
-1, // 242
-1, // 243
-1, // 244
-1, // 245
-1, // 246
-1, // 247
-1, // 248
-1, // 249
-1, // 250
-1, // 251
-1, // 252
-1, // 253
-1, // 254
-1, // 255
};
public String[] getActionProdNameTable() { return actionProdNameTable; }
private String[] actionProdNameTable = {
"", // 0
"", // 1
"start ::= ws* token*", // 2
"start ::= ws* token*", // 3
"start ::= ws* token*", // 4
"token ::= # `boolean", // 5
"token ::= # `class", // 6
"token ::= # `extends", // 7
"token ::= # `void", // 8
"token ::= # `int", // 9
"token ::= # `while", // 10
"token ::= # `if", // 11
"token ::= # `else", // 12
"token ::= # `for", // 13
"token ::= # `break", // 14
"token ::= # `this", // 15
"token ::= # `false", // 16
"token ::= # `true", // 17
"token ::= # `super", // 18
"token ::= # `null", // 19
"token ::= # `return", // 20
"token ::= # `instanceof", // 21
"token ::= # `new", // 22
"token ::= # `abstract", // 23
"token ::= # `assert", // 24
"token ::= # `byte", // 25
"token ::= # `case", // 26
"token ::= # `catch", // 27
"token ::= # `char", // 28
"token ::= # `const", // 29
"token ::= # `continue", // 30
"token ::= # `default", // 31
"token ::= # `do", // 32
"token ::= # `double", // 33
"token ::= # `enum", // 34
"token ::= # `final", // 35
"token ::= # `finally", // 36
"token ::= # `float", // 37
"token ::= # `goto", // 38
"token ::= # `implements", // 39
"token ::= # `import", // 40
"token ::= # `interface", // 41
"token ::= # `long", // 42
"token ::= # `native", // 43
"token ::= # `package", // 44
"token ::= # `private", // 45
"token ::= # `protected", // 46
"token ::= # `public", // 47
"token ::= # `short", // 48
"token ::= # `static", // 49
"token ::= # `strictfp", // 50
"token ::= # `switch", // 51
"token ::= # `synchronized", // 52
"token ::= # `throw", // 53
"token ::= # `throws", // 54
"token ::= # `transient", // 55
"token ::= # `try", // 56
"token ::= # `volatile", // 57
"token ::= # `!", // 58
"token ::= # `!=", // 59
"token ::= # `%", // 60
"token ::= # `&&", // 61
"token ::= # `*", // 62
"token ::= # `(", // 63
"token ::= # `)", // 64
"token ::= # `{", // 65
"token ::= # `}", // 66
"token ::= # `-", // 67
"token ::= # `+", // 68
"token ::= # `=", // 69
"token ::= # `==", // 70
"token ::= # `[", // 71
"token ::= # `]", // 72
"token ::= # `||", // 73
"token ::= # `<", // 74
"token ::= # `<=", // 75
"token ::= # `,", // 76
"token ::= # `>", // 77
"token ::= # `>=", // 78
"token ::= # `.", // 79
"token ::= # `;", // 80
"token ::= # `++", // 81
"token ::= # `--", // 82
"token ::= # `/", // 83
"token ::= # ID", // 84
"token ::= # INTLIT", // 85
"token ::= # STRINGLIT", // 86
"token ::= # CHARLIT", // 87
"ID ::= !reserved letter idChar** ws*", // 88
"ID ::= !reserved letter idChar** ws*", // 89
"ID ::= !reserved letter idChar** ws*", // 90
"ID ::= !reserved letter idChar** ws*", // 91
"`abstract ::= \"a\" \"b\" \"s\" \"t\" \"r\" \"a\" \"c\" \"t\" !idChar ws*", // 92
"`abstract ::= \"a\" \"b\" \"s\" \"t\" \"r\" \"a\" \"c\" \"t\" !idChar ws*", // 93
"reserved ::= `abstract", // 94
"`assert ::= \"a\" \"s\" \"s\" \"e\" \"r\" \"t\" !idChar ws*", // 95
"`assert ::= \"a\" \"s\" \"s\" \"e\" \"r\" \"t\" !idChar ws*", // 96
"reserved ::= `assert", // 97
"`boolean ::= \"b\" \"o\" \"o\" \"l\" \"e\" \"a\" \"n\" !idChar ws*", // 98
"`boolean ::= \"b\" \"o\" \"o\" \"l\" \"e\" \"a\" \"n\" !idChar ws*", // 99
"reserved ::= `boolean", // 100
"`break ::= \"b\" \"r\" \"e\" \"a\" \"k\" !idChar ws*", // 101
"`break ::= \"b\" \"r\" \"e\" \"a\" \"k\" !idChar ws*", // 102
"reserved ::= `break", // 103
"`byte ::= \"b\" \"y\" \"t\" \"e\" !idChar ws*", // 104
"`byte ::= \"b\" \"y\" \"t\" \"e\" !idChar ws*", // 105
"reserved ::= `byte", // 106
"`case ::= \"c\" \"a\" \"s\" \"e\" !idChar ws*", // 107
"`case ::= \"c\" \"a\" \"s\" \"e\" !idChar ws*", // 108
"reserved ::= `case", // 109
"`catch ::= \"c\" \"a\" \"t\" \"c\" \"h\" !idChar ws*", // 110
"`catch ::= \"c\" \"a\" \"t\" \"c\" \"h\" !idChar ws*", // 111
"reserved ::= `catch", // 112
"`char ::= \"c\" \"h\" \"a\" \"r\" !idChar ws*", // 113
"`char ::= \"c\" \"h\" \"a\" \"r\" !idChar ws*", // 114
"reserved ::= `char", // 115
"`class ::= \"c\" \"l\" \"a\" \"s\" \"s\" !idChar ws*", // 116
"`class ::= \"c\" \"l\" \"a\" \"s\" \"s\" !idChar ws*", // 117
"reserved ::= `class", // 118
"`const ::= \"c\" \"o\" \"n\" \"s\" \"t\" !idChar ws*", // 119
"`const ::= \"c\" \"o\" \"n\" \"s\" \"t\" !idChar ws*", // 120
"reserved ::= `const", // 121
"`continue ::= \"c\" \"o\" \"n\" \"t\" \"i\" \"n\" \"u\" \"e\" !idChar ws*", // 122
"`continue ::= \"c\" \"o\" \"n\" \"t\" \"i\" \"n\" \"u\" \"e\" !idChar ws*", // 123
"reserved ::= `continue", // 124
"`default ::= \"d\" \"e\" \"f\" \"a\" \"u\" \"l\" \"t\" !idChar ws*", // 125
"`default ::= \"d\" \"e\" \"f\" \"a\" \"u\" \"l\" \"t\" !idChar ws*", // 126
"reserved ::= `default", // 127
"`do ::= \"d\" \"o\" !idChar ws*", // 128
"`do ::= \"d\" \"o\" !idChar ws*", // 129
"reserved ::= `do", // 130
"`double ::= \"d\" \"o\" \"u\" \"b\" \"l\" \"e\" !idChar ws*", // 131
"`double ::= \"d\" \"o\" \"u\" \"b\" \"l\" \"e\" !idChar ws*", // 132
"reserved ::= `double", // 133
"`else ::= \"e\" \"l\" \"s\" \"e\" !idChar ws*", // 134
"`else ::= \"e\" \"l\" \"s\" \"e\" !idChar ws*", // 135
"reserved ::= `else", // 136
"`enum ::= \"e\" \"n\" \"u\" \"m\" !idChar ws*", // 137
"`enum ::= \"e\" \"n\" \"u\" \"m\" !idChar ws*", // 138
"reserved ::= `enum", // 139
"`extends ::= \"e\" \"x\" \"t\" \"e\" \"n\" \"d\" \"s\" !idChar ws*", // 140
"`extends ::= \"e\" \"x\" \"t\" \"e\" \"n\" \"d\" \"s\" !idChar ws*", // 141
"reserved ::= `extends", // 142
"`false ::= \"f\" \"a\" \"l\" \"s\" \"e\" !idChar ws*", // 143
"`false ::= \"f\" \"a\" \"l\" \"s\" \"e\" !idChar ws*", // 144
"reserved ::= `false", // 145
"`final ::= \"f\" \"i\" \"n\" \"a\" \"l\" !idChar ws*", // 146
"`final ::= \"f\" \"i\" \"n\" \"a\" \"l\" !idChar ws*", // 147
"reserved ::= `final", // 148
"`finally ::= \"f\" \"i\" \"n\" \"a\" \"l\" \"l\" \"y\" !idChar ws*", // 149
"`finally ::= \"f\" \"i\" \"n\" \"a\" \"l\" \"l\" \"y\" !idChar ws*", // 150
"reserved ::= `finally", // 151
"`float ::= \"f\" \"l\" \"o\" \"a\" \"t\" !idChar ws*", // 152
"`float ::= \"f\" \"l\" \"o\" \"a\" \"t\" !idChar ws*", // 153
"reserved ::= `float", // 154
"`for ::= \"f\" \"o\" \"r\" !idChar ws*", // 155
"`for ::= \"f\" \"o\" \"r\" !idChar ws*", // 156
"reserved ::= `for", // 157
"`goto ::= \"g\" \"o\" \"t\" \"o\" !idChar ws*", // 158
"`goto ::= \"g\" \"o\" \"t\" \"o\" !idChar ws*", // 159
"reserved ::= `goto", // 160
"`if ::= \"i\" \"f\" !idChar ws*", // 161
"`if ::= \"i\" \"f\" !idChar ws*", // 162
"reserved ::= `if", // 163
"`implements ::= \"i\" \"m\" \"p\" \"l\" \"e\" \"m\" \"e\" \"n\" \"t\" \"s\" !idChar ws*", // 164
"`implements ::= \"i\" \"m\" \"p\" \"l\" \"e\" \"m\" \"e\" \"n\" \"t\" \"s\" !idChar ws*", // 165
"reserved ::= `implements", // 166
"`import ::= \"i\" \"m\" \"p\" \"o\" \"r\" \"t\" !idChar ws*", // 167
"`import ::= \"i\" \"m\" \"p\" \"o\" \"r\" \"t\" !idChar ws*", // 168
"reserved ::= `import", // 169
"`instanceof ::= \"i\" \"n\" \"s\" \"t\" \"a\" \"n\" \"c\" \"e\" \"o\" \"f\" !idChar ws*", // 170
"`instanceof ::= \"i\" \"n\" \"s\" \"t\" \"a\" \"n\" \"c\" \"e\" \"o\" \"f\" !idChar ws*", // 171
"reserved ::= `instanceof", // 172
"`int ::= \"i\" \"n\" \"t\" !idChar ws*", // 173
"`int ::= \"i\" \"n\" \"t\" !idChar ws*", // 174
"reserved ::= `int", // 175
"`interface ::= \"i\" \"n\" \"t\" \"e\" \"r\" \"f\" \"a\" \"c\" \"e\" !idChar ws*", // 176
"`interface ::= \"i\" \"n\" \"t\" \"e\" \"r\" \"f\" \"a\" \"c\" \"e\" !idChar ws*", // 177
"reserved ::= `interface", // 178
"`long ::= \"l\" \"o\" \"n\" \"g\" !idChar ws*", // 179
"`long ::= \"l\" \"o\" \"n\" \"g\" !idChar ws*", // 180
"reserved ::= `long", // 181
"`native ::= \"n\" \"a\" \"t\" \"i\" \"v\" \"e\" !idChar ws*", // 182
"`native ::= \"n\" \"a\" \"t\" \"i\" \"v\" \"e\" !idChar ws*", // 183
"reserved ::= `native", // 184
"`new ::= \"n\" \"e\" \"w\" !idChar ws*", // 185
"`new ::= \"n\" \"e\" \"w\" !idChar ws*", // 186
"reserved ::= `new", // 187
"`null ::= \"n\" \"u\" \"l\" \"l\" !idChar ws*", // 188
"`null ::= \"n\" \"u\" \"l\" \"l\" !idChar ws*", // 189
"reserved ::= `null", // 190
"`package ::= \"p\" \"a\" \"c\" \"k\" \"a\" \"g\" \"e\" !idChar ws*", // 191
"`package ::= \"p\" \"a\" \"c\" \"k\" \"a\" \"g\" \"e\" !idChar ws*", // 192
"reserved ::= `package", // 193
"`private ::= \"p\" \"r\" \"i\" \"v\" \"a\" \"t\" \"e\" !idChar ws*", // 194
"`private ::= \"p\" \"r\" \"i\" \"v\" \"a\" \"t\" \"e\" !idChar ws*", // 195
"reserved ::= `private", // 196
"`protected ::= \"p\" \"r\" \"o\" \"t\" \"e\" \"c\" \"t\" \"e\" \"d\" !idChar ws*", // 197
"`protected ::= \"p\" \"r\" \"o\" \"t\" \"e\" \"c\" \"t\" \"e\" \"d\" !idChar ws*", // 198
"reserved ::= `protected", // 199
"`public ::= \"p\" \"u\" \"b\" \"l\" \"i\" \"c\" !idChar ws*", // 200
"`public ::= \"p\" \"u\" \"b\" \"l\" \"i\" \"c\" !idChar ws*", // 201
"reserved ::= `public", // 202
"`return ::= \"r\" \"e\" \"t\" \"u\" \"r\" \"n\" !idChar ws*", // 203
"`return ::= \"r\" \"e\" \"t\" \"u\" \"r\" \"n\" !idChar ws*", // 204
"reserved ::= `return", // 205
"`short ::= \"s\" \"h\" \"o\" \"r\" \"t\" !idChar ws*", // 206
"`short ::= \"s\" \"h\" \"o\" \"r\" \"t\" !idChar ws*", // 207
"reserved ::= `short", // 208
"`static ::= \"s\" \"t\" \"a\" \"t\" \"i\" \"c\" !idChar ws*", // 209
"`static ::= \"s\" \"t\" \"a\" \"t\" \"i\" \"c\" !idChar ws*", // 210
"reserved ::= `static", // 211
"`strictfp ::= \"s\" \"t\" \"r\" \"i\" \"c\" \"t\" \"f\" \"p\" !idChar ws*", // 212
"`strictfp ::= \"s\" \"t\" \"r\" \"i\" \"c\" \"t\" \"f\" \"p\" !idChar ws*", // 213
"reserved ::= `strictfp", // 214
"`super ::= \"s\" \"u\" \"p\" \"e\" \"r\" !idChar ws*", // 215
"`super ::= \"s\" \"u\" \"p\" \"e\" \"r\" !idChar ws*", // 216
"reserved ::= `super", // 217
"`switch ::= \"s\" \"w\" \"i\" \"t\" \"c\" \"h\" !idChar ws*", // 218
"`switch ::= \"s\" \"w\" \"i\" \"t\" \"c\" \"h\" !idChar ws*", // 219
"reserved ::= `switch", // 220
"`synchronized ::= \"s\" \"y\" \"n\" \"c\" \"h\" \"r\" \"o\" \"n\" \"i\" \"z\" \"e\" \"d\" !idChar ws*", // 221
"`synchronized ::= \"s\" \"y\" \"n\" \"c\" \"h\" \"r\" \"o\" \"n\" \"i\" \"z\" \"e\" \"d\" !idChar ws*", // 222
"reserved ::= `synchronized", // 223
"`this ::= \"t\" \"h\" \"i\" \"s\" !idChar ws*", // 224
"`this ::= \"t\" \"h\" \"i\" \"s\" !idChar ws*", // 225
"reserved ::= `this", // 226
"`throw ::= \"t\" \"h\" \"r\" \"o\" \"w\" !idChar ws*", // 227
"`throw ::= \"t\" \"h\" \"r\" \"o\" \"w\" !idChar ws*", // 228
"reserved ::= `throw", // 229
"`throws ::= \"t\" \"h\" \"r\" \"o\" \"w\" \"s\" !idChar ws*", // 230
"`throws ::= \"t\" \"h\" \"r\" \"o\" \"w\" \"s\" !idChar ws*", // 231
"reserved ::= `throws", // 232
"`transient ::= \"t\" \"r\" \"a\" \"n\" \"s\" \"i\" \"e\" \"n\" \"t\" !idChar ws*", // 233
"`transient ::= \"t\" \"r\" \"a\" \"n\" \"s\" \"i\" \"e\" \"n\" \"t\" !idChar ws*", // 234
"reserved ::= `transient", // 235
"`true ::= \"t\" \"r\" \"u\" \"e\" !idChar ws*", // 236
"`true ::= \"t\" \"r\" \"u\" \"e\" !idChar ws*", // 237
"reserved ::= `true", // 238
"`try ::= \"t\" \"r\" \"y\" !idChar ws*", // 239
"`try ::= \"t\" \"r\" \"y\" !idChar ws*", // 240
"reserved ::= `try", // 241
"`void ::= \"v\" \"o\" \"i\" \"d\" !idChar ws*", // 242
"`void ::= \"v\" \"o\" \"i\" \"d\" !idChar ws*", // 243
"reserved ::= `void", // 244
"`volatile ::= \"v\" \"o\" \"l\" \"a\" \"t\" \"i\" \"l\" \"e\" !idChar ws*", // 245
"`volatile ::= \"v\" \"o\" \"l\" \"a\" \"t\" \"i\" \"l\" \"e\" !idChar ws*", // 246
"reserved ::= `volatile", // 247
"`while ::= \"w\" \"h\" \"i\" \"l\" \"e\" !idChar ws*", // 248
"`while ::= \"w\" \"h\" \"i\" \"l\" \"e\" !idChar ws*", // 249
"reserved ::= `while", // 250
"`! ::= \"!\" !\"=\" ws*", // 251
"`! ::= \"!\" !\"=\" ws*", // 252
"`!= ::= \"!\" \"=\" ws*", // 253
"`!= ::= \"!\" \"=\" ws*", // 254
"`% ::= \"%\" ws*", // 255
"`% ::= \"%\" ws*", // 256
"`&& ::= \"&\" \"&\" ws*", // 257
"`&& ::= \"&\" \"&\" ws*", // 258
"`|| ::= \"|\" \"|\" ws*", // 259
"`|| ::= \"|\" \"|\" ws*", // 260
"`+ ::= \"+\" !\"+\" ws*", // 261
"`+ ::= \"+\" !\"+\" ws*", // 262
"`++ ::= \"+\" \"+\" ws*", // 263
"`++ ::= \"+\" \"+\" ws*", // 264
"`, ::= \",\" ws*", // 265
"`, ::= \",\" ws*", // 266
"`- ::= \"-\" !\"-\" ws*", // 267
"`- ::= \"-\" !\"-\" ws*", // 268
"`-- ::= \"-\" \"-\" ws*", // 269
"`-- ::= \"-\" \"-\" ws*", // 270
"`. ::= \".\" ws*", // 271
"`. ::= \".\" ws*", // 272
"`* ::= \"*\" !\"/\" ws*", // 273
"`* ::= \"*\" !\"/\" ws*", // 274
"`/ ::= \"/\" !{\"*\" \"/\"} ws*", // 275
"`/ ::= \"/\" !{\"*\" \"/\"} ws*", // 276
"`; ::= \";\" ws*", // 277
"`; ::= \";\" ws*", // 278
"`< ::= \"<\" !\"=\" ws*", // 279
"`< ::= \"<\" !\"=\" ws*", // 280
"`<= ::= \"<\" \"=\" ws*", // 281
"`<= ::= \"<\" \"=\" ws*", // 282
"`= ::= \"=\" !\"=\" ws*", // 283
"`= ::= \"=\" !\"=\" ws*", // 284
"`== ::= \"=\" \"=\" ws*", // 285
"`== ::= \"=\" \"=\" ws*", // 286
"`> ::= \">\" !\"=\" ws*", // 287
"`> ::= \">\" !\"=\" ws*", // 288
"`>= ::= \">\" \"=\" ws*", // 289
"`>= ::= \">\" \"=\" ws*", // 290
"`( ::= \"(\" ws*", // 291
"`( ::= \"(\" ws*", // 292
"`) ::= \")\" ws*", // 293
"`) ::= \")\" ws*", // 294
"`[ ::= \"[\" ws*", // 295
"`[ ::= \"[\" ws*", // 296
"`] ::= \"]\" ws*", // 297
"`] ::= \"]\" ws*", // 298
"`{ ::= \"{\" ws*", // 299
"`{ ::= \"{\" ws*", // 300
"`} ::= \"}\" ws*", // 301
"`} ::= \"}\" ws*", // 302
"INTLIT ::= # intLit2 ws*", // 303
"INTLIT ::= # intLit2 ws*", // 304
"CHARLIT ::= \"\'\" charPrintable \"\'\" ws*", // 305
"CHARLIT ::= \"\'\" charPrintable \"\'\" ws*", // 306
"STRINGLIT ::= \'\"\' stringPrintable* \'\"\' ws*", // 307
"STRINGLIT ::= \'\"\' stringPrintable* \'\"\' ws*", // 308
"intLit2 ::= !\"0\" digit++", // 309
"intLit2 ::= \"0\" !idChar", // 310
"idChar ::= letter", // 311
"idChar ::= digit", // 312
"idChar ::= \"_\"", // 313
"escapeSequence ::= \"\\\" \"\\\"", // 314
"escapeSequence ::= \"\\\" \'\"\'", // 315
"escapeSequence ::= \"\\\" \"\'\"", // 316
"escapeSequence ::= \"\\\" \"n\"", // 317
"escapeSequence ::= \"\\\" \"t\"", // 318
"escapeSequence ::= \"\\\" \"f\"", // 319
"escapeSequence ::= \"\\\" \"r\"", // 320
"printable ::= {9 \" \"..\"~\"}", // 321
"charPrintable ::= {\" \"..\"&\" \"(\"..\"[\" \"]\"..\"~\"}", // 322
"charPrintable ::= escapeSequence", // 323
"stringPrintable ::= {\" \"..\"!\" \"#\"..\"[\" \"]\"..\"~\"}", // 324
"stringPrintable ::= escapeSequence", // 325
"multilineCommentPrintable ::= {9 \" \"..\")\" \"+\"..\".\" \"0\"..\"~\"}", // 326
"multilineCommentPrintable ::= \"*\" !\"/\"", // 327
"multilineCommentPrintable ::= \"/\" !\"*\"", // 328
"multilineCommentPrintable ::= # \"/\" \"*\"", // 329
"multilineCommentPrintable ::= eol", // 330
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 331
"digit ::= {\"0\"..\"9\"}", // 332
"ws ::= {9 12 \" \"}", // 333
"ws ::= comment", // 334
"comment ::= \"/\" \"/\" printable** eol", // 335
"comment ::= \"/\" \"/\" printable** eol", // 336
"comment ::= \"/\" \"*\" multilineCommentPrintable** \"*\" \"/\"", // 337
"comment ::= \"/\" \"*\" multilineCommentPrintable** \"*\" \"/\"", // 338
"ws ::= eol", // 339
"eol ::= {10} registerNewline", // 340
"eol ::= {13} {10} registerNewline", // 341
"eol ::= {13} !10 registerNewline", // 342
"stringPrintable* ::= stringPrintable* stringPrintable", // 343
"stringPrintable* ::= stringPrintable* stringPrintable", // 344
"idChar** ::= idChar* !idChar", // 345
"ws* ::= ws* ws", // 346
"ws* ::= ws* ws", // 347
"multilineCommentPrintable** ::= multilineCommentPrintable* !multilineCommentPrintable", // 348
"printable** ::= printable* !printable", // 349
"token* ::= token* token", // 350
"token* ::= token* token", // 351
"digit++ ::= digit+ !digit", // 352
"digit+ ::= digit", // 353
"digit+ ::= digit+ digit", // 354
"printable* ::= printable* printable", // 355
"printable* ::= printable* printable", // 356
"multilineCommentPrintable* ::= multilineCommentPrintable* multilineCommentPrintable", // 357
"multilineCommentPrintable* ::= multilineCommentPrintable* multilineCommentPrintable", // 358
"idChar* ::= idChar* idChar", // 359
"idChar* ::= idChar* idChar", // 360
"", // 361
"", // 362
"", // 363
"", // 364
};
public int[][] getActionTable() { return actionTable; }
private int[][] actionTable = {
    { // 0: $$start ::= start @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 1: $$start ::= [start] @pass
      ((4<<5)|0x6)/*nullProductionAction:4*/,
    },
    { // 2: start ::= ws* $$0 @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 3: start ::= ws* [token*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 4: start ::= [ws*] $$0 @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
    },
    { // 5: token ::= [#] `boolean @sawBoolean(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 6: token ::= [#] `class @sawClass(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0x5)/*methodCall:1*/,
    },
    { // 7: token ::= [#] `extends @sawExtends(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 8: token ::= [#] `void @sawVoid(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 9: token ::= [#] `int @sawInt(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 10: token ::= [#] `while @sawWhile(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 11: token ::= [#] `if @sawIf(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 12: token ::= [#] `else @sawElse(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((7<<5)|0x5)/*methodCall:7*/,
    },
    { // 13: token ::= [#] `for @sawFor(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 14: token ::= [#] `break @sawBreak(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((9<<5)|0x5)/*methodCall:9*/,
    },
    { // 15: token ::= [#] `this @sawThis(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((10<<5)|0x5)/*methodCall:10*/,
    },
    { // 16: token ::= [#] `false @sawFalse(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 17: token ::= [#] `true @sawTrue(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 18: token ::= [#] `super @sawSuper(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 19: token ::= [#] `null @sawNull(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 20: token ::= [#] `return @sawReturn(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 21: token ::= [#] `instanceof @sawInstanceof(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 22: token ::= [#] `new @sawNew(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 23: token ::= [#] `abstract @sawAbstract(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 24: token ::= [#] `assert @sawAssert(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 25: token ::= [#] `byte @sawByte(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 26: token ::= [#] `case @sawCase(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 27: token ::= [#] `catch @sawCatch(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 28: token ::= [#] `char @sawChar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 29: token ::= [#] `const @sawConst(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 30: token ::= [#] `continue @sawContinue(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 31: token ::= [#] `default @sawDefault(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 32: token ::= [#] `do @sawDo(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 33: token ::= [#] `double @sawDouble(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 34: token ::= [#] `enum @sawEnum(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 35: token ::= [#] `final @sawFinal(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 36: token ::= [#] `finally @sawFinally(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((31<<5)|0x5)/*methodCall:31*/,
    },
    { // 37: token ::= [#] `float @sawFloat(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((32<<5)|0x5)/*methodCall:32*/,
    },
    { // 38: token ::= [#] `goto @sawGoto(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((33<<5)|0x5)/*methodCall:33*/,
    },
    { // 39: token ::= [#] `implements @sawImplements(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((34<<5)|0x5)/*methodCall:34*/,
    },
    { // 40: token ::= [#] `import @sawImport(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((35<<5)|0x5)/*methodCall:35*/,
    },
    { // 41: token ::= [#] `interface @sawInterface(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((36<<5)|0x5)/*methodCall:36*/,
    },
    { // 42: token ::= [#] `long @sawLong(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((37<<5)|0x5)/*methodCall:37*/,
    },
    { // 43: token ::= [#] `native @sawNative(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((38<<5)|0x5)/*methodCall:38*/,
    },
    { // 44: token ::= [#] `package @sawPackage(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((39<<5)|0x5)/*methodCall:39*/,
    },
    { // 45: token ::= [#] `private @sawPrivate(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((40<<5)|0x5)/*methodCall:40*/,
    },
    { // 46: token ::= [#] `protected @sawProtected(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((41<<5)|0x5)/*methodCall:41*/,
    },
    { // 47: token ::= [#] `public @sawPublic(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((42<<5)|0x5)/*methodCall:42*/,
    },
    { // 48: token ::= [#] `short @sawShort(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((43<<5)|0x5)/*methodCall:43*/,
    },
    { // 49: token ::= [#] `static @sawStatic(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((44<<5)|0x5)/*methodCall:44*/,
    },
    { // 50: token ::= [#] `strictfp @sawStrictfp(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((45<<5)|0x5)/*methodCall:45*/,
    },
    { // 51: token ::= [#] `switch @sawSwitch(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((46<<5)|0x5)/*methodCall:46*/,
    },
    { // 52: token ::= [#] `synchronized @sawSynchronized(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((47<<5)|0x5)/*methodCall:47*/,
    },
    { // 53: token ::= [#] `throw @sawThrow(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((48<<5)|0x5)/*methodCall:48*/,
    },
    { // 54: token ::= [#] `throws @sawThrows(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((49<<5)|0x5)/*methodCall:49*/,
    },
    { // 55: token ::= [#] `transient @sawTransient(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((50<<5)|0x5)/*methodCall:50*/,
    },
    { // 56: token ::= [#] `try @sawTry(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((51<<5)|0x5)/*methodCall:51*/,
    },
    { // 57: token ::= [#] `volatile @sawVolatile(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((52<<5)|0x5)/*methodCall:52*/,
    },
    { // 58: token ::= [#] `! @sawNot(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((53<<5)|0x5)/*methodCall:53*/,
    },
    { // 59: token ::= [#] `!= @sawNotEqual(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((54<<5)|0x5)/*methodCall:54*/,
    },
    { // 60: token ::= [#] `% @sawRemainder(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((55<<5)|0x5)/*methodCall:55*/,
    },
    { // 61: token ::= [#] `&& @sawAnd(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((56<<5)|0x5)/*methodCall:56*/,
    },
    { // 62: token ::= [#] `* @sawTimes(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((57<<5)|0x5)/*methodCall:57*/,
    },
    { // 63: token ::= [#] `( @sawLpar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((58<<5)|0x5)/*methodCall:58*/,
    },
    { // 64: token ::= [#] `) @sawRpar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((59<<5)|0x5)/*methodCall:59*/,
    },
    { // 65: token ::= [#] `{ @sawLbrace(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((60<<5)|0x5)/*methodCall:60*/,
    },
    { // 66: token ::= [#] `} @sawRbrace(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((61<<5)|0x5)/*methodCall:61*/,
    },
    { // 67: token ::= [#] `- @sawMinus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((62<<5)|0x5)/*methodCall:62*/,
    },
    { // 68: token ::= [#] `+ @sawPlus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((63<<5)|0x5)/*methodCall:63*/,
    },
    { // 69: token ::= [#] `= @sawAssign(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((64<<5)|0x5)/*methodCall:64*/,
    },
    { // 70: token ::= [#] `== @sawEqual(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((65<<5)|0x5)/*methodCall:65*/,
    },
    { // 71: token ::= [#] `[ @sawLbrack(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((66<<5)|0x5)/*methodCall:66*/,
    },
    { // 72: token ::= [#] `] @sawRbrack(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((67<<5)|0x5)/*methodCall:67*/,
    },
    { // 73: token ::= [#] `|| @sawOr(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((68<<5)|0x5)/*methodCall:68*/,
    },
    { // 74: token ::= [#] `< @sawLess(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((69<<5)|0x5)/*methodCall:69*/,
    },
    { // 75: token ::= [#] `<= @sawLessEq(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((70<<5)|0x5)/*methodCall:70*/,
    },
    { // 76: token ::= [#] `, @sawComma(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((71<<5)|0x5)/*methodCall:71*/,
    },
    { // 77: token ::= [#] `> @sawGreater(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((72<<5)|0x5)/*methodCall:72*/,
    },
    { // 78: token ::= [#] `>= @sawGreaterEq(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((73<<5)|0x5)/*methodCall:73*/,
    },
    { // 79: token ::= [#] `. @sawDot(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((74<<5)|0x5)/*methodCall:74*/,
    },
    { // 80: token ::= [#] `; @sawSemi(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((75<<5)|0x5)/*methodCall:75*/,
    },
    { // 81: token ::= [#] `++ @sawPlusPlus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((76<<5)|0x5)/*methodCall:76*/,
    },
    { // 82: token ::= [#] `-- @sawMinusMinus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((77<<5)|0x5)/*methodCall:77*/,
    },
    { // 83: token ::= [#] `/ @sawSlash(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((78<<5)|0x5)/*methodCall:78*/,
    },
    { // 84: token ::= [#] ID @identifier(int,String)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((79<<5)|0x5)/*methodCall:79*/,
    },
    { // 85: token ::= [#] INTLIT @intLit(int,int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((80<<5)|0x5)/*methodCall:80*/,
    },
    { // 86: token ::= [#] STRINGLIT @stringLit(int,String)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((81<<5)|0x5)/*methodCall:81*/,
    },
    { // 87: token ::= [#] CHARLIT @charLit(int,int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((82<<5)|0x5)/*methodCall:82*/,
    },
    { // 88: ID ::= !reserved letter idChar** $$1 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x4)/*stringConcat:2*/,
    },
    { // 89: ID ::= !reserved letter idChar** [ws*] @text
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x4)/*stringConcat:2*/,
    },
    { // 90: ID ::= !reserved letter !idChar [idChar**] $$1 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x4)/*stringConcat:2*/,
    },
    { // 91: ID ::= !reserved letter !idChar [idChar**] [ws*] @text
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x4)/*stringConcat:2*/,
    },
    { // 92: `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 93: `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 94: reserved ::= `abstract @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 95: `assert ::= "a" "s" "s" "e" "r" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 96: `assert ::= "a" "s" "s" "e" "r" "t" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 97: reserved ::= `assert @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 98: `boolean ::= "b" "o" "o" "l" "e" "a" "n" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 99: `boolean ::= "b" "o" "o" "l" "e" "a" "n" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 100: reserved ::= `boolean @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 101: `break ::= "b" "r" "e" "a" "k" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 102: `break ::= "b" "r" "e" "a" "k" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 103: reserved ::= `break @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 104: `byte ::= "b" "y" "t" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 105: `byte ::= "b" "y" "t" "e" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 106: reserved ::= `byte @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 107: `case ::= "c" "a" "s" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 108: `case ::= "c" "a" "s" "e" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 109: reserved ::= `case @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 110: `catch ::= "c" "a" "t" "c" "h" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 111: `catch ::= "c" "a" "t" "c" "h" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 112: reserved ::= `catch @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 113: `char ::= "c" "h" "a" "r" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 114: `char ::= "c" "h" "a" "r" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 115: reserved ::= `char @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 116: `class ::= "c" "l" "a" "s" "s" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 117: `class ::= "c" "l" "a" "s" "s" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 118: reserved ::= `class @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 119: `const ::= "c" "o" "n" "s" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 120: `const ::= "c" "o" "n" "s" "t" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 121: reserved ::= `const @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 122: `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 123: `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 124: reserved ::= `continue @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 125: `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 126: `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 127: reserved ::= `default @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 128: `do ::= "d" "o" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 129: `do ::= "d" "o" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 130: reserved ::= `do @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 131: `double ::= "d" "o" "u" "b" "l" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 132: `double ::= "d" "o" "u" "b" "l" "e" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 133: reserved ::= `double @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 134: `else ::= "e" "l" "s" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 135: `else ::= "e" "l" "s" "e" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 136: reserved ::= `else @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 137: `enum ::= "e" "n" "u" "m" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 138: `enum ::= "e" "n" "u" "m" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 139: reserved ::= `enum @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 140: `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 141: `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 142: reserved ::= `extends @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 143: `false ::= "f" "a" "l" "s" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 144: `false ::= "f" "a" "l" "s" "e" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 145: reserved ::= `false @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 146: `final ::= "f" "i" "n" "a" "l" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 147: `final ::= "f" "i" "n" "a" "l" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 148: reserved ::= `final @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 149: `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 150: `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 151: reserved ::= `finally @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 152: `float ::= "f" "l" "o" "a" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 153: `float ::= "f" "l" "o" "a" "t" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 154: reserved ::= `float @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 155: `for ::= "f" "o" "r" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 156: `for ::= "f" "o" "r" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 157: reserved ::= `for @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 158: `goto ::= "g" "o" "t" "o" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 159: `goto ::= "g" "o" "t" "o" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 160: reserved ::= `goto @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 161: `if ::= "i" "f" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 162: `if ::= "i" "f" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 163: reserved ::= `if @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 164: `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x3)/*popOffPushBack:10*/,
    },
    { // 165: `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x3)/*popOffPushBack:10*/,
    },
    { // 166: reserved ::= `implements @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 167: `import ::= "i" "m" "p" "o" "r" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 168: `import ::= "i" "m" "p" "o" "r" "t" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 169: reserved ::= `import @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 170: `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x3)/*popOffPushBack:10*/,
    },
    { // 171: `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x3)/*popOffPushBack:10*/,
    },
    { // 172: reserved ::= `instanceof @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 173: `int ::= "i" "n" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 174: `int ::= "i" "n" "t" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 175: reserved ::= `int @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 176: `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x3)/*popOffPushBack:9*/,
    },
    { // 177: `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x3)/*popOffPushBack:9*/,
    },
    { // 178: reserved ::= `interface @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 179: `long ::= "l" "o" "n" "g" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 180: `long ::= "l" "o" "n" "g" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 181: reserved ::= `long @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 182: `native ::= "n" "a" "t" "i" "v" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 183: `native ::= "n" "a" "t" "i" "v" "e" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 184: reserved ::= `native @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 185: `new ::= "n" "e" "w" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 186: `new ::= "n" "e" "w" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 187: reserved ::= `new @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 188: `null ::= "n" "u" "l" "l" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 189: `null ::= "n" "u" "l" "l" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 190: reserved ::= `null @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 191: `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 192: `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 193: reserved ::= `package @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 194: `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 195: `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 196: reserved ::= `private @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 197: `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x3)/*popOffPushBack:9*/,
    },
    { // 198: `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x3)/*popOffPushBack:9*/,
    },
    { // 199: reserved ::= `protected @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 200: `public ::= "p" "u" "b" "l" "i" "c" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 201: `public ::= "p" "u" "b" "l" "i" "c" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 202: reserved ::= `public @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 203: `return ::= "r" "e" "t" "u" "r" "n" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 204: `return ::= "r" "e" "t" "u" "r" "n" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 205: reserved ::= `return @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 206: `short ::= "s" "h" "o" "r" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 207: `short ::= "s" "h" "o" "r" "t" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 208: reserved ::= `short @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 209: `static ::= "s" "t" "a" "t" "i" "c" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 210: `static ::= "s" "t" "a" "t" "i" "c" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 211: reserved ::= `static @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 212: `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 213: `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 214: reserved ::= `strictfp @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 215: `super ::= "s" "u" "p" "e" "r" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 216: `super ::= "s" "u" "p" "e" "r" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 217: reserved ::= `super @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 218: `switch ::= "s" "w" "i" "t" "c" "h" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 219: `switch ::= "s" "w" "i" "t" "c" "h" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 220: reserved ::= `switch @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 221: `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x3)/*popOffPushBack:12*/,
    },
    { // 222: `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x3)/*popOffPushBack:12*/,
    },
    { // 223: reserved ::= `synchronized @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 224: `this ::= "t" "h" "i" "s" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 225: `this ::= "t" "h" "i" "s" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 226: reserved ::= `this @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 227: `throw ::= "t" "h" "r" "o" "w" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 228: `throw ::= "t" "h" "r" "o" "w" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 229: reserved ::= `throw @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 230: `throws ::= "t" "h" "r" "o" "w" "s" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 231: `throws ::= "t" "h" "r" "o" "w" "s" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 232: reserved ::= `throws @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 233: `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x3)/*popOffPushBack:9*/,
    },
    { // 234: `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x3)/*popOffPushBack:9*/,
    },
    { // 235: reserved ::= `transient @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 236: `true ::= "t" "r" "u" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 237: `true ::= "t" "r" "u" "e" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 238: reserved ::= `true @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 239: `try ::= "t" "r" "y" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 240: `try ::= "t" "r" "y" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 241: reserved ::= `try @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 242: `void ::= "v" "o" "i" "d" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 243: `void ::= "v" "o" "i" "d" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 244: reserved ::= `void @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 245: `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 246: `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 247: reserved ::= `volatile @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 248: `while ::= "w" "h" "i" "l" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 249: `while ::= "w" "h" "i" "l" "e" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 250: reserved ::= `while @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 251: `! ::= "!" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 252: `! ::= "!" !"=" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 253: `!= ::= "!" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 254: `!= ::= "!" "=" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 255: `% ::= "%" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 256: `% ::= "%" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 257: `&& ::= "&" "&" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 258: `&& ::= "&" "&" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 259: `|| ::= "|" "|" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 260: `|| ::= "|" "|" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 261: `+ ::= "+" !"+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 262: `+ ::= "+" !"+" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 263: `++ ::= "+" "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 264: `++ ::= "+" "+" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 265: `, ::= "," ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 266: `, ::= "," [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 267: `- ::= "-" !"-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 268: `- ::= "-" !"-" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 269: `-- ::= "-" "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 270: `-- ::= "-" "-" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 271: `. ::= "." ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 272: `. ::= "." [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 273: `* ::= "*" !"/" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 274: `* ::= "*" !"/" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 275: `/ ::= "/" !{"*" "/"} ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 276: `/ ::= "/" !{"*" "/"} [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 277: `; ::= ";" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 278: `; ::= ";" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 279: `< ::= "<" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 280: `< ::= "<" !"=" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 281: `<= ::= "<" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 282: `<= ::= "<" "=" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 283: `= ::= "=" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 284: `= ::= "=" !"=" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 285: `== ::= "=" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 286: `== ::= "=" "=" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 287: `> ::= ">" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 288: `> ::= ">" !"=" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 289: `>= ::= ">" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 290: `>= ::= ">" "=" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 291: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 292: `( ::= "(" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 293: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 294: `) ::= ")" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 295: `[ ::= "[" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 296: `[ ::= "[" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 297: `] ::= "]" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 298: `] ::= "]" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 299: `{ ::= "{" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 300: `{ ::= "{" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 301: `} ::= "}" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 302: `} ::= "}" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 303: INTLIT ::= [#] intLit2 ws* @convertToInt(int,String)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((83<<5)|0x5)/*methodCall:83*/,
    },
    { // 304: INTLIT ::= [#] intLit2 [ws*] @convertToInt(int,String)=>int
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((83<<5)|0x5)/*methodCall:83*/,
    },
    { // 305: CHARLIT ::= "'" charPrintable "'" ws* @zero(char,char,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 306: CHARLIT ::= "'" charPrintable "'" [ws*] @zero(char,char,char)=>int
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 307: STRINGLIT ::= '"' stringPrintable* $$2 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 308: STRINGLIT ::= '"' [stringPrintable*] $$2 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 309: intLit2 ::= !"0" digit++ @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 310: intLit2 ::= "0" !idChar @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 311: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 312: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 313: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 314: escapeSequence ::= "\" "\" @convertEscapeChar(char,char)=>Character
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 315: escapeSequence ::= "\" '"' @convertEscapeChar(char,char)=>Character
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 316: escapeSequence ::= "\" "'" @convertEscapeChar(char,char)=>Character
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 317: escapeSequence ::= "\" "n" @convertEscapeChar(char,char)=>Character
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 318: escapeSequence ::= "\" "t" @convertEscapeChar(char,char)=>Character
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 319: escapeSequence ::= "\" "f" @convertEscapeChar(char,char)=>Character
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 320: escapeSequence ::= "\" "r" @convertEscapeChar(char,char)=>Character
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 321: printable ::= {9 " ".."~"} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 322: charPrintable ::= {" ".."&" "(".."[" "]".."~"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 323: charPrintable ::= escapeSequence @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 324: stringPrintable ::= {" ".."!" "#".."[" "]".."~"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 325: stringPrintable ::= escapeSequence @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 326: multilineCommentPrintable ::= {9 " "..")" "+".."." "0".."~"} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 327: multilineCommentPrintable ::= "*" !"/" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 328: multilineCommentPrintable ::= "/" !"*" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 329: multilineCommentPrintable ::= [#] "/" "*" @nestedCommentsWarning(int,char,char)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((86<<5)|0x5)/*methodCall:86*/,
    },
    { // 330: multilineCommentPrintable ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 331: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 332: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 333: ws ::= {9 12 " "} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 334: ws ::= comment @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 335: comment ::= "/" "/" printable** eol @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 336: comment ::= "/" "/" !printable [printable**] eol @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 337: comment ::= "/" "*" multilineCommentPrintable** "*" "/" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 338: comment ::= "/" "*" !multilineCommentPrintable [multilineCommentPrintable**] "*" "/" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 339: ws ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 340: eol ::= {10} [registerNewline] @void
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 341: eol ::= {13} {10} [registerNewline] @void
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 342: eol ::= {13} !10 [registerNewline] @void
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 343: stringPrintable* ::= stringPrintable* stringPrintable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 344: stringPrintable* ::= [stringPrintable*] stringPrintable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 345: idChar** ::= idChar* !idChar @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 346: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 347: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
    },
    { // 348: multilineCommentPrintable** ::= multilineCommentPrintable* !multilineCommentPrintable @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 349: printable** ::= printable* !printable @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 350: token* ::= token* token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 351: token* ::= [token*] token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
    },
    { // 352: digit++ ::= digit+ !digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 353: digit+ ::= digit @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 354: digit+ ::= digit+ digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 355: printable* ::= printable* printable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 356: printable* ::= [printable*] printable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
    },
    { // 357: multilineCommentPrintable* ::= multilineCommentPrintable* multilineCommentPrintable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 358: multilineCommentPrintable* ::= [multilineCommentPrintable*] multilineCommentPrintable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
    },
    { // 359: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 360: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 361: $$0 ::= token* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 362: $$1 ::= ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 363: $$2 ::= '"' ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 364: $$2 ::= '"' [ws*] @pass
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
};
public String[] getNullProdNameTable() { return nullProdNameTable; }
private String[] nullProdNameTable = {
    "printable** ::= printable* !printable", // printable**
    "printable* ::=", // printable*
    "stringPrintable* ::=", // stringPrintable*
    "multilineCommentPrintable** ::= multilineCommentPrintable* !multilineCommentPrintable", // multilineCommentPrintable**
    "start ::= ws* token*", // start
    "ws* ::=", // ws*
    "multilineCommentPrintable* ::=", // multilineCommentPrintable*
    "idChar** ::= idChar* !idChar", // idChar**
    "token* ::=", // token*
    "idChar* ::=", // idChar*
    "", // $$start
    "# ::=", // #
    "registerNewline ::= #", // registerNewline
};
public int[][] getNullProductionActionTable() { return nullActionTable; }
private int[][] nullActionTable = {
    { // printable**
      ((1<<5)|0x6)/*nullProductionAction:1*/,
    },
    { // printable*
    },
    { // stringPrintable*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // multilineCommentPrintable**
      ((6<<5)|0x6)/*nullProductionAction:6*/,
    },
    { // start
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
    },
    { // ws*
    },
    { // multilineCommentPrintable*
    },
    { // idChar**
      ((9<<5)|0x6)/*nullProductionAction:9*/,
    },
    { // token*
    },
    { // idChar*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // $$start
      ((4<<5)|0x6)/*nullProductionAction:4*/,
    },
    { // #
      7/*duplicateTop*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // registerNewline
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((87<<5)|0x5)/*methodCall:87*/,
    },
};
public void actionCall(int idx, wrangLR.runtime.SemanticInfo si) {
  switch(idx) {
    default: System.err.println("Internal error--illegal action number: "+idx);break;
    case 0: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawBoolean(parm0);
    }
    break;
    case 1: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawClass(parm0);
    }
    break;
    case 2: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawExtends(parm0);
    }
    break;
    case 3: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawVoid(parm0);
    }
    break;
    case 4: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawInt(parm0);
    }
    break;
    case 5: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawWhile(parm0);
    }
    break;
    case 6: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawIf(parm0);
    }
    break;
    case 7: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawElse(parm0);
    }
    break;
    case 8: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawFor(parm0);
    }
    break;
    case 9: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawBreak(parm0);
    }
    break;
    case 10: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawThis(parm0);
    }
    break;
    case 11: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawFalse(parm0);
    }
    break;
    case 12: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawTrue(parm0);
    }
    break;
    case 13: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawSuper(parm0);
    }
    break;
    case 14: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawNull(parm0);
    }
    break;
    case 15: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawReturn(parm0);
    }
    break;
    case 16: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawInstanceof(parm0);
    }
    break;
    case 17: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawNew(parm0);
    }
    break;
    case 18: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawAbstract(parm0);
    }
    break;
    case 19: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawAssert(parm0);
    }
    break;
    case 20: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawByte(parm0);
    }
    break;
    case 21: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawCase(parm0);
    }
    break;
    case 22: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawCatch(parm0);
    }
    break;
    case 23: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawChar(parm0);
    }
    break;
    case 24: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawConst(parm0);
    }
    break;
    case 25: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawContinue(parm0);
    }
    break;
    case 26: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawDefault(parm0);
    }
    break;
    case 27: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawDo(parm0);
    }
    break;
    case 28: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawDouble(parm0);
    }
    break;
    case 29: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawEnum(parm0);
    }
    break;
    case 30: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawFinal(parm0);
    }
    break;
    case 31: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawFinally(parm0);
    }
    break;
    case 32: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawFloat(parm0);
    }
    break;
    case 33: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawGoto(parm0);
    }
    break;
    case 34: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawImplements(parm0);
    }
    break;
    case 35: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawImport(parm0);
    }
    break;
    case 36: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawInterface(parm0);
    }
    break;
    case 37: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLong(parm0);
    }
    break;
    case 38: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawNative(parm0);
    }
    break;
    case 39: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawPackage(parm0);
    }
    break;
    case 40: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawPrivate(parm0);
    }
    break;
    case 41: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawProtected(parm0);
    }
    break;
    case 42: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawPublic(parm0);
    }
    break;
    case 43: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawShort(parm0);
    }
    break;
    case 44: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawStatic(parm0);
    }
    break;
    case 45: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawStrictfp(parm0);
    }
    break;
    case 46: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawSwitch(parm0);
    }
    break;
    case 47: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawSynchronized(parm0);
    }
    break;
    case 48: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawThrow(parm0);
    }
    break;
    case 49: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawThrows(parm0);
    }
    break;
    case 50: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawTransient(parm0);
    }
    break;
    case 51: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawTry(parm0);
    }
    break;
    case 52: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawVolatile(parm0);
    }
    break;
    case 53: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawNot(parm0);
    }
    break;
    case 54: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawNotEqual(parm0);
    }
    break;
    case 55: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawRemainder(parm0);
    }
    break;
    case 56: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawAnd(parm0);
    }
    break;
    case 57: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawTimes(parm0);
    }
    break;
    case 58: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLpar(parm0);
    }
    break;
    case 59: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawRpar(parm0);
    }
    break;
    case 60: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLbrace(parm0);
    }
    break;
    case 61: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawRbrace(parm0);
    }
    break;
    case 62: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawMinus(parm0);
    }
    break;
    case 63: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawPlus(parm0);
    }
    break;
    case 64: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawAssign(parm0);
    }
    break;
    case 65: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawEqual(parm0);
    }
    break;
    case 66: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLbrack(parm0);
    }
    break;
    case 67: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawRbrack(parm0);
    }
    break;
    case 68: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawOr(parm0);
    }
    break;
    case 69: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLess(parm0);
    }
    break;
    case 70: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLessEq(parm0);
    }
    break;
    case 71: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawComma(parm0);
    }
    break;
    case 72: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawGreater(parm0);
    }
    break;
    case 73: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawGreaterEq(parm0);
    }
    break;
    case 74: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawDot(parm0);
    }
    break;
    case 75: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawSemi(parm0);
    }
    break;
    case 76: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawPlusPlus(parm0);
    }
    break;
    case 77: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawMinusMinus(parm0);
    }
    break;
    case 78: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawSlash(parm0);
    }
    break;
    case 79: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      actionObject.identifier(parm0,parm1);
    }
    break;
    case 80: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      actionObject.intLit(parm0,parm1);
    }
    break;
    case 81: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      actionObject.stringLit(parm0,parm1);
    }
    break;
    case 82: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      actionObject.charLit(parm0,parm1);
    }
    break;
    case 83: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 84: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.zero(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 85: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      Character result = actionObject.convertEscapeChar(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 86: {
      int parm0 = (Integer)si.popPb();
      char parm1 = (Character)si.popPb();
      char parm2 = (Character)si.popPb();
      actionObject.nestedCommentsWarning(parm0,parm1,parm2);
    }
    break;
    case 87: {
      int parm0 = (Integer)si.popPb();
      actionObject.registerNewline(parm0);
    }
    break;
  }
}
private String[] saNameSigTable = {
"void sawBoolean(int)",
"void sawClass(int)",
"void sawExtends(int)",
"void sawVoid(int)",
"void sawInt(int)",
"void sawWhile(int)",
"void sawIf(int)",
"void sawElse(int)",
"void sawFor(int)",
"void sawBreak(int)",
"void sawThis(int)",
"void sawFalse(int)",
"void sawTrue(int)",
"void sawSuper(int)",
"void sawNull(int)",
"void sawReturn(int)",
"void sawInstanceof(int)",
"void sawNew(int)",
"void sawAbstract(int)",
"void sawAssert(int)",
"void sawByte(int)",
"void sawCase(int)",
"void sawCatch(int)",
"void sawChar(int)",
"void sawConst(int)",
"void sawContinue(int)",
"void sawDefault(int)",
"void sawDo(int)",
"void sawDouble(int)",
"void sawEnum(int)",
"void sawFinal(int)",
"void sawFinally(int)",
"void sawFloat(int)",
"void sawGoto(int)",
"void sawImplements(int)",
"void sawImport(int)",
"void sawInterface(int)",
"void sawLong(int)",
"void sawNative(int)",
"void sawPackage(int)",
"void sawPrivate(int)",
"void sawProtected(int)",
"void sawPublic(int)",
"void sawShort(int)",
"void sawStatic(int)",
"void sawStrictfp(int)",
"void sawSwitch(int)",
"void sawSynchronized(int)",
"void sawThrow(int)",
"void sawThrows(int)",
"void sawTransient(int)",
"void sawTry(int)",
"void sawVolatile(int)",
"void sawNot(int)",
"void sawNotEqual(int)",
"void sawRemainder(int)",
"void sawAnd(int)",
"void sawTimes(int)",
"void sawLpar(int)",
"void sawRpar(int)",
"void sawLbrace(int)",
"void sawRbrace(int)",
"void sawMinus(int)",
"void sawPlus(int)",
"void sawAssign(int)",
"void sawEqual(int)",
"void sawLbrack(int)",
"void sawRbrack(int)",
"void sawOr(int)",
"void sawLess(int)",
"void sawLessEq(int)",
"void sawComma(int)",
"void sawGreater(int)",
"void sawGreaterEq(int)",
"void sawDot(int)",
"void sawSemi(int)",
"void sawPlusPlus(int)",
"void sawMinusMinus(int)",
"void sawSlash(int)",
"void identifier(int,String)",
"void intLit(int,int)",
"void stringLit(int,String)",
"void charLit(int,int)",
"int convertToInt(int,String)",
"int zero(char,char,char)",
"Character convertEscapeChar(char,char)",
"void nestedCommentsWarning(int,char,char)",
"void registerNewline(int)",
};
public String[] getSaNameSigTable() {
  return saNameSigTable;
}
private int[] sigCountTable = {
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
2,0,
2,0,
2,0,
2,0,
2,1,
3,1,
2,1,
3,0,
1,0,
};
public int[] getSigCountTable() {
  return sigCountTable;
}
public int[] getSymbolSizeTable() { return symbolSizeTable; }
private int[] symbolSizeTable = {
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    1,
    1,
    1,
    1,
    0,
    1,
    1,
    0,
    1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    1,
    -1,
    1,
    -1,
    1,
    1,
    -1,
    1,
    1,
    -1,
    1,
    -1,
    0,
    -1,
    -1,
    -1,
    -1,
    -1,
    1,
    0,
    0,
    0,
    -1,
    0,
    0,
    0,
    -1,
    -1,
    1,
    0,
    0,
    0,
    1,
    -1,
    -1,
};
public Object vectorToTuple(java.util.Vector<Object> vec) {
  switch (vec.size()) {
  }
  System.err.println("Internal error--illegal Tuple size: "+vec.size());
  return null;
}
}
