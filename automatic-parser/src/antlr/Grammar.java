package antlr;

import java.util.List;

public class Grammar {
    public String name;
    public List<ParserRule> parserRules;
    public List<LexerRule> lexerRules;
    public String start;

    public Grammar(String n, List<ParserRule> pr, List<LexerRule> lr, String st) {
        name = n;
        parserRules = pr;
        lexerRules = lr;
        start = st;
    }
}
