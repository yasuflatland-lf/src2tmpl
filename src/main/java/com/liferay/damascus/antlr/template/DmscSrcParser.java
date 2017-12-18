// Generated from com/liferay/damascus/antlr/template/DmscSrcParser.g4 by ANTLR 4.7.1
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
		OPEN_TAG_ROOT=1, OPEN_TAG_SYNC=2, TEXT=3, WS=4, CLOSE_TAG_SYNC=5, SYNC_TEXT=6, 
		CLOSE_TAG_ROOT=7, CLOSE_TAG=8, TAG_EQUALS=9, TAG_NAME=10, ATTVALUE_VALUE=11, 
		ATTRIBUTE=12;
	public static final int
		RULE_file = 0, RULE_rootElement = 1, RULE_syncElement = 2, RULE_htmlAttribute = 3, 
		RULE_htmlAttributeName = 4, RULE_htmlAttributeValue = 5;
	public static final String[] ruleNames = {
		"file", "rootElement", "syncElement", "htmlAttribute", "htmlAttributeName", 
		"htmlAttributeValue"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "OPEN_TAG_ROOT", "OPEN_TAG_SYNC", "TEXT", "WS", "CLOSE_TAG_SYNC", 
		"SYNC_TEXT", "CLOSE_TAG_ROOT", "CLOSE_TAG", "TAG_EQUALS", "TAG_NAME", 
		"ATTVALUE_VALUE", "ATTRIBUTE"
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
		public SyncElementContext syncElement() {
			return getRuleContext(SyncElementContext.class,0);
		}
		public RootElementContext rootElement() {
			return getRuleContext(RootElementContext.class,0);
		}
		public List<TerminalNode> TEXT() { return getTokens(DmscSrcParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(DmscSrcParser.TEXT, i);
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
			setState(20);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_TAG_SYNC:
				enterOuterAlt(_localctx, 1);
				{
				setState(12);
				syncElement();
				}
				break;
			case OPEN_TAG_ROOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(13);
				rootElement();
				}
				break;
			case EOF:
			case TEXT:
				enterOuterAlt(_localctx, 3);
				{
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TEXT) {
					{
					{
					setState(14);
					match(TEXT);
					}
					}
					setState(19);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class RootElementContext extends ParserRuleContext {
		public TerminalNode OPEN_TAG_ROOT() { return getToken(DmscSrcParser.OPEN_TAG_ROOT, 0); }
		public TerminalNode CLOSE_TAG_ROOT() { return getToken(DmscSrcParser.CLOSE_TAG_ROOT, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public RootElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rootElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmscSrcParserListener ) ((DmscSrcParserListener)listener).enterRootElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmscSrcParserListener ) ((DmscSrcParserListener)listener).exitRootElement(this);
		}
	}

	public final RootElementContext rootElement() throws RecognitionException {
		RootElementContext _localctx = new RootElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_rootElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(OPEN_TAG_ROOT);
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAG_NAME) {
				{
				{
				setState(23);
				htmlAttribute();
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29);
			match(CLOSE_TAG_ROOT);
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

	public static class SyncElementContext extends ParserRuleContext {
		public TerminalNode OPEN_TAG_SYNC() { return getToken(DmscSrcParser.OPEN_TAG_SYNC, 0); }
		public TerminalNode CLOSE_TAG() { return getToken(DmscSrcParser.CLOSE_TAG, 0); }
		public TerminalNode CLOSE_TAG_SYNC() { return getToken(DmscSrcParser.CLOSE_TAG_SYNC, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public List<TerminalNode> SYNC_TEXT() { return getTokens(DmscSrcParser.SYNC_TEXT); }
		public TerminalNode SYNC_TEXT(int i) {
			return getToken(DmscSrcParser.SYNC_TEXT, i);
		}
		public SyncElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syncElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmscSrcParserListener ) ((DmscSrcParserListener)listener).enterSyncElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmscSrcParserListener ) ((DmscSrcParserListener)listener).exitSyncElement(this);
		}
	}

	public final SyncElementContext syncElement() throws RecognitionException {
		SyncElementContext _localctx = new SyncElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_syncElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(OPEN_TAG_SYNC);
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAG_NAME) {
				{
				{
				setState(32);
				htmlAttribute();
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
			match(CLOSE_TAG);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SYNC_TEXT) {
				{
				{
				setState(39);
				match(SYNC_TEXT);
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45);
			match(CLOSE_TAG_SYNC);
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

	public static class HtmlAttributeContext extends ParserRuleContext {
		public HtmlAttributeNameContext htmlAttributeName() {
			return getRuleContext(HtmlAttributeNameContext.class,0);
		}
		public TerminalNode TAG_EQUALS() { return getToken(DmscSrcParser.TAG_EQUALS, 0); }
		public HtmlAttributeValueContext htmlAttributeValue() {
			return getRuleContext(HtmlAttributeValueContext.class,0);
		}
		public HtmlAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmscSrcParserListener ) ((DmscSrcParserListener)listener).enterHtmlAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmscSrcParserListener ) ((DmscSrcParserListener)listener).exitHtmlAttribute(this);
		}
	}

	public final HtmlAttributeContext htmlAttribute() throws RecognitionException {
		HtmlAttributeContext _localctx = new HtmlAttributeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_htmlAttribute);
		try {
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				htmlAttributeName();
				setState(48);
				match(TAG_EQUALS);
				setState(49);
				htmlAttributeValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				htmlAttributeName();
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

	public static class HtmlAttributeNameContext extends ParserRuleContext {
		public TerminalNode TAG_NAME() { return getToken(DmscSrcParser.TAG_NAME, 0); }
		public HtmlAttributeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttributeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmscSrcParserListener ) ((DmscSrcParserListener)listener).enterHtmlAttributeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmscSrcParserListener ) ((DmscSrcParserListener)listener).exitHtmlAttributeName(this);
		}
	}

	public final HtmlAttributeNameContext htmlAttributeName() throws RecognitionException {
		HtmlAttributeNameContext _localctx = new HtmlAttributeNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_htmlAttributeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(TAG_NAME);
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

	public static class HtmlAttributeValueContext extends ParserRuleContext {
		public TerminalNode ATTVALUE_VALUE() { return getToken(DmscSrcParser.ATTVALUE_VALUE, 0); }
		public HtmlAttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttributeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmscSrcParserListener ) ((DmscSrcParserListener)listener).enterHtmlAttributeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmscSrcParserListener ) ((DmscSrcParserListener)listener).exitHtmlAttributeValue(this);
		}
	}

	public final HtmlAttributeValueContext htmlAttributeValue() throws RecognitionException {
		HtmlAttributeValueContext _localctx = new HtmlAttributeValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_htmlAttributeValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(ATTVALUE_VALUE);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16=\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\7\2\22\n\2\f\2\16\2\25"+
		"\13\2\5\2\27\n\2\3\3\3\3\7\3\33\n\3\f\3\16\3\36\13\3\3\3\3\3\3\4\3\4\7"+
		"\4$\n\4\f\4\16\4\'\13\4\3\4\3\4\7\4+\n\4\f\4\16\4.\13\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\5\5\67\n\5\3\6\3\6\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\2\2"+
		"=\2\26\3\2\2\2\4\30\3\2\2\2\6!\3\2\2\2\b\66\3\2\2\2\n8\3\2\2\2\f:\3\2"+
		"\2\2\16\27\5\6\4\2\17\27\5\4\3\2\20\22\7\5\2\2\21\20\3\2\2\2\22\25\3\2"+
		"\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\27\3\2\2\2\25\23\3\2\2\2\26\16\3\2"+
		"\2\2\26\17\3\2\2\2\26\23\3\2\2\2\27\3\3\2\2\2\30\34\7\3\2\2\31\33\5\b"+
		"\5\2\32\31\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\37\3\2"+
		"\2\2\36\34\3\2\2\2\37 \7\t\2\2 \5\3\2\2\2!%\7\4\2\2\"$\5\b\5\2#\"\3\2"+
		"\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&(\3\2\2\2\'%\3\2\2\2(,\7\n\2\2)+\7"+
		"\b\2\2*)\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-/\3\2\2\2.,\3\2\2\2/\60"+
		"\7\7\2\2\60\7\3\2\2\2\61\62\5\n\6\2\62\63\7\13\2\2\63\64\5\f\7\2\64\67"+
		"\3\2\2\2\65\67\5\n\6\2\66\61\3\2\2\2\66\65\3\2\2\2\67\t\3\2\2\289\7\f"+
		"\2\29\13\3\2\2\2:;\7\r\2\2;\r\3\2\2\2\b\23\26\34%,\66";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}