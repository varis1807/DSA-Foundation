import java.util.Scanner;
public class performance {
    public static void per(){
        int n=100000;
        long start = System.currentTimeMillis();
        // String s="";
        // for(int i=0; i<n; i++){
        //     s+=i;
        //     // System.out.println(s+" "); // tc = o(n^2)
        // }
        StringBuilder s=new StringBuilder();
        for(int i=0;i<n; i++){
            s.append(i);
            // System.out.println(s);
        }
        long end=System.currentTimeMillis();
        long duration = end-start;
        System.out.println(duration); 
    }

    public static void main(String[] args) {
        per();
    }
}
