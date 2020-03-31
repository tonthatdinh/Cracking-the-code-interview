package DataStructure;

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Vector;

/**
 * Implement basic data structure like arrays and vector
 * Ref: https://www.geeksforgeeks.org/java-util-vector-class-java/
 * Ref: https://beginnersbook.com/2013/12/vector-in-java/
 * Ref: https://www.geeksforgeeks.org/hashtable-in-java/
 *
 */


public class Main {
    public static int binarySearch(int x, int[] arr, int left, int right){
        while (left < right){
            int mid = (left + right) / 2;
            if (x == arr[mid]) return mid;
            if (x > arr[mid])
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    public static void main(String args[]){
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(arr.length);
        for(int i = 0; i < arr.length; i ++){
            System.out.println("Element at " + i + "=" + arr[i]);
        }
        System.out.println(binarySearch(3, arr, 0, arr.length - 1));
    }
}
