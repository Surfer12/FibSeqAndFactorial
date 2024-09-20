package Assignment.SortAlgo;

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

        /**
         * Analyzes the time complexity of the sorting algorithms.
         * 
         * Insertion Sort: O(n^2) in the worst case, O(n) in the best case.
         * Selection Sort: O(n^2) in all cases.
         */

        public static void analyzeTimeComplexity() {
            System.out.println("Insertion Sort: O(n^2) in the worst case, O(n) in the best case.");
        System.out.println("Selection Sort: O(n^2) in all cases.");
    }
}
