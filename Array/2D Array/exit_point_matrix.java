import java.util.Scanner;

public class exit_point_matrix {
    public static Scanner scn = new Scanner(System.in);

    public static void input(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
    }

    public static void exitpoint(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int dir = 0, i = 0, j = 0;
        while (true) {
            dir = (dir + arr[i][j]) % 4;
            if (dir == 0) { // north
                j++;
                if (j == m) {
                    System.out.print(i + " " + (j - 1));
                    break;
                }
            } else if (dir == 1) { // east
                i++;
                if (i == n) {
                    System.out.print((i - 1) + " " + (j));
                    break;
                }
            } else if (dir == 2) { // south
                j--;
                if (j == -1) {
                    System.out.print((i) + " " + (j + 1));
                    break;
                }
            } else{ // west
                i--;
                if (i == -1) {
                    System.out.print((i + 1) + " " + (j));
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = new int[scn.nextInt()][scn.nextInt()];
        input(arr);
        exitpoint(arr);

    }
}
