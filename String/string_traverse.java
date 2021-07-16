import java.util.Scanner;

public class string_traverse {
    public static Scanner scn = new Scanner(System.in);

    public static void traverse(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.print(ch);
        }
    }

    public static void main(String[] args) {
        String str = scn.nextLine();
        traverse(str);
    }
}
