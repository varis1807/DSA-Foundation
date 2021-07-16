import java.util.Scanner;

public class reverse_array {
    public static Scanner scn = new Scanner(System.in);

    public static void printArray(int[] arr, int idx) {
        if (arr.length == idx)
            return;
      
        printArray(arr, idx + 1);
        System.out.print(arr[idx]+" ");

    }
    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        printArray(arr, 0);
    }

}
