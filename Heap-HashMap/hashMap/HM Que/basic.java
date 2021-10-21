import java.util.HashMap;
import java.util.ArrayList;

public class basic {
    public static void HashMapBasic() {
        // {Key,Value}
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 98);
        map.put("USA", 99);
        map.put("UK", 98);
        map.put("UK", 95);

        // map.remove("UK");
        if (map.containsKey("UK"))
            System.out.println(map.get("UK"));

        // System.out.println(map);
        // ArrayList<String> keys = new ArrayList<>(map.keySet());
        // System.out.println(keys);
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

    }

    public static void main(String[] args) {
        HashMapBasic();
    }
}