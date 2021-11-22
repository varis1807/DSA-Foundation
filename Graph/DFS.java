import java.util.*;

public class DFS {
    public static void dfs(ArrayList<Edge>[] graph, int src, boolean[] vis, ArrayList<Integer> ans) {
        vis[src] = true;
        ans.add(src);
        for (Edge e : graph[src]) {
            if (!vis[e.nbr])
                dfs(graph, e.nbr, vis, ans);
        }
    }

    public static ArrayList<Integer> dfs(ArrayList<Edge>[] graph, int src) {
        int N=graph.length;
        boolean vis[] = new boolean[N];      
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < N; i++)
            if (!vis[i])
                dfs(graph, src, vis, ans);

        return ans;
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
            addEdge(graph, 1, 2, 10);
            addEdge(graph, 1, 3, 10);
            addEdge(graph, 1, 4, 10);
            addEdge(graph, 2, 1, 40);
            addEdge(graph, 2, 3, 2);
            addEdge(graph, 2, 5, 2);
            addEdge(graph, 3, 1, 10);
            addEdge(graph, 3, 2, 10);
            addEdge(graph, 3, 4, 10);
            addEdge(graph, 3, 5, 40);
            addEdge(graph, 3, 6, 2);
            addEdge(graph, 4, 1, 2);
            addEdge(graph, 4, 3, 8);
            addEdge(graph, 4, 6, 3);
            addEdge(graph, 5, 2, 40);
            addEdge(graph, 5, 3, 2);
            addEdge(graph, 5, 6, 2);
            addEdge(graph, 6, 3, 8);
            addEdge(graph, 6, 4, 3);
            addEdge(graph, 6, 5, 3);
        System.out.println(dfs(graph, 1));
    }

    public static void main(String[] args) {
        construction();
    }
}
