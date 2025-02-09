package Algorithms;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {3, 1, 7, 4, 23, 98, 56, 4, 3, 5};

        Arrays.sort(arr);

        Arrays.stream(arr).forEach(System.out::print);

        System.out.printf("\ntarget: " +  binarySearch(arr, 56));
    }

    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (target < arr[mid]) {
                high = mid - 1;
            } else if (target > arr[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
