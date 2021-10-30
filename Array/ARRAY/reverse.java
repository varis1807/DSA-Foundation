import java.util.Scanner;

public class reverse {
    public static Scanner scn = new Scanner(System.in);

    public static int[] input(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void rev(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
        for(int l:arr){
            System.out.println(l);
        }
    }
public static void rever(int[] arr){
    int n=arr.length;
    for(int i=n-1; i>=0;i--){
        System.out.print(arr[i]+" ");
    }

}
    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = input(n);
        rever(arr);
    }
}
