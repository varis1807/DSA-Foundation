import java.util.*;

class Node {
    int data = 0;
    ArrayList<Node> childs;

    Node(int data) {
        this.data = data;
        this.childs = new ArrayList<>();
    }
}

public class genericTree {

    public static int height(Node root) {
        int h = -1;
        for (Node child : root.childs)
            h = Math.max(height(child), h);

        return h + 1;
    }

    public static int size(Node root) {
        int count = 0;
        for (int i = 0; i < root.childs.size(); i++) {
            Node child = root.childs.get(i);
            count += size(child);
        }

        return count + 1;
    }

    public static int size2(Node root) {
        int count = 0;
        for (Node child : root.childs) {
            count += size(child);
        }

        return count + 1;
    }

    public static int maximum(Node root) {
        int max = root.data;
        for (Node child : root.childs)
            max = Math.max(maximum(child), max);

        return max;
    }

    public static int minimum(Node root) {
        int min = root.data;
        for (Node child : root.childs)
            min = Math.min(minimum(child), min);

        return min;
    }

    public static int sum(Node root) {
        int sum = root.data;
        for (Node child : root.childs)
            sum += sum(child);

        return sum;
    }

    public static boolean find(Node root, int data) {
        if (root.data == data)
            return true;

        boolean res = false;
        for (Node child : root.childs)
            res = res || find(child, data);

        return res;
    }

    public static boolean find2(Node root, int data) {
        if (root.data == data)
            return true;

        boolean res = false;
        for (Node child : root.childs)
            if (find2(child, data)) {
                res = true;
                break;
            }

        return res;
    }

}
