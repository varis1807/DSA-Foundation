public class diameter {
    public static int height(Node node) {
        return node == null ? -1 : Math.max(height(node.left), height(node.right)) + 1;
    }
    public int diameterOfBinaryTree_(Node root) {
        if (root == null)
            return 0;

        int ld = diameterOfBinaryTree_(root.left);
        int rd = diameterOfBinaryTree_(root.right);

        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(Math.max(ld, rd), lh + rh + 2);
    }

    // {diameter, height}
    public int[] diameterOfBinaryTree_02(Node root) {
        if (root == null)
            return new int[] { 0, -1 };

        int[] ld = diameterOfBinaryTree_02(root.left);
        int[] rd = diameterOfBinaryTree_02(root.right);

        int[] myAns = new int[2];
        myAns[0] = Math.max(Math.max(ld[0], rd[0]), ld[1] + rd[1] + 2);
        myAns[1] = Math.max(ld[1], rd[1]) + 1;

        return myAns;
    }

    int diameter = 0;

    public int diameterOfBinaryTree_03(Node root) {
        if (root == null)
            return -1;

        int ld = diameterOfBinaryTree_03(root.left);
        int rd = diameterOfBinaryTree_03(root.right);

        diameter = Math.max(diameter, ld + rd + 2);
        return Math.max(ld, rd) + 1;
    }

    public static class lBSTPair {
        boolean isBST = true;
        int max = -(int) 1e9;
        int min = (int) 1e9;

        int MaxSize = 0;
        Node MaxBSTNode = null;
    } 
}
