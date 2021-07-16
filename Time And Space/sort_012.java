public class sort_012 {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sort(int[] arr) {
        // int n = arr.length - 1;
        // int p1 = -1;
        // int p2 = n;
        // int itr = 0;
        // while (itr <= p2) {
        // if (arr[itr] == 0)
        // swap(arr, ++p1, itr++);
        // else if (arr[itr] == 2) {
        // swap(arr, p2--, itr);
        // } else
        // itr++;
        // }
        int p1 = 0;
        int p2 = 1;
        int itr = 0;
        while (p2 < arr.length-1) {
            if (arr[itr] == 0)
                swap(arr, p1, itr++);
            else if (arr[itr] == 2)
                swap(arr, ++p2, itr);
            else if (arr[itr] == 1)
                swap(arr, p1, itr++);
        }
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        int[] arr = { 0, 2, 1, 0, 0, 2 };
        sort(arr);
    }
}
