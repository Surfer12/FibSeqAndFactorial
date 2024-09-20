package test;

import org.junit.jupiter.api.Test;

import Assignment.Factorial.FactorialClasses.FactorialIterationMethods;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialIterationMethodstest {

   @Test
   public void testFactorialOfZero() {
      FactorialIterationMethods calculator = new FactorialIterationMethods(0);
      assertEquals(1, calculator.computeFactorial(), "Factorial of 0 should be 1");
   }

   @Test
   public void testFactorialOfOne() {
      FactorialIterationMethods calculator = new FactorialIterationMethods(1);
      assertEquals(1, calculator.computeFactorial(), "Factorial of 1 should be 1");
   }

   @Test
   public void testFactorialOfFive() {
      FactorialIterationMethods calculator = new FactorialIterationMethods(5);
      assertEquals(120, calculator.computeFactorial(), "Factorial of 5 should be 120");
   }

   @Test
   public void testFactorialOfTen() {
      FactorialIterationMethods calculator = new FactorialIterationMethods(10);
      assertEquals(3628800, calculator.computeFactorial(), "Factorial of 10 should be 3628800");
   }

   @Test
   public void testSetInputNumber() {
      FactorialIterationMethods calculator = new FactorialIterationMethods(5);
      calculator.setInputNumber(3);
      assertEquals(3, calculator.getInputNumber(), "Input number should be updated to 3");
      assertEquals(6, calculator.computeFactorial(), "Factorial of 3 should be 6");
   }
}