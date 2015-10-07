/* The following code was generated by JFlex 1.3.5 on 07/10/15 16:38 */

package cup.example;
import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.ComplexSymbolFactory.Location;
import java_cup.runtime.Symbol;
import java.lang.*;
import java.io.InputStreamReader;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.3.5
 * on 07/10/15 16:38 from the specification file
 * <tt>file:/D:/eclipse/workspace/CTDS/lexer.jflex</tt>
 */
public class Lexer implements sym, java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  final public static int YYEOF = -1;

  /** initial size of the lookahead buffer */
  final private static int YY_BUFFERSIZE = 16384;

  /** lexical states */
  final public static int CODESEG = 1;
  final public static int YYINITIAL = 0;

  /** 
   * Translates characters to character classes
   */
  final private static String yycmap_packed = 
    "\11\11\1\3\1\2\1\0\1\3\1\1\16\11\4\0\1\3\1\40"+
    "\2\0\1\10\1\51\1\54\1\0\1\41\1\42\1\7\1\37\1\47"+
    "\1\36\1\5\1\6\12\4\1\0\1\50\1\52\1\35\1\53\2\0"+
    "\32\10\1\45\1\0\1\46\1\0\1\10\1\0\1\13\1\22\1\26"+
    "\1\34\1\16\1\12\1\10\1\31\1\27\1\10\1\25\1\14\1\10"+
    "\1\24\1\23\2\10\1\20\1\15\1\17\1\21\1\33\1\30\1\32"+
    "\2\10\1\43\1\55\1\44\1\0\41\11\2\0\4\10\4\0\1\10"+
    "\2\0\1\11\7\0\1\10\4\0\1\10\5\0\27\10\1\0\37\10"+
    "\1\0\u01ca\10\4\0\14\10\16\0\5\10\7\0\1\10\1\0\1\10"+
    "\21\0\160\11\5\10\1\0\2\10\2\0\4\10\10\0\1\10\1\0"+
    "\3\10\1\0\1\10\1\0\24\10\1\0\123\10\1\0\213\10\1\0"+
    "\5\11\2\0\236\10\11\0\46\10\2\0\1\10\7\0\47\10\7\0"+
    "\1\10\1\0\55\11\1\0\1\11\1\0\2\11\1\0\2\11\1\0"+
    "\1\11\10\0\33\10\5\0\3\10\15\0\5\11\6\0\1\10\4\0"+
    "\13\11\5\0\53\10\37\11\4\0\2\10\1\11\143\10\1\0\1\10"+
    "\10\11\1\0\6\11\2\10\2\11\1\0\4\11\2\10\12\11\3\10"+
    "\2\0\1\10\17\0\1\11\1\10\1\11\36\10\33\11\2\0\131\10"+
    "\13\11\1\10\16\0\12\11\41\10\11\11\2\10\4\0\1\10\5\0"+
    "\26\10\4\11\1\10\11\11\1\10\3\11\1\10\5\11\22\0\31\10"+
    "\3\11\104\0\1\10\1\0\13\10\67\0\33\11\1\0\4\11\66\10"+
    "\3\11\1\10\22\11\1\10\7\11\12\10\2\11\2\0\12\11\1\0"+
    "\7\10\1\0\7\10\1\0\3\11\1\0\10\10\2\0\2\10\2\0"+
    "\26\10\1\0\7\10\1\0\1\10\3\0\4\10\2\0\1\11\1\10"+
    "\7\11\2\0\2\11\2\0\3\11\1\10\10\0\1\11\4\0\2\10"+
    "\1\0\3\10\2\11\2\0\12\11\4\10\7\0\1\10\5\0\3\11"+
    "\1\0\6\10\4\0\2\10\2\0\26\10\1\0\7\10\1\0\2\10"+
    "\1\0\2\10\1\0\2\10\2\0\1\11\1\0\5\11\4\0\2\11"+
    "\2\0\3\11\3\0\1\11\7\0\4\10\1\0\1\10\7\0\14\11"+
    "\3\10\1\11\13\0\3\11\1\0\11\10\1\0\3\10\1\0\26\10"+
    "\1\0\7\10\1\0\2\10\1\0\5\10\2\0\1\11\1\10\10\11"+
    "\1\0\3\11\1\0\3\11\2\0\1\10\17\0\2\10\2\11\2\0"+
    "\12\11\1\0\1\10\17\0\3\11\1\0\10\10\2\0\2\10\2\0"+
    "\26\10\1\0\7\10\1\0\2\10\1\0\5\10\2\0\1\11\1\10"+
    "\7\11\2\0\2\11\2\0\3\11\10\0\2\11\4\0\2\10\1\0"+
    "\3\10\2\11\2\0\12\11\1\0\1\10\20\0\1\11\1\10\1\0"+
    "\6\10\3\0\3\10\1\0\4\10\3\0\2\10\1\0\1\10\1\0"+
    "\2\10\3\0\2\10\3\0\3\10\3\0\14\10\4\0\5\11\3\0"+
    "\3\11\1\0\4\11\2\0\1\10\6\0\1\11\16\0\12\11\11\0"+
    "\1\10\7\0\3\11\1\0\10\10\1\0\3\10\1\0\27\10\1\0"+
    "\12\10\1\0\5\10\3\0\1\10\7\11\1\0\3\11\1\0\4\11"+
    "\7\0\2\11\1\0\2\10\6\0\2\10\2\11\2\0\12\11\22\0"+
    "\2\11\1\0\10\10\1\0\3\10\1\0\27\10\1\0\12\10\1\0"+
    "\5\10\2\0\1\11\1\10\7\11\1\0\3\11\1\0\4\11\7\0"+
    "\2\11\7\0\1\10\1\0\2\10\2\11\2\0\12\11\1\0\2\10"+
    "\17\0\2\11\1\0\10\10\1\0\3\10\1\0\51\10\2\0\1\10"+
    "\7\11\1\0\3\11\1\0\4\11\1\10\10\0\1\11\10\0\2\10"+
    "\2\11\2\0\12\11\12\0\6\10\2\0\2\11\1\0\22\10\3\0"+
    "\30\10\1\0\11\10\1\0\1\10\2\0\7\10\3\0\1\11\4\0"+
    "\6\11\1\0\1\11\1\0\10\11\22\0\2\11\15\0\60\10\1\11"+
    "\2\10\7\11\4\0\10\10\10\11\1\0\12\11\47\0\2\10\1\0"+
    "\1\10\2\0\2\10\1\0\1\10\2\0\1\10\6\0\4\10\1\0"+
    "\7\10\1\0\3\10\1\0\1\10\1\0\1\10\2\0\2\10\1\0"+
    "\4\10\1\11\2\10\6\11\1\0\2\11\1\10\2\0\5\10\1\0"+
    "\1\10\1\0\6\11\2\0\12\11\2\0\4\10\40\0\1\10\27\0"+
    "\2\11\6\0\12\11\13\0\1\11\1\0\1\11\1\0\1\11\4\0"+
    "\2\11\10\10\1\0\44\10\4\0\24\11\1\0\2\11\5\10\13\11"+
    "\1\0\44\11\11\0\1\11\71\0\53\10\24\11\1\10\12\11\6\0"+
    "\6\10\4\11\4\10\3\11\1\10\3\11\2\10\7\11\3\10\4\11"+
    "\15\10\14\11\1\10\17\11\2\0\46\10\1\0\1\10\5\0\1\10"+
    "\2\0\53\10\1\0\u014d\10\1\0\4\10\2\0\7\10\1\0\1\10"+
    "\1\0\4\10\2\0\51\10\1\0\4\10\2\0\41\10\1\0\4\10"+
    "\2\0\7\10\1\0\1\10\1\0\4\10\2\0\17\10\1\0\71\10"+
    "\1\0\4\10\2\0\103\10\2\0\3\11\40\0\20\10\20\0\125\10"+
    "\14\0\u026c\10\2\0\21\10\1\0\32\10\5\0\113\10\3\0\3\10"+
    "\17\0\15\10\1\0\4\10\3\11\13\0\22\10\3\11\13\0\22\10"+
    "\2\11\14\0\15\10\1\0\3\10\1\0\2\11\14\0\64\10\40\11"+
    "\3\0\1\10\3\0\2\10\1\11\2\0\12\11\41\0\3\11\2\0"+
    "\12\11\6\0\130\10\10\0\51\10\1\11\1\10\5\0\106\10\12\0"+
    "\35\10\3\0\14\11\4\0\14\11\12\0\12\11\36\10\2\0\5\10"+
    "\13\0\54\10\4\0\21\11\7\10\2\11\6\0\12\11\46\0\27\10"+
    "\5\11\4\0\65\10\12\11\1\0\35\11\2\0\13\11\6\0\12\11"+
    "\15\0\1\10\130\0\5\11\57\10\21\11\7\10\4\0\12\11\21\0"+
    "\11\11\14\0\3\11\36\10\15\11\2\10\12\11\54\10\16\11\14\0"+
    "\44\10\24\11\10\0\12\11\3\0\3\10\12\11\44\10\122\0\3\11"+
    "\1\0\25\11\4\10\1\11\4\10\3\11\2\10\11\0\300\10\47\11"+
    "\25\0\4\11\u0116\10\2\0\6\10\2\0\46\10\2\0\6\10\2\0"+
    "\10\10\1\0\1\10\1\0\1\10\1\0\1\10\1\0\37\10\2\0"+
    "\65\10\1\0\7\10\1\0\1\10\3\0\3\10\1\0\7\10\3\0"+
    "\4\10\2\0\6\10\4\0\15\10\5\0\3\10\1\0\7\10\16\0"+
    "\5\11\32\0\5\11\20\0\2\10\23\0\1\10\13\0\5\11\5\0"+
    "\6\11\1\0\1\10\15\0\1\10\20\0\15\10\3\0\33\10\25\0"+
    "\15\11\4\0\1\11\3\0\14\11\21\0\1\10\4\0\1\10\2\0"+
    "\12\10\1\0\1\10\3\0\5\10\6\0\1\10\1\0\1\10\1\0"+
    "\1\10\1\0\4\10\1\0\13\10\2\0\4\10\5\0\5\10\4\0"+
    "\1\10\21\0\51\10\u0a77\0\57\10\1\0\57\10\1\0\205\10\6\0"+
    "\4\10\3\11\2\10\14\0\46\10\1\0\1\10\5\0\1\10\2\0"+
    "\70\10\7\0\1\10\17\0\1\11\27\10\11\0\7\10\1\0\7\10"+
    "\1\0\7\10\1\0\7\10\1\0\7\10\1\0\7\10\1\0\7\10"+
    "\1\0\7\10\1\0\40\11\57\0\1\10\u01d5\0\3\10\31\0\11\10"+
    "\6\11\1\0\5\10\2\0\5\10\4\0\126\10\2\0\2\11\2\0"+
    "\3\10\1\0\132\10\1\0\4\10\5\0\51\10\3\0\136\10\21\0"+
    "\33\10\65\0\20\10\u0200\0\u19b6\10\112\0\u51cd\10\63\0\u048d\10\103\0"+
    "\56\10\2\0\u010d\10\3\0\20\10\12\11\2\10\24\0\57\10\1\11"+
    "\4\0\12\11\1\0\31\10\7\0\1\11\120\10\2\11\45\0\11\10"+
    "\2\0\147\10\2\0\4\10\1\0\4\10\14\0\13\10\115\0\12\10"+
    "\1\11\3\10\1\11\4\10\1\11\27\10\5\11\20\0\1\10\7\0"+
    "\64\10\14\0\2\11\62\10\21\11\13\0\12\11\6\0\22\11\6\10"+
    "\3\0\1\10\4\0\12\11\34\10\10\11\2\0\27\10\15\11\14\0"+
    "\35\10\3\0\4\11\57\10\16\11\16\0\1\10\12\11\46\0\51\10"+
    "\16\11\11\0\3\10\1\11\10\10\2\11\2\0\12\11\6\0\27\10"+
    "\3\0\1\10\1\11\4\0\60\10\1\11\1\10\3\11\2\10\2\11"+
    "\5\10\2\11\1\10\1\11\1\10\30\0\3\10\2\0\13\10\5\11"+
    "\2\0\3\10\2\11\12\0\6\10\2\0\6\10\2\0\6\10\11\0"+
    "\7\10\1\0\7\10\221\0\43\10\10\11\1\0\2\11\2\0\12\11"+
    "\6\0\u2ba4\10\14\0\27\10\4\0\61\10\u2104\0\u016e\10\2\0\152\10"+
    "\46\0\7\10\14\0\5\10\5\0\1\10\1\11\12\10\1\0\15\10"+
    "\1\0\5\10\1\0\1\10\1\0\2\10\1\0\2\10\1\0\154\10"+
    "\41\0\u016b\10\22\0\100\10\2\0\66\10\50\0\15\10\3\0\20\11"+
    "\20\0\7\11\14\0\2\10\30\0\3\10\31\0\1\10\6\0\5\10"+
    "\1\0\207\10\2\0\1\11\4\0\1\10\13\0\12\11\7\0\32\10"+
    "\4\0\1\10\1\0\32\10\13\0\131\10\3\0\6\10\2\0\6\10"+
    "\2\0\6\10\2\0\3\10\3\0\2\10\3\0\2\10\22\0\3\11"+
    "\4\0";

  /** 
   * Translates characters to character classes
   */
  final private static char [] yycmap = yy_unpack_cmap(yycmap_packed);

  /** 
   * Translates a state to a row index in the transition table
   */
  final private static int yy_rowMap [] = { 
        0,    46,    92,   138,    92,   184,   230,   276,    92,   322, 
      368,   414,   460,   506,   552,   598,   644,   690,   736,   782, 
      828,   874,   920,    92,    92,    92,    92,    92,    92,    92, 
       92,    92,   966,  1012,  1058,  1104,   230,  1150,  1196,  1242, 
     1288,  1334,  1380,  1426,  1472,  1518,  1564,  1610,  1656,  1702, 
      322,  1748,  1794,  1840,    92,    92,    92,    92,    92,    92, 
       92,    92,  1886,  1932,  1978,   322,  2024,  2070,  2116,  2162, 
     2208,  2254,  2300,  2346,   322,  2392,  2438,  2484,  2530,   322, 
     2576,   322,  2622,  2668,  2714,  2760,  2806,  2852,   322,   322, 
      322,  2898,  2944,   322,  2990,   322,  3036,   322,   322,   322, 
     3082,  3128,   322,  3174,   322
  };

  /** 
   * The packed transition table of the DFA (part 0)
   */
  final private static String yy_packed0 = 
    "\1\3\1\4\2\5\1\6\1\7\1\10\1\11\1\12"+
    "\1\3\1\13\3\12\1\14\1\15\1\16\1\12\1\17"+
    "\3\12\1\20\1\21\1\22\2\12\1\23\1\12\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34"+
    "\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44"+
    "\56\3\60\0\1\5\57\0\1\6\1\45\54\0\1\45"+
    "\57\0\1\46\1\47\52\0\1\12\3\0\25\12\25\0"+
    "\1\12\3\0\3\12\1\50\1\51\6\12\1\52\11\12"+
    "\25\0\1\12\3\0\4\12\1\53\15\12\1\54\2\12"+
    "\25\0\1\12\3\0\10\12\1\55\14\12\25\0\1\12"+
    "\3\0\6\12\1\56\16\12\25\0\1\12\3\0\10\12"+
    "\1\57\2\12\1\60\11\12\25\0\1\12\3\0\4\12"+
    "\1\61\6\12\1\62\11\12\25\0\1\12\3\0\2\12"+
    "\1\63\11\12\1\64\10\12\25\0\1\12\3\0\21\12"+
    "\1\65\3\12\25\0\1\12\3\0\13\12\1\66\11\12"+
    "\56\0\1\67\55\0\1\70\55\0\1\71\55\0\1\72"+
    "\55\0\1\73\55\0\1\74\74\0\1\75\56\0\1\76"+
    "\1\46\1\4\1\5\53\46\7\47\1\77\46\47\4\0"+
    "\1\12\3\0\4\12\1\100\20\12\25\0\1\12\3\0"+
    "\13\12\1\101\11\12\25\0\1\12\3\0\10\12\1\102"+
    "\14\12\25\0\1\12\3\0\5\12\1\103\17\12\25\0"+
    "\1\12\3\0\7\12\1\104\15\12\25\0\1\12\3\0"+
    "\11\12\1\105\13\12\25\0\1\12\3\0\7\12\1\106"+
    "\15\12\25\0\1\12\3\0\6\12\1\107\16\12\25\0"+
    "\1\12\3\0\13\12\1\110\11\12\25\0\1\12\3\0"+
    "\3\12\1\111\21\12\25\0\1\12\3\0\14\12\1\112"+
    "\10\12\25\0\1\12\3\0\7\12\1\113\15\12\25\0"+
    "\1\12\3\0\17\12\1\114\5\12\25\0\1\12\3\0"+
    "\17\12\1\115\5\12\21\0\6\47\1\5\1\77\46\47"+
    "\4\0\1\12\3\0\5\12\1\116\17\12\25\0\1\12"+
    "\3\0\3\12\1\117\21\12\25\0\1\12\3\0\6\12"+
    "\1\120\16\12\25\0\1\12\3\0\6\12\1\121\16\12"+
    "\25\0\1\12\3\0\6\12\1\122\16\12\25\0\1\12"+
    "\3\0\11\12\1\123\13\12\25\0\1\12\3\0\3\12"+
    "\1\124\21\12\25\0\1\12\3\0\4\12\1\125\20\12"+
    "\25\0\1\12\3\0\5\12\1\126\17\12\25\0\1\12"+
    "\3\0\7\12\1\127\15\12\25\0\1\12\3\0\4\12"+
    "\1\130\20\12\25\0\1\12\3\0\24\12\1\131\25\0"+
    "\1\12\3\0\6\12\1\132\16\12\25\0\1\12\3\0"+
    "\7\12\1\133\15\12\25\0\1\12\3\0\10\12\1\134"+
    "\14\12\25\0\1\12\3\0\10\12\1\135\14\12\25\0"+
    "\1\12\3\0\15\12\1\136\7\12\25\0\1\12\3\0"+
    "\6\12\1\137\16\12\25\0\1\12\3\0\5\12\1\140"+
    "\17\12\25\0\1\12\3\0\17\12\1\141\5\12\25\0"+
    "\1\12\3\0\6\12\1\142\16\12\25\0\1\12\3\0"+
    "\14\12\1\143\10\12\25\0\1\12\3\0\14\12\1\144"+
    "\10\12\25\0\1\12\3\0\3\12\1\145\21\12\25\0"+
    "\1\12\3\0\14\12\1\146\10\12\25\0\1\12\3\0"+
    "\14\12\1\147\10\12\25\0\1\12\3\0\11\12\1\150"+
    "\13\12\25\0\1\12\3\0\6\12\1\151\16\12\21\0";

  /** 
   * The transition table of the DFA
   */
  final private static int yytrans [] = yy_unpack();


  /* error codes */
  final private static int YY_UNKNOWN_ERROR = 0;
  final private static int YY_ILLEGAL_STATE = 1;
  final private static int YY_NO_MATCH = 2;
  final private static int YY_PUSHBACK_2BIG = 3;

  /* error messages for the codes above */
  final private static String YY_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Internal error: unknown state",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * YY_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private final static byte YY_ATTRIBUTE[] = {
     0,  0,  9,  1,  9,  1,  1,  1,  9,  1,  1,  1,  1,  1,  1,  1, 
     1,  1,  1,  1,  1,  1,  1,  9,  9,  9,  9,  9,  9,  9,  9,  9, 
     1,  1,  1,  1,  1,  0,  0,  1,  1,  1,  1,  1,  1,  1,  1,  1, 
     1,  1,  1,  1,  1,  1,  9,  9,  9,  9,  9,  9,  9,  9,  0,  1, 
     1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 
     1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 
     1,  1,  1,  1,  1,  1,  1,  1,  1
  };

  /** the input device */
  private java.io.Reader yy_reader;

  /** the current state of the DFA */
  private int yy_state;

  /** the current lexical state */
  private int yy_lexical_state = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char yy_buffer[] = new char[YY_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int yy_markedPos;

  /** the textposition at the last state to be included in yytext */
  private int yy_pushbackPos;

  /** the current text position in the buffer */
  private int yy_currentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int yy_startRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int yy_endRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn; 

  /** 
   * yy_atBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean yy_atBOL = true;

  /** yy_atEOF == true <=> the scanner is at the EOF */
  private boolean yy_atEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean yy_eof_done;

  /* user code: */
	

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


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.yy_reader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the split, compressed DFA transition table.
   *
   * @return the unpacked transition table
   */
  private static int [] yy_unpack() {
    int [] trans = new int[3220];
    int offset = 0;
    offset = yy_unpack(yy_packed0, offset, trans);
    return trans;
  }

  /** 
   * Unpacks the compressed DFA transition table.
   *
   * @param packed   the packed transition table
   * @return         the index of the last entry
   */
  private static int yy_unpack(String packed, int offset, int [] trans) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do trans[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] yy_unpack_cmap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 2242) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   IOException  if any I/O-Error occurs
   */
  private boolean yy_refill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (yy_startRead > 0) {
      System.arraycopy(yy_buffer, yy_startRead, 
                       yy_buffer, 0, 
                       yy_endRead-yy_startRead);

      /* translate stored positions */
      yy_endRead-= yy_startRead;
      yy_currentPos-= yy_startRead;
      yy_markedPos-= yy_startRead;
      yy_pushbackPos-= yy_startRead;
      yy_startRead = 0;
    }

    /* is the buffer big enough? */
    if (yy_currentPos >= yy_buffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[yy_currentPos*2];
      System.arraycopy(yy_buffer, 0, newBuffer, 0, yy_buffer.length);
      yy_buffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = yy_reader.read(yy_buffer, yy_endRead, 
                                            yy_buffer.length-yy_endRead);

    if (numRead < 0) {
      return true;
    }
    else {
      yy_endRead+= numRead;  
      return false;
    }
  }


  /**
   * Closes the input stream.
   */
  final public void yyclose() throws java.io.IOException {
    yy_atEOF = true;            /* indicate end of file */
    yy_endRead = yy_startRead;  /* invalidate buffer    */

    if (yy_reader != null)
      yy_reader.close();
  }


  /**
   * Closes the current stream, and resets the
   * scanner to read from a new input stream.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>YY_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  final public void yyreset(java.io.Reader reader) throws java.io.IOException {
    yyclose();
    yy_reader = reader;
    yy_atBOL  = true;
    yy_atEOF  = false;
    yy_endRead = yy_startRead = 0;
    yy_currentPos = yy_markedPos = yy_pushbackPos = 0;
    yyline = yychar = yycolumn = 0;
    yy_lexical_state = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  final public int yystate() {
    return yy_lexical_state;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  final public void yybegin(int newState) {
    yy_lexical_state = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  final public String yytext() {
    return new String( yy_buffer, yy_startRead, yy_markedPos-yy_startRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  final public char yycharat(int pos) {
    return yy_buffer[yy_startRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  final public int yylength() {
    return yy_markedPos-yy_startRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void yy_ScanError(int errorCode) {
    String message;
    try {
      message = YY_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = YY_ERROR_MSG[YY_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  private void yypushback(int number)  {
    if ( number > yylength() )
      yy_ScanError(YY_PUSHBACK_2BIG);

    yy_markedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void yy_do_eof() throws java.io.IOException {
    if (!yy_eof_done) {
      yy_eof_done = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int yy_input;
    int yy_action;

    // cached fields:
    int yy_currentPos_l;
    int yy_startRead_l;
    int yy_markedPos_l;
    int yy_endRead_l = yy_endRead;
    char [] yy_buffer_l = yy_buffer;
    char [] yycmap_l = yycmap;

    int [] yytrans_l = yytrans;
    int [] yy_rowMap_l = yy_rowMap;
    byte [] yy_attr_l = YY_ATTRIBUTE;

    while (true) {
      yy_markedPos_l = yy_markedPos;

      yychar+= yy_markedPos_l-yy_startRead;

      boolean yy_r = false;
      for (yy_currentPos_l = yy_startRead; yy_currentPos_l < yy_markedPos_l;
                                                             yy_currentPos_l++) {
        switch (yy_buffer_l[yy_currentPos_l]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          yy_r = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          yy_r = true;
          break;
        case '\n':
          if (yy_r)
            yy_r = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          yy_r = false;
          yycolumn++;
        }
      }

      if (yy_r) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean yy_peek;
        if (yy_markedPos_l < yy_endRead_l)
          yy_peek = yy_buffer_l[yy_markedPos_l] == '\n';
        else if (yy_atEOF)
          yy_peek = false;
        else {
          boolean eof = yy_refill();
          yy_markedPos_l = yy_markedPos;
          yy_buffer_l = yy_buffer;
          if (eof) 
            yy_peek = false;
          else 
            yy_peek = yy_buffer_l[yy_markedPos_l] == '\n';
        }
        if (yy_peek) yyline--;
      }
      yy_action = -1;

      yy_startRead_l = yy_currentPos_l = yy_currentPos = 
                       yy_startRead = yy_markedPos_l;

      yy_state = yy_lexical_state;


      yy_forAction: {
        while (true) {

          if (yy_currentPos_l < yy_endRead_l)
            yy_input = yy_buffer_l[yy_currentPos_l++];
          else if (yy_atEOF) {
            yy_input = YYEOF;
            break yy_forAction;
          }
          else {
            // store back cached positions
            yy_currentPos  = yy_currentPos_l;
            yy_markedPos   = yy_markedPos_l;
            boolean eof = yy_refill();
            // get translated positions and possibly new buffer
            yy_currentPos_l  = yy_currentPos;
            yy_markedPos_l   = yy_markedPos;
            yy_buffer_l      = yy_buffer;
            yy_endRead_l     = yy_endRead;
            if (eof) {
              yy_input = YYEOF;
              break yy_forAction;
            }
            else {
              yy_input = yy_buffer_l[yy_currentPos_l++];
            }
          }
          int yy_next = yytrans_l[ yy_rowMap_l[yy_state] + yycmap_l[yy_input] ];
          if (yy_next == -1) break yy_forAction;
          yy_state = yy_next;

          int yy_attributes = yy_attr_l[yy_state];
          if ( (yy_attributes & 1) == 1 ) {
            yy_action = yy_state; 
            yy_markedPos_l = yy_currentPos_l; 
            if ( (yy_attributes & 8) == 8 ) break yy_forAction;
          }

        }
      }

      // store back cached position
      yy_markedPos = yy_markedPos_l;

      switch (yy_action) {

        case 50: 
          {  return symbolFactory.newSymbol("IF", IF);  }
        case 106: break;
        case 89: 
          {  return symbolFactory.newSymbol("FALSE_LITERAL", FALSE_LITERAL, Boolean.valueOf("false") );  }
        case 107: break;
        case 26: 
          {  return symbolFactory.newSymbol("LLAVE_DERECHA", LLAVE_DERECHA);  }
        case 108: break;
        case 5: 
          {  return symbolFactory.newSymbol("INTEGER_LITERAL", INTEGER_LITERAL, Integer.valueOf(yytext()) );  }
        case 109: break;
        case 3: 
        case 4: 
          {                              	 }
        case 110: break;
        case 102: 
          {  return symbolFactory.newSymbol("BOOLEAN", BOOLEAN); }
        case 111: break;
        case 97: 
          {  return symbolFactory.newSymbol("WHILE", WHILE);  }
        case 112: break;
        case 95: 
          {  return symbolFactory.newSymbol("CLASS", CLASS);  }
        case 113: break;
        case 93: 
          {  return symbolFactory.newSymbol("BREAK", BREAK);  }
        case 114: break;
        case 90: 
          {  return symbolFactory.newSymbol("FLOAT", FLOAT);  }
        case 115: break;
        case 20: 
          {  return symbolFactory.newSymbol("RESTA", RESTA);  }
        case 116: break;
        case 6: 
          {  return symbolFactory.newSymbol("PUNTO", PUNTO);  }
        case 117: break;
        case 32: 
          {  return symbolFactory.newSymbol("MENOR", MENOR);  }
        case 118: break;
        case 33: 
          {  return symbolFactory.newSymbol("MAYOR", MAYOR);  }
        case 119: break;
        case 54: 
          {  return symbolFactory.newSymbol("IGUAL", IGUAL);  }
        case 120: break;
        case 19: 
          {  return symbolFactory.newSymbol("ASIGNACION", ASIGNACION);  }
        case 121: break;
        case 30: 
          {  return symbolFactory.newSymbol("PUNTOYCOMA", PUNTOYCOMA);  }
        case 122: break;
        case 31: 
          {  return symbolFactory.newSymbol("PORCENTAJE", PORCENTAJE);  }
        case 123: break;
        case 60: 
          {  return symbolFactory.newSymbol("CONJUNCION", CONJUNCION);  }
        case 124: break;
        case 61: 
          {  return symbolFactory.newSymbol("DISYUNCION", DISYUNCION);  }
        case 125: break;
        case 65: 
          {  return symbolFactory.newSymbol("FOR", FOR);  }
        case 126: break;
        case 74: 
          {  return symbolFactory.newSymbol("INT", INT);  }
        case 127: break;
        case 104: 
          {  return symbolFactory.newSymbol("CONTINUE", CONTINUE);  }
        case 128: break;
        case 22: 
          {  return symbolFactory.newSymbol("NEGACION", NEGACION);  }
        case 129: break;
        case 7: 
          {  return symbolFactory.newSymbol("DIVISION", DIVISION);  }
        case 130: break;
        case 9: 
        case 10: 
        case 11: 
        case 12: 
        case 13: 
        case 14: 
        case 15: 
        case 16: 
        case 17: 
        case 18: 
        case 39: 
        case 40: 
        case 41: 
        case 42: 
        case 43: 
        case 44: 
        case 45: 
        case 46: 
        case 47: 
        case 48: 
        case 49: 
        case 51: 
        case 52: 
        case 53: 
        case 63: 
        case 64: 
        case 66: 
        case 67: 
        case 68: 
        case 69: 
        case 70: 
        case 71: 
        case 72: 
        case 73: 
        case 75: 
        case 76: 
        case 77: 
        case 78: 
        case 80: 
        case 82: 
        case 83: 
        case 84: 
        case 85: 
        case 86: 
        case 87: 
        case 91: 
        case 92: 
        case 94: 
        case 96: 
        case 100: 
        case 101: 
        case 103: 
          {  return symbolFactory.newSymbol("ID", ID, yytext() );  }
        case 131: break;
        case 57: 
          {  return symbolFactory.newSymbol("DESIGUAL", DESIGUAL);  }
        case 132: break;
        case 58: 
          {  return symbolFactory.newSymbol("MENOR_IGUAL", MENOR_IGUAL);  }
        case 133: break;
        case 59: 
          {  return symbolFactory.newSymbol("MAYOR_IGUAL", MAYOR_IGUAL);  }
        case 134: break;
        case 88: 
          {  return symbolFactory.newSymbol("VOID", VOID);  }
        case 135: break;
        case 21: 
          {  return symbolFactory.newSymbol("SUMA", SUMA);  }
        case 136: break;
        case 2: 
        case 34: 
        case 35: 
          {  emit_warning("Caracter Illegal: '" +yytext()+"' En ["+yyline+","+yycolumn+"]"); }
        case 137: break;
        case 29: 
          {  return symbolFactory.newSymbol("COMA", COMA);  }
        case 138: break;
        case 79: 
          {  return symbolFactory.newSymbol("ELSE", ELSE);  }
        case 139: break;
        case 99: 
          {  return symbolFactory.newSymbol("RETURN", RETURN);  }
        case 140: break;
        case 98: 
          {  return symbolFactory.newSymbol("EXTERN", EXTERN);  }
        case 141: break;
        case 56: 
          {  return symbolFactory.newSymbol("ASIGNACION_SUMA", ASIGNACION_SUMA);  }
        case 142: break;
        case 28: 
          {  return symbolFactory.newSymbol("CORCHETE_DERECHO", CORCHETE_DERECHO);  }
        case 143: break;
        case 24: 
          {  return symbolFactory.newSymbol("PARENTESIS_DERECHO", PARENTESIS_DERECHO);  }
        case 144: break;
        case 8: 
          {  return symbolFactory.newSymbol("MULTIPLICACION", MULTIPLICACION);  }
        case 145: break;
        case 81: 
          {  return symbolFactory.newSymbol("TRUE_LITERAL", TRUE_LITERAL, Boolean.valueOf("true") );  }
        case 146: break;
        case 25: 
          {  return symbolFactory.newSymbol("LLAVE_IZQUIERDA", LLAVE_IZQUIERDA);  }
        case 147: break;
        case 36: 
          {  return symbolFactory.newSymbol("FLOAT_LITERAL", FLOAT_LITERAL, Float.valueOf(yytext()) );  }
        case 148: break;
        case 55: 
          {  return symbolFactory.newSymbol("ASIGNACION_RESTA", ASIGNACION_RESTA);  }
        case 149: break;
        case 27: 
          {  return symbolFactory.newSymbol("CORCHETE_IZQUIERDO", CORCHETE_IZQUIERDO);  }
        case 150: break;
        case 23: 
          {  return symbolFactory.newSymbol("PARENTESIS_IZQUIERDO", PARENTESIS_IZQUIERDO);  }
        case 151: break;
        default: 
          if (yy_input == YYEOF && yy_startRead == yy_currentPos) {
            yy_atEOF = true;
            yy_do_eof();
              {     return symbolFactory.newSymbol("EOF",EOF);
 }
          } 
          else {
            yy_ScanError(YY_NO_MATCH);
          }
      }
    }
  }


}
