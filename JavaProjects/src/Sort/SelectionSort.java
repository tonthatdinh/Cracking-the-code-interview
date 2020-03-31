package Sort;

public class SelectionSort {
    private static void selecsort(int[] arr){
        int n = arr.length;

        // One by one move boundary of unsorted array
        for(int i = 0; i < n - 1; i ++){
            // Find the minimum element in unsorted array
            int min_idx = i;
            for(int j = i + 1; j < n; j ++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            /**
             * Swap the found minimum element with current
             * element
             *
             */
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    private static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i ++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String args[]){
        System.out.println("Hello ");
        int arr[] = {64, 25, 12, 22, 11};
        printArray(arr);
        selecsort(arr);
        printArray(arr);
    }
}
