// Generated from test.g4 by ANTLR 4.7.1
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class testLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, FUNCTION=2, INTEGER=3, LONG=4, SHORT=5, REAL=6, BEGIN=7, END=8, 
		VAR=9, READ=10, WRITE=11, WRITELN=12, COLON=13, SEMICOLON=14, COMMA=15, 
		LPAR=16, RPAR=17, PLUS=18, MINUS=19, DIV=20, MUL=21, EQ=22, STRING=23, 
		NUMBER=24, NAME=25, WS=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "FUNCTION", "INTEGER", "LONG", "SHORT", "REAL", "BEGIN", "END", 
		"VAR", "READ", "WRITE", "WRITELN", "COLON", "SEMICOLON", "COMMA", "LPAR", 
		"RPAR", "AP", "PLUS", "MINUS", "DIV", "MUL", "EQ", "STRING", "NUMBER", 
		"NAME", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "'function'", "'integer'", "'longint'", "'shortint'", "'real'", 
		"'begin'", "'end'", "'var'", "'read'", "'write'", "'writeln'", "':'", 
		"';'", "','", "'('", "')'", "'+'", "'-'", "'/'", "'*'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "FUNCTION", "INTEGER", "LONG", "SHORT", "REAL", "BEGIN", "END", 
		"VAR", "READ", "WRITE", "WRITELN", "COLON", "SEMICOLON", "COMMA", "LPAR", 
		"RPAR", "PLUS", "MINUS", "DIV", "MUL", "EQ", "STRING", "NUMBER", "NAME", 
		"WS"
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


	public testLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "test.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u00bf\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\7\31\u009c\n\31\f\31\16\31\u009f\13"+
		"\31\3\31\3\31\3\32\3\32\7\32\u00a5\n\32\f\32\16\32\u00a8\13\32\3\32\3"+
		"\32\6\32\u00ac\n\32\r\32\16\32\u00ad\5\32\u00b0\n\32\3\33\3\33\7\33\u00b4"+
		"\n\33\f\33\16\33\u00b7\13\33\3\34\6\34\u00ba\n\34\r\34\16\34\u00bb\3\34"+
		"\3\34\2\2\35\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\2\'\24)\25+\26-\27/\30\61\31\63\32\65\33\67"+
		"\34\3\2\b\b\2\"\"*;??C\\aac|\3\2\63;\3\2\62;\5\2C\\aac|\6\2\62;C\\aac"+
		"|\5\2\13\f\17\17\"\"\2\u00c3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\39\3\2\2\2\5;\3\2\2\2\7D\3\2\2\2\tL\3\2\2\2\13T\3\2\2\2\r]\3\2\2\2\17"+
		"b\3\2\2\2\21h\3\2\2\2\23l\3\2\2\2\25p\3\2\2\2\27u\3\2\2\2\31{\3\2\2\2"+
		"\33\u0083\3\2\2\2\35\u0085\3\2\2\2\37\u0087\3\2\2\2!\u0089\3\2\2\2#\u008b"+
		"\3\2\2\2%\u008d\3\2\2\2\'\u008f\3\2\2\2)\u0091\3\2\2\2+\u0093\3\2\2\2"+
		"-\u0095\3\2\2\2/\u0097\3\2\2\2\61\u0099\3\2\2\2\63\u00a2\3\2\2\2\65\u00b1"+
		"\3\2\2\2\67\u00b9\3\2\2\29:\7\60\2\2:\4\3\2\2\2;<\7h\2\2<=\7w\2\2=>\7"+
		"p\2\2>?\7e\2\2?@\7v\2\2@A\7k\2\2AB\7q\2\2BC\7p\2\2C\6\3\2\2\2DE\7k\2\2"+
		"EF\7p\2\2FG\7v\2\2GH\7g\2\2HI\7i\2\2IJ\7g\2\2JK\7t\2\2K\b\3\2\2\2LM\7"+
		"n\2\2MN\7q\2\2NO\7p\2\2OP\7i\2\2PQ\7k\2\2QR\7p\2\2RS\7v\2\2S\n\3\2\2\2"+
		"TU\7u\2\2UV\7j\2\2VW\7q\2\2WX\7t\2\2XY\7v\2\2YZ\7k\2\2Z[\7p\2\2[\\\7v"+
		"\2\2\\\f\3\2\2\2]^\7t\2\2^_\7g\2\2_`\7c\2\2`a\7n\2\2a\16\3\2\2\2bc\7d"+
		"\2\2cd\7g\2\2de\7i\2\2ef\7k\2\2fg\7p\2\2g\20\3\2\2\2hi\7g\2\2ij\7p\2\2"+
		"jk\7f\2\2k\22\3\2\2\2lm\7x\2\2mn\7c\2\2no\7t\2\2o\24\3\2\2\2pq\7t\2\2"+
		"qr\7g\2\2rs\7c\2\2st\7f\2\2t\26\3\2\2\2uv\7y\2\2vw\7t\2\2wx\7k\2\2xy\7"+
		"v\2\2yz\7g\2\2z\30\3\2\2\2{|\7y\2\2|}\7t\2\2}~\7k\2\2~\177\7v\2\2\177"+
		"\u0080\7g\2\2\u0080\u0081\7n\2\2\u0081\u0082\7p\2\2\u0082\32\3\2\2\2\u0083"+
		"\u0084\7<\2\2\u0084\34\3\2\2\2\u0085\u0086\7=\2\2\u0086\36\3\2\2\2\u0087"+
		"\u0088\7.\2\2\u0088 \3\2\2\2\u0089\u008a\7*\2\2\u008a\"\3\2\2\2\u008b"+
		"\u008c\7+\2\2\u008c$\3\2\2\2\u008d\u008e\7)\2\2\u008e&\3\2\2\2\u008f\u0090"+
		"\7-\2\2\u0090(\3\2\2\2\u0091\u0092\7/\2\2\u0092*\3\2\2\2\u0093\u0094\7"+
		"\61\2\2\u0094,\3\2\2\2\u0095\u0096\7,\2\2\u0096.\3\2\2\2\u0097\u0098\7"+
		"?\2\2\u0098\60\3\2\2\2\u0099\u009d\5%\23\2\u009a\u009c\t\2\2\2\u009b\u009a"+
		"\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\5%\23\2\u00a1\62\3\2\2"+
		"\2\u00a2\u00a6\t\3\2\2\u00a3\u00a5\t\4\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8"+
		"\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00af\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a9\u00ab\7\60\2\2\u00aa\u00ac\t\4\2\2\u00ab\u00aa\3"+
		"\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00b0\3\2\2\2\u00af\u00a9\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\64\3\2\2"+
		"\2\u00b1\u00b5\t\5\2\2\u00b2\u00b4\t\6\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b7"+
		"\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\66\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b8\u00ba\t\7\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2"+
		"\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00be\b\34\2\2\u00be8\3\2\2\2\t\2\u009d\u00a6\u00ad\u00af\u00b5\u00bb"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}