import java.util.Scanner;
public class printTableAll {
    public static Scanner scn = new Scanner(System.in);
    public static void table(int num){
        for(int i=1; i<=10; i++){
            int multi=i*num;
            System.out.println(num + " x "+i+" = "+multi);
        }
    }
    public static void printAll(){
        int n=scn.nextInt();
        for(int i=1; i<=n; i++){
            table(i);
        System.out.println("-----------------");
    }}

    public static void main(String[] args) {
        printAll();
    }
}
