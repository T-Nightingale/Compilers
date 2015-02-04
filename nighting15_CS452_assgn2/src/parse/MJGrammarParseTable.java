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
import
syntaxtree
.
*
;
public class MJGrammarParseTable implements wrangLR.runtime.ParseTable {
public int getEofSym() { return 99; }
public int getNttSym() { return 100; }
private String[] symNameTable = {
"$$start",
"<start>",
"ws*",
"<program>",
"<class decl>+",
"<class decl>",
"`class",
"ID",
"`{",
"<decl in class>*",
"`}",
"`extends",
"<decl in class>",
"<method decl>",
"<inst var decl>",
"`public",
"`void",
"<formal list>",
"<stmt>*",
"<type>",
"<return stmt>",
"`int",
"`boolean",
"<empty bracket pair>",
"`[",
"`]",
"<empty paren pair>",
"`(",
"`)",
"<list element>*",
"<list element>",
"`,",
"<stmt>",
"<assign>",
"`;",
"<local var decl>",
"`return",
"<exp>",
"`=",
"<exp5>",
"`+",
"<exp6>",
"`*",
"<exp7>",
"<cast exp>",
"<unary exp>",
"<exp8>",
"`-",
"INTLIT",
"letter",
"{\"A\"..\"Z\" \"a\" \"d\" \"f\"..\"h\" \"j\"..\"k\" \"m\"..\"n\" \"q\" \"s\" \"w\" \"y\"..\"z\"}",
"\"p\"",
"\"v\"",
"\"c\"",
"\"i\"",
"\"l\"",
"\"o\"",
"\"r\"",
"\"u\"",
"\"x\"",
"\"b\"",
"\"e\"",
"\"t\"",
"letter128",
"{199..218 231..250}",
"{193..198 225..230}",
"digit",
"{\"1\"..\"9\"}",
"\"0\"",
"digit128",
"{176..185}",
"ws",
"\" \"",
"10",
"\"#\"",
"\"*\"",
"\"(\"",
"\")\"",
"\"{\"",
"\"}\"",
"\"-\"",
"\"+\"",
"\"=\"",
"\"[\"",
"\"]\"",
"\",\"",
"\";\"",
"idChar*",
"$$0",
"digit*",
"$$1",
"hexDigit*",
"$$2",
"idChar",
"\"_\"",
"idChar128",
"223",
"hexDigit",
"hexDigit128",
"$",
"$NT",
};
public String symName(int n) {
 return n >= 0 && n < symNameTable.length ? symNameTable[n] : "??";
}
private MJGrammar actionObject;
public int[][] getParseTable() { return parseTable; }
public int numSymbols() { return 101;}
private static final int MIN_REDUCTION = 279;
public int minReduction() { return MIN_REDUCTION;}
private static final int MAX_ACCEPT_REDUCTION = MIN_REDUCTION+0;
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
1,192, // <start>
2,267, // ws*
3,259, // <program>
4,53, // <class decl>+
5,277, // <class decl>
6,15, // `class
71,3, // ws
72,157, // " "
73,81, // {10}
74,17, // "#"
  }
,
{ // state 1
0x80000000|228, // match move
0x80000000|127, // no-match move
0x80000000|159, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 2
  }
,
{ // state 3
100,MIN_REDUCTION+113, // $NT
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 4
7,208, // ID
49,117, // letter
50,171, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
51,171, // "p"
52,171, // "v"
53,171, // "c"
54,171, // "i"
55,171, // "l"
56,171, // "o"
57,171, // "r"
58,171, // "u"
59,171, // "x"
60,171, // "b"
61,171, // "e"
62,171, // "t"
63,52, // letter128
64,16, // {199..218 231..250}
65,16, // {193..198 225..230}
  }
,
{ // state 5
2,248, // ws*
71,3, // ws
72,157, // " "
73,81, // {10}
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 6
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 7
0x80000000|82, // match move
0x80000000|215, // no-match move
0x80000000|159, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 8
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 9
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 10
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 11
55,268, // "l"
  }
,
{ // state 12
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 13
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 14
8,214, // `{
78,227, // "{"
  }
,
{ // state 15
7,237, // ID
11,129, // `extends
49,117, // letter
50,171, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
51,171, // "p"
52,171, // "v"
53,171, // "c"
54,171, // "i"
55,171, // "l"
56,171, // "o"
57,171, // "r"
58,171, // "u"
59,171, // "x"
60,171, // "b"
61,171, // "e"
62,171, // "t"
63,52, // letter128
64,16, // {199..218 231..250}
65,16, // {193..198 225..230}
74,147, // "#"
  }
,
{ // state 16
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 17
53,11, // "c"
  }
,
{ // state 18
0x80000000|2, // match move
0x80000000|182, // no-match move
0x80000000|159, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 19
71,90, // ws
72,157, // " "
73,81, // {10}
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 20
34,176, // `;
86,5, // ";"
  }
,
{ // state 21
71,90, // ws
72,157, // " "
73,81, // {10}
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 22
71,90, // ws
72,157, // " "
73,81, // {10}
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 23
0x80000000|2, // match move
0x80000000|150, // no-match move
0x80000000|159, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 24
2,77, // ws*
24,MIN_REDUCTION+85, // `[
71,7, // ws
72,190, // " "
73,218, // {10}
83,MIN_REDUCTION+85, // "["
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 25
2,48, // ws*
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 26
71,90, // ws
72,157, // " "
73,81, // {10}
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 27
0x80000000|2, // match move
0x80000000|197, // no-match move
0x80000000|159, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 28
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 29
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 30
25,99, // `]
84,181, // "]"
  }
,
{ // state 31
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 32
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 33
100,MIN_REDUCTION+18, // $NT
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 34
7,78, // ID
23,13, // <empty bracket pair>
24,229, // `[
49,117, // letter
50,171, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
51,171, // "p"
52,171, // "v"
53,171, // "c"
54,171, // "i"
55,171, // "l"
56,171, // "o"
57,171, // "r"
58,171, // "u"
59,171, // "x"
60,171, // "b"
61,171, // "e"
62,171, // "t"
63,52, // letter128
64,16, // {199..218 231..250}
65,16, // {193..198 225..230}
83,140, // "["
  }
,
{ // state 35
2,255, // ws*
71,3, // ws
72,157, // " "
73,81, // {10}
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 36
24,MIN_REDUCTION+124, // `[
71,266, // ws
72,190, // " "
73,218, // {10}
83,MIN_REDUCTION+124, // "["
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 37
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 38
2,93, // ws*
71,3, // ws
72,157, // " "
73,81, // {10}
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 39
34,272, // `;
86,5, // ";"
  }
,
{ // state 40
7,18, // ID
27,273, // `(
41,264, // <exp6>
43,199, // <exp7>
44,64, // <cast exp>
45,61, // <unary exp>
46,27, // <exp8>
47,135, // `-
48,161, // INTLIT
49,57, // letter
50,171, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
51,171, // "p"
52,171, // "v"
53,171, // "c"
54,171, // "i"
55,171, // "l"
56,171, // "o"
57,171, // "r"
58,171, // "u"
59,171, // "x"
60,171, // "b"
61,171, // "e"
62,171, // "t"
63,54, // letter128
64,249, // {199..218 231..250}
65,249, // {193..198 225..230}
67,145, // {"1".."9"}
68,101, // "0"
69,217, // digit128
70,1, // {176..185}
76,265, // "("
80,35, // "-"
  }
,
{ // state 41
2,206, // ws*
71,3, // ws
72,157, // " "
73,81, // {10}
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 42
34,196, // `;
86,5, // ";"
  }
,
{ // state 43
0x80000000|2, // match move
0x80000000|134, // no-match move
0x80000000|159, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 44
7,204, // ID
23,13, // <empty bracket pair>
24,229, // `[
49,117, // letter
50,171, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
51,171, // "p"
52,171, // "v"
53,171, // "c"
54,171, // "i"
55,171, // "l"
56,171, // "o"
57,171, // "r"
58,171, // "u"
59,171, // "x"
60,171, // "b"
61,171, // "e"
62,171, // "t"
63,52, // letter128
64,16, // {199..218 231..250}
65,16, // {193..198 225..230}
83,140, // "["
  }
,
{ // state 45
71,90, // ws
72,157, // " "
73,81, // {10}
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 46
7,20, // ID
23,13, // <empty bracket pair>
24,229, // `[
49,117, // letter
50,171, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
51,171, // "p"
52,171, // "v"
53,171, // "c"
54,171, // "i"
55,171, // "l"
56,171, // "o"
57,171, // "r"
58,171, // "u"
59,171, // "x"
60,171, // "b"
61,171, // "e"
62,171, // "t"
63,52, // letter128
64,16, // {199..218 231..250}
65,16, // {193..198 225..230}
83,140, // "["
  }
,
{ // state 47
38,238, // `=
82,131, // "="
  }
,
{ // state 48
0x80000000|6, // match move
0x80000000|62, // no-match move
0x80000000|159, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 49
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 50
24,MIN_REDUCTION+107, // `[
83,MIN_REDUCTION+107, // "["
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 51
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 52
2,19, // ws*
71,3, // ws
72,157, // " "
73,81, // {10}
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 53
5,207, // <class decl>
6,15, // `class
74,17, // "#"
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 54
0x80000000|25, // match move
0x80000000|209, // no-match move
0x80000000|159, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 55
2,251, // ws*
24,MIN_REDUCTION+127, // `[
71,7, // ws
72,190, // " "
73,218, // {10}
83,MIN_REDUCTION+127, // "["
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 56
0x80000000|31, // match move
0x80000000|166, // no-match move
0x80000000|159, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 57
49,168, // letter
50,171, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
51,171, // "p"
52,171, // "v"
53,171, // "c"
54,171, // "i"
55,171, // "l"
56,171, // "o"
57,171, // "r"
58,171, // "u"
59,171, // "x"
60,171, // "b"
61,171, // "e"
62,171, // "t"
63,66, // letter128
64,249, // {199..218 231..250}
65,249, // {193..198 225..230}
66,32, // digit
67,59, // {"1".."9"}
68,59, // "0"
69,230, // digit128
70,1, // {176..185}
87,243, // idChar*
88,56, // $$0
93,105, // idChar
94,213, // "_"
95,132, // idChar128
96,173, // {223}
  }
