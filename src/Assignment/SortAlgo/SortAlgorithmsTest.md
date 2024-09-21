```java:src/Assignment/SortAlgo/tests/SortAlgorithmsTest.java
package Assignment.SortAlgo.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Assignment.SortAlgo.SortAlgorithms;
import java.util.Arrays;

/**
 * SortAlgorithmsTest provides unit tests for the Insertion Sort and Selection Sort
 * algorithms implemented in the SortAlgorithms class.
 */
public class SortAlgorithmsTest {

    /**
     * Test insertionSort with a typical unsorted array.
     */
    @Test
    public void testInsertionSort_TypicalArray() {
        int[] array = {5, 2, 8, 1, 3};
        int[] expected = {1, 2, 3, 5, 8};
        SortAlgorithms.insertionSort(array);
        assertArrayEquals(expected, array, "The array should be sorted in ascending order.");
    }

    /**
     * Test insertionSort with an already sorted array.
     */
    @Test
    public void testInsertionSort_AlreadySorted() {
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        SortAlgorithms.insertionSort(array);
        assertArrayEquals(expected, array, "The array should remain unchanged as it is already sorted.");
    }

    /**
     * Test insertionSort with an empty array.
     */
    @Test
    public void testInsertionSort_EmptyArray() {
        int[] array = {};
        int[] expected = {};
        SortAlgorithms.insertionSort(array);
        assertArrayEquals(expected, array, "Sorting an empty array should result in an empty array.");
    }

    /**
     * Test insertionSort with a null array.
     * Expects an IllegalArgumentException.
     */
    @Test
    public void testInsertionSort_NullArray() {
        assertThrows(IllegalArgumentException.class, () -> {
            SortAlgorithms.insertionSort(null);
        }, "Sorting a null array should throw IllegalArgumentException.");
    }

    /**
     * Test selectionSort with a typical unsorted array.
     */
    @Test
    public void testSelectionSort_TypicalArray() {
        int[] array = {5, 2, 8, 1, 3};
        int[] expected = {1, 2, 3, 5, 8};
        SortAlgorithms.selectionSort(array);
        assertArrayEquals(expected, array, "The array should be sorted in ascending order.");
    }

    /**
     * Test selectionSort with an already sorted array.
     */
    @Test
    public void testSelectionSort_AlreadySorted() {
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        SortAlgorithms.selectionSort(array);
        assertArrayEquals(expected, array, "The array should remain unchanged as it is already sorted.");
    }

    /**
     * Test selectionSort with an empty array.
     */
    @Test
    public void testSelectionSort_EmptyArray() {
        int[] array = {};
        int[] expected = {};
        SortAlgorithms.selectionSort(array);
        assertArrayEquals(expected, array, "Sorting an empty array should result in an empty array.");
    }

    /**
     * Test selectionSort with a null array.
     * Expects an IllegalArgumentException.
     */
    @Test
    public void testSelectionSort_NullArray() {
        assertThrows(IllegalArgumentException.class, () -> {
            SortAlgorithms.selectionSort(null);
        }, "Sorting a null array should throw IllegalArgumentException.");
    }

    /**
     * Test insertionSort with duplicate elements.
     */
    @Test
    public void testInsertionSort_DuplicateElements() {
        int[] array = {4, 2, 5, 2, 3};
        int[] expected = {2, 2, 3, 4, 5};
        SortAlgorithms.insertionSort(array);
        assertArrayEquals(expected, array, "The array with duplicates should be sorted correctly.");
    }

    /**
     * Test selectionSort with duplicate elements.
     */
    @Test
    public void testSelectionSort_DuplicateElements() {
        int[] array = {4, 2, 5, 2, 3};
        int[] expected = {2, 2, 3, 4, 5};
        SortAlgorithms.selectionSort(array);
        assertArrayEquals(expected, array, "The array with duplicates should be sorted correctly.");
    }

    /**
     * Test insertionSort with all elements the same.
     */
    @Test
    public void testInsertionSort_AllElementsSame() {
        int[] array = {2, 2, 2, 2, 2};
        int[] expected = {2, 2, 2, 2, 2};
        SortAlgorithms.insertionSort(array);
        assertArrayEquals(expected, array, "The array with all elements the same should remain unchanged.");
    }

    /**
     * Test selectionSort with all elements the same.
     */
    @Test
    public void testSelectionSort_AllElementsSame() {
        int[] array = {2, 2, 2, 2, 2};
        int[] expected = {2, 2, 2, 2, 2};
        SortAlgorithms.selectionSort(array);
        assertArrayEquals(expected, array, "The array with all elements the same should remain unchanged.");
    }

    /**
     * Test insertionSort with a large array.
     */
    @Test
    public void testInsertionSort_LargeArray() {
        int[] array = new int[1000];
        for(int i = 0; i < array.length; i++) {
            array[i] = 1000 - i;
        }
        int[] expected = new int[1000];
        for(int i = 0; i < expected.length; i++) {
            expected[i] = i + 1;
        }
        SortAlgorithms.insertionSort(array);
        assertArrayEquals(expected, array, "A large array should be sorted in ascending order.");
    }

    /**
     * Test selectionSort with a large array.
     */
    @Test
    public void testSelectionSort_LargeArray() {
        int[] array = new int[1000];
        for(int i = 0; i < array.length; i++) {
            array[i] = 1000 - i;
        }
        int[] expected = new int[1000];
        for(int i = 0; i < expected.length; i++) {
            expected[i] = i + 1;
        }
        SortAlgorithms.selectionSort(array);
        assertArrayEquals(expected, array, "A large array should be sorted in ascending order.");
    }

    /**
     * Test insertionSort with negative numbers.
     */
    @Test
    public void testInsertionSort_NegativeNumbers() {
        int[] array = {0, -1, 3, -2, 2};
        int[] expected = {-2, -1, 0, 2, 3};
        SortAlgorithms.insertionSort(array);
        assertArrayEquals(expected, array, "The array with negative numbers should be sorted correctly.");
    }

    /**
     * Test selectionSort with negative numbers.
     */
    @Test
    public void testSelectionSort_NegativeNumbers() {
        int[] array = {0, -1, 3, -2, 2};
        int[] expected = {-2, -1, 0, 2, 3};
        SortAlgorithms.selectionSort(array);
        assertArrayEquals(expected, array, "The array with negative numbers should be sorted correctly.");
    }
}
```

