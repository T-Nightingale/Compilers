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
private static final int MIN_REDUCTION = 1212;
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
0x80000000|793, // match move
0x80000000|239, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 1
  }
,
{ // state 2
0x80000000|1, // match move
0x80000000|1151, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 3
0x80000000|460, // match move
0x80000000|459, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 4
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 5
99,235, // "e"
  }
,
{ // state 6
2,63, // ws*
157,534, // eol
158,204, // ws
160,634, // comment
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 7
108,747, // "d"
  }
,
{ // state 8
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+283, // $
-1, // $NT
  }
,
{ // state 9
0x80000000|822, // match move
0x80000000|1131, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 10
-1, // $$start
-1, // start
330, // ws*
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
-1, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
-1, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
MIN_REDUCTION+268, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+268, // $
-1, // $NT
  }
,
{ // state 11
96,941, // "t"
  }
,
{ // state 12
-1, // $$start
-1, // start
63, // ws*
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+302, // $
-1, // $NT
  }
,
{ // state 13
105,684, // "h"
  }
,
{ // state 14
0x80000000|1084, // match move
0x80000000|315, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 15
-1, // $$start
-1, // start
1202, // ws*
-1, // $$0
MIN_REDUCTION+225, // token
1137, // `boolean
24, // `class
869, // `extends
61, // `void
792, // `int
1121, // `while
525, // `if
999, // `else
232, // `for
505, // `break
440, // `this
1162, // `false
59, // `true
389, // `super
226, // `null
910, // `return
1097, // `instanceof
891, // `new
837, // `abstract
374, // `assert
776, // `byte
802, // `case
84, // `catch
690, // `char
29, // `const
716, // `continue
547, // `default
1109, // `do
1198, // `double
875, // `enum
1124, // `final
796, // `finally
614, // `float
392, // `goto
718, // `implements
198, // `import
1041, // `interface
688, // `long
419, // `native
145, // `package
1059, // `private
215, // `protected
651, // `public
924, // `short
368, // `static
364, // `strictfp
803, // `switch
444, // `synchronized
1090, // `throw
985, // `throws
320, // `transient
400, // `try
43, // `volatile
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
-1, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
885, // "a"
467, // "b"
995, // "s"
1002, // "t"
431, // "r"
721, // "c"
176, // "e"
MIN_REDUCTION+225, // "o"
100, // "l"
495, // "n"
MIN_REDUCTION+225, // "k"
MIN_REDUCTION+225, // "y"
MIN_REDUCTION+225, // "h"
501, // "i"
MIN_REDUCTION+225, // "u"
18, // "d"
32, // "f"
MIN_REDUCTION+225, // "m"
MIN_REDUCTION+225, // "x"
840, // "g"
269, // "p"
1006, // "v"
13, // "w"
MIN_REDUCTION+225, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
708, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+225, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+225, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+225, // $
MIN_REDUCTION+225, // $NT
  }
,
{ // state 16
106,329, // "i"
  }
,
{ // state 17
0x80000000|240, // match move
0x80000000|104, // no-match move
// T-test match for "*":
126,
  }
,
{ // state 18
99,854, // "e"
100,35, // "o"
  }
,
{ // state 19
171,MIN_REDUCTION+110, // $NT
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 20
100,236, // "o"
  }
,
{ // state 21
0x80000000|89, // match move
0x80000000|1044, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 22
0x80000000|274, // match move
0x80000000|473, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 23
96,478, // "t"
  }
,
{ // state 24
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 25
171,MIN_REDUCTION+312, // $NT
  }
,
{ // state 26
171,MIN_REDUCTION+97, // $NT
  }
,
{ // state 27
0x80000000|67, // match move
0x80000000|1058, // no-match move
0x80000000|545, // NT-test-match state for digit
  }
,
{ // state 28
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+305, // $
-1, // $NT
  }
,
{ // state 29
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 30
MIN_REDUCTION+351, // (default reduction)
  }
,
{ // state 31
0x80000000|1060, // match move
0x80000000|536, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 32
93,575, // "a"
100,275, // "o"
101,1132, // "l"
106,628, // "i"
  }
,
{ // state 33
171,MIN_REDUCTION+221, // $NT
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 34
0x80000000|395, // match move
0x80000000|855, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 35
0x80000000|185, // match move
0x80000000|956, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 36
171,MIN_REDUCTION+230, // $NT
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 37
0x80000000|388, // match move
0x80000000|876, // no-match move
// T-test match for "*":
126,
  }
,
{ // state 38
0x80000000|321, // match move
0x80000000|332, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 39
-1, // $$start
-1, // start
644, // ws*
-1, // $$0
MIN_REDUCTION+231, // token
1137, // `boolean
24, // `class
869, // `extends
61, // `void
792, // `int
1121, // `while
525, // `if
999, // `else
232, // `for
505, // `break
440, // `this
1162, // `false
59, // `true
389, // `super
226, // `null
910, // `return
1097, // `instanceof
891, // `new
837, // `abstract
374, // `assert
776, // `byte
802, // `case
84, // `catch
690, // `char
29, // `const
716, // `continue
547, // `default
1109, // `do
1198, // `double
875, // `enum
1124, // `final
796, // `finally
614, // `float
392, // `goto
718, // `implements
198, // `import
1041, // `interface
688, // `long
419, // `native
145, // `package
1059, // `private
215, // `protected
651, // `public
924, // `short
368, // `static
364, // `strictfp
803, // `switch
444, // `synchronized
1090, // `throw
985, // `throws
320, // `transient
400, // `try
43, // `volatile
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
-1, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
885, // "a"
467, // "b"
995, // "s"
587, // "t"
431, // "r"
721, // "c"
176, // "e"
MIN_REDUCTION+231, // "o"
100, // "l"
495, // "n"
MIN_REDUCTION+231, // "k"
171, // "y"
20, // "h"
501, // "i"
989, // "u"
18, // "d"
32, // "f"
MIN_REDUCTION+231, // "m"
MIN_REDUCTION+231, // "x"
840, // "g"
269, // "p"
1006, // "v"
355, // "w"
MIN_REDUCTION+231, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
708, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+231, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+231, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+231, // $
MIN_REDUCTION+231, // $NT
  }
,
{ // state 40
0x80000000|1045, // match move
0x80000000|277, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 41
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+281, // $
-1, // $NT
  }
,
{ // state 42
0x80000000|570, // match move
0x80000000|1025, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 43
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 44
-1, // $$start
-1, // start
668, // ws*
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
352, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+89, // $
-1, // $NT
  }
,
{ // state 45
171,MIN_REDUCTION+321, // $NT
  }
,
{ // state 46
171,MIN_REDUCTION+101, // $NT
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 47
2,580, // ws*
157,534, // eol
158,204, // ws
160,634, // comment
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 48
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+182, // $
MIN_REDUCTION+182, // $NT
  }
,
{ // state 49
0x80000000|36, // match move
0x80000000|254, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 50
-1, // $$start
-1, // start
3, // ws*
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+256, // $
-1, // $NT
  }
,
{ // state 51
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 52
2,289, // ws*
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 53
96,1103, // "t"
  }
,
{ // state 54
0x80000000|623, // match move
0x80000000|1133, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 55
113,1195, // "p"
  }
,
{ // state 56
93,650, // "a"
94,650, // "b"
95,650, // "s"
96,650, // "t"
97,650, // "r"
98,650, // "c"
99,650, // "e"
100,650, // "o"
101,650, // "l"
102,650, // "n"
103,650, // "k"
104,650, // "y"
105,650, // "h"
106,650, // "i"
107,650, // "u"
108,650, // "d"
109,650, // "f"
110,650, // "m"
111,650, // "x"
112,650, // "g"
113,650, // "p"
114,650, // "v"
115,650, // "w"
116,650, // "z"
117,650, // "!"
118,650, // "="
119,650, // "%"
120,650, // "&"
121,650, // "|"
122,650, // "+"
123,650, // ","
124,650, // "-"
125,650, // "."
126,650, // "*"
127,650, // "/"
128,650, // ";"
129,650, // "<"
130,650, // ">"
131,650, // "("
132,650, // ")"
133,650, // "["
134,650, // "]"
135,650, // "{"
136,650, // "}"
138,650, // "'"
140,650, // '"'
143,650, // "0"
146,650, // "_"
148,650, // "\"
149,408, // printable
150,650, // {"1".."9"}
151,650, // {"#".."$" ":" "?".."@" "^" "`" "~"}
152,650, // {"A".."Z" "j" "q"}
153,650, // " "
154,650, // {9}
161,653, // printable**
167,178, // printable*
  }
,
{ // state 57
0x80000000|1122, // match move
0x80000000|1173, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 58
0x80000000|1, // match move
0x80000000|1176, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 59
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 60
0x80000000|922, // match move
0x80000000|791, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 61
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 62
2,3, // ws*
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 63
0x80000000|853, // match move
0x80000000|1172, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 64
0x80000000|1011, // match move
0x80000000|1037, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 65
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+146, // $
MIN_REDUCTION+146, // $NT
  }
,
{ // state 66
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 67
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 68
171,MIN_REDUCTION+215, // $NT
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 69
0x80000000|754, // match move
0x80000000|398, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 70
2,253, // ws*
157,534, // eol
158,204, // ws
160,634, // comment
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 71
171,MIN_REDUCTION+157, // $NT
  }
,
{ // state 72
2,330, // ws*
157,534, // eol
158,204, // ws
160,634, // comment
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 73
0x80000000|1, // match move
0x80000000|672, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 74
-1, // $$start
-1, // start
1083, // ws*
-1, // $$0
MIN_REDUCTION+126, // token
1137, // `boolean
24, // `class
869, // `extends
61, // `void
792, // `int
1121, // `while
525, // `if
999, // `else
232, // `for
505, // `break
440, // `this
1162, // `false
59, // `true
389, // `super
226, // `null
910, // `return
1097, // `instanceof
891, // `new
837, // `abstract
374, // `assert
776, // `byte
802, // `case
84, // `catch
690, // `char
29, // `const
716, // `continue
547, // `default
1109, // `do
1198, // `double
875, // `enum
1124, // `final
796, // `finally
614, // `float
392, // `goto
718, // `implements
198, // `import
1041, // `interface
688, // `long
419, // `native
145, // `package
1059, // `private
215, // `protected
651, // `public
924, // `short
368, // `static
364, // `strictfp
803, // `switch
444, // `synchronized
1090, // `throw
985, // `throws
320, // `transient
400, // `try
43, // `volatile
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
-1, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
885, // "a"
467, // "b"
995, // "s"
1002, // "t"
431, // "r"
721, // "c"
176, // "e"
MIN_REDUCTION+126, // "o"
100, // "l"
495, // "n"
MIN_REDUCTION+126, // "k"
MIN_REDUCTION+126, // "y"
MIN_REDUCTION+126, // "h"
501, // "i"
MIN_REDUCTION+126, // "u"
18, // "d"
32, // "f"
MIN_REDUCTION+126, // "m"
MIN_REDUCTION+126, // "x"
840, // "g"
269, // "p"
1006, // "v"
13, // "w"
MIN_REDUCTION+126, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
708, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+126, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+126, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+126, // $
MIN_REDUCTION+126, // $NT
  }
,
{ // state 75
171,MIN_REDUCTION+106, // $NT
  }
,
{ // state 76
93,271, // "a"
94,271, // "b"
95,271, // "s"
96,271, // "t"
97,271, // "r"
98,271, // "c"
99,271, // "e"
100,271, // "o"
101,271, // "l"
102,271, // "n"
103,271, // "k"
104,271, // "y"
105,271, // "h"
106,271, // "i"
107,271, // "u"
108,271, // "d"
109,271, // "f"
110,271, // "m"
111,271, // "x"
112,271, // "g"
113,271, // "p"
114,271, // "v"
115,271, // "w"
116,271, // "z"
117,271, // "!"
118,271, // "="
119,271, // "%"
120,271, // "&"
121,271, // "|"
122,271, // "+"
123,271, // ","
124,271, // "-"
125,271, // "."
126,678, // "*"
127,37, // "/"
128,271, // ";"
129,271, // "<"
130,271, // ">"
131,271, // "("
132,271, // ")"
133,271, // "["
134,271, // "]"
135,271, // "{"
136,271, // "}"
138,271, // "'"
140,271, // '"'
143,271, // "0"
146,271, // "_"
148,271, // "\"
150,271, // {"1".."9"}
151,271, // {"#".."$" ":" "?".."@" "^" "`" "~"}
152,271, // {"A".."Z" "j" "q"}
153,271, // " "
154,271, // {9}
156,457, // multilineCommentPrintable
157,750, // eol
162,308, // multilineCommentPrintable**
163,1116, // {10}
164,140, // {13}
166,615, // multilineCommentPrintable*
  }
,
{ // state 77
-1, // $$start
-1, // start
646, // ws*
-1, // $$0
MIN_REDUCTION+117, // token
1137, // `boolean
24, // `class
869, // `extends
61, // `void
792, // `int
1121, // `while
525, // `if
999, // `else
232, // `for
505, // `break
440, // `this
1162, // `false
59, // `true
389, // `super
226, // `null
910, // `return
1097, // `instanceof
891, // `new
837, // `abstract
374, // `assert
776, // `byte
802, // `case
84, // `catch
690, // `char
29, // `const
716, // `continue
547, // `default
1109, // `do
1198, // `double
875, // `enum
1124, // `final
796, // `finally
614, // `float
392, // `goto
718, // `implements
198, // `import
1041, // `interface
688, // `long
419, // `native
145, // `package
1059, // `private
215, // `protected
651, // `public
924, // `short
368, // `static
364, // `strictfp
803, // `switch
444, // `synchronized
1090, // `throw
985, // `throws
320, // `transient
400, // `try
43, // `volatile
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
-1, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
885, // "a"
467, // "b"
995, // "s"
1002, // "t"
431, // "r"
721, // "c"
176, // "e"
MIN_REDUCTION+117, // "o"
100, // "l"
495, // "n"
MIN_REDUCTION+117, // "k"
MIN_REDUCTION+117, // "y"
MIN_REDUCTION+117, // "h"
501, // "i"
MIN_REDUCTION+117, // "u"
18, // "d"
32, // "f"
MIN_REDUCTION+117, // "m"
MIN_REDUCTION+117, // "x"
840, // "g"
269, // "p"
1006, // "v"
13, // "w"
MIN_REDUCTION+117, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
708, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+117, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+117, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+117, // $
MIN_REDUCTION+117, // $NT
  }
,
{ // state 78
0x80000000|847, // match move
0x80000000|378, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 79
0x80000000|1080, // match move
0x80000000|660, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 80
0x80000000|626, // match move
0x80000000|597, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 81
0x80000000|1, // match move
0x80000000|581, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 82
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 83
0x80000000|281, // match move
0x80000000|270, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 84
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 85
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 86
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+248, // $
MIN_REDUCTION+248, // $NT
  }
,
{ // state 87
96,550, // "t"
  }
,
{ // state 88
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 89
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 90
2,249, // ws*
157,534, // eol
158,204, // ws
160,634, // comment
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 91
102,814, // "n"
  }
,
{ // state 92
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+131, // $
MIN_REDUCTION+131, // $NT
  }
,
{ // state 93
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 94
95,147, // "s"
  }
,
{ // state 95
171,MIN_REDUCTION+238, // $NT
  }
,
{ // state 96
102,723, // "n"
  }
,
{ // state 97
96,616, // "t"
  }
,
{ // state 98
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 99
113,1007, // "p"
  }
,
{ // state 100
100,381, // "o"
  }
,
{ // state 101
118,212, // "="
  }
,
{ // state 102
0x80000000|394, // match move
0x80000000|9, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 103
2,890, // ws*
157,534, // eol
158,204, // ws
160,634, // comment
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 104
171,MIN_REDUCTION+328, // $NT
  }
,
{ // state 105
126,466, // "*"
127,280, // "/"
162,308, // multilineCommentPrintable**
166,615, // multilineCommentPrintable*
  }
,
{ // state 106
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 107
97,407, // "r"
101,942, // "l"
102,1093, // "n"
111,53, // "x"
  }
,
{ // state 108
0x80000000|177, // match move
0x80000000|183, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 109
-1, // $$start
-1, // start
1096, // ws*
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+260, // $
-1, // $NT
  }
,
{ // state 110
0x80000000|357, // match move
0x80000000|114, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 111
-1, // $$start
-1, // start
696, // ws*
-1, // $$0
MIN_REDUCTION+123, // token
1137, // `boolean
24, // `class
869, // `extends
61, // `void
792, // `int
1121, // `while
525, // `if
999, // `else
232, // `for
505, // `break
440, // `this
1162, // `false
59, // `true
389, // `super
226, // `null
910, // `return
1097, // `instanceof
891, // `new
837, // `abstract
374, // `assert
776, // `byte
802, // `case
84, // `catch
690, // `char
29, // `const
716, // `continue
547, // `default
1109, // `do
1198, // `double
875, // `enum
1124, // `final
796, // `finally
614, // `float
392, // `goto
718, // `implements
198, // `import
1041, // `interface
688, // `long
419, // `native
145, // `package
1059, // `private
215, // `protected
651, // `public
924, // `short
368, // `static
364, // `strictfp
803, // `switch
444, // `synchronized
1090, // `throw
985, // `throws
320, // `transient
400, // `try
43, // `volatile
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
-1, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
885, // "a"
467, // "b"
995, // "s"
1002, // "t"
431, // "r"
721, // "c"
176, // "e"
MIN_REDUCTION+123, // "o"
100, // "l"
495, // "n"
MIN_REDUCTION+123, // "k"
MIN_REDUCTION+123, // "y"
MIN_REDUCTION+123, // "h"
501, // "i"
MIN_REDUCTION+123, // "u"
18, // "d"
32, // "f"
MIN_REDUCTION+123, // "m"
MIN_REDUCTION+123, // "x"
840, // "g"
269, // "p"
1006, // "v"
13, // "w"
MIN_REDUCTION+123, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
708, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+123, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+123, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+123, // $
MIN_REDUCTION+123, // $NT
  }
,
{ // state 112
MIN_REDUCTION+344, // (default reduction)
  }
,
{ // state 113
0x80000000|830, // match move
0x80000000|136, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 114
-1, // $$start
-1, // start
461, // ws*
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+258, // $
-1, // $NT
  }
,
{ // state 115
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 116
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+364, // (default reduction)
  }
,
{ // state 117
0x80000000|423, // match move
0x80000000|354, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 118
99,1036, // "e"
  }
,
{ // state 119
0x80000000|638, // match move
0x80000000|611, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 120
171,MIN_REDUCTION+233, // $NT
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 121
-1, // $$start
-1, // start
1024, // ws*
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+282, // $
-1, // $NT
  }
,
{ // state 122
-1, // $$start
-1, // start
748, // ws*
-1, // $$0
MIN_REDUCTION+174, // token
1137, // `boolean
24, // `class
869, // `extends
61, // `void
792, // `int
1121, // `while
525, // `if
999, // `else
232, // `for
505, // `break
440, // `this
1162, // `false
59, // `true
389, // `super
226, // `null
910, // `return
1097, // `instanceof
891, // `new
837, // `abstract
374, // `assert
776, // `byte
802, // `case
84, // `catch
690, // `char
29, // `const
716, // `continue
547, // `default
1109, // `do
1198, // `double
875, // `enum
1124, // `final
796, // `finally
614, // `float
392, // `goto
718, // `implements
198, // `import
1041, // `interface
688, // `long
419, // `native
145, // `package
1059, // `private
215, // `protected
651, // `public
924, // `short
368, // `static
364, // `strictfp
803, // `switch
444, // `synchronized
1090, // `throw
985, // `throws
320, // `transient
400, // `try
43, // `volatile
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
-1, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
885, // "a"
467, // "b"
995, // "s"
1002, // "t"
431, // "r"
721, // "c"
107, // "e"
MIN_REDUCTION+174, // "o"
100, // "l"
495, // "n"
MIN_REDUCTION+174, // "k"
MIN_REDUCTION+174, // "y"
MIN_REDUCTION+174, // "h"
501, // "i"
MIN_REDUCTION+174, // "u"
18, // "d"
32, // "f"
MIN_REDUCTION+174, // "m"
MIN_REDUCTION+174, // "x"
840, // "g"
269, // "p"
1006, // "v"
13, // "w"
MIN_REDUCTION+174, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
708, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+174, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+174, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+174, // $
MIN_REDUCTION+174, // $NT
  }
,
{ // state 123
0x80000000|68, // match move
0x80000000|317, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 124
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 125
0x80000000|930, // match move
0x80000000|284, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 126
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+267, // $
-1, // $NT
  }
,
{ // state 127
99,605, // "e"
  }
,
{ // state 128
0x80000000|1, // match move
0x80000000|77, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 129
3,622, // $$0
4,694, // token
58,432, // `!
59,309, // `!=
60,1115, // `%
61,565, // `&&
62,786, // `*
63,450, // `(
64,760, // `)
65,396, // `{
66,1013, // `}
67,155, // `-
68,88, // `+
69,379, // `=
70,849, // `==
71,1001, // `[
72,438, // `]
73,515, // `||
74,997, // `<
75,931, // `<=
76,579, // `,
77,933, // `>
78,446, // `>=
79,1010, // `.
80,1076, // `;
81,510, // `++
82,552, // `--
83,258, // `/
84,213, // ID
85,625, // INTLIT
86,658, // STRINGLIT
87,1067, // CHARLIT
89,307, // letter
137,503, // intLit2
143,708, // "0"
157,534, // eol
158,367, // ws
160,634, // comment
168,1159, // token*
  }
,
{ // state 130
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+233, // $
MIN_REDUCTION+233, // $NT
  }
,
{ // state 131
171,MIN_REDUCTION+148, // $NT
  }
,
{ // state 132
171,MIN_REDUCTION+107, // $NT
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 133
101,823, // "l"
  }
,
{ // state 134
2,429, // ws*
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 135
95,925, // "s"
  }
,
{ // state 136
0x80000000|19, // match move
0x80000000|1111, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 137
-1, // $$start
-1, // start
491, // ws*
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+292, // $
-1, // $NT
  }
,
{ // state 138
171,MIN_REDUCTION+338, // $NT
MIN_REDUCTION+338, // (default reduction)
  }
,
{ // state 139
93,97, // "a"
  }
,
{ // state 140
0x80000000|749, // match move
0x80000000|1123, // no-match move
// T-test match for 10:
163,
  }
,
{ // state 141
2,866, // ws*
157,534, // eol
158,204, // ws
160,634, // comment
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 142
MIN_REDUCTION+356, // (default reduction)
  }
,
{ // state 143
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+301, // $
-1, // $NT
  }
,
{ // state 144
93,91, // "a"
  }
,
{ // state 145
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 146
0x80000000|1, // match move
0x80000000|304, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 147
99,777, // "e"
  }
,
{ // state 148
93,535, // "a"
104,592, // "y"
106,563, // "i"
107,118, // "u"
  }
,
{ // state 149
171,MIN_REDUCTION+196, // $NT
  }