,
{ // state 58
7,14, // ID
49,117, // letter
50,171, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
51,171, // "p"
52,171, // "v"
53,171, // "c"
54,171, // "i"
55,171, // "l"
56,171, // "o"
57,171, // "r"
58,171, // "u"
59,171, // "x"
60,171, // "b"
61,171, // "e"
62,171, // "t"
63,52, // letter128
64,16, // {199..218 231..250}
65,16, // {193..198 225..230}
  }
,
{ // state 59
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 60
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 61
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 62
24,MIN_REDUCTION+90, // `[
71,266, // ws
72,190, // " "
73,218, // {10}
83,MIN_REDUCTION+90, // "["
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 63
24,MIN_REDUCTION+47, // `[
83,MIN_REDUCTION+47, // "["
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 64
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 65
61,133, // "e"
  }
,
{ // state 66
0x80000000|112, // match move
0x80000000|212, // no-match move
0x80000000|159, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 67
56,170, // "o"
  }
,
{ // state 68
7,270, // ID
8,68, // `{
10,184, // `}
18,113, // <stmt>*
19,139, // <type>
21,79, // `int
22,234, // `boolean
27,273, // `(
32,144, // <stmt>
33,42, // <assign>
35,39, // <local var decl>
37,47, // <exp>
39,246, // <exp5>
41,185, // <exp6>
43,199, // <exp7>
44,64, // <cast exp>
45,61, // <unary exp>
46,27, // <exp8>
47,135, // `-
48,161, // INTLIT
49,57, // letter
50,171, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
51,171, // "p"
52,171, // "v"
53,171, // "c"
54,171, // "i"
55,171, // "l"
56,171, // "o"
57,171, // "r"
58,171, // "u"
59,171, // "x"
60,171, // "b"
61,171, // "e"
62,171, // "t"
63,54, // letter128
64,249, // {199..218 231..250}
65,249, // {193..198 225..230}
67,145, // {"1".."9"}
68,101, // "0"
69,217, // digit128
70,1, // {176..185}
74,116, // "#"
76,265, // "("
78,227, // "{"
79,232, // "}"
80,35, // "-"
  }
,
{ // state 69
10,136, // `}
79,232, // "}"
  }
,
{ // state 70
8,220, // `{
78,227, // "{"
  }
,
{ // state 71
71,90, // ws
72,157, // " "
73,81, // {10}
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 72
7,18, // ID
27,273, // `(
37,108, // <exp>
39,246, // <exp5>
41,185, // <exp6>
43,199, // <exp7>
44,64, // <cast exp>
45,61, // <unary exp>
46,27, // <exp8>
47,135, // `-
48,161, // INTLIT
49,57, // letter
50,171, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
51,171, // "p"
52,171, // "v"
53,171, // "c"
54,171, // "i"
55,171, // "l"
56,171, // "o"
57,171, // "r"
58,171, // "u"
59,171, // "x"
60,171, // "b"
61,171, // "e"
62,171, // "t"
63,54, // letter128
64,249, // {199..218 231..250}
65,249, // {193..198 225..230}
67,145, // {"1".."9"}
68,101, // "0"
69,217, // digit128
70,1, // {176..185}
76,265, // "("
80,35, // "-"
  }
,
{ // state 73
51,156, // "p"
54,271, // "i"
60,226, // "b"
  }
,
{ // state 74
24,MIN_REDUCTION+92, // `[
83,MIN_REDUCTION+92, // "["
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 75
24,MIN_REDUCTION+112, // `[
83,MIN_REDUCTION+112, // "["
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 76
7,270, // ID
8,68, // `{
10,97, // `}
18,169, // <stmt>*
19,139, // <type>
21,79, // `int
22,234, // `boolean
27,273, // `(
32,144, // <stmt>
33,42, // <assign>
35,39, // <local var decl>
37,47, // <exp>
39,246, // <exp5>
41,185, // <exp6>
43,199, // <exp7>
44,64, // <cast exp>
45,61, // <unary exp>
46,27, // <exp8>
47,135, // `-
48,161, // INTLIT
49,57, // letter
50,171, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
51,171, // "p"
52,171, // "v"
53,171, // "c"
54,171, // "i"
55,171, // "l"
56,171, // "o"
57,171, // "r"
58,171, // "u"
59,171, // "x"
60,171, // "b"
61,171, // "e"
62,171, // "t"
63,54, // letter128
64,249, // {199..218 231..250}
65,249, // {193..198 225..230}
67,145, // {"1".."9"}
68,101, // "0"
69,217, // digit128
70,1, // {176..185}
74,116, // "#"
76,265, // "("
78,227, // "{"
79,232, // "}"
80,35, // "-"
  }
,
{ // state 77
0x80000000|2, // match move
0x80000000|201, // no-match move
0x80000000|159, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 78
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 79
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 80
7,155, // ID
19,44, // <type>
21,79, // `int
22,234, // `boolean
28,179, // `)
49,117, // letter
50,171, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
51,171, // "p"
52,171, // "v"
53,171, // "c"
54,171, // "i"
55,171, // "l"
56,171, // "o"
57,171, // "r"
58,171, // "u"
59,171, // "x"
60,171, // "b"
61,171, // "e"
62,171, // "t"
63,52, // letter128
64,16, // {199..218 231..250}
65,16, // {193..198 225..230}
74,116, // "#"
77,269, // ")"
  }
,
{ // state 81
100,MIN_REDUCTION+51, // $NT
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 82
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 83
24,MIN_REDUCTION+105, // `[
83,MIN_REDUCTION+105, // "["
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 84
7,18, // ID
27,273, // `(
37,236, // <exp>
39,246, // <exp5>
41,185, // <exp6>
43,199, // <exp7>
44,64, // <cast exp>
45,61, // <unary exp>
46,27, // <exp8>
47,135, // `-
48,161, // INTLIT
49,57, // letter
50,171, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
51,171, // "p"
52,171, // "v"
53,171, // "c"
54,171, // "i"
55,171, // "l"
56,171, // "o"
57,171, // "r"
58,171, // "u"
59,171, // "x"
60,171, // "b"
61,171, // "e"
62,171, // "t"
63,54, // letter128
64,249, // {199..218 231..250}
65,249, // {193..198 225..230}
67,145, // {"1".."9"}
68,101, // "0"
69,217, // digit128
70,1, // {176..185}
76,265, // "("
80,35, // "-"
  }
,
{ // state 85
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 86
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 87
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 88
66,183, // digit
67,59, // {"1".."9"}
68,59, // "0"
69,247, // digit128
70,1, // {176..185}
90,239, // $$1
  }
,
{ // state 89
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 90
100,MIN_REDUCTION+112, // $NT
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 91
24,MIN_REDUCTION+50, // `[
83,MIN_REDUCTION+50, // "["
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 92
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 93
71,90, // ws
72,157, // " "
73,81, // {10}
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 94
54,271, // "i"
57,65, // "r"
60,226, // "b"
  }
,
{ // state 95
50,51, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
51,51, // "p"
52,51, // "v"
53,51, // "c"
54,51, // "i"
55,51, // "l"
56,51, // "o"
57,51, // "r"
58,51, // "u"
59,51, // "x"
60,51, // "b"
61,51, // "e"
62,51, // "t"
65,103, // {193..198 225..230}
67,51, // {"1".."9"}
68,51, // "0"
70,103, // {176..185}
92,43, // $$2
97,100, // hexDigit
98,200, // hexDigit128
  }
,
{ // state 96
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 97
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 98
24,115, // `[
83,140, // "["
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 99
0x80000000|2, // match move
0x80000000|175, // no-match move
0x80000000|159, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 100
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 101
50,51, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
51,51, // "p"
52,51, // "v"
53,51, // "c"
54,51, // "i"
55,51, // "l"
56,51, // "o"
57,51, // "r"
58,51, // "u"
59,51, // "x"
60,51, // "b"
61,51, // "e"
62,51, // "t"
65,103, // {193..198 225..230}
67,51, // {"1".."9"}
68,51, // "0"
70,103, // {176..185}
91,95, // hexDigit*
92,187, // $$2
97,124, // hexDigit
98,200, // hexDigit128
  }
,
{ // state 102
24,MIN_REDUCTION+94, // `[
83,MIN_REDUCTION+94, // "["
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 103
0x80000000|233, // match move
0x80000000|50, // no-match move
0x80000000|159, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 104
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 105
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 106
2,119, // ws*
24,MIN_REDUCTION+125, // `[
71,7, // ws
72,190, // " "
73,218, // {10}
83,MIN_REDUCTION+125, // "["
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 107
24,MIN_REDUCTION+99, // `[
83,MIN_REDUCTION+99, // "["
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 108
34,87, // `;
86,5, // ";"
  }
,
{ // state 109
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 110
52,67, // "v"
54,271, // "i"
60,226, // "b"
  }
,
{ // state 111
7,18, // ID
27,273, // `(
44,122, // <cast exp>
46,151, // <exp8>
48,161, // INTLIT
49,57, // letter
50,171, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
51,171, // "p"
52,171, // "v"
53,171, // "c"
54,171, // "i"
55,171, // "l"
56,171, // "o"
57,171, // "r"
58,171, // "u"
59,171, // "x"
60,171, // "b"
61,171, // "e"
62,171, // "t"
63,54, // letter128
64,249, // {199..218 231..250}
65,249, // {193..198 225..230}
67,145, // {"1".."9"}
68,101, // "0"
69,217, // digit128
70,1, // {176..185}
76,265, // "("
  }
