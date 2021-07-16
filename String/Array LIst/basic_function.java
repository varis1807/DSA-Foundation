import java.util.ArrayList;
import java.util.Scanner;

public class basic_function {
    public static Scanner scn = new Scanner(System.in);

    public static void basic() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20); // for adding
        arr.add(30);
        System.out.println(arr);
        for(Integer e:arr) // for traversing
        System.out.println(e);
        System.out.println(arr.size()); // for size of arraylist
        System.out.println(arr.get(2)); // for get element in tghe arraylist
        arr.remove(1); // for remove
        System.out.println(arr);
    }

    public static void main(String[] args) {
        basic();
    }
}