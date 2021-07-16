import java.util.*;

public class AnyBaseAddition {
    public static Scanner scn = new Scanner(System.in);

    public static void addition() {
        int n = scn.nextInt();
        int m = scn.nextInt();
        int b = scn.nextInt();

        int pow = 1;
        int ans = 0;
        int carry = 0;
        while (n != 0 || m != 0 || carry != 0) {
            int sum = carry + n % 10 + m % 10;
            n /= 10;
            m /= 10;
            int digit = sum % b;
            carry = sum / b;
            ans += digit * pow;
            pow *= 10;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        addition();
    }
}
