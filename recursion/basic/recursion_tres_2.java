
import java.util.Scanner;
public class recursion_tres_2 {
    public static Scanner scn = new Scanner(System.in);
    public static int recursionTree(int n) {
        if (n <= 1) {
            System.out.println("Base: " + n);
            return n + 1;
        }

        int count = 0;

        System.out.println("Pre: " + n);
        count += recursionTree(n - 1);

        System.out.println("In: " + n);
        count += recursionTree(n - 2);

        System.out.println("Post: " + n);

        return count + 3;
    }
    public static void main(String[] args) {
        int n=scn.nextInt();
        System.out.println(recursionTree(n));
    }  
}
