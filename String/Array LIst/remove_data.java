import java.util.*;

public class remove_data {
    public static Scanner scn = new Scanner(System.in);

    public static void swap(ArrayList<Integer> arr, int i, int j) {
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }

    public static void removeData() {
        ArrayList<Integer> arr = new ArrayList<>();
        int n=scn.nextInt();
        for (int i = 0; i < n; i++) {
            int a = scn.nextInt();
            arr.add(a);
        }
        int data = scn.nextInt();
        int i = arr.size() - 1;
        while (i >= 0) {
            if (arr.get(i) == data) {
                swap(arr, i, arr.size() - 1);
                arr.remove(arr.size() - 1);
            }
            i--;
        }
        System.out.println(arr);
    }

    public static void main(String[] args) {
        removeData();
    }
}
