import java.util.*;

public class power {
      public static int power(int a, int b) {
            if (b == 0)
                  return 1;
                  
            int ans = power(a, b - 1);
           // System.out.println(b);
            System.out.println(ans);
            return ans * a;
      }

      public static int power_01(int a, int b) {
            return b == 0 ? 1 : power_01(a, b - 1) * a;
      }

      public static int powerBtr(int a, int b) {
            if (b == 0)
                  return 1;

            int recAns = powerBtr(a, b / 2);
            recAns *= recAns;

            return b % 2 == 0 ? recAns : recAns * a;
      }

      public static void main(String[] args) {
            System.out.println(power(2, 3));
      }
}
