import java.util.*;

public class print {

      public static void f1(int i,int j) {
          if(i==j)
          return;
            f1(i++,j);
            System.out.println(i);
            
      }

      public static void main(String[] args) {
            int i=1;
            int j=10;
            f1(i,j);
      }

}
