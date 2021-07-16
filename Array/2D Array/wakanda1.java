import java.util.Scanner;
public class wakanda1 {
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
        for (int j = 0; j < m; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < n; i++)
                    System.out.print(arr[i][j] + " ");
            } else {
                for (int i = n - 1; i >= 0; i--)
                    System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr = new int[scn.nextInt()][scn.nextInt()];
        input(arr);
        wakanda(arr);
    }
}
