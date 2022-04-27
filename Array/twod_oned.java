import java.util.*;

public class twod_oned {
      public static void main(String[] args) {
            int[][] arr = { { 49, 2, 3 }, { 6564, 555, 6 }, { 7, 54136, 9 } };
            int[] ans = new int[9];
            int n = arr.length;
            int m = arr[0].length;
            for (int i = 0; i < n; i++) {
                  for (int j = 0; j < m; j++) {
                        ans[i * m + j] = arr[i][j];
                  }
            }
            for(int ele:ans)
            System.out.print(ele+" ");
      }
}
