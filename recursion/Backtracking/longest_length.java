public class longest_length {
    public static int floodFill_longestLen(int sr, int sc, int[][] board, int[][] dir) {
        int n = board.length, m = board[0].length;
        if (sr == n - 1 && sc == m - 1) {
            return 0;
        }
        board[sr][sc] = 1; // block
        int longestLen = -1;
        for (int d = 0; d < dir.length; d++) {
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];
            if (r >= 0 && c >= 0 && r < board.length && c < board[0].length) {
                if (board[r][c] == 0) {
                    int recAns = floodFill_longestLen(r, c, board, dir);
                    if (recAns != -1 && recAns + 1 > longestLen) {
                        longestLen = recAns + 1;
                    }
                }
            }
        }
        board[sr][sc] = 0; // free
        return longestLen;
    }
    public static void main(String[] args) {
        int[][] dir = { { 1, 0 }, { 0, 1 }, { 0, -1 }, { -1, 0 } };
        int[][] board = { { 0, 0, 0, 0 }, { 1, 0, 0, 0 }, { 0, 1, 0, 0 }, { 0, 0, 0, 0 } };
        System.out.println(floodFill_longestLen(0, 0, board, dir));
    }
}
