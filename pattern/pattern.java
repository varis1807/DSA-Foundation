import java.util.Scanner;
public class pattern {
    public static Scanner scn=new Scanner(System.in);
    public static void patter(){
        int n=scn.nextInt();
        int nst=n;
        nst=1;
        for(int row=1; row<=n; row++){
            for(int cst=1; cst<=nst; cst++)
            System.out.print("*\t");
            nst++;
            System.out.println();
        }
    }
public static void main(String[] args) {
    patter();
} 
}
