package antlr;

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
                    } else if (t.getText().startsWith("'")) {
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
        for (testParser.FunctionContext f: ctx.function()) {
            res.append(visitFunction(f));
            res.append("\n\n");
        }
        res.append("int main() {\n");
        res.append(visitCommands(ctx.commands()));
        res.append("return 0;\n}\n");
        return res.toString();
    }

    public String visitDeclaration(testParser.DeclarationContext ctx, boolean separate) {
        StringBuilder res = new StringBuilder();
        if (!separate) {
            res.append(visitType(ctx.type()));
            res.append(ctx.NAME().stream().map(t -> t.getSymbol().getText()).collect(Collectors.joining(", ")));
        }
        else {
            res.append(ctx.NAME().stream().map(t -> visitType(ctx.type()) + t.getSymbol().getText())
                    .collect(Collectors.joining(", ")));
        }
        return res.toString();
    }

    public String visitType(testParser.TypeContext ctx) {
        StringBuilder res = new StringBuilder();
        switch (ctx.getText()) {
            case "integer": {
                res.append("short ");
                break;
            }
            case "longint": {
                res.append("long ");
                break;
            }
            case "shortint": {
                res.append("char ");
                break;
            }
            case "real": {
                res.append("double ");
                break;
            }
        }
        return res.toString();
    }

    public String visitVariables(testParser.VariablesContext ctx) {
        StringBuilder res = new StringBuilder();
        for (testParser.DeclarationContext c: ctx.declaration()) {
            res.append(visitDeclaration(c, false)).append(";\n");
        }
        return res.toString();
    }

    public String visitFunction(testParser.FunctionContext ctx) {
        StringBuilder res = new StringBuilder();
        res.append(visitHeader(ctx.header()));
        res.append("\n");
        res.append(visitVariables(ctx.variables()));
        res.append(visitCommands(ctx.commands()));
        res.append("return ");
        res.append(ctx.arithmetic().getText());
        res.append(";\n}");
        return res.toString();
    }

    public String visitHeader(testParser.HeaderContext ctx) {
        StringBuilder res = new StringBuilder();
        res.append(visitType(ctx.type()));
        res.append(ctx.NAME().getSymbol().getText());
        res.append("(");
        res.append(ctx.declaration().stream().map(d -> visitDeclaration(d, true)).collect(Collectors.joining(", ")));
        res.append(") {");
        return res.toString();
    }
}
