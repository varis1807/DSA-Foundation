import java.util.*;
public class k_away {
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

    public static boolean nodeToRootPath(Node node, int data, ArrayList<Node> ans) {
        if (node == null)
            return false;

        if (node.data == data) {
            ans.add(node);
            return true;
        }
        boolean res = nodeToRootPath(node.left, data, ans) || nodeToRootPath(node.right, data, ans);
        if (res)
            ans.add(node);

        return res;
    }

    public static void KLevelsDown(Node node, int k, Node block, ArrayList<Integer> ans) {
        if (node == null || k < 0 || node == block)
            return;

        if (k == 0) {
            ans.add(node.data);
            return;
        }

        KLevelsDown(node.left, k - 1, block, ans);
        KLevelsDown(node.right, k - 1, block, ans);
    }

    public static ArrayList<Integer> kaway(Node node, int data, int k) {
        ArrayList<Node> list = new ArrayList<>();
        nodeToRootPath(node, data, list);

        ArrayList<Integer> ans = new ArrayList<>();
        Node block = null;
        for (int i = 0; i < list.size(); i++) {
            KLevelsDown(list.get(i), k - i, block, ans);
            block = list.get(i);
        }

        return ans;
    }
  
}
