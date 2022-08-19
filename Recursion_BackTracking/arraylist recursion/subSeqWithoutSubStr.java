import java.util.*;

public class subSeqWithoutSubStr {
      public static ArrayList<String> subseq(String str, int idx) {
            if (idx == str.length()) {
                  ArrayList<String> base = new ArrayList<>();
                  base.add("");
                  return base;
            }
            ArrayList<String> recAns = subseq(str, idx + 1);
            ArrayList<String> myAns = new ArrayList<>();
            for (String s : recAns) {
                  myAns.add(s);
                  myAns.add(str.charAt(idx) + s);
            }

            return myAns;
      }

      public static void main(String[] args) {
            System.out.println(subseq("abc", 0));
      }
}
