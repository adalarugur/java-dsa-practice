package main.java.com.dsa.pratice.arrays;

import main.java.com.dsa.pratice.utils.ArrayUtil;
public class ArrayOperations {

    /**
     * Finds the maximum element in the array
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * Finds the minimum element in the array
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static int findMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    /**
     * Reverses the array in-place
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static void reverseArray(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            ArrayUtil.swap(arr, start, end);
            start++;
            end--;
        }
    }
}