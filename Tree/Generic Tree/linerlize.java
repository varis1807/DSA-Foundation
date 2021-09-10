public class linerlize {
    public static Node getTail(Node node) {
        while (node.childs.size() != 0) {
            node = node.childs.get(0);
        }

        return node;
    }
    public static void linearize(Node node) {
        for (Node child : node.childs) {
            linearize(child);
        }

        for (int i = node.childs.size() - 1; i > 0; i--) {
            Node tail = getTail(node.childs.get(i - 1));
            tail.childs.add(node.childs.get(i));

            node.childs.remove(i);
        }
    }
}
