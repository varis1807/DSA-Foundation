import java.util.Scanner;

public class print_increasing {
    public static Scanner scn = new Scanner(System.in);

    public static void printInc(int n) {
       
        printInc(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        printInc(n);
    }
}