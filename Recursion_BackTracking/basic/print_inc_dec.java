import java.util.Scanner;
public class print_inc_dec {
   public static Scanner scn = new Scanner(System.in);
   public static void printIncDec(int n){
       if(n==0)
       return;
       printIncDec(n-1);
        System.out.println(n);
        printIncDec(n-1);
        
   }
    
    public static void main(String[] args) {
        int n=scn.nextInt();
        printIncDec(n);
    }
}
