import java.awt.print.PrinterAbortException;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;

public class Parser {

    Lexer l;

    Tree S() throws ParseException {
        switch (l.curToken) {
            case NAME: {
                Tree typeName = typeDeclaration();
                if (l.curToken != Token.SPACE) {
                    throw new ParseException("' ' expected at position " + l.getCurPos(), l.getCurPos());
                }
                l.nextToken();
                Tree variables = variables();
                return new Tree("S", typeName, new Tree("' '"), variables);
            }
            default: {
                throw new ParseException("Alphanumeric expected at position " + l.getCurPos(), l.getCurPos());
            }
        }
    }

    Tree typeDeclaration() throws ParseException {
        switch (l.curToken) {
            case NAME: {
                Tree res = new Tree ("type_declaration", new Tree(l.curName));
                l.nextToken();
                return res;
            }
            default: {
                throw new ParseException("Alphanumeric expected at position " + l.getCurPos(), l.getCurPos());
            }
        }
    }

    Tree variables() throws ParseException {
        switch (l.curToken) {
            case NAME:
            case ASTERISK: {
                Tree variableName = variableName();
                Tree nextVariables = nextVariables();
                return new Tree("variables", variableName, nextVariables);
            }
            default: {
                throw new ParseException("Alphanumeric or asterisk expected at position " + l.getCurPos(), l.getCurPos());
            }
        }
    }

    Tree variableName() throws ParseException {
        switch (l.curToken) {
            case NAME: {
                Tree res = new Tree ("variable_name", new Tree(l.curName));
                l.nextToken();
                return res;
            }
            case ASTERISK: {
                l.nextToken();
                Tree variableName = variableName();
                return new Tree("variable_name", new Tree("*"), variableName);
            }
            default: {
                throw new ParseException("Alphanumeric or asterisk expected at position " + l.getCurPos(), l.getCurPos());
            }
        }
    }

    Tree nextVariables() throws ParseException {
        switch (l.curToken) {
            case COMMA: {
                l.nextToken();
                if (l.curToken != Token.SPACE) {
                    throw new ParseException("' ' expected at position " + l.getCurPos(), l.getCurPos());
                }
                l.nextToken();
                Tree variables = variables();
                return new Tree("next_variables", new Tree(","), new Tree("' '"), variables);
            }
            case SEMICOLON: {
                l.nextToken();
                if (l.curToken != Token.END) {
                    throw new ParseException("End of line expected at position " + l.getCurPos(), l.getCurPos());
                }
                return new Tree("next_variables", new Tree(";"));
            }
            default: {
                throw new ParseException("Comma or semicolon expected at position " + l.getCurPos(), l.getCurPos());
            }
        }
    }

    Tree parse(String s) throws ParseException {
        return parse(new ByteArrayInputStream(s.getBytes(StandardCharsets.UTF_8)));
    }

    Tree parse(InputStream is) throws ParseException {
        l = new Lexer(is);
        l.nextToken();
        return S();
    }


}
