public class modify_2 {
    static int sum = 0;

    public static void rwsol(Node node) {
        // write your code here
        if (node == null)
            return;

        rwsol(node.right);
        int od = node.data;
        node.data = sum;
        sum += od;
        rwsol(node.left);
    }
}
