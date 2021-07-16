import java.util.*;

public class getConnectedComponentOfGraph {
    public static void dfs_GCC(ArrayList<Edge>[] graph, int src, boolean[] vis) {
        vis[src] = true;
        for (Edge e : graph[src]) {
            if (!vis[e.nbr])
                dfs_GCC(graph, e.nbr, vis);
        }
    }
    public static void gcc(ArrayList<Edge>[] graph){
        int N=graph.length, componentCount=0;
        boolean[] vis=new boolean[N];
        for(int i=0; i<N; i++){
            if(!vis[i]){
                dfs_GCC(graph,i,vis);
                componentCount++;
            }
        }
        System.out.println(componentCount);
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
            //addEdge(graph, 3, 4, 2);
            addEdge(graph, 4, 5, 2);
            addEdge(graph, 4, 6, 8);
            addEdge(graph, 5, 6, 3);
        gcc(graph);
    }

    public static void main(String[] args) {
        construction();
    }
}
