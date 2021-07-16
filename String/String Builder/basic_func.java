import java.util.*;

public class basic_func {
    public static Scanner scn = new Scanner(System.in);

    public static void basicFunctions() {
        StringBuilder sb = new StringBuilder();
        sb.append("a");
        sb.append("strrh");
        System.out.println(sb.toString());
        sb.setCharAt(1, 'b');
        System.out.println(sb.toString());
        sb.deleteCharAt(2);
        System.out.println(sb.toString());
        sb.deleteCharAt(3);
        System.out.println(sb.toString());
        sb.setCharAt(2, 'c');
        System.out.println(sb.toString());
        sb.setCharAt(0, 'z');
        System.out.println(sb.toString());
        sb.insert(1, 'y');
        System.out.println(sb.toString());
        System.out.println(sb.length());
    }

    public static void main(String[] args) {
        // String str = scn.nextLine();
        basicFunctions();
    }
}
