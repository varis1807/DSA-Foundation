import java.util.Scanner;

public class fibonnaci {
    public static Scanner scn = new Scanner(System.in);

    public static int fibo(int n) {
        if (n <= 1)
            return n;
        int count = 0;
        count += fibo(n - 1);
        count += fibo(n - 2);

        return count;
    }
    public static void main(String[] args) {
        int n = scn.nextInt();
        System.out.println(fibo(n));
    }
}
