import java.util.*;

public class BTD {
    // decimal to Binary

    public static Scanner scn = new Scanner(System.in);

    public static int binaryToDecimal(int n) {
int reverse=0;
int p=1;
while(n!=0){
    int dig=n%10;
    n=n/10;
    reverse=reverse+p*dig;
    p=p*2;
}
return reverse;
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        System.out.println(binaryToDecimal(n));
    }

}