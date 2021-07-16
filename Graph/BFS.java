import java.util.*;

public class BFS {
    public static void bfs(ArrayList<Edge>[] graph, int src, int dest) {
        LinkedList<Integer> que = new LinkedList<>();
        int N = graph.length;
        boolean[] vis = new boolean[N];
       
        que.addLast(src);
       
        int level = 0;

        while (que.size() != 0) {
            int size = que.size();
            while (size-- > 0) {
                int rvtx = que.removeFirst();
               
                vis[rvtx] = true;
                System.out.println(rvtx);
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
        int N = 7;
        ArrayList<Edge>[] graph = new ArrayList[N];
        for (int i = 0; i < N; i++)
            graph[i] = new ArrayList<>();
        addEdge(graph, 1, 2, 10);
        addEdge(graph, 1, 3, 10);
        addEdge(graph, 2, 4, 10);
        addEdge(graph, 2, 5, 40);
        addEdge(graph, 3, 5, 2);
        addEdge(graph, 4, 5, 2);
        addEdge(graph, 4, 6, 8);
        addEdge(graph, 5, 6, 3);
        bfs(graph, 1, 6);
    }
public static void main(String[] args) {
    construction();
}
}
