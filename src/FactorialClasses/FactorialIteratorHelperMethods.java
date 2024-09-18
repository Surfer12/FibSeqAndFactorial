package FactorialClasses;

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
        if (!hasNext()) {
            throw new NoSuchElementException("No more elements available as number is less than or equal to zero");
        }
        return aBaseCasePlaceHolder * aNumberForFactorialCalculation--;
    }

    public int theFactorialOfTheNumberUsingRecursion() {
        return factorial(aNumberForFactorialCalculation); // Call helper method
    }

    private int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1); // Corrected recursion
    }

    public int theFactorialOfTheNumberUsingIterator() {
        aBaseCasePlaceHolder = 1; // Reset before calculation
        Iterator<Integer> iterator = new FactorialIteratorHelperMethods(aNumberForFactorialCalculation);
        while (iterator.hasNext()) {
            aBaseCasePlaceHolder *= iterator.next();
        }
        return aBaseCasePlaceHolder;
    }
}