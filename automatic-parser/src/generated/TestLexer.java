package generated;

import java.text.ParseException;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static generated.TestToken.PLUS;
import static generated.TestToken.MUL;
import static generated.TestToken.MINUS;
import static generated.TestToken.DIV;
import static generated.TestToken.POWER;
import static generated.TestToken.NUMBER;
import static generated.TestToken.LB;
import static generated.TestToken.RB;
import static generated.TestToken.WS;
import static generated.TestToken.END;

public class TestLexer {
   private HashMap<TestToken, Pattern> tokens = new HashMap<>();
   private Matcher m;
   private TestToken curToken;
   private String curText;

   TestLexer(String s) {
       m = Pattern.compile("a").matcher(s);
       tokens.put(PLUS, Pattern.compile(Pattern.quote("+")));
       tokens.put(MUL, Pattern.compile(Pattern.quote("*")));
       tokens.put(MINUS, Pattern.compile(Pattern.quote("-")));
       tokens.put(DIV, Pattern.compile(Pattern.quote("/")));
       tokens.put(POWER, Pattern.compile(Pattern.quote("^")));
       tokens.put(NUMBER, Pattern.compile("([1-9][0-9]*)|(0)"));
       tokens.put(LB, Pattern.compile(Pattern.quote("(")));
       tokens.put(RB, Pattern.compile(Pattern.quote(")")));
       tokens.put(WS, Pattern.compile("[ \t\r\n]"));
   }

   private boolean checkToken(TestToken token) {
       m.usePattern(tokens.get(token));
       if (m.lookingAt()) {
           curText = m.group();
           m.region(m.regionStart() + curText.length(), m.regionEnd());
           return true;
       }
       return false;
   }

   public TestToken nextToken() throws ParseException {
       for (int i = 0; i < 1; i++) {
           for (TestToken token: tokens.keySet()) {
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

   public TestToken getToken() {
       return curToken;
   }

   public String getMatchedText() {
       return curText;
   }

   public int curPos() {
       return m.regionStart();
   }

}