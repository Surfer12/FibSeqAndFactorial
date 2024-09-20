package test;

import org.junit.jupiter.api.Test;

import Assignment.SortAlgo.InsertionAndSelectionSort;

import static org.junit.jupiter.api.Assertions.*;

public class InsertionAndSelectionSortTest {

   @Test
   public void testInsertionSort() {
      int[] array = { 5, 2, 9, 1, 5, 6 };
      int[] expected = { 1, 2, 5, 5, 6, 9 };
      InsertionAndSelectionSort.insertionSort(array);
      assertArrayEquals(expected, array);
   }

   @Test
   public void testInsertionSortEmptyArray() {
      int[] array = {};
      int[] expected = {};
      InsertionAndSelectionSort.insertionSort(array);
      assertArrayEquals(expected, array);
   }

   @Test
   public void testInsertionSortSingleElement() {
      int[] array = { 1 };
      int[] expected = { 1 };
      InsertionAndSelectionSort.insertionSort(array);
      assertArrayEquals(expected, array);
   }

   @Test
   public void testSelectionSort() {
      int[] array = { 5, 2, 9, 1, 5, 6 };
      int[] expected = { 1, 2, 5, 5, 6, 9 };
      InsertionAndSelectionSort.selectionSort(array);
      assertArrayEquals(expected, array);
   }

   @Test
   public void testSelectionSortEmptyArray() {
      int[] array = {};
      int[] expected = {};
      InsertionAndSelectionSort.selectionSort(array);
      assertArrayEquals(expected, array);
   }

   @Test
   public void testSelectionSortSingleElement() {
      int[] array = { 1 };
      int[] expected = { 1 };
      InsertionAndSelectionSort.selectionSort(array);
      assertArrayEquals(expected, array);
   }
}