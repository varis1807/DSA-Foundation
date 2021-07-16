import java.util.Scanner;

public class AnyBaseSubstraction {
    public static Scanner scn = new Scanner(System.in);

    public static void subs() {
        int n = scn.nextInt();
        int m = scn.nextInt();
        int b = scn.nextInt();
        int pow = 1;
        int ans = 0;
        int borrow = 0;
        while (m != 0) {
            int sub = borrow + m % 10 - n % 10;
            n /= 10;
            m /= 10;
            if (sub < 0) {
                sub += b;
                borrow = -1;
            } else
                borrow = 0;

            ans += sub * pow;
            pow *= 10;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        subs();
    }
}
