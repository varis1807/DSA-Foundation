import java.util.*;

public class node_ToRootPath {
    public static Scanner scn = new Scanner(System.in);
    Node node;

    public static boolean nodeToRootPath_(Node node, int data, ArrayList<Integer> ans) {

        if (node == null)
            return false;

        if (node.data == data) {
            ans.add(node.data);
            return true;
        }
        boolean res = nodeToRootPath_(node.left, data, ans) || nodeToRootPath_(node.right, data, ans);
        if (res)
            ans.add(node.data);

        return res;
    }

    // public static void nodeToRootPath(Node node, int data) {
    //     ArrayList<Integer> ans = new ArrayList<>();
    //     nodeToRootPath_(node, data, ans);
    //     System.out.println(ans);
    // }
    public static ArrayList<Integer> nodeToRootPath(Node node, int data) {
        ArrayList<Integer> ans = new ArrayList<>();
        nodeToRootPath_(node, data, ans);
       return ans;
    }
    public static void main(String[] args) {
        node_ToRootPath tree = new node_ToRootPath();
        tree.node = new Node(1);
        tree.node.left = new Node(2);
        tree.node.right = new Node(3);
        tree.node.left.left = new Node(4);
        int data = scn.nextInt();
        // nodeToRootPath(tree.node, data);
        System.out.println(nodeToRootPath(tree.node, data));
    }
}
