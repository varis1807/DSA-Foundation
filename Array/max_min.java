import java.util.Scanner;

public class max_min {
    public static Scanner scn = new Scanner(System.in);

    public static void input(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
    }

    public static void max(int[] arr) {
        int maxele = -(int) 1e9;
        for (int ele : arr) {
            maxele = Math.max(maxele, ele);
        }
        System.out.println("Max element is = "+maxele);
    }
public static void min(int[] arr){
    int minele=(int)1e9;
    for(int ele:arr){
        minele=Math.min(minele, ele);
    }
    System.out.println("Min element is = "+minele);
}

    public static void main(String[] args) {
        int n = scn.nextInt();
        int arr[] = new int[n];
        input(arr);
        max(arr);
        min(arr);
    }
}
