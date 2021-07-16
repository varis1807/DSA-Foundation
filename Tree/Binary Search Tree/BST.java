public class BST {
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

    public static int size(Node node) {
        return node == null ? 0 : size(node.left) + size(node.right) + 1;
    }

    public static int height(Node node) {
        return node == null ? -1 : Math.max(height(node.left), height(node.right)) + 1;
    }

    public static int maximum(Node node) {
        while (node.right != null)
            node = node.right;
        return node.data;
    }

    public static int minimum(Node node) {
        while (node.left != null)
            node = node.left;
        return node.data;
    }

    public static boolean find(Node node, int data) {
        while (node != null) {
            if (node.data == data)
                return true;
            else if (node.data < data)
                node = node.right;
            else
                node = node.left;
        }
        return false;
    }

    public static int sum(Node node){
return node==null?0:sum(node.left)+sum(node.right)+node.data;
    }
}
