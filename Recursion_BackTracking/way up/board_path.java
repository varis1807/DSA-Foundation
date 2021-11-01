public class board_path {
    // public static int boardPath(int sp, int ep, String ans) {
    //     if (sp == ep) {
    //         System.out.println(ans);
    //         return 1;
    //     }

    //     int count = 0;
    //     for (int dice = 1; dice <= 6 && sp + dice <= ep; dice++) {
    //         count += boardPath(sp + dice, ep, ans + dice);
    //     }

    //     return count;
    // }
    public static int boardPath(int n, String ans) {
        if (n == 0) {
            System.out.println(ans);
            return 1;
        }

        int count = 0;
        for (int dice = 1; dice <= 6 && n - dice >= 0; dice++) {
            count += boardPath(n - dice, ans + dice);
        }

        return count;
    }

    public static void main(String[] args) {
        // System.out.println(boardPath(0, 10, ""));
    System.out.println(boardPath(5, ""));
    }
}
