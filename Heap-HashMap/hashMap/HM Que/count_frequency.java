import java.util.*;
public class count_frequency {
    public static void frequency(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        // for (int i = 0; i < str.length(); i++) {
        // char ch = str.charAt(i);
        // if (map.containsKey(ch))
        // map.put(ch, map.get(ch) + 1);
        // else
        // map.put(ch, 0 + 1);
        // }

        // for (int i = 0; i < str.length(); i++) {
        // char ch = str.charAt(i);
        // map.put(ch, map.getOrDefault(ch, 0) + 1);
        // }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.putIfAbsent(ch, 0);
            map.put(ch, map.get(ch) + 1);
        }
        for (char ch : map.keySet()) {
            System.out.println(ch + " -> " + map.get(ch));
        }
    }
    public static void main(String[] args) {
        String str = "abdhbdhffkfifhnifjfdhhshdckskksjjhnfihfk";
        frequency(str);
    }
}
