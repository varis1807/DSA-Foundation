import java.util.Scanner;

public class is_a_prime {
    public static Scanner scn = new Scanner(System.in);
    public static void isPrime(){
        int t=scn.nextInt();
       for(int i=0; i<t; i++){
           int n=scn.nextInt();
           int count=0;
           for(int j=2; j*j<=n; j++){
               if(n%j==0){
                   count++;
                   break;
               }
            }
               if(count==0){
                   System.out.println("prime");
               }
               else{
                   System.out.println("not prime");
               
           }
       }
    }
    public static void main(String[] args) {
        isPrime();
    }
}
