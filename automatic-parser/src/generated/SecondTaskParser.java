package generated;

import java.util.List;
import java.util.ArrayList;
import java.text.ParseException;

import static generated.SecondTaskToken.AST;
import static generated.SecondTaskToken.SEMICOLON;
import static generated.SecondTaskToken.COMMA;
import static generated.SecondTaskToken.NAME;
import static generated.SecondTaskToken.WS;
import static generated.SecondTaskToken.END;

public class SecondTaskParser {

   SecondTaskLexer l;

   public class Tree {
       String name;
       List<Tree> children;
       Tree() {
           name = "";
           children = new ArrayList<>();
       }
   }

   public class S extends Tree {
       List<String> namesWithTypes;
   }

   public class Typedec extends Tree {
       String text;
   }

   public class Vars extends Tree {
       List<String> list;
   }

   public class Varname extends Tree {
       String name;
   }

   public class Nextvars extends Tree {
       List<String> list;
   }

   public class Token extends Tree {
       String name;
       String value;
   }

   public Tree parse(String str) throws ParseException {
       l = new SecondTaskLexer(str);
       l.nextToken();
       S s = s();
       if (l.getToken() != END) throw new ParseException("End of string expected at position " + l.curPos(), l.curPos());
       return s;
   }

   public S s() throws ParseException {
       S ret = new S();
       switch (l.getToken()) {
           case NAME: {
                 Typedec t = typedec();
                 ret.children.add(t);
                 String type = t.text;
                 Vars vars = vars(type);
                 ret.children.add(vars);
                 ret.namesWithTypes = vars.list;
                 break;
           }
       }
       return ret;
   }

   public Typedec typedec() throws ParseException {
       Typedec ret = new Typedec();
       switch (l.getToken()) {
           case NAME: {
                 if (l.getToken() != NAME) 
                     throw new ParseException("NAME expected at " + l.curPos(), l.curPos());
                 Token NAME = new Token();
                 NAME.name = "NAME";
                 NAME.value = l.getMatchedText();
                 l.nextToken();
                 ret.children.add(NAME);
                 ret.text = NAME.value;
                 break;
           }
       }
       return ret;
   }

   public Vars vars(String type) throws ParseException {
       Vars ret = new Vars();
       switch (l.getToken()) {
           case AST:
           case NAME: {
                 Varname varname = varname();
                 ret.children.add(varname);
                 Nextvars nextvars = nextvars(type);
                 ret.children.add(nextvars);
                 ret.list = new ArrayList<>();
                 ret.list.add(type + ": " + varname.name);
                 ret.list.addAll(nextvars.list);
                 break;
           }
       }
       return ret;
   }

   public Varname varname() throws ParseException {
       Varname ret = new Varname();
       switch (l.getToken()) {
           case AST: {
                 if (l.getToken() != AST) 
                     throw new ParseException("AST expected at " + l.curPos(), l.curPos());
                 Token AST = new Token();
                 AST.name = "AST";
                 AST.value = l.getMatchedText();
                 l.nextToken();
                 ret.children.add(AST);
                 Varname varname = varname();
                 ret.children.add(varname);
                 ret.name = "*" + varname.name;
                 break;
           }
           case NAME: {
                 if (l.getToken() != NAME) 
                     throw new ParseException("NAME expected at " + l.curPos(), l.curPos());
                 Token t = new Token();
                 t.name = "NAME";
                 t.value = l.getMatchedText();
                 l.nextToken();
                 ret.children.add(t);
                 ret.name = t.value;
                 break;
           }
       }
       return ret;
   }

   public Nextvars nextvars(String type) throws ParseException {
       Nextvars ret = new Nextvars();
       switch (l.getToken()) {
           case COMMA: {
                 if (l.getToken() != COMMA) 
                     throw new ParseException("COMMA expected at " + l.curPos(), l.curPos());
                 Token COMMA = new Token();
                 COMMA.name = "COMMA";
                 COMMA.value = l.getMatchedText();
                 l.nextToken();
                 ret.children.add(COMMA);
                 Vars vars = vars(type);
                 ret.children.add(vars);
                 ret.list = vars.list;
                 break;
           }
           case SEMICOLON: {
                 if (l.getToken() != SEMICOLON) 
                     throw new ParseException("SEMICOLON expected at " + l.curPos(), l.curPos());
                 Token SEMICOLON = new Token();
                 SEMICOLON.name = "SEMICOLON";
                 SEMICOLON.value = l.getMatchedText();
                 l.nextToken();
                 ret.children.add(SEMICOLON);
                 ret.list = new ArrayList<>();
                 break;
           }
       }
       return ret;
   }

}