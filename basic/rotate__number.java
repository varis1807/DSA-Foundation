import java.util.Scanner;

public class rotate__number {
    public static Scanner scn = new Scanner(System.in);
   public static int countDig(int n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        return count;
    }
    public static void rotateRNumber() {
        int n = scn.nextInt();
        int r = scn.nextInt();
        int digit = countDig(n);
        r%=digit;
        if (r < 0) 
            r = r + digit;
        int div = 1;
        int multi = 1;
        for(int i=1; i<=digit; i++){
            if(i<=r)
            div*=10;
            else
            multi*=10;
        }
        int a = n % div;
        int b = n / div;
        int ans = (a * multi + b);
        System.out.println(ans);
    }
    public static void main(String[] args) {
rotateRNumber();
    }
}
