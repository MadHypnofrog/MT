grammar test;

program
    : (VAR variables)? (function)* BEGIN commands END '.'
    ;

function
    : h=header (VAR variables)? BEGIN commands n=NAME COLON EQ arithmetic SEMICOLON END SEMICOLON {$h.name.equals($n.getText())}?
    ;

header returns [String name]
    : FUNCTION n=NAME LPAR ((VAR)? declaration SEMICOLON)* (VAR)? declaration RPAR COLON type SEMICOLON {$name = $n.getText();}
    ;

variables
    : (declaration SEMICOLON)+
    ;

declaration
    : (NAME COMMA)* NAME COLON type
    ;

type
    : INTEGER
    | LONG
    | SHORT
    | REAL
    ;

commands
    : (command SEMICOLON)*
    ;

command
    : NAME (PLUS | MINUS | DIV | MUL)? EQ arithmetic
    | READ LPAR (NAME COMMA)* NAME RPAR
    | (WRITE | WRITELN) LPAR ((arithmetic | STRING) COMMA)* (arithmetic | STRING) RPAR
    | NAME LPAR ((NAME COMMA)* NAME)? RPAR
    ;

arithmetic
    : arithmetic PLUS arithmetic
    | arithmetic MUL arithmetic
    | arithmetic MINUS arithmetic
    | arithmetic DIV arithmetic
    | LPAR arithmetic RPAR
    | NAME
    | NUMBER
    | NAME LPAR ((NAME COMMA)* NAME)? RPAR
    ;

FUNCTION
    : 'function'
    ;

INTEGER
    : 'integer'
    ;

LONG
    : 'longint'
    ;

SHORT
    : 'shortint'
    ;

REAL
    : 'real'
    ;

BEGIN
    : 'begin'
    ;

END
    : 'end'
    ;

VAR
    : 'var'
    ;

READ
    : 'read'
    ;

WRITE
    : 'write'
    ;

WRITELN
    : 'writeln'
    ;

COLON
    : ':'
    ;

SEMICOLON
    : ';'
    ;

COMMA
    : ','
    ;

LPAR
    : '('
    ;

RPAR
    : ')'
    ;

fragment
AP
    : '\''
    ;

PLUS
    : '+'
    ;

MINUS
    : '-'
    ;

DIV
    : '/'
    ;

MUL
    : '*'
    ;

EQ
    : '='
    ;

STRING
    : AP ([0-9a-zA-Z*+-/=_() ])* AP
    ;

NUMBER
    : [1-9][0-9]*('.' [0-9]+)?
    ;

NAME
    : ([a-zA-Z_])([0-9a-zA-Z_])*
    ;

WS
    :   [ \t\r\n]+ -> skip
    ;