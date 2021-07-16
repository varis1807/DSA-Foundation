public class add_node{
    public static Node addData(Node node, int data) {
        if (node == null)
            return new Node(data);

        if (node.data < data)
            node.right = addData(node.right, data);
        else if (node.data > data)
            node.left = addData(node.left, data);

        return node;
    }

}

// variss rana