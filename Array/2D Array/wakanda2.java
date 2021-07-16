import java.util.Scanner;

public class wakanda2 {
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

    public static void wakanda(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++)
                    System.out.print(arr[i][j] + " ");
            } else {
                for (int j = m - 1; j >= 0; j--)
                    System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] arr = new int[scn.nextInt()][scn.nextInt()];
        input(arr);
        wakanda(arr);
    }
}
