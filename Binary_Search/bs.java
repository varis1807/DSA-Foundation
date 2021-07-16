import java.util.Scanner;

public class bs {
    public static Scanner scn = new Scanner(System.in);
    public static int[] input(int n) {
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        return arr;
    }
    public static int binarySearch(int[] arr, int data) {
        int si = 0;
        int ei = arr.length - 1;
        while (si <= ei) {
            int mid = (si + ei) / 2;
            if (arr[mid] == data)
                return mid;
            else if (arr[mid] < data)
                si = mid + 1;
            else
                ei = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = input(n);
        int data = scn.nextInt();
        System.out.println(binarySearch(arr, data));
    }

}