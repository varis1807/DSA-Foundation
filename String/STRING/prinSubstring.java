import java.util.Scanner;

public class prinSubstring {
    public static Scanner scn = new Scanner(System.in);

    public static void print(String str) {

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                   System.out.println(str.substring(i, j));
            }
        }
    }

    public static void main(String[] args) {
        String str = scn.nextLine();
        print(str);
    }
}
