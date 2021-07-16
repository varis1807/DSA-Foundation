public class KthLargest {
    public static int kthLargest(Node node, int k) {
        int ub = (int) 1e9;
        for (int i = 0; i < k; i++) {
            ub = floor(node, ub);
        }

        return ub;
    }
}
