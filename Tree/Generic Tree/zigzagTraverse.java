import java.util.*;

public class zigzagTraverse {
    public static void levelOrderZigZag(Node node) {
        if (node == null)
            return;
        LinkedList<Node> que = new LinkedList<>(); // removeFirst, addLast
        LinkedList<Node> st = new LinkedList<>(); // removeFirst, addFirst

        que.addLast(node);
        int level = 0;

        List<List<Integer>> ans = new ArrayList<>();
        while (que.size() != 0) {
            int size = que.size();
            List<Integer> smallAns = new ArrayList<>();
            while (size-- > 0) {
                Node rn = que.removeFirst();
                smallAns.add(rn.data);

                if (level % 2 == 0) {
                    for (Node child : rn.childs)
                        st.addFirst(child);
                } else {
                    for (int i = rn.childs.size() - 1; i >= 0; i--) {
                        Node child = rn.childs.get(i);
                        st.addFirst(child);
                    }
                }
            }
            level++;
            ans.add(smallAns);
            LinkedList<Node> temp = que;
            que = st;
            st = temp;
        }

        for (List<Integer> a : ans) {
            for (int ele : a) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }

    }

}
