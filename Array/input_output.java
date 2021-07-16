import java.util.Scanner;

public class input_output {
    public static Scanner scn = new Scanner(System.in);

    // public static void test(int n) {
    // int[] arr = new int[n];
    // for (int i = 0; i<n; i++) {
    // System.out.println(arr[i]);
    // }
    // }
    public static void input(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void display2(int[] arr) {
        for (int ele : arr) {
            System.out.println(ele + " ");
        }
    }

    public static int[] input2(int n) {
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = scn.nextInt(); // set
                }
        
              return arr;
            }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        // test(n);
        input(arr);
        // System.out.println(arr);
        // input2(n);
        display2(arr);
    }
}
