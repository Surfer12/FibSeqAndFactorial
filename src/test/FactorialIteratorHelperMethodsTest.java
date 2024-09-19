package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;
import Assignment.Factorial.FactorialClasses.FactorialIteratorHelperMethods;

public class FactorialIteratorHelperMethodsTest {

   @Test
   public void testFactorialUsingRecursion() {
      FactorialIteratorHelperMethods factorialHelper = new FactorialIteratorHelperMethods(5);
      assertEquals(120, factorialHelper.theFactorialOfTheNumberUsingRecursion());

      factorialHelper = new FactorialIteratorHelperMethods(0);
      assertEquals(1, factorialHelper.theFactorialOfTheNumberUsingRecursion());

      factorialHelper = new FactorialIteratorHelperMethods(1);
      assertEquals(1, factorialHelper.theFactorialOfTheNumberUsingRecursion());
   }

   @Test
   public void testFactorialUsingIterator() {
      FactorialIteratorHelperMethods factorialHelper = new FactorialIteratorHelperMethods(5);
      assertEquals(120, factorialHelper.theFactorialOfTheNumberUsingIterator());

      factorialHelper = new FactorialIteratorHelperMethods(0);
      assertEquals(1, factorialHelper.theFactorialOfTheNumberUsingIterator());

      factorialHelper = new FactorialIteratorHelperMethods(1);
      assertEquals(1, factorialHelper.theFactorialOfTheNumberUsingIterator());
   }

   @Test
   public void testHasNext() {
      FactorialIteratorHelperMethods factorialHelper = new FactorialIteratorHelperMethods(5);
      assertTrue(factorialHelper.hasNext());

      factorialHelper = new FactorialIteratorHelperMethods(1);
      assertTrue(factorialHelper.hasNext());

      factorialHelper = new FactorialIteratorHelperMethods(-1);
      assertFalse(factorialHelper.hasNext());
   }

   @Test
   public void testNext() {
      FactorialIteratorHelperMethods factorialHelper = new FactorialIteratorHelperMethods(3);
      assertEquals(3, factorialHelper.next());
      assertEquals(2, factorialHelper.next());
      assertEquals(1, factorialHelper.next());
      assertThrows(NoSuchElementException.class, () -> factorialHelper.next());
      assertThrows(NoSuchElementException.class, factorialHelper::next);
   }
}