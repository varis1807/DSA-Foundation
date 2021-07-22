// public class flood_fill1 {
//     // Mark
//     // for all unvisited Nbr's
//     // ---->call dfs for Nbr's
//     // unMark

    public static int floodFill(int sr, int sc, int[][] board, String ans, int[][] dir, String[] dirS) {
        int n = board.length, m = board[0].length;
        if (sr == n - 1 && sc == m - 1) {
            System.out.println(ans);
            return 1;
        }

        board[sr][sc] = 1; // blocked

        int count = 0;

        for (int d = 0; d < dir.length; d++) {
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];

            if (r >= 0 && c >= 0 && r < board.length && c < board[0].length) {
                if (board[r][c] == 0)
                    count += floodFill(r, c, board, ans + dirS[d], dir, dirS);
            }
            board[sr][sc] = 0;// free
            return count;
        }

//         board[sr][sc] = 0; //free
//         return count;

//     }

//     public static void main(String[] args) {
//         int board[][] = new int[3][3];
//         int[][] dir = { { 1, 0 }, { 0, 1 }, { 0, -1 }, { -1, 0 } };
//         String[] dirS = { "d", "r", "l", "t" };
//         System.out.println(floodFill(0, 0, board, "", dir, dirS));
//     }
// }



