import java.util.Scanner;
public class prime_number_till_n {
    public static Scanner scn =new Scanner(System.in);
    public static void print(int i){ 
            int count=0; 
            for(int div=2; div*div<=i; div++){
                if(i%div==0){
                    count++;
                    break;
                }}
            if(count==0){
               System.out.println(i);
            }
                
            }
    public static void solve(int a, int b){
        for(int i=a; i<=b; i++){ 
        print(i);
        }
    }
    public static void main(String[] args) {
        int a=scn.nextInt();
        int b=scn.nextInt();
        solve(a,b);
    }
}
