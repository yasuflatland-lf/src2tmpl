parser grammar DmscSrcParser;

options { tokenVocab=DmscSrcLexer; } // use tokens from ModeTagsLexer.g4

@members {
	boolean rootState = false;
	boolean syncState = false;	
	int syncCnt = 0;
}

file
	: .*? (dmsctags .*?)+ endoffile
	;

dmsctags     
	: syncelementStart
	| syncelementEnd
	| rootelement
	;

syncelementStart
	: OPEN SyncDecl attribute* CLOSE
	{
		if(!rootState) {
			notifyErrorListeners("dmsc:root must be decleared first.");
		}
		syncCnt++;
		syncState = true;
	}
	;

syncelementEnd
	: SLASH_OPEN SyncDecl CLOSE
	{
		if(!syncState) {
			notifyErrorListeners("dmsc:sync start tag is missing.");
		}
		syncState = false;
	}	
	;

rootelement
	: OPEN RootDecl attribute* SLASH_CLOSE
	{
		rootState = true;
	}
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

endoffile
	: EOF
	{
		if(0 < syncCnt && syncState) {
			notifyErrorListeners("dmsc:sync is not closed.");
		}		
	}
	;