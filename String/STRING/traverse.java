public class traverse {
      public static void t(String str) {
            int s = str.length();
            for (int i = 0; i < s; i++) {
                  char ch = str.charAt(i);
                  System.out.println(ch + " ");
            }
      }

      public static void main(String[] args) {
            String str = "abcdef";
            t(str);
      }
}