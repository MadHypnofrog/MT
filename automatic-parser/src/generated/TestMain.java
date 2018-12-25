package generated;

import java.text.ParseException;
import java.util.regex.Pattern;

public class TestMain {
    public static void main(String[] args) throws ParseException {
        TestParser parser = new TestParser();
        System.out.println(((TestParser.E)parser.parse("4/2*2 + 2^2^3")).a);
    }
}
