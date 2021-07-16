public class sort_01 {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sort(int[] arr) {
        int p = -1;
        int itr = 0;
        while (itr < arr.length) {
            if (arr[itr] == 0)
                swap(arr, ++p, itr);
            itr++;
        }
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        int[] arr = { 0, 0, 1, 0, 1, 0, 1, 0, 0 };
        sort(arr);
    }
}