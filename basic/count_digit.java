import java.util.Scanner;

public class count_digit {
    public static Scanner scn = new Scanner(System.in);

    public static int dC(int n) {
        int count=0;
           while(n!=0){
               n=n/10;
               count++;
           }
          return count;
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
      System.out.println(dC(n)); 
}
}