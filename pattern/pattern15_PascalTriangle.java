import java.util.Scanner;

public class pattern15_PascalTriangle {
    public static Scanner scn = new Scanner(System.in);

    public static void binomialPattern(int n) {
        for (int i = 0; i < n; i++) {
            int ncr = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(ncr+"\t");
                int ncrp1 = ncr * (i - j) / (j + 1);
                ncr = ncrp1;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        binomialPattern(n);
    }
}
