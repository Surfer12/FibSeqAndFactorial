package Assignment.SortAlgo;
import java.util.Arrays;
public class InsertionAndSelectionSort {
    /**
     * Performs insertion sort on the given array.
         *
         * @param array the array to be sorted
         */
        public static void insertionSort(int[] array) {
            int n = array.length;
            for (int i = 1; i < n; i++) {
                int key = array[i];
                int j = i - 1;

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
            int n = array.length;
            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < n; j++) {
                    if (array[j] < array[minIndex]) {
                        minIndex = j;
                    }
                }
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
         * Analyzes the time complexity of the sorting algorithms.
         * 
         * Insertion Sort: O(n^2) in the worst case, O(n) in the best case.
         * Selection Sort: O(n^2) in all cases.
         */

        public static void main(String[] args) {
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
        }
    }