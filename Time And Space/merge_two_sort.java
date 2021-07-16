public class merge_two_sort{
    public static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2) {
        int i = 0, j = 0, k = 0;
        int n = arr1.length, m = arr2.length;
        int[] ans = new int[n + m];

        while (i < n && j < m) {
            if (arr1[i] < arr2[j])
                ans[k++] = arr1[i++];
            else
                ans[k++] = arr2[j++];
        }

        while (i < n)
            ans[k++] = arr1[i++];
        while (j < m)
            ans[k++] = arr2[j++];

        return ans;
    }

    // public static int[] mergeTwoSortedArrays2(int[] arr1, int[] arr2) {
    //     int i = 0, j = 0, k = 0;
    //     int n = arr1.length, m = arr2.length;
    //     int len = n + m;
    //     int[] ans = new int[len];

    //     long val1 = 0, val2 = 0;
    //     while (k < len) {
    //         val1 = i < n ? arr1[i] : (long) 1e18;
    //         val2 = j < m ? arr2[j] : (long) 1e18;
    //         if (val1 < val2) {
    //             ans[k++] = (int) val1;
    //             i++;
    //         } else {
    //             ans[k++] = (int) val2;
    //             j++;
    //         }
    //     }

    //     return ans;
    // }

    // public static int[] mergeTwoSortedArrays3(int[] arr1, int[] arr2) {
    //     int i = 0, j = 0, k = 0;
    //     int n = arr1.length, m = arr2.length;
    //     int len = n + m;
    //     int[] ans = new int[n + m];

    //     while (k < len) {
    //         if (i == n)
    //             ans[k++] = arr2[j++];
    //         else if (j == m)
    //             ans[k++] = arr1[i++];
    //         else if (arr1[i] < arr2[j])
    //             ans[k++] = arr1[i++];
    //         else
    //             ans[k++] = arr2[j++];
    //     }

    //     return ans;
    // }
    public static void display(int[] arr1,int[] arr2) {
        int ans[]=mergeTwoSortedArrays(arr1, arr2);
        for (int ele : ans)
            System.out.print(ele + " ");
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] arr1={1,3,5};
        int[] arr2={2,4,6};
        display(arr1, arr2);
    }
}