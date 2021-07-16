import java.util.Scanner;
public class temp {
    // public static void swap(int arr[], int i, int j) {
    //     int temp = arr[i];
    //     arr[i] = arr[j];
    //     arr[j] = temp;
    // }

    // public static void swapKth(int arr[], int k) {
    //     // code here
    //     int n = arr.length;
    //     for (int i = 0; i < n; i++) {
    //         if (i == k)
    //             swap(arr, arr[k - 1], arr[n - k]);
           
    //     }
    //     for (int j = 0; j < arr.length; j++)
    //         System.out.print(arr[j] + " ");
    // }

    // public static void main(String[] args) {
    //     int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
    //     int k = 3;
    //     swapKth(arr, k);

    // }
    public static void main (String[] args) {
		//code
		Scanner scn = new Scanner(System.in);
		int t=scn.nextInt();
		for(int i=0; i<t; i++){
		    int n=scn.nextInt();
		    int arr[] = new int[n];
		    for(int j=0; j<n; i++){
		        arr[j]=scn.nextInt();
		    
		   for( j = n-1; j >= 0; j--)
		   
		    System.out.print(arr[j]+" ");
		}
    }
	}
}
