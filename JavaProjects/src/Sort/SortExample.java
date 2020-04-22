package Sort;

import java.util.Arrays;

// https://www.geeksforgeeks.org/collections-sort-java-examples/
// https://www.geeksforgeeks.org/arrays-sort-in-java-with-examples/

public class SortExample {
    public static void main(String[] args){
        // Our arr contains 8 elements
        int[] arr = {13, 7, 6, 45, 21, 9, 101, 102};
        for(int index = 0; index < arr.length; index++){
            System.out.print(arr[index] + " ");
        }

        //Arrays.sort(arr);
//        System.out.println();
//        for(int index = 0; index < arr.length; index++){
//            System.out.print(arr[index] + " ");
//        }


        // Sort subarray from index 1 to 4
        // only sort subarry {7, 6, 45, 21}
        // and keep other elements as it is
        Arrays.sort(arr, 1, 4);
        System.out.println();
        for(int index = 0; index < arr.length; index++){
            System.out.print(arr[index] + " ");
        }
    }
}
