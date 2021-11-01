public class permutation_Without_Duplicates {
    public static void permutationWithoutDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++)
            freq[str.charAt(i) - 'a']++;

        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < freq[i]; j++) {
                sb.append((char) (i + 'a'));
            }
        }

        // System.out.println(sb);
        System.out.println(permutation(sb.toString(), ""));
    }

    public static int permutation(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return 1;
        }
        int count = 0;
        char prev = '$';
       
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != prev) {
                String ros = str.substring(0, i) + str.substring(i + 1);
                count += permutation(ros, ans + str.charAt(i));
            }
            prev = str.charAt(i);
        }
        return count;
    }

    public static void main(String[] args) {
permutationWithoutDuplicates("aba");
    }
}
