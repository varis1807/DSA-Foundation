import java.util.*;

public class decode_way2 {
    public static Scanner scn = new Scanner(System.in);
    public static String[] nokiaKeys = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz", "*", "#" };

    public static ArrayList<String> getKPC(String str) {
        if (str.length() == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        char ch = str.charAt(0);
        String code = nokiaKeys[ch - '0'];

        ArrayList<String> recAns = getKPC(str.substring(1));

        ArrayList<String> myAns = new ArrayList<>();
        for (int i = 0; i < code.length(); i++) {
            for (String s : recAns)
                myAns.add(code.charAt(i) + s);
        }

        return myAns;
    }

    public static ArrayList<String> decodeWays2(String str) {
        if (str.length() == 0) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add("");
            return ans;
        }

        char ch1 = str.charAt(0);
        String word = nokiaKeys[ch1 - '0'];
        ArrayList<String> myAns = new ArrayList<>();

        ArrayList<String> recAns1 = decodeWays2(str.substring(1));
        for (int i = 0; i < word.length(); i++) {
            for (String s : recAns1) {
                myAns.add(word.charAt(i) + s);
            }
        }

        if (str.length() > 1) {
            char ch2 = str.charAt(1);
            int num = (ch1 - '0') * 10 + (ch2 - '0');
            if (num == 10 || num == 11) {
                ArrayList<String> recAns2 = decodeWays2(str.substring(2));
                word = nokiaKeys[num];
                for (int i = 0; i < word.length(); i++) {
                    for (String s : recAns2) {
                        myAns.add(word.charAt(i) + s);
                    }
                }
            }
        }

        return myAns;
    }

    public static void main(String[] args) {
        String str = scn.nextLine();
        System.out.println(decodeWays2(str));
    }
}
