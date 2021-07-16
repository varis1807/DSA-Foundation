public class flood_fill2 {
    // 0 -> empty cell, 1 -> blocked cell
    public static int floodFill_Jump(int sr, int sc, int[][] board, String ans, int[][] dir8, String[] dir8S,
            int Radius) {
        int n = board.length, m = board[0].length;
        if (sr == n - 1 && sc == m - 1) {
            System.out.println(ans);
            return 1;
        }

        board[sr][sc] = 1;

        int count = 0;

        for (int d = 0; d < dir8.length; d++) {
            for (int rad = 1; rad <= Radius; rad++) {
                int r = sr + rad * dir8[d][0];
                int c = sc + rad * dir8[d][1];

                if (r >= 0 && c >= 0 && r < board.length && c < board[0].length) {
                    if (board[r][c] == 0)
                        count += floodFill_Jump(r, c, board, ans + rad + dir8S[d], dir8, dir8S, Radius);
                } else
                    break;
            }
        }

        board[sr][sc] = 0;
        return count;
    }

    public static void main(String[] args) {
        int[][] dir8 = { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, -1 }, { 1, -1 }, { 1, 1 }, { -1, 1 } };
        String[] dir8S = { "u", "r", "d", "l", "n", "w", "s", "e" };
        int board[][] = new int[3][3];
        int n = 3, m = 3;
        System.out.println(floodFill_Jump(0, 0, board, "", dir8, dir8S, Math.max(n, m)));
    }
}
