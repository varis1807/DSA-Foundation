import java.util.*;

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

public class node_to_rootPath {
    Node node;
    public static Scanner scn = new Scanner(System.in);

   
   public static ArrayList<Integer> ntrp(Node node, int data) {
        ArrayList<Integer> list = new ArrayList<>();
     boolean flag=false;
     while(node != null){
         list.add(node.data);
         if(node.data==data){
             flag=true;
             break;
         }
         else if(node.data<data){
             node=node.right;
         }
         else
         node=node.left;
     }
     if(!flag)
     list.clear();
     Collections.reverse(list);
     return list;
    }

    public static void main(String[] args) {
        node_to_rootPath tree = new node_to_rootPath();
        tree.node = new Node(5);
        tree.node.left = new Node(3);
        tree.node.right = new Node(7);
        tree.node.left.left = new Node(1);
        tree.node.left.right = new Node(4);
        int data = scn.nextInt();
        System.out.println(ntrp(tree.node, data));
    }
}
