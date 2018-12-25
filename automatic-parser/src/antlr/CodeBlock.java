package antlr;

public class CodeBlock implements RuleNode {
    public String code;

    public CodeBlock(String c) {
        code = c.substring(1, c.length() - 1);
    }

    public String toString() {
        return "CodeBlock: " + code;
    }
}
