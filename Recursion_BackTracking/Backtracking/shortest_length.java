public class shortest_length {
    public static int floodFill_shortestLen(int sr, int sc, int[][] board, String ans, int[][] dir, String[] dirS) {
        int n = board.length, m = board[0].length;
        if (sr == n - 1 && sc == m - 1) {
            System.out.println(ans);
            return 0;
        }

        board[sr][sc] = 1;

        int shortestLen = (int) 1e9;
        for (int d = 0; d < dir.length; d++) {
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];

            if (r >= 0 && c >= 0 && r < board.length && c < board[0].length) {
                if (board[r][c] == 0) {
                    int recAns = floodFill_shortestLen(r, c, board, ans + dirS[d], dir, dirS);
                    if (recAns != (int) 1e9 && recAns + 1 < shortestLen) {
                        shortestLen = recAns + 1;
                    }
                }
            }
        }

        board[sr][sc] = 0;
        return shortestLen;
    }

    public static void main(String[] args) {
        int[][] dir = { { 1, 0 }, { 0, 1 }, { 0, -1 }, { -1, 0 } };
        String[] dirS = { "d", "r", "l", "u" };
        int[][] board = { { 0, 0, 0 }, { 0, 0, 1 }, { 0, 0, 0 }, { 0, 0, 0 } };
        System.out.println(floodFill_shortestLen(0, 0, board, "", dir, dirS));
    }
}
