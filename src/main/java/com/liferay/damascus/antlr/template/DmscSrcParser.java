// Generated from DmscSrcParser.g4 by ANTLR 4.7.1
package com.liferay.damascus.antlr.template;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DmscSrcParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEA_WS=1, OPEN=2, SLASH_OPEN=3, TEXT=4, RootDecl=5, SyncDecl=6, CLOSE=7, 
		SLASH_CLOSE=8, SLASH=9, EQUALS=10, STRING=11, Name=12, S=13;
	public static final int
		RULE_file = 0, RULE_dmsctags = 1, RULE_syncelementStart = 2, RULE_syncelementEnd = 3, 
		RULE_rootelement = 4, RULE_attribute = 5, RULE_alldata = 6, RULE_endoffile = 7;
	public static final String[] ruleNames = {
		"file", "dmsctags", "syncelementStart", "syncelementEnd", "rootelement", 
		"attribute", "alldata", "endoffile"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'<'", "'</'", null, null, null, "'>'", "'/>'", "'/'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SEA_WS", "OPEN", "SLASH_OPEN", "TEXT", "RootDecl", "SyncDecl", 
		"CLOSE", "SLASH_CLOSE", "SLASH", "EQUALS", "STRING", "Name", "S"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "DmscSrcParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		protected boolean rootState = false;
		protected int rootCnt = 0;
		protected boolean betweenSyncTag = false;	
		protected int syncCnt = 0;
		
		public boolean isBetweenSyncTag() {
			return betweenSyncTag;
		}

	public DmscSrcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public List<AlldataContext> alldata() {
			return getRuleContexts(AlldataContext.class);
		}
		public AlldataContext alldata(int i) {
			return getRuleContext(AlldataContext.class,i);
		}
		public EndoffileContext endoffile() {
			return getRuleContext(EndoffileContext.class,0);
		}
		public List<DmsctagsContext> dmsctags() {
			return getRuleContexts(DmsctagsContext.class);
		}
		public DmsctagsContext dmsctags(int i) {
			return getRuleContext(DmsctagsContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmscSrcParserListener ) ((DmscSrcParserListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmscSrcParserListener ) ((DmscSrcParserListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			alldata();
			setState(20); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(17);
				dmsctags();
				setState(18);
				alldata();
				}
				}
				setState(22); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OPEN || _la==SLASH_OPEN );
			setState(24);
			endoffile();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DmsctagsContext extends ParserRuleContext {
		public SyncelementStartContext syncelementStart() {
			return getRuleContext(SyncelementStartContext.class,0);
		}
		public SyncelementEndContext syncelementEnd() {
			return getRuleContext(SyncelementEndContext.class,0);
		}
		public RootelementContext rootelement() {
			return getRuleContext(RootelementContext.class,0);
		}
		public DmsctagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dmsctags; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmscSrcParserListener ) ((DmscSrcParserListener)listener).enterDmsctags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmscSrcParserListener ) ((DmscSrcParserListener)listener).exitDmsctags(this);
		}
	}

	public final DmsctagsContext dmsctags() throws RecognitionException {
		DmsctagsContext _localctx = new DmsctagsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dmsctags);
		try {
			setState(29);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				syncelementStart();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				syncelementEnd();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(28);
				rootelement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SyncelementStartContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(DmscSrcParser.OPEN, 0); }
		public TerminalNode SyncDecl() { return getToken(DmscSrcParser.SyncDecl, 0); }
		public TerminalNode CLOSE() { return getToken(DmscSrcParser.CLOSE, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public SyncelementStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syncelementStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmscSrcParserListener ) ((DmscSrcParserListener)listener).enterSyncelementStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmscSrcParserListener ) ((DmscSrcParserListener)listener).exitSyncelementStart(this);
		}
	}

	public final SyncelementStartContext syncelementStart() throws RecognitionException {
		SyncelementStartContext _localctx = new SyncelementStartContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_syncelementStart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(OPEN);
			setState(32);
			match(SyncDecl);
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Name) {
				{
				{
				setState(33);
				attribute();
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(39);
			match(CLOSE);

					if(!rootState) {
						notifyErrorListeners("dmsc:root must be decleared first.");
					}
					syncCnt++;
					betweenSyncTag = true;
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SyncelementEndContext extends ParserRuleContext {
		public TerminalNode SLASH_OPEN() { return getToken(DmscSrcParser.SLASH_OPEN, 0); }
		public TerminalNode SyncDecl() { return getToken(DmscSrcParser.SyncDecl, 0); }
		public TerminalNode CLOSE() { return getToken(DmscSrcParser.CLOSE, 0); }
		public SyncelementEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syncelementEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmscSrcParserListener ) ((DmscSrcParserListener)listener).enterSyncelementEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmscSrcParserListener ) ((DmscSrcParserListener)listener).exitSyncelementEnd(this);
		}
	}

	public final SyncelementEndContext syncelementEnd() throws RecognitionException {
		SyncelementEndContext _localctx = new SyncelementEndContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_syncelementEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(SLASH_OPEN);
			setState(43);
			match(SyncDecl);
			setState(44);
			match(CLOSE);

					if(!betweenSyncTag) {
						notifyErrorListeners("dmsc:sync start tag is missing.");
					}
					betweenSyncTag = false;
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RootelementContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(DmscSrcParser.OPEN, 0); }
		public TerminalNode RootDecl() { return getToken(DmscSrcParser.RootDecl, 0); }
		public TerminalNode SLASH_CLOSE() { return getToken(DmscSrcParser.SLASH_CLOSE, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public RootelementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rootelement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmscSrcParserListener ) ((DmscSrcParserListener)listener).enterRootelement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmscSrcParserListener ) ((DmscSrcParserListener)listener).exitRootelement(this);
		}
	}

	public final RootelementContext rootelement() throws RecognitionException {
		RootelementContext _localctx = new RootelementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_rootelement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(OPEN);
			setState(48);
			match(RootDecl);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Name) {
				{
				{
				setState(49);
				attribute();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			match(SLASH_CLOSE);

					if(1 <= rootCnt) {
						notifyErrorListeners("dmsc:root is only allowed once to use in a file");
					}
					rootCnt++;
					rootState = true;
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(DmscSrcParser.Name, 0); }
		public TerminalNode STRING() { return getToken(DmscSrcParser.STRING, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmscSrcParserListener ) ((DmscSrcParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmscSrcParserListener ) ((DmscSrcParserListener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(Name);
			setState(59);
			match(EQUALS);
			setState(60);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlldataContext extends ParserRuleContext {
		public AlldataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alldata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmscSrcParserListener ) ((DmscSrcParserListener)listener).enterAlldata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmscSrcParserListener ) ((DmscSrcParserListener)listener).exitAlldata(this);
		}
	}

	public final AlldataContext alldata() throws RecognitionException {
		AlldataContext _localctx = new AlldataContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_alldata);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(62);
					matchWildcard();
					}
					} 
				}
				setState(67);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndoffileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(DmscSrcParser.EOF, 0); }
		public EndoffileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endoffile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmscSrcParserListener ) ((DmscSrcParserListener)listener).enterEndoffile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmscSrcParserListener ) ((DmscSrcParserListener)listener).exitEndoffile(this);
		}
	}

	public final EndoffileContext endoffile() throws RecognitionException {
		EndoffileContext _localctx = new EndoffileContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_endoffile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(EOF);

					if(0 < syncCnt && betweenSyncTag) {
						notifyErrorListeners("dmsc:sync is not closed.");
					}		
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17J\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2\6\2"+
		"\27\n\2\r\2\16\2\30\3\2\3\2\3\3\3\3\3\3\5\3 \n\3\3\4\3\4\3\4\7\4%\n\4"+
		"\f\4\16\4(\13\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6\65\n\6"+
		"\f\6\16\68\13\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\7\bB\n\b\f\b\16\bE\13"+
		"\b\3\t\3\t\3\t\3\t\3C\2\n\2\4\6\b\n\f\16\20\2\2\2G\2\22\3\2\2\2\4\37\3"+
		"\2\2\2\6!\3\2\2\2\b,\3\2\2\2\n\61\3\2\2\2\f<\3\2\2\2\16C\3\2\2\2\20F\3"+
		"\2\2\2\22\26\5\16\b\2\23\24\5\4\3\2\24\25\5\16\b\2\25\27\3\2\2\2\26\23"+
		"\3\2\2\2\27\30\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\32\3\2\2\2\32\33"+
		"\5\20\t\2\33\3\3\2\2\2\34 \5\6\4\2\35 \5\b\5\2\36 \5\n\6\2\37\34\3\2\2"+
		"\2\37\35\3\2\2\2\37\36\3\2\2\2 \5\3\2\2\2!\"\7\4\2\2\"&\7\b\2\2#%\5\f"+
		"\7\2$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\')\3\2\2\2(&\3\2\2\2)*\7"+
		"\t\2\2*+\b\4\1\2+\7\3\2\2\2,-\7\5\2\2-.\7\b\2\2./\7\t\2\2/\60\b\5\1\2"+
		"\60\t\3\2\2\2\61\62\7\4\2\2\62\66\7\7\2\2\63\65\5\f\7\2\64\63\3\2\2\2"+
		"\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28\66\3\2\2\29:\7\n"+
		"\2\2:;\b\6\1\2;\13\3\2\2\2<=\7\16\2\2=>\7\f\2\2>?\7\r\2\2?\r\3\2\2\2@"+
		"B\13\2\2\2A@\3\2\2\2BE\3\2\2\2CD\3\2\2\2CA\3\2\2\2D\17\3\2\2\2EC\3\2\2"+
		"\2FG\7\2\2\3GH\b\t\1\2H\21\3\2\2\2\7\30\37&\66C";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}