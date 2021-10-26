import java.util.Scanner;

public class printPalinAllSubstring {
    public static Scanner scn = new Scanner(System.in);
public static boolean isPalin(String str, int si, int ei){
    while(si<ei){
        if(str.charAt(si) != str.charAt(ei))
        return false;
        si++;
        ei--;
    }
    return true;
}

    public static void subString(String str){
        int n = str.length();
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(isPalin(str, i, j)){
                String s=str.substring(i,j+1);
                    System.out.println(s);
            }
        }
        }
    }

    public static void main(String[] args) {
        String str = "TENET";
        subString(str);
    }
}