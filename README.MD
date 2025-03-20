# Data Structures and Algorithms Practice

This repository contains implementations of various data structures and algorithms in Java.

## Arrays

### Implemented Operations
- Finding maximum element in an array
- Finding minimum element in an array
- Reversing an array in-place

### Time Complexities
- Find Max/Min: O(n)
- Reverse Array: O(n)

### Space Complexities
All operations: O(1) - In-place operations

### Usage Example
```java
int[] arr = {64, 34, 25, 12, 22, 11, 90};
int max = ArrayOperations.findMax(arr);
int min = ArrayOperations.findMin(arr);
ArrayOperations.reverseArray(arr);