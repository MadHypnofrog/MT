package antlr;

import antlr.testBaseVisitor;
import antlr.testParser;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.stream.Collectors;

public class Visitor extends testBaseVisitor<String> {
    @Override
    public String visitCommand(testParser.CommandContext ctx) {
        StringBuilder res = new StringBuilder();
        switch (ctx.start.getText()) {
            case "read": {
                res.append("scanf(\"");
                for (TerminalNode n: ctx.NAME()) res.append("%d");
                res.append("\", ");
                res.append(ctx.NAME().stream().map(t -> "&" + t.getSymbol().getText()).collect(Collectors.joining(", ")));
                res.append(");");
                break;
            }
            case "write":
            case "writeln": {
                res.append("printf(\"");
                for (ParseTree t: ctx.children) {
                    if (t.getPayload() instanceof testParser.ArithmeticContext) {
                        res.append("%d");
                    } else if (t.getText().startsWith("'")) {  // чутка костыль
                        res.append(t.getText().replace("'", ""));
                    }
                }
                if (ctx.start.getText().equals("writeln")) res.append("\\n");
                res.append("\"");
                for (ParseTree t: ctx.children) {
                    if (t.getPayload() instanceof testParser.ArithmeticContext) {
                        res.append(", ").append(t.getText());
                    }
                }
                res.append(");");
                break;
            }
            default: {
                res.append(ctx.getText()).append(";");
            }
        }
        return res.toString();
    }

    public String visitCommands(testParser.CommandsContext ctx) {
        StringBuilder res = new StringBuilder();
        for (testParser.CommandContext c: ctx.command()) {
            res.append(visitCommand(c)).append("\n");
        }
        return res.toString();
    }

    public String visitProgram(testParser.ProgramContext ctx) {
        StringBuilder res = new StringBuilder();
        if (ctx.VAR() != null) {
            res = new StringBuilder(visitVariables(ctx.variables()));
            res.append("\n");
        }
        res.append("int main() {\n");
        res.append(visitCommands(ctx.commands()));
        res.append("return 0;\n}\n");
        return res.toString();
    }

    public String visitDeclaration(testParser.DeclarationContext ctx) {
        StringBuilder res = new StringBuilder();
        switch (ctx.type().getText()) {
            case "integer": {
                res.append("short ");
                break;
            }
            case "longint": {
                res.append("long ");
                break;
            }
            case "shortint": {
                res.append("byte ");
                break;
            }
            case "real": {
                res.append("double ");
                break;
            }
        }
        res.append(ctx.NAME().stream().map(t -> t.getSymbol().getText()).collect(Collectors.joining(", ")));
        res.append(";");
        return res.toString();
    }

    public String visitVariables(testParser.VariablesContext ctx) {
        StringBuilder res = new StringBuilder();
        for (testParser.DeclarationContext c: ctx.declaration()) {
            res.append(visitDeclaration(c)).append("\n");
        }
        return res.toString();
    }
}
