import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;

public class Lexer {
    InputStream is;
    int curChar;
    int curPos;
    String curName;
    Token curToken;

    public Lexer(InputStream is) throws ParseException {
        this.is = is;
        curPos = 0;
        curName = "";
        nextChar();
    }


    private boolean isBlank(int c) {
        return c == ' ' || c == '\r' || c == '\n' || c == '\t';
    }

    private void nextChar() throws ParseException {
        curPos++;
        try {
            curChar = is.read();
        } catch (IOException e) {
            throw new ParseException(e.getMessage(), curPos);
        }
    }

    public void nextToken() throws ParseException {
        curName = "";
        switch (curChar) {
            case ',': {
                nextChar();
                curToken = Token.COMMA;
                break;
            }
            case ';': {
                nextChar();
                curToken = Token.SEMICOLON;
                break;
            }
            case '*': {
                nextChar();
                curToken = Token.ASTERISK;
                break;
            }
            case ' ': {
                nextChar();
                curToken = Token.SPACE;
                break;
            }
            case '\r':
            case '\n':
            case '\t':
            case -1: {
                curToken = Token.END;
                break;
            }
            default: {
                if (!Character.isAlphabetic(curChar) && !Character.isDigit(curChar) && curChar != '_') {
                    throw new ParseException("Illegal character " + (char)curChar, curPos);
                }
                do {
                    curName += (char)curChar;
                    nextChar();
                } while (Character.isAlphabetic(curChar) || Character.isDigit(curChar) || curChar == '_');
                curToken = Token.NAME;
                break;
            }
        }
    }

    public Token getCurToken() {
        return curToken;
    }

    public int getCurPos() {
        return curPos;
    }

}
