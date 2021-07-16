import java.util.Scanner;
public class ABTAB {
    public static Scanner scn=new Scanner(System.in);
    public static int AnyBaseToDecimal(int n, int b1) {
        int reverse=0;
        int p=1;
        while(n!=0){
            int dig=n%10;
            n=n/10;
            reverse=reverse+p*dig;
            p=p*b1;
        }
        return reverse;
            }

            public static int DecimalToAnyBase(int n, int b2) {
                int reverse=0;
                int p=1;
                while(n!=0){
                    int dig=n%b2;
                    n=n/b2;
                    reverse=reverse+p*dig;
                    p=p*10;
                }
                return reverse;
                    }

    public static void main(String[] args) {
        int n=scn.nextInt();
        int b1=scn.nextInt();
        int b2=scn.nextInt();
        
        int decimalNumber=AnyBaseToDecimal(n, b1);
        System.out.println(DecimalToAnyBase(decimalNumber, b2));
    }
    
}
