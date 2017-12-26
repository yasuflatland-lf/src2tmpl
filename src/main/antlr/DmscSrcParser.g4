parser grammar DmscSrcParser;

options { tokenVocab=DmscSrcLexer; } // use tokens from ModeTagsLexer.g4

file
	: (chardata? dmsctags)*
	| (dmsctags chardata?)*
	| dmsctags
	;

dmsctags     
	: syncelement
	| rootelement
	;

syncelement
	: syncelementStart savedata? syncelementEnd
	;

syncelementStart
	: SyncDecl attribute* CLOSE
	;
		
syncelementEnd
	: SyncDeclClose CLOSE
	;

rootelement
	: RootDecl attribute* SLASH_CLOSE
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