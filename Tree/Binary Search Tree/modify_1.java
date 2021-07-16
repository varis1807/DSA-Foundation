//https://practice.geeksforgeeks.org/problems/add-all-greater-values-to-every-node-in-a-bst/1
public class modify_1{
    public void modify(Node root, int[] arr) {
        if (root == null)
            return;

        modify(root.right, arr);

        root.data += arr[0];
        arr[0] = root.data;

        modify(root.left, arr);
    }

    public Node modify(Node root) {
        int[] arr = new int[1];
        modify(root, arr);
        return root;
    }
}