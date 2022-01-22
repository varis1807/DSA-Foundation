import java.util.*;

public class sub_sequence {
    public static Scanner scn = new Scanner(System.in);

    public static int subsequence(String que, String ans) {
        if (que.length() == 0) {
            System.out.println(ans);
            return 1;
        }
        char ch = que.charAt(0);
        System.out.print("----"+ch);
        String roq = que.substring(1);
        int count = 0;
        count += subsequence(roq, ans);
        count += subsequence(roq, ans + ch);
        return count;
    }

    // with arrayList
    public static int subsequence1(String ques, String ans, ArrayList<String> res) {
        if (ques.length() == 0) {
            res.add(ans);
            return 1;
        }
        char ch = ques.charAt(0);
        String roq = ques.substring(1);
        int count = 0;
        count += subsequence1(roq, ans, res);
        count += subsequence1(roq, ans + ch, res);
        return count;
    }
    public static void main(String[] args) {
         System.out.println(subsequence("abc", ""));
        // ArrayList<String> res = new ArrayList<>();

        // System.out.println(subsequence1("abc", "", res));
    }
}