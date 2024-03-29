// Generated from Sauro.g by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SauroLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OP_CUR=1, CL_CUR=2, EQ=3, NE=4, GT=5, GE=6, LT=7, LE=8, PLUS=9, MINUS=10, 
		TIMES=11, OVER=12, REMAINDER=13, OP_PAR=14, CL_PAR=15, ATTRIB=16, COMMA=17, 
		COLON=18, DOT=19, OP_BRA=20, CL_BRA=21, IF=22, PRINT=23, READ_INT=24, 
		READ_STR=25, INT=26, RETURN=27, STRING=28, WHILE=29, LEN=30, STR=31, LIST=32, 
		APPEND=33, DEF=34, NUMBER=35, VAR=36, NL=37, COMMENT=38, SPACE=39;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"OP_CUR", "CL_CUR", "EQ", "NE", "GT", "GE", "LT", "LE", "PLUS", "MINUS", 
			"TIMES", "OVER", "REMAINDER", "OP_PAR", "CL_PAR", "ATTRIB", "COMMA", 
			"COLON", "DOT", "OP_BRA", "CL_BRA", "IF", "PRINT", "READ_INT", "READ_STR", 
			"INT", "RETURN", "STRING", "WHILE", "LEN", "STR", "LIST", "APPEND", "DEF", 
			"NUMBER", "VAR", "NL", "COMMENT", "SPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'('", "')'", "'='", "','", "':'", "'.'", 
			"'['", "']'", "'if'", "'print'", "'read_int'", "'read_str'", "'int'", 
			"'return'", null, "'while'", "'len'", "'str'", "'list'", "'append'", 
			"'def'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OP_CUR", "CL_CUR", "EQ", "NE", "GT", "GE", "LT", "LE", "PLUS", 
			"MINUS", "TIMES", "OVER", "REMAINDER", "OP_PAR", "CL_PAR", "ATTRIB", 
			"COMMA", "COLON", "DOT", "OP_BRA", "CL_BRA", "IF", "PRINT", "READ_INT", 
			"READ_STR", "INT", "RETURN", "STRING", "WHILE", "LEN", "STR", "LIST", 
			"APPEND", "DEF", "NUMBER", "VAR", "NL", "COMMENT", "SPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	    private DenterHelper denter = new DenterHelper(NL, SauroParser.INDENT,
	                                                   SauroParser.DEDENT) {
	        @Override
	        public Token pullToken() {
	            return SauroLexer.super.nextToken();
	        }
	    };

	    @Override
	    public Token nextToken() {
	        return denter.nextToken();
	    }


	public SauroLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Sauro.g"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 37:
			COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 38:
			SPACE_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}
	private void SPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			 skip(); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2)\u00f0\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\7\35\u00a8\n\35\f\35\16\35\u00ab\13"+
		"\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 "+
		"\3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\6$\u00ce"+
		"\n$\r$\16$\u00cf\3%\6%\u00d3\n%\r%\16%\u00d4\3&\5&\u00d8\n&\3&\3&\7&\u00dc"+
		"\n&\f&\16&\u00df\13&\3\'\3\'\7\'\u00e3\n\'\f\'\16\'\u00e6\13\'\3\'\3\'"+
		"\3(\6(\u00eb\n(\r(\16(\u00ec\3(\3(\2\2)\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)\3\2\5\3"+
		"\2$$\4\2\f\f\17\17\4\2\13\13\"\"\2\u00f6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\3Q\3\2\2\2\5S\3\2\2\2\7U\3\2\2\2\tX\3\2\2\2\13[\3\2"+
		"\2\2\r]\3\2\2\2\17`\3\2\2\2\21b\3\2\2\2\23e\3\2\2\2\25g\3\2\2\2\27i\3"+
		"\2\2\2\31k\3\2\2\2\33m\3\2\2\2\35o\3\2\2\2\37q\3\2\2\2!s\3\2\2\2#u\3\2"+
		"\2\2%w\3\2\2\2\'y\3\2\2\2){\3\2\2\2+}\3\2\2\2-\177\3\2\2\2/\u0082\3\2"+
		"\2\2\61\u0088\3\2\2\2\63\u0091\3\2\2\2\65\u009a\3\2\2\2\67\u009e\3\2\2"+
		"\29\u00a5\3\2\2\2;\u00ae\3\2\2\2=\u00b4\3\2\2\2?\u00b8\3\2\2\2A\u00bc"+
		"\3\2\2\2C\u00c1\3\2\2\2E\u00c8\3\2\2\2G\u00cd\3\2\2\2I\u00d2\3\2\2\2K"+
		"\u00d7\3\2\2\2M\u00e0\3\2\2\2O\u00ea\3\2\2\2QR\7}\2\2R\4\3\2\2\2ST\7\177"+
		"\2\2T\6\3\2\2\2UV\7?\2\2VW\7?\2\2W\b\3\2\2\2XY\7#\2\2YZ\7?\2\2Z\n\3\2"+
		"\2\2[\\\7@\2\2\\\f\3\2\2\2]^\7@\2\2^_\7?\2\2_\16\3\2\2\2`a\7>\2\2a\20"+
		"\3\2\2\2bc\7>\2\2cd\7?\2\2d\22\3\2\2\2ef\7-\2\2f\24\3\2\2\2gh\7/\2\2h"+
		"\26\3\2\2\2ij\7,\2\2j\30\3\2\2\2kl\7\61\2\2l\32\3\2\2\2mn\7\'\2\2n\34"+
		"\3\2\2\2op\7*\2\2p\36\3\2\2\2qr\7+\2\2r \3\2\2\2st\7?\2\2t\"\3\2\2\2u"+
		"v\7.\2\2v$\3\2\2\2wx\7<\2\2x&\3\2\2\2yz\7\60\2\2z(\3\2\2\2{|\7]\2\2|*"+
		"\3\2\2\2}~\7_\2\2~,\3\2\2\2\177\u0080\7k\2\2\u0080\u0081\7h\2\2\u0081"+
		".\3\2\2\2\u0082\u0083\7r\2\2\u0083\u0084\7t\2\2\u0084\u0085\7k\2\2\u0085"+
		"\u0086\7p\2\2\u0086\u0087\7v\2\2\u0087\60\3\2\2\2\u0088\u0089\7t\2\2\u0089"+
		"\u008a\7g\2\2\u008a\u008b\7c\2\2\u008b\u008c\7f\2\2\u008c\u008d\7a\2\2"+
		"\u008d\u008e\7k\2\2\u008e\u008f\7p\2\2\u008f\u0090\7v\2\2\u0090\62\3\2"+
		"\2\2\u0091\u0092\7t\2\2\u0092\u0093\7g\2\2\u0093\u0094\7c\2\2\u0094\u0095"+
		"\7f\2\2\u0095\u0096\7a\2\2\u0096\u0097\7u\2\2\u0097\u0098\7v\2\2\u0098"+
		"\u0099\7t\2\2\u0099\64\3\2\2\2\u009a\u009b\7k\2\2\u009b\u009c\7p\2\2\u009c"+
		"\u009d\7v\2\2\u009d\66\3\2\2\2\u009e\u009f\7t\2\2\u009f\u00a0\7g\2\2\u00a0"+
		"\u00a1\7v\2\2\u00a1\u00a2\7w\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4\7p\2\2"+
		"\u00a48\3\2\2\2\u00a5\u00a9\7$\2\2\u00a6\u00a8\n\2\2\2\u00a7\u00a6\3\2"+
		"\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\7$\2\2\u00ad:\3\2\2\2\u00ae"+
		"\u00af\7y\2\2\u00af\u00b0\7j\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2\7n\2\2"+
		"\u00b2\u00b3\7g\2\2\u00b3<\3\2\2\2\u00b4\u00b5\7n\2\2\u00b5\u00b6\7g\2"+
		"\2\u00b6\u00b7\7p\2\2\u00b7>\3\2\2\2\u00b8\u00b9\7u\2\2\u00b9\u00ba\7"+
		"v\2\2\u00ba\u00bb\7t\2\2\u00bb@\3\2\2\2\u00bc\u00bd\7n\2\2\u00bd\u00be"+
		"\7k\2\2\u00be\u00bf\7u\2\2\u00bf\u00c0\7v\2\2\u00c0B\3\2\2\2\u00c1\u00c2"+
		"\7c\2\2\u00c2\u00c3\7r\2\2\u00c3\u00c4\7r\2\2\u00c4\u00c5\7g\2\2\u00c5"+
		"\u00c6\7p\2\2\u00c6\u00c7\7f\2\2\u00c7D\3\2\2\2\u00c8\u00c9\7f\2\2\u00c9"+
		"\u00ca\7g\2\2\u00ca\u00cb\7h\2\2\u00cbF\3\2\2\2\u00cc\u00ce\4\62;\2\u00cd"+
		"\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0H\3\2\2\2\u00d1\u00d3\4c|\2\u00d2\u00d1\3\2\2\2\u00d3\u00d4"+
		"\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5J\3\2\2\2\u00d6"+
		"\u00d8\7\17\2\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3"+
		"\2\2\2\u00d9\u00dd\7\f\2\2\u00da\u00dc\7\"\2\2\u00db\u00da\3\2\2\2\u00dc"+
		"\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00deL\3\2\2\2"+
		"\u00df\u00dd\3\2\2\2\u00e0\u00e4\7%\2\2\u00e1\u00e3\n\3\2\2\u00e2\u00e1"+
		"\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e7\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8\b\'\2\2\u00e8N\3\2\2\2"+
		"\u00e9\u00eb\t\4\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ea"+
		"\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\b(\3\2\u00ef"+
		"P\3\2\2\2\n\2\u00a9\u00cf\u00d4\u00d7\u00dd\u00e4\u00ec\4\3\'\2\3(\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}