import java.util.Scanner;
public class printString {
    public static Scanner scn = new Scanner(System.in);

    public static void removeDuplicates(String str){
      if(str.length()==0)
      return;

      int n=str.length();
      String ans = str.charAt(0)+"";
      int i=1;
      while(i<n){
          while(i<n && ans.charAt(ans.length()-1)==str.charAt(i))
              i++;
             
              if(i<n)
              ans+=str.charAt(i);
              i++;
      }
          System.out.println(ans);
      
    }

    public static void main(String[] args) {
       String str = scn.nextLine();
removeDuplicates(str);
    }
}
