grammar decafV2;

// ************ DEFINITIONS *******************
LETTER: ('a' ..'z' | 'A' ..'Z');
fragment DIGIT: '0' ..'9';

// *************TOKENS *********************
CHAR2: LETTER;
id: LETTER ( LETTER | DIGIT)*;
NUM: DIGIT (DIGIT)*;
COMMENTS: '//' ~('\r' | '\n')* -> channel(HIDDEN);
WS: [ \t\r\n]+ -> skip; // skip spaces, tabs, newlines
// ********** PARSER *****************

program: 'class' 'Program' '{' (declaration)* '}';

declaration:
	structDeclaration
	| varDeclaration
	| methodDeclaration;

varDeclaration: varType id ';' | varType id '[' NUM ']' ';';

structDeclaration: 'struct' id '{' (varDeclaration)* '}' (';')?;

varType:
	'int'
	| 'char'
	| 'boolean'
	| 'struct' id
	| structDeclaration
	| 'void';

methodDeclaration:
	methodType id '(' (parameter (',' parameter)*)* ')' block;

methodType: 'int' | 'char' | 'boolean' | 'void';

parameter: parameterType id | parameterType id '[' ']' | 'void';

parameterType: 'int' | 'char' | 'boolean';

block: '{' (varDeclaration)* (statement)* '}';

statement:
	'if' '(' expression ')' block ('else' block)?
	| 'while' '(' expression ')' block
	| 'return' (expression)? ';'
	| methodCall ';'
	| block
	| location '=' expression
	| (expression)? ';';

location: (id | id '[' expression ']') ('.' location)?;

expression:
	location
	| methodCall
	| literal
	| expression op expression
	| '-' expression
	| '!' expression
	| '(' expression ')';

methodCall: id '(' arg? (',' arg)* ')';

arg: expression;

op: arith_op | rel_op | eq_op | cond_op;

arith_op: '+' | '-' | '*' | '/' | '%';

rel_op: '<' | '>' | '<=' | '>=';

eq_op: '==' | '!=';

cond_op: '&&' | '||';

literal: int_literal | char_literal | bool_literal;

int_literal: NUM;

char_literal: '\'' LETTER '\'' | '"' LETTER '"';

bool_literal: 'true' | 'false';