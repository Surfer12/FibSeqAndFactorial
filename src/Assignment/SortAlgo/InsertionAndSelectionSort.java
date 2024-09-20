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

    public static void selectionSort(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            System.out.println("Selection Sort - Starting index: " + i);

            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
                System.out.println("Selection Sort - Current minIndex: " + minIndex + ", Current array: "
                        + Arrays.toString(array));
            }

            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
            System.out.println("Selection Sort - Swapped elements at indices " + i + " and " + minIndex + ": "
                    + Arrays.toString(array));
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
