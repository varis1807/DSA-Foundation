import java.util.Scanner;

public class maxx {
    public static Scanner scn = new Scanner(System.in);

    public static void input(int[][] arr) {
        int n = arr.length;// no of rows
        int m = arr[0].length;// no of cols
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
    }

    // public static void display(int[][] arr) {
    //     int n = arr.length;
    //     int m = arr[0].length;
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < m; j++) {
    //             System.out.print(arr[i][j] + " ");
    //         }
    //         System.out.println();
    //     }
    // }
public static void max(int[][] arr){
    int n=arr.length;
    int m=arr[0].length;
    int maxEle=-(int)1e9;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
          maxEle=Math.max(maxEle, arr[i][j]);
        }
    }
    System.out.println(maxEle);
}

    public static void main(String[] args) {
        int[][] arr = new int[scn.nextInt()][scn.nextInt()];
        input(arr);
        // display(arr);
       max(arr);
    }
}