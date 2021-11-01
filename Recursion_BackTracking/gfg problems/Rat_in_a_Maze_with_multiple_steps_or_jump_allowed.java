public class Rat_in_a_Maze_with_multiple_steps_or_jump_allowed {
    // Java program to solve Rat in a Maze problem
    // using backtracking
    // Maze size
    static int N = 4;

    /*
     * A utility function to print solution matrix sol[N][N]
     */
    static void printSolution(int sol[][]) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf(" %d ", sol[i][j]);
            }
            System.out.printf("\n");
        }
    }

    /*
     * A utility function to check if x, y is valid index for N*N maze
     */
    static boolean isSafe(int maze[][], int x, int y) {
        // if (x, y outside maze) return false
        if (x >= 0 && x < N && y >= 0 && y < N && maze[x][y] != 0) {
            return true;
        }

        return false;
    }

    /*
     * This function solves the Maze problem using Backtracking. It mainly uses
     * solveMazeUtil() to solve the problem. It returns false if no path is
     * possible, otherwise return true and prints the path in the form of 1s. Please
     * note that there may be more than one solutions, this function prints one of
     * the feasible solutions.
     */
    static boolean solveMaze(int maze[][]) {
        int sol[][] = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };
        if (solveMazeUtil(maze, 0, 0, sol) == false) {
            System.out.printf("Solution doesn't exist");
            return false;
        }

        printSolution(sol);
        return true;
    }

    /* A recursive utility function to solve Maze problem */
    static boolean solveMazeUtil(int maze[][], int x, int y, int sol[][]) {
        // if (x, y is goal) return true
        if (x == N - 1 && y == N - 1) {
            sol[x][y] = 1;
            return true;
        }

        // Check if maze[x][y] is valid
        if (isSafe(maze, x, y) == true) {

            // mark x, y as part of solution path
            sol[x][y] = 1;

            /* Move forward in x direction */
            for (int i = 1; i <= maze[x][y] && i < N; i++) {
                /* Move forward in x direction */
                if (solveMazeUtil(maze, x + i, y, sol) == true) {
                    return true;
                }
                /*
                 * If moving in x direction doesn't give solution then Move down in y direction
                 */
                if (solveMazeUtil(maze, x, y + i, sol) == true) {
                    return true;
                }
            }
            /*
             * If none of the above movements work then BACKTRACK: unmark x, y as part of
             * solution path
             */
            sol[x][y] = 0;
            return false;
        }
        return false;
    }
    // Driver Code
    public static void main(String[] args) {
        int maze[][] = { { 2, 1, 0, 0 }, { 3, 0, 0, 1 }, { 0, 1, 0, 1 }, { 0, 0, 0, 1 } };

        solveMaze(maze);
    }
}

// This code is contributed by Princi Sing

// Input : { {2, 1, 0, 0},
// {3, 0, 0, 1},
// {0, 1, 0, 1},
// {0, 0, 0, 1}
// }
// Output : { {1, 0, 0, 0},
// {1, 0, 0, 1},
// {0, 0, 0, 1},
// {0, 0, 0, 1}
// }

// Explanation
// Rat started with M[0][0] and can jump upto 2 steps right/down.
// Let's try in horizontal direction -
// M[0][1] won't lead to solution and M[0][2] is 0 which is dead end.
// So, backtrack and try in down direction.
// Rat jump down to M[1][0] which eventually leads to solution.

// Input : {
// {2, 1, 0, 0},
// {2, 0, 0, 1},
// {0, 1, 0, 1},
// {0, 0, 0, 1}
// }
// Output : Solution doesn't exist