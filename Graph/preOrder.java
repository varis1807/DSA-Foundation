import java.util.*;
public class preOrder {
    public static void PreOrder(ArrayList<Edge>[] graph, int src, boolean[] vis, int wsf, String psf) {
        System.out.println(src + " -> " + (psf + src) + " @ " + wsf);
        vis[src] = true;
        for (Edge e : graph[src]) {
            if (!vis[e.nbr])
                PreOrder(graph, e.nbr, vis, wsf + e.wt, psf + src);
        }

        vis[src] = false;
    }
}
