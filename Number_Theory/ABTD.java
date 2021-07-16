import java.util.*;

public class ABTD {
    // decimal to Binary

    public static Scanner scn = new Scanner(System.in);

    public static int AnyBaseToDecimal(int n, int b) {
int reverse=0;
int p=1;
while(n!=0){
    int dig=n%10;
    n=n/10;
    reverse=reverse+p*dig;
    p=p*b;
}
return reverse;
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int b=scn.nextInt();
        System.out.println(AnyBaseToDecimal(n, b));
    }

}