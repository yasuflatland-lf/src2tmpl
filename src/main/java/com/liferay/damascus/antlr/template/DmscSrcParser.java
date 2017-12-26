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
		SEA_WS=1, OPEN=2, OPEN_SLASH=3, RootDecl=4, SyncDecl=5, SyncDeclClose=6, 
		TEXT=7, CLOSE=8, SLASH_CLOSE=9, SLASH=10, EQUALS=11, STRING=12, Name=13, 
		S=14;
	public static final int
		RULE_file = 0, RULE_dmsctags = 1, RULE_syncelement = 2, RULE_rootelement = 3, 
		RULE_attribute = 4, RULE_othertags = 5, RULE_chardata = 6, RULE_savedata = 7;
	public static final String[] ruleNames = {
		"file", "dmsctags", "syncelement", "rootelement", "attribute", "othertags", 
		"chardata", "savedata"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, "'>'", "'/>'", "'/'", 
		"'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SEA_WS", "OPEN", "OPEN_SLASH", "RootDecl", "SyncDecl", "SyncDeclClose", 
		"TEXT", "CLOSE", "SLASH_CLOSE", "SLASH", "EQUALS", "STRING", "Name", "S"
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

	public DmscSrcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public List<DmsctagsContext> dmsctags() {
			return getRuleContexts(DmsctagsContext.class);
		}
		public DmsctagsContext dmsctags(int i) {
			return getRuleContext(DmsctagsContext.class,i);
		}
		public List<ChardataContext> chardata() {
			return getRuleContexts(ChardataContext.class);
		}
		public ChardataContext chardata(int i) {
			return getRuleContext(ChardataContext.class,i);
		}
		public OthertagsContext othertags() {
			return getRuleContext(OthertagsContext.class,0);
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
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEA_WS) | (1L << RootDecl) | (1L << SyncDecl) | (1L << TEXT))) != 0)) {
					{
					{
					setState(17);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEA_WS || _la==TEXT) {
						{
						setState(16);
						chardata();
						}
					}

					setState(19);
					dmsctags();
					}
					}
					setState(24);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==RootDecl || _la==SyncDecl) {
					{
					{
					setState(25);
					dmsctags();
					setState(27);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEA_WS || _la==TEXT) {
						{
						setState(26);
						chardata();
						}
					}

					}
					}
					setState(33);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN || _la==OPEN_SLASH) {
					{
					setState(34);
					othertags();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEA_WS || _la==TEXT) {
					{
					setState(37);
					chardata();
					}
				}

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

	public static class DmsctagsContext extends ParserRuleContext {
		public SyncelementContext syncelement() {
			return getRuleContext(SyncelementContext.class,0);
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
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SyncDecl:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				syncelement();
				}
				break;
			case RootDecl:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				rootelement();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class SyncelementContext extends ParserRuleContext {
		public TerminalNode SyncDecl() { return getToken(DmscSrcParser.SyncDecl, 0); }
		public List<TerminalNode> CLOSE() { return getTokens(DmscSrcParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(DmscSrcParser.CLOSE, i);
		}
		public TerminalNode SyncDeclClose() { return getToken(DmscSrcParser.SyncDeclClose, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public SavedataContext savedata() {
			return getRuleContext(SavedataContext.class,0);
		}
		public SyncelementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syncelement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmscSrcParserListener ) ((DmscSrcParserListener)listener).enterSyncelement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmscSrcParserListener ) ((DmscSrcParserListener)listener).exitSyncelement(this);
		}
	}

	public final SyncelementContext syncelement() throws RecognitionException {
		SyncelementContext _localctx = new SyncelementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_syncelement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(SyncDecl);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Name) {
				{
				{
				setState(47);
				attribute();
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
			match(CLOSE);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEA_WS || _la==TEXT) {
				{
				setState(54);
				savedata();
				}
			}

			setState(57);
			match(SyncDeclClose);
			setState(58);
			match(CLOSE);
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
		enterRule(_localctx, 6, RULE_rootelement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(RootDecl);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Name) {
				{
				{
				setState(61);
				attribute();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			match(SLASH_CLOSE);
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
		enterRule(_localctx, 8, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(Name);
			setState(70);
			match(EQUALS);
			setState(71);
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

	public static class OthertagsContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(DmscSrcParser.OPEN, 0); }
		public TerminalNode OPEN_SLASH() { return getToken(DmscSrcParser.OPEN_SLASH, 0); }
		public TerminalNode CLOSE() { return getToken(DmscSrcParser.CLOSE, 0); }
		public OthertagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_othertags; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmscSrcParserListener ) ((DmscSrcParserListener)listener).enterOthertags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmscSrcParserListener ) ((DmscSrcParserListener)listener).exitOthertags(this);
		}
	}

	public final OthertagsContext othertags() throws RecognitionException {
		OthertagsContext _localctx = new OthertagsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_othertags);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_la = _input.LA(1);
			if ( !(_la==OPEN || _la==OPEN_SLASH) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(74);
					matchWildcard();
					}
					} 
				}
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			{
			setState(80);
			match(CLOSE);
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

	public static class ChardataContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(DmscSrcParser.TEXT, 0); }
		public TerminalNode SEA_WS() { return getToken(DmscSrcParser.SEA_WS, 0); }
		public ChardataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chardata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmscSrcParserListener ) ((DmscSrcParserListener)listener).enterChardata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmscSrcParserListener ) ((DmscSrcParserListener)listener).exitChardata(this);
		}
	}

	public final ChardataContext chardata() throws RecognitionException {
		ChardataContext _localctx = new ChardataContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_chardata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_la = _input.LA(1);
			if ( !(_la==SEA_WS || _la==TEXT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class SavedataContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(DmscSrcParser.TEXT, 0); }
		public TerminalNode SEA_WS() { return getToken(DmscSrcParser.SEA_WS, 0); }
		public SavedataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savedata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmscSrcParserListener ) ((DmscSrcParserListener)listener).enterSavedata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmscSrcParserListener ) ((DmscSrcParserListener)listener).exitSavedata(this);
		}
	}

	public final SavedataContext savedata() throws RecognitionException {
		SavedataContext _localctx = new SavedataContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_savedata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_la = _input.LA(1);
			if ( !(_la==SEA_WS || _la==TEXT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20Y\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\5\2\24\n\2\3\2"+
		"\7\2\27\n\2\f\2\16\2\32\13\2\3\2\3\2\5\2\36\n\2\7\2 \n\2\f\2\16\2#\13"+
		"\2\3\2\5\2&\n\2\3\2\5\2)\n\2\5\2+\n\2\3\3\3\3\5\3/\n\3\3\4\3\4\7\4\63"+
		"\n\4\f\4\16\4\66\13\4\3\4\3\4\5\4:\n\4\3\4\3\4\3\4\3\5\3\5\7\5A\n\5\f"+
		"\5\16\5D\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\7\7N\n\7\f\7\16\7Q\13\7"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3O\2\n\2\4\6\b\n\f\16\20\2\4\3\2\4\5\4\2"+
		"\3\3\t\t\2^\2*\3\2\2\2\4.\3\2\2\2\6\60\3\2\2\2\b>\3\2\2\2\nG\3\2\2\2\f"+
		"K\3\2\2\2\16T\3\2\2\2\20V\3\2\2\2\22\24\5\16\b\2\23\22\3\2\2\2\23\24\3"+
		"\2\2\2\24\25\3\2\2\2\25\27\5\4\3\2\26\23\3\2\2\2\27\32\3\2\2\2\30\26\3"+
		"\2\2\2\30\31\3\2\2\2\31+\3\2\2\2\32\30\3\2\2\2\33\35\5\4\3\2\34\36\5\16"+
		"\b\2\35\34\3\2\2\2\35\36\3\2\2\2\36 \3\2\2\2\37\33\3\2\2\2 #\3\2\2\2!"+
		"\37\3\2\2\2!\"\3\2\2\2\"+\3\2\2\2#!\3\2\2\2$&\5\f\7\2%$\3\2\2\2%&\3\2"+
		"\2\2&+\3\2\2\2\')\5\16\b\2(\'\3\2\2\2()\3\2\2\2)+\3\2\2\2*\30\3\2\2\2"+
		"*!\3\2\2\2*%\3\2\2\2*(\3\2\2\2+\3\3\2\2\2,/\5\6\4\2-/\5\b\5\2.,\3\2\2"+
		"\2.-\3\2\2\2/\5\3\2\2\2\60\64\7\7\2\2\61\63\5\n\6\2\62\61\3\2\2\2\63\66"+
		"\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\67\3\2\2\2\66\64\3\2\2\2\679\7"+
		"\n\2\28:\5\20\t\298\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\7\b\2\2<=\7\n\2\2=\7"+
		"\3\2\2\2>B\7\6\2\2?A\5\n\6\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C"+
		"E\3\2\2\2DB\3\2\2\2EF\7\13\2\2F\t\3\2\2\2GH\7\17\2\2HI\7\r\2\2IJ\7\16"+
		"\2\2J\13\3\2\2\2KO\t\2\2\2LN\13\2\2\2ML\3\2\2\2NQ\3\2\2\2OP\3\2\2\2OM"+
		"\3\2\2\2PR\3\2\2\2QO\3\2\2\2RS\7\n\2\2S\r\3\2\2\2TU\t\3\2\2U\17\3\2\2"+
		"\2VW\t\3\2\2W\21\3\2\2\2\16\23\30\35!%(*.\649BO";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}