,
{ // state 112
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 113
7,270, // ID
8,68, // `{
10,257, // `}
19,139, // <type>
21,79, // `int
22,234, // `boolean
27,273, // `(
32,137, // <stmt>
33,42, // <assign>
35,39, // <local var decl>
37,47, // <exp>
39,246, // <exp5>
41,185, // <exp6>
43,199, // <exp7>
44,64, // <cast exp>
45,61, // <unary exp>
46,27, // <exp8>
47,135, // `-
48,161, // INTLIT
49,57, // letter
50,171, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
51,171, // "p"
52,171, // "v"
53,171, // "c"
54,171, // "i"
55,171, // "l"
56,171, // "o"
57,171, // "r"
58,171, // "u"
59,171, // "x"
60,171, // "b"
61,171, // "e"
62,171, // "t"
63,54, // letter128
64,249, // {199..218 231..250}
65,249, // {193..198 225..230}
67,145, // {"1".."9"}
68,101, // "0"
69,217, // digit128
70,1, // {176..185}
74,116, // "#"
76,265, // "("
78,227, // "{"
79,232, // "}"
80,35, // "-"
  }
,
{ // state 114
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 115
7,18, // ID
27,273, // `(
37,30, // <exp>
39,246, // <exp5>
41,185, // <exp6>
43,199, // <exp7>
44,64, // <cast exp>
45,61, // <unary exp>
46,27, // <exp8>
47,135, // `-
48,161, // INTLIT
49,57, // letter
50,171, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
51,171, // "p"
52,171, // "v"
53,171, // "c"
54,171, // "i"
55,171, // "l"
56,171, // "o"
57,171, // "r"
58,171, // "u"
59,171, // "x"
60,171, // "b"
61,171, // "e"
62,171, // "t"
63,54, // letter128
64,249, // {199..218 231..250}
65,249, // {193..198 225..230}
67,145, // {"1".."9"}
68,101, // "0"
69,217, // digit128
70,1, // {176..185}
76,265, // "("
80,35, // "-"
  }
,
{ // state 116
54,271, // "i"
60,226, // "b"
  }
,
{ // state 117
49,168, // letter
50,171, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
51,171, // "p"
52,171, // "v"
53,171, // "c"
54,171, // "i"
55,171, // "l"
56,171, // "o"
57,171, // "r"
58,171, // "u"
59,171, // "x"
60,171, // "b"
61,171, // "e"
62,171, // "t"
63,211, // letter128
64,16, // {199..218 231..250}
65,16, // {193..198 225..230}
66,32, // digit
67,59, // {"1".."9"}
68,59, // "0"
69,85, // digit128
70,37, // {176..185}
87,186, // idChar*
88,109, // $$0
93,105, // idChar
94,213, // "_"
95,219, // idChar128
96,12, // {223}
  }
,
{ // state 118
10,231, // `}
79,232, // "}"
  }
,
{ // state 119
0x80000000|189, // match move
0x80000000|36, // no-match move
0x80000000|159, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 120
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 121
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 122
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 123
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 124
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 125
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 126
59,38, // "x"
  }
,
{ // state 127
24,MIN_REDUCTION+49, // `[
83,MIN_REDUCTION+49, // "["
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 128
71,90, // ws
72,157, // " "
73,81, // {10}
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 129
7,58, // ID
49,117, // letter
50,171, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
51,171, // "p"
52,171, // "v"
53,171, // "c"
54,171, // "i"
55,171, // "l"
56,171, // "o"
57,171, // "r"
58,171, // "u"
59,171, // "x"
60,171, // "b"
61,171, // "e"
62,171, // "t"
63,52, // letter128
64,16, // {199..218 231..250}
65,16, // {193..198 225..230}
  }
,
{ // state 130
0x80000000|163, // match move
0x80000000|74, // no-match move
0x80000000|159, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 131
2,193, // ws*
71,3, // ws
72,157, // " "
73,81, // {10}
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 132
0x80000000|195, // match move
0x80000000|106, // no-match move
0x80000000|159, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 133
2,22, // ws*
71,3, // ws
72,157, // " "
73,81, // {10}
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 134
24,MIN_REDUCTION+98, // `[
83,MIN_REDUCTION+98, // "["
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 135
7,18, // ID
45,104, // <unary exp>
46,27, // <exp8>
47,135, // `-
48,161, // INTLIT
49,57, // letter
50,171, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
51,171, // "p"
52,171, // "v"
53,171, // "c"
54,171, // "i"
55,171, // "l"
56,171, // "o"
57,171, // "r"
58,171, // "u"
59,171, // "x"
60,171, // "b"
61,171, // "e"
62,171, // "t"
63,54, // letter128
64,249, // {199..218 231..250}
65,249, // {193..198 225..230}
67,145, // {"1".."9"}
68,101, // "0"
69,217, // digit128
70,1, // {176..185}
80,35, // "-"
  }
,
{ // state 136
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 137
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 138
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 139
7,191, // ID
23,13, // <empty bracket pair>
24,229, // `[
49,117, // letter
50,171, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
51,171, // "p"
52,171, // "v"
53,171, // "c"
54,171, // "i"
55,171, // "l"
56,171, // "o"
57,171, // "r"
58,171, // "u"
59,171, // "x"
60,171, // "b"
61,171, // "e"
62,171, // "t"
63,52, // letter128
64,16, // {199..218 231..250}
65,16, // {193..198 225..230}
83,140, // "["
  }
,
{ // state 140
2,223, // ws*
71,3, // ws
72,157, // " "
73,81, // {10}
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 141
7,18, // ID
27,273, // `(
43,114, // <exp7>
44,64, // <cast exp>
45,61, // <unary exp>
46,27, // <exp8>
47,135, // `-
48,161, // INTLIT
49,57, // letter
50,171, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
51,171, // "p"
52,171, // "v"
53,171, // "c"
54,171, // "i"
55,171, // "l"
56,171, // "o"
57,171, // "r"
58,171, // "u"
59,171, // "x"
60,171, // "b"
61,171, // "e"
62,171, // "t"
63,54, // letter128
64,249, // {199..218 231..250}
65,249, // {193..198 225..230}
67,145, // {"1".."9"}
68,101, // "0"
69,217, // digit128
70,1, // {176..185}
76,265, // "("
80,35, // "-"
  }
,
{ // state 142
24,MIN_REDUCTION+126, // `[
71,266, // ws
72,190, // " "
73,218, // {10}
83,MIN_REDUCTION+126, // "["
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 143
28,8, // `)
30,125, // <list element>
31,152, // `,
77,269, // ")"
85,210, // ","
  }
,
{ // state 144
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 145
66,89, // digit
67,59, // {"1".."9"}
68,59, // "0"
69,247, // digit128
70,1, // {176..185}
89,88, // digit*
90,149, // $$1
  }
,
{ // state 146
71,90, // ws
72,157, // " "
73,81, // {10}
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 147
61,126, // "e"
  }
,
{ // state 148
24,MIN_REDUCTION+51, // `[
83,MIN_REDUCTION+51, // "["
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 149
0x80000000|2, // match move
0x80000000|224, // no-match move
0x80000000|159, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 150
24,MIN_REDUCTION+128, // `[
71,266, // ws
72,190, // " "
73,218, // {10}
83,MIN_REDUCTION+128, // "["
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 151
0x80000000|2, // match move
0x80000000|98, // no-match move
0x80000000|159, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 152
7,155, // ID
19,34, // <type>
21,79, // `int
22,234, // `boolean
49,117, // letter
50,171, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
51,171, // "p"
52,171, // "v"
53,171, // "c"
54,171, // "i"
55,171, // "l"
56,171, // "o"
57,171, // "r"
58,171, // "u"
59,171, // "x"
60,171, // "b"
61,171, // "e"
62,171, // "t"
63,52, // letter128
64,16, // {199..218 231..250}
65,16, // {193..198 225..230}
74,116, // "#"
  }
,
{ // state 153
17,70, // <formal list>
26,9, // <empty paren pair>
27,80, // `(
76,265, // "("
  }
,
{ // state 154
7,155, // ID
9,203, // <decl in class>*
10,123, // `}
12,60, // <decl in class>
13,174, // <method decl>
14,158, // <inst var decl>
15,225, // `public
19,46, // <type>
21,79, // `int
22,234, // `boolean
49,117, // letter
50,171, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
51,171, // "p"
52,171, // "v"
53,171, // "c"
54,171, // "i"
55,171, // "l"
56,171, // "o"
57,171, // "r"
58,171, // "u"
59,171, // "x"
60,171, // "b"
61,171, // "e"
62,171, // "t"
63,52, // letter128
64,16, // {199..218 231..250}
65,16, // {193..198 225..230}
74,73, // "#"
79,232, // "}"
  }
,
{ // state 155
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 156
58,41, // "u"
  }
,
{ // state 157
100,MIN_REDUCTION+50, // $NT
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 158
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 159
24,229, // `[
83,140, // "["
  }
,
{ // state 160
24,MIN_REDUCTION+96, // `[
71,266, // ws
72,190, // " "
73,218, // {10}
83,MIN_REDUCTION+96, // "["
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 161
0x80000000|2, // match move
0x80000000|241, // no-match move
0x80000000|159, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 162
71,90, // ws
72,157, // " "
73,81, // {10}
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 163
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 164
2,240, // ws*
24,MIN_REDUCTION+97, // `[
71,7, // ws
72,190, // " "
73,218, // {10}
83,MIN_REDUCTION+97, // "["
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 165
2,167, // ws*
71,3, // ws
72,157, // " "
73,81, // {10}
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 166
24,MIN_REDUCTION+93, // `[
83,MIN_REDUCTION+93, // "["
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 167
71,90, // ws
72,157, // " "
73,81, // {10}
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 168
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 169
7,270, // ID
8,68, // `{
10,138, // `}
19,139, // <type>
21,79, // `int
22,234, // `boolean
27,273, // `(
32,137, // <stmt>
33,42, // <assign>
35,39, // <local var decl>
37,47, // <exp>
39,246, // <exp5>
41,185, // <exp6>
43,199, // <exp7>
44,64, // <cast exp>
45,61, // <unary exp>
46,27, // <exp8>
47,135, // `-
48,161, // INTLIT
49,57, // letter
50,171, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
51,171, // "p"
52,171, // "v"
53,171, // "c"
54,171, // "i"
55,171, // "l"
56,171, // "o"
57,171, // "r"
58,171, // "u"
59,171, // "x"
60,171, // "b"
61,171, // "e"
62,171, // "t"
63,54, // letter128
64,249, // {199..218 231..250}
65,249, // {193..198 225..230}
67,145, // {"1".."9"}
68,101, // "0"
69,217, // digit128
70,1, // {176..185}
74,116, // "#"
76,265, // "("
78,227, // "{"
79,232, // "}"
80,35, // "-"
  }
