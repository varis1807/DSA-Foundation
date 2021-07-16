import java.util.Scanner;

public class prime_factorization {
public static Scanner scn =new Scanner(System.in);
    public static void print() {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                n = n / i;
                System.out.println(i);
            }
        }
    }

    public static void main(String[] srgs) {
        print();
    }
}
