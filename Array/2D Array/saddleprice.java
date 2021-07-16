import java.util.Scanner;

public class saddleprice {
    public static Scanner scn = new Scanner(System.in);

    public static int maxInCol(int[][] arr, int c) {
        int maxVal = -(int) 1e9;
        int r = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][c] > maxVal) {
                maxVal = arr[i][c];
                r = i;
            }
        }
        return r;
    }
public static void saddlepoint(int[][] arr){
    int n=arr.length;
    int m=arr[0].length;
    Boolean flag = false;
    for(int i=0; i<n; i++){
        int  minVal=(int)1e9;
        int c=-1;
        for(int j=0; j<m; j++){
            if(arr[i][j]<minVal){
                minVal =arr[i][j];
                c=j;
            }
        }
        int r=maxInCol(arr,c);
        if(r==i){
            System.out.println(arr[r][c]);
            flag = true;
        }
    }
    if(!flag)
    System.out.println("Invalid Input");
}

    public static void main(String[] args) {
        int[][] arr = new int[scn.nextInt()][scn.nextInt()];
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        saddlepoint(arr);
    }
}
