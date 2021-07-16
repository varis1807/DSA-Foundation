public class quik_select {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int pivotIdx(int[] arr, int pIdx, int si, int ei) {
        swap(arr, pIdx, ei);
        int p = si - 1;
        int itr = si;
        while (itr <= ei) {
            if (arr[itr] <= arr[ei])
                swap(arr, ++p, itr);
            itr++;
        }
        return p;
    }
    public static void quickSort(int[] arr, int si, int ei, int idx) {
        if (si >= ei)
            return;
        int pivot = ei;
        int pIdx = pivotIdx(arr, pivot, si, ei);
        if (pIdx == idx)
            return;
        else if (idx > pIdx)
            quickSort(arr, pIdx + 1, ei, idx);
        else
            quickSort(arr, 0, pIdx - 1, idx);

    }
    public static int quickSelect(int[] arr, int k) {
        int n = arr.length, idx = n - k;
        quickSort(arr, 0, n - 1, idx);
        return arr[idx];
    }
    public static void main(String[] args) {
        //int[] arr = { 10, 12, -8, -7, 3, 5, 4, 8 };
        int[] arr = { 1,2,3,3};
        System.out.println(quickSelect(arr, 4));
    }
}
