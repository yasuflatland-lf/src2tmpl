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
		SEA_WS=1, RootDecl=2, SyncDecl=3, SyncDeclClose=4, TEXT=5, CLOSE=6, SLASH_CLOSE=7, 
		SLASH=8, EQUALS=9, STRING=10, Name=11, S=12;
	public static final int
		RULE_file = 0, RULE_dmsctags = 1, RULE_syncelement = 2, RULE_syncelementStart = 3, 
		RULE_syncelementEnd = 4, RULE_rootelement = 5, RULE_attribute = 6, RULE_chardata = 7, 
		RULE_savedata = 8;
	public static final String[] ruleNames = {
		"file", "dmsctags", "syncelement", "syncelementStart", "syncelementEnd", 
		"rootelement", "attribute", "chardata", "savedata"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, "'>'", "'/>'", "'/'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SEA_WS", "RootDecl", "SyncDecl", "SyncDeclClose", "TEXT", "CLOSE", 
		"SLASH_CLOSE", "SLASH", "EQUALS", "STRING", "Name", "S"
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
			setState(37);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEA_WS) | (1L << RootDecl) | (1L << SyncDecl) | (1L << TEXT))) != 0)) {
					{
					{
					setState(19);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEA_WS || _la==TEXT) {
						{
						setState(18);
						chardata();
						}
					}

					setState(21);
					dmsctags();
					}
					}
					setState(26);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==RootDecl || _la==SyncDecl) {
					{
					{
					setState(27);
					dmsctags();
					setState(29);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEA_WS || _la==TEXT) {
						{
						setState(28);
						chardata();
						}
					}

					}
					}
					setState(35);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				dmsctags();
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
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SyncDecl:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				syncelement();
				}
				break;
			case RootDecl:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
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
		public SyncelementStartContext syncelementStart() {
			return getRuleContext(SyncelementStartContext.class,0);
		}
		public SyncelementEndContext syncelementEnd() {
			return getRuleContext(SyncelementEndContext.class,0);
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
			setState(43);
			syncelementStart();
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEA_WS || _la==TEXT) {
				{
				setState(44);
				savedata();
				}
			}

			setState(47);
			syncelementEnd();
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
		enterRule(_localctx, 6, RULE_syncelementStart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(SyncDecl);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Name) {
				{
				{
				setState(50);
				attribute();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
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

	public static class SyncelementEndContext extends ParserRuleContext {
		public TerminalNode SyncDeclClose() { return getToken(DmscSrcParser.SyncDeclClose, 0); }
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
		enterRule(_localctx, 8, RULE_syncelementEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(SyncDeclClose);
			setState(59);
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
		enterRule(_localctx, 10, RULE_rootelement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(RootDecl);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Name) {
				{
				{
				setState(62);
				attribute();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
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
		enterRule(_localctx, 12, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(Name);
			setState(71);
			match(EQUALS);
			setState(72);
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
		enterRule(_localctx, 14, RULE_chardata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
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
		enterRule(_localctx, 16, RULE_savedata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16Q\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\5\2\26"+
		"\n\2\3\2\7\2\31\n\2\f\2\16\2\34\13\2\3\2\3\2\5\2 \n\2\7\2\"\n\2\f\2\16"+
		"\2%\13\2\3\2\5\2(\n\2\3\3\3\3\5\3,\n\3\3\4\3\4\5\4\60\n\4\3\4\3\4\3\5"+
		"\3\5\7\5\66\n\5\f\5\16\59\13\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\7\7B\n\7\f"+
		"\7\16\7E\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\2\2\13\2\4\6"+
		"\b\n\f\16\20\22\2\3\4\2\3\3\7\7\2Q\2\'\3\2\2\2\4+\3\2\2\2\6-\3\2\2\2\b"+
		"\63\3\2\2\2\n<\3\2\2\2\f?\3\2\2\2\16H\3\2\2\2\20L\3\2\2\2\22N\3\2\2\2"+
		"\24\26\5\20\t\2\25\24\3\2\2\2\25\26\3\2\2\2\26\27\3\2\2\2\27\31\5\4\3"+
		"\2\30\25\3\2\2\2\31\34\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33(\3\2\2\2"+
		"\34\32\3\2\2\2\35\37\5\4\3\2\36 \5\20\t\2\37\36\3\2\2\2\37 \3\2\2\2 \""+
		"\3\2\2\2!\35\3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$(\3\2\2\2%#\3\2\2"+
		"\2&(\5\4\3\2\'\32\3\2\2\2\'#\3\2\2\2\'&\3\2\2\2(\3\3\2\2\2),\5\6\4\2*"+
		",\5\f\7\2+)\3\2\2\2+*\3\2\2\2,\5\3\2\2\2-/\5\b\5\2.\60\5\22\n\2/.\3\2"+
		"\2\2/\60\3\2\2\2\60\61\3\2\2\2\61\62\5\n\6\2\62\7\3\2\2\2\63\67\7\5\2"+
		"\2\64\66\5\16\b\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\2"+
		"8:\3\2\2\29\67\3\2\2\2:;\7\b\2\2;\t\3\2\2\2<=\7\6\2\2=>\7\b\2\2>\13\3"+
		"\2\2\2?C\7\4\2\2@B\5\16\b\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF"+
		"\3\2\2\2EC\3\2\2\2FG\7\t\2\2G\r\3\2\2\2HI\7\r\2\2IJ\7\13\2\2JK\7\f\2\2"+
		"K\17\3\2\2\2LM\t\2\2\2M\21\3\2\2\2NO\t\2\2\2O\23\3\2\2\2\13\25\32\37#"+
		"\'+/\67C";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}