package test;

import Assignment.SortAlgo.InsertionAndSelectionSort;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InsertionAndSelectionSortTest {

   @Test
   public void testInsertionSortWithPositiveNumbers() {
      int[] array = { 5, 2, 8, 1, 3 };
      InsertionAndSelectionSort.insertionSort(array);
      assertArrayEquals(new int[] { 1, 2, 3, 5, 8 }, array);
   }

   @Test
   public void testSelectionSortWithPositiveNumbers() {
      int[] array = { 5, 2, 8, 1, 3 };
      InsertionAndSelectionSort.selectionSort(array);
      assertArrayEquals(new int[] { 1, 2, 3, 5, 8 }, array);
   }

   @Test
   public void testInsertionSortWithNegativeNumbers() {
      int[] array = { -3, -1, -4, -2, -5 };
      InsertionAndSelectionSort.insertionSort(array);
      assertArrayEquals(new int[] { -5, -4, -3, -2, -1 }, array);
   }

   @Test
   public void testSelectionSortWithNegativeNumbers() {
      int[] array = { -3, -1, -4, -2, -5 };
      InsertionAndSelectionSort.selectionSort(array);
      assertArrayEquals(new int[] { -5, -4, -3, -2, -1 }, array);
   }

   @Test
   public void testInsertionSortWithMixedNumbers() {
      int[] array = { 3, -1, 4, -2, 0 };
      InsertionAndSelectionSort.insertionSort(array);
      assertArrayEquals(new int[] { -2, -1, 0, 3, 4 }, array);
   }

   @Test
   public void testSelectionSortWithMixedNumbers() {
      int[] array = { 3, -1, 4, -2, 0 };
      InsertionAndSelectionSort.selectionSort(array);
      assertArrayEquals(new int[] { -2, -1, 0, 3, 4 }, array);
   }

   @Test
   public void testInsertionSortWithDuplicates() {
      int[] array = { 3, 1, 2, 1, 3 };
      InsertionAndSelectionSort.insertionSort(array);
      assertArrayEquals(new int[] { 1, 1, 2, 3, 3 }, array);
   }

   @Test
   public void testSelectionSortWithDuplicates() {
      int[] array = { 3, 1, 2, 1, 3 };
      InsertionAndSelectionSort.selectionSort(array);
      assertArrayEquals(new int[] { 1, 1, 2, 3, 3 }, array);
   }

   @Test
   public void testInsertionSortWithSingleElement() {
      int[] array = { 1 };
      InsertionAndSelectionSort.insertionSort(array);
      assertArrayEquals(new int[] { 1 }, array);
   }

   @Test
   public void testSelectionSortWithSingleElement() {
      int[] array = { 1 };
      InsertionAndSelectionSort.selectionSort(array);
      assertArrayEquals(new int[] { 1 }, array);
   }

   @Test
   public void testInsertionSortWithEmptyArray() {
      int[] array = {};
      InsertionAndSelectionSort.insertionSort(array);
      assertArrayEquals(new int[] {}, array);
   }

   @Test
   public void testSelectionSortWithEmptyArray() {
      int[] array = {};
      InsertionAndSelectionSort.selectionSort(array);
      assertArrayEquals(new int[] {}, array);
   }

   @Test
   public void testInsertionSortWithNullArray() {
      assertThrows(IllegalArgumentException.class, () -> {
         InsertionAndSelectionSort.insertionSort(null);
      });
   }

   @Test
   public void testSelectionSortWithNullArray() {
      assertThrows(IllegalArgumentException.class, () -> {
         InsertionAndSelectionSort.selectionSort(null);
      });
   }
}