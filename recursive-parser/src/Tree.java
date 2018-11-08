import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tree {
    String node;

    List<Tree> children;

    public Tree (String node, Tree... children) {
        this.node = node;
        this.children = Arrays.asList(children);
    }

    public Tree (String node) {
        this.node = node;
        children = new ArrayList<>();
    }

    public String toString() {
        String res = "Tree{" + node + "}, children:{";
        for (Tree t: children) res += t.toString() + ", ";
        res += "}";
        return res;
    }
}
