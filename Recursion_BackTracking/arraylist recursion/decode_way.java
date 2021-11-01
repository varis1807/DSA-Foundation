import java.util.*;
public class decode_way {
    public static Scanner scn = new Scanner(System.in);
    public static ArrayList<String> decodeWays(String str) {
        if (str.length() == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        if (str.charAt(0) == '0')
            return new ArrayList<>();

        char ch1 = str.charAt(0);
        ArrayList<String> myAns = new ArrayList<>();
        ArrayList<String> recAnsFor1Len = decodeWays(str.substring(1));
        for (String s : recAnsFor1Len) {
            myAns.add((char) ('A' + ch1 - '1') + s);
        }

        if (str.length() > 1) {
            int num = (ch1 - '0') * 10 + (str.charAt(1) - '0');
            if (num <= 26) {
                ArrayList<String> recAnsFor2Len = decodeWays(str.substring(2));
                for (String s : recAnsFor2Len) {
                    myAns.add((char) ('A' + num - 1) + s);
                }
            }
        }

        return myAns;
    }
public static void main(String[] args) {
    String str= scn.nextLine();
    System.out.println(decodeWays(str));
}
}
