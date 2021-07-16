import java.util.Scanner;

public class pattern6 {
    public static Scanner scn = new Scanner(System.in);
    public static void print(int n) {
      
        int nst = 1;
        int nsp = n-1;
        for (int row = 1; row <= n; row++) {
            for (int csp = 1; csp <= nsp; csp++)
                System.out.print("\t");
            for (int cst = 1; cst <= nst; cst++)
                System.out.print("*\t");
                if(row<=n/2){
                nsp--;
                nst+=2;
                }
                else{
                    nst-=2;
                    nsp++;
                }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        print(n);
    }
}
