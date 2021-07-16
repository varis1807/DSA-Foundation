import java.util.*;
public class ceilandFloor {
    public static class ceilFloorPair {
        int ceil = (int) 1e9;
        int floor = -(int) 1e9;
    }
    public static void ceilAndFloor(ArrayList<Edge>[] graph, int src, int data, boolean[] vis, int wsf,
            ceilFloorPair pair) {
        if (wsf > data)
            pair.ceil = Math.min(pair.ceil, wsf);

        if (wsf < data)
            pair.floor = Math.max(pair.floor, wsf);
        vis[src] = true;
        for (Edge e : graph[src]) {
            if (!vis[e.nbr]) {
                ceilAndFloor(graph, e.nbr, data, vis, wsf + e.wt, pair);
            }
        }
        vis[src] = false;
    }
    public static void ceilAndFloor(ArrayList<Edge>[] graph, int src, int data) {
        ceilFloorPair pair = new ceilFloorPair();
        boolean[] vis = new boolean[graph.length];
        ceilAndFloor(graph, src, data, vis, 0, pair);

        System.out.println("This is the floor: "+pair.floor+ "\n"+"This is the ceil: "+pair.ceil);
    }
    public static void addEdge(ArrayList<Edge>[] graph, int u, int v, int w) {
        graph[u].add(new Edge(u, v, w));
        graph[v].add(new Edge(v, u, w));
    }
    
    public static void construction() {
        Scanner scn = new Scanner(System.in);
        int N = 7;
        ArrayList<Edge>[] graph = new ArrayList[N];
        for (int i = 0; i < N; i++)
            graph[i] = new ArrayList<>();
        int src = 0;
        addEdge(graph, 0, 1, 10);
        addEdge(graph, 0, 3, 10);
        addEdge(graph, 1, 2, 10);
        addEdge(graph, 2, 3, 40);
        addEdge(graph, 3, 4, 2);
        addEdge(graph, 4, 5, 2);
        addEdge(graph, 4, 6, 8);
        addEdge(graph, 5, 6, 3);
        int data = scn.nextInt();
        ceilAndFloor(graph, src, data);
    }
    public static void main(String[] args) {
        construction();
    }
}
