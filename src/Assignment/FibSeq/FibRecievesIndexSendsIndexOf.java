package Assignment.FibSeq;
/* **Get position n from the user**
**Calculate the nth number in the fibonacci sequence**
**Display the result**

**Use iterator and recursive method and compare and contrast.**
 */

public class FibRecievesIndexSendsIndexOf {
    private int aIndex;

    public FibRecievesIndexSendsIndexOf(int aIndex) {
        this.aIndex = aIndex;
    }

    public int fibonacciSequenceValueAt(int index) {
        if (index <= 1) {
            return index;
        }
        return fibonacciSequenceValueAt(index - 1) + fibonacciSequenceValueAt(index - 2);
    }

    public int getIndexValueInFibonacci() {
        return fibonacciSequenceValueAt(aIndex);
    }
}
