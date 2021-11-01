 import java.util.*;
public class recursion_tree {
    public static Scanner scn = new Scanner(System.in);
    public static int recursionTree2(int n) {
        if (n <= 1) {
            System.out.println("Base: " + n);
            return n + 1;
        }

        int count = 0;

        System.out.println("Pre: " + n);
        count += recursionTree2(n - 1);

        System.out.println("In1: " + n);
        count += recursionTree2(n - 2);

        System.out.println("In2: " + n);
        count += recursionTree2(n - 3);

        System.out.println("Post: " + n);
        return count + 3;
    }  
    public static void main(String[] args) {
        int n=scn.nextInt();
        System.out.println(recursionTree2(n));
    }
}
