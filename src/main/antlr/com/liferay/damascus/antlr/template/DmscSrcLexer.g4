lexer grammar DmscSrcLexer;

// Default mode rules (the SEA)
OPEN_TAG_ROOT
    : WS* '<' WS* 'dmsc:root' WS*   -> mode(DMSC_TAG_MODE)
    ;

OPEN_TAG_SYNC
    : WS* '<' WS* 'dmsc:sync' WS*   -> mode(DMSC_TAG_MODE)
    ;

TEXT
    : .+?
    ;

WS
    : [ \r\t\u000C\n]+ -> channel(HIDDEN)
    ; // Preserve white spaces to restore at the end.

//
// Sync tag mode
//
mode DMSC_SYNC_TAG_MODE;

CLOSE_TAG_SYNC
    : WS* '<' WS* '/' WS* 'dmsc:sync' WS* '>' WS* -> mode(DEFAULT_MODE)
    ;

SYNC_TEXT
    : .+?
    ;

//
// Root mode
//
mode DMSC_TAG_MODE;

CLOSE_TAG_ROOT
    : WS* '/' WS* '>' WS*    -> mode(DEFAULT_MODE)
    ;

CLOSE_TAG
    : WS* '>' WS* -> mode(DMSC_SYNC_TAG_MODE)
    ;

//
// lexing mode for attribute values
//
TAG_EQUALS
    : '=' -> pushMode(ATTVALUE)
    ;

TAG_NAME
    : WS* TAG_NameStartChar TAG_NameChar*
    ;

fragment
DIGIT
    : [0-9]
    ;

fragment
TAG_NameChar
    : TAG_NameStartChar
    | '-'
    | '_'
    | '.'
    | DIGIT
    |   '\u00B7'
    |   '\u0300'..'\u036F'
    |   '\u203F'..'\u2040'
    ;

fragment
TAG_NameStartChar
    :   [:a-zA-Z]
    |   '\u2070'..'\u218F'
    |   '\u2C00'..'\u2FEF'
    |   '\u3001'..'\uD7FF'
    |   '\uF900'..'\uFDCF'
    |   '\uFDF0'..'\uFFFD'
    ;

//
// attribute values
//
mode ATTVALUE;

// an attribute value may have spaces b/t the '=' and the value
ATTVALUE_VALUE
    : [ ]* ATTRIBUTE -> popMode
    ;

ATTRIBUTE
    : DOUBLE_QUOTE_STRING
    | SINGLE_QUOTE_STRING
    | ATTCHARS
    | HEXCHARS
    | DECCHARS
    ;

fragment ATTCHAR
    : '-'
    | '_'
    | '.'
    | '/'
    | '+'
    | ','
    | '?'
    | '='
    | ':'
    | ';'
    | '#'
    | [0-9a-zA-Z]
    ;

fragment ATTCHARS
    : ATTCHAR+ ' '?
    ;

fragment HEXCHARS
    : '#' [0-9a-fA-F]+
    ;

fragment DECCHARS
    : [0-9]+ '%'?
    ;

fragment DOUBLE_QUOTE_STRING
    : '"' ~[<"]* '"'
    ;
fragment SINGLE_QUOTE_STRING
    : '\'' ~[<']* '\''
    ;
