import java.util.*;
public class lca {
    public static ArrayList<Node> nodeToRootPath(Node node, int data) {
        if (node == null)
            return null;

        if (node.data == data) {
            ArrayList<Node> list = new ArrayList<>();
            list.add(node);
            return list;
        }

        ArrayList<Node> left = nodeToRootPath(node.left, data);
        if (left != null) {
            left.add(node);
            return left;
        }

        ArrayList<Node> right = nodeToRootPath(node.right, data);
        if (right != null) {
            right.add(node);
            return right;
        }

        return null;
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
