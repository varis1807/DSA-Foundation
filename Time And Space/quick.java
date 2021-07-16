public class quick {
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
public static void quickSort(int[] arr,int si, int ei){
    if(si>=ei)
    return;
    int pIdx=ei;
    int p=pivotIdx(arr, pIdx, si, ei);
    quickSort(arr, si, p-1);
    quickSort(arr, p+1, ei);
}
public static void main(String[] args) {
    int[] arr = { -12, 2, 7, 4, 34, 23, 0, 1, -1, -50, 16, 23, 7, 4, 2, 3 };
    quickSort(arr, 0, arr.length - 1);

    for (int ele : arr)
        System.out.print(ele + " ");
}
}
