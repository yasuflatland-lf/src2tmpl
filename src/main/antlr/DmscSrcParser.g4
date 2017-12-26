parser grammar DmscSrcParser;

options { tokenVocab=DmscSrcLexer; } // use tokens from ModeTagsLexer.g4

file
	: (chardata? element chardata?)*
	;

element     
	: SyncDecl attribute* CLOSE savedata? SyncDeclClose CLOSE
	| RootDecl attribute* SLASH_CLOSE
	;

attribute   :   Name '=' STRING ; // Our STRING is AttValue in spec

/** ``All text that is not markup constitutes the character data of
 *  the document.''
 */
chardata
    : TEXT 
    | SEA_WS 
    ;
    
savedata
	: TEXT
	| SEA_WS
	;