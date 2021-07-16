
    public class bubble_sort {
        public static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    
        public static void bubbleSort(int[] arr) {
            int n = arr.length;
    
            for (int li = n - 1; li > 0; li--) {
                for (int i = 1; i <= li; i++)
                    if (arr[i - 1] > arr[i])
                        swap(arr, i-1, i );
            }
           
        }
        // public static void bubbleSort_Opti(int[] arr) {
        // int n = arr.length;
    
        // for (int li = n - 1; li > 0; li--) {
        // boolean isSwapDone = false;
        // for (int i = 1; i <= li; i++) {
        // if (arr[i - 1] > arr[i]) {
        // swap(arr, i, i - 1);
        // isSwapDone = true;
        // }
        // }
    
        // if (isSwapDone)
        // break;
        // }
        // }
        public static void display(int[] arr){
            for(int ele:arr){
                System.out.print(ele+" ");
            }
        }
        public static void main(String[] args) {
            int[] arr = { -5, 10, 6, 9 };
            bubbleSort(arr);
            for(int ele=0; ele<arr.length; ele++)
            System.out.print(arr[ele]+" ");
        }
    
    }
     

