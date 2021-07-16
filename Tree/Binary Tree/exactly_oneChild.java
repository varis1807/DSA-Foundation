import java.util.ArrayList;

public class exactly_oneChild {

    Node node;
  
 // Print the nodes having exactly one child in a Binary tree
 public static void exactlyOneChild_(Node node, ArrayList<Integer> ans) {
    if (node == null || (node.left == null && node.right == null))
        return;

    if (node.left == null || node.right == null)
        ans.add(node.data);

    exactlyOneChild_(node.left, ans);
    exactlyOneChild_(node.right, ans);

}
public static void exactlyOneChild(Node node){
    ArrayList<Integer> ans= new ArrayList<>();
    exactlyOneChild_(node, ans);
    System.out.println(ans);
}
public static void main(String[] args) {
    exactly_oneChild tree=new exactly_oneChild();

    tree.node = new Node(1);
    tree.node.left = new Node(2);
    tree.node.right = new Node(3);
    tree.node.left.left = new Node(4);
  
    tree.node.right.left = new Node(7);
    exactlyOneChild(tree.node);
}
}
