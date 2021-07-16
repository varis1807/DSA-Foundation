public class rat_in_maze_with_multiple_jump {
    // Mark for
    // all unvisited Nbr's---->
    // call dfs for Nbr'sunMark

    public static void display(int[][] arr) {
        for (int[] a : arr) {
            for (int ele : a)
                System.out.print(ele + " ");
            System.out.println();
        }
    }

    public static int floodFill(int sr, int sc, int[][] board, String ans, int[][] dir, String[] dirS, int[][] ans1,
            int Radius) {
        int n = board.length, m = board[0].length;
        if (sr == n - 1 && sc == m - 1) {
            ans1[sr][sc] = 1;
            display(ans1);
            System.out.println(ans);
            return 1;
        }
        board[sr][sc] = 0; // blocked
        ans1[sr][sc] = 1;
        int count = 0;

        for (int d = 0; d < dir.length; d++) {
            for (int rad = 1; rad <= Radius; rad++) {
                int r = sr + rad * dir[d][0];
                int c = sc + rad * dir[d][1];

                if (r >= 0 && c >= 0 && r < board.length && c < board[0].length) {
                    if (board[r][c] == 1)
                        count += floodFill(r, c, board, ans + dirS[d], dir, dirS, ans1, Radius);
                } else
                    break;
            }
        }
        ans1[sr][sc] = 0;
        board[sr][sc] = 1; // free
        return count;

    }

    public static void main(String[] args) {
        //int board[][] = { { 0, 0, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
        int board[][] = { 
            { 1, 1, 0, 0 }, 
            { 1, 0, 0, 1 }, 
            { 0, 1, 0, 1 }, 
            { 0, 0, 0, 1 } };
        int ans1[][] = new int[4][4];
        ans1[0][0] = 1;
        int[][] dir = { { 1, 0 }, { 0, 1 },{0,-1},{-1,0}};
        String[] dirS = { "d", "r","l","u"};
        int n = 3, m = 3;
        System.out.println(floodFill(0, 0, board, "", dir, dirS, ans1, Math.max(n, m)));
    }
    // public static boolean mazePath(int[][] mat,int sr,int sc,int[][] vis,String
    // str){
    // if(sr==mat.length-1 && sc==mat[0].length-1){
    // System.out.println(str);
    // return false;
    // }
    // int val = mat[sr][sc];
    // for(int jump = 1;jump<=val;jump++){
    // vis[sr][sc] = true;
    // for(int d=0;d<4;d++){
    // int r = sr+jump*dir[d][0];
    // int c = sc+jump*dir[d][1];
    // if(r>=0 && c>=0 && r<mat.length && c<mat[0].length && !vis[r][c] &&
    // mat[r][c]!=0){
    // mazePath(mat,r,c,vis,str+ch);
    // }
    // }
    // }

}

// {2, 1, 0, 0},
// {3, 0, 0, 1},
// {0, 1, 0, 1},
// {0, 0, 0, 1}
