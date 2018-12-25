package antlr;

public class WhitespaceRule implements LexerRule {
    public String chars;

    public WhitespaceRule(String c) {
        chars = c.substring(1, c.length() - 1);
    }

    public String toString() {
        return "WSRule: WS->" + chars;
    }
}
