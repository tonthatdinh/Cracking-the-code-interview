package Sort;

public class MergeSort {
    /**
     * merge two subarray of arr[].
     * First subarray is arr[1..m]
     * Second subarray is arr[m + 1..r]
     * @param arr
     * @param l
     * @param m
     * @param r
     */
    static void merg(int arr[], int l, int m, int r){
        /**
         * Find size of two subarrys to be merged
         */
        int n1 = m - l + 1;
        int n2 = r - (m + 1) + 1;

        // Create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy data to temp arrays
        for(int i = 0; i < n1; i ++)
            L[i] = arr[l + i];
        for(int j = 0; j < n2; j ++)
            R[j] = arr[(m + 1) + j];

        // Merge the temp arrays

        int i = 0, j = 0;
        int k = l;

        while (i < n1 && j < n2){
            if (L[i] <= R[j]){
                arr[k] = L[i];
                i ++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1){
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaiing element of R[] if any
        while (j < n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    static void mergesort(int arr[], int l, int r){
        if (l < r){
            // Find the middle point
            int m = (l + r) / 2;

            // Sort first and second halves
            mergesort(arr, l, m);
            mergesort(arr, m + 1, r);

            // Merge the sorted halves;
            merg(arr, l, m, r);
        }
    }

    static void printAray(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n; i ++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        System.out.println("Hello World");
        int arr[] = {12, 11, 13, 5, 6, 7};
        System.out.println("Given array");
        printAray(arr);
        mergesort(arr, 0, arr.length - 1);
        System.out.println("Array after sort");
        printAray(arr);
    }
}
