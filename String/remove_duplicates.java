import java.util.Scanner;

public class remove_duplicates {
    public static Scanner scn = new Scanner(System.in);

    public static void removeDuplicates(String str) {
        if (str.length() == 0) {
            return;
        }
        int n = str.length();
        String ans = str.charAt(0) + "";
        int i = 1;
        while (i < n) {
            while (i < n && ans.charAt(ans.length() - 1) == str.charAt(i))
                i++;

            if (i < n)
                ans += str.charAt(i);
            i++;
        }
        System.out.println(ans);
    }

    public static void removeDuplicates1(String str) {
        String s = str.charAt(0) + "";
        for (int i = 1; i < str.length(); i++) {
            char current = str.charAt(i);
            char previous = str.charAt(i - 1);
            if (current != previous) {
                s = s + current;
            } else {
                i++;
            }
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        String str = scn.nextLine();
        removeDuplicates(str);
        // removeDuplicates1(str);
    }
}
