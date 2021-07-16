import java.util.Scanner;
public class factorial {
   public static Scanner scn = new Scanner(System.in);
   public static int fact(int n){
       if(n==0)
           return 1;
       
       int recAns=fact(n-1);
      return recAns*n;
   } 

    public static void main(String[] args) {
        int n= scn.nextInt();
        System.out.println(fact(n));
    }
}
