public class selection__sort {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void selection(int[] arr) {
        int n = arr.length;
       for(int i=0; i<n; i++){
           for(int j=i+1; j<n; j++){
               if(arr[i]>arr[j])
               swap(arr, i, j);
           }
       }
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i])
                    minIdx = j;
            }
            swap(arr, i, minIdx);
        }
    }
    public static void main(String[] args) {
        int[] arr = { 4, 10, 2, 10, 12, 15, 1 };
        selection(arr);
    }
}
