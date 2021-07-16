import java.util.*;

public class DTAB {
    // decimal to Binary

    public static Scanner scn = new Scanner(System.in);

    public static int binaryToDecimal(int n, int b) {
int reverse=0;
int p=1;
while(n!=0){
    int dig=n%b;
    n=n/b;
    reverse=reverse+p*dig;
    p=p*10;
}
return reverse;
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int b=scn.nextInt();
        System.out.println(binaryToDecimal(n,b));
    }

}