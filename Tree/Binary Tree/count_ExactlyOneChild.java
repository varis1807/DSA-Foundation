// class Node {
//     int data;
//     Node left;
//     Node right;

//     Node(int data, Node left, Node right) {
//         this.data = data;
//         this.left = left;
//         this.right = right;
//     }

//     Node(int data) {

//         this(data, null, null);
//     }
// }
public class count_ExactlyOneChild {
    Node node;

    public static int countExactlyOneChild(Node node) {
        if (node == null || (node.left == null && node.right == null))
            return 0;

        int left = countExactlyOneChild(node.left);
        int right = countExactlyOneChild(node.right);
        int sum = left + right;
        if (node.left == null || node.right == null)
            sum += 1;
        return sum;

    }

    public static void main(String[] args) {
        count_ExactlyOneChild tree = new count_ExactlyOneChild();

        tree.node = new Node(1);
        tree.node.left = new Node(2);
        tree.node.right = new Node(3);
        tree.node.left.left = new Node(4);
        tree.node.right.left = new Node(7);
        tree.node.right.right = new Node(8);
        tree.node.right.left.left = new Node(9);
        tree.node.right.right.right = new Node(11);
        tree.node.right.right.right.right = new Node(12);
        tree.node.right.right.right.right.right = new Node(13);
        tree.node.right.right.right.right.right.right = new Node(13);
        tree.node.right.right.right.right.right.right.right = new Node(13);
        tree.node.right.right.right.right.right.right.right.right = new Node(13);
        tree.node.right.right.right.right.right.right.right.right.right = new Node(13);
        tree.node.right.right.right.right.right.right.right.right.right.right = new Node(13);
   
        System.out.println(countExactlyOneChild(tree.node));
    }
}