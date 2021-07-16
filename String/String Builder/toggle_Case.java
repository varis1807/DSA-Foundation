import java.util.*;

public class toggle_Case {
    public static Scanner scn = new Scanner(System.in);

    public static String toggleCase(String str) {
        StringBuilder sb = new StringBuilder();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z')
                sb.append((char) (ch - 'a' + 'A'));
            else
                sb.append((char) (ch - 'A' + 'a'));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = scn.nextLine();
        System.out.println(toggleCase(str));
    }
}
