import java.util.*;

public class printArr {

      public static void PA(int[] arr, int i) {
            if (arr.length == i)
                  return;
            System.out.println(arr[i]);
            PA(arr, i + 1);
            System.out.println("---------------------");
            System.out.println(arr[i]);
      }

      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                  arr[i] = scn.nextInt();
            PA(arr, 0);

      }
}
