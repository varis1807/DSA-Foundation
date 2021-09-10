
public class ceil_floor {
    public static int ceil;
    public static int floor;
    public static void ceilAndFloor_(Node node, int data) {
        if (node.data < data)
            floor = Math.max(floor, node.data);
        if (node.data > data)
            ceil = Math.min(ceil, node.data);

        for (Node child : node.childs) {
            ceilAndFloor_(child, data);
        }
    }
    public static void ceilAndFloor(Node node, int data) {
        ceil = (int) 1e9;
        floor = -(int) 1e9;
        ceilAndFloor_(node, data);
    }

    
}
