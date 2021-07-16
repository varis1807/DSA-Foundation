import java.util.*;
public class get_stair_path {
    public static ArrayList<String> getStairPath(int n) {
        if (n == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> myAns = new ArrayList<>();
        for (int i = 1; i <= 3 && n - i >= 0; i++) {
            ArrayList<String> recAns = getStairPath(n - i);
            for (String s : recAns) {
                myAns.add(i + s);
            }
        }

        return myAns;
    }
    public static void main(String[] args) {
        System.out.println(getStairPath(3));
    }
}
