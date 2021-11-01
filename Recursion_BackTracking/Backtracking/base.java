import java.util.Arrays;

public class base {
    // Recursion
    // public static int mazePath(int sr, int sc, int[][] board, String ans, int[][]
    // dir, String[] dirS) {
    // int n = board.length;
    // int m = board[0].length;
    // if (sr == n - 1 && sc == m - 1) {
    // System.out.println(ans);
    // return 1;
    // }
    // board[sr][sc] = 1; // blocked
    // int count = 0;
    // for (int d = 0; d < dir.length; d++) {
    // int r = sr + dir[d][0];
    // int c = sc + dir[d][1];

    // if (r >= 0 && c >= 0 && r < n && c < m) {
    // if (board[r][c] == 0)
    // count += mazePath(r, c, board, ans + dirS[d], dir, dirS);
    // }
    // }
    // board[sr][sc] = 0; // freee
    // return count;
    // }

    // public static void main(String[] args) {
    // // int[][] dir = { { 0, 1 }, { 1, 1 }, { 1, 0 } };
    // // String[] dirS = { "H", "D", "V" };
    // int[][] dir = { { 0, 1 }, { 1, 0 } };
    // String[] dirS = { "H", "V" };
    // int[][] board = {
    // { 0, 0, 0},
    // { 0, 0, 0},
    // { 0, 0, 0}};
    // System.out.println(mazePath(0, 0, board, "", dir, dirS));
    // }

    // Dynamic Progeamming
    // Memoization
    public static int mazePath_memo(int sr, int sc, int[][] board, String ans, int[][] dir, String[] dirS, int[][] dp) {
        int n = board.length;
        int m = board[0].length;
        if (sr == n - 1 && sc == m - 1) {
            System.out.println(ans);
            return dp[sr][sc] = 1;
        }
        if (dp[sr][sc] != -1)
            return dp[sr][sc];
        board[sr][sc] = 1; // blocked
        int count = 0;
        for (int d = 0; d < dir.length; d++) {
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];

            if (r >= 0 && c >= 0 && r < n && c < m) {
                if (board[r][c] == 0)
                    count += mazePath_memo(r, c, board, ans + dirS[d], dir, dirS, dp);
            }
        }
        board[sr][sc] = 0; // freee
        return dp[sr][sc] = count;
    }

    // public static void main(String[] args) {
    // // int[][] dir = { { 0, 1 }, { 1, 1 }, { 1, 0 } };
    // // String[] dirS = { "H", "D", "V" };
    // int[][] dir = { { 0, 1 }, { 1, 0 } };
    // String[] dirS = { "H", "V" };
    // int[][] dp = new int[4][4];
    // for (int d[] : dp)
    // Arrays.fill(d, -1);
    // int[][] board = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0,
    // 0 } };
    // System.out.println(mazePath_memo(0, 0, board, "", dir, dirS, dp));
    // display2D(dp);
    // }

    // Tabulation
    public static int mazePath_tabu(int SR, int SC, int[][] board, String ans, int[][] dir, String[] dirS, int[][] dp) {
        int n = board.length;
        int m = board[0].length;
        for (int sr = n - 1; sr >= SR; sr--) {
            for (int sc = n - 1; sc >= SC; sc--) {
                if (sr == n - 1 && sc == m - 1) {
                    System.out.println(ans);
                    dp[sr][sc] = 1;
                    continue;
                }

                board[sr][sc] = 1; // blocked
                int count = 0;
                for (int d = 0; d < dir.length; d++) {
                    int r = sr + dir[d][0];
                    int c = sc + dir[d][1];

                    if (r >= 0 && c >= 0 && r < n && c < m) {
                        if (board[r][c] == 0)
                            count += dp[r][c];
                    }
                }
                board[sr][sc] = 0; // freee
                dp[sr][sc] = count;
            }
        }

        return dp[SR][SC];
    }

    public static void display(int[] dp) {
        for (int ele : dp) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void display2D(int[][] dp) {
        for (int[] d : dp) {
            display(d);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // int[][] dir = { { 0, 1 }, { 1, 1 }, { 1, 0 } };
        // String[] dirS = { "H", "D", "V" };
        int[][] dir = { { 0, 1 }, { 1, 0 } };
        String[] dirS = { "H", "V" };
        int[][] dp = new int[3][3];
        for (int d[] : dp)
            Arrays.fill(d, -1);
        int[][] board = { 
            { 0, 0, 0 }, 
            { 0, 1, 0 }, 
            { 0, 0, 0} };
        System.out.println(mazePath_memo(0, 0, board, "", dir, dirS, dp));
        display2D(dp);
    }
}
