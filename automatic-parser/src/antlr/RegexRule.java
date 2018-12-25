package antlr;

public class RegexRule implements LexerRule {
    public String name;
    public String regex;

    public RegexRule(String n, String r) {
        name = n;
        regex = r.substring(1, r.length() - 1);
    }

    public String toString() {
        return "RegexRule: " + name + "->" + regex;
    }
}
