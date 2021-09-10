import java.util.Scanner;

public class Insertion {
      public static void swap(int i, int j, int[] arr) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
      }

      public static void insert(int[] arr, int n, int input) {
            n = n + 1;
            arr[n-1] = input;
            int i = n;
            while (i > 1) {
                  int parent = i / 2;
                  if (parent < arr[i]) {
                        swap(i, parent, arr);
                        i = parent;
                  } else {
                        return;
                  }
            }
      }

      public static int max = 100;

      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int arr2[] = new int[8];
            for (int i = 0; i < arr2.length; i++) {
                  arr2[i] = scn.nextInt();
            }
            insert(arr2, arr2.length, 90);
            for (int i = 0; i < arr2.length; i++) {
                  System.out.println(arr2[i]);
            }
      }
}