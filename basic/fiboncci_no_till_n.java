import java.util.Scanner;
public class fiboncci_no_till_n {
    public static Scanner scn = new Scanner(System.in);
    public static void fibb(int n){
        int t1=0;
        int t2=1;
        int nextTerm;
        for(int i=1; i<=n; i++){
          System.out.println(t1);
          nextTerm=t1+t2;
          t1=t2;
          t2=nextTerm;
      }
    }
    public static void main(String[] args) {
        int n=scn.nextInt();
        fibb(n);
    }
}
