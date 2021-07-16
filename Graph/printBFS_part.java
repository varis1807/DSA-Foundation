import java.util.*;
public class printBFS_part {
    public static class BFS_Pair {
        int vtx = 0;
        String psf = "";
        int wsf = 0;

        public BFS_Pair(int vtx, String psf, int wsf) {
            this.vtx = vtx;
            this.psf = psf;
            this.wsf = wsf;
        }
    }

    public static void printBFSPath(ArrayList<Edge>[] graph, int src) {
        int vtces = graph.length;
        boolean[] vis = new boolean[vtces];
        LinkedList<BFS_Pair> que = new LinkedList<>();
        que.addLast(new BFS_Pair(src, src + "", 0));

        while (que.size() != 0) {
            int size = que.size();
            while (size-- > 0) {
                BFS_Pair rp = que.removeFirst();
                if (vis[rp.vtx])
                    continue;

                System.out.println(rp.vtx + " -> " + rp.psf + " @ " + rp.wsf);
                vis[rp.vtx] = true;
                for (Edge e : graph[rp.vtx]) {
                    if (!vis[e.nbr])
                        que.addLast(new BFS_Pair(e.nbr, rp.psf + e.nbr, rp.wsf + e.wt));
                }
            }
        }

    }
}
