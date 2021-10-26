import java.util.Scanner;

public class find_index {
    public static Scanner scn = new Scanner(System.in);

    public static int[] input(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        return arr;
    }
public static void find(int[] arr, int data){
    int foundAtIndex=-1;
    for(int i=0; i<arr.length; i++){
        if(arr[i]==data){
            foundAtIndex=i;
           
        }
    }
    System.out.println(foundAtIndex);
}
    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = input(n);
        int data = scn.nextInt();
        find(arr, data);
    }
}
