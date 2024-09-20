package Assignment.SortAlgo;

import java.util.Arrays;

public class InsertionAndSelectionSort {

    public static void insertionSort(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            System.out.println("Insertion Sort - Key selected: " + key);

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
                System.out.println("Insertion Sort - Array after shifting: " + Arrays.toString(array));
            }
            array[j + 1] = key;
            System.out.println("Insertion Sort - Array after inserting key: " + Arrays.toString(array));
        }
    }

    /**
     * Sorts the given array using the selection sort algorithm.
     * 
     * @param array the array to be sorted
     * @throws IllegalArgumentException if the array is null
     * 
     *                                  The selection sort algorithm sorts an array
     *                                  by repeatedly finding the minimum element
     *                                  (considering ascending order) from the
     *                                  unsorted part and putting it at the
     *                                  beginning.
     *                                  It uses two nested loops to iterate through
     *                                  the array and swap the elements according to
     *                                  whether or not the values of the two
     *                                  elements are greater or less than each
     *                                  other.
     *                                  If they are in the incorrect natural order,
     *                                  which is not in ascending order, the
     *                                  elements at the current index of the nested
     *                                  loop and the minimum index of the outer loop
     *                                  are swapped.
     * 
     *                                  1. The subarray which is already sorted.
     *                                  2. The remaining subarray which is unsorted.
     * 
     *                                  In every iteration of the selection sort,
     *                                  the minimum element (considering ascending
     *                                  order)
     *                                  from the unsorted subarray is picked and
     *                                  moved to the sorted subarray.
     * 
     *                                  The method prints the starting index, the
     *                                  current minimum index, and the array at each
     *                                  step
     *                                  of the sorting process for debugging
     *                                  purposes.
     */
    public static void selectionSort(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null"); // throws an exception if the array is null
        }
        int n = array.length; // sets n to the length of the array
        for (int i = 0; i < n - 1; i++) { // sets i as zero, sets the condition for i to stop when it reaches n-1, which
                                          // is the last index of the zero indexed array, and sets the increment of i by
                                          // 1
            int minIndex = i;// sets i as minimum index value of the array,
            boolean swapped = false; // boolean to check if a swap has occurred
            System.out.println("Selection Sort - Starting index: " + i); // prints the starting index value of the
                                                                         // array, which is always zero in the first
                                                                         // logging since the loop is only in the first
                                                                         // iteration

            for (int j = i + 1; j < n; j++) { // sets j as i+1, which is the element one index ahead of i, sets the
                                              // condition for j to stop when it reaches the value of n, which is the
                                              // total length of the array. This is set to this value because j is an
                                              // index value ahead of i, so it will reach the last index of the array
                                              // ahead of i,
                                              // and sets the increment of j by 1
                if (array[j] < array[minIndex]) { // condition to check if the value of the element at the current index
                                                  // of j is less than the value of the element at the minimum index.
                                                  // This will be true if the value of the element at the current index
                                                  // of j is less than the value of the element at the minimum index
                    minIndex = j; // sets the index of j as the new minimum index since the value of array[j]
                                  // ahead of the minimum index array[i] is less than the value at the minimum
                                  // index
                    swapped = true; // set swapped to true since a new minimum was found
                    // Since the element ahead of the minimum index is less than the element at the
                    // minimum index, the index values of the two elements are swapped to be in
                    // ascending order, and the swapped boolean is set to true.
                }
                System.out.println(
                        "Selection Sort - Current j: " + j + ", Current minIndex: " + minIndex + ", Current array: "
                                + Arrays.toString(array));
            }

            if (swapped) { // only triggers if a swap has occurred
                int temp = array[minIndex]; // sets the value of the element at the minimum index to a temporary
                                            // variable
                array[minIndex] = array[i]; // sets the value of the element at the minimum index to the value of the
                                            // element at the current index of i since the origional value of the
                                            // element at the minimum index was stored in the temporary variable
                array[i] = temp; // sets the value of the element at array[i] as the temperatory storage
                                 // variable, which is the value that was swapped and pulled from the j index.
                System.out.println("Selection Sort - Swapped elements at indices " + i + " and " + minIndex + ": "
                        + Arrays.toString(array)); // prints the swapped elements at the indices of i and minIndex
            }
        }
    }

    public void insertionSortInstance(int[] array) {
        insertionSort(array);
    }

    public void selectionSortInstance(int[] array) {
        selectionSort(array);
    }

    public static void analyzeTimeComplexity() {
        System.out.println("Insertion Sort: O(n^2) in the worst case, O(n) in the best case.");
        System.out.println("Selection Sort: O(n^2) in all cases.");
    }

    public static void main(String[] args) {
        int[] array1 = { 5, 2, 8, 1, 3 };
        System.out.println("Original Array for Insertion Sort: " + Arrays.toString(array1));
        insertionSort(array1);
        System.out.println("Sorted Array using Insertion Sort: " + Arrays.toString(array1));

        int[] array2 = { 5, 2, 8, 1, 3 };
        System.out.println("Original Array for Selection Sort: " + Arrays.toString(array2));
        selectionSort(array2);
        System.out.println("Sorted Array using Selection Sort: " + Arrays.toString(array2));

        int[] staticArray1 = { 5, 2, 8, 1, 3 };
        System.out.println("Static Insertion Sort:");
        insertionSort(staticArray1);
        System.out.println(Arrays.toString(staticArray1));

        int[] staticArray2 = { 5, 2, 8, 1, 3 };
        System.out.println("Static Selection Sort:");
        selectionSort(staticArray2);
        System.out.println(Arrays.toString(staticArray2));

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
