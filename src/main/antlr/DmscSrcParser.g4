parser grammar DmscSrcParser;

options { tokenVocab=DmscSrcLexer; } // use tokens from ModeTagsLexer.g4

@members {
	protected boolean rootState = false;
	protected int rootCnt = 0;
	protected boolean betweenSyncTag = false;	
	protected int syncCnt = 0;
	
	public boolean isBetweenSyncTag() {
		return betweenSyncTag;
	}
}

file
	: alldata (dmsctags alldata)+ endoffile
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
		betweenSyncTag = true;
	}
	;

syncelementEnd
	: SLASH_OPEN SyncDecl CLOSE
	{
		if(!betweenSyncTag) {
			notifyErrorListeners("dmsc:sync start tag is missing.");
		}
		betweenSyncTag = false;
	}	
	;

rootelement
	: OPEN RootDecl attribute* SLASH_CLOSE
	{
		if(1 <= rootCnt) {
			notifyErrorListeners("dmsc:root is only allowed once to use in a file");
		}
		rootCnt++;
		rootState = true;
	}
	;
	
attribute   
	:   Name '=' STRING
	; 

alldata
	: .*?
	;

endoffile
	: EOF
	{
		if(0 < syncCnt && betweenSyncTag) {
			notifyErrorListeners("dmsc:sync is not closed.");
		}		
	}
	;