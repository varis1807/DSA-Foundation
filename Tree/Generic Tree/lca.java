import java.util.*;

public class lca {
    public static ArrayList<Node> nodeToRootPath(Node root, int data) {
        if (root.data == data) {
            ArrayList<Node> base = new ArrayList<>();
            base.add(root);
            return base;
        }

        ArrayList<Node> smallAns = new ArrayList<>();
        for (Node child : root.childs) {
            smallAns = nodeToRootPath(child, data);
            if (smallAns.size() != 0)
                break;
        }
        if (smallAns.size() != 0)
            smallAns.add(root);
        return smallAns;
    }

    public Node lowestCommonAncestor(Node root, int p, int q) {
        ArrayList<Node> list1 = nodeToRootPath(root, p);
        ArrayList<Node> list2 = nodeToRootPath(root, q);

        int i = list1.size() - 1;
        int j = list2.size() - 1;

        Node LCA = null;
        while (i >= 0 && j >= 0) {
            if (list1.get(i) != list2.get(j))
                break;
            LCA = list2.get(j);
            i--;
            j--;

        }

        return LCA;
    }
}
