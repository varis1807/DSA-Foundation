public class BST_balanced {
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

    public static int height(Node root) {
        if (root == null)
            return -1;

        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }

    public static boolean isBalanced(Node root) {
        if (root == null)
            return true;

        int lh = height(root.left);
        int rh = height(root.right);

        if (isBalanced(root.left) == false)
            return false;
        if (isBalanced(root.right) == false)
            return false;

        if (Math.abs(lh - rh) <= 1)
            return true;
        return false;
    }

    // is balanced optimised
    public static class balPair {
        int height = -1;
        boolean isBal = true;
    }

    public static balPair isBal2(Node node) {
        if (node == null)
            return new balPair();

        balPair leftPair = isBal2(node.left);
        if (leftPair.isBal == false)
            return leftPair;

        balPair rightPair = isBal2(node.right);
        if (rightPair.isBal == false)
            return rightPair;

        balPair myAns = new balPair();
        if (Math.abs(leftPair.height - rightPair.height) >= 1) {
            myAns.isBal = false;
            return myAns;
        }

        myAns.height = Math.max(leftPair.height, rightPair.height) + 1;

        return myAns;
    }
}
