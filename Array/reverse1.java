import java.util.Scanner;

public class reverse1 {
    public static Scanner scn = new Scanner(System.in);

    public static int[] input(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        return arr;
    }

    public static void rev(int[] arr) {
        
        for(int i:arr){
        int ans=arr[i];
        
        System.out.print(ans);
    }
    }
    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = input(n);
        rev(arr);
    }
}
