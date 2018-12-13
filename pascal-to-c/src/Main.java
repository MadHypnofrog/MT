import antlr.testLexer;
import antlr.testParser;
import antlr.Visitor;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream(new File("test.txt"));
        CharStream charStream = new ANTLRInputStream(is);
        testLexer lexer = new testLexer(charStream);
        TokenStream tokens = new CommonTokenStream(lexer);
        testParser parser = new testParser(tokens);
        Visitor v = new Visitor();
        System.out.println(v.visitProgram(parser.program()));
    }
}
