
import antlr.Argument;
import antlr.CodeBlock;
import antlr.Grammar;
import antlr.LexerRule;
import antlr.NonTerminal;
import antlr.ParserRule;
import antlr.RegexRule;
import antlr.RuleNode;
import antlr.SimpleRule;
import antlr.Terminal;
import antlr.WhitespaceRule;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream(new File("src/secondtask.txt"));
        CharStream charStream = new ANTLRInputStream(is);
        GrammarLexer lexer = new GrammarLexer(charStream);
        TokenStream tokens = new CommonTokenStream(lexer);
        GrammarParser parser = new GrammarParser(tokens);
        Grammar g = parser.gram().g;
        writeTokens(g);
        writeLexer(g);
        writeParser(g);
    }

    static void writeTokens(Grammar g) throws IOException {
        File dir = new File("src/generated/");
        dir.mkdirs();
        dir = new File("src/generated/" + g.name + "Token.java");
        BufferedWriter w = new BufferedWriter(new FileWriter(dir));
        w.write("package generated;\n\n" +
                "public enum " + g.name + "Token {\n     ");
        w.write(g.lexerRules.stream().map(t -> {
            if (t instanceof RegexRule) return ((RegexRule) t).name;
            if (t instanceof SimpleRule) return ((SimpleRule) t).name;
            return "WS";
        }).collect(Collectors.joining(", ")));
        w.write(", END;\n}");
        w.flush();
    }

    static String writeImportTokens(Grammar g) {
        String tokenName = g.name + "Token";
        StringBuilder s = new StringBuilder();
        String imp = "import static generated.";
        for (LexerRule l: g.lexerRules) {
            if (l instanceof SimpleRule) {
                s.append(imp).append(tokenName).append(".").append(((SimpleRule) l).name).append(";\n");
            }
            if (l instanceof RegexRule) {
                s.append(imp).append(tokenName).append(".").append(((RegexRule) l).name).append(";\n");
            }
            if (l instanceof WhitespaceRule) {
                s.append(imp).append(tokenName).append(".WS;\n");
            }
        }
        return s.toString();
    }

    static void writeLexer(Grammar g) throws IOException {
        String tokenName = g.name + "Token";
        File dir = new File("src/generated/" + g.name + "Lexer.java");
        BufferedWriter w = new BufferedWriter(new FileWriter(dir));

        w.write("package generated;\n\n" +
                "import java.text.ParseException;\n" +
                "import java.util.HashMap;\n" +
                "import java.util.regex.Matcher;\n" +
                "import java.util.regex.Pattern;\n\n");

        w.write(writeImportTokens(g));
        w.write("import static generated." + tokenName + ".END;\n\n" +

                "public class " + g.name + "Lexer {\n" +
                "   private HashMap<" + tokenName + ", Pattern> tokens = new HashMap<>();\n" +
                "   private Matcher m;\n" +
                "   private " + tokenName + " curToken;\n" +
                "   private String curText;\n\n" +

                "   " + g.name + "Lexer(String s) {\n" +
                "       m = Pattern.compile(\"a\").matcher(s);\n");
        for (LexerRule l : g.lexerRules) {
            if (l instanceof SimpleRule) {
                w.write("       tokens.put(" + ((SimpleRule) l).name + ", Pattern.compile(Pattern.quote(\"" + ((SimpleRule) l).str + "\")));\n");
            }
            if (l instanceof RegexRule) {
                w.write("       tokens.put(" + ((RegexRule) l).name + ", Pattern.compile(\"" + ((RegexRule) l).regex + "\"));\n");
            }
            if (l instanceof WhitespaceRule) {
                w.write("       tokens.put(WS, Pattern.compile(\"" + ((WhitespaceRule) l).chars + "\"));\n");
            }
        }
        w.write("   }\n\n" +

                "   private boolean checkToken(" + tokenName + " token) {\n" +
                "       m.usePattern(tokens.get(token));\n" +
                "       if (m.lookingAt()) {\n" +
                "           curText = m.group();\n" +
                "           m.region(m.regionStart() + curText.length(), m.regionEnd());\n" +
                "           return true;\n" +
                "       }\n" +
                "       return false;\n" +
                "   }\n\n" +

                "   public " + tokenName + " nextToken() throws ParseException {\n" +
                "       for (int i = 0; i < 1; i++) {\n" +
                "           for (" + tokenName + " token: tokens.keySet()) {\n" +
                "              if (checkToken(token)) {\n");
        if (g.lexerRules.stream().anyMatch(t -> t instanceof WhitespaceRule)) {
            w.write("                    if (token == WS) {\n" +
                    "                       i--;\n" +
                    "                       break;\n" +
                    "                    }\n" +
                    "                    else return (curToken = token);\n");
        } else {
            w.write("                    return (curToken = token);\n");
        }
        w.write("              }\n" +
                "           }\n" +
                "       }\n" +
                "       if (m.regionStart() == m.regionEnd()) return (curToken = END);\n" +
                "       else throw new ParseException(\"Illegal token at \" + m.regionStart(), m.regionStart());\n" +
                "   }\n\n" +

                "   public " + tokenName + " getToken() {\n" +
                "       return curToken;\n" +
                "   }\n\n" +

                "   public String getMatchedText() {\n" +
                "       return curText;\n" +
                "   }\n\n" +

                "   public int curPos() {\n" +
                "       return m.regionStart();\n" +
                "   }\n\n");

        w.write("}");
        w.flush();
    }

    static void writeParser(Grammar g) throws IOException {
        String tokenName = g.name + "Token";
        File dir = new File("src/generated/" + g.name + "Parser.java");
        BufferedWriter w = new BufferedWriter(new FileWriter(dir));

        w.write("package generated;\n\n" +
                "import java.util.List;\n" +
                "import java.util.ArrayList;\n" +
                "import java.text.ParseException;\n\n");
        w.write(writeImportTokens(g));
        w.write("import static generated." + tokenName + ".END;\n\n" +

                "public class " + g.name + "Parser {\n\n" +

                "   " + g.name + "Lexer l;\n\n" +

                "   public class Tree {\n" +
                "       String name;\n" +
                "       List<Tree> children;\n" +
                "       Tree() {\n" +
                "           name = \"\";\n" +
                "           children = new ArrayList<>();\n" +
                "       }\n" +
                "   }\n\n");

        for (ParserRule p: g.parserRules) {
            w.write("   public class " + p.nonTerminalName.substring(0, 1).toUpperCase() + p.nonTerminalName.substring(1) + " extends Tree {\n");
            for (Argument a: p.returns) {
                w.write("       " + a.type + " " + a.name + ";\n");
            }
            w.write("   }\n\n");
        }

        w.write("   public class Token extends Tree {\n" +
                "       String name;\n" +
                "       String value;\n" +
                "   }\n\n");

        HashMap<String, Set<String>> first = buildFirst(g);
        HashMap<String, Set<String>> follow = buildFollow(g, first);

        w.write("   public Tree parse(String str) throws ParseException {\n" +
                "       l = new " + g.name + "Lexer(str);\n" +
                "       l.nextToken();\n" +
                "       " + g.start.substring(0, 1).toUpperCase() + g.start.substring(1) + " " + g.start + " = " + g.start + "();\n" +
                "       if (l.getToken() != END) throw new ParseException(\"End of string expected at position \" + l.curPos(), l.curPos());\n" +
                "       return " + g.start + ";\n" +
                "   }\n\n");

        for (ParserRule p: g.parserRules) {
            String className = p.nonTerminalName.substring(0, 1).toUpperCase() + p.nonTerminalName.substring(1);
            w.write("   public " + className  + " " + p.nonTerminalName + "(" +
                    p.arguments.stream().map(t -> t.type + " " + t.name).collect(Collectors.joining(", ")) + ") throws ParseException {\n" +
                    "       " + className + " ret = new " + className + "();\n" +
                    "       switch (l.getToken()) {\n");
            for (List<RuleNode> rule: p.ruleNodes) {
                Set<String> cases = new HashSet<>();
                List<RuleNode> newRule = rule.stream().filter(t -> !(t instanceof CodeBlock)).collect(Collectors.toList());
                if (newRule.isEmpty()) cases.addAll(follow.get(p.nonTerminalName));
                else {
                    if (newRule.get(0) instanceof Terminal) cases.add(((Terminal) newRule.get(0)).terminalName);
                    else if (newRule.get(0) instanceof NonTerminal) {
                        cases.addAll(first.get(((NonTerminal) newRule.get(0)).nonTerminalName));
                        if (cases.contains("EPS")) {
                            cases.remove("EPS");
                            cases.addAll(follow.get(((NonTerminal) newRule.get(0)).nonTerminalName));
                        }
                    }
                }
                w.write(cases.stream().map(s -> "           case " + s + ":").collect(Collectors.joining("\n")) + " {\n");

                HashMap<String, String> suffixes = new HashMap<>();
                for (RuleNode node: rule) {
                    if (node instanceof Terminal) {
                        w.write("                 if (l.getToken() != " + ((Terminal) node).terminalName + ") \n" +
                                "                     throw new ParseException(\"" + ((Terminal) node).terminalName + " " +
                                "expected at \" + l.curPos(), l.curPos());\n");
                        String termName = ((Terminal) node).name;
                        if (termName.equals("")) termName = ((Terminal) node).terminalName;
                        termName += suffixes.getOrDefault(termName, "");
                        suffixes.put(termName, suffixes.getOrDefault(termName, "") + "'");
                        w.write("                 Token " + termName + " = new Token();\n" +
                                "                 " + termName + ".name = \"" + ((Terminal) node).terminalName + "\";\n" +
                                "                 " + termName + ".value = l.getMatchedText();\n" +
                                "                 l.nextToken();\n" +
                                "                 ret.children.add(" + termName + ");\n");
                    }
                    else if (node instanceof CodeBlock) {
                        String[] lines = ((CodeBlock) node).code.split(";");
                        for (String s: lines) w.write("                 " + s.replace("$", "ret.") + ";\n");
                    }
                    else if (node instanceof NonTerminal) {
                        String newClassName = ((NonTerminal) node).nonTerminalName.substring(0, 1).toUpperCase()
                                + ((NonTerminal) node).nonTerminalName.substring(1);
                        String termName = ((NonTerminal) node).name;
                        if (termName.equals("")) termName = ((NonTerminal) node).nonTerminalName;
                        termName += suffixes.getOrDefault(termName, "");
                        suffixes.put(termName, suffixes.getOrDefault(termName, "") + "'");
                        w.write("                 " + newClassName + " " + termName + " = " + ((NonTerminal) node).nonTerminalName + "(" +
                                ((NonTerminal) node).args.replace("$", "ret.") + ");\n" +
                                "                 ret.children.add(" + termName + ");\n");
                    }
                }

                w.write("                 break;\n" +
                        "           }\n");
            }
            w.write("       }\n" +
                    "       return ret;\n" +
                    "   }\n\n");
        }

        w.write("}");
        w.flush();
    }

    static HashMap<String, Set<String>> buildFirst(Grammar g) {
        HashMap<String, Set<String>> first = new HashMap<>();
        for (ParserRule p: g.parserRules) {
            first.put(p.nonTerminalName, new HashSet<>());
        }
        boolean changed = true;
        while (changed) {
            changed = false;
            for (ParserRule p: g.parserRules) {
                int oldSize = first.get(p.nonTerminalName).size();
                for (List<RuleNode> rule: p.ruleNodes) {
                    List<RuleNode> newRule = rule.stream().filter(t -> !(t instanceof CodeBlock)).collect(Collectors.toList());
                    first.get(p.nonTerminalName).addAll(getFirst(newRule, first));
                }
                if (first.get(p.nonTerminalName).size() != oldSize) {
                    changed = true;
                }
            }
        }
        return first;
    }

    static Set<String> getFirst(List<RuleNode> l, HashMap<String, Set<String>> first) {
        Set<String> res = new HashSet<>();
        if (l.isEmpty()) {
            res.add("EPS");
        }
        else if (l.get(0) instanceof Terminal) {
            res.add(((Terminal) l.get(0)).terminalName);
        }
        else if (l.get(0) instanceof NonTerminal) {
            NonTerminal nt = (NonTerminal) l.get(0);
            res.addAll(first.get(nt.nonTerminalName));
            boolean eps = res.contains("EPS");
            if (eps) {
                List<RuleNode> newList = new ArrayList<>(l);
                newList.remove(0);
                res.addAll(getFirst(newList, first));
            }
        }
        return res;
    }

    static HashMap<String, Set<String>> buildFollow(Grammar g, HashMap<String, Set<String>> first) {
        HashMap<String, Set<String>> follow = new HashMap<>();
        for (ParserRule p: g.parserRules) {
            follow.put(p.nonTerminalName, new HashSet<>());
        }
        follow.get(g.start).add("END");
        boolean changed = true;
        while (changed) {
            changed = false;
            for (ParserRule p: g.parserRules) {
                for (List<RuleNode> rule: p.ruleNodes) {
                    List<RuleNode> newRule = rule.stream().filter(t -> !(t instanceof CodeBlock)).collect(Collectors.toList());
                    for (int i = 0; i < newRule.size(); i++) {
                        if (newRule.get(i) instanceof Terminal) continue;
                        NonTerminal nt = (NonTerminal) newRule.get(i);
                        int oldSize = follow.get(nt.nonTerminalName).size();
                        if (i != newRule.size() - 1) {
                            if (newRule.get(i + 1) instanceof Terminal) {
                                follow.get(nt.nonTerminalName).add(((Terminal) newRule.get(i + 1)).terminalName);
                            }
                            else {
                                follow.get(nt.nonTerminalName).addAll(first.get(((NonTerminal) newRule.get(i + 1)).nonTerminalName));
                                follow.get(nt.nonTerminalName).remove("EPS");
                                if (first.get(((NonTerminal) newRule.get(i + 1)).nonTerminalName).contains("EPS")) {
                                    follow.get(nt.nonTerminalName).addAll(follow.get(p.nonTerminalName));
                                }
                            }
                        } else {
                            follow.get(nt.nonTerminalName).addAll(follow.get(p.nonTerminalName));
                        }
                        if (follow.get(nt.nonTerminalName).size() != oldSize) changed = true;
                    }
                }
            }
        }
        return follow;
    }
}
