import java.util.*;

public class CycleDetectUsing_BFS {
    public static boolean isCyclic(ArrayList<Edge>[] graph, int src) {
        LinkedList<Integer> que = new LinkedList<>();
        int N = graph.length;
        boolean[] vis = new boolean[N];

        que.addLast(src);
        int level = 0;

        boolean isCyclePresent = false;

        while (que.size() != 0) {
            int size = que.size();
            while (size-- > 0) {
                int rvtx = que.removeFirst();

                // for cycle
                if (vis[rvtx]) {
                    isCyclePresent = true;
                    continue;
                }

                vis[rvtx] = true;
                for (Edge e : graph[rvtx]) {
                    if (!vis[e.nbr]) {
                        que.addLast(e.nbr);
                    }
                }
            }
        }
        return isCyclePresent;
    }

// ----------------------OOOOOOOOOOOOOOOOORRRRRRRRRRRRRRRRRRRRRRRRRRRR-----------------------------------------------

    public static boolean cycleDetection(ArrayList<Edge>[] graph, int src, boolean[] vis) {

        LinkedList<Integer> que = new LinkedList<>();
        que.addLast(src);

        while (que.size() != 0) {
            int size = que.size();
            while (size-- > 0) {
                Integer rvtx = que.removeFirst();
                if (vis[rvtx])
                    return true;

                vis[rvtx] = true;
                for (Edge e : graph[rvtx]) {
                    if (!vis[e.nbr])
                        que.addLast(e.nbr);
                }
            }
        }

        return false;
    }

    public static void cycleDetection(ArrayList<Edge>[] graph) {
        int vtces = graph.length;
        boolean[] vis = new boolean[vtces];
        boolean res = false;
        for (int i = 0; i < vtces; i++) {
            if (!vis[i])
                res = res || cycleDetection(graph, i, vis);
        }

        System.out.println(res);
    }

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

}