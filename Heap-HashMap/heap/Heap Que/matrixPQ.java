import java.util.*;

public class matrixPQ {
      public static void matrixpqMin() {
            int[][] arr = { { 2, 6, 11, 3 }, { 8, 5, 16, 4 }, { 9, 7, 11, 13 }, { 8, 3, 12, 11 } };
            PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
                  return a[0] - b[0];
            });
            for (int ele[] : arr)
                  pq.add(ele);
            while (pq.size() != 0) {
                  int[] a = pq.remove();
                  for (int ele : a)
                        System.out.print(ele + " ");
                  System.out.println();
            }
      }

      public static void main(String[] args) {
            matrixpqMin();
      }
}