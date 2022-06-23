// Generated from C:/Users/Lenovo/IdeaProjects/untitled/src\task8.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class task8Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Q2=1, Q3=2, Q4=3;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Q2", "Q3", "Q4", "ZERO", "ONE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Q2", "Q3", "Q4"
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


	public task8Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "grammar/task8.g4"; }

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
		"\u0004\u0000\u0003U\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"\u0010\b\u0000\n\u0000\f\u0000\u0013\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001!\b\u0001\n\u0001"+
		"\f\u0001$\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004"+
		"\u0001*\b\u0001\u000b\u0001\f\u0001+\u0001\u0001\u0001\u0001\u0005\u0001"+
		"0\b\u0001\n\u0001\f\u00013\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002>\b\u0002\n\u0002\f\u0002A\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0004\u0002F\b\u0002\u000b\u0002\f\u0002G\u0001\u0002\u0001"+
		"\u0002\u0004\u0002L\b\u0002\u000b\u0002\f\u0002M\u0003\u0002P\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0000\u0000\u0005\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0000\t\u0000\u0001\u0000\u0000_"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0001\u0011\u0001\u0000\u0000\u0000"+
		"\u0003\"\u0001\u0000\u0000\u0000\u0005?\u0001\u0000\u0000\u0000\u0007"+
		"Q\u0001\u0000\u0000\u0000\tS\u0001\u0000\u0000\u0000\u000b\f\u0003\u0007"+
		"\u0003\u0000\f\r\u0003\t\u0004\u0000\r\u0010\u0001\u0000\u0000\u0000\u000e"+
		"\u0010\u0003\t\u0004\u0000\u000f\u000b\u0001\u0000\u0000\u0000\u000f\u000e"+
		"\u0001\u0000\u0000\u0000\u0010\u0013\u0001\u0000\u0000\u0000\u0011\u000f"+
		"\u0001\u0000\u0000\u0000\u0011\u0012\u0001\u0000\u0000\u0000\u0012\u0014"+
		"\u0001\u0000\u0000\u0000\u0013\u0011\u0001\u0000\u0000\u0000\u0014\u0015"+
		"\u0003\u0007\u0003\u0000\u0015\u0016\u0003\u0007\u0003\u0000\u0016\u0002"+
		"\u0001\u0000\u0000\u0000\u0017\u0018\u0003\u0007\u0003\u0000\u0018\u0019"+
		"\u0003\u0007\u0003\u0000\u0019\u001a\u0003\u0007\u0003\u0000\u001a\u001b"+
		"\u0003\u0007\u0003\u0000\u001b!\u0001\u0000\u0000\u0000\u001c\u001d\u0003"+
		"\u0007\u0003\u0000\u001d\u001e\u0003\t\u0004\u0000\u001e!\u0001\u0000"+
		"\u0000\u0000\u001f!\u0003\t\u0004\u0000 \u0017\u0001\u0000\u0000\u0000"+
		" \u001c\u0001\u0000\u0000\u0000 \u001f\u0001\u0000\u0000\u0000!$\u0001"+
		"\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000"+
		"#%\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000%&\u0003\u0007\u0003"+
		"\u0000&\'\u0003\u0007\u0003\u0000\'1\u0003\u0007\u0003\u0000(*\u0003\t"+
		"\u0004\u0000)(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+)\u0001"+
		"\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000"+
		"-.\u0003\u0007\u0003\u0000.0\u0001\u0000\u0000\u0000/)\u0001\u0000\u0000"+
		"\u000003\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000012\u0001\u0000"+
		"\u0000\u00002\u0004\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u0000"+
		"45\u0003\u0007\u0003\u000056\u0003\u0007\u0003\u000067\u0003\u0007\u0003"+
		"\u000078\u0003\u0007\u0003\u00008>\u0001\u0000\u0000\u00009:\u0003\u0007"+
		"\u0003\u0000:;\u0003\t\u0004\u0000;>\u0001\u0000\u0000\u0000<>\u0003\t"+
		"\u0004\u0000=4\u0001\u0000\u0000\u0000=9\u0001\u0000\u0000\u0000=<\u0001"+
		"\u0000\u0000\u0000>A\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000"+
		"?@\u0001\u0000\u0000\u0000@B\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000"+
		"\u0000BC\u0003\u0007\u0003\u0000CO\u0003\u0007\u0003\u0000DF\u0003\t\u0004"+
		"\u0000ED\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GE\u0001\u0000"+
		"\u0000\u0000GH\u0001\u0000\u0000\u0000HP\u0001\u0000\u0000\u0000IK\u0003"+
		"\u0007\u0003\u0000JL\u0003\t\u0004\u0000KJ\u0001\u0000\u0000\u0000LM\u0001"+
		"\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000"+
		"NP\u0001\u0000\u0000\u0000OE\u0001\u0000\u0000\u0000OI\u0001\u0000\u0000"+
		"\u0000P\u0006\u0001\u0000\u0000\u0000QR\u00050\u0000\u0000R\b\u0001\u0000"+
		"\u0000\u0000ST\u00051\u0000\u0000T\n\u0001\u0000\u0000\u0000\f\u0000\u000f"+
		"\u0011 \"+1=?GMO\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}