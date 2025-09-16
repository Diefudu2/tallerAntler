// Generated from Simple.g4 by ANTLR 4.4
package com.miorganizacion.simple.interprete;

    import java.util.Map;
    import java.util.HashMap;
    import java.util.List;
    import java.util.ArrayList;
    import com.miorganizacion.simple.interprete.ast.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__1=1, T__0=2, PROGRAM=3, VAR=4, PRINTLN=5, IF=6, ELSE=7, PLUS=8, MINUS=9, 
		MULT=10, DIV=11, EXP=12, AND=13, OR=14, NOT=15, GT=16, LT=17, GEQ=18, 
		LEQ=19, EQ=20, NEQ=21, ASSIGN=22, BRACKET_OPEN=23, BRACKET_CLOSE=24, PAR_OPEN=25, 
		PAR_CLOSE=26, SEMICOLON=27, COMMA=28, BOOLEAN=29, ID=30, NUMBER=31, WS=32;
	public static final String[] tokenNames = {
		"<INVALID>", "'DIGITALROOT'", "'SIMULATEGAUSS'", "'program'", "'var'", 
		"'println'", "'if'", "'else'", "'+'", "'-'", "'*'", "'/'", "'^'", "'&&'", 
		"'||'", "'!'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'='", "'{'", 
		"'}'", "'('", "')'", "';'", "','", "BOOLEAN", "ID", "NUMBER", "WS"
	};
	public static final int
		RULE_program = 0, RULE_sentence = 1, RULE_var_decl = 2, RULE_var_assign = 3, 
		RULE_println = 4, RULE_conditional = 5, RULE_expression = 6, RULE_logicTerm = 7, 
		RULE_logicFactor = 8, RULE_relational = 9, RULE_arithExpr = 10, RULE_term = 11, 
		RULE_factor = 12, RULE_exponent = 13, RULE_specialFunc = 14, RULE_primary = 15;
	public static final String[] ruleNames = {
		"program", "sentence", "var_decl", "var_assign", "println", "conditional", 
		"expression", "logicTerm", "logicFactor", "relational", "arithExpr", "term", 
		"factor", "exponent", "specialFunc", "primary"
	};

	@Override
	public String getGrammarFileName() { return "Simple.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    Map<String, Object> symbolTable = new HashMap<String, Object>();

	public SimpleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public SentenceContext sentence;
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public TerminalNode BRACKET_CLOSE() { return getToken(SimpleParser.BRACKET_CLOSE, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(SimpleParser.BRACKET_OPEN, 0); }
		public TerminalNode PROGRAM() { return getToken(SimpleParser.PROGRAM, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32); match(PROGRAM);
			setState(33); match(ID);
			setState(34); match(BRACKET_OPEN);

					List<ASTNode> body = new ArrayList<ASTNode>();
					Map<String, Object> symbolTable = new HashMap<String,Object>();
				
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PRINTLN) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(36); ((ProgramContext)_localctx).sentence = sentence();
				body.add(((ProgramContext)_localctx).sentence.node);
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44); match(BRACKET_CLOSE);

			    	for (ASTNode n : body){
			    		n.execute(symbolTable);
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

	public static class SentenceContext extends ParserRuleContext {
		public ASTNode node;
		public PrintlnContext println;
		public ConditionalContext conditional;
		public Var_declContext var_decl;
		public Var_assignContext var_assign;
		public PrintlnContext println() {
			return getRuleContext(PrintlnContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public Var_assignContext var_assign() {
			return getRuleContext(Var_assignContext.class,0);
		}
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitSentence(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentence);
		try {
			setState(59);
			switch (_input.LA(1)) {
			case PRINTLN:
				enterOuterAlt(_localctx, 1);
				{
				setState(47); ((SentenceContext)_localctx).println = println();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).println.node;
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(50); ((SentenceContext)_localctx).conditional = conditional();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).conditional.node;
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(53); ((SentenceContext)_localctx).var_decl = var_decl();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).var_decl.node;
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(56); ((SentenceContext)_localctx).var_assign = var_assign();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).var_assign.node;
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

	public static class Var_declContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
		public TerminalNode VAR() { return getToken(SimpleParser.VAR, 0); }
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61); match(VAR);
			setState(62); ((Var_declContext)_localctx).ID = match(ID);
			setState(63); match(SEMICOLON);
			((Var_declContext)_localctx).node =  new VarDecl((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null));
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

	public static class Var_assignContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public ExpressionContext expression;
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(SimpleParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Var_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterVar_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitVar_assign(this);
		}
	}

	public final Var_assignContext var_assign() throws RecognitionException {
		Var_assignContext _localctx = new Var_assignContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66); ((Var_assignContext)_localctx).ID = match(ID);
			setState(67); match(ASSIGN);
			setState(68); ((Var_assignContext)_localctx).expression = expression();
			setState(69); match(SEMICOLON);
			((Var_assignContext)_localctx).node =  new VarAssign((((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getText():null), ((Var_assignContext)_localctx).expression.node);
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

	public static class PrintlnContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext expression;
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
		public TerminalNode PRINTLN() { return getToken(SimpleParser.PRINTLN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_println; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterPrintln(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitPrintln(this);
		}
	}

	public final PrintlnContext println() throws RecognitionException {
		PrintlnContext _localctx = new PrintlnContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_println);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72); match(PRINTLN);
			setState(73); ((PrintlnContext)_localctx).expression = expression();
			setState(74); match(SEMICOLON);
			((PrintlnContext)_localctx).node =  new Println(((PrintlnContext)_localctx).expression.node);
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

	public static class ConditionalContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext expression;
		public SentenceContext s1;
		public SentenceContext s2;
		public TerminalNode ELSE() { return getToken(SimpleParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(SimpleParser.IF, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(SimpleParser.PAR_CLOSE, 0); }
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public List<TerminalNode> BRACKET_CLOSE() { return getTokens(SimpleParser.BRACKET_CLOSE); }
		public TerminalNode PAR_OPEN() { return getToken(SimpleParser.PAR_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> BRACKET_OPEN() { return getTokens(SimpleParser.BRACKET_OPEN); }
		public TerminalNode BRACKET_OPEN(int i) {
			return getToken(SimpleParser.BRACKET_OPEN, i);
		}
		public TerminalNode BRACKET_CLOSE(int i) {
			return getToken(SimpleParser.BRACKET_CLOSE, i);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitConditional(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77); match(IF);
			setState(78); match(PAR_OPEN);
			setState(79); ((ConditionalContext)_localctx).expression = expression();
			setState(80); match(PAR_CLOSE);

			        List<ASTNode> body = new ArrayList<ASTNode>();
			    
			setState(82); match(BRACKET_OPEN);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PRINTLN) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(83); ((ConditionalContext)_localctx).s1 = sentence();
				body.add(((ConditionalContext)_localctx).s1.node);
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91); match(BRACKET_CLOSE);
			setState(106);
			switch (_input.LA(1)) {
			case ELSE:
				{
				setState(92); match(ELSE);

				        List<ASTNode> elseBody = new ArrayList<ASTNode>();
				    
				setState(94); match(BRACKET_OPEN);
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PRINTLN) | (1L << IF) | (1L << ID))) != 0)) {
					{
					{
					setState(95); ((ConditionalContext)_localctx).s2 = sentence();
					elseBody.add(((ConditionalContext)_localctx).s2.node);
					}
					}
					setState(102);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(103); match(BRACKET_CLOSE);

				        ((ConditionalContext)_localctx).node =  new If(((ConditionalContext)_localctx).expression.node, body, elseBody);
				    
				}
				break;
			case VAR:
			case PRINTLN:
			case IF:
			case BRACKET_CLOSE:
			case ID:
				{

				        ((ConditionalContext)_localctx).node =  new If(((ConditionalContext)_localctx).expression.node, body, null);
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public LogicTermContext t1;
		public LogicTermContext t2;
		public List<LogicTermContext> logicTerm() {
			return getRuleContexts(LogicTermContext.class);
		}
		public LogicTermContext logicTerm(int i) {
			return getRuleContext(LogicTermContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(SimpleParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(SimpleParser.OR, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108); ((ExpressionContext)_localctx).t1 = logicTerm();
			((ExpressionContext)_localctx).node =  ((ExpressionContext)_localctx).t1.node;
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(110); match(OR);
				setState(111); ((ExpressionContext)_localctx).t2 = logicTerm();
				((ExpressionContext)_localctx).node =  new LogicalOr(_localctx.node, ((ExpressionContext)_localctx).t2.node);
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class LogicTermContext extends ParserRuleContext {
		public ASTNode node;
		public LogicFactorContext t1;
		public LogicFactorContext t2;
		public TerminalNode AND(int i) {
			return getToken(SimpleParser.AND, i);
		}
		public LogicFactorContext logicFactor(int i) {
			return getRuleContext(LogicFactorContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(SimpleParser.AND); }
		public List<LogicFactorContext> logicFactor() {
			return getRuleContexts(LogicFactorContext.class);
		}
		public LogicTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterLogicTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitLogicTerm(this);
		}
	}

	public final LogicTermContext logicTerm() throws RecognitionException {
		LogicTermContext _localctx = new LogicTermContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_logicTerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119); ((LogicTermContext)_localctx).t1 = logicFactor();
			((LogicTermContext)_localctx).node =  ((LogicTermContext)_localctx).t1.node;
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(121); match(AND);
				setState(122); ((LogicTermContext)_localctx).t2 = logicFactor();
				((LogicTermContext)_localctx).node =  new LogicalAnd(_localctx.node, ((LogicTermContext)_localctx).t2.node);
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class LogicFactorContext extends ParserRuleContext {
		public ASTNode node;
		public LogicFactorContext lf;
		public RelationalContext t;
		public TerminalNode NOT() { return getToken(SimpleParser.NOT, 0); }
		public RelationalContext relational() {
			return getRuleContext(RelationalContext.class,0);
		}
		public LogicFactorContext logicFactor() {
			return getRuleContext(LogicFactorContext.class,0);
		}
		public LogicFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicFactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterLogicFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitLogicFactor(this);
		}
	}

	public final LogicFactorContext logicFactor() throws RecognitionException {
		LogicFactorContext _localctx = new LogicFactorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_logicFactor);
		try {
			setState(137);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(130); match(NOT);
				setState(131); ((LogicFactorContext)_localctx).lf = logicFactor();
				((LogicFactorContext)_localctx).node =  new LogicalNot(((LogicFactorContext)_localctx).lf.node);
				}
				break;
			case T__1:
			case T__0:
			case PAR_OPEN:
			case BOOLEAN:
			case ID:
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(134); ((LogicFactorContext)_localctx).t = relational();
				((LogicFactorContext)_localctx).node =  ((LogicFactorContext)_localctx).t.node;
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

	public static class RelationalContext extends ParserRuleContext {
		public ASTNode node;
		public ArithExprContext t1;
		public ArithExprContext t2;
		public List<TerminalNode> NEQ() { return getTokens(SimpleParser.NEQ); }
		public TerminalNode EQ(int i) {
			return getToken(SimpleParser.EQ, i);
		}
		public List<TerminalNode> LT() { return getTokens(SimpleParser.LT); }
		public List<ArithExprContext> arithExpr() {
			return getRuleContexts(ArithExprContext.class);
		}
		public List<TerminalNode> GT() { return getTokens(SimpleParser.GT); }
		public TerminalNode NEQ(int i) {
			return getToken(SimpleParser.NEQ, i);
		}
		public List<TerminalNode> GEQ() { return getTokens(SimpleParser.GEQ); }
		public ArithExprContext arithExpr(int i) {
			return getRuleContext(ArithExprContext.class,i);
		}
		public List<TerminalNode> LEQ() { return getTokens(SimpleParser.LEQ); }
		public TerminalNode LEQ(int i) {
			return getToken(SimpleParser.LEQ, i);
		}
		public List<TerminalNode> EQ() { return getTokens(SimpleParser.EQ); }
		public TerminalNode GT(int i) {
			return getToken(SimpleParser.GT, i);
		}
		public TerminalNode LT(int i) {
			return getToken(SimpleParser.LT, i);
		}
		public TerminalNode GEQ(int i) {
			return getToken(SimpleParser.GEQ, i);
		}
		public RelationalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterRelational(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitRelational(this);
		}
	}

	public final RelationalContext relational() throws RecognitionException {
		RelationalContext _localctx = new RelationalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_relational);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139); ((RelationalContext)_localctx).t1 = arithExpr();
			((RelationalContext)_localctx).node =  ((RelationalContext)_localctx).t1.node;
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GEQ) | (1L << LEQ) | (1L << EQ) | (1L << NEQ))) != 0)) {
				{
				setState(165);
				switch (_input.LA(1)) {
				case GT:
					{
					setState(141); match(GT);
					setState(142); ((RelationalContext)_localctx).t2 = arithExpr();
					((RelationalContext)_localctx).node =  new GreaterThan(_localctx.node, ((RelationalContext)_localctx).t2.node);
					}
					break;
				case LT:
					{
					setState(145); match(LT);
					setState(146); ((RelationalContext)_localctx).t2 = arithExpr();
					((RelationalContext)_localctx).node =  new LessThan(_localctx.node, ((RelationalContext)_localctx).t2.node);
					}
					break;
				case GEQ:
					{
					setState(149); match(GEQ);
					setState(150); ((RelationalContext)_localctx).t2 = arithExpr();
					((RelationalContext)_localctx).node =  new GreaterEqual(_localctx.node, ((RelationalContext)_localctx).t2.node);
					}
					break;
				case LEQ:
					{
					setState(153); match(LEQ);
					setState(154); ((RelationalContext)_localctx).t2 = arithExpr();
					((RelationalContext)_localctx).node =  new LessEqual(_localctx.node, ((RelationalContext)_localctx).t2.node);
					}
					break;
				case EQ:
					{
					setState(157); match(EQ);
					setState(158); ((RelationalContext)_localctx).t2 = arithExpr();
					((RelationalContext)_localctx).node =  new Equals(_localctx.node, ((RelationalContext)_localctx).t2.node);
					}
					break;
				case NEQ:
					{
					setState(161); match(NEQ);
					setState(162); ((RelationalContext)_localctx).t2 = arithExpr();
					((RelationalContext)_localctx).node =  new NotEquals(_localctx.node, ((RelationalContext)_localctx).t2.node);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ArithExprContext extends ParserRuleContext {
		public ASTNode node;
		public TermContext t1;
		public TermContext t2;
		public TerminalNode MINUS(int i) {
			return getToken(SimpleParser.MINUS, i);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(SimpleParser.PLUS); }
		public List<TerminalNode> MINUS() { return getTokens(SimpleParser.MINUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SimpleParser.PLUS, i);
		}
		public ArithExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterArithExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitArithExpr(this);
		}
	}

	public final ArithExprContext arithExpr() throws RecognitionException {
		ArithExprContext _localctx = new ArithExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_arithExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170); ((ArithExprContext)_localctx).t1 = term();
			((ArithExprContext)_localctx).node =  ((ArithExprContext)_localctx).t1.node;
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				setState(180);
				switch (_input.LA(1)) {
				case PLUS:
					{
					{
					setState(172); match(PLUS);
					setState(173); ((ArithExprContext)_localctx).t2 = term();
					((ArithExprContext)_localctx).node =  new Addition(_localctx.node, ((ArithExprContext)_localctx).t2.node);
					}
					}
					break;
				case MINUS:
					{
					{
					setState(176); match(MINUS);
					setState(177); ((ArithExprContext)_localctx).t2 = term();
					((ArithExprContext)_localctx).node =  new Subtraction(_localctx.node, ((ArithExprContext)_localctx).t2.node);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class TermContext extends ParserRuleContext {
		public ASTNode node;
		public FactorContext t1;
		public FactorContext t2;
		public TerminalNode MULT(int i) {
			return getToken(SimpleParser.MULT, i);
		}
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(SimpleParser.MULT); }
		public List<TerminalNode> DIV() { return getTokens(SimpleParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(SimpleParser.DIV, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185); ((TermContext)_localctx).t1 = factor();
			((TermContext)_localctx).node =  ((TermContext)_localctx).t1.node;
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIV) {
				{
				setState(195);
				switch (_input.LA(1)) {
				case MULT:
					{
					{
					setState(187); match(MULT);
					setState(188); ((TermContext)_localctx).t2 = factor();
					((TermContext)_localctx).node =  new Multiplication(_localctx.node, ((TermContext)_localctx).t2.node);
					}
					}
					break;
				case DIV:
					{
					{
					setState(191); match(DIV);
					setState(192); ((TermContext)_localctx).t2 = factor();
					((TermContext)_localctx).node =  new Division(_localctx.node, ((TermContext)_localctx).t2.node);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class FactorContext extends ParserRuleContext {
		public ASTNode node;
		public ExponentContext t1;
		public ExponentContext t2;
		public List<ExponentContext> exponent() {
			return getRuleContexts(ExponentContext.class);
		}
		public TerminalNode EXP(int i) {
			return getToken(SimpleParser.EXP, i);
		}
		public ExponentContext exponent(int i) {
			return getRuleContext(ExponentContext.class,i);
		}
		public List<TerminalNode> EXP() { return getTokens(SimpleParser.EXP); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200); ((FactorContext)_localctx).t1 = exponent();
			((FactorContext)_localctx).node =  ((FactorContext)_localctx).t1.node;
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EXP) {
				{
				{
				setState(202); match(EXP);
				setState(203); ((FactorContext)_localctx).t2 = exponent();
				((FactorContext)_localctx).node =  new Exponentiation(_localctx.node, ((FactorContext)_localctx).t2.node);
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ExponentContext extends ParserRuleContext {
		public ASTNode node;
		public SpecialFuncContext t1;
		public PrimaryContext primary;
		public SpecialFuncContext specialFunc() {
			return getRuleContext(SpecialFuncContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterExponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitExponent(this);
		}
	}

	public final ExponentContext exponent() throws RecognitionException {
		ExponentContext _localctx = new ExponentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_exponent);
		try {
			setState(217);
			switch (_input.LA(1)) {
			case T__1:
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(211); ((ExponentContext)_localctx).t1 = specialFunc();
				((ExponentContext)_localctx).node =  ((ExponentContext)_localctx).t1.node;
				}
				break;
			case PAR_OPEN:
			case BOOLEAN:
			case ID:
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(214); ((ExponentContext)_localctx).primary = primary();
				((ExponentContext)_localctx).node =  ((ExponentContext)_localctx).primary.node;
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

	public static class SpecialFuncContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public TerminalNode PAR_CLOSE() { return getToken(SimpleParser.PAR_CLOSE, 0); }
		public TerminalNode COMMA() { return getToken(SimpleParser.COMMA, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PAR_OPEN() { return getToken(SimpleParser.PAR_OPEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public SpecialFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterSpecialFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitSpecialFunc(this);
		}
	}

	public final SpecialFuncContext specialFunc() throws RecognitionException {
		SpecialFuncContext _localctx = new SpecialFuncContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_specialFunc);
		try {
			setState(233);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219); match(T__1);
				setState(220); match(PAR_OPEN);
				setState(221); ((SpecialFuncContext)_localctx).e1 = expression();
				setState(222); match(PAR_CLOSE);
				((SpecialFuncContext)_localctx).node =  new DigitalRoot(((SpecialFuncContext)_localctx).e1.node);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(225); match(T__0);
				setState(226); match(PAR_OPEN);
				setState(227); ((SpecialFuncContext)_localctx).e1 = expression();
				setState(228); match(COMMA);
				setState(229); ((SpecialFuncContext)_localctx).e2 = expression();
				setState(230); match(PAR_CLOSE);
				((SpecialFuncContext)_localctx).node =  new SimulateGauss(((SpecialFuncContext)_localctx).e1.node, ((SpecialFuncContext)_localctx).e2.node);
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

	public static class PrimaryContext extends ParserRuleContext {
		public ASTNode node;
		public Token NUMBER;
		public Token ID;
		public Token BOOLEAN;
		public ExpressionContext expression;
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(SimpleParser.PAR_CLOSE, 0); }
		public TerminalNode PAR_OPEN() { return getToken(SimpleParser.PAR_OPEN, 0); }
		public TerminalNode NUMBER() { return getToken(SimpleParser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(SimpleParser.BOOLEAN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_primary);
		try {
			setState(246);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(235); ((PrimaryContext)_localctx).NUMBER = match(NUMBER);
				((PrimaryContext)_localctx).node =  new Constant(Integer.parseInt((((PrimaryContext)_localctx).NUMBER!=null?((PrimaryContext)_localctx).NUMBER.getText():null)));
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(237); ((PrimaryContext)_localctx).ID = match(ID);
				((PrimaryContext)_localctx).node =  new VarRef((((PrimaryContext)_localctx).ID!=null?((PrimaryContext)_localctx).ID.getText():null));
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(239); ((PrimaryContext)_localctx).BOOLEAN = match(BOOLEAN);
				((PrimaryContext)_localctx).node =  new Constant(Boolean.parseBoolean((((PrimaryContext)_localctx).BOOLEAN!=null?((PrimaryContext)_localctx).BOOLEAN.getText():null)));
				}
				break;
			case PAR_OPEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(241); match(PAR_OPEN);
				setState(242); ((PrimaryContext)_localctx).expression = expression();
				((PrimaryContext)_localctx).node =  ((PrimaryContext)_localctx).expression.node;
				setState(244); match(PAR_CLOSE);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\"\u00fb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3>\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\7\7Y\n\7\f\7\16\7\\\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7e\n\7\f\7\16"+
		"\7h\13\7\3\7\3\7\3\7\5\7m\n\7\3\b\3\b\3\b\3\b\3\b\3\b\7\bu\n\b\f\b\16"+
		"\bx\13\b\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0080\n\t\f\t\16\t\u0083\13\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u008c\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\7\13\u00a8\n\13\f\13\16\13\u00ab\13\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00b7\n\f\f\f\16\f\u00ba\13"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00c6\n\r\f\r\16\r\u00c9"+
		"\13\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00d1\n\16\f\16\16\16\u00d4\13"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00dc\n\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00ec\n\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00f9\n\21\3\21"+
		"\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\2\u0104\2\"\3\2\2\2"+
		"\4=\3\2\2\2\6?\3\2\2\2\bD\3\2\2\2\nJ\3\2\2\2\fO\3\2\2\2\16n\3\2\2\2\20"+
		"y\3\2\2\2\22\u008b\3\2\2\2\24\u008d\3\2\2\2\26\u00ac\3\2\2\2\30\u00bb"+
		"\3\2\2\2\32\u00ca\3\2\2\2\34\u00db\3\2\2\2\36\u00eb\3\2\2\2 \u00f8\3\2"+
		"\2\2\"#\7\5\2\2#$\7 \2\2$%\7\31\2\2%+\b\2\1\2&\'\5\4\3\2\'(\b\2\1\2(*"+
		"\3\2\2\2)&\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,.\3\2\2\2-+\3\2\2\2."+
		"/\7\32\2\2/\60\b\2\1\2\60\3\3\2\2\2\61\62\5\n\6\2\62\63\b\3\1\2\63>\3"+
		"\2\2\2\64\65\5\f\7\2\65\66\b\3\1\2\66>\3\2\2\2\678\5\6\4\289\b\3\1\29"+
		">\3\2\2\2:;\5\b\5\2;<\b\3\1\2<>\3\2\2\2=\61\3\2\2\2=\64\3\2\2\2=\67\3"+
		"\2\2\2=:\3\2\2\2>\5\3\2\2\2?@\7\6\2\2@A\7 \2\2AB\7\35\2\2BC\b\4\1\2C\7"+
		"\3\2\2\2DE\7 \2\2EF\7\30\2\2FG\5\16\b\2GH\7\35\2\2HI\b\5\1\2I\t\3\2\2"+
		"\2JK\7\7\2\2KL\5\16\b\2LM\7\35\2\2MN\b\6\1\2N\13\3\2\2\2OP\7\b\2\2PQ\7"+
		"\33\2\2QR\5\16\b\2RS\7\34\2\2ST\b\7\1\2TZ\7\31\2\2UV\5\4\3\2VW\b\7\1\2"+
		"WY\3\2\2\2XU\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2"+
		"\2]l\7\32\2\2^_\7\t\2\2_`\b\7\1\2`f\7\31\2\2ab\5\4\3\2bc\b\7\1\2ce\3\2"+
		"\2\2da\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2ij\7\32"+
		"\2\2jm\b\7\1\2km\b\7\1\2l^\3\2\2\2lk\3\2\2\2m\r\3\2\2\2no\5\20\t\2ov\b"+
		"\b\1\2pq\7\20\2\2qr\5\20\t\2rs\b\b\1\2su\3\2\2\2tp\3\2\2\2ux\3\2\2\2v"+
		"t\3\2\2\2vw\3\2\2\2w\17\3\2\2\2xv\3\2\2\2yz\5\22\n\2z\u0081\b\t\1\2{|"+
		"\7\17\2\2|}\5\22\n\2}~\b\t\1\2~\u0080\3\2\2\2\177{\3\2\2\2\u0080\u0083"+
		"\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\21\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0084\u0085\7\21\2\2\u0085\u0086\5\22\n\2\u0086\u0087\b"+
		"\n\1\2\u0087\u008c\3\2\2\2\u0088\u0089\5\24\13\2\u0089\u008a\b\n\1\2\u008a"+
		"\u008c\3\2\2\2\u008b\u0084\3\2\2\2\u008b\u0088\3\2\2\2\u008c\23\3\2\2"+
		"\2\u008d\u008e\5\26\f\2\u008e\u00a9\b\13\1\2\u008f\u0090\7\22\2\2\u0090"+
		"\u0091\5\26\f\2\u0091\u0092\b\13\1\2\u0092\u00a8\3\2\2\2\u0093\u0094\7"+
		"\23\2\2\u0094\u0095\5\26\f\2\u0095\u0096\b\13\1\2\u0096\u00a8\3\2\2\2"+
		"\u0097\u0098\7\24\2\2\u0098\u0099\5\26\f\2\u0099\u009a\b\13\1\2\u009a"+
		"\u00a8\3\2\2\2\u009b\u009c\7\25\2\2\u009c\u009d\5\26\f\2\u009d\u009e\b"+
		"\13\1\2\u009e\u00a8\3\2\2\2\u009f\u00a0\7\26\2\2\u00a0\u00a1\5\26\f\2"+
		"\u00a1\u00a2\b\13\1\2\u00a2\u00a8\3\2\2\2\u00a3\u00a4\7\27\2\2\u00a4\u00a5"+
		"\5\26\f\2\u00a5\u00a6\b\13\1\2\u00a6\u00a8\3\2\2\2\u00a7\u008f\3\2\2\2"+
		"\u00a7\u0093\3\2\2\2\u00a7\u0097\3\2\2\2\u00a7\u009b\3\2\2\2\u00a7\u009f"+
		"\3\2\2\2\u00a7\u00a3\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\25\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\5\30\r"+
		"\2\u00ad\u00b8\b\f\1\2\u00ae\u00af\7\n\2\2\u00af\u00b0\5\30\r\2\u00b0"+
		"\u00b1\b\f\1\2\u00b1\u00b7\3\2\2\2\u00b2\u00b3\7\13\2\2\u00b3\u00b4\5"+
		"\30\r\2\u00b4\u00b5\b\f\1\2\u00b5\u00b7\3\2\2\2\u00b6\u00ae\3\2\2\2\u00b6"+
		"\u00b2\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2"+
		"\2\2\u00b9\27\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc\5\32\16\2\u00bc"+
		"\u00c7\b\r\1\2\u00bd\u00be\7\f\2\2\u00be\u00bf\5\32\16\2\u00bf\u00c0\b"+
		"\r\1\2\u00c0\u00c6\3\2\2\2\u00c1\u00c2\7\r\2\2\u00c2\u00c3\5\32\16\2\u00c3"+
		"\u00c4\b\r\1\2\u00c4\u00c6\3\2\2\2\u00c5\u00bd\3\2\2\2\u00c5\u00c1\3\2"+
		"\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\31\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb\5\34\17\2\u00cb\u00d2\b\16"+
		"\1\2\u00cc\u00cd\7\16\2\2\u00cd\u00ce\5\34\17\2\u00ce\u00cf\b\16\1\2\u00cf"+
		"\u00d1\3\2\2\2\u00d0\u00cc\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2"+
		"\2\2\u00d2\u00d3\3\2\2\2\u00d3\33\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6"+
		"\5\36\20\2\u00d6\u00d7\b\17\1\2\u00d7\u00dc\3\2\2\2\u00d8\u00d9\5 \21"+
		"\2\u00d9\u00da\b\17\1\2\u00da\u00dc\3\2\2\2\u00db\u00d5\3\2\2\2\u00db"+
		"\u00d8\3\2\2\2\u00dc\35\3\2\2\2\u00dd\u00de\7\3\2\2\u00de\u00df\7\33\2"+
		"\2\u00df\u00e0\5\16\b\2\u00e0\u00e1\7\34\2\2\u00e1\u00e2\b\20\1\2\u00e2"+
		"\u00ec\3\2\2\2\u00e3\u00e4\7\4\2\2\u00e4\u00e5\7\33\2\2\u00e5\u00e6\5"+
		"\16\b\2\u00e6\u00e7\7\36\2\2\u00e7\u00e8\5\16\b\2\u00e8\u00e9\7\34\2\2"+
		"\u00e9\u00ea\b\20\1\2\u00ea\u00ec\3\2\2\2\u00eb\u00dd\3\2\2\2\u00eb\u00e3"+
		"\3\2\2\2\u00ec\37\3\2\2\2\u00ed\u00ee\7!\2\2\u00ee\u00f9\b\21\1\2\u00ef"+
		"\u00f0\7 \2\2\u00f0\u00f9\b\21\1\2\u00f1\u00f2\7\37\2\2\u00f2\u00f9\b"+
		"\21\1\2\u00f3\u00f4\7\33\2\2\u00f4\u00f5\5\16\b\2\u00f5\u00f6\b\21\1\2"+
		"\u00f6\u00f7\7\34\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00ed\3\2\2\2\u00f8\u00ef"+
		"\3\2\2\2\u00f8\u00f1\3\2\2\2\u00f8\u00f3\3\2\2\2\u00f9!\3\2\2\2\24+=Z"+
		"flv\u0081\u008b\u00a7\u00a9\u00b6\u00b8\u00c5\u00c7\u00d2\u00db\u00eb"+
		"\u00f8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}