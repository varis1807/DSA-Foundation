import java.util.ArrayList;

class Node {
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

public class count_leaves {
    Node root;

    // https://practice.geeksforgeeks.org/problems/count-leaves-in-binary-tree/1
    public static int countLeaves(Node root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;

        // return countLeaves(root.left) + countLeaves(root.right);
        int count = 0;
        count += countLeaves(root.left);
        count += countLeaves(root.right);
        return count;
    }

    public static void countLeaf(Node root, ArrayList<Integer> ans) {
        if (root == null)
            return;
        if (root.left == null && root.right == null) {
            ans.add(root.data);
            return;
        }
        countLeaf(root.left, ans);
        countLeaf(root.right, ans);
        System.out.println(ans);
    }

    public static void main(String[] args) {

        // create an object of BinaryTree
        count_leaves tree = new count_leaves();

        // create nodes of the tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.right.right = new Node(5);
        tree.root.right.left = new Node(7);
        tree.root.left.right = new Node(6);
        ArrayList<Integer> ans = new ArrayList<>();
        // System.out.print(tree.countLeaves(tree.root));
        System.out.println(countLeaves(tree.root));
    }
}
