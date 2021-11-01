import java.util.*;
public class maze_path {
    public static Scanner scn = new Scanner(System.in);
    public static ArrayList<String> mazePath_HV(int sr, int sc, int er, int ec) {
        if (sr == er && sc == ec) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> myAns = new ArrayList<>();
        if (sc + 1 <= ec) {
            ArrayList<String> horizontal = mazePath_HV(sr, sc + 1, er, ec);
            for (String s : horizontal)
                myAns.add("H" + s); // CPP : string(1,'H') + s;
        }

        if (sr + 1 <= er) {
            ArrayList<String> vertical = mazePath_HV(sr + 1, sc, er, ec);
            for (String s : vertical)
                myAns.add("V" + s);
        }

        return myAns;
    }

    public static void main(String[] args) {
        System.out.println(mazePath_HV(0, 0, 3, 3));
    }
}
