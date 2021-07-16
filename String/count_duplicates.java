import java.util.Scanner;

public class count_duplicates {
    public static Scanner scn = new Scanner(System.in);

    public static void countDuplicates(String str) {
        if (str.length() == 0) {
            return;
        }
        int n = str.length();
        String ans = str.charAt(0) + "";
        int i = 1;
        int changes = 0, count = 0;
        while (i < n) {
            count = 1;
            while (i < n && ans.charAt(ans.length() - 1) == str.charAt(i)) {
                i++;
                count++;
            }
            changes++;
            if (count > 1)
                ans += count;
                if (i < n)
                ans += str.charAt(i);
            i++;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        String str = scn.nextLine();
        countDuplicates(str);
    }
}
