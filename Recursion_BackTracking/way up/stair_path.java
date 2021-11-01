import java.util.*;

public class stair_path {
    public static Scanner scn =new Scanner(System.in);
    public static int stairPath(int n,String ans) {
        if (n == 0) {
            System.out.println(ans);
            return 1;
        }
        int count = 0;
        for (int jump = 1; jump <= 3 && n - jump >= 0; jump++)
            count += stairPath(n - jump,ans+jump);
        return count;
    }
    public static void main(String[] args) {
        System.out.println(stairPath(3,""));
    }
}
