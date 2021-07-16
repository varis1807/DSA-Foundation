public class largestBst {
    public static class lBSTPair {
        boolean isBST = true;
        int max = -(int) 1e9;
        int min = (int) 1e9;

        int MaxSize = 0;
        Node MaxBSTNode = null;
    }

    public static lBSTPair largestBST(Node node) {
        if (node == null)
            return new lBSTPair();

        lBSTPair left = largestBST(node.left);
        lBSTPair right = largestBST(node.right);

        lBSTPair myAns = new lBSTPair();
        if (left.isBST && right.isBST && left.max < node.data && node.data < right.min) {
            myAns.isBST = true;
            myAns.min = Math.min(left.min, node.data);
            myAns.max = Math.max(right.max, node.data);

            myAns.MaxSize = left.MaxSize + right.MaxSize + 1;
            myAns.MaxBSTNode = node;
        } else {
            myAns.isBST = false;
            myAns.MaxSize = Math.max(left.MaxSize, right.MaxSize);
            myAns.MaxBSTNode = left.MaxSize > right.MaxSize ? left.MaxBSTNode : right.MaxBSTNode;
        }

        return myAns;
    }
}
