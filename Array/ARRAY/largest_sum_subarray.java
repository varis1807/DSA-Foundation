import java.util.Scanner;

public class largest_sum_subarray {
    public static Scanner scn = new Scanner(System.in);

    public static void input(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
    }

    public static void subarray(int[] arr) {
        int n = arr.length;
        int maxSum = -(int) 1e9;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + arr[k];
                    maxSum = Math.max(sum, maxSum);

                }
            }
        }
        System.out.print(maxSum + " ");
    }

    // By kaden's algorithm

//     public static int subayyaSum(int[] arr){
//         int maxSum=0;
//         int currSum=0;
// for(int i=0; i<arr.length; i++){
//     currSum+=arr[i];
//     if(currSum>maxSum){
//         maxSum=currSum;
//     }
//     if(currSum<0){
//         currSum=0;
//     }
// }
// return maxSum;
//     }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        input(arr);
        subarray(arr);
        // System.out.println(subayyaSum(arr));
    }
}
