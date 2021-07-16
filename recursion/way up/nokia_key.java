import java.util.*;

public class nokia_key {
    public static Scanner scn = new Scanner(System.in);
    public static String[] keys = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wx", "yz" };

    public static int nokiakey(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return 1;
        }
        char ch = str.charAt(0);
        // int idx = ch - '0';
        String word = keys[ch-'0'];
        int count = 0;

        for (int i = 0; i < word.length(); i++)
            count += nokiakey(str.substring(1), ans + word.charAt(i));

        return count;
    }

    public static void main(String[] args) {
        System.out.println(nokiakey("649", ""));
    }
}
