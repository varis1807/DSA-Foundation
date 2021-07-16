import java.util.*;

public class hashPath {
    public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest, boolean[] vis, String psf, int wsf) {
        if (src == dest) {
            System.out.print(psf+dest);
            return true;       
        } 
        vis[src] = true;
        boolean res = false;
        for (Edge e : graph[src])
            if (!vis[e.nbr])
                res = res || hasPath(graph, e.nbr, dest, vis, psf + src, wsf);

        return res;
    }

    public static void hashPath(ArrayList<Edge>[] graph, int src, int dest) {
        boolean[] vis = new boolean[graph.length];
        String psf = " ";
        hasPath(graph, src, dest, vis, psf, 0);
    }

    public static void addEdge(ArrayList<Edge>[] graph, int u, int v, int w) {
        graph[u].add(new Edge(u, v, w));
        graph[v].add(new Edge(v, u, w));
    }

    public static void construction() {
        int N = 7;
        ArrayList<Edge>[] graph = new ArrayList[N];
        for (int i = 0; i < N; i++)
            graph[i] = new ArrayList<>();
        addEdge(graph, 0, 1, 10);
        addEdge(graph, 0, 3, 10);
        addEdge(graph, 1, 2, 10);
        addEdge(graph, 2, 3, 40);
        addEdge(graph, 3, 4, 2);
        addEdge(graph, 4, 5, 2);
        addEdge(graph, 4, 6, 8);
        // addEdge(graph, 5, 6, 3);
        hashPath(graph, 0, 6);
    }

    public static void main(String[] args) {
        construction();
    }
}
