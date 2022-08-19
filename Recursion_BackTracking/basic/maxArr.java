import java.util.*;

public class maxArr {
      public static int max(int[] arr, int i) {
            if (arr.length == i)
                  return -(int) 1e9;
            int recAns= max(arr, i + 1);
            int maxValue=Math.max(recAns,arr[i]);
            System.out.println(maxValue);
            return maxValue;
      }

      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                  arr[i] = scn.nextInt();
            System.out.println(max(arr, 0));

      }
}
