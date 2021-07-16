public class maze_path3 {
    public static int mazePath_MultiHVD(int sr, int sc, int er, int ec, String ans) {
        if (sr == er && sc == ec) {
            System.out.println(ans);
            return 1;
        }

        int count = 0;
       for (int jump = 1; sc + jump <= ec; jump++)
            count += mazePath_MultiHVD(sr, sc + jump, er, ec, ans + "H" + jump);
        for (int jump = 1; sc + jump <= ec && sr + jump <= er; jump++)
            count += mazePath_MultiHVD(sr + jump, sc + jump, er, ec, ans + "D" + jump);
        for (int jump = 1; sr + jump <= er; jump++)
            count += mazePath_MultiHVD(sr + jump, sc, er, ec, ans + "V" + jump);

        return count;
    }
    public static void main(String[] args) {
        System.out.println(mazePath_MultiHVD(0, 0, 3, 3, ""));
    }
}
