import java.util.*;
public class IndexOfChar {
    public static void IndexOfChar1(String str) {
        HashMap<Character, ArrayList<Integer>> map = new HashMap<>();
        // for (int i = 0; i < str.length(); i++) {
        //     char ch = str.charAt(i);
        //     if (!map.containsKey(ch))
        //         map.put(ch, new ArrayList<>());

        //     map.get(ch).add(i);
        // }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.putIfAbsent(ch,new ArrayList<>());
            map.get(ch).add(i);
        }

        for (char ch : map.keySet()) {
            System.out.println(ch + " -> " + map.get(ch));
        }
    }
}
