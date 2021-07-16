import java.util.*;
public class BiPirtite {
    public static boolean bipartite(ArrayList<Edge>[] graph, int src, int[] vis) {
        LinkedList<Integer> que = new LinkedList<>();
        que.addLast(src);
        int color = 0; // 0 : red, 1 : green
        boolean cycle = false, isBipartite = true;

        while (que.size() != 0) {
            int size = que.size();
            while (size-- > 0) {
                int rvtx = que.removeFirst();
                if (vis[rvtx] != -1) { // cycle
                    cycle = true;
                    if (vis[rvtx] != color) { // conflict
                        isBipartite = false;
                        break;
                    }

                    continue; // not any kind oo conflict
                }

                vis[rvtx] = color;

                for (Edge e : graph[rvtx]) {
                    if (vis[e.nbr] == -1) {
                        que.addLast(e.nbr);
                    }
                }
            }

            color = (color + 1) % 2;
            if (!isBipartite)
                break;
        }

        if (cycle) {
            if (isBipartite)
                System.out.println("Even Length Cycle");
            else
                System.out.println("Odd Length Cycle");
        } else if (isBipartite && !cycle) {
            System.out.println("A-Cycle and Bipartite graph");
        }

        return isBipartite;
    }

    public static void bipartite(ArrayList<Edge>[] graph) {

        int N = graph.length;
        int[] vis = new int[N];
        Arrays.fill(vis, -1);

        boolean isBipartite = true;
        for (int i = 0; i < N; i++) {
            if (vis[i] == -1) {
                isBipartite = isBipartite && bipartite(graph, i, vis);
            }
        }

        System.out.println("Overall Graph is Bipartite: " + isBipartite);
    }
}
