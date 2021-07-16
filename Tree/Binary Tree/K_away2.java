import java.util.ArrayList;
public class K_away2 {

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

    public static int kaway2(Node node, int data, int k, ArrayList<Integer> ans) {
        if (node == null)
            return -1;

        if (node.data == data) {
            KLevelsDown(node, k, null, ans);
            return 1;
        }

        int ld = kaway2(node.left, data, k, ans);
        if (ld != -1) {
            KLevelsDown(node, k - ld, node.left, ans);
            return ld + 1;
        }

        int rd = kaway2(node.right, data, k, ans);
        if (rd != -1) {
            KLevelsDown(node, k - rd, node.right, ans);
            return rd + 1;
        }

        return -1;
    }

}
