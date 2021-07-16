
//Lowest Common Ancester
import java.util.*;

public class LCA {
    public static int lca(Node node, int d1, int d2) {
        int lca = -1;
        while (node != null) {
            if (node.data < d1 && node.data < d2)
                node = node.right;
            else if (node.data > d1 && node.data > d2)
                node = node.left;
            else {
                lca = node.data;
                break;
            }
        }

        return lca;
    }
}
