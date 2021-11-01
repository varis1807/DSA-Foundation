public class maze_path {
    public static int mazePath_HV(int sr, int sc, int er, int ec, String ans) {
        if (sr == er && sc == ec) {
            System.out.println(ans);
            return 1;
        }

        int count = 0;
        if (sc + 1 <= ec) 
            count += mazePath_HV(sr, sc + 1, er, ec, ans + "H");
        if (sr + 1 <= er)
            count += mazePath_HV(sr + 1, sc, er, ec, ans + "V");

        return count;
    }

    public static void main(String[] args) {
        System.out.println(mazePath_HV(0, 0, 2, 2, ""));
    }
}
