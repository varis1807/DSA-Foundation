public class tilt_BT {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        Node(int data) {
            this(data, null, null);
        }
    }

    public static class tiltPair {
        int tiltSF = 0;
        int sum = 0;
    }

    public tiltPair findTilt_(Node root) {
        if (root == null)
            return new tiltPair();

        tiltPair left = findTilt_(root.left);
        tiltPair right = findTilt_(root.right);

        tiltPair myAns = new tiltPair();

        myAns.tiltSF = left.tiltSF + right.tiltSF + Math.abs(left.sum - right.sum);
        myAns.sum = left.sum + right.sum + root.data;
        return myAns;
    }
    public int findTilt(Node root) {
        tiltPair ret= findTilt_(root);
        return ret.tiltSF;
        
    }
}
