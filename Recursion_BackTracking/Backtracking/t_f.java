public class t_f {
    public static boolean floodFill_2(int sr, int sc, int[][] board, String ans, int[][] dir, String[] dirS) {
        int n = board.length, m = board[0].length;
        if (sr == n - 1 && sc == m - 1) {
            System.out.println(ans);
            return true;
        }

        board[sr][sc] = 1; // blocked

        boolean res = false;
        for (int d = 0; d < dir.length; d++) {
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];

            if (r >= 0 && c >= 0 && r < board.length && c < board[0].length) {
                if (board[r][c] == 0)
                    res = res || floodFill_2(r, c, board, ans + dirS[d], dir, dirS);
            }
        }

        board[sr][sc] = 0; // free
        return res;
    }

    public static void main(String[] args) {
        // int[][] dir = { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, -1 }, { 1, -1
        // }, { 1, 1 }, { -1, 1 } };
        // String[] dirS = { "u", "r", "d", "l", "n", "w", "s", "e" };
        // int[][] dir = { { -1, 0 }, { 1, 0 }, { 0, 1 }, { 0, -1 }, { -1, -1 }, { 1, -1
        // }, { 1, 1 }, { -1, 1 } };
        // String[] dirS = { "u", "d", "r", "l", "n", "w", "s", "e" };
        int[][] dir = { { 1, 0 }, { 0, 1 } };
        String[] dirS = { "d", "r" };
        int[][] board = { { 0, 0, 0 }, { 0, 0, 1 }, { 0, 0, 0 } };
        System.out.println(floodFill_2(0, 0, board, "", dir, dirS));
    }
}
