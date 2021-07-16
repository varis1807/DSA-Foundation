import java.util.Scanner;

public class pattern13 {
    public static Scanner scn = new Scanner(System.in);

    public static void print() {
        int n = scn.nextInt();
        int val=1;
for(int i=1; i<=n; i++){
    for(int j=1; j<=i; j++)
    System.out.print(val+++"\t");
    System.out.println();
}
    }

    public static void main(String[] args) {
print();
    }
}
