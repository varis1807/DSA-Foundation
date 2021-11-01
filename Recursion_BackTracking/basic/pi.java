import java.util.Scanner;
public class pi {
    public static Scanner scn = new Scanner(System.in);

    public static void printInc(int a,int b) {
       if(a>b)
       return;
       if(a%2==0)
       System.out.println(a);
     printInc(a+1, b);
    if(a%2!=0)
    System.out.println(a);    
    }

    public static void main(String[] args) {
        int a = scn.nextInt();
        int b = scn.nextInt();
        printInc(a,b);
    }
}
