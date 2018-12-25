package generated;

import java.text.ParseException;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static generated.SecondTaskToken.AST;
import static generated.SecondTaskToken.SEMICOLON;
import static generated.SecondTaskToken.COMMA;
import static generated.SecondTaskToken.NAME;
import static generated.SecondTaskToken.WS;
import static generated.SecondTaskToken.END;

public class SecondTaskLexer {
   private HashMap<SecondTaskToken, Pattern> tokens = new HashMap<>();
   private Matcher m;
   private SecondTaskToken curToken;
   private String curText;

   SecondTaskLexer(String s) {
       m = Pattern.compile("a").matcher(s);
       tokens.put(AST, Pattern.compile(Pattern.quote("*")));
       tokens.put(SEMICOLON, Pattern.compile(Pattern.quote(";")));
       tokens.put(COMMA, Pattern.compile(Pattern.quote(",")));
       tokens.put(NAME, Pattern.compile("[a-zA-Z_][a-zA-Z0-9_]*"));
       tokens.put(WS, Pattern.compile("[ \t\r\n]"));
   }

   private boolean checkToken(SecondTaskToken token) {
       m.usePattern(tokens.get(token));
       if (m.lookingAt()) {
           curText = m.group();
           m.region(m.regionStart() + curText.length(), m.regionEnd());
           return true;
       }
       return false;
   }

   public SecondTaskToken nextToken() throws ParseException {
       for (int i = 0; i < 1; i++) {
           for (SecondTaskToken token: tokens.keySet()) {
              if (checkToken(token)) {
                    if (token == WS) {
                       i--;
                       break;
                    }
                    else return (curToken = token);
              }
           }
       }
       if (m.regionStart() == m.regionEnd()) return (curToken = END);
       else throw new ParseException("Illegal token at " + m.regionStart(), m.regionStart());
   }

   public SecondTaskToken getToken() {
       return curToken;
   }

   public String getMatchedText() {
       return curText;
   }

   public int curPos() {
       return m.regionStart();
   }

}