import java.util.Scanner;

public class same_print_number {
    public static Scanner scn = new Scanner(System.in);

    /*public static void demo() {
        int n = scn.nextInt();
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
    */

    public static void power() {
        int base = scn.nextInt();
        int pow = scn.nextInt();
        int m =1;
        for (int i = 1; i <= pow; i++) {
            m = m * base;
        }
        System.out.println(m);
    }

    public static void main(String[] args) {
        power();
    }
}