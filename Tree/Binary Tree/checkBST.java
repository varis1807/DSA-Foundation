public class checkBST {

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

    static Node prev = null;

    // Static Method
    public static boolean isBST(Node node) {
        if (node == null)
            return true;

        if (!isBST(node.left))
            return false;

        if (prev != null && prev.data >= node.data)
            return false;
        prev = node;

        if (!isBST(node.right))
            return false;
        return true;
    }

    public static class isBSTPair {
        boolean isBST = true;
        int maxEle = -(int) 1e9;
        int minEle = (int) 1e9;
    }

    // Self Method
    public static isBSTPair isBST_02(Node node) {
        if (node == null)
            return new isBSTPair();

        isBSTPair left = isBST_02(node.left);
        if (!left.isBST)
            return left;

        isBSTPair right = isBST_02(node.right);
        if (!right.isBST)
            return right;

        isBSTPair self = new isBSTPair();
        self.isBST = false;

        if (left.maxEle < node.data && right.minEle > node.data) {
            self.maxEle = Math.max(right.maxEle, node.data);
            self.minEle = Math.min(left.minEle, node.data);
            self.isBST = true;
        }

        return self;
    }
}
