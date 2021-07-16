import java.util.*;
public class intersectionWithDuplicates {
    public static void intersectionWithDuplicate(int[] arr1, int[] arr2) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int ele : arr1)
        map.put(ele, map.getOrDefault(ele, 0) + 1);

    for (int ele : arr2) {
        if (map.containsKey(ele)) {
            System.out.println(ele);
            map.put(ele, map.get(ele) - 1);
            if (map.get(ele) == 0)
                map.remove(ele);
        }
    }
}}