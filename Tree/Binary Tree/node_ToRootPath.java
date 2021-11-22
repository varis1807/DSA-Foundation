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
    // ArrayList<Integer> ans = new ArrayList<>();
    // nodeToRootPath_(node, data, ans);
    // System.out.println(ans);       
    // }
    public static ArrayList<Integer> nodeToRootPath(Node node, int data) {
        ArrayList<Integer> ans = new ArrayList<>();
        System.out.println(nodeToRootPath_(node, data, ans));
        
        return ans;
    }

    public static void main(String[] args) {
        node_ToRootPath tree = new node_ToRootPath();
        tree.node = new Node(2);
        tree.node.left = new Node(7);
        tree.node.right = new Node(15);
        tree.node.right.right = new Node(9);
        tree.node.right.right.left = new Node(4);
        tree.node.left.left = new Node(2);
        tree.node.left.right = new Node(6);
        tree.node.left.right.right = new Node(11);
        tree.node.left.right.left = new Node(5);
        tree.node.left.right.left.left = new Node(14);
        tree.node.left.right.left.right = new Node(16);
       // int data = scn.nextInt();
        // nodeToRootPath(tree.node, data);
        System.out.println(nodeToRootPath(tree.node, 4));
    }
}
