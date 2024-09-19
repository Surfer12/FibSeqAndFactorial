package Assignment.FibSeq;

// Iterative method to calculate Fibonacci value using Iterator
import java.util.Iterator;
import java.util.NoSuchElementException;

public class FibonacciValueAtIndexUsingIterator {
    private int targetIndex;

    public FibonacciValueAtIndexUsingIterator(int targetIndex) {
        this.targetIndex = targetIndex;
    }

    public Iterator<Integer> createFibonacciIterator(int maxIndex) {
        return new Iterator<Integer>() {
            private int currentIndex = 0;
            private int firstValue = 0, secondValue = 1; 

            @Override
            public boolean hasNext() {
                return currentIndex <= maxIndex;
            }

            @Override
            public Integer next() {
                if (!hasNext()) {
                    throw new NoSuchElementException("No more Fibonacci numbers available.");
                }
                if (currentIndex == 0) {
                    currentIndex++;
                    return firstValue;
                } else if (currentIndex == 1) {
                    currentIndex++;
                    return secondValue;
                }
                int nextFibonacciValue = firstValue + secondValue;
                firstValue = secondValue;
                secondValue = nextFibonacciValue;
                currentIndex++;
                return nextFibonacciValue;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Remove operation is not supported.");
            }
        };
    }

    public int getFibonacciValueAtIndex(int index) {
        Iterator<Integer> fibonacciIterator = createFibonacciIterator(index);
        int fibonacciValue = 0;
        while (fibonacciIterator.hasNext()) {
            fibonacciValue = fibonacciIterator.next();
        }
        return fibonacciValue;
    }

    public int getFibonacciValueAtTargetIndex() {
        return getFibonacciValueAtIndex(targetIndex);
    }

    public int getFibonacciValueAtTargetIndexIteratively() {
        return getFibonacciValueAtIndex(targetIndex);
    }
}

