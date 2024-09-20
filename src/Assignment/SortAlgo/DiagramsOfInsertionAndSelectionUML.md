# UML and Sequence Diagrams for Insertion and Selection Sort

### UML Diagram for Insertion Sort

#### Output Log of the Insertion Sort Algorithm
```java 
int [] anArray = [5, 2, 8, 1, 3]
```

```
insertionSort(anArray)

Output Log:
Original Array for Insertion Sort: [5, 2, 8, 1, 3]
Insertion Sort - Key selected: 2
Insertion Sort - Array after shifting: [5, 5, 8, 1, 3]
Insertion Sort - Array after inserting key: [2, 5, 8, 1, 3]
Insertion Sort - Key selected: 8
Insertion Sort - Array after inserting key: [2, 5, 8, 1, 3]
Insertion Sort - Key selected: 1
Insertion Sort - Array after shifting: [2, 5, 8, 8, 3]
Insertion Sort - Array after shifting: [2, 5, 5, 8, 3]
Insertion Sort - Array after shifting: [2, 2, 5, 8, 3]
Insertion Sort - Array after inserting key: [1, 2, 5, 8, 3]
Insertion Sort - Key selected: 3
Insertion Sort - Array after shifting: [1, 2, 5, 8, 8]
Insertion Sort - Array after shifting: [1, 2, 5, 5, 8]
Insertion Sort - Array after inserting key: [1, 2, 3, 5, 8]
Sorted Array using Insertion Sort: [1, 2, 3, 5, 8]
```

### Combined UML and Sequence Diagram for Selection Sort

#### Class Diagram
```
+-------------------------------+
| InsertionAndSelectionSort     |
+-------------------------------+
| + selectionSort(array: int[]) |
| + selectionSortInstance(array: int[]) |
+-------------------------------+
```

```
anArray = [5, 2, 8, 1, 3]
```
```
selectionSort(anArray)
Selection Sort - Starting index: 0
Selection Sort - Current minIndex: 1, Current array: [5, 2, 8, 1, 3]
Selection Sort - Current minIndex: 1, Current array: [5, 2, 8, 1, 3]
Selection Sort - Current minIndex: 3, Current array: [5, 2, 8, 1, 3]
Selection Sort - Current minIndex: 3, Current array: [5, 2, 8, 1, 3]
Selection Sort - Swapped elements at indices 0 and 3: [1, 2, 8, 5, 3]
Selection Sort - Starting index: 1
Selection Sort - Current minIndex: 1, Current array: [1, 2, 8, 5, 3]
Selection Sort - Current minIndex: 1, Current array: [1, 2, 8, 5, 3]
Selection Sort - Current minIndex: 1, Current array: [1, 2, 8, 5, 3]
Selection Sort - Swapped elements at indices 1 and 1: [1, 2, 8, 5, 3]
Selection Sort - Starting index: 2
Selection Sort - Current minIndex: 3, Current array: [1, 2, 8, 5, 3]
Selection Sort - Current minIndex: 4, Current array: [1, 2, 8, 5, 3]
Selection Sort - Swapped elements at indices 2 and 4: [1, 2, 3, 5, 8]
Selection Sort - Starting index: 3
Selection Sort - Current minIndex: 3, Current array: [1, 2, 3, 5, 8]
Selection Sort - Swapped elements at indices 3 and 3: [1, 2, 3, 5, 8]
[1, 2, 3, 5, 8]
```