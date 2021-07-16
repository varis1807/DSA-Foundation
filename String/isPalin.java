import java.util.Scanner;

public class isPalin {
    public static Scanner scn = new Scanner(System.in);

    public static boolean isPalin1(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = scn.nextLine();
        if (isPalin1(str))
            System.out.println("yes this palindrome");
        else
            System.out.println("This is not a palindrome");
    }
}
