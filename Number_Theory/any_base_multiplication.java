import java.util.Scanner;

public class any_base_multiplication {
    public static Scanner scn = new Scanner(System.in);

    public static int multiplicationWuthDigit(int n, int d, int b) {
        int ans = 0, pow = 1, carry = 0;
        while (n != 0 || carry != 0) {
            int product = carry + (n % 10) * d;
            n /= 10;
            int digit = product % b;
            carry = product / b;
            ans += digit * pow;
            pow *= 10;
        }
        return ans;
    }
    public static int anyBaseAddition(int n, int m, int b) {
       
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
        return ans;
    }
    public static int anyBaseMulti(int n, int m, int b) {
        int ans = 0;
        int pow = 1;
        while (m != 0) {
            int digit = m % 10;
            m /= 10;
            int productResult = multiplicationWuthDigit(n, digit, b) * pow;
            ans = anyBaseAddition(ans, productResult, b);
            pow *= 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int m = scn.nextInt();
        int b = scn.nextInt();
        System.out.println(anyBaseMulti(n, m, b));
    }
}