,
{ // state 150
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+255, // $
-1, // $NT
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
{ // state 151
0x80000000|662, // match move
0x80000000|619, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 152
0x80000000|738, // match move
0x80000000|863, // no-match move
// T-test match for "+":
122,
  }
,
{ // state 153
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 154
171,MIN_REDUCTION+226, // $NT
  }
,
{ // state 155
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 156
171,MIN_REDUCTION+181, // $NT
  }
,
{ // state 157
99,464, // "e"
  }
,
{ // state 158
171,MIN_REDUCTION+326, // $NT
  }
,
{ // state 159
0x80000000|857, // match move
0x80000000|902, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 160
109,99, // "f"
  }
,
{ // state 161
0x80000000|861, // match move
0x80000000|987, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 162
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 163
99,918, // "e"
  }
,
{ // state 164
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 165
93,158, // "a"
94,158, // "b"
95,158, // "s"
96,158, // "t"
97,158, // "r"
98,158, // "c"
99,158, // "e"
100,158, // "o"
101,158, // "l"
102,158, // "n"
103,158, // "k"
104,158, // "y"
105,158, // "h"
106,158, // "i"
107,158, // "u"
108,158, // "d"
109,158, // "f"
110,158, // "m"
111,158, // "x"
112,158, // "g"
113,158, // "p"
114,158, // "v"
115,158, // "w"
116,158, // "z"
117,158, // "!"
118,158, // "="
119,158, // "%"
120,158, // "&"
121,158, // "|"
122,158, // "+"
123,158, // ","
124,158, // "-"
125,158, // "."
126,1026, // "*"
127,17, // "/"
128,158, // ";"
129,158, // "<"
130,158, // ">"
131,158, // "("
132,158, // ")"
133,158, // "["
134,158, // "]"
135,158, // "{"
136,158, // "}"
138,158, // "'"
140,158, // '"'
143,158, // "0"
146,158, // "_"
148,158, // "\"
150,158, // {"1".."9"}
151,158, // {"#".."$" ":" "?".."@" "^" "`" "~"}
152,158, // {"A".."Z" "j" "q"}
153,158, // " "
154,158, // {9}
157,196, // eol
163,1062, // {10}
164,1072, // {13}
  }
,
{ // state 166
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+149, // $
MIN_REDUCTION+149, // $NT
  }
,
{ // state 167
MIN_REDUCTION+347, // (default reduction)
  }
,
{ // state 168
-1, // $$start
-1, // start
806, // ws*
-1, // $$0
MIN_REDUCTION+228, // token
1137, // `boolean
24, // `class
869, // `extends
61, // `void
792, // `int
1121, // `while
525, // `if
999, // `else
232, // `for
505, // `break
440, // `this
1162, // `false
59, // `true
389, // `super
226, // `null
910, // `return
1097, // `instanceof
891, // `new
837, // `abstract
374, // `assert
776, // `byte
802, // `case
84, // `catch
690, // `char
29, // `const
716, // `continue
547, // `default
1109, // `do
1198, // `double
875, // `enum
1124, // `final
796, // `finally
614, // `float
392, // `goto
718, // `implements
198, // `import
1041, // `interface
688, // `long
419, // `native
145, // `package
1059, // `private
215, // `protected
651, // `public
924, // `short
368, // `static
364, // `strictfp
803, // `switch
444, // `synchronized
1090, // `throw
985, // `throws
320, // `transient
400, // `try
43, // `volatile
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
-1, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
885, // "a"
467, // "b"
798, // "s"
1002, // "t"
431, // "r"
721, // "c"
176, // "e"
MIN_REDUCTION+228, // "o"
100, // "l"
495, // "n"
MIN_REDUCTION+228, // "k"
MIN_REDUCTION+228, // "y"
MIN_REDUCTION+228, // "h"
501, // "i"
MIN_REDUCTION+228, // "u"
18, // "d"
32, // "f"
MIN_REDUCTION+228, // "m"
MIN_REDUCTION+228, // "x"
840, // "g"
269, // "p"
1006, // "v"
13, // "w"
MIN_REDUCTION+228, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
708, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+228, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+228, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+228, // $
MIN_REDUCTION+228, // $NT
  }
,
{ // state 169
171,MIN_REDUCTION+167, // $NT
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 170
0x80000000|1054, // match move
0x80000000|860, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 171
102,864, // "n"
  }
,
{ // state 172
-1, // $$start
-1, // start
426, // ws*
-1, // $$0
MIN_REDUCTION+150, // token
1137, // `boolean
24, // `class
869, // `extends
61, // `void
792, // `int
1121, // `while
525, // `if
999, // `else
232, // `for
505, // `break
440, // `this
1162, // `false
59, // `true
389, // `super
226, // `null
910, // `return
1097, // `instanceof
891, // `new
837, // `abstract
374, // `assert
776, // `byte
802, // `case
84, // `catch
690, // `char
29, // `const
716, // `continue
547, // `default
1109, // `do
1198, // `double
875, // `enum
1124, // `final
796, // `finally
614, // `float
392, // `goto
718, // `implements
198, // `import
1041, // `interface
688, // `long
419, // `native
145, // `package
1059, // `private
215, // `protected
651, // `public
924, // `short
368, // `static
364, // `strictfp
803, // `switch
444, // `synchronized
1090, // `throw
985, // `throws
320, // `transient
400, // `try
43, // `volatile
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
-1, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
885, // "a"
467, // "b"
995, // "s"
1002, // "t"
431, // "r"
721, // "c"
176, // "e"
MIN_REDUCTION+150, // "o"
100, // "l"
495, // "n"
MIN_REDUCTION+150, // "k"
MIN_REDUCTION+150, // "y"
MIN_REDUCTION+150, // "h"
501, // "i"
MIN_REDUCTION+150, // "u"
18, // "d"
32, // "f"
MIN_REDUCTION+150, // "m"
MIN_REDUCTION+150, // "x"
840, // "g"
269, // "p"
1006, // "v"
13, // "w"
MIN_REDUCTION+150, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
708, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+150, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+150, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+150, // $
MIN_REDUCTION+150, // $NT
  }
,
{ // state 173
-1, // $$start
-1, // start
826, // ws*
-1, // $$0
MIN_REDUCTION+192, // token
1137, // `boolean
24, // `class
869, // `extends
61, // `void
792, // `int
1121, // `while
525, // `if
999, // `else
232, // `for
505, // `break
440, // `this
1162, // `false
59, // `true
389, // `super
226, // `null
910, // `return
1097, // `instanceof
891, // `new
837, // `abstract
374, // `assert
776, // `byte
802, // `case
84, // `catch
690, // `char
29, // `const
716, // `continue
547, // `default
1109, // `do
1198, // `double
875, // `enum
1124, // `final
796, // `finally
614, // `float
392, // `goto
718, // `implements
198, // `import
1041, // `interface
688, // `long
419, // `native
145, // `package
1059, // `private
215, // `protected
651, // `public
924, // `short
368, // `static
364, // `strictfp
803, // `switch
444, // `synchronized
1090, // `throw
985, // `throws
320, // `transient
400, // `try
43, // `volatile
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
-1, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
885, // "a"
467, // "b"
995, // "s"
1002, // "t"
431, // "r"
721, // "c"
176, // "e"
MIN_REDUCTION+192, // "o"
100, // "l"
495, // "n"
MIN_REDUCTION+192, // "k"
MIN_REDUCTION+192, // "y"
MIN_REDUCTION+192, // "h"
501, // "i"
MIN_REDUCTION+192, // "u"
18, // "d"
32, // "f"
MIN_REDUCTION+192, // "m"
MIN_REDUCTION+192, // "x"
840, // "g"
269, // "p"
1006, // "v"
13, // "w"
MIN_REDUCTION+192, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
708, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+192, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+192, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+192, // $
MIN_REDUCTION+192, // $NT
  }
,
{ // state 174
1,763, // start
2,683, // ws*
3,940, // $$0
4,694, // token
5,1137, // `boolean
6,24, // `class
7,869, // `extends
8,61, // `void
9,792, // `int
10,1121, // `while
11,525, // `if
12,999, // `else
13,232, // `for
14,505, // `break
15,440, // `this
16,1162, // `false
17,59, // `true
18,389, // `super
19,226, // `null
20,910, // `return
21,1097, // `instanceof
22,891, // `new
23,837, // `abstract
24,374, // `assert
25,776, // `byte
26,802, // `case
27,84, // `catch
28,690, // `char
29,29, // `const
30,716, // `continue
31,547, // `default
32,1109, // `do
33,1198, // `double
34,875, // `enum
35,1124, // `final
36,796, // `finally
37,614, // `float
38,392, // `goto
39,718, // `implements
40,198, // `import
41,1041, // `interface
42,688, // `long
43,419, // `native
44,145, // `package
45,1059, // `private
46,215, // `protected
47,651, // `public
48,924, // `short
49,368, // `static
50,364, // `strictfp
51,803, // `switch
52,444, // `synchronized
53,1090, // `throw
54,985, // `throws
55,320, // `transient
56,400, // `try
57,43, // `volatile
93,885, // "a"
94,467, // "b"
95,995, // "s"
96,1002, // "t"
97,431, // "r"
98,721, // "c"
99,176, // "e"
101,100, // "l"
102,495, // "n"
106,501, // "i"
108,18, // "d"
109,32, // "f"
112,840, // "g"
113,269, // "p"
114,1006, // "v"
115,13, // "w"
168,1159, // token*
170,MIN_REDUCTION+1, // $
  }
,
{ // state 175
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+137, // $
MIN_REDUCTION+137, // $NT
  }
,
{ // state 176
101,942, // "l"
102,1093, // "n"
111,53, // "x"
  }
,
{ // state 177
2,543, // ws*
157,534, // eol
158,204, // ws
160,634, // comment
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 178
0x80000000|553, // match move
0x80000000|30, // no-match move
0x80000000|1143, // NT-test-match state for printable
  }
,
{ // state 179
0x80000000|557, // match move
0x80000000|123, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 180
0x80000000|945, // match move
0x80000000|290, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 181
2,80, // ws*
157,534, // eol
158,204, // ws
160,634, // comment
MIN_REDUCTION+366, // (default reduction)
  }
,
{ // state 182
108,135, // "d"
  }
,
{ // state 183
0x80000000|1165, // match move
0x80000000|949, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 184
0x80000000|938, // match move
0x80000000|360, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 185
107,1040, // "u"
  }
,
{ // state 186
0x80000000|831, // match move
0x80000000|448, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 187
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 188
171,MIN_REDUCTION+241, // $NT
  }
,
{ // state 189
171,MIN_REDUCTION+339, // $NT
MIN_REDUCTION+339, // (default reduction)
  }
,
{ // state 190
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 191
97,532, // "r"
  }
,
{ // state 192
96,338, // "t"
  }
,
{ // state 193
-1, // $$start
-1, // start
594, // ws*
-1, // $$0
MIN_REDUCTION+237, // token
1137, // `boolean
24, // `class
869, // `extends
61, // `void
792, // `int
1121, // `while
525, // `if
999, // `else
232, // `for
505, // `break
440, // `this
1162, // `false
59, // `true
389, // `super
226, // `null
910, // `return
1097, // `instanceof
891, // `new
837, // `abstract
374, // `assert
776, // `byte
802, // `case
84, // `catch
690, // `char
29, // `const
716, // `continue
547, // `default
1109, // `do
1198, // `double
875, // `enum
1124, // `final
796, // `finally
614, // `float
392, // `goto
718, // `implements
198, // `import
1041, // `interface
688, // `long
419, // `native
145, // `package
1059, // `private
215, // `protected
651, // `public
924, // `short
368, // `static
364, // `strictfp
803, // `switch
444, // `synchronized
1090, // `throw
985, // `throws
320, // `transient
400, // `try
43, // `volatile
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
-1, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
885, // "a"
467, // "b"
995, // "s"
1002, // "t"
431, // "r"
721, // "c"
176, // "e"
MIN_REDUCTION+237, // "o"
100, // "l"
495, // "n"
MIN_REDUCTION+237, // "k"
MIN_REDUCTION+237, // "y"
MIN_REDUCTION+237, // "h"
501, // "i"
MIN_REDUCTION+237, // "u"
18, // "d"
32, // "f"
MIN_REDUCTION+237, // "m"
MIN_REDUCTION+237, // "x"
840, // "g"
269, // "p"
1006, // "v"
13, // "w"
MIN_REDUCTION+237, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
708, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+237, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+237, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+237, // $
MIN_REDUCTION+237, // $NT
  }
,
{ // state 194
0x80000000|620, // match move
0x80000000|919, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 195
-1, // $$start
-1, // start
1199, // ws*
-1, // $$0
MIN_REDUCTION+201, // token
1137, // `boolean
24, // `class
869, // `extends
61, // `void
792, // `int
1121, // `while
525, // `if
999, // `else
232, // `for
505, // `break
440, // `this
1162, // `false
59, // `true
389, // `super
226, // `null
910, // `return
1097, // `instanceof
891, // `new
837, // `abstract
374, // `assert
776, // `byte
802, // `case
84, // `catch
690, // `char
29, // `const
716, // `continue
547, // `default
1109, // `do
1198, // `double
875, // `enum
1124, // `final
796, // `finally
614, // `float
392, // `goto
718, // `implements
198, // `import
1041, // `interface
688, // `long
419, // `native
145, // `package
1059, // `private
215, // `protected
651, // `public
924, // `short
368, // `static
364, // `strictfp
803, // `switch
444, // `synchronized
1090, // `throw
985, // `throws
320, // `transient
400, // `try
43, // `volatile
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
-1, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
885, // "a"
467, // "b"
995, // "s"
1002, // "t"
431, // "r"
721, // "c"
176, // "e"
MIN_REDUCTION+201, // "o"
100, // "l"
495, // "n"
MIN_REDUCTION+201, // "k"
MIN_REDUCTION+201, // "y"
MIN_REDUCTION+201, // "h"
501, // "i"
MIN_REDUCTION+201, // "u"
18, // "d"
32, // "f"
MIN_REDUCTION+201, // "m"
MIN_REDUCTION+201, // "x"
840, // "g"
269, // "p"
1006, // "v"
13, // "w"
MIN_REDUCTION+201, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
708, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+201, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+201, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+201, // $
MIN_REDUCTION+201, // $NT
  }
,
{ // state 196
171,MIN_REDUCTION+330, // $NT
  }
,
{ // state 197
0x80000000|813, // match move
0x80000000|1092, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 198
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 199
171,MIN_REDUCTION+179, // $NT
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 200
MIN_REDUCTION+343, // (default reduction)
  }
,
{ // state 201
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 202
-1, // $$start
-1, // start
958, // ws*
-1, // $$0
MIN_REDUCTION+204, // token
1137, // `boolean
24, // `class
869, // `extends
61, // `void
792, // `int
1121, // `while
525, // `if
999, // `else
232, // `for
505, // `break
440, // `this
1162, // `false
59, // `true
389, // `super
226, // `null
910, // `return
1097, // `instanceof
891, // `new
837, // `abstract
374, // `assert
776, // `byte
802, // `case
84, // `catch
690, // `char
29, // `const
716, // `continue
547, // `default
1109, // `do
1198, // `double
875, // `enum
1124, // `final
796, // `finally
614, // `float
392, // `goto
718, // `implements
198, // `import
1041, // `interface
688, // `long
419, // `native
145, // `package
1059, // `private
215, // `protected
651, // `public
924, // `short
368, // `static
364, // `strictfp
803, // `switch
444, // `synchronized
1090, // `throw
985, // `throws
320, // `transient
400, // `try
43, // `volatile
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
-1, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
885, // "a"
467, // "b"
995, // "s"
1002, // "t"
431, // "r"
721, // "c"
176, // "e"
MIN_REDUCTION+204, // "o"
100, // "l"
495, // "n"
MIN_REDUCTION+204, // "k"
MIN_REDUCTION+204, // "y"
MIN_REDUCTION+204, // "h"
501, // "i"
MIN_REDUCTION+204, // "u"
18, // "d"
32, // "f"
MIN_REDUCTION+204, // "m"
MIN_REDUCTION+204, // "x"
840, // "g"
269, // "p"
1006, // "v"
13, // "w"
MIN_REDUCTION+204, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
708, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+204, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+204, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+204, // $
MIN_REDUCTION+204, // $NT
  }
,
{ // state 203
97,480, // "r"
  }
,
{ // state 204
171,MIN_REDUCTION+349, // $NT
MIN_REDUCTION+349, // (default reduction)
  }
,
{ // state 205
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 206
0x80000000|699, // match move
0x80000000|1197, // no-match move
0x80000000|545, // NT-test-match state for digit
  }
,
{ // state 207
0x80000000|482, // match move
0x80000000|129, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 208
0x80000000|181, // match move
0x80000000|858, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 209
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 210
0x80000000|1190, // match move
0x80000000|267, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 211
171,MIN_REDUCTION+194, // $NT
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 212
0x80000000|624, // match move
0x80000000|944, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 213
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 214
171,MIN_REDUCTION+187, // $NT
  }
,
{ // state 215
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 216
0x80000000|578, // match move
0x80000000|468, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 217
171,MIN_REDUCTION+116, // $NT
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 218
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+245, // $
MIN_REDUCTION+245, // $NT
  }
,
{ // state 219
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 220
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 221
105,753, // "h"
  }
,
{ // state 222
121,966, // "|"
  }
,
{ // state 223
99,252, // "e"
  }
,
{ // state 224
0x80000000|805, // match move
0x80000000|764, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 225
116,333, // "z"
  }
,
{ // state 226
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 227
-1, // $$start
-1, // start
313, // ws*
-1, // $$0
MIN_REDUCTION+99, // token
1137, // `boolean
24, // `class
869, // `extends
61, // `void
792, // `int
1121, // `while
525, // `if
999, // `else
232, // `for
505, // `break
440, // `this
1162, // `false
59, // `true
389, // `super
226, // `null
910, // `return
1097, // `instanceof
891, // `new
837, // `abstract
374, // `assert
776, // `byte
802, // `case
84, // `catch
690, // `char
29, // `const
716, // `continue
547, // `default
1109, // `do
1198, // `double
875, // `enum
1124, // `final
796, // `finally
614, // `float
392, // `goto
718, // `implements
198, // `import
1041, // `interface
688, // `long
419, // `native
145, // `package
1059, // `private
215, // `protected
651, // `public
924, // `short
368, // `static
364, // `strictfp
803, // `switch
444, // `synchronized
1090, // `throw
985, // `throws
320, // `transient
400, // `try
43, // `volatile
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
-1, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
885, // "a"
467, // "b"
995, // "s"
1002, // "t"
431, // "r"
721, // "c"
176, // "e"
MIN_REDUCTION+99, // "o"
100, // "l"
495, // "n"
MIN_REDUCTION+99, // "k"
MIN_REDUCTION+99, // "y"
MIN_REDUCTION+99, // "h"
501, // "i"
MIN_REDUCTION+99, // "u"
18, // "d"
32, // "f"
MIN_REDUCTION+99, // "m"
MIN_REDUCTION+99, // "x"
840, // "g"
269, // "p"
1006, // "v"
13, // "w"
MIN_REDUCTION+99, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
708, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+99, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+99, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+99, // $
MIN_REDUCTION+99, // $NT
  }
,
{ // state 228
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+119, // $
MIN_REDUCTION+119, // $NT
  }
,
{ // state 229
0x80000000|353, // match move
0x80000000|568, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 230
4,564, // token
5,1137, // `boolean
6,24, // `class
7,869, // `extends
8,61, // `void
9,792, // `int
10,1121, // `while
11,525, // `if
12,999, // `else
13,232, // `for
14,505, // `break
15,440, // `this
16,1162, // `false
17,59, // `true
18,389, // `super
19,226, // `null
20,910, // `return
21,1097, // `instanceof
22,891, // `new
23,837, // `abstract
24,374, // `assert
25,776, // `byte
26,802, // `case
27,84, // `catch
28,690, // `char
29,29, // `const
30,716, // `continue
31,547, // `default
32,1109, // `do
33,1198, // `double
34,875, // `enum
35,1124, // `final
36,796, // `finally
37,614, // `float
38,392, // `goto
39,718, // `implements
40,198, // `import
41,1041, // `interface
42,688, // `long
43,419, // `native
44,145, // `package
45,1059, // `private
46,215, // `protected
47,651, // `public
48,924, // `short
49,368, // `static
50,364, // `strictfp
51,803, // `switch
52,444, // `synchronized
53,1090, // `throw
54,985, // `throws
55,320, // `transient
56,400, // `try
57,43, // `volatile
93,885, // "a"
94,467, // "b"
95,995, // "s"
96,1002, // "t"
97,431, // "r"
98,721, // "c"
99,176, // "e"
101,100, // "l"
102,495, // "n"
106,501, // "i"
108,18, // "d"
109,32, // "f"
112,840, // "g"
113,269, // "p"
114,1006, // "v"
115,13, // "w"
MIN_REDUCTION+363, // (default reduction)
  }
,
{ // state 231
95,23, // "s"
96,324, // "t"
  }
,
{ // state 232
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 233
0x80000000|187, // match move
0x80000000|523, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 234
171,MIN_REDUCTION+223, // $NT
  }
,
{ // state 235
0x80000000|1, // match move
0x80000000|799, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 236
97,821, // "r"
  }
,
{ // state 237
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 238
-1, // $$start
-1, // start
866, // ws*
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
-1, // `=
-1, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
MIN_REDUCTION+252, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+252, // $
-1, // $NT
  }
,
{ // state 239
0x80000000|174, // match move
0x80000000|584, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 240
126,303, // "*"
  }
,
{ // state 241
171,MIN_REDUCTION+130, // $NT
  }
,
{ // state 242
101,833, // "l"
  }
,
{ // state 243
-1, // $$start
-1, // start
429, // ws*
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
-1, // `=
-1, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
MIN_REDUCTION+284, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+284, // $
-1, // $NT
  }
,
{ // state 244
0x80000000|538, // match move
0x80000000|28, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 245
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 246
100,265, // "o"
  }
,
{ // state 247
0x80000000|1081, // match move
0x80000000|720, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 248
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 249
0x80000000|1192, // match move
0x80000000|499, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 250
95,489, // "s"
  }
,
{ // state 251
MIN_REDUCTION+360, // (default reduction)
  }
,
{ // state 252
102,586, // "n"
  }
,
{ // state 253
0x80000000|1088, // match move
0x80000000|648, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 254
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+230, // $
MIN_REDUCTION+230, // $NT
  }
,
{ // state 255
100,73, // "o"
  }
,
{ // state 256
97,912, // "r"
  }
,
{ // state 257
0x80000000|936, // match move
0x80000000|759, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 258
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 259
-1, // $$start
-1, // start
-1, // ws*
622, // $$0
694, // token
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
1159, // token*
206, // digit+
MIN_REDUCTION+3, // $
-1, // $NT
  }
,
{ // state 260
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 261
171,MIN_REDUCTION+118, // $NT
  }
,
{ // state 262
171,MIN_REDUCTION+235, // $NT
  }
,
{ // state 263
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+161, // $
MIN_REDUCTION+161, // $NT
  }
,
{ // state 264
0x80000000|710, // match move
0x80000000|291, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 265
109,887, // "f"
  }
,
{ // state 266
4,564, // token
58,432, // `!
59,309, // `!=
60,1115, // `%
61,565, // `&&
62,786, // `*
63,450, // `(
64,760, // `)
65,396, // `{
66,1013, // `}
67,155, // `-
68,88, // `+
69,379, // `=
70,849, // `==
71,1001, // `[
72,438, // `]
73,515, // `||
74,997, // `<
75,931, // `<=
76,579, // `,
77,933, // `>
78,446, // `>=
79,1010, // `.
80,1076, // `;
81,510, // `++
82,552, // `--
83,258, // `/
84,213, // ID
85,625, // INTLIT
86,658, // STRINGLIT
87,1067, // CHARLIT
89,307, // letter
93,69, // "a"
94,69, // "b"
95,69, // "s"
96,69, // "t"
97,69, // "r"
98,69, // "c"
99,69, // "e"
100,69, // "o"
101,69, // "l"
102,69, // "n"
103,69, // "k"
104,69, // "y"
105,69, // "h"
106,69, // "i"
107,69, // "u"
108,69, // "d"
109,69, // "f"
110,69, // "m"
111,69, // "x"
112,69, // "g"
113,69, // "p"
114,69, // "v"
115,69, // "w"
116,69, // "z"
117,780, // "!"
118,420, // "="
119,740, // "%"
120,935, // "&"
121,222, // "|"
122,152, // "+"
123,1113, // ","
124,528, // "-"
125,585, // "."
126,934, // "*"
127,905, // "/"
128,712, // ";"
129,337, // "<"
130,773, // ">"
131,180, // "("
132,257, // ")"
133,476, // "["
134,1161, // "]"
135,1196, // "{"
136,1046, // "}"
137,503, // intLit2
138,555, // "'"
140,610, // '"'
143,27, // "0"
144,403, // digit++
145,962, // digit
150,27, // {"1".."9"}
152,69, // {"A".."Z" "j" "q"}
169,206, // digit+
MIN_REDUCTION+363, // (default reduction)
  }
,
{ // state 267
0x80000000|895, // match move
0x80000000|1127, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 268
-1, // $$start
-1, // start
376, // ws*
-1, // $$0
MIN_REDUCTION+168, // token
1137, // `boolean
24, // `class
869, // `extends
61, // `void
792, // `int
1121, // `while
525, // `if
999, // `else
232, // `for
505, // `break
440, // `this
1162, // `false
59, // `true
389, // `super
226, // `null
910, // `return
1097, // `instanceof
891, // `new
837, // `abstract
374, // `assert
776, // `byte
802, // `case
84, // `catch
690, // `char
29, // `const
716, // `continue
547, // `default
1109, // `do
1198, // `double
875, // `enum
1124, // `final
796, // `finally
614, // `float
392, // `goto
718, // `implements
198, // `import
1041, // `interface
688, // `long
419, // `native
145, // `package
1059, // `private
215, // `protected
651, // `public
924, // `short
368, // `static
364, // `strictfp
803, // `switch
444, // `synchronized
1090, // `throw
985, // `throws
320, // `transient
400, // `try
43, // `volatile
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
-1, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
885, // "a"
467, // "b"
995, // "s"
1002, // "t"
431, // "r"
721, // "c"
176, // "e"
MIN_REDUCTION+168, // "o"
100, // "l"
495, // "n"
MIN_REDUCTION+168, // "k"
MIN_REDUCTION+168, // "y"
MIN_REDUCTION+168, // "h"
501, // "i"
MIN_REDUCTION+168, // "u"
18, // "d"
32, // "f"
MIN_REDUCTION+168, // "m"
MIN_REDUCTION+168, // "x"
840, // "g"
269, // "p"
1006, // "v"
13, // "w"
MIN_REDUCTION+168, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
708, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+168, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+168, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+168, // $
MIN_REDUCTION+168, // $NT
  }
,
{ // state 269
93,554, // "a"
97,519, // "r"
107,685, // "u"
  }
,
{ // state 270
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+203, // $
MIN_REDUCTION+203, // $NT
  }
,
{ // state 271
0x80000000|1014, // match move
0x80000000|1149, // no-match move
0x80000000|165, // NT-test-match state for multilineCommentPrintable
  }
,
{ // state 272
-1, // $$start
-1, // start
42, // ws*
-1, // $$0
MIN_REDUCTION+180, // token
1137, // `boolean
24, // `class
869, // `extends
61, // `void
792, // `int
1121, // `while
525, // `if
999, // `else
232, // `for
505, // `break
440, // `this
1162, // `false
59, // `true
389, // `super
226, // `null
910, // `return
1097, // `instanceof
891, // `new
837, // `abstract
374, // `assert
776, // `byte
802, // `case
84, // `catch
690, // `char
29, // `const
716, // `continue
547, // `default
1109, // `do
1198, // `double
875, // `enum
1124, // `final
796, // `finally
614, // `float
392, // `goto
718, // `implements
198, // `import
1041, // `interface
688, // `long
419, // `native
145, // `package
1059, // `private
215, // `protected
651, // `public
924, // `short
368, // `static
364, // `strictfp
803, // `switch
444, // `synchronized
1090, // `throw
985, // `throws
320, // `transient
400, // `try
43, // `volatile
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
-1, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
885, // "a"
467, // "b"
995, // "s"
1002, // "t"
431, // "r"
721, // "c"
176, // "e"
MIN_REDUCTION+180, // "o"
100, // "l"
495, // "n"
MIN_REDUCTION+180, // "k"
MIN_REDUCTION+180, // "y"
MIN_REDUCTION+180, // "h"
501, // "i"
MIN_REDUCTION+180, // "u"
18, // "d"
32, // "f"
MIN_REDUCTION+180, // "m"
MIN_REDUCTION+180, // "x"
840, // "g"
269, // "p"
1006, // "v"
13, // "w"
MIN_REDUCTION+180, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
708, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+180, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+180, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+180, // $
MIN_REDUCTION+180, // $NT
  }
,
{ // state 273
0x80000000|757, // match move
0x80000000|574, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 274
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 275
97,1029, // "r"
  }
,
{ // state 276
0x80000000|345, // match move
0x80000000|1177, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 277
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+293, // $
-1, // $NT
  }
,
{ // state 278
-1, // $$start
-1, // start
80, // ws*
-1, // $$0
MIN_REDUCTION+366, // token
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+366, // $
-1, // $NT
  }
,
{ // state 279
0x80000000|998, // match move
0x80000000|886, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 280
126,1106, // "*"
  }
,
{ // state 281
171,MIN_REDUCTION+203, // $NT
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 282
MIN_REDUCTION+315, // (default reduction)
  }
,
{ // state 283
0x80000000|401, // match move
0x80000000|1139, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 284
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+273, // $
-1, // $NT
  }
,
{ // state 285
0x80000000|909, // match move
0x80000000|725, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 286
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 287
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+104, // $
MIN_REDUCTION+104, // $NT
  }
,
{ // state 288
171,MIN_REDUCTION+122, // $NT
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 289
0x80000000|93, // match move
0x80000000|161, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 290
0x80000000|598, // match move
0x80000000|137, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 291
0x80000000|655, // match move
0x80000000|1118, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 292
-1, // $$start
-1, // start
848, // ws*
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+298, // $
-1, // $NT
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
{ // state 293
171,MIN_REDUCTION+337, // $NT
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 294
-1, // $$start
-1, // start
22, // ws*
-1, // $$0
MIN_REDUCTION+186, // token
1137, // `boolean
24, // `class
869, // `extends
61, // `void
792, // `int
1121, // `while
525, // `if
999, // `else
232, // `for
505, // `break
440, // `this
1162, // `false
59, // `true
389, // `super
226, // `null
910, // `return
1097, // `instanceof
891, // `new
837, // `abstract
374, // `assert
776, // `byte
802, // `case
84, // `catch
690, // `char
29, // `const
716, // `continue
547, // `default
1109, // `do
1198, // `double
875, // `enum
1124, // `final
796, // `finally
614, // `float
392, // `goto
718, // `implements
198, // `import
1041, // `interface
688, // `long
419, // `native
145, // `package
1059, // `private
215, // `protected
651, // `public
924, // `short
368, // `static
364, // `strictfp
803, // `switch
444, // `synchronized
1090, // `throw
985, // `throws
320, // `transient
400, // `try
43, // `volatile
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
-1, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
885, // "a"
467, // "b"
995, // "s"
1002, // "t"
431, // "r"
721, // "c"
176, // "e"
MIN_REDUCTION+186, // "o"
100, // "l"
495, // "n"
MIN_REDUCTION+186, // "k"
MIN_REDUCTION+186, // "y"
MIN_REDUCTION+186, // "h"
501, // "i"
MIN_REDUCTION+186, // "u"
18, // "d"
32, // "f"
MIN_REDUCTION+186, // "m"
MIN_REDUCTION+186, // "x"
840, // "g"
269, // "p"
1006, // "v"
13, // "w"
MIN_REDUCTION+186, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
708, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+186, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+186, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+186, // $
MIN_REDUCTION+186, // $NT
  }
,
{ // state 295
171,MIN_REDUCTION+340, // $NT
MIN_REDUCTION+340, // (default reduction)
  }
,
{ // state 296
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+92, // $
MIN_REDUCTION+92, // $NT
  }
,
{ // state 297
2,305, // ws*
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 298
2,1096, // ws*
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 299
115,502, // "w"
  }
,
{ // state 300
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 301
MIN_REDUCTION+327, // (default reduction)
  }
,
{ // state 302
171,MIN_REDUCTION+327, // $NT
  }
,
{ // state 303
0x80000000|1, // match move
0x80000000|346, // no-match move
// T-test match for "/":
127,
  }
,
{ // state 304
-1, // $$start
-1, // start
1069, // ws*
-1, // $$0
MIN_REDUCTION+222, // token
1137, // `boolean
24, // `class
869, // `extends
61, // `void
792, // `int
1121, // `while
525, // `if
999, // `else
232, // `for
505, // `break
440, // `this
1162, // `false
59, // `true
389, // `super
226, // `null
910, // `return
1097, // `instanceof
891, // `new
837, // `abstract
374, // `assert
776, // `byte
802, // `case
84, // `catch
690, // `char
29, // `const
716, // `continue
547, // `default
1109, // `do
1198, // `double
875, // `enum
1124, // `final
796, // `finally
614, // `float
392, // `goto
718, // `implements
198, // `import
1041, // `interface
688, // `long
419, // `native
145, // `package
1059, // `private
215, // `protected
651, // `public
924, // `short
368, // `static
364, // `strictfp
803, // `switch
444, // `synchronized
1090, // `throw
985, // `throws
320, // `transient
400, // `try
43, // `volatile
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
-1, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
885, // "a"
467, // "b"
995, // "s"
1002, // "t"
431, // "r"
721, // "c"
176, // "e"
MIN_REDUCTION+222, // "o"
100, // "l"
495, // "n"
MIN_REDUCTION+222, // "k"
MIN_REDUCTION+222, // "y"
MIN_REDUCTION+222, // "h"
501, // "i"
MIN_REDUCTION+222, // "u"
18, // "d"
32, // "f"
MIN_REDUCTION+222, // "m"
MIN_REDUCTION+222, // "x"
840, // "g"
269, // "p"
1006, // "v"
13, // "w"
MIN_REDUCTION+222, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
708, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+222, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+222, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+222, // $
MIN_REDUCTION+222, // $NT
  }
,
{ // state 305
0x80000000|839, // match move
0x80000000|868, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 306
96,1073, // "t"
  }
,
{ // state 307
0x80000000|1184, // match move
0x80000000|445, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 308
126,1094, // "*"
127,513, // "/"
  }
,
{ // state 309
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 310
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 311
0x80000000|630, // match move
0x80000000|599, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 312
138,102, // "'"
  }
,
{ // state 313
0x80000000|521, // match move
0x80000000|1168, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 314
0x80000000|380, // match move
0x80000000|351, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 315
0x80000000|318, // match move
0x80000000|383, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 316
0x80000000|51, // match move
0x80000000|492, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 317
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+215, // $
MIN_REDUCTION+215, // $NT
  }
,
{ // state 318
171,MIN_REDUCTION+164, // $NT
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 319
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 320
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 321
171,MIN_REDUCTION+128, // $NT
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 322
0x80000000|153, // match move
0x80000000|311, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 323
96,255, // "t"
  }
,
{ // state 324
106,1075, // "i"
  }
,
{ // state 325
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 326
101,851, // "l"
  }
,
{ // state 327
0x80000000|382, // match move
0x80000000|399, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 328
97,11, // "r"
  }
,
{ // state 329
101,724, // "l"
  }
,
{ // state 330
0x80000000|201, // match move
0x80000000|636, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 331
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+287, // $
-1, // $NT
  }
,
{ // state 332
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+128, // $
MIN_REDUCTION+128, // $NT
  }
,
{ // state 333
99,540, // "e"
  }
,
{ // state 334
0x80000000|923, // match move
0x80000000|970, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 335
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 336
118,600, // "="
  }
,
{ // state 337
0x80000000|101, // match move
0x80000000|785, // no-match move
// T-test match for "=":
118,
  }
,
{ // state 338
107,256, // "u"
  }
,
{ // state 339
0x80000000|33, // match move
0x80000000|652, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 340
0x80000000|106, // match move
0x80000000|812, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 341
102,231, // "n"
  }
,
{ // state 342
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 343
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 344
171,MIN_REDUCTION+332, // $NT
  }
,
{ // state 345
MIN_REDUCTION+361, // (default reduction)
  }
,
{ // state 346
171,MIN_REDUCTION+329, // $NT
  }
,
{ // state 347
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 348
0x80000000|828, // match move
0x80000000|38, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 349
MIN_REDUCTION+342, // (default reduction)
  }
,
{ // state 350
171,MIN_REDUCTION+244, // $NT
  }
,
{ // state 351
0x80000000|1057, // match move
0x80000000|562, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 352
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 353
171,MIN_REDUCTION+212, // $NT
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 354
0x80000000|689, // match move
0x80000000|263, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 355
105,684, // "h"
106,449, // "i"
  }
,
{ // state 356
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+303, // $
-1, // $NT
  }
,
{ // state 357
2,461, // ws*
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 358
-1, // $$start
-1, // start
64, // ws*
-1, // $$0
MIN_REDUCTION+144, // token
1137, // `boolean
24, // `class
869, // `extends
61, // `void
792, // `int
1121, // `while
525, // `if
999, // `else
232, // `for
505, // `break
440, // `this
1162, // `false
59, // `true
389, // `super
226, // `null
910, // `return
1097, // `instanceof
891, // `new
837, // `abstract
374, // `assert
776, // `byte
802, // `case
84, // `catch
690, // `char
29, // `const
716, // `continue
547, // `default
1109, // `do
1198, // `double
875, // `enum
1124, // `final
796, // `finally
614, // `float
392, // `goto
718, // `implements
198, // `import
1041, // `interface
688, // `long
419, // `native
145, // `package
1059, // `private
215, // `protected
651, // `public
924, // `short
368, // `static
364, // `strictfp
803, // `switch
444, // `synchronized
1090, // `throw
985, // `throws
320, // `transient
400, // `try
43, // `volatile
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
-1, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
885, // "a"
467, // "b"
995, // "s"
1002, // "t"
431, // "r"
721, // "c"
176, // "e"
MIN_REDUCTION+144, // "o"
100, // "l"
495, // "n"
MIN_REDUCTION+144, // "k"
MIN_REDUCTION+144, // "y"
MIN_REDUCTION+144, // "h"
501, // "i"
MIN_REDUCTION+144, // "u"
18, // "d"
32, // "f"
MIN_REDUCTION+144, // "m"
MIN_REDUCTION+144, // "x"
840, // "g"
269, // "p"
1006, // "v"
13, // "w"
MIN_REDUCTION+144, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
708, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+144, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+144, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+144, // $
MIN_REDUCTION+144, // $NT
  }
,
{ // state 359
-1, // $$start
-1, // start
481, // ws*
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+290, // $
-1, // $NT
  }
,
{ // state 360
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+176, // $
MIN_REDUCTION+176, // $NT
  }
,
{ // state 361
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 362
171,MIN_REDUCTION+142, // $NT
  }
,
{ // state 363
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+122, // $
MIN_REDUCTION+122, // $NT
  }
,
{ // state 364
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 365
171,MIN_REDUCTION+98, // $NT
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 366
-1, // $$start
-1, // start
644, // ws*
-1, // $$0
MIN_REDUCTION+231, // token
1137, // `boolean
24, // `class
869, // `extends
61, // `void
792, // `int
1121, // `while
525, // `if
999, // `else
232, // `for
505, // `break
440, // `this
1162, // `false
59, // `true
389, // `super
226, // `null
910, // `return
1097, // `instanceof
891, // `new
837, // `abstract
374, // `assert
776, // `byte
802, // `case
84, // `catch
690, // `char
29, // `const
716, // `continue
547, // `default
1109, // `do
1198, // `double
875, // `enum
1124, // `final
796, // `finally
614, // `float
392, // `goto
718, // `implements
198, // `import
1041, // `interface
688, // `long
419, // `native
145, // `package
1059, // `private
215, // `protected
651, // `public
924, // `short
368, // `static
364, // `strictfp
803, // `switch
444, // `synchronized
1090, // `throw
985, // `throws
320, // `transient
400, // `try
43, // `volatile
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
-1, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
885, // "a"
467, // "b"
995, // "s"
1002, // "t"
431, // "r"
721, // "c"
176, // "e"
MIN_REDUCTION+231, // "o"
100, // "l"
495, // "n"
MIN_REDUCTION+231, // "k"
MIN_REDUCTION+231, // "y"
MIN_REDUCTION+231, // "h"
501, // "i"
MIN_REDUCTION+231, // "u"
18, // "d"
32, // "f"
MIN_REDUCTION+231, // "m"
MIN_REDUCTION+231, // "x"
840, // "g"
269, // "p"
1006, // "v"
13, // "w"
MIN_REDUCTION+231, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
708, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+231, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+231, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+231, // $
MIN_REDUCTION+231, // $NT
  }
,
{ // state 367
171,MIN_REDUCTION+348, // $NT
MIN_REDUCTION+348, // (default reduction)
  }
,
{ // state 368
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 369
0x80000000|485, // match move
0x80000000|168, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 370
0x80000000|529, // match move
0x80000000|65, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 371
2,481, // ws*
157,534, // eol
158,204, // ws
160,634, // comment
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 372
171,MIN_REDUCTION+184, // $NT
  }
,
{ // state 373
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 374
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 375
99,81, // "e"
  }
,
{ // state 376
0x80000000|541, // match move
0x80000000|926, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 377
114,139, // "v"
  }
,
{ // state 378
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+224, // $
MIN_REDUCTION+224, // $NT
  }
,
{ // state 379
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 380
2,664, // ws*
157,534, // eol
158,204, // ws
160,634, // comment
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 381
102,479, // "n"
  }
,
{ // state 382
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 383
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+164, // $
MIN_REDUCTION+164, // $NT
  }
,
{ // state 384
0x80000000|1, // match move
0x80000000|15, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 385
101,512, // "l"
  }
,
{ // state 386
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 387
171,MIN_REDUCTION+200, // $NT
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 388
126,1114, // "*"
  }
,
{ // state 389
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 390
MIN_REDUCTION+355, // (default reduction)
  }
,
{ // state 391
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+143, // $
MIN_REDUCTION+143, // $NT
  }
,
{ // state 392
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 393
171,MIN_REDUCTION+205, // $NT
  }
,
{ // state 394
2,1136, // ws*
157,534, // eol
158,204, // ws
160,634, // comment
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 395
2,322, // ws*
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 396
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 397
171,MIN_REDUCTION+163, // $NT
  }
,
{ // state 398
90,MIN_REDUCTION+331, // idChar**
146,MIN_REDUCTION+331, // "_"
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 399
0x80000000|829, // match move
0x80000000|665, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 400
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 401
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 402
171,MIN_REDUCTION+343, // $NT
MIN_REDUCTION+343, // (default reduction)
  }
,
{ // state 403
MIN_REDUCTION+309, // (default reduction)
  }
,
{ // state 404
171,MIN_REDUCTION+199, // $NT
  }
,
{ // state 405
0x80000000|1, // match move
0x80000000|195, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 406
93,133, // "a"
  }
,
{ // state 407
109,679, // "f"
  }
,
{ // state 408
0x80000000|889, // match move
0x80000000|1055, // no-match move
0x80000000|1143, // NT-test-match state for printable
  }
,
{ // state 409
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+289, // $
-1, // $NT
  }
,
{ // state 410
0x80000000|298, // match move
0x80000000|109, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 411
-1, // $$start
-1, // start
273, // ws*
-1, // $$0
MIN_REDUCTION+114, // token
1137, // `boolean
24, // `class
869, // `extends
61, // `void
792, // `int
1121, // `while
525, // `if
999, // `else
232, // `for
505, // `break
440, // `this
1162, // `false
59, // `true
389, // `super
226, // `null
910, // `return
1097, // `instanceof
891, // `new
837, // `abstract
374, // `assert
776, // `byte
802, // `case
84, // `catch
690, // `char
29, // `const
716, // `continue
547, // `default
1109, // `do
1198, // `double
875, // `enum
1124, // `final
796, // `finally
614, // `float
392, // `goto
718, // `implements
198, // `import
1041, // `interface
688, // `long
419, // `native
145, // `package
1059, // `private
215, // `protected
651, // `public
924, // `short
368, // `static
364, // `strictfp
803, // `switch
444, // `synchronized
1090, // `throw
985, // `throws
320, // `transient
400, // `try
43, // `volatile
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
-1, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
885, // "a"
467, // "b"
995, // "s"
1002, // "t"
431, // "r"
721, // "c"
176, // "e"
MIN_REDUCTION+114, // "o"
100, // "l"
495, // "n"
MIN_REDUCTION+114, // "k"
MIN_REDUCTION+114, // "y"
MIN_REDUCTION+114, // "h"
501, // "i"
MIN_REDUCTION+114, // "u"
18, // "d"
32, // "f"
MIN_REDUCTION+114, // "m"
MIN_REDUCTION+114, // "x"
840, // "g"
269, // "p"
1006, // "v"
13, // "w"
MIN_REDUCTION+114, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
708, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+114, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+114, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+114, // $
MIN_REDUCTION+114, // $NT
  }
,
{ // state 412
2,1024, // ws*
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 413
-1, // $$start
-1, // start
1129, // ws*
-1, // $$0
MIN_REDUCTION+141, // token
1137, // `boolean
24, // `class
869, // `extends
61, // `void
792, // `int
1121, // `while
525, // `if
999, // `else
232, // `for
505, // `break
440, // `this
1162, // `false
59, // `true
389, // `super
226, // `null
910, // `return
1097, // `instanceof
891, // `new
837, // `abstract
374, // `assert
776, // `byte
802, // `case
84, // `catch
690, // `char
29, // `const
716, // `continue
547, // `default
1109, // `do
1198, // `double
875, // `enum
1124, // `final
796, // `finally
614, // `float
392, // `goto
718, // `implements
198, // `import
1041, // `interface
688, // `long
419, // `native
145, // `package
1059, // `private
215, // `protected
651, // `public
924, // `short
368, // `static
364, // `strictfp
803, // `switch
444, // `synchronized
1090, // `throw
985, // `throws
320, // `transient
400, // `try
43, // `volatile
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
-1, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
885, // "a"
467, // "b"
995, // "s"
1002, // "t"
431, // "r"
721, // "c"
176, // "e"
MIN_REDUCTION+141, // "o"
100, // "l"
495, // "n"
MIN_REDUCTION+141, // "k"
MIN_REDUCTION+141, // "y"
MIN_REDUCTION+141, // "h"
501, // "i"
MIN_REDUCTION+141, // "u"
18, // "d"
32, // "f"
MIN_REDUCTION+141, // "m"
MIN_REDUCTION+141, // "x"
840, // "g"
269, // "p"
1006, // "v"
13, // "w"
MIN_REDUCTION+141, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
708, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+141, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+141, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+141, // $
MIN_REDUCTION+141, // $NT
  }
,
{ // state 414
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 415
171,MIN_REDUCTION+149, // $NT
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 416
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 417
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 418
0x80000000|551, // match move
0x80000000|197, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 419
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 420
0x80000000|1099, // match move
0x80000000|1047, // no-match move
// T-test match for "=":
118,
  }
,
{ // state 421
0x80000000|1, // match move
0x80000000|1089, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 422
126,577, // "*"
127,561, // "/"
  }
,
{ // state 423
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 424
98,734, // "c"
  }
,
{ // state 425
99,203, // "e"
  }
,
{ // state 426
0x80000000|654, // match move
0x80000000|955, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 427
0x80000000|1, // match move
0x80000000|366, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 428
106,1050, // "i"
  }
,
{ // state 429
0x80000000|571, // match move
0x80000000|870, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 430
0x80000000|787, // match move
0x80000000|110, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 431
99,192, // "e"
  }
,
{ // state 432
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 433
-1, // $$start
-1, // start
327, // ws*
-1, // $$0
MIN_REDUCTION+96, // token
1137, // `boolean
24, // `class
869, // `extends
61, // `void
792, // `int
1121, // `while
525, // `if
999, // `else
232, // `for
505, // `break
440, // `this
1162, // `false
59, // `true
389, // `super
226, // `null
910, // `return
1097, // `instanceof
891, // `new
837, // `abstract
374, // `assert
776, // `byte
802, // `case
84, // `catch
690, // `char
29, // `const
716, // `continue
547, // `default
1109, // `do
1198, // `double
875, // `enum
1124, // `final
796, // `finally
614, // `float
392, // `goto
718, // `implements
198, // `import
1041, // `interface
688, // `long
419, // `native
145, // `package
1059, // `private
215, // `protected
651, // `public
924, // `short
368, // `static
364, // `strictfp
803, // `switch
444, // `synchronized
1090, // `throw
985, // `throws
320, // `transient
400, // `try
43, // `volatile
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
-1, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
885, // "a"
467, // "b"
995, // "s"
1002, // "t"
431, // "r"
721, // "c"
176, // "e"
MIN_REDUCTION+96, // "o"
100, // "l"
495, // "n"
MIN_REDUCTION+96, // "k"
MIN_REDUCTION+96, // "y"
MIN_REDUCTION+96, // "h"
501, // "i"
MIN_REDUCTION+96, // "u"
18, // "d"
32, // "f"
MIN_REDUCTION+96, // "m"
MIN_REDUCTION+96, // "x"
840, // "g"
269, // "p"
1006, // "v"
13, // "w"
MIN_REDUCTION+96, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
708, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+96, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+96, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+96, // $
MIN_REDUCTION+96, // $NT
  }
,
{ // state 434
MIN_REDUCTION+344, // (default reduction)
  }
,
{ // state 435
-1, // $$start
-1, // start
1085, // ws*
-1, // $$0
MIN_REDUCTION+171, // token
1137, // `boolean
24, // `class
869, // `extends
61, // `void
792, // `int
1121, // `while
525, // `if
999, // `else
232, // `for
505, // `break
440, // `this
1162, // `false
59, // `true
389, // `super
226, // `null
910, // `return
1097, // `instanceof
891, // `new
837, // `abstract
374, // `assert
776, // `byte
802, // `case
84, // `catch
690, // `char
29, // `const
716, // `continue
547, // `default
1109, // `do
1198, // `double
875, // `enum
1124, // `final
796, // `finally
614, // `float
392, // `goto
718, // `implements
198, // `import
1041, // `interface
688, // `long
419, // `native
145, // `package
1059, // `private
215, // `protected
651, // `public
924, // `short
368, // `static
364, // `strictfp
803, // `switch
444, // `synchronized
1090, // `throw
985, // `throws
320, // `transient
400, // `try
43, // `volatile
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
-1, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
885, // "a"
467, // "b"
995, // "s"
1002, // "t"
431, // "r"
721, // "c"
176, // "e"
MIN_REDUCTION+171, // "o"
100, // "l"
495, // "n"
MIN_REDUCTION+171, // "k"
MIN_REDUCTION+171, // "y"
MIN_REDUCTION+171, // "h"
501, // "i"
MIN_REDUCTION+171, // "u"
18, // "d"
32, // "f"
MIN_REDUCTION+171, // "m"
MIN_REDUCTION+171, // "x"
840, // "g"
269, // "p"
1006, // "v"
13, // "w"
MIN_REDUCTION+171, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
708, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+171, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+171, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+171, // $
MIN_REDUCTION+171, // $NT
  }
,
{ // state 436
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 437
0x80000000|1164, // match move
0x80000000|142, // no-match move
0x80000000|545, // NT-test-match state for digit
  }
,
{ // state 438
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 439
99,246, // "e"
  }
,
{ // state 440
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 441
0x80000000|1, // match move
0x80000000|202, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 442
0x80000000|1052, // match move
0x80000000|726, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 443
171,MIN_REDUCTION+137, // $NT
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 444
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 445
-1, // $$start
-1, // start
668, // ws*
-1, // $$0
MIN_REDUCTION+91, // token
1137, // `boolean
24, // `class
869, // `extends
61, // `void
792, // `int
1121, // `while
525, // `if
999, // `else
232, // `for
505, // `break
440, // `this
1162, // `false
59, // `true
389, // `super
226, // `null
910, // `return
1097, // `instanceof
891, // `new
837, // `abstract
374, // `assert
776, // `byte
802, // `case
84, // `catch
690, // `char
29, // `const
716, // `continue
547, // `default
1109, // `do
1198, // `double
875, // `enum
1124, // `final
796, // `finally
614, // `float
392, // `goto
718, // `implements
198, // `import
1041, // `interface
688, // `long
419, // `native
145, // `package
1059, // `private
215, // `protected
651, // `public
924, // `short
368, // `static
364, // `strictfp
803, // `switch
444, // `synchronized
1090, // `throw
985, // `throws
320, // `transient
400, // `try
43, // `volatile
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
-1, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
-1, // letter
765, // idChar**
975, // $$1
-1, // idChar
885, // "a"
467, // "b"
995, // "s"
1002, // "t"
431, // "r"
721, // "c"
176, // "e"
MIN_REDUCTION+91, // "o"
100, // "l"
495, // "n"
MIN_REDUCTION+91, // "k"
MIN_REDUCTION+91, // "y"
MIN_REDUCTION+91, // "h"
501, // "i"
MIN_REDUCTION+91, // "u"
18, // "d"
32, // "f"
MIN_REDUCTION+91, // "m"
MIN_REDUCTION+91, // "x"
840, // "g"
269, // "p"
1006, // "v"
13, // "w"
MIN_REDUCTION+91, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
708, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+91, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+91, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
1112, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+91, // $
-1, // $NT
  }
,
{ // state 446
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 447
171,MIN_REDUCTION+127, // $NT
  }
,
{ // state 448
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+285, // $
-1, // $NT
  }
,
{ // state 449
96,1022, // "t"
  }
,
{ // state 450
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 451
MIN_REDUCTION+359, // (default reduction)
  }
,
{ // state 452
2,593, // ws*
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 453
171,MIN_REDUCTION+131, // $NT
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 454
101,770, // "l"
  }
,
{ // state 455
2,558, // ws*
157,534, // eol
158,204, // ws
160,634, // comment
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 456
0x80000000|631, // match move
0x80000000|583, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 457
0x80000000|251, // match move
0x80000000|1175, // no-match move
0x80000000|165, // NT-test-match state for multilineCommentPrintable
  }
,
{ // state 458
95,128, // "s"
  }
,
{ // state 459
0x80000000|347, // match move
0x80000000|150, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 460
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 461
0x80000000|834, // match move
0x80000000|682, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 462
0x80000000|325, // match move
0x80000000|409, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 463
93,516, // "a"
  }
,
{ // state 464
0x80000000|1, // match move
0x80000000|892, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 465
127,293, // "/"
  }
,
{ // state 466
127,295, // "/"
  }
,
{ // state 467
97,1126, // "r"
100,1142, // "o"
104,306, // "y"
  }
,
{ // state 468
MIN_REDUCTION+362, // (default reduction)
  }
,
{ // state 469
171,MIN_REDUCTION+193, // $NT
  }
,
{ // state 470
2,210, // ws*
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 471
96,1189, // "t"
  }
,
{ // state 472
0x80000000|1, // match move
0x80000000|707, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 473
0x80000000|781, // match move
0x80000000|717, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 474
2,668, // ws*
91,352, // $$1
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 475
95,471, // "s"
96,627, // "t"
  }
,
{ // state 476
0x80000000|576, // match move
0x80000000|442, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 477
171,MIN_REDUCTION+100, // $NT
  }
,
{ // state 478
0x80000000|1, // match move
0x80000000|675, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 479
112,820, // "g"
  }
,
{ // state 480
0x80000000|1, // match move
0x80000000|715, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 481
0x80000000|959, // match move
0x80000000|462, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 482
3,622, // $$0
4,694, // token
5,1137, // `boolean
6,24, // `class
7,869, // `extends
8,61, // `void
9,792, // `int
10,1121, // `while
11,525, // `if
12,999, // `else
13,232, // `for
14,505, // `break
15,440, // `this
16,1162, // `false
17,59, // `true
18,389, // `super
19,226, // `null
20,910, // `return
21,1097, // `instanceof
22,891, // `new
23,837, // `abstract
24,374, // `assert
25,776, // `byte
26,802, // `case
27,84, // `catch
28,690, // `char
29,29, // `const
30,716, // `continue
31,547, // `default
32,1109, // `do
33,1198, // `double
34,875, // `enum
35,1124, // `final
36,796, // `finally
37,614, // `float
38,392, // `goto
39,718, // `implements
40,198, // `import
41,1041, // `interface
42,688, // `long
43,419, // `native
44,145, // `package
45,1059, // `private
46,215, // `protected
47,651, // `public
48,924, // `short
49,368, // `static
50,364, // `strictfp
51,803, // `switch
52,444, // `synchronized
53,1090, // `throw
54,985, // `throws
55,320, // `transient
56,400, // `try
57,43, // `volatile
168,1159, // token*
  }
,
{ // state 483
-1, // $$start
-1, // start
54, // ws*
-1, // $$0
MIN_REDUCTION+240, // token
1137, // `boolean
24, // `class
869, // `extends
61, // `void
792, // `int
1121, // `while
525, // `if
999, // `else
232, // `for
505, // `break
440, // `this
1162, // `false
59, // `true
389, // `super
226, // `null
910, // `return
1097, // `instanceof
891, // `new
837, // `abstract
374, // `assert
776, // `byte
802, // `case
84, // `catch
690, // `char
29, // `const
716, // `continue
547, // `default
1109, // `do
1198, // `double
875, // `enum
1124, // `final
796, // `finally
614, // `float
392, // `goto
718, // `implements
198, // `import
1041, // `interface
688, // `long
419, // `native
145, // `package
1059, // `private
215, // `protected
651, // `public
924, // `short
368, // `static
364, // `strictfp
803, // `switch
444, // `synchronized
1090, // `throw
985, // `throws
320, // `transient
400, // `try
43, // `volatile
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
-1, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
885, // "a"
467, // "b"
995, // "s"
1002, // "t"
431, // "r"
721, // "c"
176, // "e"
MIN_REDUCTION+240, // "o"
100, // "l"
495, // "n"
MIN_REDUCTION+240, // "k"
MIN_REDUCTION+240, // "y"
MIN_REDUCTION+240, // "h"
501, // "i"
MIN_REDUCTION+240, // "u"
18, // "d"
32, // "f"
MIN_REDUCTION+240, // "m"
MIN_REDUCTION+240, // "x"
840, // "g"
269, // "p"
1006, // "v"
13, // "w"
MIN_REDUCTION+240, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
708, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+240, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+240, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+240, // $
MIN_REDUCTION+240, // $NT
  }
,
{ // state 484
0x80000000|46, // match move
0x80000000|633, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 485
95,427, // "s"
  }
,
{ // state 486
-1, // $$start
-1, // start
1110, // ws*
-1, // $$0
MIN_REDUCTION+153, // token
1137, // `boolean
24, // `class
869, // `extends
61, // `void
792, // `int
1121, // `while
525, // `if
999, // `else
232, // `for
505, // `break
440, // `this
1162, // `false
59, // `true
389, // `super
226, // `null
910, // `return
1097, // `instanceof
891, // `new
837, // `abstract
374, // `assert
776, // `byte
802, // `case
84, // `catch
690, // `char
29, // `const
716, // `continue
547, // `default
1109, // `do
1198, // `double
875, // `enum
1124, // `final
796, // `finally
614, // `float
392, // `goto
718, // `implements
198, // `import
1041, // `interface
688, // `long
419, // `native
145, // `package
1059, // `private
215, // `protected
651, // `public
924, // `short
368, // `static
364, // `strictfp
803, // `switch
444, // `synchronized
1090, // `throw
985, // `throws
320, // `transient
400, // `try
43, // `volatile
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
-1, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
885, // "a"
467, // "b"
995, // "s"
1002, // "t"
431, // "r"
721, // "c"
176, // "e"
MIN_REDUCTION+153, // "o"
100, // "l"
495, // "n"
MIN_REDUCTION+153, // "k"
MIN_REDUCTION+153, // "y"
MIN_REDUCTION+153, // "h"
501, // "i"
MIN_REDUCTION+153, // "u"
18, // "d"
32, // "f"
MIN_REDUCTION+153, // "m"
MIN_REDUCTION+153, // "x"
840, // "g"
269, // "p"
1006, // "v"
13, // "w"
MIN_REDUCTION+153, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
708, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+153, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+153, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+153, // $
MIN_REDUCTION+153, // $NT
  }
,
{ // state 487
5,477, // `boolean
6,261, // `class
7,362, // `extends
8,350, // `void
9,700, // `int
10,1056, // `while
11,397, // `if
12,1146, // `else
13,71, // `for
14,947, // `break
15,154, // `this
16,601, // `false
17,95, // `true
18,948, // `super
19,904, // `null
20,393, // `return
21,1182, // `instanceof
22,214, // `new
23,617, // `abstract
24,26, // `assert
25,75, // `byte
26,661, // `case
27,1023, // `catch
28,498, // `char
29,697, // `const
30,681, // `continue
31,447, // `default
32,241, // `do
33,1120, // `double
34,928, // `enum
35,131, // `final
36,1065, // `finally
37,560, // `float
38,957, // `goto
39,666, // `implements
40,862, // `import
41,569, // `interface
42,156, // `long
43,372, // `native
44,469, // `package
45,149, // `private
46,404, // `protected
47,582, // `public
48,1105, // `short
49,517, // `static
50,1169, // `strictfp
51,898, // `switch
52,234, // `synchronized
53,974, // `throw
54,952, // `throws
55,262, // `transient
56,188, // `try
57,804, // `volatile
93,885, // "a"
94,467, // "b"
95,995, // "s"
96,1002, // "t"
97,431, // "r"
98,721, // "c"
99,176, // "e"
101,100, // "l"
102,495, // "n"
106,501, // "i"
108,18, // "d"
109,32, // "f"
112,840, // "g"
113,269, // "p"
114,1006, // "v"
115,13, // "w"
  }
,
{ // state 488
0x80000000|1, // match move
0x80000000|1157, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 489
99,782, // "e"
  }
,
{ // state 490
171,MIN_REDUCTION+188, // $NT
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 491
0x80000000|1098, // match move
0x80000000|783, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 492
0x80000000|132, // match move
0x80000000|1153, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 493
97,407, // "r"
  }
,
{ // state 494
171,MIN_REDUCTION+335, // $NT
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 495
93,588, // "a"
99,299, // "e"
107,454, // "u"
  }
,
{ // state 496
0x80000000|72, // match move
0x80000000|591, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 497
0x80000000|873, // match move
0x80000000|693, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 498
171,MIN_REDUCTION+115, // $NT
  }
,
{ // state 499
0x80000000|819, // match move
0x80000000|741, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 500
0x80000000|335, // match move
0x80000000|60, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 501
102,475, // "n"
109,607, // "f"
110,55, // "m"
  }
,
{ // state 502
0x80000000|1, // match move
0x80000000|294, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 503
0x80000000|1138, // match move
0x80000000|992, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 504
96,1079, // "t"
  }
,
{ // state 505
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 506
2,691, // ws*
153,595, // " "
154,595, // {9}
157,534, // eol
158,204, // ws
159,595, // {12}
163,1062, // {10}
164,1072, // {13}
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 507
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 508
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 509
MIN_REDUCTION+357, // (default reduction)
  }
,
{ // state 510
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 511
MIN_REDUCTION+342, // (default reduction)
  }
,
{ // state 512
99,144, // "e"
  }
,
{ // state 513
126,465, // "*"
  }
,
{ // state 514
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
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
{ // state 515
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 516
95,458, // "s"
  }
,
{ // state 517
171,MIN_REDUCTION+211, // $NT
  }
,
{ // state 518
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 519
100,984, // "o"
106,377, // "i"
  }
,
{ // state 520
110,527, // "m"
  }
,
{ // state 521
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 522
0x80000000|414, // match move
0x80000000|604, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 523
0x80000000|967, // match move
0x80000000|228, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 524
0x80000000|237, // match move
0x80000000|914, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 525
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 526
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 527
0x80000000|1, // match move
0x80000000|768, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 528
0x80000000|990, // match move
0x80000000|496, // no-match move
// T-test match for "-":
124,
  }
,
{ // state 529
171,MIN_REDUCTION+146, // $NT
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 530
93,191, // "a"
  }
,
{ // state 531
MIN_REDUCTION+330, // (default reduction)
  }
,
{ // state 532
0x80000000|1, // match move
0x80000000|411, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 533
97,835, // "r"
  }
,
{ // state 534
171,MIN_REDUCTION+341, // $NT
MIN_REDUCTION+341, // (default reduction)
  }
,
{ // state 535
102,1043, // "n"
  }
,
{ // state 536
0x80000000|120, // match move
0x80000000|130, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 537
MIN_REDUCTION+357, // (default reduction)
  }
,
{ // state 538
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 539
MIN_REDUCTION+364, // (default reduction)
  }
,
{ // state 540
108,146, // "d"
  }
,
{ // state 541
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 542
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 543
0x80000000|641, // match move
0x80000000|186, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 544
93,589, // "a"
94,589, // "b"
95,589, // "s"
96,589, // "t"
97,589, // "r"
98,589, // "c"
99,589, // "e"
100,589, // "o"
101,589, // "l"
102,589, // "n"
103,589, // "k"
104,589, // "y"
105,589, // "h"
106,589, // "i"
107,589, // "u"
108,589, // "d"
109,589, // "f"
110,589, // "m"
111,589, // "x"
112,589, // "g"
113,589, // "p"
114,589, // "v"
115,589, // "w"
116,589, // "z"
117,589, // "!"
118,589, // "="
119,589, // "%"
120,589, // "&"
121,589, // "|"
122,589, // "+"
123,589, // ","
124,589, // "-"
125,589, // "."
126,589, // "*"
127,589, // "/"
128,589, // ";"
129,589, // "<"
130,589, // ">"
131,589, // "("
132,589, // ")"
133,589, // "["
134,589, // "]"
135,589, // "{"
136,589, // "}"
138,589, // "'"
140,208, // '"'
142,841, // $$2
143,589, // "0"
146,589, // "_"
147,827, // escapeSequence
148,844, // "\"
150,589, // {"1".."9"}
151,589, // {"#".."$" ":" "?".."@" "^" "`" "~"}
152,589, // {"A".."Z" "j" "q"}
153,589, // " "
155,1208, // stringPrintable
  }
,
{ // state 545
143,344, // "0"
150,344, // {"1".."9"}
  }
,
{ // state 546
96,1101, // "t"
  }
,
{ // state 547
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 548
102,546, // "n"
  }
,
{ // state 549
0x80000000|62, // match move
0x80000000|50, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 550
106,687, // "i"
  }
,
{ // state 551
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 552
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 553
93,650, // "a"
94,650, // "b"
95,650, // "s"
96,650, // "t"
97,650, // "r"
98,650, // "c"
99,650, // "e"
100,650, // "o"
101,650, // "l"
102,650, // "n"
103,650, // "k"
104,650, // "y"
105,650, // "h"
106,650, // "i"
107,650, // "u"
108,650, // "d"
109,650, // "f"
110,650, // "m"
111,650, // "x"
112,650, // "g"
113,650, // "p"
114,650, // "v"
115,650, // "w"
116,650, // "z"
117,650, // "!"
118,650, // "="
119,650, // "%"
120,650, // "&"
121,650, // "|"
122,650, // "+"
123,650, // ","
124,650, // "-"
125,650, // "."
126,650, // "*"
127,650, // "/"
128,650, // ";"
129,650, // "<"
130,650, // ">"
131,650, // "("
132,650, // ")"
133,650, // "["
134,650, // "]"
135,650, // "{"
136,650, // "}"
138,650, // "'"
140,650, // '"'
143,650, // "0"
146,650, // "_"
148,650, // "\"
149,751, // printable
150,650, // {"1".."9"}
151,650, // {"#".."$" ":" "?".."@" "^" "`" "~"}
152,650, // {"A".."Z" "j" "q"}
153,650, // " "
154,650, // {9}
  }
,
{ // state 554
98,867, // "c"
  }
,
{ // state 555
93,124, // "a"
94,124, // "b"
95,124, // "s"
96,124, // "t"
97,124, // "r"
98,124, // "c"
99,124, // "e"
100,124, // "o"
101,124, // "l"
102,124, // "n"
103,124, // "k"
104,124, // "y"
105,124, // "h"
106,124, // "i"
107,124, // "u"
108,124, // "d"
109,124, // "f"
110,124, // "m"
111,124, // "x"
112,124, // "g"
113,124, // "p"
114,124, // "v"
115,124, // "w"
116,124, // "z"
117,124, // "!"
118,124, // "="
119,124, // "%"
120,124, // "&"
121,124, // "|"
122,124, // "+"
123,124, // ","
124,124, // "-"
125,124, // "."
126,124, // "*"
127,124, // "/"
128,124, // ";"
129,124, // "<"
130,124, // ">"
131,124, // "("
132,124, // ")"
133,124, // "["
134,124, // "]"
135,124, // "{"
136,124, // "}"
139,312, // charPrintable
140,124, // '"'
143,124, // "0"
146,124, // "_"
147,567, // escapeSequence
148,844, // "\"
150,124, // {"1".."9"}
151,124, // {"#".."$" ":" "?".."@" "^" "`" "~"}
152,124, // {"A".."Z" "j" "q"}
153,124, // " "
  }
,
{ // state 556
-1, // $$start
-1, // start
593, // ws*
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+294, // $
-1, // $NT
  }
,
{ // state 557
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 558
0x80000000|361, // match move
0x80000000|836, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 559
0x80000000|508, // match move
0x80000000|832, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 560
171,MIN_REDUCTION+154, // $NT
  }
,
{ // state 561
0x80000000|56, // match move
0x80000000|629, // no-match move
0x80000000|1143, // NT-test-match state for printable
  }
,
{ // state 562
-1, // $$start
-1, // start
664, // ws*
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
-1, // `=
-1, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
MIN_REDUCTION+288, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+288, // $
-1, // $NT
  }
,
{ // state 563
98,758, // "c"
  }
,
{ // state 564
MIN_REDUCTION+352, // (default reduction)
  }
,
{ // state 565
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 566
-1, // $$start
-1, // start
971, // ws*
-1, // $$0
MIN_REDUCTION+102, // token
1137, // `boolean
24, // `class
869, // `extends
61, // `void
792, // `int
1121, // `while
525, // `if
999, // `else
232, // `for
505, // `break
440, // `this
1162, // `false
59, // `true
389, // `super
226, // `null
910, // `return
1097, // `instanceof
891, // `new
837, // `abstract
374, // `assert
776, // `byte
802, // `case
84, // `catch
690, // `char
29, // `const
716, // `continue
547, // `default
1109, // `do
1198, // `double
875, // `enum
1124, // `final
796, // `finally
614, // `float
392, // `goto
718, // `implements
198, // `import
1041, // `interface
688, // `long
419, // `native
145, // `package
1059, // `private
215, // `protected
651, // `public
924, // `short
368, // `static
364, // `strictfp
803, // `switch
444, // `synchronized
1090, // `throw
985, // `throws
320, // `transient
400, // `try
43, // `volatile
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
-1, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
885, // "a"
467, // "b"
995, // "s"
1002, // "t"
431, // "r"
721, // "c"
176, // "e"
MIN_REDUCTION+102, // "o"
100, // "l"
495, // "n"
MIN_REDUCTION+102, // "k"
MIN_REDUCTION+102, // "y"
MIN_REDUCTION+102, // "h"
501, // "i"
MIN_REDUCTION+102, // "u"
18, // "d"
32, // "f"
MIN_REDUCTION+102, // "m"
MIN_REDUCTION+102, // "x"
840, // "g"
269, // "p"
1006, // "v"
13, // "w"
MIN_REDUCTION+102, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
708, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+102, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+102, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+102, // $
MIN_REDUCTION+102, // $NT
  }
,
{ // state 567
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 568
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+212, // $
MIN_REDUCTION+212, // $NT
  }
,
{ // state 569
171,MIN_REDUCTION+178, // $NT
  }
,
{ // state 570
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 571
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 572
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 573
MIN_REDUCTION+359, // (default reduction)
  }
,
{ // state 574
0x80000000|982, // match move
0x80000000|960, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 575
101,94, // "l"
  }
,
{ // state 576
2,790, // ws*
157,534, // eol
158,204, // ws
160,634, // comment
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 577
0x80000000|76, // match move
0x80000000|105, // no-match move
0x80000000|165, // NT-test-match state for multilineCommentPrintable
  }
,
{ // state 578
MIN_REDUCTION+362, // (default reduction)
  }
,
{ // state 579
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 580
0x80000000|1068, // match move
0x80000000|456, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 581
-1, // $$start
-1, // start
283, // ws*
-1, // $$0
MIN_REDUCTION+132, // token
1137, // `boolean
24, // `class
869, // `extends
61, // `void
792, // `int
1121, // `while
525, // `if
999, // `else
232, // `for
505, // `break
440, // `this
1162, // `false
59, // `true
389, // `super
226, // `null
910, // `return
1097, // `instanceof
891, // `new
837, // `abstract
374, // `assert
776, // `byte
802, // `case
84, // `catch
690, // `char
29, // `const
716, // `continue
547, // `default
1109, // `do
1198, // `double
875, // `enum
1124, // `final
796, // `finally
614, // `float
392, // `goto
718, // `implements
198, // `import
1041, // `interface
688, // `long
419, // `native
145, // `package
1059, // `private
215, // `protected
651, // `public
924, // `short
368, // `static
364, // `strictfp
803, // `switch
444, // `synchronized
1090, // `throw
985, // `throws
320, // `transient
400, // `try
43, // `volatile
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
-1, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
885, // "a"
467, // "b"
995, // "s"
1002, // "t"
431, // "r"
721, // "c"
176, // "e"
MIN_REDUCTION+132, // "o"
100, // "l"
495, // "n"
MIN_REDUCTION+132, // "k"
MIN_REDUCTION+132, // "y"
MIN_REDUCTION+132, // "h"
501, // "i"
MIN_REDUCTION+132, // "u"
18, // "d"
32, // "f"
MIN_REDUCTION+132, // "m"
MIN_REDUCTION+132, // "x"
840, // "g"
269, // "p"
1006, // "v"
13, // "w"
MIN_REDUCTION+132, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
708, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+132, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+132, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+132, // $
MIN_REDUCTION+132, // $NT
  }
,
{ // state 582
171,MIN_REDUCTION+202, // $NT
  }
,
{ // state 583
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+253, // $
-1, // $NT
  }
,
{ // state 584
-1, // $$start
763, // start
683, // ws*
940, // $$0
694, // token
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
1159, // token*
206, // digit+
MIN_REDUCTION+1, // $
-1, // $NT
  }
,
{ // state 585
0x80000000|90, // match move
0x80000000|731, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 586
96,1042, // "t"
  }
,
{ // state 587
93,87, // "a"
97,148, // "r"
105,976, // "h"
  }
,
{ // state 588
96,428, // "t"
  }
,
{ // state 589
MIN_REDUCTION+324, // (default reduction)
  }
,
{ // state 590
96,1141, // "t"
104,171, // "y"
105,20, // "h"
107,989, // "u"
115,609, // "w"
  }
,
{ // state 591
0x80000000|774, // match move
0x80000000|10, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 592
0x80000000|1, // match move
0x80000000|483, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 593
0x80000000|996, // match move
0x80000000|40, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 594
0x80000000|260, // match move
0x80000000|766, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 595
171,MIN_REDUCTION+333, // $NT
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 596
2,305, // ws*
157,534, // eol
158,204, // ws
160,634, // comment
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 597
0x80000000|606, // match move
0x80000000|705, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 598
2,491, // ws*
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 599
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+261, // $
-1, // $NT
  }
,
{ // state 600
0x80000000|371, // match move
0x80000000|1203, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 601
171,MIN_REDUCTION+145, // $NT
  }
,
{ // state 602
0x80000000|943, // match move
0x80000000|334, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 603
2,580, // ws*
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 604
0x80000000|994, // match move
0x80000000|1171, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 605
110,632, // "m"
  }
,
{ // state 606
MIN_REDUCTION+365, // (default reduction)
  }
,
{ // state 607
0x80000000|1, // match move
0x80000000|771, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 608
0x80000000|1206, // match move
0x80000000|259, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 609
106,449, // "i"
  }
,
{ // state 610
93,589, // "a"
94,589, // "b"
95,589, // "s"
96,589, // "t"
97,589, // "r"
98,589, // "c"
99,589, // "e"
100,589, // "o"
101,589, // "l"
102,589, // "n"
103,589, // "k"
104,589, // "y"
105,589, // "h"
106,589, // "i"
107,589, // "u"
108,589, // "d"
109,589, // "f"
110,589, // "m"
111,589, // "x"
112,589, // "g"
113,589, // "p"
114,589, // "v"
115,589, // "w"
116,589, // "z"
117,589, // "!"
118,589, // "="
119,589, // "%"
120,589, // "&"
121,589, // "|"
122,589, // "+"
123,589, // ","
124,589, // "-"
125,589, // "."
126,589, // "*"
127,589, // "/"
128,589, // ";"
129,589, // "<"
130,589, // ">"
131,589, // "("
132,589, // ")"
133,589, // "["
134,589, // "]"
135,589, // "{"
136,589, // "}"
138,589, // "'"
140,208, // '"'
141,544, // stringPrintable*
142,4, // $$2
143,589, // "0"
146,589, // "_"
147,827, // escapeSequence
148,844, // "\"
150,589, // {"1".."9"}
151,589, // {"#".."$" ":" "?".."@" "^" "`" "~"}
152,589, // {"A".."Z" "j" "q"}
153,589, // " "
155,929, // stringPrintable
  }
,
{ // state 611
-1, // $$start
-1, // start
890, // ws*
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+300, // $
-1, // $NT
  }
,
{ // state 612
MIN_REDUCTION+329, // (default reduction)
  }
,
{ // state 613
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 614
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 615
0x80000000|991, // match move
0x80000000|915, // no-match move
0x80000000|165, // NT-test-match state for multilineCommentPrintable
  }
,
{ // state 616
99,657, // "e"
  }
,
{ // state 617
171,MIN_REDUCTION+94, // $NT
  }
,
{ // state 618
1,763, // start
2,683, // ws*
3,940, // $$0
4,694, // token
5,1137, // `boolean
6,24, // `class
7,869, // `extends
8,61, // `void
9,792, // `int
10,1121, // `while
11,525, // `if
12,999, // `else
13,232, // `for
14,505, // `break
15,440, // `this
16,1162, // `false
17,59, // `true
18,389, // `super
19,226, // `null
20,910, // `return
21,1097, // `instanceof
22,891, // `new
23,837, // `abstract
24,374, // `assert
25,776, // `byte
26,802, // `case
27,84, // `catch
28,690, // `char
29,29, // `const
30,716, // `continue
31,547, // `default
32,1109, // `do
33,1198, // `double
34,875, // `enum
35,1124, // `final
36,796, // `finally
37,614, // `float
38,392, // `goto
39,718, // `implements
40,198, // `import
41,1041, // `interface
42,688, // `long
43,419, // `native
44,145, // `package
45,1059, // `private
46,215, // `protected
47,651, // `public
48,924, // `short
49,368, // `static
50,364, // `strictfp
51,803, // `switch
52,444, // `synchronized
53,1090, // `throw
54,985, // `throws
55,320, // `transient
56,400, // `try
57,43, // `volatile
168,1159, // token*
  }
,
{ // state 619
0x80000000|470, // match move
0x80000000|698, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 620
171,MIN_REDUCTION+173, // $NT
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 621
0x80000000|220, // match move
0x80000000|1009, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 622
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 623
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 624
2,1024, // ws*
157,534, // eol
158,204, // ws
160,634, // comment
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 625
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 626
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+365, // (default reduction)
  }
,
{ // state 627
0x80000000|1064, // match move
0x80000000|122, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 628
102,406, // "n"
  }
,
{ // state 629
157,800, // eol
161,653, // printable**
163,1062, // {10}
164,1072, // {13}
167,178, // printable*
  }
,
{ // state 630
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 631
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 632
99,548, // "e"
  }
,
{ // state 633
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+101, // $
MIN_REDUCTION+101, // $NT
  }
,
{ // state 634
171,MIN_REDUCTION+334, // $NT
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 635
0x80000000|1180, // match move
0x80000000|1038, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 636
0x80000000|714, // match move
0x80000000|126, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 637
93,916, // "a"
  }
,
{ // state 638
2,890, // ws*
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 639
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+265, // $
-1, // $NT
  }
,
{ // state 640
0x80000000|1, // match move
0x80000000|882, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 641
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 642
0x80000000|47, // match move
0x80000000|649, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 643
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 644
0x80000000|526, // match move
0x80000000|49, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 645
0x80000000|248, // match move
0x80000000|973, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 646
0x80000000|842, // match move
0x80000000|728, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 647
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+218, // $
MIN_REDUCTION+218, // $NT
  }
,
{ // state 648
0x80000000|343, // match move
0x80000000|1028, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 649
0x80000000|603, // match move
0x80000000|779, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 650
0x80000000|417, // match move
0x80000000|115, // no-match move
0x80000000|1143, // NT-test-match state for printable
  }
,
{ // state 651
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 652
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+221, // $
MIN_REDUCTION+221, // $NT
  }
,
{ // state 653
157,494, // eol
163,1062, // {10}
164,1072, // {13}
  }
,
{ // state 654
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 655
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 656
171,MIN_REDUCTION+125, // $NT
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 657
0x80000000|1, // match move
0x80000000|1155, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 658
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 659
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 660
0x80000000|756, // match move
0x80000000|86, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 661
171,MIN_REDUCTION+109, // $NT
  }
,
{ // state 662
2,210, // ws*
157,534, // eol
158,204, // ws
160,634, // comment
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 663
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+257, // $
-1, // $NT
  }
,
{ // state 664
0x80000000|507, // match move
0x80000000|1039, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 665
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+95, // $
MIN_REDUCTION+95, // $NT
  }
,
{ // state 666
171,MIN_REDUCTION+166, // $NT
  }
,
{ // state 667
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 668
0x80000000|116, // match move
0x80000000|1102, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 669
103,1066, // "k"
  }
,
{ // state 670
-1, // $$start
-1, // start
1004, // ws*
-1, // $$0
MIN_REDUCTION+213, // token
1137, // `boolean
24, // `class
869, // `extends
61, // `void
792, // `int
1121, // `while
525, // `if
999, // `else
232, // `for
505, // `break
440, // `this
1162, // `false
59, // `true
389, // `super
226, // `null
910, // `return
1097, // `instanceof
891, // `new
837, // `abstract
374, // `assert
776, // `byte
802, // `case
84, // `catch
690, // `char
29, // `const
716, // `continue
547, // `default
1109, // `do
1198, // `double
875, // `enum
1124, // `final
796, // `finally
614, // `float
392, // `goto
718, // `implements
198, // `import
1041, // `interface
688, // `long
419, // `native
145, // `package
1059, // `private
215, // `protected
651, // `public
924, // `short
368, // `static
364, // `strictfp
803, // `switch
444, // `synchronized
1090, // `throw
985, // `throws
320, // `transient
400, // `try
43, // `volatile
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
-1, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
885, // "a"
467, // "b"
995, // "s"
1002, // "t"
431, // "r"
721, // "c"
176, // "e"
MIN_REDUCTION+213, // "o"
100, // "l"
495, // "n"
MIN_REDUCTION+213, // "k"
MIN_REDUCTION+213, // "y"
MIN_REDUCTION+213, // "h"
501, // "i"
MIN_REDUCTION+213, // "u"
18, // "d"
32, // "f"
MIN_REDUCTION+213, // "m"
MIN_REDUCTION+213, // "x"
840, // "g"
269, // "p"
1006, // "v"
13, // "w"
MIN_REDUCTION+213, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
708, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+213, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+213, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+213, // $
MIN_REDUCTION+213, // $NT
  }
,
{ // state 671
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+152, // $
MIN_REDUCTION+152, // $NT
  }
,
{ // state 672
-1, // $$start
-1, // start
522, // ws*
-1, // $$0
MIN_REDUCTION+159, // token
1137, // `boolean
24, // `class
869, // `extends
61, // `void
792, // `int
1121, // `while
525, // `if
999, // `else
232, // `for
505, // `break
440, // `this
1162, // `false
59, // `true
389, // `super
226, // `null
910, // `return
1097, // `instanceof
891, // `new
837, // `abstract
374, // `assert
776, // `byte
802, // `case
84, // `catch
690, // `char
29, // `const
716, // `continue
547, // `default
1109, // `do
1198, // `double
875, // `enum
1124, // `final
796, // `finally
614, // `float
392, // `goto
718, // `implements
198, // `import
1041, // `interface
688, // `long
419, // `native
145, // `package
1059, // `private
215, // `protected
651, // `public
924, // `short
368, // `static
364, // `strictfp
803, // `switch
444, // `synchronized
1090, // `throw
985, // `throws
320, // `transient
400, // `try
43, // `volatile
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
-1, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
885, // "a"
467, // "b"
995, // "s"
1002, // "t"
431, // "r"
721, // "c"
176, // "e"
MIN_REDUCTION+159, // "o"
100, // "l"
495, // "n"
MIN_REDUCTION+159, // "k"
MIN_REDUCTION+159, // "y"
MIN_REDUCTION+159, // "h"
501, // "i"
MIN_REDUCTION+159, // "u"
18, // "d"
32, // "f"
MIN_REDUCTION+159, // "m"
MIN_REDUCTION+159, // "x"
840, // "g"
269, // "p"
1006, // "v"
13, // "w"
MIN_REDUCTION+159, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
708, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+159, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+159, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+159, // $
MIN_REDUCTION+159, // $NT
  }
,
{ // state 673
93,1078, // "a"
  }
,
{ // state 674
0x80000000|874, // match move
0x80000000|514, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 675
-1, // $$start
-1, // start
233, // ws*
-1, // $$0
MIN_REDUCTION+120, // token
1137, // `boolean
24, // `class
869, // `extends
61, // `void
792, // `int
1121, // `while
525, // `if
999, // `else
232, // `for
505, // `break
440, // `this
1162, // `false
59, // `true
389, // `super
226, // `null
910, // `return
1097, // `instanceof
891, // `new
837, // `abstract
374, // `assert
776, // `byte
802, // `case
84, // `catch
690, // `char
29, // `const
716, // `continue
547, // `default
1109, // `do
1198, // `double
875, // `enum
1124, // `final
796, // `finally
614, // `float
392, // `goto
718, // `implements
198, // `import
1041, // `interface
688, // `long
419, // `native
145, // `package
1059, // `private
215, // `protected
651, // `public
924, // `short
368, // `static
364, // `strictfp
803, // `switch
444, // `synchronized
1090, // `throw
985, // `throws
320, // `transient
400, // `try
43, // `volatile
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
-1, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
885, // "a"
467, // "b"
995, // "s"
1002, // "t"
431, // "r"
721, // "c"
176, // "e"
MIN_REDUCTION+120, // "o"
100, // "l"
495, // "n"
MIN_REDUCTION+120, // "k"
MIN_REDUCTION+120, // "y"
MIN_REDUCTION+120, // "h"
501, // "i"
MIN_REDUCTION+120, // "u"
18, // "d"
32, // "f"
MIN_REDUCTION+120, // "m"
MIN_REDUCTION+120, // "x"
840, // "g"
269, // "p"
1006, // "v"
13, // "w"
MIN_REDUCTION+120, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
708, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+120, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+120, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+120, // $
MIN_REDUCTION+120, // $NT
  }
,
{ // state 676
0x80000000|319, // match move
0x80000000|1204, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 677
0x80000000|1, // match move
0x80000000|433, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 678
0x80000000|1, // match move
0x80000000|1016, // no-match move
// T-test match for "/":
127,
  }
,
{ // state 679
93,1003, // "a"
  }
,
{ // state 680
0x80000000|1, // match move
0x80000000|172, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 681
171,MIN_REDUCTION+124, // $NT
  }
,
{ // state 682
0x80000000|286, // match move
0x80000000|663, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 683
0x80000000|207, // match move
0x80000000|608, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 684
106,795, // "i"
  }
,
{ // state 685
94,856, // "b"
  }
,
{ // state 686
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+179, // $
MIN_REDUCTION+179, // $NT
  }
,
{ // state 687
98,421, // "c"
  }
,
{ // state 688
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 689
171,MIN_REDUCTION+161, // $NT
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 690
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 691
0x80000000|775, // match move
0x80000000|125, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 692
99,1187, // "e"
  }
,
{ // state 693
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+227, // $
MIN_REDUCTION+227, // $NT
  }
,
{ // state 694
MIN_REDUCTION+353, // (default reduction)
  }
,
{ // state 695
118,642, // "="
  }
,
{ // state 696
0x80000000|219, // match move
0x80000000|993, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 697
171,MIN_REDUCTION+121, // $NT
  }
,
{ // state 698
-1, // $$start
-1, // start
210, // ws*
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+270, // $
-1, // $NT
  }
,
{ // state 699
143,27, // "0"
145,437, // digit
150,27, // {"1".."9"}
  }
,
{ // state 700
171,MIN_REDUCTION+175, // $NT
  }
,
{ // state 701
106,965, // "i"
  }
,
{ // state 702
102,182, // "n"
  }
,
{ // state 703
171,MIN_REDUCTION+155, // $NT
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 704
0x80000000|200, // match move
0x80000000|818, // no-match move
0x80000000|165, // NT-test-match state for multilineCommentPrintable
  }
,
{ // state 705
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+365, // token
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+365, // $
-1, // $NT
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
{ // state 706
MIN_REDUCTION+355, // (default reduction)
  }
,
{ // state 707
-1, // $$start
-1, // start
1063, // ws*
-1, // $$0
MIN_REDUCTION+93, // token
1137, // `boolean
24, // `class
869, // `extends
61, // `void
792, // `int
1121, // `while
525, // `if
999, // `else
232, // `for
505, // `break
440, // `this
1162, // `false
59, // `true
389, // `super
226, // `null
910, // `return
1097, // `instanceof
891, // `new
837, // `abstract
374, // `assert
776, // `byte
802, // `case
84, // `catch
690, // `char
29, // `const
716, // `continue
547, // `default
1109, // `do
1198, // `double
875, // `enum
1124, // `final
796, // `finally
614, // `float
392, // `goto
718, // `implements
198, // `import
1041, // `interface
688, // `long
419, // `native
145, // `package
1059, // `private
215, // `protected
651, // `public
924, // `short
368, // `static
364, // `strictfp
803, // `switch
444, // `synchronized
1090, // `throw
985, // `throws
320, // `transient
400, // `try
43, // `volatile
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
-1, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
885, // "a"
467, // "b"
995, // "s"
1002, // "t"
431, // "r"
721, // "c"
176, // "e"
MIN_REDUCTION+93, // "o"
100, // "l"
495, // "n"
MIN_REDUCTION+93, // "k"
MIN_REDUCTION+93, // "y"
MIN_REDUCTION+93, // "h"
501, // "i"
MIN_REDUCTION+93, // "u"
18, // "d"
32, // "f"
MIN_REDUCTION+93, // "m"
MIN_REDUCTION+93, // "x"
840, // "g"
269, // "p"
1006, // "v"
13, // "w"
MIN_REDUCTION+93, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
708, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+93, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+93, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+93, // $
MIN_REDUCTION+93, // $NT
  }
,
{ // state 708
0x80000000|1, // match move
0x80000000|572, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 709
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+295, // $
-1, // $NT
  }
,
{ // state 710
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 711
0x80000000|1, // match move
0x80000000|486, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 712
0x80000000|70, // match move
0x80000000|57, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 713
4,564, // token
58,432, // `!
59,309, // `!=
60,1115, // `%
61,565, // `&&
62,786, // `*
63,450, // `(
64,760, // `)
65,396, // `{
66,1013, // `}
67,155, // `-
68,88, // `+
69,379, // `=
70,849, // `==
71,1001, // `[
72,438, // `]
73,515, // `||
74,997, // `<
75,931, // `<=
76,579, // `,
77,933, // `>
78,446, // `>=
79,1010, // `.
80,1076, // `;
81,510, // `++
82,552, // `--
83,258, // `/
84,213, // ID
85,625, // INTLIT
86,658, // STRINGLIT
87,1067, // CHARLIT
89,307, // letter
137,503, // intLit2
143,708, // "0"
  }
,
{ // state 714
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 715
-1, // $$start
-1, // start
179, // ws*
-1, // $$0
MIN_REDUCTION+216, // token
1137, // `boolean
24, // `class
869, // `extends
61, // `void
792, // `int
1121, // `while
525, // `if
999, // `else
232, // `for
505, // `break
440, // `this
1162, // `false
59, // `true
389, // `super
226, // `null
910, // `return
1097, // `instanceof
891, // `new
837, // `abstract
374, // `assert
776, // `byte
802, // `case
84, // `catch
690, // `char
29, // `const
716, // `continue
547, // `default
1109, // `do
1198, // `double
875, // `enum
1124, // `final
796, // `finally
614, // `float
392, // `goto
718, // `implements
198, // `import
1041, // `interface
688, // `long
419, // `native
145, // `package
1059, // `private
215, // `protected
651, // `public
924, // `short
368, // `static
364, // `strictfp
803, // `switch
444, // `synchronized
1090, // `throw
985, // `throws
320, // `transient
400, // `try
43, // `volatile
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
-1, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
885, // "a"
467, // "b"
995, // "s"
1002, // "t"
431, // "r"
721, // "c"
176, // "e"
MIN_REDUCTION+216, // "o"
100, // "l"
495, // "n"
MIN_REDUCTION+216, // "k"
MIN_REDUCTION+216, // "y"
MIN_REDUCTION+216, // "h"
501, // "i"
MIN_REDUCTION+216, // "u"
18, // "d"
32, // "f"
MIN_REDUCTION+216, // "m"
MIN_REDUCTION+216, // "x"
840, // "g"
269, // "p"
1006, // "v"
13, // "w"
MIN_REDUCTION+216, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
708, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+216, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+216, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+216, // $
MIN_REDUCTION+216, // $NT
  }
,
{ // state 716
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 717
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+185, // $
MIN_REDUCTION+185, // $NT
  }
,
{ // state 718
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 719
-1, // $$start
-1, // start
843, // ws*
-1, // $$0
MIN_REDUCTION+198, // token
1137, // `boolean
24, // `class
869, // `extends
61, // `void
792, // `int
1121, // `while
525, // `if
999, // `else
232, // `for
505, // `break
440, // `this
1162, // `false
59, // `true
389, // `super
226, // `null
910, // `return
1097, // `instanceof
891, // `new
837, // `abstract
374, // `assert
776, // `byte
802, // `case
84, // `catch
690, // `char
29, // `const
716, // `continue
547, // `default
1109, // `do
1198, // `double
875, // `enum
1124, // `final
796, // `finally
614, // `float
392, // `goto
718, // `implements
198, // `import
1041, // `interface
688, // `long
419, // `native
145, // `package
1059, // `private
215, // `protected
651, // `public
924, // `short
368, // `static
364, // `strictfp
803, // `switch
444, // `synchronized
1090, // `throw
985, // `throws
320, // `transient
400, // `try
43, // `volatile
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
-1, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
885, // "a"
467, // "b"
995, // "s"
1002, // "t"
431, // "r"
721, // "c"
176, // "e"
MIN_REDUCTION+198, // "o"
100, // "l"
495, // "n"
MIN_REDUCTION+198, // "k"
MIN_REDUCTION+198, // "y"
MIN_REDUCTION+198, // "h"
501, // "i"
MIN_REDUCTION+198, // "u"
18, // "d"
32, // "f"
MIN_REDUCTION+198, // "m"
MIN_REDUCTION+198, // "x"
840, // "g"
269, // "p"
1006, // "v"
13, // "w"
MIN_REDUCTION+198, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
708, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+198, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+198, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+198, // $
MIN_REDUCTION+198, // $NT
  }
,
{ // state 720
0x80000000|1181, // match move
0x80000000|772, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 721
93,778, // "a"
100,341, // "o"
101,463, // "l"
105,530, // "h"
  }
,
{ // state 722
0x80000000|737, // match move
0x80000000|709, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 723
106,225, // "i"
  }
,
{ // state 724
99,488, // "e"
  }
,
{ // state 725
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+299, // $
-1, // $NT
  }
,
{ // state 726
-1, // $$start
-1, // start
790, // ws*
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+296, // $
-1, // $NT
  }
,
{ // state 727
99,939, // "e"
  }
,
{ // state 728
0x80000000|217, // match move
0x80000000|1128, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 729
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 730
105,1087, // "h"
  }
,
{ // state 731
0x80000000|817, // match move
0x80000000|752, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 732
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+194, // $
MIN_REDUCTION+194, // $NT
  }
,
{ // state 733
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+263, // $
-1, // $NT
  }
,
{ // state 734
96,472, // "t"
  }
,
{ // state 735
0x80000000|983, // match move
0x80000000|238, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 736
0x80000000|1, // match move
0x80000000|761, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 737
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 738
122,981, // "+"
  }
,
{ // state 739
99,880, // "e"
  }
,
{ // state 740
0x80000000|824, // match move
0x80000000|549, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 741
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+271, // $
-1, // $NT
  }
,
{ // state 742
2,429, // ws*
157,534, // eol
158,204, // ws
160,634, // comment
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 743
171,MIN_REDUCTION+311, // $NT
  }
,
{ // state 744
126,577, // "*"
127,561, // "/"
  }
,
{ // state 745
171,MIN_REDUCTION+331, // $NT
  }
,
{ // state 746
0x80000000|1, // match move
0x80000000|850, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 747
0x80000000|1, // match move
0x80000000|1034, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 748
0x80000000|373, // match move
0x80000000|194, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 749
163,704, // {10}
  }
,
{ // state 750
0x80000000|911, // match move
0x80000000|531, // no-match move
0x80000000|165, // NT-test-match state for multilineCommentPrintable
  }
,
{ // state 751
0x80000000|537, // match move
0x80000000|509, // no-match move
0x80000000|1143, // NT-test-match state for printable
  }
,
{ // state 752
-1, // $$start
-1, // start
249, // ws*
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+272, // $
-1, // $NT
  }
,
{ // state 753
0x80000000|1, // match move
0x80000000|1150, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 754
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 755
96,677, // "t"
  }
,
{ // state 756
171,MIN_REDUCTION+248, // $NT
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 757
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 758
96,160, // "t"
  }
,
{ // state 759
0x80000000|452, // match move
0x80000000|556, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 760
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 761
-1, // $$start
-1, // start
1015, // ws*
-1, // $$0
MIN_REDUCTION+219, // token
1137, // `boolean
24, // `class
869, // `extends
61, // `void
792, // `int
1121, // `while
525, // `if
999, // `else
232, // `for
505, // `break
440, // `this
1162, // `false
59, // `true
389, // `super
226, // `null
910, // `return
1097, // `instanceof
891, // `new
837, // `abstract
374, // `assert
776, // `byte
802, // `case
84, // `catch
690, // `char
29, // `const
716, // `continue
547, // `default
1109, // `do
1198, // `double
875, // `enum
1124, // `final
796, // `finally
614, // `float
392, // `goto
718, // `implements
198, // `import
1041, // `interface
688, // `long
419, // `native
145, // `package
1059, // `private
215, // `protected
651, // `public
924, // `short
368, // `static
364, // `strictfp
803, // `switch
444, // `synchronized
1090, // `throw
985, // `throws
320, // `transient
400, // `try
43, // `volatile
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
-1, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
885, // "a"
467, // "b"
995, // "s"
1002, // "t"
431, // "r"
721, // "c"
176, // "e"
MIN_REDUCTION+219, // "o"
100, // "l"
495, // "n"
MIN_REDUCTION+219, // "k"
MIN_REDUCTION+219, // "y"
MIN_REDUCTION+219, // "h"
501, // "i"
MIN_REDUCTION+219, // "u"
18, // "d"
32, // "f"
MIN_REDUCTION+219, // "m"
MIN_REDUCTION+219, // "x"
840, // "g"
269, // "p"
1006, // "v"
13, // "w"
MIN_REDUCTION+219, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
708, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+219, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+219, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+219, // $
MIN_REDUCTION+219, // $NT
  }
,
{ // state 762
171,MIN_REDUCTION+236, // $NT
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 763
170,MIN_REDUCTION+0, // $
  }
,
{ // state 764
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+140, // $
MIN_REDUCTION+140, // $NT
  }
,
{ // state 765
0x80000000|1020, // match move
0x80000000|1017, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 766
0x80000000|762, // match move
0x80000000|1174, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 767
-1, // $$start
-1, // start
289, // ws*
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
-1, // `=
-1, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
MIN_REDUCTION+280, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+280, // $
-1, // $NT
  }
,
{ // state 768
-1, // $$start
-1, // start
676, // ws*
-1, // $$0
MIN_REDUCTION+138, // token
1137, // `boolean
24, // `class
869, // `extends
61, // `void
792, // `int
1121, // `while
525, // `if
999, // `else
232, // `for
505, // `break
440, // `this
1162, // `false
59, // `true
389, // `super
226, // `null
910, // `return
1097, // `instanceof
891, // `new
837, // `abstract
374, // `assert
776, // `byte
802, // `case
84, // `catch
690, // `char
29, // `const
716, // `continue
547, // `default
1109, // `do
1198, // `double
875, // `enum
1124, // `final
796, // `finally
614, // `float
392, // `goto
718, // `implements
198, // `import
1041, // `interface
688, // `long
419, // `native
145, // `package
1059, // `private
215, // `protected
651, // `public
924, // `short
368, // `static
364, // `strictfp
803, // `switch
444, // `synchronized
1090, // `throw
985, // `throws
320, // `transient
400, // `try
43, // `volatile
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
-1, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
885, // "a"
467, // "b"
995, // "s"
1002, // "t"
431, // "r"
721, // "c"
176, // "e"
MIN_REDUCTION+138, // "o"
100, // "l"
495, // "n"
MIN_REDUCTION+138, // "k"
MIN_REDUCTION+138, // "y"
MIN_REDUCTION+138, // "h"
501, // "i"
MIN_REDUCTION+138, // "u"
18, // "d"
32, // "f"
MIN_REDUCTION+138, // "m"
MIN_REDUCTION+138, // "x"
840, // "g"
269, // "p"
1006, // "v"
13, // "w"
MIN_REDUCTION+138, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
708, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+138, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+138, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+138, // $
MIN_REDUCTION+138, // $NT
  }
,
{ // state 769
0x80000000|1, // match move
0x80000000|797, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 770
101,1158, // "l"
  }
,
{ // state 771
-1, // $$start
-1, // start
117, // ws*
-1, // $$0
MIN_REDUCTION+162, // token
1137, // `boolean
24, // `class
869, // `extends
61, // `void
792, // `int
1121, // `while
525, // `if
999, // `else
232, // `for
505, // `break
440, // `this
1162, // `false
59, // `true
389, // `super
226, // `null
910, // `return
1097, // `instanceof
891, // `new
837, // `abstract
374, // `assert
776, // `byte
802, // `case
84, // `catch
690, // `char
29, // `const
716, // `continue
547, // `default
1109, // `do
1198, // `double
875, // `enum
1124, // `final
796, // `finally
614, // `float
392, // `goto
718, // `implements
198, // `import
1041, // `interface
688, // `long
419, // `native
145, // `package
1059, // `private
215, // `protected
651, // `public
924, // `short
368, // `static
364, // `strictfp
803, // `switch
444, // `synchronized
1090, // `throw
985, // `throws
320, // `transient
400, // `try
43, // `volatile
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
-1, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
885, // "a"
467, // "b"
995, // "s"
1002, // "t"
431, // "r"
721, // "c"
176, // "e"
MIN_REDUCTION+162, // "o"
100, // "l"
495, // "n"
MIN_REDUCTION+162, // "k"
MIN_REDUCTION+162, // "y"
MIN_REDUCTION+162, // "h"
501, // "i"
MIN_REDUCTION+162, // "u"
18, // "d"
32, // "f"
MIN_REDUCTION+162, // "m"
MIN_REDUCTION+162, // "x"
840, // "g"
269, // "p"
1006, // "v"
13, // "w"
MIN_REDUCTION+162, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
708, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+162, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+162, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+162, // $
MIN_REDUCTION+162, // $NT
  }
,
{ // state 772
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+209, // $
MIN_REDUCTION+209, // $NT
  }
,
{ // state 773
0x80000000|336, // match move
0x80000000|314, // no-match move
// T-test match for "=":
118,
  }
,
{ // state 774
2,330, // ws*
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 775
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 776
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 777
0x80000000|1, // match move
0x80000000|358, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 778
95,157, // "s"
96,815, // "t"
  }
,
{ // state 779
-1, // $$start
-1, // start
580, // ws*
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+254, // $
-1, // $NT
  }
,
{ // state 780
0x80000000|695, // match move
0x80000000|1166, // no-match move
// T-test match for "=":
118,
  }
,
{ // state 781
171,MIN_REDUCTION+185, // $NT
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 782
97,755, // "r"
  }
,
{ // state 783
0x80000000|209, // match move
0x80000000|845, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 784
0x80000000|794, // match move
0x80000000|671, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 785
0x80000000|1152, // match move
0x80000000|1051, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 786
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 787
2,461, // ws*
157,534, // eol
158,204, // ws
160,634, // comment
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 788
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+200, // $
MIN_REDUCTION+200, // $NT
  }
,
{ // state 789
2,1096, // ws*
157,534, // eol
158,204, // ws
160,634, // comment
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 790
0x80000000|908, // match move
0x80000000|722, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 791
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+206, // $
MIN_REDUCTION+206, // $NT
  }
,
{ // state 792
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 793
0x80000000|618, // match move
0x80000000|1074, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 794
171,MIN_REDUCTION+152, // $NT
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 795
101,692, // "l"
  }
,
{ // state 796
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 797
-1, // $$start
-1, // start
14, // ws*
-1, // $$0
MIN_REDUCTION+165, // token
1137, // `boolean
24, // `class
869, // `extends
61, // `void
792, // `int
1121, // `while
525, // `if
999, // `else
232, // `for
505, // `break
440, // `this
1162, // `false
59, // `true
389, // `super
226, // `null
910, // `return
1097, // `instanceof
891, // `new
837, // `abstract
374, // `assert
776, // `byte
802, // `case
84, // `catch
690, // `char
29, // `const
716, // `continue
547, // `default
1109, // `do
1198, // `double
875, // `enum
1124, // `final
796, // `finally
614, // `float
392, // `goto
718, // `implements
198, // `import
1041, // `interface
688, // `long
419, // `native
145, // `package
1059, // `private
215, // `protected
651, // `public
924, // `short
368, // `static
364, // `strictfp
803, // `switch
444, // `synchronized
1090, // `throw
985, // `throws
320, // `transient
400, // `try
43, // `volatile
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
-1, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
885, // "a"
467, // "b"
995, // "s"
1002, // "t"
431, // "r"
721, // "c"
176, // "e"
MIN_REDUCTION+165, // "o"
100, // "l"
495, // "n"
MIN_REDUCTION+165, // "k"
MIN_REDUCTION+165, // "y"
MIN_REDUCTION+165, // "h"
501, // "i"
MIN_REDUCTION+165, // "u"
18, // "d"
32, // "f"
MIN_REDUCTION+165, // "m"
MIN_REDUCTION+165, // "x"
840, // "g"
269, // "p"
1006, // "v"
13, // "w"
MIN_REDUCTION+165, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
708, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+165, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+165, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+165, // $
MIN_REDUCTION+165, // $NT
  }
,
{ // state 798
0x80000000|590, // match move
0x80000000|39, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 799
-1, // $$start
-1, // start
921, // ws*
-1, // $$0
MIN_REDUCTION+177, // token
1137, // `boolean
24, // `class
869, // `extends
61, // `void
792, // `int
1121, // `while
525, // `if
999, // `else
232, // `for
505, // `break
440, // `this
1162, // `false
59, // `true
389, // `super
226, // `null
910, // `return
1097, // `instanceof
891, // `new
837, // `abstract
374, // `assert
776, // `byte
802, // `case
84, // `catch
690, // `char
29, // `const
716, // `continue
547, // `default
1109, // `do
1198, // `double
875, // `enum
1124, // `final
796, // `finally
614, // `float
392, // `goto
718, // `implements
198, // `import
1041, // `interface
688, // `long
419, // `native
145, // `package
1059, // `private
215, // `protected
651, // `public
924, // `short
368, // `static
364, // `strictfp
803, // `switch
444, // `synchronized
1090, // `throw
985, // `throws
320, // `transient
400, // `try
43, // `volatile
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
-1, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
885, // "a"
467, // "b"
995, // "s"
1002, // "t"
431, // "r"
721, // "c"
176, // "e"
MIN_REDUCTION+177, // "o"
100, // "l"
495, // "n"
MIN_REDUCTION+177, // "k"
MIN_REDUCTION+177, // "y"
MIN_REDUCTION+177, // "h"
501, // "i"
MIN_REDUCTION+177, // "u"
18, // "d"
32, // "f"
MIN_REDUCTION+177, // "m"
MIN_REDUCTION+177, // "x"
840, // "g"
269, // "p"
1006, // "v"
13, // "w"
MIN_REDUCTION+177, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
708, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+177, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+177, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+177, // $
MIN_REDUCTION+177, // $NT
  }
,
{ // state 800
171,MIN_REDUCTION+336, // $NT
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 801
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 802
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 803
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 804
171,MIN_REDUCTION+247, // $NT
  }
,
{ // state 805
171,MIN_REDUCTION+140, // $NT
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 806
0x80000000|1077, // match move
0x80000000|497, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 807
171,MIN_REDUCTION+191, // $NT
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 808
0x80000000|809, // match move
0x80000000|218, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 809
171,MIN_REDUCTION+245, // $NT
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 810
0x80000000|1104, // match move
0x80000000|292, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 811
112,739, // "g"
  }
,
{ // state 812
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+251, // $
-1, // $NT
  }
,
{ // state 813
171,MIN_REDUCTION+242, // $NT
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 814
0x80000000|1, // match move
0x80000000|227, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 815
98,221, // "c"
  }
,
{ // state 816
101,673, // "l"
106,7, // "i"
  }
,
{ // state 817
2,249, // ws*
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 818
MIN_REDUCTION+343, // (default reduction)
  }
,
{ // state 819
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 820
0x80000000|1, // match move
0x80000000|272, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 821
96,640, // "t"
  }
,
{ // state 822
2,1136, // ws*
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 823
0x80000000|242, // match move
0x80000000|1095, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 824
2,3, // ws*
157,534, // eol
158,204, // ws
160,634, // comment
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 825
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+155, // $
MIN_REDUCTION+155, // $NT
  }
,
{ // state 826
0x80000000|98, // match move
0x80000000|888, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 827
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 828
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 829
171,MIN_REDUCTION+95, // $NT
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 830
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 831
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 832
0x80000000|963, // match move
0x80000000|287, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 833
104,680, // "y"
  }
,
{ // state 834
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 835
93,424, // "a"
  }
,
{ // state 836
0x80000000|164, // match move
0x80000000|639, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 837
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 838
0x80000000|953, // match move
0x80000000|1178, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 839
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 840
100,323, // "o"
  }
,
{ // state 841
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 842
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 843
0x80000000|162, // match move
0x80000000|838, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 844
96,1188, // "t"
97,300, // "r"
102,1156, // "n"
109,1201, // "f"
138,1134, // "'"
140,282, // '"'
148,659, // "\"
  }
,
{ // state 845
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+291, // $
-1, // $NT
  }
,
{ // state 846
171,MIN_REDUCTION+344, // $NT
MIN_REDUCTION+344, // (default reduction)
  }
,
{ // state 847
171,MIN_REDUCTION+224, // $NT
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 848
0x80000000|1032, // match move
0x80000000|1193, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 849
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 850
-1, // $$start
-1, // start
1191, // ws*
-1, // $$0
MIN_REDUCTION+183, // token
1137, // `boolean
24, // `class
869, // `extends
61, // `void
792, // `int
1121, // `while
525, // `if
999, // `else
232, // `for
505, // `break
440, // `this
1162, // `false
59, // `true
389, // `super
226, // `null
910, // `return
1097, // `instanceof
891, // `new
837, // `abstract
374, // `assert
776, // `byte
802, // `case
84, // `catch
690, // `char
29, // `const
716, // `continue
547, // `default
1109, // `do
1198, // `double
875, // `enum
1124, // `final
796, // `finally
614, // `float
392, // `goto
718, // `implements
198, // `import
1041, // `interface
688, // `long
419, // `native
145, // `package
1059, // `private
215, // `protected
651, // `public
924, // `short
368, // `static
364, // `strictfp
803, // `switch
444, // `synchronized
1090, // `throw
985, // `throws
320, // `transient
400, // `try
43, // `volatile
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
-1, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
885, // "a"
467, // "b"
995, // "s"
1002, // "t"
431, // "r"
721, // "c"
176, // "e"
MIN_REDUCTION+183, // "o"
100, // "l"
495, // "n"
MIN_REDUCTION+183, // "k"
MIN_REDUCTION+183, // "y"
MIN_REDUCTION+183, // "h"
501, // "i"
MIN_REDUCTION+183, // "u"
18, // "d"
32, // "f"
MIN_REDUCTION+183, // "m"
MIN_REDUCTION+183, // "x"
840, // "g"
269, // "p"
1006, // "v"
13, // "w"
MIN_REDUCTION+183, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
708, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+183, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+183, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+183, // $
MIN_REDUCTION+183, // $NT
  }
,
{ // state 851
96,1210, // "t"
  }
,
{ // state 852
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+191, // $
MIN_REDUCTION+191, // $NT
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
{ // state 853
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 854
109,1185, // "f"
  }
,
{ // state 855
-1, // $$start
-1, // start
322, // ws*
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
-1, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
-1, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
MIN_REDUCTION+262, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+262, // $
-1, // $NT
  }
,
{ // state 856
101,701, // "l"
  }
,
{ // state 857
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 858
0x80000000|1100, // match move
0x80000000|278, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 859
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+239, // $
MIN_REDUCTION+239, // $NT
  }
,
{ // state 860
0x80000000|245, // match move
0x80000000|356, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 861
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 862
171,MIN_REDUCTION+169, // $NT
  }
,
{ // state 863
0x80000000|906, // match move
0x80000000|34, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 864
98,730, // "c"
  }
,
{ // state 865
0x80000000|573, // match move
0x80000000|451, // no-match move
0x80000000|165, // NT-test-match state for multilineCommentPrintable
  }
,
{ // state 866
0x80000000|416, // match move
0x80000000|340, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 867
103,920, // "k"
  }
,
{ // state 868
0x80000000|613, // match move
0x80000000|733, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 869
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 870
0x80000000|342, // match move
0x80000000|8, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 871
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 872
96,533, // "t"
  }
,
{ // state 873
171,MIN_REDUCTION+227, // $NT
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 874
171,MIN_REDUCTION+170, // $NT
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 875
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 876
0x80000000|729, // match move
0x80000000|643, // no-match move
0x80000000|165, // NT-test-match state for multilineCommentPrintable
  }
,
{ // state 877
93,535, // "a"
104,592, // "y"
107,118, // "u"
  }
,
{ // state 878
95,872, // "s"
  }
,
{ // state 879
0x80000000|871, // match move
0x80000000|801, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 880
0x80000000|1, // match move
0x80000000|173, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 881
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 882
-1, // $$start
-1, // start
500, // ws*
-1, // $$0
MIN_REDUCTION+207, // token
1137, // `boolean
24, // `class
869, // `extends
61, // `void
792, // `int
1121, // `while
525, // `if
999, // `else
232, // `for
505, // `break
440, // `this
1162, // `false
59, // `true
389, // `super
226, // `null
910, // `return
1097, // `instanceof
891, // `new
837, // `abstract
374, // `assert
776, // `byte
802, // `case
84, // `catch
690, // `char
29, // `const
716, // `continue
547, // `default
1109, // `do
1198, // `double
875, // `enum
1124, // `final
796, // `finally
614, // `float
392, // `goto
718, // `implements
198, // `import
1041, // `interface
688, // `long
419, // `native
145, // `package
1059, // `private
215, // `protected
651, // `public
924, // `short
368, // `static
364, // `strictfp
803, // `switch
444, // `synchronized
1090, // `throw
985, // `throws
320, // `transient
400, // `try
43, // `volatile
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
-1, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
885, // "a"
467, // "b"
995, // "s"
1002, // "t"
431, // "r"
721, // "c"
176, // "e"
MIN_REDUCTION+207, // "o"
100, // "l"
495, // "n"
MIN_REDUCTION+207, // "k"
MIN_REDUCTION+207, // "y"
MIN_REDUCTION+207, // "h"
501, // "i"
MIN_REDUCTION+207, // "u"
18, // "d"
32, // "f"
MIN_REDUCTION+207, // "m"
MIN_REDUCTION+207, // "x"
840, // "g"
269, // "p"
1006, // "v"
13, // "w"
MIN_REDUCTION+207, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
708, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+207, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+207, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+207, // $
MIN_REDUCTION+207, // $NT
  }
,
{ // state 883
2,63, // ws*
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 884
105,736, // "h"
  }
,
{ // state 885
94,878, // "b"
95,250, // "s"
  }
,
{ // state 886
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 887
0x80000000|1, // match move
0x80000000|435, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 888
0x80000000|807, // match move
0x80000000|852, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 889
MIN_REDUCTION+358, // (default reduction)
  }
,
{ // state 890
0x80000000|205, // match move
0x80000000|285, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 891
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 892
-1, // $$start
-1, // start
316, // ws*
-1, // $$0
MIN_REDUCTION+108, // token
1137, // `boolean
24, // `class
869, // `extends
61, // `void
792, // `int
1121, // `while
525, // `if
999, // `else
232, // `for
505, // `break
440, // `this
1162, // `false
59, // `true
389, // `super
226, // `null
910, // `return
1097, // `instanceof
891, // `new
837, // `abstract
374, // `assert
776, // `byte
802, // `case
84, // `catch
690, // `char
29, // `const
716, // `continue
547, // `default
1109, // `do
1198, // `double
875, // `enum
1124, // `final
796, // `finally
614, // `float
392, // `goto
718, // `implements
198, // `import
1041, // `interface
688, // `long
419, // `native
145, // `package
1059, // `private
215, // `protected
651, // `public
924, // `short
368, // `static
364, // `strictfp
803, // `switch
444, // `synchronized
1090, // `throw
985, // `throws
320, // `transient
400, // `try
43, // `volatile
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
-1, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
885, // "a"
467, // "b"
995, // "s"
1002, // "t"
431, // "r"
721, // "c"
176, // "e"
MIN_REDUCTION+108, // "o"
100, // "l"
495, // "n"
MIN_REDUCTION+108, // "k"
MIN_REDUCTION+108, // "y"
MIN_REDUCTION+108, // "h"
501, // "i"
MIN_REDUCTION+108, // "u"
18, // "d"
32, // "f"
MIN_REDUCTION+108, // "m"
MIN_REDUCTION+108, // "x"
840, // "g"
269, // "p"
1006, // "v"
13, // "w"
MIN_REDUCTION+108, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
708, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+108, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+108, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+108, // $
MIN_REDUCTION+108, // $NT
  }
,
{ // state 893
0x80000000|744, // match move
0x80000000|980, // no-match move
// T-test match for {"*" "/"}:
126,
127,
  }
,
{ // state 894
-1, // $$start
-1, // start
170, // ws*
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+304, // $
-1, // $NT
  }
,
{ // state 895
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 896
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 897
0x80000000|297, // match move
0x80000000|1117, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 898
171,MIN_REDUCTION+220, // $NT
  }
,
{ // state 899
0x80000000|946, // match move
0x80000000|296, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 900
0x80000000|1147, // match move
0x80000000|48, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 901
100,381, // "o"
104,680, // "y"
  }
,
{ // state 902
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 903
98,439, // "c"
  }
,
{ // state 904
171,MIN_REDUCTION+190, // $NT
  }
,
{ // state 905
0x80000000|1, // match move
0x80000000|980, // no-match move
// T-test match for {"*" "/"}:
126,
127,
  }
,
{ // state 906
2,322, // ws*
157,534, // eol
158,204, // ws
160,634, // comment
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 907
99,746, // "e"
  }
,
{ // state 908
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 909
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 910
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 911
MIN_REDUCTION+330, // (default reduction)
  }
,
{ // state 912
102,441, // "n"
  }
,
{ // state 913
-1, // $$start
-1, // start
558, // ws*
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+266, // $
-1, // $NT
  }
,
{ // state 914
0x80000000|703, // match move
0x80000000|825, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 915
MIN_REDUCTION+350, // (default reduction)
  }
,
{ // state 916
96,711, // "t"
  }
,
{ // state 917
99,58, // "e"
  }
,
{ // state 918
0x80000000|1, // match move
0x80000000|111, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 919
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+173, // $
MIN_REDUCTION+173, // $NT
  }
,
{ // state 920
93,811, // "a"
  }
,
{ // state 921
0x80000000|667, // match move
0x80000000|184, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 922
171,MIN_REDUCTION+206, // $NT
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 923
171,MIN_REDUCTION+134, // $NT
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 924
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 925
0x80000000|1, // match move
0x80000000|413, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 926
0x80000000|169, // match move
0x80000000|1049, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 927
0x80000000|896, // match move
0x80000000|370, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 928
171,MIN_REDUCTION+139, // $NT
  }
,
{ // state 929
MIN_REDUCTION+346, // (default reduction)
  }
,
{ // state 930
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 931
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 932
2,558, // ws*
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 933
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 934
0x80000000|1, // match move
0x80000000|506, // no-match move
// T-test match for "/":
127,
  }
,
{ // state 935
120,430, // "&"
  }
,
{ // state 936
2,593, // ws*
157,534, // eol
158,204, // ws
160,634, // comment
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 937
106,563, // "i"
  }
,
{ // state 938
171,MIN_REDUCTION+176, // $NT
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 939
98,504, // "c"
  }
,
{ // state 940
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 941
0x80000000|1, // match move
0x80000000|268, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 942
95,917, // "s"
  }
,
{ // state 943
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 944
0x80000000|412, // match move
0x80000000|121, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 945
2,491, // ws*
157,534, // eol
158,204, // ws
160,634, // comment
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 946
171,MIN_REDUCTION+92, // $NT
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 947
171,MIN_REDUCTION+103, // $NT
  }
,
{ // state 948
171,MIN_REDUCTION+217, // $NT
  }
,
{ // state 949
-1, // $$start
-1, // start
543, // ws*
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+286, // $
-1, // $NT
  }
,
{ // state 950
0x80000000|1154, // match move
0x80000000|647, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 951
163,402, // {10}
  }
,
{ // state 952
171,MIN_REDUCTION+232, // $NT
  }
,
{ // state 953
171,MIN_REDUCTION+197, // $NT
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 954
100,1145, // "o"
  }
,
{ // state 955
0x80000000|415, // match move
0x80000000|166, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 956
-1, // $$start
-1, // start
348, // ws*
-1, // $$0
MIN_REDUCTION+129, // token
1137, // `boolean
24, // `class
869, // `extends
61, // `void
792, // `int
1121, // `while
525, // `if
999, // `else
232, // `for
505, // `break
440, // `this
1162, // `false
59, // `true
389, // `super
226, // `null
910, // `return
1097, // `instanceof
891, // `new
837, // `abstract
374, // `assert
776, // `byte
802, // `case
84, // `catch
690, // `char
29, // `const
716, // `continue
547, // `default
1109, // `do
1198, // `double
875, // `enum
1124, // `final
796, // `finally
614, // `float
392, // `goto
718, // `implements
198, // `import
1041, // `interface
688, // `long
419, // `native
145, // `package
1059, // `private
215, // `protected
651, // `public
924, // `short
368, // `static
364, // `strictfp
803, // `switch
444, // `synchronized
1090, // `throw
985, // `throws
320, // `transient
400, // `try
43, // `volatile
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
-1, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
885, // "a"
467, // "b"
995, // "s"
1002, // "t"
431, // "r"
721, // "c"
176, // "e"
MIN_REDUCTION+129, // "o"
100, // "l"
495, // "n"
MIN_REDUCTION+129, // "k"
MIN_REDUCTION+129, // "y"
MIN_REDUCTION+129, // "h"
501, // "i"
1040, // "u"
18, // "d"
32, // "f"
MIN_REDUCTION+129, // "m"
MIN_REDUCTION+129, // "x"
840, // "g"
269, // "p"
1006, // "v"
13, // "w"
MIN_REDUCTION+129, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
708, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+129, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+129, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+129, // $
MIN_REDUCTION+129, // $NT
  }
,
{ // state 957
171,MIN_REDUCTION+160, // $NT
  }
,
{ // state 958
0x80000000|190, // match move
0x80000000|83, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 959
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 960
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+113, // $
MIN_REDUCTION+113, // $NT
  }
,
{ // state 961
95,384, // "s"
  }
,
{ // state 962
0x80000000|706, // match move
0x80000000|390, // no-match move
0x80000000|545, // NT-test-match state for digit
  }
,
{ // state 963
171,MIN_REDUCTION+104, // $NT
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 964
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 965
98,405, // "c"
  }
,
{ // state 966
0x80000000|789, // match move
0x80000000|410, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 967
171,MIN_REDUCTION+119, // $NT
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 968
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 969
2,848, // ws*
157,534, // eol
158,204, // ws
160,634, // comment
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 970
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+134, // $
MIN_REDUCTION+134, // $NT
  }
,
{ // state 971
0x80000000|881, // match move
0x80000000|484, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 972
107,163, // "u"
  }
,
{ // state 973
0x80000000|211, // match move
0x80000000|732, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 974
171,MIN_REDUCTION+229, // $NT
  }
,
{ // state 975
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 976
97,954, // "r"
106,961, // "i"
  }
,
{ // state 977
0x80000000|656, // match move
0x80000000|1135, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 978
171,MIN_REDUCTION+143, // $NT
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 979
-1, // $$start
-1, // start
31, // ws*
-1, // $$0
MIN_REDUCTION+234, // token
1137, // `boolean
24, // `class
869, // `extends
61, // `void
792, // `int
1121, // `while
525, // `if
999, // `else
232, // `for
505, // `break
440, // `this
1162, // `false
59, // `true
389, // `super
226, // `null
910, // `return
1097, // `instanceof
891, // `new
837, // `abstract
374, // `assert
776, // `byte
802, // `case
84, // `catch
690, // `char
29, // `const
716, // `continue
547, // `default
1109, // `do
1198, // `double
875, // `enum
1124, // `final
796, // `finally
614, // `float
392, // `goto
718, // `implements
198, // `import
1041, // `interface
688, // `long
419, // `native
145, // `package
1059, // `private
215, // `protected
651, // `public
924, // `short
368, // `static
364, // `strictfp
803, // `switch
444, // `synchronized
1090, // `throw
985, // `throws
320, // `transient
400, // `try
43, // `volatile
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
-1, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
885, // "a"
467, // "b"
995, // "s"
1002, // "t"
431, // "r"
721, // "c"
176, // "e"
MIN_REDUCTION+234, // "o"
100, // "l"
495, // "n"
MIN_REDUCTION+234, // "k"
MIN_REDUCTION+234, // "y"
MIN_REDUCTION+234, // "h"
501, // "i"
MIN_REDUCTION+234, // "u"
18, // "d"
32, // "f"
MIN_REDUCTION+234, // "m"
MIN_REDUCTION+234, // "x"
840, // "g"
269, // "p"
1006, // "v"
13, // "w"
MIN_REDUCTION+234, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
708, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+234, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+234, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+234, // $
MIN_REDUCTION+234, // $NT
  }
,
{ // state 980
2,264, // ws*
153,595, // " "
154,595, // {9}
157,534, // eol
158,204, // ws
159,595, // {12}
163,1062, // {10}
164,1072, // {13}
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 981
0x80000000|596, // match move
0x80000000|897, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 982
171,MIN_REDUCTION+113, // $NT
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 983
2,866, // ws*
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 984
96,727, // "t"
  }
,
{ // state 985
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 986
0x80000000|1183, // match move
0x80000000|612, // no-match move
0x80000000|165, // NT-test-match state for multilineCommentPrintable
  }
,
{ // state 987
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+279, // $
-1, // $NT
  }
,
{ // state 988
89,279, // letter
92,276, // idChar
93,69, // "a"
94,69, // "b"
95,69, // "s"
96,69, // "t"
97,69, // "r"
98,69, // "c"
99,69, // "e"
100,69, // "o"
101,69, // "l"
102,69, // "n"
103,69, // "k"
104,69, // "y"
105,69, // "h"
106,69, // "i"
107,69, // "u"
108,69, // "d"
109,69, // "f"
110,69, // "m"
111,69, // "x"
112,69, // "g"
113,69, // "p"
114,69, // "v"
115,69, // "w"
116,69, // "z"
143,159, // "0"
145,621, // digit
146,879, // "_"
150,159, // {"1".."9"}
152,69, // {"A".."Z" "j" "q"}
  }
,
{ // state 989
113,425, // "p"
  }
,
{ // state 990
124,151, // "-"
  }
,
{ // state 991
93,271, // "a"
94,271, // "b"
95,271, // "s"
96,271, // "t"
97,271, // "r"
98,271, // "c"
99,271, // "e"
100,271, // "o"
101,271, // "l"
102,271, // "n"
103,271, // "k"
104,271, // "y"
105,271, // "h"
106,271, // "i"
107,271, // "u"
108,271, // "d"
109,271, // "f"
110,271, // "m"
111,271, // "x"
112,271, // "g"
113,271, // "p"
114,271, // "v"
115,271, // "w"
116,271, // "z"
117,271, // "!"
118,271, // "="
119,271, // "%"
120,271, // "&"
121,271, // "|"
122,271, // "+"
123,271, // ","
124,271, // "-"
125,271, // "."
126,678, // "*"
127,37, // "/"
128,271, // ";"
129,271, // "<"
130,271, // ">"
131,271, // "("
132,271, // ")"
133,271, // "["
134,271, // "]"
135,271, // "{"
136,271, // "}"
138,271, // "'"
140,271, // '"'
143,271, // "0"
146,271, // "_"
148,271, // "\"
150,271, // {"1".."9"}
151,271, // {"#".."$" ":" "?".."@" "^" "`" "~"}
152,271, // {"A".."Z" "j" "q"}
153,271, // " "
154,271, // {9}
156,865, // multilineCommentPrintable
157,750, // eol
163,1116, // {10}
164,140, // {13}
  }
,
{ // state 992
0x80000000|1140, // match move
0x80000000|894, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 993
0x80000000|288, // match move
0x80000000|363, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 994
171,MIN_REDUCTION+158, // $NT
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 995
96,1141, // "t"
104,171, // "y"
105,20, // "h"
107,989, // "u"
115,609, // "w"
  }
,
{ // state 996
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 997
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 998
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 999
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 1000
0x80000000|883, // match move
0x80000000|12, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 1001
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 1002
97,877, // "r"
105,976, // "h"
  }
,
{ // state 1003
98,5, // "c"
  }
,
{ // state 1004
0x80000000|1061, // match move
0x80000000|229, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 1005
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 1006
100,816, // "o"
  }
,
{ // state 1007
0x80000000|1, // match move
0x80000000|670, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 1008
0x80000000|387, // match move
0x80000000|788, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 1009
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 1010
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 1011
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 1012
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+188, // $
MIN_REDUCTION+188, // $NT
  }
,
{ // state 1013
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 1014
MIN_REDUCTION+326, // (default reduction)
  }
,
{ // state 1015
0x80000000|1160, // match move
0x80000000|950, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 1016
0x80000000|301, // match move
0x80000000|1209, // no-match move
0x80000000|165, // NT-test-match state for multilineCommentPrintable
  }
,
{ // state 1017
0x80000000|474, // match move
0x80000000|44, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 1018
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 1019
4,564, // token
5,1137, // `boolean
6,24, // `class
7,869, // `extends
8,61, // `void
9,792, // `int
10,1121, // `while
11,525, // `if
12,999, // `else
13,232, // `for
14,505, // `break
15,440, // `this
16,1162, // `false
17,59, // `true
18,389, // `super
19,226, // `null
20,910, // `return
21,1097, // `instanceof
22,891, // `new
23,837, // `abstract
24,374, // `assert
25,776, // `byte
26,802, // `case
27,84, // `catch
28,690, // `char
29,29, // `const
30,716, // `continue
31,547, // `default
32,1109, // `do
33,1198, // `double
34,875, // `enum
35,1124, // `final
36,796, // `finally
37,614, // `float
38,392, // `goto
39,718, // `implements
40,198, // `import
41,1041, // `interface
42,688, // `long
43,419, // `native
44,145, // `package
45,1059, // `private
46,215, // `protected
47,651, // `public
48,924, // `short
49,368, // `static
50,364, // `strictfp
51,803, // `switch
52,444, // `synchronized
53,1090, // `throw
54,985, // `throws
55,320, // `transient
56,400, // `try
57,43, // `volatile
  }
,
{ // state 1020
2,668, // ws*
91,352, // $$1
157,534, // eol
158,204, // ws
160,634, // comment
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 1021
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 1022
98,884, // "c"
  }
,
{ // state 1023
171,MIN_REDUCTION+112, // $NT
  }
,
{ // state 1024
0x80000000|542, // match move
0x80000000|1207, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 1025
0x80000000|199, // match move
0x80000000|686, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 1026
0x80000000|1, // match move
0x80000000|302, // no-match move
// T-test match for "/":
127,
  }
,
{ // state 1027
171,MIN_REDUCTION+239, // $NT
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 1028
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+277, // $
-1, // $NT
  }
,
{ // state 1029
0x80000000|1, // match move
0x80000000|1148, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 1030
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 1031
89,743, // letter
93,745, // "a"
94,745, // "b"
95,745, // "s"
96,745, // "t"
97,745, // "r"
98,745, // "c"
99,745, // "e"
100,745, // "o"
101,745, // "l"
102,745, // "n"
103,745, // "k"
104,745, // "y"
105,745, // "h"
106,745, // "i"
107,745, // "u"
108,745, // "d"
109,745, // "f"
110,745, // "m"
111,745, // "x"
112,745, // "g"
113,745, // "p"
114,745, // "v"
115,745, // "w"
116,745, // "z"
143,344, // "0"
145,25, // digit
146,1119, // "_"
150,344, // {"1".."9"}
152,745, // {"A".."Z" "j" "q"}
  }
,
{ // state 1032
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 1033
93,669, // "a"
  }
,
{ // state 1034
-1, // $$start
-1, // start
418, // ws*
-1, // $$0
MIN_REDUCTION+243, // token
1137, // `boolean
24, // `class
869, // `extends
61, // `void
792, // `int
1121, // `while
525, // `if
999, // `else
232, // `for
505, // `break
440, // `this
1162, // `false
59, // `true
389, // `super
226, // `null
910, // `return
1097, // `instanceof
891, // `new
837, // `abstract
374, // `assert
776, // `byte
802, // `case
84, // `catch
690, // `char
29, // `const
716, // `continue
547, // `default
1109, // `do
1198, // `double
875, // `enum
1124, // `final
796, // `finally
614, // `float
392, // `goto
718, // `implements
198, // `import
1041, // `interface
688, // `long
419, // `native
145, // `package
1059, // `private
215, // `protected
651, // `public
924, // `short
368, // `static
364, // `strictfp
803, // `switch
444, // `synchronized
1090, // `throw
985, // `throws
320, // `transient
400, // `try
43, // `volatile
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
-1, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
885, // "a"
467, // "b"
995, // "s"
1002, // "t"
431, // "r"
721, // "c"
176, // "e"
MIN_REDUCTION+243, // "o"
100, // "l"
495, // "n"
MIN_REDUCTION+243, // "k"
MIN_REDUCTION+243, // "y"
MIN_REDUCTION+243, // "h"
501, // "i"
MIN_REDUCTION+243, // "u"
18, // "d"
32, // "f"
MIN_REDUCTION+243, // "m"
MIN_REDUCTION+243, // "x"
840, // "g"
269, // "p"
1006, // "v"
13, // "w"
MIN_REDUCTION+243, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
708, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+243, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+243, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+243, // $
MIN_REDUCTION+243, // $NT
  }
,
{ // state 1035
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 1036
0x80000000|1, // match move
0x80000000|193, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 1037
0x80000000|978, // match move
0x80000000|391, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 1038
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+259, // $
-1, // $NT
  }
,
{ // state 1039
0x80000000|1107, // match move
0x80000000|331, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 1040
94,1167, // "b"
  }
,
{ // state 1041
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 1042
0x80000000|1, // match move
0x80000000|979, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 1043
95,1179, // "s"
  }
,
{ // state 1044
0x80000000|490, // match move
0x80000000|1012, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 1045
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 1046
0x80000000|6, // match move
0x80000000|1000, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 1047
0x80000000|742, // match move
0x80000000|1053, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 1048
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+98, // $
MIN_REDUCTION+98, // $NT
  }
,
{ // state 1049
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+167, // $
MIN_REDUCTION+167, // $NT
  }
,
{ // state 1050
114,907, // "v"
  }
,
{ // state 1051
0x80000000|52, // match move
0x80000000|767, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 1052
2,790, // ws*
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 1053
0x80000000|134, // match move
0x80000000|243, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 1054
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 1055
MIN_REDUCTION+358, // (default reduction)
  }
,
{ // state 1056
171,MIN_REDUCTION+250, // $NT
  }
,
{ // state 1057
2,664, // ws*
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 1058
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 1059
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 1060
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 1061
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 1062
171,MIN_REDUCTION+342, // $NT
MIN_REDUCTION+342, // (default reduction)
  }
,
{ // state 1063
0x80000000|1086, // match move
0x80000000|899, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 1064
99,493, // "e"
  }
,
{ // state 1065
171,MIN_REDUCTION+151, // $NT
  }
,
{ // state 1066
0x80000000|1, // match move
0x80000000|566, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 1067
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 1068
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 1069
0x80000000|518, // match move
0x80000000|339, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 1070
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+297, // $
-1, // $NT
  }
,
{ // state 1071
0x80000000|932, // match move
0x80000000|913, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 1072
0x80000000|951, // match move
0x80000000|846, // no-match move
// T-test match for 10:
163,
  }
,
{ // state 1073
99,2, // "e"
  }
,
{ // state 1074
1,763, // start
2,683, // ws*
3,940, // $$0
4,694, // token
58,432, // `!
59,309, // `!=
60,1115, // `%
61,565, // `&&
62,786, // `*
63,450, // `(
64,760, // `)
65,396, // `{
66,1013, // `}
67,155, // `-
68,88, // `+
69,379, // `=
70,849, // `==
71,1001, // `[
72,438, // `]
73,515, // `||
74,997, // `<
75,931, // `<=
76,579, // `,
77,933, // `>
78,446, // `>=
79,1010, // `.
80,1076, // `;
81,510, // `++
82,552, // `--
83,258, // `/
84,213, // ID
85,625, // INTLIT
86,658, // STRINGLIT
87,1067, // CHARLIT
89,307, // letter
137,503, // intLit2
143,708, // "0"
157,534, // eol
158,204, // ws
160,634, // comment
168,1159, // token*
  }
,
{ // state 1075
102,972, // "n"
  }
,
{ // state 1076
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 1077
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 1078
96,16, // "t"
  }
,
{ // state 1079
99,1194, // "e"
  }
,
{ // state 1080
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 1081
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 1082
0x80000000|1019, // match move
0x80000000|713, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 1083
0x80000000|310, // match move
0x80000000|977, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 1084
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 1085
0x80000000|1021, // match move
0x80000000|674, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 1086
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 1087
97,1200, // "r"
  }
,
{ // state 1088
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 1089
-1, // $$start
-1, // start
247, // ws*
-1, // $$0
MIN_REDUCTION+210, // token
1137, // `boolean
24, // `class
869, // `extends
61, // `void
792, // `int
1121, // `while
525, // `if
999, // `else
232, // `for
505, // `break
440, // `this
1162, // `false
59, // `true
389, // `super
226, // `null
910, // `return
1097, // `instanceof
891, // `new
837, // `abstract
374, // `assert
776, // `byte
802, // `case
84, // `catch
690, // `char
29, // `const
716, // `continue
547, // `default
1109, // `do
1198, // `double
875, // `enum
1124, // `final
796, // `finally
614, // `float
392, // `goto
718, // `implements
198, // `import
1041, // `interface
688, // `long
419, // `native
145, // `package
1059, // `private
215, // `protected
651, // `public
924, // `short
368, // `static
364, // `strictfp
803, // `switch
444, // `synchronized
1090, // `throw
985, // `throws
320, // `transient
400, // `try
43, // `volatile
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
-1, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
885, // "a"
467, // "b"
995, // "s"
1002, // "t"
431, // "r"
721, // "c"
176, // "e"
MIN_REDUCTION+210, // "o"
100, // "l"
495, // "n"
MIN_REDUCTION+210, // "k"
MIN_REDUCTION+210, // "y"
MIN_REDUCTION+210, // "h"
501, // "i"
MIN_REDUCTION+210, // "u"
18, // "d"
32, // "f"
MIN_REDUCTION+210, // "m"
MIN_REDUCTION+210, // "x"
840, // "g"
269, // "p"
1006, // "v"
13, // "w"
MIN_REDUCTION+210, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
708, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+210, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+210, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+210, // $
MIN_REDUCTION+210, // $NT
  }
,
{ // state 1090
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 1091
0x80000000|230, // match move
0x80000000|266, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 1092
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+242, // $
MIN_REDUCTION+242, // $NT
  }
,
{ // state 1093
107,520, // "u"
  }
,
{ // state 1094
127,189, // "/"
  }
,
{ // state 1095
-1, // $$start
-1, // start
927, // ws*
-1, // $$0
MIN_REDUCTION+147, // token
1137, // `boolean
24, // `class
869, // `extends
61, // `void
792, // `int
1121, // `while
525, // `if
999, // `else
232, // `for
505, // `break
440, // `this
1162, // `false
59, // `true
389, // `super
226, // `null
910, // `return
1097, // `instanceof
891, // `new
837, // `abstract
374, // `assert
776, // `byte
802, // `case
84, // `catch
690, // `char
29, // `const
716, // `continue
547, // `default
1109, // `do
1198, // `double
875, // `enum
1124, // `final
796, // `finally
614, // `float
392, // `goto
718, // `implements
198, // `import
1041, // `interface
688, // `long
419, // `native
145, // `package
1059, // `private
215, // `protected
651, // `public
924, // `short
368, // `static
364, // `strictfp
803, // `switch
444, // `synchronized
1090, // `throw
985, // `throws
320, // `transient
400, // `try
43, // `volatile
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
-1, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
885, // "a"
467, // "b"
995, // "s"
1002, // "t"
431, // "r"
721, // "c"
176, // "e"
MIN_REDUCTION+147, // "o"
901, // "l"
495, // "n"
MIN_REDUCTION+147, // "k"
MIN_REDUCTION+147, // "y"
MIN_REDUCTION+147, // "h"
501, // "i"
MIN_REDUCTION+147, // "u"
18, // "d"
32, // "f"
MIN_REDUCTION+147, // "m"
MIN_REDUCTION+147, // "x"
840, // "g"
269, // "p"
1006, // "v"
13, // "w"
MIN_REDUCTION+147, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
708, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+147, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+147, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+147, // $
MIN_REDUCTION+147, // $NT
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
{ // state 1096
0x80000000|968, // match move
0x80000000|635, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 1097
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 1098
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 1099
118,108, // "="
  }
,
{ // state 1100
2,80, // ws*
MIN_REDUCTION+366, // (default reduction)
  }
,
{ // state 1101
95,769, // "s"
  }
,
{ // state 1102
0x80000000|539, // match move
0x80000000|1108, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 1103
99,702, // "e"
  }
,
{ // state 1104
2,848, // ws*
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 1105
171,MIN_REDUCTION+208, // $NT
  }
,
{ // state 1106
127,138, // "/"
  }
,
{ // state 1107
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 1108
-1, // $$start
-1, // start
-1, // ws*
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+364, // $
-1, // $NT
  }
,
{ // state 1109
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 1110
0x80000000|85, // match move
0x80000000|784, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 1111
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+110, // $
MIN_REDUCTION+110, // $NT
  }
,
{ // state 1112
0x80000000|988, // match move
0x80000000|167, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 1113
0x80000000|455, // match move
0x80000000|1071, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 1114
0x80000000|1, // match move
0x80000000|986, // no-match move
// T-test match for "/":
127,
  }
,
{ // state 1115
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 1116
0x80000000|511, // match move
0x80000000|349, // no-match move
0x80000000|165, // NT-test-match state for multilineCommentPrintable
  }
,
{ // state 1117
-1, // $$start
-1, // start
305, // ws*
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+264, // $
-1, // $NT
  }
,
{ // state 1118
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+275, // $
-1, // $NT
  }
,
{ // state 1119
171,MIN_REDUCTION+313, // $NT
  }
,
{ // state 1120
171,MIN_REDUCTION+133, // $NT
  }
,
{ // state 1121
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 1122
2,253, // ws*
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 1123
0x80000000|112, // match move
0x80000000|434, // no-match move
0x80000000|165, // NT-test-match state for multilineCommentPrintable
  }
,
{ // state 1124
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 1125
102,903, // "n"
  }
,
{ // state 1126
99,1033, // "e"
  }
,
{ // state 1127
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+269, // $
-1, // $NT
  }
,
{ // state 1128
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+116, // $
MIN_REDUCTION+116, // $NT
  }
,
{ // state 1129
0x80000000|964, // match move
0x80000000|224, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 1130
0x80000000|1, // match move
0x80000000|719, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 1131
-1, // $$start
-1, // start
1136, // ws*
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+306, // $
-1, // $NT
  }
,
{ // state 1132
100,637, // "o"
  }
,
{ // state 1133
0x80000000|1027, // match move
0x80000000|859, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 1134
MIN_REDUCTION+316, // (default reduction)
  }
,
{ // state 1135
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+125, // $
MIN_REDUCTION+125, // $NT
  }
,
{ // state 1136
0x80000000|66, // match move
0x80000000|244, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 1137
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 1138
2,170, // ws*
157,534, // eol
158,204, // ws
160,634, // comment
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 1139
0x80000000|453, // match move
0x80000000|92, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 1140
2,170, // ws*
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 1141
93,87, // "a"
97,937, // "r"
  }
,
{ // state 1142
100,385, // "o"
  }
,
{ // state 1143
93,45, // "a"
94,45, // "b"
95,45, // "s"
96,45, // "t"
97,45, // "r"
98,45, // "c"
99,45, // "e"
100,45, // "o"
101,45, // "l"
102,45, // "n"
103,45, // "k"
104,45, // "y"
105,45, // "h"
106,45, // "i"
107,45, // "u"
108,45, // "d"
109,45, // "f"
110,45, // "m"
111,45, // "x"
112,45, // "g"
113,45, // "p"
114,45, // "v"
115,45, // "w"
116,45, // "z"
117,45, // "!"
118,45, // "="
119,45, // "%"
120,45, // "&"
121,45, // "|"
122,45, // "+"
123,45, // ","
124,45, // "-"
125,45, // "."
126,45, // "*"
127,45, // "/"
128,45, // ";"
129,45, // "<"
130,45, // ">"
131,45, // "("
132,45, // ")"
133,45, // "["
134,45, // "]"
135,45, // "{"
136,45, // "}"
138,45, // "'"
140,45, // '"'
143,45, // "0"
146,45, // "_"
148,45, // "\"
150,45, // {"1".."9"}
151,45, // {"#".."$" ":" "?".."@" "^" "`" "~"}
152,45, // {"A".."Z" "j" "q"}
153,45, // " "
154,45, // {9}
  }
,
{ // state 1144
0x80000000|1030, // match move
0x80000000|808, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 1145
115,369, // "w"
  }
,
{ // state 1146
171,MIN_REDUCTION+136, // $NT
  }
,
{ // state 1147
171,MIN_REDUCTION+182, // $NT
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 1148
-1, // $$start
-1, // start
524, // ws*
-1, // $$0
MIN_REDUCTION+156, // token
1137, // `boolean
24, // `class
869, // `extends
61, // `void
792, // `int
1121, // `while
525, // `if
999, // `else
232, // `for
505, // `break
440, // `this
1162, // `false
59, // `true
389, // `super
226, // `null
910, // `return
1097, // `instanceof
891, // `new
837, // `abstract
374, // `assert
776, // `byte
802, // `case
84, // `catch
690, // `char
29, // `const
716, // `continue
547, // `default
1109, // `do
1198, // `double
875, // `enum
1124, // `final
796, // `finally
614, // `float
392, // `goto
718, // `implements
198, // `import
1041, // `interface
688, // `long
419, // `native
145, // `package
1059, // `private
215, // `protected
651, // `public
924, // `short
368, // `static
364, // `strictfp
803, // `switch
444, // `synchronized
1090, // `throw
985, // `throws
320, // `transient
400, // `try
43, // `volatile
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
-1, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
885, // "a"
467, // "b"
995, // "s"
1002, // "t"
431, // "r"
721, // "c"
176, // "e"
MIN_REDUCTION+156, // "o"
100, // "l"
495, // "n"
MIN_REDUCTION+156, // "k"
MIN_REDUCTION+156, // "y"
MIN_REDUCTION+156, // "h"
501, // "i"
MIN_REDUCTION+156, // "u"
18, // "d"
32, // "f"
MIN_REDUCTION+156, // "m"
MIN_REDUCTION+156, // "x"
840, // "g"
269, // "p"
1006, // "v"
13, // "w"
MIN_REDUCTION+156, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
708, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+156, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+156, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+156, // $
MIN_REDUCTION+156, // $NT
  }
,
{ // state 1149
MIN_REDUCTION+326, // (default reduction)
  }
,
{ // state 1150
-1, // $$start
-1, // start
113, // ws*
-1, // $$0
MIN_REDUCTION+111, // token
1137, // `boolean
24, // `class
869, // `extends
61, // `void
792, // `int
1121, // `while
525, // `if
999, // `else
232, // `for
505, // `break
440, // `this
1162, // `false
59, // `true
389, // `super
226, // `null
910, // `return
1097, // `instanceof
891, // `new
837, // `abstract
374, // `assert
776, // `byte
802, // `case
84, // `catch
690, // `char
29, // `const
716, // `continue
547, // `default
1109, // `do
1198, // `double
875, // `enum
1124, // `final
796, // `finally
614, // `float
392, // `goto
718, // `implements
198, // `import
1041, // `interface
688, // `long
419, // `native
145, // `package
1059, // `private
215, // `protected
651, // `public
924, // `short
368, // `static
364, // `strictfp
803, // `switch
444, // `synchronized
1090, // `throw
985, // `throws
320, // `transient
400, // `try
43, // `volatile
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
-1, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
885, // "a"
467, // "b"
995, // "s"
1002, // "t"
431, // "r"
721, // "c"
176, // "e"
MIN_REDUCTION+111, // "o"
100, // "l"
495, // "n"
MIN_REDUCTION+111, // "k"
MIN_REDUCTION+111, // "y"
MIN_REDUCTION+111, // "h"
501, // "i"
MIN_REDUCTION+111, // "u"
18, // "d"
32, // "f"
MIN_REDUCTION+111, // "m"
MIN_REDUCTION+111, // "x"
840, // "g"
269, // "p"
1006, // "v"
13, // "w"
MIN_REDUCTION+111, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
708, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+111, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+111, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+111, // $
MIN_REDUCTION+111, // $NT
  }
,
{ // state 1151
-1, // $$start
-1, // start
559, // ws*
-1, // $$0
MIN_REDUCTION+105, // token
1137, // `boolean
24, // `class
869, // `extends
61, // `void
792, // `int
1121, // `while
525, // `if
999, // `else
232, // `for
505, // `break
440, // `this
1162, // `false
59, // `true
389, // `super
226, // `null
910, // `return
1097, // `instanceof
891, // `new
837, // `abstract
374, // `assert
776, // `byte
802, // `case
84, // `catch
690, // `char
29, // `const
716, // `continue
547, // `default
1109, // `do
1198, // `double
875, // `enum
1124, // `final
796, // `finally
614, // `float
392, // `goto
718, // `implements
198, // `import
1041, // `interface
688, // `long
419, // `native
145, // `package
1059, // `private
215, // `protected
651, // `public
924, // `short
368, // `static
364, // `strictfp
803, // `switch
444, // `synchronized
1090, // `throw
985, // `throws
320, // `transient
400, // `try
43, // `volatile
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
-1, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
885, // "a"
467, // "b"
995, // "s"
1002, // "t"
431, // "r"
721, // "c"
176, // "e"
MIN_REDUCTION+105, // "o"
100, // "l"
495, // "n"
MIN_REDUCTION+105, // "k"
MIN_REDUCTION+105, // "y"
MIN_REDUCTION+105, // "h"
501, // "i"
MIN_REDUCTION+105, // "u"
18, // "d"
32, // "f"
MIN_REDUCTION+105, // "m"
MIN_REDUCTION+105, // "x"
840, // "g"
269, // "p"
1006, // "v"
13, // "w"
MIN_REDUCTION+105, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
708, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+105, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+105, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+105, // $
MIN_REDUCTION+105, // $NT
  }
,
{ // state 1152
2,289, // ws*
157,534, // eol
158,204, // ws
160,634, // comment
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 1153
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+107, // $
MIN_REDUCTION+107, // $NT
  }
,
{ // state 1154
171,MIN_REDUCTION+218, // $NT
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 1155
-1, // $$start
-1, // start
645, // ws*
-1, // $$0
MIN_REDUCTION+195, // token
1137, // `boolean
24, // `class
869, // `extends
61, // `void
792, // `int
1121, // `while
525, // `if
999, // `else
232, // `for
505, // `break
440, // `this
1162, // `false
59, // `true
389, // `super
226, // `null
910, // `return
1097, // `instanceof
891, // `new
837, // `abstract
374, // `assert
776, // `byte
802, // `case
84, // `catch
690, // `char
29, // `const
716, // `continue
547, // `default
1109, // `do
1198, // `double
875, // `enum
1124, // `final
796, // `finally
614, // `float
392, // `goto
718, // `implements
198, // `import
1041, // `interface
688, // `long
419, // `native
145, // `package
1059, // `private
215, // `protected
651, // `public
924, // `short
368, // `static
364, // `strictfp
803, // `switch
444, // `synchronized
1090, // `throw
985, // `throws
320, // `transient
400, // `try
43, // `volatile
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
-1, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
885, // "a"
467, // "b"
995, // "s"
1002, // "t"
431, // "r"
721, // "c"
176, // "e"
MIN_REDUCTION+195, // "o"
100, // "l"
495, // "n"
MIN_REDUCTION+195, // "k"
MIN_REDUCTION+195, // "y"
MIN_REDUCTION+195, // "h"
501, // "i"
MIN_REDUCTION+195, // "u"
18, // "d"
32, // "f"
MIN_REDUCTION+195, // "m"
MIN_REDUCTION+195, // "x"
840, // "g"
269, // "p"
1006, // "v"
13, // "w"
MIN_REDUCTION+195, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
708, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+195, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+195, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+195, // $
MIN_REDUCTION+195, // $NT
  }
,
{ // state 1156
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 1157
-1, // $$start
-1, // start
1144, // ws*
-1, // $$0
MIN_REDUCTION+246, // token
1137, // `boolean
24, // `class
869, // `extends
61, // `void
792, // `int
1121, // `while
525, // `if
999, // `else
232, // `for
505, // `break
440, // `this
1162, // `false
59, // `true
389, // `super
226, // `null
910, // `return
1097, // `instanceof
891, // `new
837, // `abstract
374, // `assert
776, // `byte
802, // `case
84, // `catch
690, // `char
29, // `const
716, // `continue
547, // `default
1109, // `do
1198, // `double
875, // `enum
1124, // `final
796, // `finally
614, // `float
392, // `goto
718, // `implements
198, // `import
1041, // `interface
688, // `long
419, // `native
145, // `package
1059, // `private
215, // `protected
651, // `public
924, // `short
368, // `static
364, // `strictfp
803, // `switch
444, // `synchronized
1090, // `throw
985, // `throws
320, // `transient
400, // `try
43, // `volatile
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
-1, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
885, // "a"
467, // "b"
995, // "s"
1002, // "t"
431, // "r"
721, // "c"
176, // "e"
MIN_REDUCTION+246, // "o"
100, // "l"
495, // "n"
MIN_REDUCTION+246, // "k"
MIN_REDUCTION+246, // "y"
MIN_REDUCTION+246, // "h"
501, // "i"
MIN_REDUCTION+246, // "u"
18, // "d"
32, // "f"
MIN_REDUCTION+246, // "m"
MIN_REDUCTION+246, // "x"
840, // "g"
269, // "p"
1006, // "v"
13, // "w"
MIN_REDUCTION+246, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
708, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+246, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+246, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+246, // $
MIN_REDUCTION+246, // $NT
  }
,
{ // state 1158
0x80000000|1, // match move
0x80000000|1205, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 1159
0x80000000|1082, // match move
0x80000000|1091, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 1160
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 1161
0x80000000|969, // match move
0x80000000|810, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 1162
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 1163
107,326, // "u"
  }
,
{ // state 1164
MIN_REDUCTION+356, // (default reduction)
  }
,
{ // state 1165
2,543, // ws*
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 1166
0x80000000|141, // match move
0x80000000|735, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 1167
101,375, // "l"
  }
,
{ // state 1168
0x80000000|365, // match move
0x80000000|1048, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 1169
171,MIN_REDUCTION+214, // $NT
  }
,
{ // state 1170
-1, // $$start
-1, // start
79, // ws*
-1, // $$0
MIN_REDUCTION+249, // token
1137, // `boolean
24, // `class
869, // `extends
61, // `void
792, // `int
1121, // `while
525, // `if
999, // `else
232, // `for
505, // `break
440, // `this
1162, // `false
59, // `true
389, // `super
226, // `null
910, // `return
1097, // `instanceof
891, // `new
837, // `abstract
374, // `assert
776, // `byte
802, // `case
84, // `catch
690, // `char
29, // `const
716, // `continue
547, // `default
1109, // `do
1198, // `double
875, // `enum
1124, // `final
796, // `finally
614, // `float
392, // `goto
718, // `implements
198, // `import
1041, // `interface
688, // `long
419, // `native
145, // `package
1059, // `private
215, // `protected
651, // `public
924, // `short
368, // `static
364, // `strictfp
803, // `switch
444, // `synchronized
1090, // `throw
985, // `throws
320, // `transient
400, // `try
43, // `volatile
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
-1, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
885, // "a"
467, // "b"
995, // "s"
1002, // "t"
431, // "r"
721, // "c"
176, // "e"
MIN_REDUCTION+249, // "o"
100, // "l"
495, // "n"
MIN_REDUCTION+249, // "k"
MIN_REDUCTION+249, // "y"
MIN_REDUCTION+249, // "h"
501, // "i"
MIN_REDUCTION+249, // "u"
18, // "d"
32, // "f"
MIN_REDUCTION+249, // "m"
MIN_REDUCTION+249, // "x"
840, // "g"
269, // "p"
1006, // "v"
13, // "w"
MIN_REDUCTION+249, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
708, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+249, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+249, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+249, // $
MIN_REDUCTION+249, // $NT
  }
,
{ // state 1171
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+158, // $
MIN_REDUCTION+158, // $NT
  }
,
{ // state 1172
0x80000000|386, // match move
0x80000000|143, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 1173
-1, // $$start
-1, // start
253, // ws*
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+278, // $
-1, // $NT
  }
,
{ // state 1174
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+236, // $
MIN_REDUCTION+236, // $NT
  }
,
{ // state 1175
MIN_REDUCTION+360, // (default reduction)
  }
,
{ // state 1176
-1, // $$start
-1, // start
602, // ws*
-1, // $$0
MIN_REDUCTION+135, // token
1137, // `boolean
24, // `class
869, // `extends
61, // `void
792, // `int
1121, // `while
525, // `if
999, // `else
232, // `for
505, // `break
440, // `this
1162, // `false
59, // `true
389, // `super
226, // `null
910, // `return
1097, // `instanceof
891, // `new
837, // `abstract
374, // `assert
776, // `byte
802, // `case
84, // `catch
690, // `char
29, // `const
716, // `continue
547, // `default
1109, // `do
1198, // `double
875, // `enum
1124, // `final
796, // `finally
614, // `float
392, // `goto
718, // `implements
198, // `import
1041, // `interface
688, // `long
419, // `native
145, // `package
1059, // `private
215, // `protected
651, // `public
924, // `short
368, // `static
364, // `strictfp
803, // `switch
444, // `synchronized
1090, // `throw
985, // `throws
320, // `transient
400, // `try
43, // `volatile
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
-1, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
885, // "a"
467, // "b"
995, // "s"
1002, // "t"
431, // "r"
721, // "c"
176, // "e"
MIN_REDUCTION+135, // "o"
100, // "l"
495, // "n"
MIN_REDUCTION+135, // "k"
MIN_REDUCTION+135, // "y"
MIN_REDUCTION+135, // "h"
501, // "i"
MIN_REDUCTION+135, // "u"
18, // "d"
32, // "f"
MIN_REDUCTION+135, // "m"
MIN_REDUCTION+135, // "x"
840, // "g"
269, // "p"
1006, // "v"
13, // "w"
MIN_REDUCTION+135, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
708, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+135, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+135, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+135, // $
MIN_REDUCTION+135, // $NT
  }
,
{ // state 1177
MIN_REDUCTION+361, // (default reduction)
  }
,
{ // state 1178
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
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
213, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
307, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
69, // "a"
69, // "b"
69, // "s"
69, // "t"
69, // "r"
69, // "c"
69, // "e"
69, // "o"
69, // "l"
69, // "n"
69, // "k"
69, // "y"
69, // "h"
69, // "i"
69, // "u"
69, // "d"
69, // "f"
69, // "m"
69, // "x"
69, // "g"
69, // "p"
69, // "v"
69, // "w"
69, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
27, // "0"
403, // digit++
962, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
27, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
69, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
367, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
206, // digit+
MIN_REDUCTION+197, // $
MIN_REDUCTION+197, // $NT
  }
,
{ // state 1179
106,223, // "i"
  }
,
{ // state 1180
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 1181
171,MIN_REDUCTION+209, // $NT
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 1182
171,MIN_REDUCTION+172, // $NT
  }
,
{ // state 1183
MIN_REDUCTION+329, // (default reduction)
  }
,
{ // state 1184
89,279, // letter
90,765, // idChar**
92,216, // idChar
93,69, // "a"
94,69, // "b"
95,69, // "s"
96,69, // "t"
97,69, // "r"
98,69, // "c"
99,69, // "e"
100,69, // "o"
101,69, // "l"
102,69, // "n"
103,69, // "k"
104,69, // "y"
105,69, // "h"
106,69, // "i"
107,69, // "u"
108,69, // "d"
109,69, // "f"
110,69, // "m"
111,69, // "x"
112,69, // "g"
113,69, // "p"
114,69, // "v"
115,69, // "w"
116,69, // "z"
143,159, // "0"
145,621, // digit
146,879, // "_"
150,159, // {"1".."9"}
152,69, // {"A".."Z" "j" "q"}
165,1112, // idChar*
  }
,
{ // state 1185
93,1163, // "a"
  }
,
{ // state 1186
2,481, // ws*
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 1187
0x80000000|1, // match move
0x80000000|1170, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
{ // state 1188
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 1189
93,1125, // "a"
  }
,
{ // state 1190
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 1191
0x80000000|1005, // match move
0x80000000|900, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 1192
157,534, // eol
158,367, // ws
160,634, // comment
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 1193
0x80000000|1035, // match move
0x80000000|1070, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 1194
108,1130, // "d"
  }
,
{ // state 1195
100,328, // "o"
101,127, // "l"
  }
,
{ // state 1196
0x80000000|103, // match move
0x80000000|119, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 1197
MIN_REDUCTION+354, // (default reduction)
  }
,
{ // state 1198
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 1199
0x80000000|436, // match move
0x80000000|1008, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 1200
100,96, // "o"
  }
,
{ // state 1201
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 1202
0x80000000|82, // match move
0x80000000|78, // no-match move
// T-test match for "0":
143,
  }
,
{ // state 1203
0x80000000|1186, // match move
0x80000000|359, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 1204
0x80000000|443, // match move
0x80000000|175, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 1205
-1, // $$start
-1, // start
21, // ws*
-1, // $$0
MIN_REDUCTION+189, // token
1137, // `boolean
24, // `class
869, // `extends
61, // `void
792, // `int
1121, // `while
525, // `if
999, // `else
232, // `for
505, // `break
440, // `this
1162, // `false
59, // `true
389, // `super
226, // `null
910, // `return
1097, // `instanceof
891, // `new
837, // `abstract
374, // `assert
776, // `byte
802, // `case
84, // `catch
690, // `char
29, // `const
716, // `continue
547, // `default
1109, // `do
1198, // `double
875, // `enum
1124, // `final
796, // `finally
614, // `float
392, // `goto
718, // `implements
198, // `import
1041, // `interface
688, // `long
419, // `native
145, // `package
1059, // `private
215, // `protected
651, // `public
924, // `short
368, // `static
364, // `strictfp
803, // `switch
444, // `synchronized
1090, // `throw
985, // `throws
320, // `transient
400, // `try
43, // `volatile
432, // `!
309, // `!=
1115, // `%
565, // `&&
786, // `*
450, // `(
760, // `)
396, // `{
1013, // `}
155, // `-
88, // `+
379, // `=
849, // `==
1001, // `[
438, // `]
515, // `||
997, // `<
931, // `<=
579, // `,
933, // `>
446, // `>=
1010, // `.
1076, // `;
510, // `++
552, // `--
258, // `/
-1, // ID
625, // INTLIT
658, // STRINGLIT
1067, // CHARLIT
-1, // reserved
-1, // letter
-1, // idChar**
-1, // $$1
-1, // idChar
885, // "a"
467, // "b"
995, // "s"
1002, // "t"
431, // "r"
721, // "c"
176, // "e"
MIN_REDUCTION+189, // "o"
100, // "l"
495, // "n"
MIN_REDUCTION+189, // "k"
MIN_REDUCTION+189, // "y"
MIN_REDUCTION+189, // "h"
501, // "i"
MIN_REDUCTION+189, // "u"
18, // "d"
32, // "f"
MIN_REDUCTION+189, // "m"
MIN_REDUCTION+189, // "x"
840, // "g"
269, // "p"
1006, // "v"
13, // "w"
MIN_REDUCTION+189, // "z"
780, // "!"
420, // "="
740, // "%"
935, // "&"
222, // "|"
152, // "+"
1113, // ","
528, // "-"
585, // "."
934, // "*"
893, // "/"
712, // ";"
337, // "<"
773, // ">"
180, // "("
257, // ")"
476, // "["
1161, // "]"
1196, // "{"
1046, // "}"
503, // intLit2
555, // "'"
-1, // charPrintable
610, // '"'
-1, // stringPrintable*
-1, // $$2
708, // "0"
-1, // digit++
-1, // digit
-1, // "_"
-1, // escapeSequence
-1, // "\"
-1, // printable
MIN_REDUCTION+189, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
MIN_REDUCTION+189, // {"A".."Z" "j" "q"}
595, // " "
595, // {9}
-1, // stringPrintable
-1, // multilineCommentPrintable
534, // eol
204, // ws
595, // {12}
634, // comment
-1, // printable**
-1, // multilineCommentPrintable**
1062, // {10}
1072, // {13}
-1, // idChar*
-1, // multilineCommentPrintable*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+189, // $
MIN_REDUCTION+189, // $NT
  }
,
{ // state 1206
3,622, // $$0
4,694, // token
5,1137, // `boolean
6,24, // `class
7,869, // `extends
8,61, // `void
9,792, // `int
10,1121, // `while
11,525, // `if
12,999, // `else
13,232, // `for
14,505, // `break
15,440, // `this
16,1162, // `false
17,59, // `true
18,389, // `super
19,226, // `null
20,910, // `return
21,1097, // `instanceof
22,891, // `new
23,837, // `abstract
24,374, // `assert
25,776, // `byte
26,802, // `case
27,84, // `catch
28,690, // `char
29,29, // `const
30,716, // `continue
31,547, // `default
32,1109, // `do
33,1198, // `double
34,875, // `enum
35,1124, // `final
36,796, // `finally
37,614, // `float
38,392, // `goto
39,718, // `implements
40,198, // `import
41,1041, // `interface
42,688, // `long
43,419, // `native
44,145, // `package
45,1059, // `private
46,215, // `protected
47,651, // `public
48,924, // `short
49,368, // `static
50,364, // `strictfp
51,803, // `switch
52,444, // `synchronized
53,1090, // `throw
54,985, // `throws
55,320, // `transient
56,400, // `try
57,43, // `volatile
93,885, // "a"
94,467, // "b"
95,995, // "s"
96,1002, // "t"
97,431, // "r"
98,721, // "c"
99,176, // "e"
101,100, // "l"
102,495, // "n"
106,501, // "i"
108,18, // "d"
109,32, // "f"
112,840, // "g"
113,269, // "p"
114,1006, // "v"
115,13, // "w"
168,1159, // token*
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 1207
0x80000000|1018, // match move
0x80000000|41, // no-match move
0x80000000|487, // NT-test-match state for reserved
  }
,
{ // state 1208
MIN_REDUCTION+345, // (default reduction)
  }
,
{ // state 1209
MIN_REDUCTION+327, // (default reduction)
  }
,
{ // state 1210
0x80000000|1, // match move
0x80000000|74, // no-match move
0x80000000|1031, // NT-test-match state for idChar
  }
,
};
}
public TokenGrammarParseTable(TokenGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[1211][];
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
// multilineCommentPrintable ::= "/" "*" !"/"
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
// comment ::= "/" "*" multilineCommentPrintable** "/" "*" "/"
(160<<16)+6,
// comment ::= "/" "*" !multilineCommentPrintable "/" "*" "/"
(160<<16)+5,
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
"multilineCommentPrintable ::= # \"/\" !\"*\"", // 328
"multilineCommentPrintable ::= # \"/\" \"*\" !\"/\"", // 329
"multilineCommentPrintable ::= eol", // 330
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 331
"digit ::= {\"0\"..\"9\"}", // 332
"ws ::= {9 12 \" \"}", // 333
"ws ::= comment", // 334
"comment ::= \"/\" \"/\" printable** eol", // 335
"comment ::= \"/\" \"/\" printable** eol", // 336
"comment ::= \"/\" \"*\" multilineCommentPrintable** \"/\" \"*\" \"/\"", // 337
"comment ::= \"/\" \"*\" multilineCommentPrintable** \"/\" \"*\" \"/\"", // 338
"comment ::= \"/\" \"*\" multilineCommentPrintable** \"*\" \"/\"", // 339
"comment ::= \"/\" \"*\" multilineCommentPrintable** \"*\" \"/\"", // 340
"ws ::= eol", // 341
"eol ::= {10} registerNewline", // 342
"eol ::= {13} {10} registerNewline", // 343
"eol ::= {13} !10 registerNewline", // 344
"stringPrintable* ::= stringPrintable* stringPrintable", // 345
"stringPrintable* ::= stringPrintable* stringPrintable", // 346
"idChar** ::= idChar* !idChar", // 347
"ws* ::= ws* ws", // 348
"ws* ::= ws* ws", // 349
"multilineCommentPrintable** ::= multilineCommentPrintable* !multilineCommentPrintable", // 350
"printable** ::= printable* !printable", // 351
"token* ::= token* token", // 352
"token* ::= token* token", // 353
"digit++ ::= digit+ !digit", // 354
"digit+ ::= digit", // 355
"digit+ ::= digit+ digit", // 356
"printable* ::= printable* printable", // 357
"printable* ::= printable* printable", // 358
"multilineCommentPrintable* ::= multilineCommentPrintable* multilineCommentPrintable", // 359
"multilineCommentPrintable* ::= multilineCommentPrintable* multilineCommentPrintable", // 360
"idChar* ::= idChar* idChar", // 361
"idChar* ::= idChar* idChar", // 362
"", // 363
"", // 364
"", // 365
"", // 366
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
    { // 328: multilineCommentPrintable ::= [#] "/" !"*" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 329: multilineCommentPrintable ::= [#] "/" "*" !"/" @nestedCommentsWarning(int,char,char)=>
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
    { // 335: comment ::= "/" "/" printable** eol @foundComment(char,char)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((87<<5)|0x5)/*methodCall:87*/,
    },
    { // 336: comment ::= "/" "/" !printable [printable**] eol @foundComment(char,char)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((87<<5)|0x5)/*methodCall:87*/,
    },
    { // 337: comment ::= "/" "*" multilineCommentPrintable** "/" "*" "/" @foundmultiComment(char,char,char,char,char)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((88<<5)|0x5)/*methodCall:88*/,
    },
    { // 338: comment ::= "/" "*" !multilineCommentPrintable [multilineCommentPrintable**] "/" "*" "/" @foundmultiComment(char,char,char,char,char)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((88<<5)|0x5)/*methodCall:88*/,
    },
    { // 339: comment ::= "/" "*" multilineCommentPrintable** "*" "/" @foundOthermultiComment(char,char,char,char)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((89<<5)|0x5)/*methodCall:89*/,
    },
    { // 340: comment ::= "/" "*" !multilineCommentPrintable [multilineCommentPrintable**] "*" "/" @foundOthermultiComment(char,char,char,char)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((89<<5)|0x5)/*methodCall:89*/,
    },
    { // 341: ws ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 342: eol ::= {10} [registerNewline] @void
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 343: eol ::= {13} {10} [registerNewline] @void
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 344: eol ::= {13} !10 [registerNewline] @void
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 345: stringPrintable* ::= stringPrintable* stringPrintable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 346: stringPrintable* ::= [stringPrintable*] stringPrintable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 347: idChar** ::= idChar* !idChar @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 348: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 349: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
    },
    { // 350: multilineCommentPrintable** ::= multilineCommentPrintable* !multilineCommentPrintable @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 351: printable** ::= printable* !printable @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 352: token* ::= token* token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 353: token* ::= [token*] token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
    },
    { // 354: digit++ ::= digit+ !digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 355: digit+ ::= digit @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 356: digit+ ::= digit+ digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 357: printable* ::= printable* printable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 358: printable* ::= [printable*] printable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
    },
    { // 359: multilineCommentPrintable* ::= multilineCommentPrintable* multilineCommentPrintable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 360: multilineCommentPrintable* ::= [multilineCommentPrintable*] multilineCommentPrintable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
    },
    { // 361: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 362: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 363: $$0 ::= token* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 364: $$1 ::= ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 365: $$2 ::= '"' ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 366: $$2 ::= '"' [ws*] @pass
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
      ((90<<5)|0x5)/*methodCall:90*/,
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
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      actionObject.foundComment(parm0,parm1);
    }
    break;
    case 88: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      char parm2 = (Character)si.popPb();
      char parm3 = (Character)si.popPb();
      char parm4 = (Character)si.popPb();
      actionObject.foundmultiComment(parm0,parm1,parm2,parm3,parm4);
    }
    break;
    case 89: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      char parm2 = (Character)si.popPb();
      char parm3 = (Character)si.popPb();
      actionObject.foundOthermultiComment(parm0,parm1,parm2,parm3);
    }
    break;
    case 90: {
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
"void foundComment(char,char)",
"void foundmultiComment(char,char,char,char,char)",
"void foundOthermultiComment(char,char,char,char)",
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
2,0,
5,0,
4,0,
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
