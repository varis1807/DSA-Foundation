public class remove_node {
    public static int minimum(Node node) {
        while (node.left != null)
            node = node.left;
        return node.data;
    }
    public static Node removeNode(Node node, int data) {
        if (node == null)
            return null;

        if (node.data < data)
            node.right = removeNode(node.right, data);
        else if (node.data > data)
            node.left = removeNode(node.left, data);
        else {
            if (node.left == null || node.right == null)
                return node.left != null ? node.left : node.right;

            int minEle = minimum(node.right);
            node.data = minEle;

            node.right = removeNode(node.right, minEle);
        }

        return node;
    } 
}
