package Assignment.SortAlgo;
/**
 * Assignment 6: Implement insertion and selection sort algorithms in Java.
 * This class provides methods to perform insertion sort and selection sort
 * on an array of integers, along with an analysis of their time complexity.

 Implementing and Analyzing Insertion and Selection Sort

Objective:

Implement insertion sort and selection sort algorithms in Java.
Analyze the time complexity of both algorithms and provide a clear explanation.
Instructions:

Implementation:

Write well-structured and commented Java code to implement both insertion sort and selection sort.
Ensure your code handles various input scenarios, including empty arrays.
Analysis:

Determine the best-case and worst-case time complexities for both algorithms.
Explain the reasoning behind your analysis, referencing the specific steps in each algorithm that contribute to its time complexity.
Submission:

Create a PDF document containing:
Your well-formatted Java code for both insertion sort and selection sort.
A clear and detailed explanation of your time complexity analysis for each algorithm.
Rubric:

Implementation (25 points):

**Excellent: The Java code is clean, well-organized, and includes clear comments. Both algorithms are implemented correctly and handle various input scenarios gracefully.**
Good: The code is mostly organized but could benefit from additional comments. Both algorithms are implemented, but there might be minor errors or edge cases not fully addressed.
Satisfactory: The code lacks organization and comments. One or both algorithms might have significant errors or not handle edge cases properly.
Needs Improvement: The code is poorly written and difficult to understand. Algorithms are not implemented correctly or are missing essential components.
Time Complexity Analysis (25 points):

**Excellent: Accurate time complexities are provided for all cases (best, worst, average) for both algorithms. Explanations are clear, concise, and demonstrate a strong understanding of the algorithms' behavior.**
Good: Time complexities are mostly correct, but there might be minor errors or inconsistencies. Explanations are generally clear but could be more detailed or precise.
Satisfactory: Some time complexities might be incorrect or missing. Explanations lack clarity or depth, indicating a limited understanding of the algorithms.
Needs Improvement: Time complexities are significantly incorrect or missing. Explanations are vague or demonstrate a lack of understanding.
Clarity and Organization (25 points):

**Excellent: The PDF submission is well-organized and easy to follow. Code, analysis, and explanations are presented in a clear and logical manner, with proper formatting and section headings.**
Good: The submission is mostly organized but could benefit from improved structure or formatting. Some sections might be unclear or difficult to follow.
Satisfactory: The submission lacks organization and clarity. Code, analysis, and explanations are presented in a disjointed manner, making it challenging to understand the flow of information.
Needs Improvement: The submission is poorly organized and difficult to understand. Code, analysis, and explanations are presented in a confusing and illogical way, hindering comprehension.
Overall Quality and Effort (25 points):

**Excellent: The submission demonstrates exceptional effort, attention to detail, and a deep understanding of the concepts. The code is efficient, the analysis is insightful, and the explanations are thorough.**
Good: The submission shows a solid effort and understanding of the material. The code functions well, the analysis is mostly accurate, and the explanations are adequate.
Satisfactory: The submission meets the basic requirements but lacks depth or polish. The code may have some inefficiencies, the analysis might be superficial, and the explanations could be more elaborated.
Needs Improvement: The submission shows minimal effort and a limited understanding of the topic. The code might be incomplete or contain significant errors, the analysis might be lacking, and the explanations might be unclear or inaccurate.
 */

public class SortAlgorithms {
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

 