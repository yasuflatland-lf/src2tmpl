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
		SEA_WS=1, RootDecl=2, SyncDecl=3, SyncDeclClose=4, TEXT=5, CLOSE=6, SLASH_CLOSE=7, 
		SLASH=8, EQUALS=9, STRING=10, Name=11, S=12;
	public static final int
		INSIDE_TAG=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "INSIDE_TAG"
	};

	public static final String[] ruleNames = {
		"SEA_WS", "RootDecl", "SyncDecl", "SyncDeclClose", "TEXT", "CLOSE", "SLASH_CLOSE", 
		"SLASH", "EQUALS", "STRING", "Name", "S", "HEXDIGIT", "DIGIT", "NameChar", 
		"NameStartChar"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16\u009e\b\1\b\1"+
		"\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t"+
		"\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3"+
		"\2\3\2\5\2\'\n\2\3\2\6\2*\n\2\r\2\16\2+\3\3\3\3\5\3\60\n\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\5\4@\n\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5R\n\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\6\6a\n\6\r\6\16\6b\3\6\5\6f\n"+
		"\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\7\13"+
		"w\n\13\f\13\16\13z\13\13\3\13\3\13\3\13\7\13\177\n\13\f\13\16\13\u0082"+
		"\13\13\3\13\5\13\u0085\n\13\3\f\3\f\7\f\u0089\n\f\f\f\16\f\u008c\13\f"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u009a\n"+
		"\20\3\21\5\21\u009d\n\21\2\2\22\4\3\6\4\b\5\n\6\f\7\16\b\20\t\22\n\24"+
		"\13\26\f\30\r\32\16\34\2\36\2 \2\"\2\4\2\3\f\4\2\13\13\"\"\3\2>>\4\2$"+
		"$>>\4\2))>>\5\2\13\f\17\17\"\"\5\2\62;CHch\3\2\62;\4\2/\60aa\5\2\u00b9"+
		"\u00b9\u0302\u0371\u2041\u2042\n\2<<C\\c|\u2072\u2191\u2c02\u2ff1\u3003"+
		"\ud801\uf902\ufdd1\ufdf2\uffff\2\u00a7\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2"+
		"\2\2\2\n\3\2\2\2\2\f\3\2\2\2\3\16\3\2\2\2\3\20\3\2\2\2\3\22\3\2\2\2\3"+
		"\24\3\2\2\2\3\26\3\2\2\2\3\30\3\2\2\2\3\32\3\2\2\2\4)\3\2\2\2\6-\3\2\2"+
		"\2\b=\3\2\2\2\nM\3\2\2\2\fe\3\2\2\2\16g\3\2\2\2\20k\3\2\2\2\22p\3\2\2"+
		"\2\24r\3\2\2\2\26\u0084\3\2\2\2\30\u0086\3\2\2\2\32\u008d\3\2\2\2\34\u0091"+
		"\3\2\2\2\36\u0093\3\2\2\2 \u0099\3\2\2\2\"\u009c\3\2\2\2$*\t\2\2\2%\'"+
		"\7\17\2\2&%\3\2\2\2&\'\3\2\2\2\'(\3\2\2\2(*\7\f\2\2)$\3\2\2\2)&\3\2\2"+
		"\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\5\3\2\2\2-/\7>\2\2.\60\5\32\r\2/.\3"+
		"\2\2\2/\60\3\2\2\2\60\61\3\2\2\2\61\62\7f\2\2\62\63\7o\2\2\63\64\7u\2"+
		"\2\64\65\7e\2\2\65\66\7<\2\2\66\67\7t\2\2\678\7q\2\289\7q\2\29:\7v\2\2"+
		":;\3\2\2\2;<\b\3\2\2<\7\3\2\2\2=?\7>\2\2>@\5\32\r\2?>\3\2\2\2?@\3\2\2"+
		"\2@A\3\2\2\2AB\7f\2\2BC\7o\2\2CD\7u\2\2DE\7e\2\2EF\7<\2\2FG\7u\2\2GH\7"+
		"{\2\2HI\7p\2\2IJ\7e\2\2JK\3\2\2\2KL\b\4\2\2L\t\3\2\2\2MN\7>\2\2NO\7\61"+
		"\2\2OQ\3\2\2\2PR\5\32\r\2QP\3\2\2\2QR\3\2\2\2RS\3\2\2\2ST\7f\2\2TU\7o"+
		"\2\2UV\7u\2\2VW\7e\2\2WX\7<\2\2XY\7u\2\2YZ\7{\2\2Z[\7p\2\2[\\\7e\2\2\\"+
		"]\3\2\2\2]^\b\5\2\2^\13\3\2\2\2_a\n\3\2\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2"+
		"\2bc\3\2\2\2cf\3\2\2\2df\7>\2\2e`\3\2\2\2ed\3\2\2\2f\r\3\2\2\2gh\7@\2"+
		"\2hi\3\2\2\2ij\b\7\3\2j\17\3\2\2\2kl\7\61\2\2lm\7@\2\2mn\3\2\2\2no\b\b"+
		"\3\2o\21\3\2\2\2pq\7\61\2\2q\23\3\2\2\2rs\7?\2\2s\25\3\2\2\2tx\7$\2\2"+
		"uw\n\4\2\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2"+
		"{\u0085\7$\2\2|\u0080\7)\2\2}\177\n\5\2\2~}\3\2\2\2\177\u0082\3\2\2\2"+
		"\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3"+
		"\2\2\2\u0083\u0085\7)\2\2\u0084t\3\2\2\2\u0084|\3\2\2\2\u0085\27\3\2\2"+
		"\2\u0086\u008a\5\"\21\2\u0087\u0089\5 \20\2\u0088\u0087\3\2\2\2\u0089"+
		"\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\31\3\2\2"+
		"\2\u008c\u008a\3\2\2\2\u008d\u008e\t\6\2\2\u008e\u008f\3\2\2\2\u008f\u0090"+
		"\b\r\4\2\u0090\33\3\2\2\2\u0091\u0092\t\7\2\2\u0092\35\3\2\2\2\u0093\u0094"+
		"\t\b\2\2\u0094\37\3\2\2\2\u0095\u009a\5\"\21\2\u0096\u009a\t\t\2\2\u0097"+
		"\u009a\5\36\17\2\u0098\u009a\t\n\2\2\u0099\u0095\3\2\2\2\u0099\u0096\3"+
		"\2\2\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a!\3\2\2\2\u009b\u009d"+
		"\t\13\2\2\u009c\u009b\3\2\2\2\u009d#\3\2\2\2\22\2\3&)+/?Qbex\u0080\u0084"+
		"\u008a\u0099\u009c\5\7\3\2\6\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}