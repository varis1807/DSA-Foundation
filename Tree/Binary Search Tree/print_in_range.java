public class print_in_range {
    public static void printInRange(Node node, int lr, int rr) {
        if (node == null)
            return;

        printInRange(node.left, lr, rr);

        if (node.data >= lr && node.data <= rr)
            System.out.print(node.data);

        printInRange(node.right, lr, rr);
    }
}
