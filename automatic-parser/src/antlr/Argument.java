package antlr;

public class Argument {
    public String type;
    public String name;

    public Argument(String t, String n) {
        type = t;
        name = n;
    }

    public String toString() {
        return type + " " + name;
    }
}
