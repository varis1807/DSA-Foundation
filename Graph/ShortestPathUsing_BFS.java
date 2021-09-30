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

    public static void addEdge(ArrayList<Edge>[] graph, int u, int v, int w) {
        graph[u].add(new Edge(u, v, w));
        graph[v].add(new Edge(v, u, w));
    }

    public static void construction() {
        int N = 6;
        ArrayList<Edge>[] graph = new ArrayList[N];
        for (int i = 0; i < N; i++)
            graph[i] = new ArrayList<>();
        addEdge(graph, 1, 2, 6);
        addEdge(graph, 1, 3, 5);
        addEdge(graph, 1, 4, 5);
        addEdge(graph, 2, 5, -1);
        addEdge(graph, 3, 2, -2);
        addEdge(graph, 3, 5, 1);
        addEdge(graph, 4, 3, -2);
        addEdge(graph, 4, 6, -1);
        addEdge(graph, 5, 7, 3);
        addEdge(graph, 6, 7, 3);
        bfs(graph, 1, 7);
    }

    public static void main(String[] args) {
        construction();
    }
}