## Explanation

The `SortAlgorithmsTest` class provides comprehensive unit tests for both the Insertion Sort and Selection Sort algorithms implemented in the `SortAlgorithms` class. Utilizing **JUnit 5**, each test case is designed to verify the correctness and robustness of the sorting methods under various scenarios.

### Test Cases Covered

1. **Typical Unsorted Array**:
   - Verifies that the algorithms correctly sort a standard unsorted array.

2. **Already Sorted Array**:
   - Ensures that sorting an already sorted array leaves it unchanged.

3. **Empty Array**:
   - Confirms that the algorithms can handle empty arrays without errors.

4. **Null Array**:
   - Checks that the algorithms appropriately throw an `IllegalArgumentException` when provided with a null array.

5. **Duplicate Elements**:
   - Tests the ability of the algorithms to handle arrays with duplicate values correctly.

6. **All Elements Same**:
   - Ensures that arrays where all elements are identical remain unchanged after sorting.

7. **Large Array**:
   - Assesses the performance and correctness of the algorithms when dealing with large datasets.

8. **Negative Numbers**:
   - Verifies that the algorithms correctly sort arrays containing negative integers.

### Key Points

- **Assertions**:
  - `assertArrayEquals` is used to compare the expected sorted array with the actual result after sorting.
  - `assertThrows` ensures that appropriate exceptions are thrown for invalid inputs.

- **Edge Cases**:
  - Handling of empty and null arrays to ensure the algorithms do not fail unexpectedly.
  - Sorting arrays with duplicate and identical elements to verify stability and correctness.

- **Performance Testing**:
  - Large arrays are used to test the scalability and efficiency of the sorting methods.

### Integration with Existing Documentation

This test class complements the existing documentation and analysis provided in your Markdown files. It serves as a practical implementation of the testing strategies discussed, demonstrating how to validate the functionality and performance of sorting algorithms in Java.

### Best Practices

- **Clear Naming Conventions**:
  - Test methods are named descriptively to indicate the specific scenario being tested.

- **Comprehensive Coverage**:
  - By covering a wide range of input scenarios, the test suite ensures that the sorting algorithms behave as expected in diverse situations.

- **Maintainability**:
  - The organized structure of the test class facilitates easy updates and additions as needed.

### Running the Tests

To execute the tests, ensure that you have JUnit 5 set up in your project. You can run the tests using your IDE's built-in testing tools or via the command line using Maven or Gradle, depending on your project setup.

```bash
# Using Maven
mvn test

# Using Gradle
gradle test
```

Successful test execution will confirm that both Insertion Sort and Selection Sort are functioning correctly across all tested scenarios, aligning with the best practices and objectives outlined in your development guide.