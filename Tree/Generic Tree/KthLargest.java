public class KthLargest {
    public static int floor(Node node, int ub) {
        int maxRes = -(int) 1e9;
        for (Node child : node.childs) {
            int recRes = floor(child, ub);
            maxRes = Math.max(maxRes, recRes);
        }

        return node.data < ub ? Math.max(node.data, maxRes) : maxRes;
    }
    public static int kthLargest(Node node, int k) {
        int ub = (int) 1e9;
        for (int i = 0; i < k; i++) {
            ub = floor(node, ub);
        }

        return ub;
    }
}
