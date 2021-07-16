import java.util.*;

class Node {
    int data = 0;
    ArrayList<Node> childs;

    Node(int data) {
        this.data = data;
        this.childs = new ArrayList<>();
    }
}

public class node_to_root_path {
    public static boolean nodeToRootPath(Node root, int data, ArrayList<Node> ans) {

        if (root.data == data) {
            ans.add(root);
            return true;
        }

        boolean res = false;
        for (Node child : root.childs)
            res = res || nodeToRootPath(child, data, ans);

        if (res)
            ans.add(root);
        return res;
    }

    public static ArrayList<Node> nodeToRootPath(Node root, int data) {
        if (root.data == data) {
            ArrayList<Node> base = new ArrayList<>();
            base.add(root);
            return base;
        }

        ArrayList<Node> smallAns = new ArrayList<>();
        for (Node child : root.childs) {
            smallAns = nodeToRootPath(child, data);
            if (smallAns.size() != 0)
                break;
        }
        if (smallAns.size() != 0)
            smallAns.add(root);
        return smallAns;
    }
}
