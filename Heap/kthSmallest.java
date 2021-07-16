import java.util.PriorityQueue;
import java.util.Scanner;

public class kthSmallest {
    // https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1
    public static Scanner scn = new Scanner(System.in);

    public static int kthSmallest1(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            return b - a;
        });
        for (int ele : arr) {
            pq.add(ele);
            if (pq.size() > k)
                pq.remove();
        }

        return pq.peek();
    }


    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        System.out.println(kthSmallest1(arr, k));
    }
}
