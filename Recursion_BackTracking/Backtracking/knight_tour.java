public class knight_tour {
   // Knight Tour
   public static boolean knightTour(int sr, int sc, int[][] board, int move, int[] dirX, int[] dirY) {
    board[sr][sc] = move; // block
    if (move == 63) {
        return true;
    }
    boolean res = false;
    for (int d = 0; d < 8; d++) {
        int r = sr + dirX[d];
        int c = sc + dirY[d];
        if (r >= 0 && c >= 0 && r < board.length && c < board[0].length && board[r][c] == -1) {
            res = res || knightTour(r, c, board, move + 1, dirX, dirY);
            if (res)
             return res;
        }
    }
    board[sr][sc] = -1; // free
    return res;
}
public static void knightTour() {
    int n = 8;
    int[][] board = new int[n][n];
    for (int i = 0; i < n; i++)
        for (int j = 0; j < n; j++)
            board[i][j] = -1;
    int[] dirX = { 2, 1, -1, -2, -2, -1, 1, 2 };
    int[] dirY = { 1, 2, 2, 1, -1, -2, -2, -1 };
    knightTour(0, 0, board, 0, dirX, dirY);
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++)
            System.out.print(board[i][j] + " | ");
        System.out.println();
    }

}
public static void main(String[] args) {
    // int[][] dir4 = { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 } };
    // String[] dir4S = { "t", "r", "d", "l" };

    // int[][] board = { { 0, 0, 0 }, { 0, 0, 1 }, { 0, 0, 0 } };

    // int[][] dir8 = { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, -1 }, { 1,
    // -1 }, { 1, 1 }, { -1, 1 } };
    // String[] dir8S = { "u", "r", "d", "l", "n", "w", "s", "e" };

    // int n = 3, m = 3;
    // System.out.println(floodFill_2(0, 0, board, "", dir4, dir4S));
    // System.out.println(floodFill_longestLen(0, 0, board, dir4));

    knightTour();
}

}
