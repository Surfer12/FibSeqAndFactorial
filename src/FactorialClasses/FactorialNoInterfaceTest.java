package FactorialClasses;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class FactorialNoInterfaceTest {

   @Test
   public void testCalculateFactorial() {
      FactorialNoInterface factorial = new FactorialNoInterface(5);
      assertEquals(120, factorial.calculateFactorial(), "Factorial of 5 should be 120");

      factorial.setNumber(0);
      assertEquals(1, factorial.calculateFactorial(), "Factorial of 0 should be 1");

      factorial.setNumber(1);
      assertEquals(1, factorial.calculateFactorial(), "Factorial of 1 should be 1");

      factorial.setNumber(3);
      assertEquals(6, factorial.calculateFactorial(), "Factorial of 3 should be 6");
   }

   @Test
   public void testGetNumber() {
      FactorialNoInterface factorial = new FactorialNoInterface(5);
      assertEquals(5, factorial.getNumber(), "Number should be 5");
   }

   @Test
   public void testSetNumber() {
      FactorialNoInterface factorial = new FactorialNoInterface(5);
      factorial.setNumber(10);
      assertEquals(10, factorial.getNumber(), "Number should be 10");
   }
}