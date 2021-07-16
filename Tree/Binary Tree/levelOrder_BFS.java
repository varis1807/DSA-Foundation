import java.util.*;
public class levelOrder_BFS {
    public static void levelOrder(Node root) {
        LinkedList<Node> que = new LinkedList<>(); // removeFirst, addLast
        que.addLast(root);
        int level = 0;

        while (que.size() != 0) {
            int size = que.size(); // size of current level
            while (size-- > 0) {
                Node rn = que.removeFirst();
                System.out.print(rn.data + " ");

                if (rn.left != null)
                    que.addLast(rn.left);
                if (rn.right != null)
                    que.addLast(rn.right);
            }

            level++;
            System.out.println();
        }

    }


}
