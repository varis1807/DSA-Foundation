import java.util.*;

public class differ_ASCII {
    public static Scanner scn = new Scanner(System.in);

    public static String solution(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        int n = str.length();
        for (int i = 1; i < n; i++) {
            sb.append(str.charAt(i) - str.charAt(i - 1));
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = scn.nextLine();
        //solution(str);
        System.out.println(solution(str));
    }
}
