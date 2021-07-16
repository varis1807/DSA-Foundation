import java.util.Scanner;
public class spiral {
    public static Scanner scn = new Scanner(System.in);

    public static void input(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
    }
public static void printSpiral(int[][] arr){
    int n=arr.length;
    int m=arr[0].length;
    int rmin=0, cmin=0;
    int cmax=m-1, rmax=n-1;
    int tnel=n*m;
    while(tnel>0){
        for(int r=rmin; r<=rmax && tnel>0; r++){
            System.out.println(arr[r][cmin]);
            tnel--;
        }
        cmin++;

        for(int c=cmin; c<=cmax && tnel>0; c++){
            System.out.println(arr[rmax][c]);
            tnel--;
        }
        rmax--;

        for(int r=rmax; r>=rmin && tnel>0; r--){
            System.out.println(arr[r][cmax]);
            tnel--;
        }
        cmax--;

        
        for(int c=cmax; c>=cmin && tnel>0; c--){
            System.out.println(arr[rmin][c]);
            tnel--;
        }
        rmin++;
    }
}
    public static void main(String[] args) {
        int[][] arr = new int[scn.nextInt()][scn.nextInt()];
        input(arr);
        printSpiral(arr);
     
    }
}
