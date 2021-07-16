public class insertion_sort {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j - 1] > arr[j])
                    swap(arr, j - 1, j);
                else
                    break;
            }
        }
        for(int i=0; i<n; i++)
        System.out.print(arr[i]+" ");
    }

    public static void main(String[] args) {
        int arr[] = { 8, 5, -2, 20, 1, 6, 3, 8 };
      insertionSort(arr);
    }
}
