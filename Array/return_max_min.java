import java.util.Scanner;

public class return_max_min {
    public static Scanner scn = new Scanner(System.in);

    public static int[] input(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        return arr;
    }
    public static int maximum(int[] arr){
        int maxEle=-(int)1e9;
        for(int ele:arr){
            maxEle=Math.max(maxEle, ele);
        }
        return maxEle;
    }
    public static int minimum(int[] arr){
        int minEle=(int)1e9;
        for(int ele:arr){
            minEle=Math.min(minEle, ele);
        }
        return minEle;
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = input(n);
        System.out.println("Max element = "+maximum(arr));
        System.out.println("Min element = "+minimum(arr));

    }
}
