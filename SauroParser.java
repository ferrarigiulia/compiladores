// Generated from Sauro.g by ANTLR 4.7.2

    //import java.util.ArrayList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SauroParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OP_CUR=1, CL_CUR=2, EQ=3, NE=4, GT=5, GE=6, LT=7, LE=8, PLUS=9, MINUS=10, 
		TIMES=11, OVER=12, REMAINDER=13, OP_PAR=14, CL_PAR=15, ATTRIB=16, COMMA=17, 
		COLON=18, DOT=19, OP_BRA=20, CL_BRA=21, IF=22, PRINT=23, READ_INT=24, 
		READ_STR=25, INT=26, RETURN=27, STRING=28, WHILE=29, LEN=30, STR=31, LIST=32, 
		APPEND=33, DEF=34, NUMBER=35, VAR=36, NL=37, COMMENT=38, SPACE=39, INDENT=40, 
		DEDENT=41;
	public static final int
		RULE_program = 0, RULE_function = 1, RULE_main = 2, RULE_statement = 3, 
		RULE_st_return = 4, RULE_st_call = 5, RULE_st_new_list = 6, RULE_st_list_append = 7, 
		RULE_st_list_attrib = 8, RULE_st_print = 9, RULE_st_attrib = 10, RULE_arguments = 11, 
		RULE_parameters = 12, RULE_expression = 13, RULE_term = 14, RULE_factor = 15, 
		RULE_st_if = 16, RULE_st_while = 17, RULE_comparison = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "function", "main", "statement", "st_return", "st_call", "st_new_list", 
			"st_list_append", "st_list_attrib", "st_print", "st_attrib", "arguments", 
			"parameters", "expression", "term", "factor", "st_if", "st_while", "comparison"
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
			"APPEND", "DEF", "NUMBER", "VAR", "NL", "COMMENT", "SPACE", "INDENT", 
			"DEDENT"
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

	@Override
	public String getGrammarFileName() { return "Sauro.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    private static int stack_cur = 0, stack_max = 0;
	    private static int countParm = 0;
	    private static String param = "";
	    private static ArrayList<String> symbol_table;
	    private static ArrayList<Character> type_table;
	    private static ArrayList<String> error_table;
	    private static int count_if = 0;
	    private static int count_while = 0;
	    private static String exp_type = "";
	    private static boolean is_return = false;
	    private static boolean entrou_return = false;

	    private static ArrayList<String> param_table;
	    private static ArrayList<String> param_return_table;
	    private static ArrayList<String> param_count_table;

	    public static void emit(String bytecode, int delta) 
	    {
	        System.out.println(" " + bytecode);
	        stack_cur += delta;
	        if (stack_cur > stack_max) { stack_max = stack_cur; }
	    }

	    public static void main(String[] args) throws Exception
	    {
	        CharStream input = CharStreams.fromStream(System.in);
	        SauroLexer lexer = new SauroLexer(input);
	        CommonTokenStream tokens = new CommonTokenStream(lexer);
	        SauroParser parser = new SauroParser(tokens);
	    
	        symbol_table = new ArrayList<String>();
	        //symbol_table.add("args"); 

	        type_table = new ArrayList<Character>(); 
	        //type_table.add('-'); // 0

	        error_table = new ArrayList<String>(); 

	        param_table = new ArrayList<String>(); 
	        param_return_table = new ArrayList<String>(); 
	        param_count_table = new ArrayList<String>(); 

	        parser.program();
	        System.out.println("; symbols: " + symbol_table);
	        System.out.println("; types: " + type_table);
	        if(!error_table.isEmpty()){
	            System.err.println(error_table);
	            System.exit(1);
	        }
	        
	    }

	public SauroParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			        System.out.println(".source Test.j");
			        System.out.println(".class  public Test");
			        System.out.println(".super  java/lang/Object\n");
			        System.out.println(".method public <init>()V");
			        System.out.println("    aload_0");
			        System.out.println("    invokenonvirtual java/lang/Object/<init>()V");
			        System.out.println("    return");
			        System.out.println(".end method\n");
			    
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEF) {
				{
				{
				setState(39);
				function();
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45);
			main();
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

	public static class FunctionContext extends ParserRuleContext {
		public Token VAR;
		public TerminalNode DEF() { return getToken(SauroParser.DEF, 0); }
		public TerminalNode VAR() { return getToken(SauroParser.VAR, 0); }
		public TerminalNode OP_PAR() { return getToken(SauroParser.OP_PAR, 0); }
		public TerminalNode CL_PAR() { return getToken(SauroParser.CL_PAR, 0); }
		public TerminalNode COLON() { return getToken(SauroParser.COLON, 0); }
		public TerminalNode INDENT() { return getToken(SauroParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(SauroParser.DEDENT, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode INT() { return getToken(SauroParser.INT, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(DEF);
			setState(48);
			((FunctionContext)_localctx).VAR = match(VAR);
			setState(49);
			match(OP_PAR);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(50);
				parameters();
				}
			}

			setState(53);
			match(CL_PAR);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT) {
				{
				setState(54);
				match(INT);
				 is_return = true; 
				}
			}

			setState(58);
			match(COLON);
			                      
			        if(param_table.contains((((FunctionContext)_localctx).VAR!=null?((FunctionContext)_localctx).VAR.getText():null))){
			            error_table.add("Função "+(((FunctionContext)_localctx).VAR!=null?((FunctionContext)_localctx).VAR.getText():null)+" ja foi declarada.");
			        }
			        for(int i = 0; i < countParm; i++){
			           param += "I";
			        }  
			        param_table.add((((FunctionContext)_localctx).VAR!=null?((FunctionContext)_localctx).VAR.getText():null));
			        param_count_table.add(param);
			        param_return_table.add(is_return ? "I" : "V");

			        System.out.println(".method public static " +(((FunctionContext)_localctx).VAR!=null?((FunctionContext)_localctx).VAR.getText():null)+ "("+param_count_table.get(param_table.indexOf( (((FunctionContext)_localctx).VAR!=null?((FunctionContext)_localctx).VAR.getText():null) ))+")" + (is_return ? "I" : "V")); 
			    
			setState(60);
			match(INDENT);
			setState(62); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(61);
				statement();
				}
				}
				setState(64); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << RETURN) | (1L << WHILE) | (1L << VAR) | (1L << NL))) != 0) );
			   
			        if(is_return && !entrou_return){
			            error_table.add("A função espera retorno.");
			        }
			        System.out.println("return");
			        System.out.println(".limit locals " + symbol_table.size());
			        System.out.println(".limit stack " + stack_max);
			        System.out.println(".end method\n");
			        
			        symbol_table = new ArrayList<String>();
			        type_table = new ArrayList<Character>();
			        stack_max = 0;
			        stack_cur = 0;
			        countParm = 0;
			        param = "";
			    
			setState(67);
			match(DEDENT);
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

	public static class MainContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 
			        symbol_table.add("args"); 
			        type_table.add('-');
			        System.out.println(".method public static main([Ljava/lang/String;)V\n"); 
			    
			setState(71); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(70);
				statement();
				}
				}
				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << RETURN) | (1L << WHILE) | (1L << VAR) | (1L << NL))) != 0) );

			        System.out.println("return");
			        System.out.println(".limit locals " + symbol_table.size());
			        System.out.println(".limit stack " + stack_max);
			        System.out.println(".end method");
			        
			        symbol_table = new ArrayList<String>();
			        type_table = new ArrayList<Character>();
			    
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

	public static class StatementContext extends ParserRuleContext {
		public St_printContext st_print() {
			return getRuleContext(St_printContext.class,0);
		}
		public St_attribContext st_attrib() {
			return getRuleContext(St_attribContext.class,0);
		}
		public St_ifContext st_if() {
			return getRuleContext(St_ifContext.class,0);
		}
		public St_whileContext st_while() {
			return getRuleContext(St_whileContext.class,0);
		}
		public St_returnContext st_return() {
			return getRuleContext(St_returnContext.class,0);
		}
		public St_callContext st_call() {
			return getRuleContext(St_callContext.class,0);
		}
		public St_new_listContext st_new_list() {
			return getRuleContext(St_new_listContext.class,0);
		}
		public St_list_appendContext st_list_append() {
			return getRuleContext(St_list_appendContext.class,0);
		}
		public St_list_attribContext st_list_attrib() {
			return getRuleContext(St_list_attribContext.class,0);
		}
		public TerminalNode NL() { return getToken(SauroParser.NL, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				st_print();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				st_attrib();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				st_if();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(80);
				st_while();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(81);
				st_return();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(82);
				st_call();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(83);
				st_new_list();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(84);
				st_list_append();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(85);
				st_list_attrib();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(86);
				match(NL);
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

	public static class St_returnContext extends ParserRuleContext {
		public ExpressionContext e;
		public TerminalNode RETURN() { return getToken(SauroParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public St_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).enterSt_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).exitSt_return(this);
		}
	}

	public final St_returnContext st_return() throws RecognitionException {
		St_returnContext _localctx = new St_returnContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_st_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(RETURN);
			setState(90);
			((St_returnContext)_localctx).e = expression();

			        entrou_return = true;
			        if(is_return){
			            if(((St_returnContext)_localctx).e.type != 'i'){
			                error_table.add("Retorno precisa ser do tipo inteiro.");
			            }
			            emit("    ireturn\n", -1);
			        } else {
			            error_table.add("Funçao void não tem retorno.");
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

	public static class St_callContext extends ParserRuleContext {
		public Token VAR;
		public ArgumentsContext a;
		public TerminalNode VAR() { return getToken(SauroParser.VAR, 0); }
		public TerminalNode OP_PAR() { return getToken(SauroParser.OP_PAR, 0); }
		public TerminalNode CL_PAR() { return getToken(SauroParser.CL_PAR, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public St_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).enterSt_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).exitSt_call(this);
		}
	}

	public final St_callContext st_call() throws RecognitionException {
		St_callContext _localctx = new St_callContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_st_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			((St_callContext)_localctx).VAR = match(VAR);
			setState(94);
			match(OP_PAR);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_PAR) | (1L << READ_INT) | (1L << READ_STR) | (1L << STRING) | (1L << LEN) | (1L << STR) | (1L << NUMBER) | (1L << VAR))) != 0)) {
				{
				setState(95);
				((St_callContext)_localctx).a = arguments();
				}
			}

			setState(98);
			match(CL_PAR);
			   
			        if(param_return_table.get( param_table.indexOf( (((St_callContext)_localctx).VAR!=null?((St_callContext)_localctx).VAR.getText():null) )).equals("I")){
			            error_table.add("Valor de retorno não pode ser ignorado.");
			        }
			        String buff[] = (((St_callContext)_localctx).a!=null?_input.getText(((St_callContext)_localctx).a.start,((St_callContext)_localctx).a.stop):null).split(",");
			        int args_count = param_count_table.get( param_table.indexOf( (((St_callContext)_localctx).VAR!=null?((St_callContext)_localctx).VAR.getText():null) )).length();
			        if(param_table.contains((((St_callContext)_localctx).VAR!=null?((St_callContext)_localctx).VAR.getText():null))){
			            is_return = false;
			            if(args_count != buff.length){
			                error_table.add("Número de argumentos incorreto.");
			            }
			            emit("invokestatic Test/"+(((St_callContext)_localctx).VAR!=null?((St_callContext)_localctx).VAR.getText():null)+"("+param_count_table.get(param_table.indexOf( (((St_callContext)_localctx).VAR!=null?((St_callContext)_localctx).VAR.getText():null) ))+")V\n", 0);
			        } else {
			            error_table.add("Função "+(((St_callContext)_localctx).VAR!=null?((St_callContext)_localctx).VAR.getText():null)+" não foi declarada.");
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

	public static class St_new_listContext extends ParserRuleContext {
		public Token VAR;
		public TerminalNode VAR() { return getToken(SauroParser.VAR, 0); }
		public TerminalNode ATTRIB() { return getToken(SauroParser.ATTRIB, 0); }
		public TerminalNode LIST() { return getToken(SauroParser.LIST, 0); }
		public TerminalNode OP_PAR() { return getToken(SauroParser.OP_PAR, 0); }
		public TerminalNode CL_PAR() { return getToken(SauroParser.CL_PAR, 0); }
		public St_new_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_new_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).enterSt_new_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).exitSt_new_list(this);
		}
	}

	public final St_new_listContext st_new_list() throws RecognitionException {
		St_new_listContext _localctx = new St_new_listContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_st_new_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			((St_new_listContext)_localctx).VAR = match(VAR);
			setState(102);
			match(ATTRIB);
			setState(103);
			match(LIST);
			setState(104);
			match(OP_PAR);
			setState(105);
			match(CL_PAR);
			 
			         emit("new List", 1);
			         
			         if (symbol_table.contains( (((St_new_listContext)_localctx).VAR!=null?((St_new_listContext)_localctx).VAR.getText():null) )){ //se tipo o for mesmo
			            error_table.add("Erro! Variável já foi declarada.(LIST)");
			         }

			         symbol_table.add((((St_new_listContext)_localctx).VAR!=null?((St_new_listContext)_localctx).VAR.getText():null));
			         type_table.add('l');

			         emit("dup", 1);
			         emit("invokespecial List/<init>()V", -1);
			         emit("astore " + symbol_table.indexOf((((St_new_listContext)_localctx).VAR!=null?((St_new_listContext)_localctx).VAR.getText():null)), -1);
			         System.out.println();
			     
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

	public static class St_list_appendContext extends ParserRuleContext {
		public Token VAR;
		public TermContext t1;
		public TerminalNode VAR() { return getToken(SauroParser.VAR, 0); }
		public TerminalNode DOT() { return getToken(SauroParser.DOT, 0); }
		public TerminalNode APPEND() { return getToken(SauroParser.APPEND, 0); }
		public TerminalNode OP_PAR() { return getToken(SauroParser.OP_PAR, 0); }
		public TerminalNode CL_PAR() { return getToken(SauroParser.CL_PAR, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public St_list_appendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_list_append; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).enterSt_list_append(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).exitSt_list_append(this);
		}
	}

	public final St_list_appendContext st_list_append() throws RecognitionException {
		St_list_appendContext _localctx = new St_list_appendContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_st_list_append);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			((St_list_appendContext)_localctx).VAR = match(VAR);
			setState(109);
			match(DOT);
			setState(110);
			match(APPEND);
			setState(111);
			match(OP_PAR);
			  int address;
			       if(symbol_table.contains((((St_list_appendContext)_localctx).VAR!=null?((St_list_appendContext)_localctx).VAR.getText():null))){
			            address = symbol_table.indexOf((((St_list_appendContext)_localctx).VAR!=null?((St_list_appendContext)_localctx).VAR.getText():null));
			            emit("aload "+ address, 1);   
			       } else {
			            error_table.add("Erro! A variável lista não foi instanciada.(LIST_APPEND)");
			       }
			         
			    
			setState(113);
			((St_list_appendContext)_localctx).t1 = term();
			     
			        if(!(((St_list_appendContext)_localctx).t1.type == 'i')){ 
			            error_table.add("Erro! Só é possível adicionar inteiros.(LIST_APPEND)");  
			        }
			        emit("invokevirtual List/append(I)V ", -2);
			        System.out.println();
			    
			setState(115);
			match(CL_PAR);
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

	public static class St_list_attribContext extends ParserRuleContext {
		public Token VAR;
		public Token n1;
		public Token n2;
		public List<TerminalNode> VAR() { return getTokens(SauroParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(SauroParser.VAR, i);
		}
		public TerminalNode OP_BRA() { return getToken(SauroParser.OP_BRA, 0); }
		public TerminalNode CL_BRA() { return getToken(SauroParser.CL_BRA, 0); }
		public TerminalNode ATTRIB() { return getToken(SauroParser.ATTRIB, 0); }
		public TerminalNode NUMBER() { return getToken(SauroParser.NUMBER, 0); }
		public St_list_attribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_list_attrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).enterSt_list_attrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).exitSt_list_attrib(this);
		}
	}

	public final St_list_attribContext st_list_attrib() throws RecognitionException {
		St_list_attribContext _localctx = new St_list_attribContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_st_list_attrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			((St_list_attribContext)_localctx).VAR = match(VAR);
			setState(118);
			match(OP_BRA);
			setState(119);
			((St_list_attribContext)_localctx).n1 = match(VAR);
			setState(120);
			match(CL_BRA);
			setState(121);
			match(ATTRIB);
			setState(122);
			((St_list_attribContext)_localctx).n2 = match(NUMBER);

			        if((((St_list_attribContext)_localctx).n1!=null?((St_list_attribContext)_localctx).n1.getType():0) != 'i'){
			            error_table.add("Index da lista precisa ser um inteiro");
			        }
			        if((((St_list_attribContext)_localctx).VAR!=null?((St_list_attribContext)_localctx).VAR.getType():0) != 'l'){
			            error_table.add("Variável não é uma lista.");
			        }
			        if(type_table.get( symbol_table.indexOf( (((St_list_attribContext)_localctx).VAR!=null?((St_list_attribContext)_localctx).VAR.getText():null) ) ) == 'l' ){
			            emit("aload " + symbol_table.indexOf((((St_list_attribContext)_localctx).VAR!=null?((St_list_attribContext)_localctx).VAR.getText():null)), 1 );
			        }
			        System.out.println(" ldc " + (((St_list_attribContext)_localctx).n1!=null?((St_list_attribContext)_localctx).n1.getText():null));
			        System.out.println(" ldc " + (((St_list_attribContext)_localctx).n2!=null?((St_list_attribContext)_localctx).n2.getText():null));
			        emit("invokevirtual List/set(II)V", -3);
			        System.out.println();
			     
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

	public static class St_printContext extends ParserRuleContext {
		public ExpressionContext e1;
		public ExpressionContext e2;
		public TerminalNode PRINT() { return getToken(SauroParser.PRINT, 0); }
		public TerminalNode OP_PAR() { return getToken(SauroParser.OP_PAR, 0); }
		public TerminalNode CL_PAR() { return getToken(SauroParser.CL_PAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SauroParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SauroParser.COMMA, i);
		}
		public St_printContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).enterSt_print(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).exitSt_print(this);
		}
	}

	public final St_printContext st_print() throws RecognitionException {
		St_printContext _localctx = new St_printContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_st_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(PRINT);
			setState(126);
			match(OP_PAR);
			 emit("getstatic java/lang/System/out Ljava/io/PrintStream;", 1);  
			setState(128);
			((St_printContext)_localctx).e1 = expression();

			       if(((St_printContext)_localctx).e1.type == 'i'){
			           emit("invokevirtual java/io/PrintStream/println(I)V\n", -2); 
			       } else if(((St_printContext)_localctx).e1.type == 'a'){
			           emit("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V\n", -2); 
			       } else if(((St_printContext)_localctx).e1.type == 'l'){
			            if(exp_type.contains("len") || exp_type.contains("point")){
			                System.out.println(" invokevirtual java/io/PrintStream/println(I)V"); 
			           } else if(exp_type.contains("str")){
			                System.out.println(" invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V"); 
			           } 
			           System.out.println();
			       } 
			   
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(130);
				match(COMMA);
				 emit("getstatic java/lang/System/out Ljava/io/PrintStream;", 2); 
				setState(132);
				((St_printContext)_localctx).e2 = expression();

				       if(((St_printContext)_localctx).e2.type == 'i'){
				           emit("invokevirtual java/io/PrintStream/println(I)V\n", -2); 
				       } else if(((St_printContext)_localctx).e2.type == 'a') {
				           emit("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V\n", -2); 
				       } else if(((St_printContext)_localctx).e1.type == 'l'){
				           if(exp_type.contains("len") || exp_type.contains("point")){
				                System.out.println("invokevirtual java/io/PrintStream/println(I)V"); 
				           } else if(exp_type.contains("str")){
				                System.out.println("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V"); 
				           } 
				           System.out.println();
				       } 
				   
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
			match(CL_PAR);
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

	public static class St_attribContext extends ParserRuleContext {
		public Token VAR;
		public ExpressionContext e;
		public TerminalNode VAR() { return getToken(SauroParser.VAR, 0); }
		public TerminalNode ATTRIB() { return getToken(SauroParser.ATTRIB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public St_attribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_attrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).enterSt_attrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).exitSt_attrib(this);
		}
	}

	public final St_attribContext st_attrib() throws RecognitionException {
		St_attribContext _localctx = new St_attribContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_st_attrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			((St_attribContext)_localctx).VAR = match(VAR);
			setState(143);
			match(ATTRIB);
			setState(144);
			((St_attribContext)_localctx).e = expression();

			       int address;

			       if(!symbol_table.contains((((St_attribContext)_localctx).VAR!=null?((St_attribContext)_localctx).VAR.getText():null))){
			           /*adiciona na tabela de simbolos e tipos*/
			           symbol_table.add((((St_attribContext)_localctx).VAR!=null?((St_attribContext)_localctx).VAR.getText():null));
			           type_table.add(((St_attribContext)_localctx).e.type); 
			        
			           address = symbol_table.indexOf((((St_attribContext)_localctx).VAR!=null?((St_attribContext)_localctx).VAR.getText():null));

			           if(((St_attribContext)_localctx).e.type == 'i'){
			                emit("    istore "+ address +"\n", -1);  
			           } else {
			                emit("    astore "+ address +"\n", -1);  
			           }        
			       } else {
			            if (type_table.get( symbol_table.indexOf( (((St_attribContext)_localctx).VAR!=null?((St_attribContext)_localctx).VAR.getText():null) )) == ((St_attribContext)_localctx).e.type){ //se tipo o for mesmo
			                address = symbol_table.indexOf((((St_attribContext)_localctx).VAR!=null?((St_attribContext)_localctx).VAR.getText():null));
			                emit("    istore "+ address +"\n", -1);   

			            } else if(type_table.get( symbol_table.indexOf( (((St_attribContext)_localctx).VAR!=null?((St_attribContext)_localctx).VAR.getText():null) )) == 'l'){
			                 error_table.add("Erro! Variável é uma lista.(ATTRIB)");
			            } else { //se tipo o for diferente
			                error_table.add("Erro! Não é possível mudar o tipo da variável.(ATTRIB)");
			            }
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

	public static class ArgumentsContext extends ParserRuleContext {
		public ExpressionContext e1;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SauroParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SauroParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			((ArgumentsContext)_localctx).e1 = expression();
			 
			        if(((ArgumentsContext)_localctx).e1.type != 'i'){
			            error_table.add("Os parâmetros devem ser do tipo inteiro.");
			        }
			    
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(149);
				match(COMMA);
				setState(150);
				expression();
				}
				}
				setState(155);
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

	public static class ParametersContext extends ParserRuleContext {
		public Token v1;
		public Token v2;
		public List<TerminalNode> VAR() { return getTokens(SauroParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(SauroParser.VAR, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SauroParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SauroParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			((ParametersContext)_localctx).v1 = match(VAR);

			        if(symbol_table.contains((((ParametersContext)_localctx).v1!=null?((ParametersContext)_localctx).v1.getText():null))){
			            error_table.add("Parâmetro deve ser único");
			        }
			        symbol_table.add((((ParametersContext)_localctx).v1!=null?((ParametersContext)_localctx).v1.getText():null));
			        type_table.add('i'); 
			        countParm++;
			    
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(158);
				match(COMMA);
				setState(159);
				((ParametersContext)_localctx).v2 = match(VAR);

				        if(symbol_table.contains((((ParametersContext)_localctx).v2!=null?((ParametersContext)_localctx).v2.getText():null))){
				            error_table.add("Parâmetro deve ser único");
				        }
				        symbol_table.add((((ParametersContext)_localctx).v2!=null?((ParametersContext)_localctx).v2.getText():null));
				        type_table.add('i'); 
				        countParm++;
				   
				}
				}
				setState(165);
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

	public static class ExpressionContext extends ParserRuleContext {
		public char type;
		public TermContext t1;
		public Token op;
		public TermContext t2;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(SauroParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SauroParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(SauroParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(SauroParser.MINUS, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			((ExpressionContext)_localctx).t1 = term();
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(167);
				((ExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(168);
				((ExpressionContext)_localctx).t2 = term();
				 
				    if(((ExpressionContext)_localctx).t1.type == 'i' && ((ExpressionContext)_localctx).t2.type == 'i'){
				        emit(((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getType():0) == PLUS) ? "    iadd" : "    isub", -1);
				   } else {
				        error_table.add("Não é possivel operar variáveis de tipos distintos.(EXPRESSION)");
				   } 

				   
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((ExpressionContext)_localctx).type =  ((ExpressionContext)_localctx).t1.type;
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
		public char type;
		public FactorContext f1;
		public Token op;
		public FactorContext f2;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> TIMES() { return getTokens(SauroParser.TIMES); }
		public TerminalNode TIMES(int i) {
			return getToken(SauroParser.TIMES, i);
		}
		public List<TerminalNode> OVER() { return getTokens(SauroParser.OVER); }
		public TerminalNode OVER(int i) {
			return getToken(SauroParser.OVER, i);
		}
		public List<TerminalNode> REMAINDER() { return getTokens(SauroParser.REMAINDER); }
		public TerminalNode REMAINDER(int i) {
			return getToken(SauroParser.REMAINDER, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			((TermContext)_localctx).f1 = factor();
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << OVER) | (1L << REMAINDER))) != 0)) {
				{
				{
				setState(179);
				((TermContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << OVER) | (1L << REMAINDER))) != 0)) ) {
					((TermContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(180);
				((TermContext)_localctx).f2 = factor();

				       if(((TermContext)_localctx).f1.type == 'i' && ((TermContext)_localctx).f2.type == 'i'){
				            if((((TermContext)_localctx).op!=null?((TermContext)_localctx).op.getType():0) == TIMES){emit("    imul", -1);}
				            if((((TermContext)_localctx).op!=null?((TermContext)_localctx).op.getType():0) == OVER){emit("    idiv", -1);}
				            if((((TermContext)_localctx).op!=null?((TermContext)_localctx).op.getType():0) == REMAINDER){emit("    irem", -1);}
				       } else {
				            error_table.add("Não é possivel operar variáveis de tipos distintos.(TERM)");
				       }
				      
				   
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 ((TermContext)_localctx).type =  ((TermContext)_localctx).f1.type;
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
		public char type;
		public Token NUMBER;
		public ExpressionContext e;
		public Token VAR;
		public Token STRING;
		public TerminalNode NUMBER() { return getToken(SauroParser.NUMBER, 0); }
		public TerminalNode OP_PAR() { return getToken(SauroParser.OP_PAR, 0); }
		public TerminalNode CL_PAR() { return getToken(SauroParser.CL_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode VAR() { return getToken(SauroParser.VAR, 0); }
		public TerminalNode READ_INT() { return getToken(SauroParser.READ_INT, 0); }
		public TerminalNode READ_STR() { return getToken(SauroParser.READ_STR, 0); }
		public TerminalNode STRING() { return getToken(SauroParser.STRING, 0); }
		public TerminalNode LEN() { return getToken(SauroParser.LEN, 0); }
		public TerminalNode STR() { return getToken(SauroParser.STR, 0); }
		public TerminalNode OP_BRA() { return getToken(SauroParser.OP_BRA, 0); }
		public TerminalNode CL_BRA() { return getToken(SauroParser.CL_BRA, 0); }
		public List<ArgumentsContext> arguments() {
			return getRuleContexts(ArgumentsContext.class);
		}
		public ArgumentsContext arguments(int i) {
			return getRuleContext(ArgumentsContext.class,i);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_factor);
		int _la;
		try {
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				((FactorContext)_localctx).NUMBER = match(NUMBER);
				 ((FactorContext)_localctx).type =  'i'; emit("ldc " + (((FactorContext)_localctx).NUMBER!=null?((FactorContext)_localctx).NUMBER.getText():null), 1); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				match(OP_PAR);
				setState(193);
				((FactorContext)_localctx).e = expression();
				setState(194);
				match(CL_PAR);
				 ((FactorContext)_localctx).type =  ((FactorContext)_localctx).e.type; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(197);
				((FactorContext)_localctx).VAR = match(VAR);
				   
				                if ( type_table.get( symbol_table.indexOf( (((FactorContext)_localctx).VAR!=null?((FactorContext)_localctx).VAR.getText():null) ) ) == 'i' ) { 
				                    ((FactorContext)_localctx).type =  'i';

				                    emit( "    iload " + symbol_table.indexOf((((FactorContext)_localctx).VAR!=null?((FactorContext)_localctx).VAR.getText():null)), 1 );
				                     
				                }
				    
				                else if ( type_table.get( symbol_table.indexOf( (((FactorContext)_localctx).VAR!=null?((FactorContext)_localctx).VAR.getText():null) ) ) == 'a' ) { 
				                    ((FactorContext)_localctx).type =  'a';
				    
				                    emit( "    aload " + symbol_table.indexOf((((FactorContext)_localctx).VAR!=null?((FactorContext)_localctx).VAR.getText():null)), 1 );
				                } 
				            
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(199);
				match(READ_INT);
				setState(200);
				match(OP_PAR);
				setState(201);
				match(CL_PAR);
				 ((FactorContext)_localctx).type =  'i'; emit("invokestatic Runtime/readInt()I", 1); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(203);
				match(READ_STR);
				setState(204);
				match(OP_PAR);
				setState(205);
				match(CL_PAR);
				 ((FactorContext)_localctx).type =  'a'; emit("invokestatic Runtime/readString()Ljava/lang/String;", 1); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(207);
				((FactorContext)_localctx).STRING = match(STRING);
				 ((FactorContext)_localctx).type =  'a'; emit("ldc " + (((FactorContext)_localctx).STRING!=null?((FactorContext)_localctx).STRING.getText():null), 1); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(209);
				match(LEN);
				setState(210);
				match(OP_PAR);
				setState(211);
				((FactorContext)_localctx).VAR = match(VAR);
				setState(212);
				match(CL_PAR);

				            if(type_table.get( symbol_table.indexOf( (((FactorContext)_localctx).VAR!=null?((FactorContext)_localctx).VAR.getText():null) ) ) == 'l' ){
				                emit( "aload " + symbol_table.indexOf((((FactorContext)_localctx).VAR!=null?((FactorContext)_localctx).VAR.getText():null)), 1 );
				                emit("invokevirtual List/len()I", 0); 
				                ((FactorContext)_localctx).type =  type_table.get( symbol_table.indexOf( (((FactorContext)_localctx).VAR!=null?((FactorContext)_localctx).VAR.getText():null) ));
				                exp_type = "len";
				            }
				        
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(214);
				match(STR);
				setState(215);
				match(OP_PAR);
				setState(216);
				((FactorContext)_localctx).VAR = match(VAR);
				setState(217);
				match(CL_PAR);

				            if(type_table.get( symbol_table.indexOf( (((FactorContext)_localctx).VAR!=null?((FactorContext)_localctx).VAR.getText():null) ) ) == 'l' ){
				                emit( "aload " + symbol_table.indexOf((((FactorContext)_localctx).VAR!=null?((FactorContext)_localctx).VAR.getText():null)), 1 );
				                emit("invokevirtual List/str()Ljava/lang/String;", 0); 
				                ((FactorContext)_localctx).type =  type_table.get( symbol_table.indexOf( (((FactorContext)_localctx).VAR!=null?((FactorContext)_localctx).VAR.getText():null) ));
				                exp_type = "str";
				            }            
				        
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(219);
				((FactorContext)_localctx).VAR = match(VAR);
				setState(220);
				match(OP_BRA);
				setState(221);
				((FactorContext)_localctx).NUMBER = match(NUMBER);
				setState(222);
				match(CL_BRA);

				            if(type_table.get( symbol_table.indexOf( (((FactorContext)_localctx).VAR!=null?((FactorContext)_localctx).VAR.getText():null) ) ) == 'l' ){
				                emit( "aload " + symbol_table.indexOf((((FactorContext)_localctx).VAR!=null?((FactorContext)_localctx).VAR.getText():null)), 1 );
				                System.out.println(" ldc " + (((FactorContext)_localctx).NUMBER!=null?((FactorContext)_localctx).NUMBER.getText():null));
				                emit( "invokevirtual List/get(I)I", -1);
				                ((FactorContext)_localctx).type =  type_table.get( symbol_table.indexOf( (((FactorContext)_localctx).VAR!=null?((FactorContext)_localctx).VAR.getText():null) ));
				                exp_type = "point";
				            }
				        
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(224);
				((FactorContext)_localctx).VAR = match(VAR);
				setState(225);
				match(OP_PAR);
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_PAR) | (1L << READ_INT) | (1L << READ_STR) | (1L << STRING) | (1L << LEN) | (1L << STR) | (1L << NUMBER) | (1L << VAR))) != 0)) {
					{
					{
					setState(226);
					arguments();
					}
					}
					setState(231);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(232);
				match(CL_PAR);

				          if(param_return_table.get( param_table.indexOf( (((FactorContext)_localctx).VAR!=null?((FactorContext)_localctx).VAR.getText():null) )).equals("V")){
				                error_table.add("Função void não tem valor de retorno.");
				          }
				          emit("invokestatic Test/"+(((FactorContext)_localctx).VAR!=null?((FactorContext)_localctx).VAR.getText():null)+"("+param_count_table.get(param_table.indexOf( (((FactorContext)_localctx).VAR!=null?((FactorContext)_localctx).VAR.getText():null) ))+")I", 0);
				          is_return = true;
				          ((FactorContext)_localctx).type =  'i';
				    
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

	public static class St_ifContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SauroParser.IF, 0); }
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SauroParser.COLON, 0); }
		public TerminalNode INDENT() { return getToken(SauroParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(SauroParser.DEDENT, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public St_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).enterSt_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).exitSt_if(this);
		}
	}

	public final St_ifContext st_if() throws RecognitionException {
		St_ifContext _localctx = new St_ifContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_st_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			int local = ++count_if;
			setState(237);
			match(IF);
			setState(238);
			comparison();
			emit("NOT_IF_"+count_if,-2);
			setState(240);
			match(COLON);
			setState(241);
			match(INDENT);
			setState(243); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(242);
				statement();
				}
				}
				setState(245); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << RETURN) | (1L << WHILE) | (1L << VAR) | (1L << NL))) != 0) );
			setState(247);
			match(DEDENT);
			System.out.println("NOT_IF_"+local+":");
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

	public static class St_whileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(SauroParser.WHILE, 0); }
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SauroParser.COLON, 0); }
		public TerminalNode INDENT() { return getToken(SauroParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(SauroParser.DEDENT, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public St_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).enterSt_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).exitSt_while(this);
		}
	}

	public final St_whileContext st_while() throws RecognitionException {
		St_whileContext _localctx = new St_whileContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_st_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(WHILE);
			   int local = ++count_while; 
			        System.out.println("BEGIN_WHILE_"+local+":");
			    
			setState(252);
			comparison();
			setState(253);
			match(COLON);

			        emit(" END_WHILE_" +local, -2);
			    
			setState(255);
			match(INDENT);
			setState(257); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(256);
				statement();
				}
				}
				setState(259); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << RETURN) | (1L << WHILE) | (1L << VAR) | (1L << NL))) != 0) );
			setState(261);
			match(DEDENT);
			 emit("goto BEGIN_WHILE_"+local, 0); 
			 System.out.println("END_WHILE_"+local+":"); 
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

	public static class ComparisonContext extends ParserRuleContext {
		public ExpressionContext e1;
		public Token op;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(SauroParser.EQ, 0); }
		public TerminalNode NE() { return getToken(SauroParser.NE, 0); }
		public TerminalNode GT() { return getToken(SauroParser.GT, 0); }
		public TerminalNode GE() { return getToken(SauroParser.GE, 0); }
		public TerminalNode LT() { return getToken(SauroParser.LT, 0); }
		public TerminalNode LE() { return getToken(SauroParser.LE, 0); }
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).exitComparison(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			((ComparisonContext)_localctx).e1 = expression();
			setState(266);
			((ComparisonContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NE) | (1L << GT) | (1L << GE) | (1L << LT) | (1L << LE))) != 0)) ) {
				((ComparisonContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(267);
			((ComparisonContext)_localctx).e2 = expression();

			        if(((ComparisonContext)_localctx).e1.type == 'i' && ((ComparisonContext)_localctx).e2.type == 'i'){
			            if((((ComparisonContext)_localctx).op!=null?((ComparisonContext)_localctx).op.getType():0) == EQ)      System.out.print("if_icmpne ");//NOT_IF_"+count_if,-2);
			            else if((((ComparisonContext)_localctx).op!=null?((ComparisonContext)_localctx).op.getType():0) == NE) System.out.print("if_icmpeq ");//NOT_IF_"+count_if,-2);
			            else if((((ComparisonContext)_localctx).op!=null?((ComparisonContext)_localctx).op.getType():0) == GT) System.out.print("if_icmple ");//NOT_IF_"+count_if,-2);
			            else if((((ComparisonContext)_localctx).op!=null?((ComparisonContext)_localctx).op.getType():0) == GE) System.out.print("if_icmplt ");//NOT_IF_"+count_if,-2);
			            else if((((ComparisonContext)_localctx).op!=null?((ComparisonContext)_localctx).op.getType():0) == LT) System.out.print("if_icmpge ");//NOT_IF_"+count_if,-2);
			            else if((((ComparisonContext)_localctx).op!=null?((ComparisonContext)_localctx).op.getType():0) == LE) System.out.print("if_icmpgt ");//NOT_IF_"+count_if,-2);
			        } else {
			            error_table.add("Não é possivel operar variáveis de tipos distintos. (WHILE/IF)");
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u0111\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\7\2+\n\2\f\2\16\2.\13\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\5\3\66\n\3\3\3\3\3\3\3\5\3;\n\3\3\3\3\3\3\3\3\3\6\3A\n\3\r\3\16"+
		"\3B\3\3\3\3\3\3\3\4\3\4\6\4J\n\4\r\4\16\4K\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\5\5Z\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\5\7c\n\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\7\13\u008a\n\13\f\13\16\13\u008d\13\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\7\r\u009a\n\r\f\r\16\r\u009d\13\r\3\16"+
		"\3\16\3\16\3\16\3\16\7\16\u00a4\n\16\f\16\16\16\u00a7\13\16\3\17\3\17"+
		"\3\17\3\17\3\17\7\17\u00ae\n\17\f\17\16\17\u00b1\13\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\7\20\u00ba\n\20\f\20\16\20\u00bd\13\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00e6\n\21\f\21\16"+
		"\21\u00e9\13\21\3\21\3\21\5\21\u00ed\n\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\6\22\u00f6\n\22\r\22\16\22\u00f7\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\6\23\u0104\n\23\r\23\16\23\u0105\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\2\2\25\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&\2\5\3\2\13\f\3\2\r\17\3\2\5\n\2\u011d\2(\3\2\2\2\4\61\3\2"+
		"\2\2\6G\3\2\2\2\bY\3\2\2\2\n[\3\2\2\2\f_\3\2\2\2\16g\3\2\2\2\20n\3\2\2"+
		"\2\22w\3\2\2\2\24\177\3\2\2\2\26\u0090\3\2\2\2\30\u0095\3\2\2\2\32\u009e"+
		"\3\2\2\2\34\u00a8\3\2\2\2\36\u00b4\3\2\2\2 \u00ec\3\2\2\2\"\u00ee\3\2"+
		"\2\2$\u00fc\3\2\2\2&\u010b\3\2\2\2(,\b\2\1\2)+\5\4\3\2*)\3\2\2\2+.\3\2"+
		"\2\2,*\3\2\2\2,-\3\2\2\2-/\3\2\2\2.,\3\2\2\2/\60\5\6\4\2\60\3\3\2\2\2"+
		"\61\62\7$\2\2\62\63\7&\2\2\63\65\7\20\2\2\64\66\5\32\16\2\65\64\3\2\2"+
		"\2\65\66\3\2\2\2\66\67\3\2\2\2\67:\7\21\2\289\7\34\2\29;\b\3\1\2:8\3\2"+
		"\2\2:;\3\2\2\2;<\3\2\2\2<=\7\24\2\2=>\b\3\1\2>@\7*\2\2?A\5\b\5\2@?\3\2"+
		"\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2CD\3\2\2\2DE\b\3\1\2EF\7+\2\2F\5\3\2"+
		"\2\2GI\b\4\1\2HJ\5\b\5\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2LM\3\2"+
		"\2\2MN\b\4\1\2N\7\3\2\2\2OZ\5\24\13\2PZ\5\26\f\2QZ\5\"\22\2RZ\5$\23\2"+
		"SZ\5\n\6\2TZ\5\f\7\2UZ\5\16\b\2VZ\5\20\t\2WZ\5\22\n\2XZ\7\'\2\2YO\3\2"+
		"\2\2YP\3\2\2\2YQ\3\2\2\2YR\3\2\2\2YS\3\2\2\2YT\3\2\2\2YU\3\2\2\2YV\3\2"+
		"\2\2YW\3\2\2\2YX\3\2\2\2Z\t\3\2\2\2[\\\7\35\2\2\\]\5\34\17\2]^\b\6\1\2"+
		"^\13\3\2\2\2_`\7&\2\2`b\7\20\2\2ac\5\30\r\2ba\3\2\2\2bc\3\2\2\2cd\3\2"+
		"\2\2de\7\21\2\2ef\b\7\1\2f\r\3\2\2\2gh\7&\2\2hi\7\22\2\2ij\7\"\2\2jk\7"+
		"\20\2\2kl\7\21\2\2lm\b\b\1\2m\17\3\2\2\2no\7&\2\2op\7\25\2\2pq\7#\2\2"+
		"qr\7\20\2\2rs\b\t\1\2st\5\36\20\2tu\b\t\1\2uv\7\21\2\2v\21\3\2\2\2wx\7"+
		"&\2\2xy\7\26\2\2yz\7&\2\2z{\7\27\2\2{|\7\22\2\2|}\7%\2\2}~\b\n\1\2~\23"+
		"\3\2\2\2\177\u0080\7\31\2\2\u0080\u0081\7\20\2\2\u0081\u0082\b\13\1\2"+
		"\u0082\u0083\5\34\17\2\u0083\u008b\b\13\1\2\u0084\u0085\7\23\2\2\u0085"+
		"\u0086\b\13\1\2\u0086\u0087\5\34\17\2\u0087\u0088\b\13\1\2\u0088\u008a"+
		"\3\2\2\2\u0089\u0084\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\7\21"+
		"\2\2\u008f\25\3\2\2\2\u0090\u0091\7&\2\2\u0091\u0092\7\22\2\2\u0092\u0093"+
		"\5\34\17\2\u0093\u0094\b\f\1\2\u0094\27\3\2\2\2\u0095\u0096\5\34\17\2"+
		"\u0096\u009b\b\r\1\2\u0097\u0098\7\23\2\2\u0098\u009a\5\34\17\2\u0099"+
		"\u0097\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2"+
		"\2\2\u009c\31\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\7&\2\2\u009f\u00a5"+
		"\b\16\1\2\u00a0\u00a1\7\23\2\2\u00a1\u00a2\7&\2\2\u00a2\u00a4\b\16\1\2"+
		"\u00a3\u00a0\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6"+
		"\3\2\2\2\u00a6\33\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00af\5\36\20\2\u00a9"+
		"\u00aa\t\2\2\2\u00aa\u00ab\5\36\20\2\u00ab\u00ac\b\17\1\2\u00ac\u00ae"+
		"\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\b\17"+
		"\1\2\u00b3\35\3\2\2\2\u00b4\u00bb\5 \21\2\u00b5\u00b6\t\3\2\2\u00b6\u00b7"+
		"\5 \21\2\u00b7\u00b8\b\20\1\2\u00b8\u00ba\3\2\2\2\u00b9\u00b5\3\2\2\2"+
		"\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be"+
		"\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\b\20\1\2\u00bf\37\3\2\2\2\u00c0"+
		"\u00c1\7%\2\2\u00c1\u00ed\b\21\1\2\u00c2\u00c3\7\20\2\2\u00c3\u00c4\5"+
		"\34\17\2\u00c4\u00c5\7\21\2\2\u00c5\u00c6\b\21\1\2\u00c6\u00ed\3\2\2\2"+
		"\u00c7\u00c8\7&\2\2\u00c8\u00ed\b\21\1\2\u00c9\u00ca\7\32\2\2\u00ca\u00cb"+
		"\7\20\2\2\u00cb\u00cc\7\21\2\2\u00cc\u00ed\b\21\1\2\u00cd\u00ce\7\33\2"+
		"\2\u00ce\u00cf\7\20\2\2\u00cf\u00d0\7\21\2\2\u00d0\u00ed\b\21\1\2\u00d1"+
		"\u00d2\7\36\2\2\u00d2\u00ed\b\21\1\2\u00d3\u00d4\7 \2\2\u00d4\u00d5\7"+
		"\20\2\2\u00d5\u00d6\7&\2\2\u00d6\u00d7\7\21\2\2\u00d7\u00ed\b\21\1\2\u00d8"+
		"\u00d9\7!\2\2\u00d9\u00da\7\20\2\2\u00da\u00db\7&\2\2\u00db\u00dc\7\21"+
		"\2\2\u00dc\u00ed\b\21\1\2\u00dd\u00de\7&\2\2\u00de\u00df\7\26\2\2\u00df"+
		"\u00e0\7%\2\2\u00e0\u00e1\7\27\2\2\u00e1\u00ed\b\21\1\2\u00e2\u00e3\7"+
		"&\2\2\u00e3\u00e7\7\20\2\2\u00e4\u00e6\5\30\r\2\u00e5\u00e4\3\2\2\2\u00e6"+
		"\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2"+
		"\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\7\21\2\2\u00eb\u00ed\b\21\1\2\u00ec"+
		"\u00c0\3\2\2\2\u00ec\u00c2\3\2\2\2\u00ec\u00c7\3\2\2\2\u00ec\u00c9\3\2"+
		"\2\2\u00ec\u00cd\3\2\2\2\u00ec\u00d1\3\2\2\2\u00ec\u00d3\3\2\2\2\u00ec"+
		"\u00d8\3\2\2\2\u00ec\u00dd\3\2\2\2\u00ec\u00e2\3\2\2\2\u00ed!\3\2\2\2"+
		"\u00ee\u00ef\b\22\1\2\u00ef\u00f0\7\30\2\2\u00f0\u00f1\5&\24\2\u00f1\u00f2"+
		"\b\22\1\2\u00f2\u00f3\7\24\2\2\u00f3\u00f5\7*\2\2\u00f4\u00f6\5\b\5\2"+
		"\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8"+
		"\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\7+\2\2\u00fa\u00fb\b\22\1\2\u00fb"+
		"#\3\2\2\2\u00fc\u00fd\7\37\2\2\u00fd\u00fe\b\23\1\2\u00fe\u00ff\5&\24"+
		"\2\u00ff\u0100\7\24\2\2\u0100\u0101\b\23\1\2\u0101\u0103\7*\2\2\u0102"+
		"\u0104\5\b\5\2\u0103\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0103\3\2"+
		"\2\2\u0105\u0106\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\7+\2\2\u0108"+
		"\u0109\b\23\1\2\u0109\u010a\b\23\1\2\u010a%\3\2\2\2\u010b\u010c\5\34\17"+
		"\2\u010c\u010d\t\4\2\2\u010d\u010e\5\34\17\2\u010e\u010f\b\24\1\2\u010f"+
		"\'\3\2\2\2\22,\65:BKYb\u008b\u009b\u00a5\u00af\u00bb\u00e7\u00ec\u00f7"+
		"\u0105";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}