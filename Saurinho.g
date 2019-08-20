grammar Sauro;

/*---------------- PARSER INTERNALS ----------------*/

@parser::header
{
    //import java.util.ArrayList;
}

@lexer::members
{
    private DenterHelper denter = new DenterHelper(NL, SauroParser.INDENT, SauroParser.DEDENT) {
        @Override
        public Token pullToken() {
            return SauroLexer.super.nextToken();
        }
    };

    @Override
    public Token nextToken() {
        return denter.nextToken();
    }
}

@parser::members
{
    private static int stack_cur = 0, stack_max = 0;
    private static ArrayList<String> symbol_table;
    private static int count_if = 0;
    public static void emit(String bytecode, int delta){
    System.out.println("    "+bytecode);
        stack_cur += delta;
        if(stack_cur > stack_max){
            stack_max = stack_cur;
        }
    }

    public static void main(String[] args) throws Exception
    {
        CharStream input = CharStreams.fromStream(System.in);
        SauroLexer lexer = new SauroLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SauroParser parser = new SauroParser(tokens);

        symbol_table = new ArrayList<String>();
        symbol_table.add("args");
        parser.program();
        System.out.println("; symbols: " + symbol_table);
    }
}

/*---------------- LEXER RULES ----------------*/

tokens {INDENT, DEDENT}

OP_CUR   : '{' ; 
CL_CUR  : '}' ;
EQ       : '==';
NE       : '!=';
GT       : '>' ;
GE       : '>=';
LT       : '<' ;
LE       : '<=';

PLUS  : '+' ;
MINUS : '-' ;
TIMES : '*' ;
OVER  : '/' ;
REMAINDER  : '%' ;
OP_PAR: '(' ;
CL_PAR: ')' ;
ATTRIB: '=';
COMMA : ',' ;
COLON : ':';

IF: 'if' ;
WHILE: 'while' ;
PRINT: 'print' ;
READ_INT: 'read_int';

NUMBER: '0'..'9'+ ;
VAR:    'a'..'z'+ ;

NL: ('\r' ? '\n' ' '*) ;

COMMENT: '#' ~[\r\n]* {skip();} ;

SPACE : (' '|'\t')+ { skip(); } ;

/*---------------- PARSER RULES ----------------*/

program
    :   {
            System.out.println(".source Test.j");
            System.out.println(".class public Test");
            System.out.println(".super java/lang/Object\n");
            System.out.println(".method public <init>()V");
            System.out.println("    aload_0");
            System.out.println("    invokenonvirtual java/lang/Object/<init>()V");
            System.out.println("    return");
            System.out.println(".end method\n");
        } 
        main
    ;

main
    : {System.out.println(".method public static main([Ljava/lang/String;)V\n");}
    ( statement )+
    {
        System.out.println("    return");
        System.out.println(".limit locals "+symbol_table.size());
        System.out.println(".limit stack "+stack_max);
        System.out.println(".end method");
    }
    ;

statement:
    st_print | st_attrib | st_if | NL;

st_print:   
    PRINT OP_PAR /* inicio da expressao ( */

    { emit("getstatic java/lang/System/out Ljava/io/PrintStream;", 1);  }
    expression 
    { emit("invokevirtual java/io/PrintStream/println(I)V\n", -2);  }


    ( COMMA /* enquanto a virgula repete COMMA = , */
    
    { emit("getstatic java/lang/System/out Ljava/io/PrintStream;", 2); }
    expression 
    { emit("invokevirtual java/io/PrintStream/println(I)V\n", -2);  }

    )*

    CL_PAR /* expressao final ) */
;

st_attrib:
    VAR ATTRIB expression
    {
        if(!symbol_table.contains($VAR.text)){
            symbol_table.add($VAR.text);
        }
        int address = symbol_table.indexOf($VAR.text);
            emit("    istore "+ address +"\n", -1);
    }
;

expression:
   term ( op = ( PLUS | MINUS ) term 
   {
      emit(($op.type == PLUS) ? "    iadd" : "    isub", -1);  
    })*
;

term:
   factor ( tm = ( TIMES | OVER | REMAINDER) factor 
    {
        if($tm.type == TIMES){emit("    imul", -1);}
        if($tm.type == OVER){emit("    idiv", -1);}
        if($tm.type == REMAINDER){emit("    irem", -1);}
    })*
;

factor:
   NUMBER
    { emit("    ldc " + $NUMBER.text, 1); }
    |   OP_PAR expression CL_PAR
    |   VAR
       {
        if(symbol_table.contains($VAR.text)){
           emit("    iload "+symbol_table.indexOf($VAR.text), 1); 
        }else{
           System.err.println("ERROR -> Variável '"+ $VAR.text +"' não declarada");
           System.exit(1);
        }          
    }
;

st_if:
    {int local = ++count_if;}
    IF comparison + COLON + INDENT (statement) + DEDENT
     {System.out.println("NOT_IF_"+local+":");}  
;

// st_while:
//     {
//         {int local = ++count_if;}
//         WHILE comparison + COLON + INDENT (statement) + DEDENT
//     }
// ;

comparison:
     expression  op = (EQ|NE|GT|GE|LT|LE ) expression {
        if($op.type == EQ) emit("if_icmpne NOT_IF_"+count_if,-2);
        else if($op.type == NE) emit("if_icmpeq NOT_IF_"+count_if,-2);
        else if($op.type == GT) emit("if_icmple NOT_IF_"+count_if,-2);
        else if($op.type == GE) emit("if_icmplt NOT_IF_"+count_if,-2);
        else if($op.type == LT) emit("if_icmpge NOT_IF_"+count_if,-2);
        else if($op.type == LE) emit("if_icmpgt NOT_IF_"+count_if,-2);
    }
;
