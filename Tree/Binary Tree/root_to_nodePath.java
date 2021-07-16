import java.util.*;

public class root_to_nodePath {
    public static Scanner scn = new Scanner(System.in);
    Node node;

    public static boolean rootToNodePath_(Node node, int data, ArrayList<Integer> ans) {
        if (node == null)
            return false;
        ans.add(node.data);
        if (node.data == data)
            return true;
        if (rootToNodePath_(node.left, data, ans) || rootToNodePath_(node.right, data, ans))
            return true;

        ans.remove(ans.size() - 1);
        return false;
    }

    public static void rootToNodePath(Node node, int data) {
        ArrayList<Integer> ans = new ArrayList<>();
        rootToNodePath_(node, data, ans);
        if (rootToNodePath_(node, data, ans)) {
            System.out.println(ans);
        }

        // 'x' is not present in the binary tree
        else
            System.out.print("No Path");
    }

    public static void main(String[] args) {
        root_to_nodePath tree = new root_to_nodePath();
        tree.node = new Node(1);
        tree.node.left = new Node(2);
        tree.node.right = new Node(3);
        tree.node.left.left = new Node(4);
        tree.node.left.right = new Node(5);
        tree.node.right.left = new Node(6);
        tree.node.right.right = new Node(7);
        int data = scn.nextInt();
        rootToNodePath(tree.node, data);
    }
}
