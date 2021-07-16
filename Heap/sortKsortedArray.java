import java.util.PriorityQueue;
import java.util.Scanner;

public class sortKsortedArray {
    public static Scanner scn = new Scanner(System.in);

    public static void sortKsortedArray1(int[][] arr) {
        int n = arr.length, m = arr[0].length;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            int r1 = a / m, c1 = a % m, r2 = b / m, c2 = b % m;
            return arr[r1][c1] - arr[r2][c2];
        });
        for (int i = 0; i < n; i++) {
            pq.add(i * m + 0);
        }
        int[] ans = new int[n * m];
        int idx = 0;
        while (pq.size() != 0) {
            Integer eidx = pq.remove(); // encoded index
            int r = eidx / m, c = eidx % m;
            ans[idx++] = arr[r][c];
            c++;
            if (c < m)
                pq.add(r * m + c);
        }
        for (int ele : ans)
            System.out.print(ele + " ");
    }
}
