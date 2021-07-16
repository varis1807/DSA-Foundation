public class Count_number_of_ways_to_reach_destination_in_a_Maze {
 
    // public static int floodFill(int sr, int sc, int[][] arr, int[][] dir) {
    //     int mod = (int) 1e9 + 7;
    //     int n = arr.length, m = arr[0].length;
    //     if (sr == n - 1 && sc == m - 1) {
    //         return 1;
    //     }
    //     arr[sr][sc] = 1; // block
    //     int count = 0;
    //     for (int d = 0; d < dir.length; d++) {
    //         int r = sr + dir[d][0];
    //         int c = sc + dir[d][1];

    //         if (r >= 0 && c >= 0 && r < n && c < m && arr[r][c] == 0) {
    //             count = (count % mod + floodFill(r, c, arr, dir) % mod) % mod;
    //         }
    //     }
    //     arr[sr][sc] = 0; // free
    //     return count;
    // }
    // public static int findWays(int n, int m, int[][] blocked_cells) {
    //     int[][] arr = new int[n][m];
    //     // for (int[] cell : blocked_cells) {
    //     //     int i = cell[0] - 1;
    //     //     int j = cell[1] - 1;
    //     //    arr[i][j] = 1;
    //     // }
    //     if (arr[n - 1][m - 1] == 1 || arr[0][0] == 1)
    //         return 0;
    //     int[][] dir = { { 0, 1 }, { 1, 0 } };
    //     int count = floodFill(0, 0, arr, dir);
    //     return count;
    // }
    // public static void main(String[] args) {
    //     int[][] blocked_cells = { { 0, 1, 0 }, { 0,  0, 0 }, { 0, 1, 0} };
    //     System.out.println(findWays(3, 3, blocked_cells));
    // }
    public static int floodFill(int sr, int sc, int[][] arr, int[][] dir) {
    int n = arr.length, m = arr[0].length;
    if (sr == n - 1 && sc == m - 1) {
    return 1;
    }
    arr[sr][sc] = 1; // block
    int count = 0;
    for (int d = 0; d < dir.length; d++) {
    int r = sr + dir[d][0];
    int c = sc + dir[d][1];

    if (r >= 0 && c >= 0 && r < n && c < m) {
    if (arr[r][c] == 0)
    count += floodFill(r, c, arr, dir);
    }
    }
    arr[sr][sc] = 0; // free
    return count;
    }

    public static int findWays(int n, int m, int[][] arr) {
    // int[][] arr = new int[n][m];

    int[][] dir = { { 0, 1 }, { 1, 0 } };
    int count = floodFill(0, 0, arr, dir);
    return count;
    }

    public static void main(String[] args) {
    int[][] arr = { { 0, 1, 0 }, { 0,  0, 0 }, { 0, 1, 0} };
    System.out.println(findWays(3, 3, arr));
    }
}
// https://www.geeksforgeeks.org/count-number-ways-reach-destination-maze/

// Input: maze[R][C] = {{0, 0, 0, 0},
// {0, -1, 0, 0},
// {-1, 0, 0, 0},
// {0, 0, 0, 0}};
// Output: 4
// There are four possible paths as shown in
// below diagram.