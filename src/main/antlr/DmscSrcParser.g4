parser grammar DmscSrcParser;

options { tokenVocab=DmscSrcLexer; } // use tokens from ModeTagsLexer.g4

file
	: (chardata? dmsctags)* chardata?
	| (dmsctags chardata?)* chardata?
	;

dmsctags     
	: syncelement
	| rootelement
	| othertags
	;

syncelement
	: SyncDecl attribute* CLOSE savedata? SyncDeclClose CLOSE
	;

rootelement
	: RootDecl attribute* SLASH_CLOSE
	;
	
attribute   
	:   Name '=' STRING
	; 

othertags
	: OTHERTAGS
	;

chardata
    : TEXT 
    | SEA_WS 
    ;
    
savedata
	: TEXT
	| SEA_WS
	;