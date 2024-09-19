package Assignment.FibSeq;

/**
 * The FibonacciSequenceCalculator class provides methods to calculate
 * the Fibonacci sequence value at a given index using both recursive and
 * iterative approaches.
 * 
 * This class contains the following methods:
 * 
 * #calculateFibonacciValueAt(int)} - Calculates the Fibonacci value at a given
 * index using recursion.
 * 
 * #calculateFibonacciValueAtIterative(int)} - Calculates the Fibonacci value at
 * a given index using iteration.
 * 
 * #getFibonacciValueAtSpecifiedIndex()} - Returns the Fibonacci value at the
 * index
 * specified during object creation using recursion.
 * 
 * #getFibonacciValueAtSpecifiedIndexIterative()} - Returns the Fibonacci value
 * at the
 * index specified during object creation using iteration.
 * 
 * 
 * 
 * Example usage:
 * 
 * 
 * FibonacciSequenceCalculator fib = new FibonacciSequenceCalculator(10);
 * int valueRecursive = fib.getFibonacciValueAtSpecifiedIndex(); // Recursive
 * approach
 * int valueIterative = fib.getFibonacciValueAtSpecifiedIndexIterative(); //
 * Iterative
 * approach
 * 
 * 
 * 
 * @author Ryan Oates
 * 
 */

public class FibonacciSequenceCalculator {
    private int specifiedIndex;

    public FibonacciSequenceCalculator(int specifiedIndex) {
        this.specifiedIndex = specifiedIndex;
    }

    // Recursive method to calculate Fibonacci value
    public int calculateFibonacciValueAt(int index) {
        if (index <= 1) {
            return index;
        }
        return calculateFibonacciValueAt(index - 1) + calculateFibonacciValueAt(index - 2);
    }

    public int getFibonacciValueAtSpecifiedIndex() {
        return calculateFibonacciValueAt(specifiedIndex);
    }
}
