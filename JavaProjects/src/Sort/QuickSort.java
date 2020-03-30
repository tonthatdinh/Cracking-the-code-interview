package Sort;

/**
 * Ref: https://www.geeksforgeeks.org/quick-sort/?ref=lbp
 */
public class QuickSort {
    /**
     * @param arr array that need to sort
     * @param low low index
     * @param high high index
     * @return pivot position
     */
    private static int partition(int[] arr, int low, int high){
        // pivot (element to be placed at right position
        int pivot = arr[high];
        int i = low - 1; //index of smaller element
        for(int j = low; j <= high - 1; j ++){
            // If current element is smaller than the pivot
            if (arr[j] < pivot){
                i ++;
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        int tmp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = tmp;
        return (i + 1);
    }

    /**
     * @param arr array that need to sort
     * @param low low index
     * @param high high index
     */
    private static void quicksort(int[] arr, int low, int high){
        if (low < high){
            /**
             * pivot is partitioning index,
             */
            int pivot = partition(arr, low, high);

            quicksort(arr, low, pivot - 1);
            quicksort(arr, pivot + 1, high);
        }
    }

    /**
     *
     * @param arr array that need to print
     */
    private static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i ++)
            System.out.print(arr[i] + ",");
        System.out.println();
    }

    public static void main(String args[]){
        int[] myarr = new int[5];
        for(int i = 0; i < 5; i ++){
            myarr[i] = 5 - i;
        }
        printArray(myarr);
        quicksort(myarr, 0, myarr.length - 1);
        printArray(myarr);
    }
}
