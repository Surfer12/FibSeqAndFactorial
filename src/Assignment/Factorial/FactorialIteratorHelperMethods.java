package Assignment.Factorial;

/* **Flowchart of the java code that impliements the iterator interface for factorial sequence.**
 */

import java.util.Iterator;
import java.util.NoSuchElementException;

public class FactorialIteratorHelperMethods implements Iterator<Integer> {
    private int aNumberForFactorialCalculation;
    private int aBaseCasePlaceHolder = 1;

    public FactorialIteratorHelperMethods(int aNumberForFactorialCalculation) {
        this.aNumberForFactorialCalculation = aNumberForFactorialCalculation;
    }

    @Override
    public boolean hasNext() {
        if (aNumberForFactorialCalculation <= 0) {
            return false;
        }
        return aNumberForFactorialCalculation >= aBaseCasePlaceHolder;
    }

    @Override
    public Integer next() {
        try {
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements available as number is less than or equal to zero");
            }
            return aBaseCasePlaceHolder * aNumberForFactorialCalculation--;
        } catch (NoSuchElementException e) {
            System.err.println(e.getMessage());
            return null; // or handle it in another appropriate way
        }
    }

    public int theFactorialOfTheNumberUsingRecursion() {
        try {
            return factorial(aNumberForFactorialCalculation); // Call helper method
        } catch (StackOverflowError e) {
            System.err.println("Stack overflow error occurred during recursion: " + e.getMessage());
            return -1; // or handle it in another appropriate way
        }
    }

    private int factorial(int n) {
        if (n == 0) {
            return 0;
        }
        return n * factorial(n - 1); // Corrected recursion
    }

    public int theFactorialOfTheNumberUsingIterator() {
        aBaseCasePlaceHolder = 1; // Reset before calculation
        try {
            Iterator<Integer> iterator = new FactorialIteratorHelperMethods(aNumberForFactorialCalculation);
            while (iterator.hasNext()) {
                aBaseCasePlaceHolder *= iterator.next();
            }
            return aBaseCasePlaceHolder;
        } catch (NoSuchElementException e) {
            System.err.println(e.getMessage());
            return -1; // or handle it in another appropriate way
        }
    }
}