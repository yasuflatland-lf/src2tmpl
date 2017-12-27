parser grammar DmscSrcParser;

options { tokenVocab=DmscSrcLexer; } // use tokens from ModeTagsLexer.g4

file
	: .*? (dmsctags .*?)+ 
	;

dmsctags     
	: syncelementStart
	| syncelementEnd
	| rootelement
	;

syncelementStart
	: OPEN SyncDecl attribute* CLOSE
	;

syncelementEnd
	: SLASH_OPEN SyncDecl CLOSE
	;

rootelement
	: OPEN RootDecl attribute* SLASH_CLOSE
	;
	
attribute   
	:   Name '=' STRING
	; 

chardata
    : TEXT 
    | SEA_WS 
    ;
    
savedata
	: chardata*
	;
