import java.util.*;
public class board_path {
    public static ArrayList<String> boardPath(int n) {
        if (n == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> myAns = new ArrayList<>();
        for (int dice = 1; dice <= 6 && n - dice >= 0; dice++) {
            ArrayList<String> recAns = boardPath(n - dice);
            for (String s : recAns) {
                myAns.add(dice + s);
            }
        }

        return myAns;
    }
    public static void main(String[] args) {
        System.out.println(boardPath(5));
    }
}
