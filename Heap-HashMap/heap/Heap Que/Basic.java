import java.util.PriorityQueue;
import java.util.Scanner;

public class Basic {

    public static Scanner scn = new Scanner(System.in);

    public static void Int_minPQ() {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // by default min Priority Queue
        for (int i = 10; i >= 1; i--)
            pq.add(i * 10);

        while (pq.size() != 0)
            System.out.println(pq.remove());
    }

    public static void Int_maxPQ() {
        // this - other, default behaviour.
        // other - this, reverse of default behaviour.
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            return b - a;
        });

        for (int i = 10; i >= 1; i--)
            pq.add(i * 10);

        while (pq.size() != 0)
            System.out.println(pq.remove());
    }

    public static void matrixPQ() {
        int[][] arr = { { 2, 6, 11, 3 }, { 8, 5, 16, 4 }, { 9, 7, 11, 13 }, { 8, 3, 12, 11 } };
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            return b[1] - a[1];
        });
        for (int[] a : arr)
            pq.add(a);

        while (pq.size() != 0) {
            int[] a1 = pq.remove();
            for (int ele : a1)
                System.out.print(ele + " ");
            System.out.println();
        }
    }

  
    public static void main(String[] args) {
        //Int_minPQ();
        // Int_maxPQ();
       // matrixPQ();
    }
}