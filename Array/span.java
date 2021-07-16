import java.util.Scanner;

public class span {
    public static Scanner scn = new Scanner(System.in);

    public static int[] input(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        return arr;
    }

    // public static int maximum(int[] arr) {
    //     int maxEle = -(int) 1e9;
    //     for (int ele : arr) {
    //         maxEle = Math.max(maxEle, ele);
    //     }
    //     return maxEle;
    // }

    // public static int minimum(int[] arr) {
    //     int minEle = (int) 1e9;
    //     for (int ele : arr) {
    //         minEle = Math.min(minEle, ele);
    //     }
    //     return minEle;
    // }

    // public static void span1(int[] arr) {
    //     int n = maximum(arr);
    //     int m = minimum(arr);
    //     int ans = n - m;
    //     System.out.println(ans);
    // }
    public static void spa(int[] arr){
        int mxEle=-(int)1e9;
        int minEle=(int)1e9;
        for(int ele:arr){
            mxEle=Math.max(mxEle, ele);
            minEle=Math.min(minEle,ele);
        }
        int span=mxEle-minEle;
        System.out.println(span);
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = input(n);
        spa(arr);
    }
}
