import java.util.Scanner;

public class count_hi {
    public static Scanner scn = new Scanner(System.in);

    public static int countHi(String str) {
        int n = str.length();
        int i = 0;
        int count = 0;
        while (i < n - 1) {
            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i') {
                count++;
                i += 2;
            } else
                i++;
        }
        return count;

    }

    public static void main(String[] args) {
        String str = scn.nextLine();
        System.out.println(countHi(str));
    }
}
