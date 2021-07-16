public class rat_in_maze_paths {

    // Mark
    // for all unvisited Nbr's
    // ---->call dfs for Nbr's
    // unMark
    public static void display(int[][] arr) {
        for (int[] a : arr) {
            for (int ele : a)
                System.out.print(ele + " ");
            System.out.println();
        }

    }

    public static int floodFill(int sr, int sc, int[][] board, String ans, int[][] dir, String[] dirS, int[][] ans1) {
        int n = board.length, m = board[0].length;
        if (sr == n - 1 && sc == m - 1) {
            ans1[sr][sc] = 1;
            display(ans1);
            System.out.println(ans);
            return 1;
        }

        board[sr][sc] = 1; // blocked
        ans1[sr][sc] = 1;
        int count = 0;

        for (int d = 0; d < dir.length; d++) {
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];

            if (r >= 0 && c >= 0 && r < board.length && c < board[0].length) {
                if (board[r][c] == 0)
                    count += floodFill(r, c, board, ans + dirS[d], dir, dirS, ans1);
            }
        }

        ans1[sr][sc] = 0;
        board[sr][sc] = 0; // free
        return count;

    }
    public static void main(String[] args) {
        int board[][] = { { 0, 0, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
        int ans1[][] = new int[3][3];
        ans1[0][0] = 1;
        int[][] dir = { { 1, 0 }, { 0, 1 } };
        String[] dirS = { "d", "r" };

        System.out.println(floodFill(0, 0, board, "", dir, dirS, ans1));
    }
}
