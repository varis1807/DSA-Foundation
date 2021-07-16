import java.util.Scanner;

public class print_odd_even {
    public static Scanner scn = new Scanner(System.in);

    public static void oddEven() {

        int n = scn.nextInt();
        for (int i = 1; i <= n; i++) {
            int num = scn.nextInt();
            if (num % 2 == 0) {

                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }

    /*
     * public static void printmultiple(){ int c=scn.nextInt(); for(int i=1; i<=c;
     * i++){ int num=scn.nextInt(); oddEven(num); } }
     */
    public static void main(String[] args) {
        // printmultiple();
        oddEven();
    }
}
