import java.util.Scanner;

public class inverse {
    public static Scanner scn = new Scanner(System.in);
public static int[] arr={1,2,3};
    public static int[] input(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        return arr;
    }

    public static void inv(int[] arr) {
        int n = arr.length;
        int ans[] = new int[n];
        for (int i = 0; i < n-1; i++) {
            int idx = arr[i];
            ans[idx] = i;
        }
        // for (int l : ans) {
        //     System.out.print(l+" ");
        // }
    }

    public static void main(String[] args) {
        // int n = scn.nextInt();
        // int[] arr = input(n);
        inv(arr);
        for(int l:arr)
        System.out.println(l);
    }
}