,
{ // state 170
2,162, // ws*
71,3, // ws
72,157, // " "
73,81, // {10}
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 171
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 172
2,23, // ws*
24,MIN_REDUCTION+129, // `[
71,7, // ws
72,190, // " "
73,218, // {10}
83,MIN_REDUCTION+129, // "["
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 173
0x80000000|86, // match move
0x80000000|83, // no-match move
0x80000000|159, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 174
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 175
24,MIN_REDUCTION+44, // `[
83,MIN_REDUCTION+44, // "["
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 176
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 177
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 178
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 179
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 180
71,90, // ws
72,157, // " "
73,81, // {10}
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 181
0x80000000|194, // match move
0x80000000|24, // no-match move
0x80000000|159, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 182
24,MIN_REDUCTION+43, // `[
83,MIN_REDUCTION+43, // "["
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 183
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 184
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 185
42,141, // `*
75,165, // "*"
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 186
49,168, // letter
50,171, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
51,171, // "p"
52,171, // "v"
53,171, // "c"
54,171, // "i"
55,171, // "l"
56,171, // "o"
57,171, // "r"
58,171, // "u"
59,171, // "x"
60,171, // "b"
61,171, // "e"
62,171, // "t"
63,211, // letter128
64,16, // {199..218 231..250}
65,16, // {193..198 225..230}
66,32, // digit
67,59, // {"1".."9"}
68,59, // "0"
69,85, // digit128
70,37, // {176..185}
88,120, // $$0
93,198, // idChar
94,213, // "_"
95,219, // idChar128
96,12, // {223}
  }
,
{ // state 187
0x80000000|2, // match move
0x80000000|107, // no-match move
0x80000000|159, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 188
8,76, // `{
78,227, // "{"
  }
,
{ // state 189
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 190
0x80000000|10, // match move
0x80000000|91, // no-match move
0x80000000|159, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 191
38,84, // `=
82,131, // "="
  }
,
{ // state 192
99,MIN_REDUCTION+0, // $
  }
,
{ // state 193
71,90, // ws
72,157, // " "
73,81, // {10}
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 194
2,77, // ws*
  }
,
{ // state 195
2,119, // ws*
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 196
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 197
24,115, // `[
83,140, // "["
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 198
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 199
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 200
0x80000000|275, // match move
0x80000000|172, // no-match move
0x80000000|159, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 201
24,MIN_REDUCTION+84, // `[
71,266, // ws
72,190, // " "
73,218, // {10}
83,MIN_REDUCTION+84, // "["
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 202
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 203
7,155, // ID
10,49, // `}
12,253, // <decl in class>
13,174, // <method decl>
14,158, // <inst var decl>
15,225, // `public
19,46, // <type>
21,79, // `int
22,234, // `boolean
49,117, // letter
50,171, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
51,171, // "p"
52,171, // "v"
53,171, // "c"
54,171, // "i"
55,171, // "l"
56,171, // "o"
57,171, // "r"
58,171, // "u"
59,171, // "x"
60,171, // "b"
61,171, // "e"
62,171, // "t"
63,52, // letter128
64,16, // {199..218 231..250}
65,16, // {193..198 225..230}
74,73, // "#"
79,232, // "}"
  }
,
{ // state 204
28,92, // `)
29,143, // <list element>*
30,178, // <list element>
31,152, // `,
77,269, // ")"
85,210, // ","
  }
,
{ // state 205
71,90, // ws
72,157, // " "
73,81, // {10}
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 206
71,90, // ws
72,157, // " "
73,81, // {10}
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 207
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 208
17,188, // <formal list>
26,9, // <empty paren pair>
27,80, // `(
76,265, // "("
  }
,
{ // state 209
2,48, // ws*
24,MIN_REDUCTION+91, // `[
71,7, // ws
72,190, // " "
73,218, // {10}
83,MIN_REDUCTION+91, // "["
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 210
2,258, // ws*
71,3, // ws
72,157, // " "
73,81, // {10}
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 211
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 212
24,MIN_REDUCTION+103, // `[
83,MIN_REDUCTION+103, // "["
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 213
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 214
7,155, // ID
9,261, // <decl in class>*
10,29, // `}
12,60, // <decl in class>
13,174, // <method decl>
14,158, // <inst var decl>
15,225, // `public
19,46, // <type>
21,79, // `int
22,234, // `boolean
49,117, // letter
50,171, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
51,171, // "p"
52,171, // "v"
53,171, // "c"
54,171, // "i"
55,171, // "l"
56,171, // "o"
57,171, // "r"
58,171, // "u"
59,171, // "x"
60,171, // "b"
61,171, // "e"
62,171, // "t"
63,52, // letter128
64,16, // {199..218 231..250}
65,16, // {193..198 225..230}
74,73, // "#"
79,232, // "}"
  }
,
{ // state 215
24,MIN_REDUCTION+113, // `[
83,MIN_REDUCTION+113, // "["
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 216
24,MIN_REDUCTION+43, // `[
38,MIN_REDUCTION+43, // `=
40,MIN_REDUCTION+43, // `+
42,MIN_REDUCTION+43, // `*
75,MIN_REDUCTION+43, // "*"
81,MIN_REDUCTION+43, // "+"
82,MIN_REDUCTION+43, // "="
83,MIN_REDUCTION+43, // "["
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 217
0x80000000|250, // match move
0x80000000|164, // no-match move
0x80000000|159, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 218
0x80000000|96, // match move
0x80000000|148, // no-match move
0x80000000|159, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 219
2,128, // ws*
71,3, // ws
72,157, // " "
73,81, // {10}
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 220
7,270, // ID
8,68, // `{
18,260, // <stmt>*
19,139, // <type>
20,118, // <return stmt>
21,79, // `int
22,234, // `boolean
27,273, // `(
32,144, // <stmt>
33,42, // <assign>
35,39, // <local var decl>
36,72, // `return
37,47, // <exp>
39,246, // <exp5>
41,185, // <exp6>
43,199, // <exp7>
44,64, // <cast exp>
45,61, // <unary exp>
46,27, // <exp8>
47,135, // `-
48,161, // INTLIT
49,57, // letter
50,171, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
51,171, // "p"
52,171, // "v"
53,171, // "c"
54,171, // "i"
55,171, // "l"
56,171, // "o"
57,171, // "r"
58,171, // "u"
59,171, // "x"
60,171, // "b"
61,171, // "e"
62,171, // "t"
63,54, // letter128
64,249, // {199..218 231..250}
65,249, // {193..198 225..230}
67,145, // {"1".."9"}
68,101, // "0"
69,217, // digit128
70,1, // {176..185}
74,94, // "#"
76,265, // "("
78,227, // "{"
80,35, // "-"
  }
,
{ // state 221
2,256, // ws*
71,3, // ws
72,157, // " "
73,81, // {10}
100,MIN_REDUCTION+85, // $NT
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 222
24,MIN_REDUCTION+104, // `[
83,MIN_REDUCTION+104, // "["
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 223
71,90, // ws
72,157, // " "
73,81, // {10}
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 224
24,MIN_REDUCTION+95, // `[
83,MIN_REDUCTION+95, // "["
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 225
7,155, // ID
16,4, // `void
19,252, // <type>
21,79, // `int
22,234, // `boolean
49,117, // letter
50,171, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
51,171, // "p"
52,171, // "v"
53,171, // "c"
54,171, // "i"
55,171, // "l"
56,171, // "o"
57,171, // "r"
58,171, // "u"
59,171, // "x"
60,171, // "b"
61,171, // "e"
62,171, // "t"
63,52, // letter128
64,16, // {199..218 231..250}
65,16, // {193..198 225..230}
74,110, // "#"
  }
,
{ // state 226
56,235, // "o"
  }
,
{ // state 227
2,21, // ws*
71,3, // ws
72,157, // " "
73,81, // {10}
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 228
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 229
25,33, // `]
84,221, // "]"
  }
,
{ // state 230
0x80000000|262, // match move
0x80000000|222, // no-match move
0x80000000|159, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 231
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 232
2,71, // ws*
71,3, // ws
72,157, // " "
73,81, // {10}
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 233
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 234
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 235
2,146, // ws*
71,3, // ws
72,157, // " "
73,81, // {10}
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 236
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 237
8,154, // `{
78,227, // "{"
  }
,
{ // state 238
7,18, // ID
27,273, // `(
37,254, // <exp>
39,246, // <exp5>
41,185, // <exp6>
43,199, // <exp7>
44,64, // <cast exp>
45,61, // <unary exp>
46,27, // <exp8>
47,135, // `-
48,161, // INTLIT
49,57, // letter
50,171, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
51,171, // "p"
52,171, // "v"
53,171, // "c"
54,171, // "i"
55,171, // "l"
56,171, // "o"
57,171, // "r"
58,171, // "u"
59,171, // "x"
60,171, // "b"
61,171, // "e"
62,171, // "t"
63,54, // letter128
64,249, // {199..218 231..250}
65,249, // {193..198 225..230}
67,145, // {"1".."9"}
68,101, // "0"
69,217, // digit128
70,1, // {176..185}
76,265, // "("
80,35, // "-"
  }
