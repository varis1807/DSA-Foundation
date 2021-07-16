import java.util.Scanner;

public class pattern16 {
    public static void p(int n) {
       
        int val = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(val+"\t");
                int val1=val;
                val1++;   
                val=val1;    
            } 
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        p(n);
    }
}
