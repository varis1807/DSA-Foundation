import java.util.*;
public class printAllPath {
    public static int PrintAllPath(ArrayList<Edge>[] graph, int src, int dest, boolean[] vis, String psf) {
        if (src == dest) {
            System.out.println(psf + dest);
            return 1;
        }
        int count = 0;
        vis[src] = true;
        for (Edge e : graph[src]) {
            if (!vis[e.nbr])
                count += PrintAllPath(graph, e.nbr, dest, vis, psf + src);
        }

        vis[src] = false;
        return count;
    }
}
