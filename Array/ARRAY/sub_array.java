import java.util.Scanner;

public class sub_array {
    public static Scanner scn = new Scanner(System.in);

    public static int[] input(int n) {
        int[] arr = new int[n];
        for (int i = 0; i <n; i++) {
            arr[i] = scn.nextInt();
        }
        return arr;
    }

    public static void printInRange(int[] arr, int si, int ei) {
        while (si <= ei) {
            System.out.print(arr[si] + " ");
            si++;
        }
    }

    public static void printAllSubArray(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                printInRange(arr, i, j);
                System.out.println();
            }
          
        }
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = input(n);
       printAllSubArray(arr);

    }
}
