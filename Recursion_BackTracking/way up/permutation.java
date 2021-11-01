public class permutation {
    public static int printPermutation(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return 1;
        }
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            String ros = str.substring(0, i) + str.substring(i + 1);
            count += printPermutation(ros, ans + str.charAt(i));
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(printPermutation("abcd", ""));
    }
}
