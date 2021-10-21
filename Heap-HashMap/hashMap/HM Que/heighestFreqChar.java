import java.util.*;
public class heighestFreqChar {
    public static void highestFreqChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int maxFreq = 0;
        char ans = '\u0000';
        for (char ch : map.keySet()) {
            if (map.get(ch) > maxFreq) {
                maxFreq = map.get(ch);
                ans = ch;
            }
        }

        System.out.println(ans);
    }
}
