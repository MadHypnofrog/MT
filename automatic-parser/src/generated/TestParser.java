package generated;

import java.util.List;
import java.util.ArrayList;
import java.text.ParseException;

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

public class TestParser {

   TestLexer l;

   public class Tree {
       String name;
       List<Tree> children;
       Tree() {
           name = "";
           children = new ArrayList<>();
       }
   }

   public class E extends Tree {
       float a;
   }

   public class Ea extends Tree {
       float a;
   }

   public class T extends Tree {
       float a;
   }

   public class Ta extends Tree {
       float a;
   }

   public class D extends Tree {
       float a;
   }

   public class Pa extends Tree {
       float a;
   }

   public class F extends Tree {
       float a;
   }

   public class Token extends Tree {
       String name;
       String value;
   }

   public Tree parse(String str) throws ParseException {
       l = new TestLexer(str);
       l.nextToken();
       E e = e();
       if (l.getToken() != END) throw new ParseException("End of string expected at position " + l.curPos(), l.curPos());
       return e;
   }

   public E e() throws ParseException {
       E ret = new E();
       switch (l.getToken()) {
           case NUMBER:
           case LB: {
                 T t = t();
                 ret.children.add(t);
                 Ea ea = ea();
                 ret.children.add(ea);
                 ret.a = t.a + ea.a;
                 break;
           }
       }
       return ret;
   }

   public Ea ea() throws ParseException {
       Ea ret = new Ea();
       switch (l.getToken()) {
           case PLUS: {
                 if (l.getToken() != PLUS) 
                     throw new ParseException("PLUS expected at " + l.curPos(), l.curPos());
                 Token PLUS = new Token();
                 PLUS.name = "PLUS";
                 PLUS.value = l.getMatchedText();
                 l.nextToken();
                 ret.children.add(PLUS);
                 T t = t();
                 ret.children.add(t);
                 Ea ea = ea();
                 ret.children.add(ea);
                 ret.a = t.a + ea.a;
                 break;
           }
           case MINUS: {
                 if (l.getToken() != MINUS) 
                     throw new ParseException("MINUS expected at " + l.curPos(), l.curPos());
                 Token MINUS = new Token();
                 MINUS.name = "MINUS";
                 MINUS.value = l.getMatchedText();
                 l.nextToken();
                 ret.children.add(MINUS);
                 T t = t();
                 ret.children.add(t);
                 Ea ea = ea();
                 ret.children.add(ea);
                 ret.a = ea.a - t.a;
                 break;
           }
           case RB:
           case END: {
                 ret.a = 0;
                 break;
           }
       }
       return ret;
   }

   public T t() throws ParseException {
       T ret = new T();
       switch (l.getToken()) {
           case NUMBER:
           case LB: {
                 D d = d();
                 ret.children.add(d);
                 Ta ta = ta();
                 ret.children.add(ta);
                 ret.a = d.a * ta.a;
                 break;
           }
       }
       return ret;
   }

   public Ta ta() throws ParseException {
       Ta ret = new Ta();
       switch (l.getToken()) {
           case MUL: {
                 if (l.getToken() != MUL) 
                     throw new ParseException("MUL expected at " + l.curPos(), l.curPos());
                 Token MUL = new Token();
                 MUL.name = "MUL";
                 MUL.value = l.getMatchedText();
                 l.nextToken();
                 ret.children.add(MUL);
                 D d = d();
                 ret.children.add(d);
                 Ta ta = ta();
                 ret.children.add(ta);
                 ret.a = d.a * ta.a;
                 break;
           }
           case DIV: {
                 if (l.getToken() != DIV) 
                     throw new ParseException("DIV expected at " + l.curPos(), l.curPos());
                 Token DIV = new Token();
                 DIV.name = "DIV";
                 DIV.value = l.getMatchedText();
                 l.nextToken();
                 ret.children.add(DIV);
                 D d = d();
                 ret.children.add(d);
                 Ta ta = ta();
                 ret.children.add(ta);
                 ret.a = ta.a/d.a;
                 break;
           }
           case RB:
           case END:
           case PLUS:
           case MINUS: {
                 ret.a = 1;
                 break;
           }
       }
       return ret;
   }

   public D d() throws ParseException {
       D ret = new D();
       switch (l.getToken()) {
           case NUMBER:
           case LB: {
                 F f = f();
                 ret.children.add(f);
                 Pa pa = pa();
                 ret.children.add(pa);
                 ret.a = (float)Math.pow(f.a, pa.a);
                 break;
           }
       }
       return ret;
   }

   public Pa pa() throws ParseException {
       Pa ret = new Pa();
       switch (l.getToken()) {
           case POWER: {
                 if (l.getToken() != POWER) 
                     throw new ParseException("POWER expected at " + l.curPos(), l.curPos());
                 Token POWER = new Token();
                 POWER.name = "POWER";
                 POWER.value = l.getMatchedText();
                 l.nextToken();
                 ret.children.add(POWER);
                 F f = f();
                 ret.children.add(f);
                 Pa pa = pa();
                 ret.children.add(pa);
                 ret.a = (float)Math.pow(f.a, pa.a);
                 break;
           }
           case DIV:
           case RB:
           case MUL:
           case END:
           case PLUS:
           case MINUS: {
                 ret.a = 1;
                 break;
           }
       }
       return ret;
   }

   public F f() throws ParseException {
       F ret = new F();
       switch (l.getToken()) {
           case NUMBER: {
                 if (l.getToken() != NUMBER) 
                     throw new ParseException("NUMBER expected at " + l.curPos(), l.curPos());
                 Token NUMBER = new Token();
                 NUMBER.name = "NUMBER";
                 NUMBER.value = l.getMatchedText();
                 l.nextToken();
                 ret.children.add(NUMBER);
                 ret.a = Integer.valueOf(NUMBER.value);
                 break;
           }
           case LB: {
                 if (l.getToken() != LB) 
                     throw new ParseException("LB expected at " + l.curPos(), l.curPos());
                 Token LB = new Token();
                 LB.name = "LB";
                 LB.value = l.getMatchedText();
                 l.nextToken();
                 ret.children.add(LB);
                 E e = e();
                 ret.children.add(e);
                 if (l.getToken() != RB) 
                     throw new ParseException("RB expected at " + l.curPos(), l.curPos());
                 Token RB = new Token();
                 RB.name = "RB";
                 RB.value = l.getMatchedText();
                 l.nextToken();
                 ret.children.add(RB);
                 ret.a = e.a;
                 break;
           }
       }
       return ret;
   }

}