
// {1, 0, 0, 0}
// {1, 1, 0, 0}
// {0, 1, 0, 0}
// {0, 1, 1, 1}
// All enteries in solution path are marked as 1.
import java.util.*;

public class rat_in_maze {
    public static Scanner scn = new Scanner(System.in);

    public static int floodFill(int sr, int sc, int[][] arr, String ans, int[][] dir, String[] dirS,
            ArrayList<String> res) {
        int n = arr.length, m = arr[0].length;
        if (sr == n - 1 && sc == m - 1) {
            res.add(ans);
            return 1;
        }
        arr[sr][sc] = 0; // block
        int count = 0;
        for (int d = 0; d < dir.length; d++) {
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];
            if (r >= 0 && c >= 0 && r < n && c < m && arr[r][c] == 1) {
                count += floodFill(r, c, arr, ans + dirS[d], dir, dirS, res);
            }
        }
        arr[sr][sc] = 1; // free
        return count;
    }
    public static ArrayList<String> findPath(int[][] arr, int n) {
        ArrayList<String> res = new ArrayList<>();
        if (n == 0 || arr[n - 1][n - 1] == 0 || arr[0][0] == 0)
            return res;
        int[][] dir = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
        String[] dirS = { "D", "U", "R", "L" };
        int count = floodFill(0, 0, arr, "", dir, dirS, res);
        Collections.sort(res); // lexicographically increasing order
        return res;
    }
    public static void main(String[] args) {
        // int[][] arr = { { 1, 0, 0, 0 },
        // { 1, 1, 0, 0 },
        // { 1, 1, 0, 0 },
        // { 0, 1, 1, 1 } };
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        System.out.println(findPath(arr, n));

    }
}