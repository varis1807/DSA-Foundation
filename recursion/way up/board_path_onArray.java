
public class board_path_onArray {
    public static int boardPath(int[] arr, int n, String ans) {
        if (n == 0) {
            System.out.println(ans);
            return 1;
        }

        int count = 0;
        for (int jump : arr) {
            if (n - jump >= 0)
                count += boardPath(arr, n-jump, ans + jump);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 3, 1 };
        System.out.println(boardPath(arr, 4, ""));
    }
}
