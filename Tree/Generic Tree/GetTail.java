public class GetTail {
    public static Node getTail(Node node) {
        while (node.childs.size() != 0) {
            node = node.childs.get(0);
        }

        return node;
    }
}
