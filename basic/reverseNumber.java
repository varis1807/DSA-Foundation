import java.util.Scanner;

public class reverseNumber {
    public static Scanner scn = new Scanner(System.in);

    public static void rever(int n) {
        int rev;
        while (n != 0) {
            rev = n % 10;
            n /= 10;
        
        System.out.println(rev);
        }
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        rever(n);
    }
}
