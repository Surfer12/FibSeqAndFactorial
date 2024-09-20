package Assignment.SortAlgo;

import java.util.Arrays;

public class InsertionAndSelectionSort {

    /**
     * Assignment 6: Implement insertion and selection sort algorithms in Java.
     * This class provides methods to perform insertion sort and selection sort
     * on an array of integers, along with an analysis of their time complexity.
     */

    /**
     * Performs insertion sort on the given array.
     *
     * @param array the array to be sorted
     */
    public static void insertionSort(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            // Move elements of array[0..i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    /**
     * Performs selection sort on the given array.
     *
     * @param array the array to be sorted
     */
    public static void selectionSort(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    // Non-static methods
    public void insertionSortInstance(int[] array) {
        insertionSort(array); // Reuse of the static method implemented above
    }

    public void selectionSortInstance(int[] array) {
        selectionSort(array); // Reuse of the static method implemented above
    }

    /**
     * Analysis of the time complexity of the sorting algorithms.
     * 
     * Time Complexity Analysis:
     * Insertion Sort:
     * Best Case: O(n) when the array is already sorted.
     * Worst Case: O(n^2) when the array is sorted in reverse order.
     * Average Case: O(n^2) due to the nested loops.
     * 
     * Selection Sort:
     * Best Case: O(n^2) as it always goes through the entire array to find the
     * minimum.
     * Worst Case: O(n^2) for the same reason.
     * Average Case: O(n^2) as well.
     */
    public static void analyzeTimeComplexity() {
        System.out.println("Insertion Sort: O(n^2) in the worst case, O(n) in the best case.");
        System.out.println("Selection Sort: O(n^2) in all cases.");
    }

    public static void main(String[] args) {
        int[] array1 = { 5, 2, 8, 1, 3 };
        System.out.println("Original Array for Insertion Sort: " + java.util.Arrays.toString(array1));
        insertionSort(array1);
        System.out.println("Sorted Array using Insertion Sort: " + java.util.Arrays.toString(array1));

        int[] array2 = { 5, 2, 8, 1, 3 };
        System.out.println("Original Array for Selection Sort: " + java.util.Arrays.toString(array2));
        selectionSort(array2);
        System.out.println("Sorted Array using Selection Sort: " + java.util.Arrays.toString(array2));

        // Demonstrating static usage
        int[] staticArray1 = { 5, 2, 8, 1, 3 };
        System.out.println("Static Insertion Sort:");
        insertionSort(staticArray1);
        System.out.println(Arrays.toString(staticArray1));

        int[] staticArray2 = { 5, 2, 8, 1, 3 };
        System.out.println("Static Selection Sort:");
        selectionSort(staticArray2);
        System.out.println(Arrays.toString(staticArray2));

        // Demonstrating non-static usage
        InsertionAndSelectionSort sorter = new InsertionAndSelectionSort();
        int[] instanceArray1 = { 5, 2, 8, 1, 3 };
        System.out.println("Instance Insertion Sort:");
        sorter.insertionSortInstance(instanceArray1);
        System.out.println(Arrays.toString(instanceArray1));

        int[] instanceArray2 = { 5, 2, 8, 1, 3 };
        System.out.println("Instance Selection Sort:");
        sorter.selectionSortInstance(instanceArray2);
        System.out.println(Arrays.toString(instanceArray2));

        analyzeTimeComplexity();
    }
}