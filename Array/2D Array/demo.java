import java.util.*;

public class demo {
    public static Scanner sc = new Scanner(System.in);

    public static void input(int a[][]) {
        int n = a.length;
        int m = a[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }

    public static void display(int a[][]) {
        int n = a.length;
        int m = a[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int maximum(int a[][]) {
        int n = a.length;
        int m = a[0].length;
        int max = -(int) 1e9;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int a[][] = new int[sc.nextInt()][sc.nextInt()];
        input(a);
        display(a);
        System.out.println(maximum(a));
    }
}
