import java.util.*;

public class nokia_keypaid {

    // public static ArrayList<String> keypad(String str){
    public static String[] nokiaKeys = { ".;", "abc", "def", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

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

    public static void main(String[] args) {
        System.out.println(getKPC("456"));
    }
}
