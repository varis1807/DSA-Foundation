import java.util.*;

public class BFS {
    public static void levelOrderLineWise(Node root) {
        LinkedList<Node> que = new LinkedList<>(); // removeFirst, addLast
        que.addLast(root);
        int level = 0;

        while (que.size() != 0) {
            int size = que.size();
            while (size-- > 0) {
                Node rn = que.removeFirst();
                System.out.print(rn.data + " ");

                for (Node child : rn.childs) {
                    que.addLast(child);
                }
            }
            System.out.println();
        }
    }

    public List<List<Integer>> levelOrderLineWise1(Node root) {
        LinkedList<Node> que = new LinkedList<>(); // removeFirst, addLast
        que.addLast(root);
        int level = 0;

        List<List<Integer>> ans = new ArrayList<>();
        while (que.size() != 0) {
            int size = que.size();
            List<Integer> smallAns = new ArrayList<>();
            while (size-- > 0) {
                Node rn = que.removeFirst();
                smallAns.add(rn.data);

                for (Node child : rn.childs) {
                    que.addLast(child);
                }
            }
            ans.add(smallAns);
        }

        return ans;
    }

    public List<List<Integer>> levelOrderLineWise2(Node root) {
        LinkedList<Node> que = new LinkedList<>(); // removeFirst, addLast
        que.addLast(root);
        int level = 0;

        List<List<Integer>> ans = new ArrayList<>();
        while (que.size() != 0) {
            int size = que.size();
            List<Integer> smallAns = new ArrayList<>();
            while (size-- > 0) {
                Node rn = que.removeFirst();
                smallAns.add(rn.data);

                for (Node child : rn.childs) {
                    que.addLast(child);
                }
            }
            ans.add(smallAns);
        }

        return ans;
    }
}
