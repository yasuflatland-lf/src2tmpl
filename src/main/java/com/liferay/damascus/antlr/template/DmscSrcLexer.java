// Generated from DmscSrcLexer.g4 by ANTLR 4.7.1
package com.liferay.damascus.antlr.template;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DmscSrcLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEA_WS=1, OPEN=2, OPEN_SLASH=3, RootDecl=4, SyncDecl=5, SyncDeclClose=6, 
		TEXT=7, CLOSE=8, SLASH_CLOSE=9, SLASH=10, EQUALS=11, STRING=12, Name=13, 
		S=14;
	public static final int
		INSIDE_TAG=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "INSIDE_TAG"
	};

	public static final String[] ruleNames = {
		"SEA_WS", "OPEN", "OPEN_SLASH", "RootDecl", "SyncDecl", "SyncDeclClose", 
		"TEXT", "CLOSE", "SLASH_CLOSE", "SLASH", "EQUALS", "STRING", "Name", "S", 
		"HEXDIGIT", "DIGIT", "NameChar", "NameStartChar"
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


	public DmscSrcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DmscSrcLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20\u009d\b\1\b\1"+
		"\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t"+
		"\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"+
		"\22\t\22\4\23\t\23\3\2\3\2\5\2+\n\2\3\2\6\2.\n\2\r\2\16\2/\3\3\3\3\5\3"+
		"\64\n\3\3\4\3\4\3\4\5\49\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\6\bc\n\b\r\b\16\bd\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\7\rv\n\r"+
		"\f\r\16\ry\13\r\3\r\3\r\3\r\7\r~\n\r\f\r\16\r\u0081\13\r\3\r\5\r\u0084"+
		"\n\r\3\16\3\16\7\16\u0088\n\16\f\16\16\16\u008b\13\16\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\5\22\u0099\n\22\3\23\5\23"+
		"\u009c\n\23\2\2\24\4\3\6\4\b\5\n\6\f\7\16\b\20\t\22\n\24\13\26\f\30\r"+
		"\32\16\34\17\36\20 \2\"\2$\2&\2\4\2\3\f\4\2\13\13\"\"\3\2>>\4\2$$>>\4"+
		"\2))>>\5\2\13\f\17\17\"\"\5\2\62;CHch\3\2\62;\4\2/\60aa\5\2\u00b9\u00b9"+
		"\u0302\u0371\u2041\u2042\n\2<<C\\c|\u2072\u2191\u2c02\u2ff1\u3003\ud801"+
		"\uf902\ufdd1\ufdf2\uffff\2\u00a4\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2\2\2\2"+
		"\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\3\22\3\2\2\2\3\24\3\2"+
		"\2\2\3\26\3\2\2\2\3\30\3\2\2\2\3\32\3\2\2\2\3\34\3\2\2\2\3\36\3\2\2\2"+
		"\4-\3\2\2\2\6\61\3\2\2\2\b\65\3\2\2\2\n:\3\2\2\2\fG\3\2\2\2\16T\3\2\2"+
		"\2\20b\3\2\2\2\22f\3\2\2\2\24j\3\2\2\2\26o\3\2\2\2\30q\3\2\2\2\32\u0083"+
		"\3\2\2\2\34\u0085\3\2\2\2\36\u008c\3\2\2\2 \u0090\3\2\2\2\"\u0092\3\2"+
		"\2\2$\u0098\3\2\2\2&\u009b\3\2\2\2(.\t\2\2\2)+\7\17\2\2*)\3\2\2\2*+\3"+
		"\2\2\2+,\3\2\2\2,.\7\f\2\2-(\3\2\2\2-*\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60"+
		"\3\2\2\2\60\5\3\2\2\2\61\63\7>\2\2\62\64\5\36\17\2\63\62\3\2\2\2\63\64"+
		"\3\2\2\2\64\7\3\2\2\2\65\66\7>\2\2\668\7\61\2\2\679\5\36\17\28\67\3\2"+
		"\2\289\3\2\2\29\t\3\2\2\2:;\5\6\3\2;<\7f\2\2<=\7o\2\2=>\7u\2\2>?\7e\2"+
		"\2?@\7<\2\2@A\7t\2\2AB\7q\2\2BC\7q\2\2CD\7v\2\2DE\3\2\2\2EF\b\5\2\2F\13"+
		"\3\2\2\2GH\5\6\3\2HI\7f\2\2IJ\7o\2\2JK\7u\2\2KL\7e\2\2LM\7<\2\2MN\7u\2"+
		"\2NO\7{\2\2OP\7p\2\2PQ\7e\2\2QR\3\2\2\2RS\b\6\2\2S\r\3\2\2\2TU\5\b\4\2"+
		"UV\7f\2\2VW\7o\2\2WX\7u\2\2XY\7e\2\2YZ\7<\2\2Z[\7u\2\2[\\\7{\2\2\\]\7"+
		"p\2\2]^\7e\2\2^_\3\2\2\2_`\b\7\2\2`\17\3\2\2\2ac\n\3\2\2ba\3\2\2\2cd\3"+
		"\2\2\2db\3\2\2\2de\3\2\2\2e\21\3\2\2\2fg\7@\2\2gh\3\2\2\2hi\b\t\3\2i\23"+
		"\3\2\2\2jk\7\61\2\2kl\7@\2\2lm\3\2\2\2mn\b\n\3\2n\25\3\2\2\2op\7\61\2"+
		"\2p\27\3\2\2\2qr\7?\2\2r\31\3\2\2\2sw\7$\2\2tv\n\4\2\2ut\3\2\2\2vy\3\2"+
		"\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2\2\2z\u0084\7$\2\2{\177\7)\2\2"+
		"|~\n\5\2\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082\u0084\7)\2\2\u0083s\3\2\2\2\u0083"+
		"{\3\2\2\2\u0084\33\3\2\2\2\u0085\u0089\5&\23\2\u0086\u0088\5$\22\2\u0087"+
		"\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2"+
		"\2\2\u008a\35\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\t\6\2\2\u008d\u008e"+
		"\3\2\2\2\u008e\u008f\b\17\4\2\u008f\37\3\2\2\2\u0090\u0091\t\7\2\2\u0091"+
		"!\3\2\2\2\u0092\u0093\t\b\2\2\u0093#\3\2\2\2\u0094\u0099\5&\23\2\u0095"+
		"\u0099\t\t\2\2\u0096\u0099\5\"\21\2\u0097\u0099\t\n\2\2\u0098\u0094\3"+
		"\2\2\2\u0098\u0095\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0097\3\2\2\2\u0099"+
		"%\3\2\2\2\u009a\u009c\t\13\2\2\u009b\u009a\3\2\2\2\u009c\'\3\2\2\2\20"+
		"\2\3*-/\638dw\177\u0083\u0089\u0098\u009b\5\7\3\2\6\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}