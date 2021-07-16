import java.util.*;

public class DTB {
    // decimal to Binary

    public static Scanner scn = new Scanner(System.in);

    public static int decimalToBinary(int n) {
        int reverse = 0;
        int p = 1;
        while (n != 0) {
            int ans = n % 2;
            n = n / 2;
reverse=reverse+ans*p;
p=p*10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        System.out.println(decimalToBinary(n)); 
    }

}