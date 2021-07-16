import java.util.Scanner;
public class prime_till_n {
    public static Scanner scn = new Scanner(System.in);
    public static void allPrime(){
        int low=scn.nextInt();
        int high=scn.nextInt();
        for(int n=low; n<=high; n++){
            int count=0;
            for(int div=2; div*div<=n; div++){
                if(n%div==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println(n);
            }
        }
    }
    public static void main(String[] args) {
        allPrime();
        
    }
}
