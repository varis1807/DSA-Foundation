import java.util.Scanner;

public class pattern14 {
    public static Scanner scn = new Scanner(System.in);

    public static void print() {
        int n1 = 0;
        int n2 = 1;
        int temp;
        int n = scn.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n1 + "\t");
                temp = n1 + n2;
                n1 = n2;
                n2 = temp;
            }
                System.out.println();

            
        }
    }

    public static void main(String[] args) {
        print();
    }
}
