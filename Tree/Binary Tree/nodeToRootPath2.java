import java.util.*;
public class nodeToRootPath2 {
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
    
    
    public static ArrayList<Node> nodeToRootPath02_(Node node, int data) {
        if (node == null)
            return null;

        if (node.data == data) {
            ArrayList<Node> list = new ArrayList<>();
            list.add(node);
            return list;
        }

        ArrayList<Node> left = nodeToRootPath02_(node.left, data);
        if (left != null) {
            left.add(node);
            return left;
        }

        ArrayList<Node> right = nodeToRootPath02_(node.right, data);
        if (right != null) {
            right.add(node);
            return right;
        }

        return null;
    }

    public static ArrayList<Node> nodeToRootPath02(Node node, int data) {
        ArrayList<Node> ans = nodeToRootPath02_(node, data);
        return ans != null ? ans : new ArrayList<>();
    }

}