,
{ // state 239
0x80000000|2, // match move
0x80000000|102, // no-match move
0x80000000|159, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 240
0x80000000|2, // match move
0x80000000|160, // no-match move
0x80000000|159, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 241
24,MIN_REDUCTION+45, // `[
83,MIN_REDUCTION+45, // "["
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 242
2,180, // ws*
71,3, // ws
72,157, // " "
73,81, // {10}
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 243
49,168, // letter
50,171, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
51,171, // "p"
52,171, // "v"
53,171, // "c"
54,171, // "i"
55,171, // "l"
56,171, // "o"
57,171, // "r"
58,171, // "u"
59,171, // "x"
60,171, // "b"
61,171, // "e"
62,171, // "t"
63,66, // letter128
64,249, // {199..218 231..250}
65,249, // {193..198 225..230}
66,32, // digit
67,59, // {"1".."9"}
68,59, // "0"
69,230, // digit128
70,1, // {176..185}
88,130, // $$0
93,198, // idChar
94,213, // "_"
95,132, // idChar128
96,173, // {223}
  }
,
{ // state 244
2,274, // ws*
71,3, // ws
72,157, // " "
73,81, // {10}
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 245
MIN_REDUCTION+1, // (default reduction)
  }
,
{ // state 246
40,40, // `+
81,244, // "+"
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 247
0x80000000|276, // match move
0x80000000|55, // no-match move
0x80000000|159, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 248
71,90, // ws
72,157, // " "
73,81, // {10}
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 249
0x80000000|177, // match move
0x80000000|63, // no-match move
0x80000000|159, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 250
2,240, // ws*
  }
,
{ // state 251
0x80000000|2, // match move
0x80000000|142, // no-match move
0x80000000|159, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 252
7,153, // ID
23,13, // <empty bracket pair>
24,229, // `[
49,117, // letter
50,171, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
51,171, // "p"
52,171, // "v"
53,171, // "c"
54,171, // "i"
55,171, // "l"
56,171, // "o"
57,171, // "r"
58,171, // "u"
59,171, // "x"
60,171, // "b"
61,171, // "e"
62,171, // "t"
63,52, // letter128
64,16, // {199..218 231..250}
65,16, // {193..198 225..230}
83,140, // "["
  }
,
{ // state 253
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 254
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 255
71,90, // ws
72,157, // " "
73,81, // {10}
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 256
71,90, // ws
72,157, // " "
73,81, // {10}
100,MIN_REDUCTION+84, // $NT
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 257
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 258
71,90, // ws
72,157, // " "
73,81, // {10}
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 259
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 260
7,270, // ID
8,68, // `{
19,139, // <type>
20,69, // <return stmt>
21,79, // `int
22,234, // `boolean
27,273, // `(
32,137, // <stmt>
33,42, // <assign>
35,39, // <local var decl>
36,72, // `return
37,47, // <exp>
39,246, // <exp5>
41,185, // <exp6>
43,199, // <exp7>
44,64, // <cast exp>
45,61, // <unary exp>
46,27, // <exp8>
47,135, // `-
48,161, // INTLIT
49,57, // letter
50,171, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
51,171, // "p"
52,171, // "v"
53,171, // "c"
54,171, // "i"
55,171, // "l"
56,171, // "o"
57,171, // "r"
58,171, // "u"
59,171, // "x"
60,171, // "b"
61,171, // "e"
62,171, // "t"
63,54, // letter128
64,249, // {199..218 231..250}
65,249, // {193..198 225..230}
67,145, // {"1".."9"}
68,101, // "0"
69,217, // digit128
70,1, // {176..185}
74,94, // "#"
76,265, // "("
78,227, // "{"
80,35, // "-"
  }
,
{ // state 261
7,155, // ID
10,121, // `}
12,253, // <decl in class>
13,174, // <method decl>
14,158, // <inst var decl>
15,225, // `public
19,46, // <type>
21,79, // `int
22,234, // `boolean
49,117, // letter
50,171, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
51,171, // "p"
52,171, // "v"
53,171, // "c"
54,171, // "i"
55,171, // "l"
56,171, // "o"
57,171, // "r"
58,171, // "u"
59,171, // "x"
60,171, // "b"
61,171, // "e"
62,171, // "t"
63,52, // letter128
64,16, // {199..218 231..250}
65,16, // {193..198 225..230}
74,73, // "#"
79,232, // "}"
  }
,
{ // state 262
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 263
23,13, // <empty bracket pair>
24,229, // `[
28,111, // `)
77,269, // ")"
83,140, // "["
  }
,
{ // state 264
42,141, // `*
75,165, // "*"
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 265
2,205, // ws*
71,3, // ws
72,157, // " "
73,81, // {10}
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 266
0x80000000|28, // match move
0x80000000|75, // no-match move
0x80000000|159, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 267
3,245, // <program>
4,53, // <class decl>+
5,277, // <class decl>
6,15, // `class
71,90, // ws
72,157, // " "
73,81, // {10}
74,17, // "#"
  }
,
{ // state 268
2,45, // ws*
71,3, // ws
72,157, // " "
73,81, // {10}
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 269
2,26, // ws*
71,3, // ws
72,157, // " "
73,81, // {10}
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 270
0x80000000|202, // match move
0x80000000|216, // no-match move
0x80000000|159, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 271
62,242, // "t"
  }
,
{ // state 272
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 273
7,155, // ID
19,263, // <type>
21,79, // `int
22,234, // `boolean
49,117, // letter
50,171, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
51,171, // "p"
52,171, // "v"
53,171, // "c"
54,171, // "i"
55,171, // "l"
56,171, // "o"
57,171, // "r"
58,171, // "u"
59,171, // "x"
60,171, // "b"
61,171, // "e"
62,171, // "t"
63,52, // letter128
64,16, // {199..218 231..250}
65,16, // {193..198 225..230}
74,116, // "#"
  }
,
{ // state 274
71,90, // ws
72,157, // " "
73,81, // {10}
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 275
2,23, // ws*
  }
,
{ // state 276
2,251, // ws*
  }
,
{ // state 277
MIN_REDUCTION+122, // (default reduction)
  }
