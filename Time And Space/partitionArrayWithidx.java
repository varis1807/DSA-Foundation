public class partitionArrayWithidx {
    public static void PartitionOverPivot(int[] arr, int pivotIdx) {
        int n = arr.length;
        swap(arr, pivotIdx, n - 1);

        int itr = 0, p = -1, li = n - 1;
        while (itr < li) {
            if (arr[itr] <= arr[li])
                swap(arr, itr, ++p);

            itr++;
        }

        swap(arr, ++p, li);
    }
    //4 3 2 1 5 6 12 10 
    public static void display(int[] arr) {
        for (int ele : arr)
            System.out.print(ele + " ");
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 10, 12, 1, 5, 6 };
        int pivotIdx = 7;
        PartitionOverPivot(arr, pivotIdx);
        display(arr);
    }

}
