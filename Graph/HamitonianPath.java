import java.util.*;

public class HamitonianPath {
    public static int findEdge(ArrayList<Edge>[] graph, int u, int v) {
        ArrayList<Edge> list = graph[u];
        for (int i = 0; i < list.size(); i++) {
            Edge e = list.get(i);
            if (e.nbr == v)
                return i;
        }

        return -1;
    }

    public static void hamintonianPathCycle(ArrayList<Edge>[] graph, int osrc, int src, int EdgeCount, boolean[] vis,
            String ans) {
        if (EdgeCount == graph.length - 1) {
            int idx = findEdge(graph, src, osrc);
            if (idx != -1) {
                System.out.println(ans + src + "*");
            } else {
                System.out.println(ans + src + ".");
            }
            return;
        }
        vis[src] = true;
        for (Edge e : graph[src]) {
            if (!vis[e.nbr]) {
                hamintonianPathCycle(graph, osrc, e.nbr, EdgeCount + 1, vis, ans + src);
            }

        }

        vis[src] = false;

    }

    public static void hamintonianPathCycle(ArrayList<Edge>[] graph, int src) {
        int N = graph.length;
        boolean[] vis = new boolean[N];
        hamintonianPathCycle(graph, src, src, 0, vis, "");
    }

}