,
};
}
public MJGrammarParseTable(MJGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[278][];
  int doneSoFar = 0;
  doneSoFar += new Initter1().doInit(doneSoFar);
}
public int[] getProdTable() { return prodTable; }
private static int[] prodTable = {
// $$start ::= <start>
(0<<16)+1,
// <start> ::= ws* <program>
(1<<16)+2,
// <start> ::= <program>
(1<<16)+1,
// <program> ::= <class decl>+
(3<<16)+1,
// <class decl> ::= `class ID `{ <decl in class>* `}
(5<<16)+5,
// <class decl> ::= `class ID `{ `}
(5<<16)+4,
// <class decl> ::= `class `extends ID ID `{ <decl in class>* `}
(5<<16)+7,
// <class decl> ::= `class `extends ID ID `{ `}
(5<<16)+6,
// <decl in class> ::= <method decl>
(12<<16)+1,
// <decl in class> ::= <inst var decl>
(12<<16)+1,
// <method decl> ::= `public `void ID <formal list> `{ <stmt>* `}
(13<<16)+7,
// <method decl> ::= `public `void ID <formal list> `{ `}
(13<<16)+6,
// <method decl> ::= `public <type> ID <formal list> `{ <stmt>* <return stmt> `}
(13<<16)+8,
// <method decl> ::= `public <type> ID <formal list> `{ <return stmt> `}
(13<<16)+7,
// <type> ::= `int
(19<<16)+1,
// <type> ::= `boolean
(19<<16)+1,
// <type> ::= ID
(19<<16)+1,
// <type> ::= <type> <empty bracket pair>
(19<<16)+2,
// <empty bracket pair> ::= `[ `]
(23<<16)+2,
// <empty paren pair> ::= `( `)
(26<<16)+2,
// <formal list> ::= <empty paren pair>
(17<<16)+1,
// <formal list> ::= `( <type> ID <list element>* `)
(17<<16)+5,
// <formal list> ::= `( <type> ID `)
(17<<16)+4,
// <list element> ::= `, <type> ID
(30<<16)+3,
// <stmt> ::= <assign> `;
(32<<16)+2,
// <stmt> ::= `{ <stmt>* `}
(32<<16)+3,
// <stmt> ::= `{ `}
(32<<16)+2,
// <stmt> ::= <local var decl> `;
(32<<16)+2,
// <return stmt> ::= `return <exp> `;
(20<<16)+3,
// <assign> ::= <exp> `= <exp>
(33<<16)+3,
// <local var decl> ::= <type> ID `= <exp>
(35<<16)+4,
// <inst var decl> ::= <type> ID `;
(14<<16)+3,
// <exp> ::= <exp5>
(37<<16)+1,
// <exp5> ::= <exp5> `+ <exp6>
(39<<16)+3,
// <exp5> ::= <exp6>
(39<<16)+1,
// <exp6> ::= <exp6> `* <exp7>
(41<<16)+3,
// <exp6> ::= <exp7>
(41<<16)+1,
// <exp7> ::= <cast exp>
(43<<16)+1,
// <exp7> ::= <unary exp>
(43<<16)+1,
// <cast exp> ::= `( <type> `) <cast exp>
(44<<16)+4,
// <cast exp> ::= `( <type> `) <exp8>
(44<<16)+4,
// <unary exp> ::= `- <unary exp>
(45<<16)+2,
// <unary exp> ::= <exp8>
(45<<16)+1,
// <exp8> ::= ID
(46<<16)+1,
// <exp8> ::= <exp8> !<empty bracket pair> `[ <exp> `]
(46<<16)+4,
// <exp8> ::= INTLIT
(46<<16)+1,
// letter ::= {"A".."Z" "a".."z"}
(49<<16)+1,
// letter128 ::= {193..218 225..250}
(63<<16)+1,
// digit ::= {"0".."9"}
(66<<16)+1,
// digit128 ::= {176..185}
(69<<16)+1,
// ws ::= " "
(71<<16)+1,
// ws ::= {10}
(71<<16)+1,
// `boolean ::= "#" "b" "o" ws*
(22<<16)+4,
// `boolean ::= "#" "b" "o"
(22<<16)+3,
// `class ::= "#" "c" "l" ws*
(6<<16)+4,
// `class ::= "#" "c" "l"
(6<<16)+3,
// `extends ::= "#" "e" "x" ws*
(11<<16)+4,
// `extends ::= "#" "e" "x"
(11<<16)+3,
// `void ::= "#" "v" "o" ws*
(16<<16)+4,
// `void ::= "#" "v" "o"
(16<<16)+3,
// `int ::= "#" "i" "t" ws*
(21<<16)+4,
// `int ::= "#" "i" "t"
(21<<16)+3,
// `return ::= "#" "r" "e" ws*
(36<<16)+4,
// `return ::= "#" "r" "e"
(36<<16)+3,
// `public ::= "#" "p" "u" ws*
(15<<16)+4,
// `public ::= "#" "p" "u"
(15<<16)+3,
// `* ::= "*" ws*
(42<<16)+2,
// `* ::= "*"
(42<<16)+1,
// `( ::= "(" ws*
(27<<16)+2,
// `( ::= "("
(27<<16)+1,
// `) ::= ")" ws*
(28<<16)+2,
// `) ::= ")"
(28<<16)+1,
// `{ ::= "{" ws*
(8<<16)+2,
// `{ ::= "{"
(8<<16)+1,
// `} ::= "}" ws*
(10<<16)+2,
// `} ::= "}"
(10<<16)+1,
// `- ::= "-" ws*
(47<<16)+2,
// `- ::= "-"
(47<<16)+1,
// `+ ::= "+" ws*
(40<<16)+2,
// `+ ::= "+"
(40<<16)+1,
// `= ::= "=" ws*
(38<<16)+2,
// `= ::= "="
(38<<16)+1,
// `[ ::= "[" ws*
(24<<16)+2,
// `[ ::= "["
(24<<16)+1,
// `] ::= "]" ws*
(25<<16)+2,
// `] ::= "]"
(25<<16)+1,
// `, ::= "," ws*
(31<<16)+2,
// `, ::= ","
(31<<16)+1,
// `; ::= ";" ws*
(34<<16)+2,
// `; ::= ";"
(34<<16)+1,
// ID ::= letter128 ws*
(7<<16)+2,
// ID ::= letter128
(7<<16)+1,
// ID ::= letter idChar* $$0
(7<<16)+3,
// ID ::= letter $$0
(7<<16)+2,
// INTLIT ::= {"1".."9"} digit* $$1
(48<<16)+3,
// INTLIT ::= {"1".."9"} $$1
(48<<16)+2,
// INTLIT ::= digit128 ws*
(48<<16)+2,
// INTLIT ::= digit128
(48<<16)+1,
// INTLIT ::= "0" hexDigit* $$2
(48<<16)+3,
// INTLIT ::= "0" $$2
(48<<16)+2,
// idChar ::= letter
(93<<16)+1,
// idChar ::= digit
(93<<16)+1,
// idChar ::= "_"
(93<<16)+1,
// idChar128 ::= letter128
(95<<16)+1,
// idChar128 ::= digit128
(95<<16)+1,
// idChar128 ::= {223}
(95<<16)+1,
// hexDigit ::= {"0".."9" "A".."Z" "a".."z"}
(97<<16)+1,
// hexDigit128 ::= {176..185 193..198 225..230}
(98<<16)+1,
// <stmt>* ::= <stmt>* <stmt>
(18<<16)+2,
// <stmt>* ::= <stmt>
(18<<16)+1,
// <decl in class>* ::= <decl in class>* <decl in class>
(9<<16)+2,
// <decl in class>* ::= <decl in class>
(9<<16)+1,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// digit* ::= digit* digit
(89<<16)+2,
// digit* ::= digit
(89<<16)+1,
// hexDigit* ::= hexDigit* hexDigit
(91<<16)+2,
// hexDigit* ::= hexDigit
(91<<16)+1,
// <list element>* ::= <list element>* <list element>
(29<<16)+2,
// <list element>* ::= <list element>
(29<<16)+1,
// idChar* ::= idChar* idChar
(87<<16)+2,
// idChar* ::= idChar
(87<<16)+1,
// <class decl>+ ::= <class decl>
(4<<16)+1,
// <class decl>+ ::= <class decl>+ <class decl>
(4<<16)+2,
// $$0 ::= idChar128 ws*
(88<<16)+2,
// $$0 ::= idChar128
(88<<16)+1,
// $$1 ::= digit128 ws*
(90<<16)+2,
// $$1 ::= digit128
(90<<16)+1,
// $$2 ::= hexDigit128 ws*
(92<<16)+2,
// $$2 ::= hexDigit128
(92<<16)+1,
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
-1, // 9
73, // 10
-1, // 11
-1, // 12
-1, // 13
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
72, // " "
-1, // "!"
-1, // '"'
74, // "#"
-1, // "$"
-1, // "%"
-1, // "&"
-1, // "'"
76, // "("
77, // ")"
75, // "*"
81, // "+"
85, // ","
80, // "-"
-1, // "."
-1, // "/"
68, // "0"
67, // "1"
67, // "2"
67, // "3"
67, // "4"
67, // "5"
67, // "6"
67, // "7"
67, // "8"
67, // "9"
-1, // ":"
86, // ";"
-1, // "<"
82, // "="
-1, // ">"
-1, // "?"
-1, // "@"
50, // "A"
50, // "B"
50, // "C"
50, // "D"
50, // "E"
50, // "F"
50, // "G"
50, // "H"
50, // "I"
50, // "J"
50, // "K"
50, // "L"
50, // "M"
50, // "N"
50, // "O"
50, // "P"
50, // "Q"
50, // "R"
50, // "S"
50, // "T"
50, // "U"
50, // "V"
50, // "W"
50, // "X"
50, // "Y"
50, // "Z"
83, // "["
-1, // "\"
84, // "]"
-1, // "^"
94, // "_"
-1, // "`"
50, // "a"
60, // "b"
53, // "c"
50, // "d"
61, // "e"
50, // "f"
50, // "g"
50, // "h"
54, // "i"
50, // "j"
50, // "k"
55, // "l"
50, // "m"
50, // "n"
56, // "o"
51, // "p"
50, // "q"
57, // "r"
50, // "s"
62, // "t"
58, // "u"
52, // "v"
50, // "w"
59, // "x"
50, // "y"
50, // "z"
78, // "{"
-1, // "|"
79, // "}"
-1, // "~"
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
70, // 176
70, // 177
70, // 178
70, // 179
70, // 180
70, // 181
70, // 182
70, // 183
70, // 184
70, // 185
-1, // 186
-1, // 187
-1, // 188
-1, // 189
-1, // 190
-1, // 191
-1, // 192
65, // 193
65, // 194
65, // 195
65, // 196
65, // 197
65, // 198
64, // 199
64, // 200
64, // 201
64, // 202
64, // 203
64, // 204
64, // 205
64, // 206
64, // 207
64, // 208
64, // 209
64, // 210
64, // 211
64, // 212
64, // 213
64, // 214
64, // 215
64, // 216
64, // 217
64, // 218
-1, // 219
-1, // 220
-1, // 221
-1, // 222
96, // 223
-1, // 224
65, // 225
65, // 226
65, // 227
65, // 228
65, // 229
65, // 230
64, // 231
64, // 232
64, // 233
64, // 234
64, // 235
64, // 236
64, // 237
64, // 238
64, // 239
64, // 240
64, // 241
64, // 242
64, // 243
64, // 244
64, // 245
64, // 246
64, // 247
64, // 248
64, // 249
64, // 250
-1, // 251
-1, // 252
-1, // 253
-1, // 254
-1, // 255
};
public String[] getActionProdNameTable() { return actionProdNameTable; }
private String[] actionProdNameTable = {
"", // 0
"<start> ::= ws* <program>", // 1
"<start> ::= ws* <program>", // 2
"<program> ::= # <class decl>+", // 3
"<class decl> ::= `class # ID `{ <decl in class>* `}", // 4
"<class decl> ::= `class # ID `{ <decl in class>* `}", // 5
"<class decl> ::= `class `extends ID # ID `{ <decl in class>* `}", // 6
"<class decl> ::= `class `extends ID # ID `{ <decl in class>* `}", // 7
"<decl in class> ::= <method decl>", // 8
"<decl in class> ::= <inst var decl>", // 9
"<method decl> ::= `public `void # ID <formal list> `{ <stmt>* `}", // 10
"<method decl> ::= `public `void # ID <formal list> `{ <stmt>* `}", // 11
"<method decl> ::= `public <type> # ID <formal list> `{ <stmt>* <return stmt> `}", // 12
"<method decl> ::= `public <type> # ID <formal list> `{ <stmt>* <return stmt> `}", // 13
"<type> ::= # `int", // 14
"<type> ::= # `boolean", // 15
"<type> ::= # ID", // 16
"<type> ::= # <type> <empty bracket pair>", // 17
"<empty bracket pair> ::= `[ `]", // 18
"<empty paren pair> ::= `( `)", // 19
"<formal list> ::= <empty paren pair>", // 20
"<formal list> ::= `( <type> # ID <list element>* `)", // 21
"<formal list> ::= `( <type> # ID <list element>* `)", // 22
"<list element> ::= `, <type> # ID", // 23
"<stmt> ::= <assign> `;", // 24
"<stmt> ::= # `{ <stmt>* `}", // 25
"<stmt> ::= # `{ <stmt>* `}", // 26
"<stmt> ::= <local var decl> `;", // 27
"<return stmt> ::= `return <exp> `;", // 28
"<assign> ::= <exp> # `= <exp>", // 29
"<local var decl> ::= <type> # ID `= <exp>", // 30
"<inst var decl> ::= <type> # ID `;", // 31
"<exp> ::= <exp5>", // 32
"<exp5> ::= <exp5> # `+ <exp6>", // 33
"<exp5> ::= <exp6>", // 34
"<exp6> ::= <exp6> # `* <exp7>", // 35
"<exp6> ::= <exp7>", // 36
"<exp7> ::= <cast exp>", // 37
"<exp7> ::= <unary exp>", // 38
"<cast exp> ::= # `( <type> `) <cast exp>", // 39
"<cast exp> ::= # `( <type> `) <exp8>", // 40
"<unary exp> ::= # `- <unary exp>", // 41
"<unary exp> ::= <exp8>", // 42
"<exp8> ::= # ID", // 43
"<exp8> ::= <exp8> !<empty bracket pair> # `[ <exp> `]", // 44
"<exp8> ::= # INTLIT", // 45
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 46
"letter128 ::= {193..218 225..250}", // 47
"digit ::= {\"0\"..\"9\"}", // 48
"digit128 ::= {176..185}", // 49
"ws ::= \" \"", // 50
"ws ::= {10} registerNewline", // 51
"`boolean ::= \"#\" \"b\" \"o\" ws*", // 52
"`boolean ::= \"#\" \"b\" \"o\" ws*", // 53
"`class ::= \"#\" \"c\" \"l\" ws*", // 54
"`class ::= \"#\" \"c\" \"l\" ws*", // 55
"`extends ::= \"#\" \"e\" \"x\" ws*", // 56
"`extends ::= \"#\" \"e\" \"x\" ws*", // 57
"`void ::= \"#\" \"v\" \"o\" ws*", // 58
"`void ::= \"#\" \"v\" \"o\" ws*", // 59
"`int ::= \"#\" \"i\" \"t\" ws*", // 60
"`int ::= \"#\" \"i\" \"t\" ws*", // 61
"`return ::= \"#\" \"r\" \"e\" ws*", // 62
"`return ::= \"#\" \"r\" \"e\" ws*", // 63
"`public ::= \"#\" \"p\" \"u\" ws*", // 64
"`public ::= \"#\" \"p\" \"u\" ws*", // 65
"`* ::= \"*\" ws*", // 66
"`* ::= \"*\" ws*", // 67
"`( ::= \"(\" ws*", // 68
"`( ::= \"(\" ws*", // 69
"`) ::= \")\" ws*", // 70
"`) ::= \")\" ws*", // 71
"`{ ::= \"{\" ws*", // 72
"`{ ::= \"{\" ws*", // 73
"`} ::= \"}\" ws*", // 74
"`} ::= \"}\" ws*", // 75
"`- ::= \"-\" ws*", // 76
"`- ::= \"-\" ws*", // 77
"`+ ::= \"+\" ws*", // 78
"`+ ::= \"+\" ws*", // 79
"`= ::= \"=\" ws*", // 80
"`= ::= \"=\" ws*", // 81
"`[ ::= \"[\" ws*", // 82
"`[ ::= \"[\" ws*", // 83
"`] ::= \"]\" ws*", // 84
"`] ::= \"]\" ws*", // 85
"`, ::= \",\" ws*", // 86
"`, ::= \",\" ws*", // 87
"`; ::= \";\" ws*", // 88
"`; ::= \";\" ws*", // 89
"ID ::= letter128 ws*", // 90
"ID ::= letter128 ws*", // 91
"ID ::= letter idChar* idChar128 ws*", // 92
"ID ::= letter idChar* idChar128 ws*", // 93
"INTLIT ::= {\"1\"..\"9\"} digit* digit128 ws*", // 94
"INTLIT ::= {\"1\"..\"9\"} digit* digit128 ws*", // 95
"INTLIT ::= digit128 ws*", // 96
"INTLIT ::= digit128 ws*", // 97
"INTLIT ::= \"0\" hexDigit* hexDigit128 ws*", // 98
"INTLIT ::= \"0\" hexDigit* hexDigit128 ws*", // 99
"idChar ::= letter", // 100
"idChar ::= digit", // 101
"idChar ::= \"_\"", // 102
"idChar128 ::= letter128", // 103
"idChar128 ::= digit128", // 104
"idChar128 ::= {223}", // 105
"hexDigit ::= {\"0\"..\"9\" \"A\"..\"Z\" \"a\"..\"z\"}", // 106
"hexDigit128 ::= {176..185 193..198 225..230}", // 107
"<stmt>* ::= <stmt>* <stmt>", // 108
"<stmt>* ::= <stmt>* <stmt>", // 109
"<decl in class>* ::= <decl in class>* <decl in class>", // 110
"<decl in class>* ::= <decl in class>* <decl in class>", // 111
"ws* ::= ws* ws", // 112
"ws* ::= ws* ws", // 113
"digit* ::= digit* digit", // 114
"digit* ::= digit* digit", // 115
"hexDigit* ::= hexDigit* hexDigit", // 116
"hexDigit* ::= hexDigit* hexDigit", // 117
"<list element>* ::= <list element>* <list element>", // 118
"<list element>* ::= <list element>* <list element>", // 119
"idChar* ::= idChar* idChar", // 120
"idChar* ::= idChar* idChar", // 121
"<class decl>+ ::= <class decl>", // 122
"<class decl>+ ::= <class decl>+ <class decl>", // 123
"", // 124
"", // 125
"", // 126
"", // 127
"", // 128
"", // 129
};
public int[][] getActionTable() { return actionTable; }
private int[][] actionTable = {
    { // 0: $$start ::= <start> @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 1: <start> ::= ws* <program> @topLevel(Program)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 2: <start> ::= [ws*] <program> @topLevel(Program)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 3: <program> ::= [#] <class decl>+ @createProgram(int,List<ClassDecl>)=>Program
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0x5)/*methodCall:1*/,
    },
    { // 4: <class decl> ::= `class [#] ID `{ <decl in class>* `} @createBasicClassDecl(int,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 5: <class decl> ::= `class [#] ID `{ [<decl in class>*] `} @createBasicClassDecl(int,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 6: <class decl> ::= `class `extends ID [#] ID `{ <decl in class>* `} @createExtendedClassDecl(String,int,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 7: <class decl> ::= `class `extends ID [#] ID `{ [<decl in class>*] `} @createExtendedClassDecl(String,int,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 8: <decl in class> ::= <method decl> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 9: <decl in class> ::= <inst var decl> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 10: <method decl> ::= `public `void [#] ID <formal list> `{ <stmt>* `} @createMethodDeclVoid(int,String,VarDeclList,List<Statement>)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 11: <method decl> ::= `public `void [#] ID <formal list> `{ [<stmt>*] `} @createMethodDeclVoid(int,String,VarDeclList,List<Statement>)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 12: <method decl> ::= `public <type> [#] ID <formal list> `{ <stmt>* <return stmt> `} @createMethodDeclNonVoid(Type,int,String,VarDeclList,List<Statement>,Exp)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 13: <method decl> ::= `public <type> [#] ID <formal list> `{ [<stmt>*] <return stmt> `} @createMethodDeclNonVoid(Type,int,String,VarDeclList,List<Statement>,Exp)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 14: <type> ::= [#] `int @intType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 15: <type> ::= [#] `boolean @booleanType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((7<<5)|0x5)/*methodCall:7*/,
    },
    { // 16: <type> ::= [#] ID @identifierType(int,String)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 17: <type> ::= [#] <type> <empty bracket pair> @newArrayType(int,Type,Object)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((9<<5)|0x5)/*methodCall:9*/,
    },
    { // 18: <empty bracket pair> ::= `[ `] @null
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x8)/*nullPointer:1*/,
    },
    { // 19: <empty paren pair> ::= `( `) @null
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x8)/*nullPointer:1*/,
    },
    { // 20: <formal list> ::= <empty paren pair> @createEmptyVarDeclList(Object)=>VarDeclList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x5)/*methodCall:10*/,
    },
    { // 21: <formal list> ::= `( <type> [#] ID <list element>* `) @createVarDeclList(Type,int,String,List<VarDecl>)=>VarDeclList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 22: <formal list> ::= `( <type> [#] ID [<list element>*] `) @createVarDeclList(Type,int,String,List<VarDecl>)=>VarDeclList
      ((1<<5)|0xe)/*popPos:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 23: <list element> ::= `, <type> [#] ID @createListVarDecl(Type,int,String)=>VarDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 24: <stmt> ::= <assign> `; @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 25: <stmt> ::= [#] `{ <stmt>* `} @newBlock(int,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 26: <stmt> ::= [#] `{ [<stmt>*] `} @newBlock(int,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 27: <stmt> ::= <local var decl> `; @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 28: <return stmt> ::= `return <exp> `; @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 29: <assign> ::= <exp> [#] `= <exp> @assign(Exp,int,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 30: <local var decl> ::= <type> [#] ID `= <exp> @localVarDecl(Type,int,String,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 31: <inst var decl> ::= <type> [#] ID `; @instVarDecl(Type,int,String)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 32: <exp> ::= <exp5> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 33: <exp5> ::= <exp5> [#] `+ <exp6> @newPlus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 34: <exp5> ::= <exp6> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 35: <exp6> ::= <exp6> [#] `* <exp7> @newTimes(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 36: <exp6> ::= <exp7> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 37: <exp7> ::= <cast exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 38: <exp7> ::= <unary exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 39: <cast exp> ::= [#] `( <type> `) <cast exp> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 40: <cast exp> ::= [#] `( <type> `) <exp8> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 41: <unary exp> ::= [#] `- <unary exp> @newUnaryMinus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 42: <unary exp> ::= <exp8> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 43: <exp8> ::= [#] ID @newIdentfierExp(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 44: <exp8> ::= <exp8> !<empty bracket pair> [#] `[ <exp> `] @newArrayLookup(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 45: <exp8> ::= [#] INTLIT @newIntegerLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 46: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 47: letter128 ::= {193..218 225..250} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 48: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 49: digit128 ::= {176..185} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 50: ws ::= " " @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 51: ws ::= {10} [registerNewline] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 52: `boolean ::= "#" "b" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 53: `boolean ::= "#" "b" "o" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 54: `class ::= "#" "c" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 55: `class ::= "#" "c" "l" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 56: `extends ::= "#" "e" "x" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 57: `extends ::= "#" "e" "x" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 58: `void ::= "#" "v" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 59: `void ::= "#" "v" "o" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 60: `int ::= "#" "i" "t" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 61: `int ::= "#" "i" "t" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 62: `return ::= "#" "r" "e" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 63: `return ::= "#" "r" "e" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 64: `public ::= "#" "p" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 65: `public ::= "#" "p" "u" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 66: `* ::= "*" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 67: `* ::= "*" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 68: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 69: `( ::= "(" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 70: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 71: `) ::= ")" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 72: `{ ::= "{" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 73: `{ ::= "{" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 74: `} ::= "}" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 75: `} ::= "}" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 76: `- ::= "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 77: `- ::= "-" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 78: `+ ::= "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 79: `+ ::= "+" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 80: `= ::= "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 81: `= ::= "=" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 82: `[ ::= "[" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 83: `[ ::= "[" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 84: `] ::= "]" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 85: `] ::= "]" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 86: `, ::= "," ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 87: `, ::= "," [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 88: `; ::= ";" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 89: `; ::= ";" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 90: ID ::= letter128 ws* @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 91: ID ::= letter128 [ws*] @text
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 92: ID ::= letter idChar* $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 93: ID ::= letter [idChar*] $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 94: INTLIT ::= {"1".."9"} digit* $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 95: INTLIT ::= {"1".."9"} [digit*] $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 96: INTLIT ::= digit128 ws* @convertToInt(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 97: INTLIT ::= digit128 [ws*] @convertToInt(char)=>int
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 98: INTLIT ::= "0" hexDigit* $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 99: INTLIT ::= "0" [hexDigit*] $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 100: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 101: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 102: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 103: idChar128 ::= letter128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 104: idChar128 ::= digit128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 105: idChar128 ::= {223} @underscore(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 106: hexDigit ::= {"0".."9" "A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 107: hexDigit128 ::= {176..185 193..198 225..230} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 108: <stmt>* ::= <stmt>* <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 109: <stmt>* ::= [<stmt>*] <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 110: <decl in class>* ::= <decl in class>* <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 111: <decl in class>* ::= [<decl in class>*] <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 112: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 113: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
    },
    { // 114: digit* ::= digit* digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 115: digit* ::= [digit*] digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 116: hexDigit* ::= hexDigit* hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 117: hexDigit* ::= [hexDigit*] hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 118: <list element>* ::= <list element>* <list element> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 119: <list element>* ::= [<list element>*] <list element> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 120: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 121: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 122: <class decl>+ ::= <class decl> @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 123: <class decl>+ ::= <class decl>+ <class decl> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 124: $$0 ::= idChar128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 125: $$0 ::= idChar128 [ws*] @pass
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 126: $$1 ::= digit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 127: $$1 ::= digit128 [ws*] @pass
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 128: $$2 ::= hexDigit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 129: $$2 ::= hexDigit128 [ws*] @pass
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
};
public String[] getNullProdNameTable() { return nullProdNameTable; }
private String[] nullProdNameTable = {
    "hexDigit* ::=", // hexDigit*
    "<stmt>* ::=", // <stmt>*
    "<decl in class>* ::=", // <decl in class>*
    "ws* ::=", // ws*
    "idChar* ::=", // idChar*
    "<list element>* ::=", // <list element>*
    "digit* ::=", // digit*
    "# ::=", // #
    "registerNewline ::= #", // registerNewline
};
public int[][] getNullProductionActionTable() { return nullActionTable; }
private int[][] nullActionTable = {
    { // hexDigit*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // <stmt>*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // <decl in class>*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // ws*
    },
    { // idChar*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // <list element>*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // digit*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // #
      7/*duplicateTop*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // registerNewline
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
};
public void actionCall(int idx, wrangLR.runtime.SemanticInfo si) {
  switch(idx) {
    default: System.err.println("Internal error--illegal action number: "+idx);break;
    case 0: {
      Program parm0 = (Program)si.popPb();
      actionObject.topLevel(parm0);
    }
    break;
    case 1: {
      int parm0 = (Integer)si.popPb();
      List<ClassDecl> parm1 = (List<ClassDecl>)si.popPb();
      Program result = actionObject.createProgram(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 2: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      List<Decl> parm2 = (List<Decl>)si.popPb();
      ClassDecl result = actionObject.createBasicClassDecl(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 3: {
      String parm0 = (String)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      List<Decl> parm3 = (List<Decl>)si.popPb();
      ClassDecl result = actionObject.createExtendedClassDecl(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 4: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      VarDeclList parm2 = (VarDeclList)si.popPb();
      List<Statement> parm3 = (List<Statement>)si.popPb();
      Decl result = actionObject.createMethodDeclVoid(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 5: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      VarDeclList parm3 = (VarDeclList)si.popPb();
      List<Statement> parm4 = (List<Statement>)si.popPb();
      Exp parm5 = (Exp)si.popPb();
      Decl result = actionObject.createMethodDeclNonVoid(parm0,parm1,parm2,parm3,parm4,parm5);
      si.pushPb(result);
    }
    break;
    case 6: {
      int parm0 = (Integer)si.popPb();
      Type result = actionObject.intType(parm0);
      si.pushPb(result);
    }
    break;
    case 7: {
      int parm0 = (Integer)si.popPb();
      Type result = actionObject.booleanType(parm0);
      si.pushPb(result);
    }
    break;
    case 8: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Type result = actionObject.identifierType(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 9: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Object parm2 = (Object)si.popPb();
      Type result = actionObject.newArrayType(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 10: {
      Object parm0 = (Object)si.popPb();
      VarDeclList result = actionObject.createEmptyVarDeclList(parm0);
      si.pushPb(result);
    }
    break;
    case 11: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      List<VarDecl> parm3 = (List<VarDecl>)si.popPb();
      VarDeclList result = actionObject.createVarDeclList(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 12: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      VarDecl result = actionObject.createListVarDecl(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 13: {
      int parm0 = (Integer)si.popPb();
      List<Statement> parm1 = (List<Statement>)si.popPb();
      Statement result = actionObject.newBlock(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 14: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Statement result = actionObject.assign(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 15: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp parm3 = (Exp)si.popPb();
      Statement result = actionObject.localVarDecl(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 16: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Decl result = actionObject.instVarDecl(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 17: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newPlus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 18: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newTimes(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 19: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newCast(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 20: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryMinus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 21: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newIdentfierExp(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 22: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newArrayLookup(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 23: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newIntegerLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 24: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.sub128(parm0);
      si.pushPb(result);
    }
    break;
    case 25: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 26: {
      char parm0 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0);
      si.pushPb(result);
    }
    break;
    case 27: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convert16ToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 28: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.underscore(parm0);
      si.pushPb(result);
    }
    break;
    case 29: {
      int parm0 = (Integer)si.popPb();
      actionObject.registerNewline(parm0);
    }
    break;
  }
}
private String[] saNameSigTable = {
"void topLevel(Program)",
"Program createProgram(int,List<ClassDecl>)",
"ClassDecl createBasicClassDecl(int,String,List<Decl>)",
"ClassDecl createExtendedClassDecl(String,int,String,List<Decl>)",
"Decl createMethodDeclVoid(int,String,VarDeclList,List<Statement>)",
"Decl createMethodDeclNonVoid(Type,int,String,VarDeclList,List<Statement>,Exp)",
"Type intType(int)",
"Type booleanType(int)",
"Type identifierType(int,String)",
"Type newArrayType(int,Type,Object)",
"VarDeclList createEmptyVarDeclList(Object)",
"VarDeclList createVarDeclList(Type,int,String,List<VarDecl>)",
"VarDecl createListVarDecl(Type,int,String)",
"Statement newBlock(int,List<Statement>)",
"Statement assign(Exp,int,Exp)",
"Statement localVarDecl(Type,int,String,Exp)",
"Decl instVarDecl(Type,int,String)",
"Exp newPlus(Exp,int,Exp)",
"Exp newTimes(Exp,int,Exp)",
"Exp newCast(int,Type,Exp)",
"Exp newUnaryMinus(int,Exp)",
"Exp newIdentfierExp(int,String)",
"Exp newArrayLookup(Exp,int,Exp)",
"Exp newIntegerLiteral(int,int)",
"char sub128(char)",
"int convertToInt(char,List<Character>,char)",
"int convertToInt(char)",
"int convert16ToInt(char,List<Character>,char)",
"char underscore(char)",
"void registerNewline(int)",
};
public String[] getSaNameSigTable() {
  return saNameSigTable;
}
private int[] sigCountTable = {
1,0,
2,1,
3,1,
4,1,
4,1,
6,1,
1,1,
1,1,
2,1,
3,1,
1,1,
4,1,
3,1,
2,1,
3,1,
4,1,
3,1,
3,1,
3,1,
3,1,
2,1,
2,1,
3,1,
2,1,
1,1,
3,1,
1,1,
3,1,
1,1,
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
    1,
    1,
    1,
    0,
    1,
    0,
    1,
    0,
    0,
    1,
    1,
    1,
    0,
    0,
    1,
    1,
    1,
    1,
    0,
    0,
    1,
    0,
    0,
    1,
    0,
    0,
    1,
    1,
    0,
    1,
    1,
    0,
    1,
    0,
    1,
    0,
    1,
    0,
    1,
    0,
    1,
    1,
    1,
    1,
    0,
    1,
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
    1,
    -1,
    -1,
    1,
    -1,
    -1,
    1,
    -1,
    0,
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
    1,
    1,
    1,
    1,
    1,
    1,
    -1,
    1,
    -1,
    1,
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
