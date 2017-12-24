parser grammar DmscSrcParser;

options { tokenVocab=DmscSrcLexer; } // use tokens from ModeTagsLexer.g4

file
    : syncElement
    | rootElement
    | TEXT*
    ;

rootElement
    : OPEN_TAG_ROOT htmlAttribute* CLOSE_TAG_ROOT
    ;

syncElement
    : OPEN_TAG_SYNC htmlAttribute* CLOSE_TAG syncContents CLOSE_TAG_SYNC
    ;

syncContents
    : SYNC_TEXT*
    ;

htmlAttribute
    : htmlAttributeName TAG_EQUALS htmlAttributeValue
    | htmlAttributeName
    ;

htmlAttributeName
    : TAG_NAME
    ;

htmlAttributeValue
    : ATTVALUE_VALUE
    ;
