import java.util.*;
public class board_path_onarray {
    public static Scanner scn = new Scanner(System.in);
    public static ArrayList<String> boardPathOnArray(int n, int[] move) {
        if (n == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> myAns = new ArrayList<>();
        for (int i = 0; i < move.length && n - move[i] >= 0; i++) {
            ArrayList<String> recAns = boardPathOnArray(n - move[i], move);
            for (String s : recAns) {
                myAns.add(move[i] + s);
            }
        }

        return myAns;
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] move = new int[n];
        for (int i = 0; i < move.length; i++) {
            move[i] = scn.nextInt();
        }
        System.out.println(boardPathOnArray(n, move));
    }

}
