import java.util.Scanner;
public class oddEvenReturn {
    public static Scanner scn = new Scanner(System.in);

    public static boolean isEvenOdd(int n){
         if(n%2==0)
         return true;
        else
         return false;
        }
    public static void solve(){
        int n=scn.nextInt();
        boolean result =isEvenOdd(n);
        System.out.println(result);
    }
    
    public static void main(String[] args) {
      int t=scn.nextInt();
      for(int i=1; i<=t; i++){
          solve();
      }
    }
}
