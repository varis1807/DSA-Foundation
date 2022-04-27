import java.util.*;
public class oned_twod {
      public static void main(String[] args){
            int[] arr={1,2,3,4,5,6,7,8,9};
            int n=3,m=3;
            int [][] ans=new int[n][m];
            for(int r=0; r<n; r++){
                  for(int c=0; c<m; c++){
                        ans[r][c]=arr[r*m+c];
                  }
            }

            for(int i=0; i<n; i++){
                  for(int j=0; j<m; j++){
                        System.out.print(ans[i][j]+" ");
                  }
                  System.out.println();
            }
      }
}
