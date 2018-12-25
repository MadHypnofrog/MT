package generated;

import java.text.ParseException;
import java.util.stream.Collectors;

public class SecondTaskMain {
    public static void main(String[] args) throws ParseException {
        SecondTaskParser parser = new SecondTaskParser();
        SecondTaskParser.S res = (SecondTaskParser.S)parser.parse("_typeName09 a, bbb, *as, e381__, _sda;");
        System.out.println("Variable names: " + res.namesWithTypes.stream().collect(Collectors.joining(", ")));
    }
}
