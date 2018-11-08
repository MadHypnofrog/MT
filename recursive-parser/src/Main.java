import guru.nidi.graphviz.attribute.Color;
import guru.nidi.graphviz.attribute.Label;
import guru.nidi.graphviz.engine.Format;
import guru.nidi.graphviz.engine.Graphviz;
import guru.nidi.graphviz.model.MutableGraph;
import guru.nidi.graphviz.model.MutableNode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import static guru.nidi.graphviz.model.Factory.*;

public class Main {

    static BufferedWriter w;
    static Parser parser = new Parser();

    static {
        try {
            w = new BufferedWriter(new FileWriter(new File("tree.dot")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException, ParseException {
        testSimpleVariable();
        testSimpleVariableWithAsterisks();
        testMultipleVariables();
        testMultipleVariablesWithAsterisks();
        testRandomCorrectStrings();
        testNumbersAndUnderscoresInNames();
        testNoSemicolonInTheEnd();
        testSomethingAfterSemicolon();
        testNoComma();
        testNoVariables();
        testInvalidCharacters();
        printGraph(parser.parse("rando_m l0ng, ***test, with, *different0_0examples;"));
    }

    static void testSimpleVariable() throws ParseException {
        parser.parse("int a;");
        parser.parse("a b;");
        parser.parse("longclassname evenlongervariablename;");
    }

    static void testSimpleVariableWithAsterisks() throws ParseException {
        parser.parse("int *a;");
        parser.parse("a ***b;");
        parser.parse("longclassname ************************evenlongervariablename;");
    }

    static void testMultipleVariables() throws ParseException {
        parser.parse("int a, eee;");
        parser.parse("a b, c, ddd, e, ff;");
        parser.parse("longclassname evenlongervariablename, anotherlongvariable, random, z;");
    }

    static void testMultipleVariablesWithAsterisks() throws ParseException {
        parser.parse("int *a, **eee;");
        parser.parse("a *b, ***c, *ddd, *******e, *ff;");
        parser.parse("longclassname ************evenlongervariablename, *anotherlongvariable, **random, ********z;");
    }

    static void testRandomCorrectStrings() throws ParseException {
        parser.parse("int qwerty, *a, **eee, k;");
        parser.parse("a zzzzz, *b, ***c, ddd, ******e, asd, *ff;");
        parser.parse("longclassname ************evenlongervariablename, p, *anotherlongvariable, **random, ********z, ll, zzzz, **ff;");
    }

    static void testNumbersAndUnderscoresInNames() throws ParseException {
        parser.parse("int qwe2rty, *a__, **e11e, k_35f;");
        parser.parse("a2 zzzzz, *b, ***c2213ge3, dd34d, ******e_, asd, *ff;");
        parser.parse("lo_ngcl__ass2na__me ************evenlonger3333variablename, p, *anoth__erlongvariable, **ra1ndom, **_ff;");
    }

    static void testSomethingAfterSemicolon() throws ParseException {
        List<String> tests = new ArrayList<>();
        tests.add("int a;d;");
        tests.add("a2 zzzzz, *b, ***c2213ge3, dd34d, ******e_, asd, *ff;    35");
        tests.add("lo_ngcl__ass2na__me ************evenlonger3333variablename, p, *anoth__erlongvariable, **ra1ndom, **_ff; int d;");
        for (String s: tests) {
            try {
                parser.parse(s);
                throw new AssertionError("Didn't fail at test: " + s);
            } catch (ParseException e) {
            }
        }
    }

    static void testNoComma() throws ParseException {
        List<String> tests = new ArrayList<>();
        tests.add("int a d;");
        tests.add("a2 zzzzz, *b, ***c2213ge3, dd34d ******e_, asd, *ff;");
        tests.add("lo_ngcl__ass2na__me ************evenlonger3333variablename, p, *anoth__erlongvariable, **ra1ndom, **_ff int d;");
        for (String s: tests) {
            try {
                parser.parse(s);
                throw new AssertionError("Didn't fail at test: " + s);
            } catch (ParseException e) {
            }
        }
    }

    static void testNoVariables() throws ParseException {
        List<String> tests = new ArrayList<>();
        tests.add("int;");
        tests.add("a2____32ngerg;");
        tests.add("lo_ngcl__ass2na__meeeeeeeee_____1;");
        for (String s: tests) {
            try {
                parser.parse(s);
                throw new AssertionError("Didn't fail at test: " + s);
            } catch (ParseException e) {
            }
        }
    }

    static void testNoSemicolonInTheEnd() throws ParseException {
        List<String> tests = new ArrayList<>();
        tests.add("int a");
        tests.add("a2 zzzzz, *b, ***c2213ge3, dd34d, ******e_, asd, *ff");
        tests.add("lo_ngcl__ass2na__me ************evenlonger3333variablename, p, *anoth__erlongvariable, **ra1ndom, **_ff");
        for (String s: tests) {
            try {
                parser.parse(s);
                throw new AssertionError("Didn't fail at test: " + s);
            } catch (ParseException e) {
            }
        }
    }

    static void testInvalidCharacters() throws ParseException {
        List<String> tests = new ArrayList<>();
        tests.add("in*t a;");
        tests.add("a2 zzz*zz;");
        tests.add("lo_n%gcl__ass2na__me ************evenlonger3333variablename, p, *anoth__erlongvariable, **ra1ndom, **_ff;");
        tests.add("a2 zz!zzz;");
        tests.add("a2 zzz-zz;");
        tests.add("a.2 zzz*zz;");
        tests.add("a2 zzz\nzz;");
        for (String s: tests) {
            try {
                parser.parse(s);
                throw new AssertionError("Didn't fail at test: " + s);
            } catch (ParseException e) {
            }
        }
    }

    private static void printGraph(Tree res) throws IOException {
        w.write("digraph {" + System.lineSeparator());
        buildGraph(res);
        w.write("}");
        w.flush();
        MutableGraph g = guru.nidi.graphviz.parse.Parser.read(new File("tree.dot"));
        Graphviz.fromGraph(g).render(Format.PNG).toFile(new File("example.png"));
    }

    private static long buildGraph(Tree tree) throws IOException {
        w.write(tree.hashCode() + " [label=\"" + tree.node + "\"");
        if (tree.children.isEmpty()) w.write(", color=\"red\"");
        w.write("];" + System.lineSeparator());
        for (Tree t: tree.children) w.write(tree.hashCode() + " -> " + buildGraph(t) + System.lineSeparator());
        return tree.hashCode();
    }

}
