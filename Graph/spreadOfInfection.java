import java.util.*;

public class spreadOfInfection {
  public static int spreadInfection(ArrayList<Edge>[] graph, int infectedPerson, int NoOfDays) {
    LinkedList<Integer> que = new LinkedList<>();
    boolean[] vis = new boolean[graph.length];

    que.addLast(infectedPerson);

    int infectedCount = 0, day = 1;
    while (que.size() != 0) {
      int size = que.size();

      if (day > NoOfDays)
        break;

      while (size-- > 0) {
        int ip = que.removeFirst(); // infectedPerson
        if (vis[ip])
          continue;

        vis[ip] = true;
        infectedCount++;

        for (Edge e : graph[ip]) {
          if (!vis[e.nbr])
            que.addLast(e.nbr);
        }

      }

      day++;

    }

    return infectedCount;
  }

}
