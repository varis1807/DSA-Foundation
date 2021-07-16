import java.util.*;

public class ShortestPathUsing_BFS {

    public static void bfs(ArrayList<Edge>[] graph, int src, int dest) {
        LinkedList<Integer> que = new LinkedList<>();
        int N = graph.length;
        boolean[] vis = new boolean[N];

        que.addLast(src);
        int level = 0;

        int shortestPath = -1;

        while (que.size() != 0) {
            int size = que.size();
            while (size-- > 0) {
                int rvtx = que.removeFirst();
                
                // for shortest path
                if (rvtx == dest) {
                    shortestPath = level;
                }

                vis[rvtx] = true;
                for (Edge e : graph[rvtx]) {
                    if (!vis[e.nbr]) {
                        que.addLast(e.nbr);
                    }
                }
            }
        }
    }
}
