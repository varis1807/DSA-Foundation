import java.util.*;

public class K_levelDown {
    public static Scanner scn = new Scanner(System.in);
    Node node;

    public static void KLevelsDown_(Node node, int k, ArrayList<Integer> ans) {

        if (node == null || k < 0)
            return;

        if (k == 0) {
            ans.add(node.data);
            return;
        }

        KLevelsDown_(node.left, k - 1, ans);
        KLevelsDown_(node.right, k - 1, ans);
    }

    public static void KLevelsDown(Node node, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        KLevelsDown_(node, k, ans);
        System.out.println(ans);
    }

    public static void main(String[] args) {
        K_levelDown tree = new K_levelDown();
        tree.node = new Node(1);
        tree.node.left = new Node(2);
        tree.node.right = new Node(3);
        tree.node.left.left = new Node(4);
        tree.node.left.right = new Node(5);
        tree.node.right.left = new Node(6);
        tree.node.right.right = new Node(7);
        int k = scn.nextInt();
        KLevelsDown(tree.node, k);
    }
}
