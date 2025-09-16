// Generated from Simple.g4 by ANTLR 4.4
package com.miorganizacion.simple.interprete;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, VAR=2, PRINTLN=3, IF=4, ELSE=5, PLUS=6, MINUS=7, MULT=8, DIV=9, 
		EXP=10, AND=11, OR=12, NOT=13, GT=14, LT=15, GEQ=16, LEQ=17, EQ=18, NEQ=19, 
		ASSIGN=20, BRACKET_OPEN=21, BRACKET_CLOSE=22, PAR_OPEN=23, PAR_CLOSE=24, 
		SEMICOLON=25, BOOLEAN=26, ID=27, NUMBER=28, WS=29;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'"
	};
	public static final String[] ruleNames = {
		"PROGRAM", "VAR", "PRINTLN", "IF", "ELSE", "PLUS", "MINUS", "MULT", "DIV", 
		"EXP", "AND", "OR", "NOT", "GT", "LT", "GEQ", "LEQ", "EQ", "NEQ", "ASSIGN", 
		"BRACKET_OPEN", "BRACKET_CLOSE", "PAR_OPEN", "PAR_CLOSE", "SEMICOLON", 
		"BOOLEAN", "ID", "NUMBER", "WS"
	};


	public SimpleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Simple.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\37\u00a5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\5\33\u0091\n\33\3\34\3\34\7\34\u0095\n\34\f\34\16\34\u0098"+
		"\13\34\3\35\6\35\u009b\n\35\r\35\16\35\u009c\3\36\6\36\u00a0\n\36\r\36"+
		"\16\36\u00a1\3\36\3\36\2\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37\3\2\6\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;"+
		"\5\2\13\f\17\17\"\"\u00a8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5E\3\2\2\2\7I\3\2\2\2\tQ\3\2"+
		"\2\2\13T\3\2\2\2\rY\3\2\2\2\17[\3\2\2\2\21]\3\2\2\2\23_\3\2\2\2\25a\3"+
		"\2\2\2\27c\3\2\2\2\31f\3\2\2\2\33i\3\2\2\2\35k\3\2\2\2\37m\3\2\2\2!o\3"+
		"\2\2\2#r\3\2\2\2%u\3\2\2\2\'x\3\2\2\2){\3\2\2\2+}\3\2\2\2-\177\3\2\2\2"+
		"/\u0081\3\2\2\2\61\u0083\3\2\2\2\63\u0085\3\2\2\2\65\u0090\3\2\2\2\67"+
		"\u0092\3\2\2\29\u009a\3\2\2\2;\u009f\3\2\2\2=>\7r\2\2>?\7t\2\2?@\7q\2"+
		"\2@A\7i\2\2AB\7t\2\2BC\7c\2\2CD\7o\2\2D\4\3\2\2\2EF\7x\2\2FG\7c\2\2GH"+
		"\7t\2\2H\6\3\2\2\2IJ\7r\2\2JK\7t\2\2KL\7k\2\2LM\7p\2\2MN\7v\2\2NO\7n\2"+
		"\2OP\7p\2\2P\b\3\2\2\2QR\7k\2\2RS\7h\2\2S\n\3\2\2\2TU\7g\2\2UV\7n\2\2"+
		"VW\7u\2\2WX\7g\2\2X\f\3\2\2\2YZ\7-\2\2Z\16\3\2\2\2[\\\7/\2\2\\\20\3\2"+
		"\2\2]^\7,\2\2^\22\3\2\2\2_`\7\61\2\2`\24\3\2\2\2ab\7`\2\2b\26\3\2\2\2"+
		"cd\7(\2\2de\7(\2\2e\30\3\2\2\2fg\7~\2\2gh\7~\2\2h\32\3\2\2\2ij\7#\2\2"+
		"j\34\3\2\2\2kl\7@\2\2l\36\3\2\2\2mn\7>\2\2n \3\2\2\2op\7@\2\2pq\7?\2\2"+
		"q\"\3\2\2\2rs\7>\2\2st\7?\2\2t$\3\2\2\2uv\7?\2\2vw\7?\2\2w&\3\2\2\2xy"+
		"\7#\2\2yz\7?\2\2z(\3\2\2\2{|\7?\2\2|*\3\2\2\2}~\7}\2\2~,\3\2\2\2\177\u0080"+
		"\7\177\2\2\u0080.\3\2\2\2\u0081\u0082\7*\2\2\u0082\60\3\2\2\2\u0083\u0084"+
		"\7+\2\2\u0084\62\3\2\2\2\u0085\u0086\7=\2\2\u0086\64\3\2\2\2\u0087\u0088"+
		"\7v\2\2\u0088\u0089\7t\2\2\u0089\u008a\7w\2\2\u008a\u0091\7g\2\2\u008b"+
		"\u008c\7h\2\2\u008c\u008d\7c\2\2\u008d\u008e\7n\2\2\u008e\u008f\7u\2\2"+
		"\u008f\u0091\7g\2\2\u0090\u0087\3\2\2\2\u0090\u008b\3\2\2\2\u0091\66\3"+
		"\2\2\2\u0092\u0096\t\2\2\2\u0093\u0095\t\3\2\2\u0094\u0093\3\2\2\2\u0095"+
		"\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u00978\3\2\2\2"+
		"\u0098\u0096\3\2\2\2\u0099\u009b\t\4\2\2\u009a\u0099\3\2\2\2\u009b\u009c"+
		"\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d:\3\2\2\2\u009e"+
		"\u00a0\t\5\2\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2"+
		"\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\b\36\2\2\u00a4"+
		"<\3\2\2\2\7\2\u0090\u0096\u009c\u00a1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}