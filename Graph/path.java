public class path {
      static void BellmanFord(int graph[][], int V, int E, int src) {
            // Initialize distance of all vertices as infinite.
            int[] dis = new int[V];
            for (int i = 0; i < V; i++)
                  dis[i] = Integer.MAX_VALUE;

            // initialize distance of source as 0
            dis[src] = 0;

            // Relax all edges |V| - 1 times. A simple
            // shortest path from src to any other
            // vertex can have at-most |V| - 1 edges
            for (int i = 0; i < V - 1; i++) {

                  for (int j = 0; j < E; j++) {
                        if (dis[graph[j][0]] != Integer.MAX_VALUE && dis[graph[j][0]] + graph[j][2] < dis[graph[j][1]])
                              dis[graph[j][1]] = dis[graph[j][0]] + graph[j][2];
                  }
            }

            // check for negative-weight cycles.
            // The above step guarantees shortest
            // distances if graph doesn't contain
            // negative weight cycle. If we get a
            // shorter path, then there is a cycle.
            for (int i = 0; i < E; i++) {
                  int x = graph[i][0];
                  int y = graph[i][1];
                  int weight = graph[i][2];
                  if (dis[x] != Integer.MAX_VALUE && dis[x] + weight < dis[y])
                        System.out.println("Graph contains negative" + " weight cycle");
            }

            System.out.println("Vertex Distance from Source");
            for (int i = 0; i < V; i++)
                  System.out.println(i + "\t\t" + dis[i]);
      }

      // Driver code
      public static void main(String[] args) {
            int V = 7; // Number of vertices in graph
            int E = 10; // Number of edges in graph

            // Every edge has three values (u, v, w) where
            // the edge is from vertex u to v. And weight
            // of the edge is w.
            int graph[][] = { { 1, 2, 10 }, { 1, 3, 10 }, { 2, 1, 10 }, { 2, 4, 10 }, { 2, 5, 40 }, { 3, 1, 10 },
                        { 3, 5, 2 }, { 4, 2, 10 }, { 4, 5, 2 }, { 5, 2, 40 }, { 5, 3, 2 }, { 5, 4, 2 }, { 6, 4, 8 },
                        { 6, 5, 3 } };

            BellmanFord(graph, V, E, 0);
      }
}
