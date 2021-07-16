import java.util.*;
public class maze_path3 {
    public static Scanner scn = new Scanner(System.in);
    public static ArrayList<String> mazePath_MultiHDV(int sr, int sc, int er, int ec) {
        if (sr == er && sc == ec) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> myAns = new ArrayList<>();
        for (int jump = 1; sc + jump <= ec; jump++) {
            ArrayList<String> horizontal = mazePath_MultiHDV(sr, sc + jump, er, ec);
            for (String s : horizontal)
                myAns.add("H" + jump + s);
        }

        for (int jump = 1; sc + jump <= ec && sr + jump <= er; jump++) {
            ArrayList<String> diagonal = mazePath_MultiHDV(sr + jump, sc + jump, er, ec);
            for (String s : diagonal)
                myAns.add("D" + jump + s);
        }

        for (int jump = 1; sr + jump <= er; jump++) {
            ArrayList<String> vertical = mazePath_MultiHDV(sr + jump, sc, er, ec);
            for (String s : vertical)
                myAns.add("V" + jump + s); // "V" + to_string(jump) + s
        }

        return myAns;
    }

    public static void main(String[] args) {
        System.out.println(mazePath_MultiHDV(0, 0, 1, 1));
    }
}
