import java.util.Scanner;
public class isPrime {
    public static Scanner scn = new Scanner(System.in);
    public static boolean Prime(int n){
    int count=0;
    for(int div=2; div*div<=n; div++){
        if(n%div==0){
            count++;
            break;
        }
      }
        if(count==0){
            return true;
        }
        else{
            return false;
        }
    }
     public static void solve(){
         
            int n=scn.nextInt();
            boolean res=Prime(n);
            if(res==true)
            System.out.println("prime");
            else
            System.out.println("not prime"); 
     }
    public static void main(String[] args) {
        int t=scn.nextInt();
        for(int i=1; i<=t; i++){
            solve();
        }
       
    }
}
