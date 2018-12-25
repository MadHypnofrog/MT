package antlr;

public class SimpleRule implements LexerRule {
    public String name;
    public String str;

    public SimpleRule(String n, String s) {
        name = n;
        str = s.substring(1, s.length() - 1);
    }

    public String toString() {
        return "SimpleRule: " + name + "->" + str;
    }
}
