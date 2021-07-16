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
        int N = 4;
        ArrayList<Edge>[] graph = new ArrayList[N];
        for (int i = 0; i < N; i++)
            graph[i] = new ArrayList<>();
        addEdge(graph, 0, 1, 10);
        addEdge(graph, 0, 2, 10);
        addEdge(graph, 1, 2, 10);
        addEdge(graph, 2, 0, 40);
        addEdge(graph, 2, 3, 2);
        addEdge(graph, 3, 3, 2);
        System.out.println(dfs(graph, 1));
    }

    public static void main(String[] args) {
        construction();
    }
}
