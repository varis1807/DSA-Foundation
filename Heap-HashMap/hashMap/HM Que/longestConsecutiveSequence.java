import java.util.*;

public class longestConsecutiveSequence {
    public static void lcs(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int ele : arr)
            set.add(ele);

        int len = 0, head = 0;
        for (int ele : arr) {
            if (!set.contains(ele))
                continue;

            int left = ele - 1, right = ele + 1;
            set.remove(ele);

            while (set.contains(left))
                set.remove(left--);

            while (set.contains(right))
                set.remove(right++);

            if (right - left - 1 > len) {
                len = right - left - 1;
                head = left + 1;
            }
        }

        for (int i = 0; i < len; i++) {
            System.out.println(head + i);
        }

    }

    public static void main(String[] args) {
      
    }
}
