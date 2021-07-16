import java.util.*;

public class remove_prime {
    public static Scanner scn = new Scanner(System.in);

    public static boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public static void removePrimes(ArrayList<Integer> arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (Integer ele : arr)
            if (!isPrime(ele))
                ans.add(ele);

        // arr.clear();
        while (arr.size() != 0)
            arr.remove(arr.size() - 1);

        for (int ele : ans)
            arr.add(ele);
        System.out.println(arr);
    }

    public static void removePrimes1(ArrayList<Integer> arr) {
        for (int i = arr.size() - 1; i >=0; i--) {
            if (isPrime(arr.get(i))) {
                arr.remove(i);
            }
        }
        System.out.println(arr);
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(scn.nextInt());
        }
        // removePrimes(arr);
        removePrimes1(arr);
    }
}
