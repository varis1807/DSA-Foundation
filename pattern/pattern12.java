import java.util.Scanner;
public class pattern12 {
    public static Scanner scn=new Scanner(System.in);
    public static void print(int n){
for(int i=1; i<=n; i++){
    for(int j=1; j<=n;j++)
    if(i+j==4 ){
        System.out.print("*\t");
    }
    else if(i+j==6){
        System.out.print("*\t");
    }
    else if(i+j==8){
        System.out.print("*\t");
    }
    
    else{
        System.out.print("-\t");
    }
    System.out.println();
}
    }
    public static void main(String[] args) {
       
        int n=scn.nextInt();
        print(n);
    }
}
