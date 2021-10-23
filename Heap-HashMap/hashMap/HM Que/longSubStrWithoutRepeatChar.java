import java.util.*;

public class longSubStrWithoutRepeatChar {
      public static int sub(String s) {
            if (s.length() == 0)
                  return 0;
            HashMap<Character, Integer> map = new HashMap<>();
            int max = 0;
            for (int i = 0, j = 0; i < s.length(); i++) {
                  if (map.containsKey(s.charAt(i))) {
                        j = Math.max(j, map.get(s.charAt(j)) + 1);
                  }
                  map.put(s.charAt(i), i);
                  max = Math.max(max, i - j + 1);
            }
            return max;
      }

      public static void main(String[] args) {
            String str = "abcacbjd";
            System.out.println(sub(str));
      }
}
