public class base {

    public static int mazePath(int sr, int sc, int[][] board, String ans, int[][] dir, String[] dirS) {
        int n = board.length;
        int m = board[0].length;
        if (sr == n - 1 && sc == m - 1) {
            System.out.println(ans);
            return 1;
        }
        board[sr][sc] = 1; // blocked
        int count = 0;
        for (int d = 0; d < dir.length; d++) {
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];

            if (r >= 0 && c >= 0 && r < n && c < m) {
                if (board[r][c] == 0)
                    count += mazePath(r, c, board, ans + dirS[d], dir, dirS);
            }
        }
        board[sr][sc] = 0; // freee
        return count;
    }

    public static void main(String[] args) {
        // int[][] dir = { { 0, 1 }, { 1, 1 }, { 1, 0 } };
        // String[] dirS = { "H", "D", "V" };
        int[][] dir = { { 0, 1 }, { 1, 0 } };
        String[] dirS = { "H", "V" };
        int[][] board = { 
            { 0, 0, 0, 1 }, 
            { 0, 1, 0, 0 }, 
            { 0, 0, 0 ,0}, 
            { 1, 0, 1, 0 }, 
            { 0, 0, 0, 0 } };
        System.out.println(mazePath(0, 0, board, "", dir, dirS));
    }
}
