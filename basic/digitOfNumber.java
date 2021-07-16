import java.util.Scanner;

public class digitOfNumber {
    public static Scanner scn = new Scanner(System.in);

    public static int power(int n) {
        int pow = 1;
        n/=10;
        while (n != 0) {
            pow *= 10;
            n /= 10;
        }
        return pow;
    }

    public static void print(int n) {
        int pow = power(n);
        while (pow != 0) {
            int ans = n / pow;
            n = n % pow;
            pow = pow / 10;
            System.out.println(ans);
        }
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        print(n);
    }
}
