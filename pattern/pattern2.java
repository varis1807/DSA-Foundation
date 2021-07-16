import java.util.Scanner;

public class pattern2 {
    public static Scanner scn = new Scanner(System.in);

    public static void print(int n) {
      int nst=n;
      for(int row=1; row<=n; row++){
          for(int cst=1; cst<=nst; cst++)
          System.out.print("*\t");
          nst--;
          System.out.println();
      }
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        print(n);

    }
}
