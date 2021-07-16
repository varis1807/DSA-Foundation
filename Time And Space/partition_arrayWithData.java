
public class partition_arrayWithData {
    public static int PartitionAnArray(int[] arr, int data) {
        int n = arr.length, p = -1, itr = 0;
        while (itr < n) {
            if (arr[itr] <= data)
                swap(arr, itr, ++p);
            itr++;
        }

        return p;
    }

    public static int PartitionAnArray2(int[] arr, int data) {
        int n = arr.length, p = n - 1, itr = 0;
        while (itr <= p) {
            if (arr[itr] <= data)
                itr++;
            else
                swap(arr, p--, itr);
        }

        return p;
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void display(int[] arr){
    for(int ele:arr)
    System.out.print(ele+" ");
    }
    public static void main(String[] args) {
        int[] arr={3,5,1,-1,7};
        int data=3;
        System.out.println(PartitionAnArray(arr, data));
        display(arr);
    }
}
