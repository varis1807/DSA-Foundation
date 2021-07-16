import java.util.*;
public class zigzag{
    public List<List<Integer>> zigZag(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null)
            return ans;
        LinkedList<Node> que = new LinkedList<>(); // removeFirst, addLast
        LinkedList<Node> st = new LinkedList<>(); // removeFirst, addFirst

        que.addLast(root);
        int level = 0;

        while (que.size() != 0) {
            int size = que.size();
            List<Integer> smallAns = new ArrayList<>();
            while (size-- > 0) {
                Node rn = que.removeFirst();
                smallAns.add(rn.data);

                if (level % 2 == 0) {
                    if (rn.left != null)
                        st.addFirst(rn.left);
                    if (rn.right != null)
                        st.addFirst(rn.right);
                } else {
                    if (rn.right != null)
                        st.addFirst(rn.right);
                    if (rn.left != null)
                        st.addFirst(rn.left);
                }
            }
            level++;
            ans.add(smallAns);
            LinkedList<Node> temp = que;
            que = st;
            st = temp;
        }

        return ans;

    }

}