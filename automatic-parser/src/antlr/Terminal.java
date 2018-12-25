package antlr;

public class Terminal implements RuleNode {
    public String name = "";
    public String terminalName = "";

    public String toString() {
        return "Terminal: " + (name.equals("") ? "" : name + "=") + terminalName;
    }
}
