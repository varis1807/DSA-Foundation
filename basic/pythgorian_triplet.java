import java.util.Scanner;

public class pythgorian_triplet {
    public static Scanner scn = new Scanner(System.in);

    // public static boolean pythagorian(int a, int b, int c) {

    // return (b * b + c * c == a * a) || (a * a + c * c == b * b) || (b * b + a * a
    // == c * c);
    // }
    // public static boolean pythagorian(int a, int b, int c){
    // int max=a;
    // if(b>=max){
    // max=b;
    // }
    // if(c>=max){
    // max=c;
    // }
    // if(max==a){
    // boolean flag=(b*b+c*c==a*a);
    // return flag;
    // }
    // else if(max==b){
    // boolean flag=(a*a+c*c==b*b);
    // return flag;
    // }
    // else{
    // boolean flag=(a*a+b*b==c*c);
    // return flag;
    // }
    // }
    public static boolean pythagorian(int a, int b, int c) {
        int max = Math.max(Math.max(a, b), c);
        if (max == a && (b * b + c * c == a * a))
            return true;
        else if (max == a && (a * a + c * c == b * b))
            return true;
        else if (max == a && (b * b + a * a == c * c))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        System.out.println(pythagorian(a, b, c));
    }
}
