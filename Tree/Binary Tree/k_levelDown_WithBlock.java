import java.util.*;
public class k_levelDown_WithBlock {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        Node(int data) {
            this(data, null, null);
        }
    }
    public static void KLevelsDown(Node node, int k,  ArrayList<Integer> ans) {
        if (node == null || k < 0)
            return;

        if (k == 0) {
            ans.add(node.data);
            return;
        }

        KLevelsDown(node.left, k - 1,  ans);
        KLevelsDown(node.right, k - 1,ans);
    }
}
