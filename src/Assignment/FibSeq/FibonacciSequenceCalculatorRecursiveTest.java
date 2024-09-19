import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

package Assignment.FibSeq;

public class FibonacciSequenceCalculatorRecursiveTest {

   @Test
   public void testCalculateFibonacciValueAt() {
      FibonacciSequenceCalculatorRecursive fibCalc = new FibonacciSequenceCalculatorRecursive(0);
      assertEquals(0, fibCalc.calculateFibonacciValueAt(0), "Fibonacci of 0 should be 0");
      assertEquals(1, fibCalc.calculateFibonacciValueAt(1), "Fibonacci of 1 should be 1");
      assertEquals(1, fibCalc.calculateFibonacciValueAt(2), "Fibonacci of 2 should be 1");
      assertEquals(2, fibCalc.calculateFibonacciValueAt(3), "Fibonacci of 3 should be 2");
      assertEquals(3, fibCalc.calculateFibonacciValueAt(4), "Fibonacci of 4 should be 3");
      assertEquals(5, fibCalc.calculateFibonacciValueAt(5), "Fibonacci of 5 should be 5");
      assertEquals(8, fibCalc.calculateFibonacciValueAt(6), "Fibonacci of 6 should be 8");
      assertEquals(13, fibCalc.calculateFibonacciValueAt(7), "Fibonacci of 7 should be 13");
      assertEquals(21, fibCalc.calculateFibonacciValueAt(8), "Fibonacci of 8 should be 21");
      assertEquals(34, fibCalc.calculateFibonacciValueAt(9), "Fibonacci of 9 should be 34");
      assertEquals(55, fibCalc.calculateFibonacciValueAt(10), "Fibonacci of 10 should be 55");
   }

   @Test
   public void testGetFibonacciValueAtSpecifiedIndex() {
      FibonacciSequenceCalculatorRecursive fibCalc = new FibonacciSequenceCalculatorRecursive(10);
      assertEquals(55, fibCalc.getFibonacciValueAtSpecifiedIndex(), "Fibonacci of 10 should be 55");

      fibCalc = new FibonacciSequenceCalculatorRecursive(5);
      assertEquals(5, fibCalc.getFibonacciValueAtSpecifiedIndex(), "Fibonacci of 5 should be 5");

      fibCalc = new FibonacciSequenceCalculatorRecursive(7);
      assertEquals(13, fibCalc.getFibonacciValueAtSpecifiedIndex(), "Fibonacci of 7 should be 13");
   }
}