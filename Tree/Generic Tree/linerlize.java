public class linerlize {
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
