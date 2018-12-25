package antlr;

public class NonTerminal implements RuleNode {
    public String name = "";
    public String nonTerminalName = "";
    public String args = "";

    public NonTerminal() {}

    public String toString() {
        return "NonTerminal: " + (name.equals("") ? "" : name + "=") + nonTerminalName + "(" + args + ")";
    }
}
