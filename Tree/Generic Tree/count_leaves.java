public class count_leaves {
    public static int countLeaves(Node node) {
        if (node.childs.size() == 0)
            return 1;

        int count = 0;
        for (Node child : node.childs)
            count += countLeaves(child);

        return count;
    }
}
