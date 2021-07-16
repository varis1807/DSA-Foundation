import java.util.Scanner;

public class rotateby90 {
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

    public static void swap(int[][] arr, int i1, int j1, int i2, int j2) {
        int temp = arr[i1][j1];
        arr[i1][j1] = arr[i2][j2];
        arr[i2][j2] = temp;
    }

    public static void rotate90(int[][] arr) {
        int n = arr.length, m = arr[0].length;
        // Transpose
        for (int i = 0; i < n; i++) {
            for (int j = i; j < m; j++) {
                swap(arr, i, j, j, i);
            }
        }

        // column shifting
        int si = 0, ei = m - 1;
        while (si < ei) {
            for (int i = 0; i < n; i++) {
                swap(arr, i, si, i, ei);
            }
            si++;
            ei--;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
              System.out.print(arr[i][j]+" ");-
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = new int[scn.nextInt()][scn.nextInt()];
        input(arr);
        rotate90(arr);
    }
}
