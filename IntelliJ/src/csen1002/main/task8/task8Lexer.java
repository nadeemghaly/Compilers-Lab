// Generated from C:/Users/Lenovo/IdeaProjects/untitled/grammar\task8.g4 by ANTLR 4.10.1
package csen1002.main.task8;
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
			"Q2", "Q3", "Q4", "ZERO", "ONE", "Q0LOOP", "Q0LOOP1", "Q0LOOP2", "Q0LOOP3", 
			"Q3LOOP"
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
	public String getGrammarFileName() { return "task8.g4"; }

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
		"\u0004\u0000\u0003\u008c\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0005\u0000"+
		"\u0017\b\u0000\n\u0000\f\u0000\u001a\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0005\u0001 \b\u0001\n\u0001\f\u0001#\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0004\u0001\'\b\u0001\u000b\u0001\f\u0001(\u0001\u0001"+
		"\u0001\u0001\u0005\u0001-\b\u0001\n\u0001\f\u00010\t\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0004\u00015\b\u0001\u000b\u0001\f\u00016\u0001"+
		"\u0001\u0001\u0001\u0003\u0001;\b\u0001\u0001\u0001\u0004\u0001>\b\u0001"+
		"\u000b\u0001\f\u0001?\u0001\u0001\u0001\u0001\u0005\u0001D\b\u0001\n\u0001"+
		"\f\u0001G\t\u0001\u0001\u0002\u0005\u0002J\b\u0002\n\u0002\f\u0002M\t"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002R\b\u0002\u000b"+
		"\u0002\f\u0002S\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002Y\b\u0002"+
		"\n\u0002\f\u0002\\\t\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005e\b\u0005\u0001\u0006"+
		"\u0004\u0006h\b\u0006\u000b\u0006\f\u0006i\u0001\u0007\u0001\u0007\u0004"+
		"\u0007n\b\u0007\u000b\u0007\f\u0007o\u0001\b\u0001\b\u0001\b\u0001\b\u0004"+
		"\bv\b\b\u000b\b\f\bw\u0001\b\u0001\b\u0003\b|\b\b\u0001\b\u0005\b\u007f"+
		"\b\b\n\b\f\b\u0082\t\b\u0001\b\u0001\b\u0001\t\u0004\t\u0087\b\t\u000b"+
		"\t\f\t\u0088\u0001\t\u0001\t\u0000\u0000\n\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0000\t\u0000\u000b\u0000\r\u0000\u000f\u0000\u0011\u0000"+
		"\u0013\u0000\u0001\u0000\u0000\u0098\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0001\u0018\u0001\u0000\u0000\u0000\u0003!\u0001\u0000\u0000\u0000\u0005"+
		"K\u0001\u0000\u0000\u0000\u0007]\u0001\u0000\u0000\u0000\t_\u0001\u0000"+
		"\u0000\u0000\u000bd\u0001\u0000\u0000\u0000\rg\u0001\u0000\u0000\u0000"+
		"\u000fk\u0001\u0000\u0000\u0000\u0011q\u0001\u0000\u0000\u0000\u0013\u0086"+
		"\u0001\u0000\u0000\u0000\u0015\u0017\u0003\u000b\u0005\u0000\u0016\u0015"+
		"\u0001\u0000\u0000\u0000\u0017\u001a\u0001\u0000\u0000\u0000\u0018\u0016"+
		"\u0001\u0000\u0000\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u001b"+
		"\u0001\u0000\u0000\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001b\u001c"+
		"\u0003\u0007\u0003\u0000\u001c\u001d\u0003\u0007\u0003\u0000\u001d\u0002"+
		"\u0001\u0000\u0000\u0000\u001e \u0003\u000b\u0005\u0000\u001f\u001e\u0001"+
		"\u0000\u0000\u0000 #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000"+
		"\u0000!\"\u0001\u0000\u0000\u0000\"$\u0001\u0000\u0000\u0000#!\u0001\u0000"+
		"\u0000\u0000$.\u0003\u0007\u0003\u0000%\'\u0003\t\u0004\u0000&%\u0001"+
		"\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000"+
		"()\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*+\u0003\u0007\u0003"+
		"\u0000+-\u0001\u0000\u0000\u0000,&\u0001\u0000\u0000\u0000-0\u0001\u0000"+
		"\u0000\u0000.,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/1\u0001"+
		"\u0000\u0000\u00000.\u0001\u0000\u0000\u00001:\u0003\u0007\u0003\u0000"+
		"2;\u0003\u0007\u0003\u000035\u0003\t\u0004\u000043\u0001\u0000\u0000\u0000"+
		"56\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000"+
		"\u000078\u0001\u0000\u0000\u000089\u0003\u0007\u0003\u00009;\u0001\u0000"+
		"\u0000\u0000:2\u0001\u0000\u0000\u0000:4\u0001\u0000\u0000\u0000;E\u0001"+
		"\u0000\u0000\u0000<>\u0003\t\u0004\u0000=<\u0001\u0000\u0000\u0000>?\u0001"+
		"\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000"+
		"@A\u0001\u0000\u0000\u0000AB\u0003\u0007\u0003\u0000BD\u0001\u0000\u0000"+
		"\u0000C=\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000"+
		"\u0000\u0000EF\u0001\u0000\u0000\u0000F\u0004\u0001\u0000\u0000\u0000"+
		"GE\u0001\u0000\u0000\u0000HJ\u0003\u000b\u0005\u0000IH\u0001\u0000\u0000"+
		"\u0000JM\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000"+
		"\u0000\u0000LN\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000NO\u0003"+
		"\u0007\u0003\u0000OZ\u0003\u0007\u0003\u0000PR\u0003\t\u0004\u0000QP\u0001"+
		"\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000"+
		"ST\u0001\u0000\u0000\u0000TY\u0001\u0000\u0000\u0000UV\u0003\u0007\u0003"+
		"\u0000VW\u0003\t\u0004\u0000WY\u0001\u0000\u0000\u0000XQ\u0001\u0000\u0000"+
		"\u0000XU\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000"+
		"\u0000\u0000Z[\u0001\u0000\u0000\u0000[\u0006\u0001\u0000\u0000\u0000"+
		"\\Z\u0001\u0000\u0000\u0000]^\u00050\u0000\u0000^\b\u0001\u0000\u0000"+
		"\u0000_`\u00051\u0000\u0000`\n\u0001\u0000\u0000\u0000ae\u0003\r\u0006"+
		"\u0000be\u0003\u000f\u0007\u0000ce\u0003\u0011\b\u0000da\u0001\u0000\u0000"+
		"\u0000db\u0001\u0000\u0000\u0000dc\u0001\u0000\u0000\u0000e\f\u0001\u0000"+
		"\u0000\u0000fh\u0003\t\u0004\u0000gf\u0001\u0000\u0000\u0000hi\u0001\u0000"+
		"\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000j\u000e"+
		"\u0001\u0000\u0000\u0000km\u0003\u0007\u0003\u0000ln\u0003\t\u0004\u0000"+
		"ml\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000om\u0001\u0000\u0000"+
		"\u0000op\u0001\u0000\u0000\u0000p\u0010\u0001\u0000\u0000\u0000qr\u0003"+
		"\u0007\u0003\u0000r{\u0003\u0007\u0003\u0000s|\u0003\u0007\u0003\u0000"+
		"tv\u0003\t\u0004\u0000ut\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000"+
		"wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000"+
		"\u0000yz\u0003\u0007\u0003\u0000z|\u0001\u0000\u0000\u0000{s\u0001\u0000"+
		"\u0000\u0000{u\u0001\u0000\u0000\u0000|\u0080\u0001\u0000\u0000\u0000"+
		"}\u007f\u0003\u0013\t\u0000~}\u0001\u0000\u0000\u0000\u007f\u0082\u0001"+
		"\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000"+
		"\u0000\u0000\u0081\u0083\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000"+
		"\u0000\u0000\u0083\u0084\u0003\u0007\u0003\u0000\u0084\u0012\u0001\u0000"+
		"\u0000\u0000\u0085\u0087\u0003\t\u0004\u0000\u0086\u0085\u0001\u0000\u0000"+
		"\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0003\u0007\u0003\u0000\u008b\u0014\u0001\u0000\u0000"+
		"\u0000\u0014\u0000\u0018!(.6:?EKSXZdiow{\u0080\u0088\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}