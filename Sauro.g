grammar Sauro;
/*---------------- PARSER INTERNALS ----------------*/

@parser::header
{
    //import java.util.ArrayList;
}

@lexer::members
{
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
}

@parser::members
{
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

PLUS     : '+' ;
MINUS    : '-' ;
TIMES    : '*' ;
OVER     : '/' ;
REMAINDER: '%' ;
OP_PAR   : '(' ;
CL_PAR   : ')' ;
ATTRIB   : '=' ;
COMMA    : ',' ;
COLON    : ':' ;

DOT      : '.' ;
OP_BRA   : '[' ;
CL_BRA   : ']' ;

IF: 'if' ;
PRINT: 'print' ;
READ_INT: 'read_int';
READ_STR: 'read_str';
INT: 'int';
RETURN: 'return';

STRING: '"'~["]* '"' ;

WHILE: 'while';

LEN: 'len';
STR: 'str';
LIST: 'list';
APPEND: 'append';
DEF: 'def';

NUMBER: '0'..'9'+ ;
VAR:    'a'..'z'+ ;

NL: ('\r' ? '\n' ' '*) ;


COMMENT: '#' ~[\r\n]* {skip();} ;

SPACE : (' '|'\t')+ { skip(); } ;




/*---------------- PARSER RULES ----------------*/

program:
    {
        System.out.println(".source Test.j");
        System.out.println(".class  public Test");
        System.out.println(".super  java/lang/Object\n");
        System.out.println(".method public <init>()V");
        System.out.println("    aload_0");
        System.out.println("    invokenonvirtual java/lang/Object/<init>()V");
        System.out.println("    return");
        System.out.println(".end method\n");
    }
    (function)*
    main
;

function:
    DEF VAR OP_PAR (parameters)? CL_PAR (INT{ is_return = true; })? COLON 
    {                      
        if(param_table.contains($VAR.text)){
            error_table.add("Função "+$VAR.text+" ja foi declarada.");
        }
        for(int i = 0; i < countParm; i++){
           param += "I";
        }  
        param_table.add($VAR.text);
        param_count_table.add(param);
        param_return_table.add(is_return ? "I" : "V");

        System.out.println(".method public static " +$VAR.text+ "("+param_count_table.get(param_table.indexOf( $VAR.text ))+")" + (is_return ? "I" : "V")); 
    }
    INDENT ( statement )+
    {   
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
    }
    DEDENT
  

;

main:   
    { 
        symbol_table.add("args"); 
        type_table.add('-');
        System.out.println(".method public static main([Ljava/lang/String;)V\n"); 
    }
    ( statement )+
    {
        System.out.println("return");
        System.out.println(".limit locals " + symbol_table.size());
        System.out.println(".limit stack " + stack_max);
        System.out.println(".end method");
        
        symbol_table = new ArrayList<String>();
        type_table = new ArrayList<Character>();
    }
;

statement:    
   st_print | st_attrib | st_if | st_while | st_return | st_call | st_new_list | st_list_append | st_list_attrib | NL  
;

st_return:
    RETURN e = expression {
        entrou_return = true;
        if(is_return){
            if($e.type != 'i'){
                error_table.add("Retorno precisa ser do tipo inteiro.");
            }
            emit("    ireturn\n", -1);
        } else {
            error_table.add("Funçao void não tem retorno.");
        }
    }
;

st_call:
    VAR OP_PAR (a = arguments)? CL_PAR
    {   
        if(param_return_table.get( param_table.indexOf( $VAR.text )).equals("I")){
            error_table.add("Valor de retorno não pode ser ignorado.");
        }
        String buff[] = $a.text.split(",");
        int args_count = param_count_table.get( param_table.indexOf( $VAR.text )).length();
        if(param_table.contains($VAR.text)){
            is_return = false;
            if(args_count != buff.length){
                error_table.add("Número de argumentos incorreto.");
            }
            emit("invokestatic Test/"+$VAR.text+"("+param_count_table.get(param_table.indexOf( $VAR.text ))+")V\n", 0);
        } else {
            error_table.add("Função "+$VAR.text+" não foi declarada.");
        }
     
    }
;

st_new_list:
     VAR ATTRIB LIST OP_PAR CL_PAR
     { 
         emit("new List", 1);
         
         if (symbol_table.contains( $VAR.text )){ //se tipo o for mesmo
            error_table.add("Erro! Variável já foi declarada.(LIST)");
         }

         symbol_table.add($VAR.text);
         type_table.add('l');

         emit("dup", 1);
         emit("invokespecial List/<init>()V", -1);
         emit("astore " + symbol_table.indexOf($VAR.text), -1);
         System.out.println();
     }
     
;

st_list_append:
    VAR DOT APPEND OP_PAR 
    {  int address;
       if(symbol_table.contains($VAR.text)){
            address = symbol_table.indexOf($VAR.text);
            emit("aload "+ address, 1);   
       } else {
            error_table.add("Erro! A variável lista não foi instanciada.(LIST_APPEND)");
       }
         
    } t1 = term {     
        if(!($t1.type == 'i')){ 
            error_table.add("Erro! Só é possível adicionar inteiros.(LIST_APPEND)");  
        }
        emit("invokevirtual List/append(I)V ", -2);
        System.out.println();
    }
    CL_PAR
;

st_list_attrib:
     VAR OP_BRA n1 = VAR CL_BRA ATTRIB n2 = NUMBER
     {
        if($n1.type != 'i'){
            error_table.add("Index da lista precisa ser um inteiro");
        }
        if(type_table.get( symbol_table.indexOf( $VAR.text ) ) == 'l' ){
            emit("aload " + symbol_table.indexOf($VAR.text), 1 );
        }
        System.out.println(" ldc " + $n1.text);
        System.out.println(" ldc " + $n2.text);
        emit("invokevirtual List/set(II)V", -3);
        System.out.println();
     }    
;

st_print:  
   PRINT OP_PAR /* inicio da expressao ( */
   { emit("getstatic java/lang/System/out Ljava/io/PrintStream;", 1);  }
   e1 = expression
   {
       if($e1.type == 'i'){
           emit("invokevirtual java/io/PrintStream/println(I)V\n", -2); 
       } else if($e1.type == 'a'){
           emit("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V\n", -2); 
       } else if($e1.type == 'l'){
            if(exp_type.contains("len") || exp_type.contains("point")){
                System.out.println(" invokevirtual java/io/PrintStream/println(I)V"); 
           } else if(exp_type.contains("str")){
                System.out.println(" invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V"); 
           } 
           System.out.println();
       } 
   }
   ( COMMA /* enquanto a virgula repete COMMA = , */

   { emit("getstatic java/lang/System/out Ljava/io/PrintStream;", 2); }
   e2 = expression
   {
       if($e2.type == 'i'){
           emit("invokevirtual java/io/PrintStream/println(I)V\n", -2); 
       } else if($e2.type == 'a') {
           emit("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V\n", -2); 
       } else if($e1.type == 'l'){
           if(exp_type.contains("len") || exp_type.contains("point")){
                System.out.println("invokevirtual java/io/PrintStream/println(I)V"); 
           } else if(exp_type.contains("str")){
                System.out.println("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V"); 
           } 
           System.out.println();
       } 
   }
   )*
   CL_PAR /* expressao final ) */
;

st_attrib:
   VAR ATTRIB e = expression
   {
       int address;

       if(!symbol_table.contains($VAR.text)){
           /*adiciona na tabela de simbolos e tipos*/
           symbol_table.add($VAR.text);
           type_table.add($e.type); 
        
           address = symbol_table.indexOf($VAR.text);

           if($e.type == 'i'){
                emit("    istore "+ address +"\n", -1);  
           } else {
                emit("    astore "+ address +"\n", -1);  
           }        
       } else {
            if (type_table.get( symbol_table.indexOf( $VAR.text )) == $e.type){ //se tipo o for mesmo
                address = symbol_table.indexOf($VAR.text);
                emit("    istore "+ address +"\n", -1);   

            } else if(type_table.get( symbol_table.indexOf( $VAR.text )) == 'l'){
                 error_table.add("Erro! Variável é uma lista.(ATTRIB)");
            } else { //se tipo o for diferente
                error_table.add("Erro! Não é possível mudar o tipo da variável.(ATTRIB)");
            }
        }
   }
;

arguments:
    e1 = expression 
    { 
        if($e1.type != 'i'){
            error_table.add("Os parâmetros devem ser do tipo inteiro.");
        }
    }
    (COMMA expression)*
;

parameters:
   v1 = VAR {
        if(symbol_table.contains($v1.text)){
            error_table.add("Parâmetro deve ser único");
        }
        symbol_table.add($v1.text);
        type_table.add('i'); 
        countParm++;
    }
   
   (COMMA /*enquanto houver mais parametros*/
   
   v2 = VAR {
        if(symbol_table.contains($v2.text)){
            error_table.add("Parâmetro deve ser único");
        }
        symbol_table.add($v2.text);
        type_table.add('i'); 
        countParm++;
   })*     
;

expression returns [char type ]:
  t1 = term ( op = ( PLUS | MINUS ) t2 = term
  { 
    if($t1.type == 'i' && $t2.type == 'i'){
        emit(($op.type == PLUS) ? "    iadd" : "    isub", -1);
   } else {
        error_table.add("Não é possivel operar variáveis de tipos distintos.(EXPRESSION)");
   } 

   })*
   {$type = $t1.type;}  
;


term returns [char type]:
  f1 = factor ( op = ( TIMES | OVER | REMAINDER) f2 = factor
   {
       if($f1.type == 'i' && $f2.type == 'i'){
            if($op.type == TIMES){emit("    imul", -1);}
            if($op.type == OVER){emit("    idiv", -1);}
            if($op.type == REMAINDER){emit("    irem", -1);}
       } else {
            error_table.add("Não é possivel operar variáveis de tipos distintos.(TERM)");
       }
      
   })*
  { $type = $f1.type;}
;
 
factor returns [char type]
    :   NUMBER
            { $type = 'i'; emit("ldc " + $NUMBER.text, 1); }
    |   OP_PAR e = expression CL_PAR
            { $type = $e.type; }
    |   VAR
            {   
                if ( type_table.get( symbol_table.indexOf( $VAR.text ) ) == 'i' ) { 
                    $type = 'i';

                    emit( "    iload " + symbol_table.indexOf($VAR.text), 1 );
                     
                }
    
                else if ( type_table.get( symbol_table.indexOf( $VAR.text ) ) == 'a' ) { 
                    $type = 'a';
    
                    emit( "    aload " + symbol_table.indexOf($VAR.text), 1 );
                } 
            }
    |   READ_INT OP_PAR CL_PAR { $type = 'i'; emit("invokestatic Runtime/readInt()I", 1); }
    |   READ_STR OP_PAR CL_PAR { $type = 'a'; emit("invokestatic Runtime/readString()Ljava/lang/String;", 1); }
    |   STRING { $type = 'a'; emit("ldc " + $STRING.text, 1); }
    |   LEN OP_PAR VAR CL_PAR {
            if(type_table.get( symbol_table.indexOf( $VAR.text ) ) == 'l' ){
                emit( "aload " + symbol_table.indexOf($VAR.text), 1 );
                emit("invokevirtual List/len()I", 0); 
                $type = type_table.get( symbol_table.indexOf( $VAR.text ));
                exp_type = "len";
            }
        }
    |   STR OP_PAR VAR CL_PAR {
            if(type_table.get( symbol_table.indexOf( $VAR.text ) ) == 'l' ){
                emit( "aload " + symbol_table.indexOf($VAR.text), 1 );
                emit("invokevirtual List/str()Ljava/lang/String;", 0); 
                $type = type_table.get( symbol_table.indexOf( $VAR.text ));
                exp_type = "str";
            }            
        }
    | VAR OP_BRA NUMBER CL_BRA {
            if(type_table.get( symbol_table.indexOf( $VAR.text ) ) == 'l' ){
                emit( "aload " + symbol_table.indexOf($VAR.text), 1 );
                System.out.println(" ldc " + $NUMBER.text);
                emit( "invokevirtual List/get(I)I", -1);
                $type = type_table.get( symbol_table.indexOf( $VAR.text ));
                exp_type = "point";
            }
        }   
    | VAR OP_PAR (arguments)* CL_PAR {
          if(param_return_table.get( param_table.indexOf( $VAR.text )).equals("V")){
                error_table.add("Função void não tem valor de retorno.");
          }
          emit("invokestatic Test/"+$VAR.text+"("+param_count_table.get(param_table.indexOf( $VAR.text ))+")I", 0);
          is_return = true;
          $type = 'i';
    } 
;

 st_if:
    {int local = ++count_if;}
    IF comparison {emit("NOT_IF_"+count_if,-2);} COLON INDENT (statement) + DEDENT
     {System.out.println("NOT_IF_"+local+":");}  
    ;


st_while:
    WHILE 
    {   int local = ++count_while; 
        System.out.println("BEGIN_WHILE_"+local+":");
    } 
    comparison COLON
    {
        emit(" END_WHILE_" +local, -2);
    }
    INDENT (statement) + DEDENT
    { emit("goto BEGIN_WHILE_"+local, 0); }
    { System.out.println("END_WHILE_"+local+":"); }

;

comparison: 
    e1 = expression op = (EQ|NE|GT|GE|LT|LE ) e2 = expression {
        if($e1.type == 'i' && $e2.type == 'i'){
            if($op.type == EQ)      System.out.print("if_icmpne ");//NOT_IF_"+count_if,-2);
            else if($op.type == NE) System.out.print("if_icmpeq ");//NOT_IF_"+count_if,-2);
            else if($op.type == GT) System.out.print("if_icmple ");//NOT_IF_"+count_if,-2);
            else if($op.type == GE) System.out.print("if_icmplt ");//NOT_IF_"+count_if,-2);
            else if($op.type == LT) System.out.print("if_icmpge ");//NOT_IF_"+count_if,-2);
            else if($op.type == LE) System.out.print("if_icmpgt ");//NOT_IF_"+count_if,-2);
        } else {
            error_table.add("Não é possivel operar variáveis de tipos distintos. (WHILE/IF)");
        }
     }; 

