import java.util.Scanner;

public class table {
    public static Scanner scn = new Scanner(System.in);
    public static void tab(){
              
              int n1;
              n1= scn.nextInt();
              for(int j=1; j<=n1; j++){
              for(int i=1; i<=10; i++){
                 int t = i*j;
              System.out.print(j+ " * " + i +" = "+ t +" ");    
              System.out.println("  ");
    }
    System.out.println("----------");
}
}
       public static void main(String[] args) {
          tab();
      }
}
