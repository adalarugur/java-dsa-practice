package main.java.com.dsa.pratice.arrays;

import main.java.com.dsa.pratice.utils.ArrayUtil;

public class ArrayProblems {
    public static void main(String[] args) {
        // Test array operations
        int[] testArray = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original Array:");
        ArrayUtil.printArray(testArray);

        // Test findMax
        int max = ArrayOperations.findMax(testArray);
        System.out.println("Maximum element: " + max);

        // Test findMin
        int min = ArrayOperations.findMin(testArray);
        System.out.println("Minimum element: " + min);

        // Test reverseArray
        System.out.println("\nReversing the array:");
        ArrayOperations.reverseArray(testArray);
        ArrayUtil.printArray(testArray);
    }
}