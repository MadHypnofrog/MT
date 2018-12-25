package antlr;

import java.util.List;
import java.util.stream.Collectors;

public class ParserRule {
    public String nonTerminalName;
    public List<Argument> arguments, returns;
    public List<List<RuleNode>> ruleNodes;

    public ParserRule(String ntn, List<Argument> args, List<Argument> rets, List<List<RuleNode>> rn) {
        nonTerminalName = ntn;
        arguments = args;
        returns = rets;
        ruleNodes = rn;
    }

    public String toString() {
        String s = "Rule: " + nonTerminalName + " ";
        if (!arguments.isEmpty()) {
            s += "(";
            s += arguments.stream().map(Argument::toString).collect(Collectors.joining(", "));
            s += ") ";
        }
        if (!returns.isEmpty()) {
            s += "returns [";
            s += returns.stream().map(Argument::toString).collect(Collectors.joining(", "));
            s += "]";
        }
        s += " -> ";
        for (List<RuleNode> l: ruleNodes) {
            s += l;
        }
        return s;
    }
}
