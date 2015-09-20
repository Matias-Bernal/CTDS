package cup.example;
import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.ComplexSymbolFactory.Location;
import java_cup.runtime.Symbol;
import java.lang.*;
import java.io.InputStreamReader;

%%

%class Lexer
%implements sym
%public
%unicode
%line
%column
%cup
%char
%{
	

    public Lexer(ComplexSymbolFactory sf, java.io.InputStream is){
		this(is);
        symbolFactory = sf;
    }
	public Lexer(ComplexSymbolFactory sf, java.io.Reader reader){
		this(reader);
        symbolFactory = sf;
    }
    
    private StringBuffer sb;
    private ComplexSymbolFactory symbolFactory;
    private int csline,cscolumn;

    public Symbol symbol(String name, int code){
		return symbolFactory.newSymbol(name, code,
						new Location(yyline+1,yycolumn+1, yychar), // -yylength()
						new Location(yyline+1,yycolumn+yylength(), yychar+yylength())
				);
    }
    public Symbol symbol(String name, int code, String lexem){
	return symbolFactory.newSymbol(name, code, 
						new Location(yyline+1, yycolumn +1, yychar), 
						new Location(yyline+1,yycolumn+yylength(), yychar+yylength()), lexem);
    }
    
    protected void emit_warning(String message){
    	System.out.println("scanner warning: " + message + " at : 2 "+ 
    			(yyline+1) + " " + (yycolumn+1) + " " + yychar);
    }
    
    protected void emit_error(String message){
    	System.out.println("scanner error: " + message + " at : 2" + 
    			(yyline+1) + " " + (yycolumn+1) + " " + yychar);
    }
%}

Newline    = \r | \n | \r\n
Whitespace = [ \t\f] | {Newline}
Integer     = [0-9]+

/* floats */
Float =  {FloatT1} | {FloatT2} | {FloatT3}
FloatT1 = [0-9]+ \. [0-9]* 
FloatT2 = \. [0-9]+ 
FloatT3 = [0-9]+

/* comments */
Comment = {TraditionalComment} | {EndOfLineComment}
TraditionalComment = "/*" {CommentContent} \*+ "/"
EndOfLineComment = "//" [^\r\n]* {Newline}
CommentContent = ( [^*] | \*+[^*/] )*


Alpha = [:jletter:]
Alpha_Num = ([:jletterdigit:] | [:jletter:] | "_" )
Id =  {Alpha} {Alpha_Num}*


%eofval{
    return symbolFactory.newSymbol("EOF",EOF);
%eofval}

%state CODESEG

%%  

<YYINITIAL> {

	{Whitespace}	{                             	}
	{Comment}		{								}
	{Id}			{ return symbolFactory.newSymbol("ID", ID, yytext() ); }
 	{Integer}    	{ return symbolFactory.newSymbol("INTEGER_LITERAL", INTEGER_LITERAL, Integer.valueOf(yytext()) ); }
 	{Float}	    	{ return symbolFactory.newSymbol("FLOAT_LITERAL", FLOAT_LITERAL, Float.valueOf(yytext()) ); } /* Salida Repetida? */
	"false"			{ return symbolFactory.newSymbol("FALSE_LITERAL", FALSE_LITERAL); Bolean.valueOf("true") ); }
	"true"			{ return symbolFactory.newSymbol("TRUE_LITERAL", TRUE_LITERAL); Bolean.valueOf("false") ); }

	"boolean"		{ return symbolFactory.newSymbol("BOOLEAN", BOOLEAN}
	"break"			{ return symbolFactory.newSymbol("BREAK", BREAK); }
	"class"			{ return symbolFactory.newSymbol("CLASS", CLASS); }
	"continue"		{ return symbolFactory.newSymbol("CONTINUE", CONTINUE); }
	"else"			{ return symbolFactory.newSymbol("ELSE", ELSE); }
	"float"			{ return symbolFactory.newSymbol("FLOAT", FLOAT); }
	"int"			{ return symbolFactory.newSymbol("INT", INT); }
	"for"			{ return symbolFactory.newSymbol("FOR", FOR); }
	"if"			{ return symbolFactory.newSymbol("IF", IF); }
	"return"		{ return symbolFactory.newSymbol("RETURN", RETURN); }
	"while"			{ return symbolFactory.newSymbol("WHILE", WHILE); }
	"extern"		{ return symbolFactory.newSymbol("EXTERN", EXTERN); }
	"void"			{ return symbolFactory.newSymbol("VOID", VOID); }  

  	"="          	{ return symbolFactory.newSymbol("ASIGNACION", ASIGNACION); }
  	"-="          	{ return symbolFactory.newSymbol("ASIGNACION_RESTA", ASIGNACION_RESTA); }
  	"+="          	{ return symbolFactory.newSymbol("ASIGNACION_SUMA", ASIGNACION_SUMA); }
  	
  	"!"          	{ return symbolFactory.newSymbol("NEGACION", NEGACION); }
  	"("          	{ return symbolFactory.newSymbol("PARENTESIS_IZQUIERDO", PARENTESIS_IZQUIERDO); }
  	")"          	{ return symbolFactory.newSymbol("PARENTESIS_DERECHO", PARENTESIS_DERECHO); }
  	"{"          	{ return symbolFactory.newSymbol("LLAVE_IZQUIERDA", LLAVE_IZQUIERDA); }
  	"}"          	{ return symbolFactory.newSymbol("LLAVE_DERECHA", LLAVE_DERECHA); }
  	"["          	{ return symbolFactory.newSymbol("CORCHETE_IZQUIERDO", CORCHETE_IZQUIERDO); }
  	"]"          	{ return symbolFactory.newSymbol("CORCHETE_DERECHO", CORCHETE_DERECHO); }
  	","          	{ return symbolFactory.newSymbol("COMA", COMA); }
  	"."          	{ return symbolFactory.newSymbol("PUNTO", PUNTO); }
  	";"          	{ return symbolFactory.newSymbol("PUNTOYCOMA", PUNTOYCOMA); }
  	
  	"+"          	{ return symbolFactory.newSymbol("SUMA", SUMA); }
  	"-"          	{ return symbolFactory.newSymbol("RESTA", RESTA); }
  	"*"          	{ return symbolFactory.newSymbol("MULTIPLICACION", MULTIPLICACION); }
	"/"				{ return symbolFactory.newSymbol("DIVISION", DIVISION); }
	"%"				{ return symbolFactory.newSymbol("PORCENTAJE", PORCENTAJE); }

  	"<"          	{ return symbolFactory.newSymbol("MENOR", MENOR); }
  	">"          	{ return symbolFactory.newSymbol("MAYOR", MAYOR); }
	"<="			{ return symbolFactory.newSymbol("MENOR_IGUAL", MENOR_IGUAL); }
	">="			{ return symbolFactory.newSymbol("MAYOR_IGUAL", MAYOR_IGUAL); }

  	"=="          	{ return symbolFactory.newSymbol("IGUAL", IGUAL); }
  	"!="          	{ return symbolFactory.newSymbol("DESIGUAL", DESIGUAL); }

	"&&"			{ return symbolFactory.newSymbol("CONJUNCION", CONJUNCION); }
	"||"			{ return symbolFactory.newSymbol("DISYUNCION", DISYUNCION); }
	
	. 				{ emit_warning("Caracter Illegal: '" +yytext()+"' En ["+yyline+","+yycolumn+"]");}
}

// error fallback
	.|\n          { emit_warning("Caracter Illegal: '" +yytext()+"' En ["+yyline+","+yycolumn+"]");}
