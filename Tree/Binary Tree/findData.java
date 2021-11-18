import java.util.*;

public class findData {
      public static boolean find(Node root, int data) {
            if (root == null)
                  return false;
            if (root.data == data)
                  return true;
            return find(root.left, data) || find(root.right, data);
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
            System.out.println(find(tree.root, 6));
      }
}
