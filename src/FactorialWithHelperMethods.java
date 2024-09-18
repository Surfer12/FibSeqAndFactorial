package test;

public class FactorialWithHelperMethods {
   private int number;

   // Constructor to initialize the number
   public FactorialWithHelperMethods(int number) {
      this.number = number;
   }

   // Getter method for number
   public int getNumber() {
      return number;
   }

   // Setter method for number
   public void setNumber(int number) {
      this.number = number;
   }

   // Public method to calculate factorial
   public int calculateFactorial() {
      return factorial(number); // Call the helper method
   }

   // Private helper method to perform the factorial calculation
   private int factorial(int n) {
      int result = 1; // Initialize initial value to 1
      for (int i = 1; i <= n; i++) { // Loop from 1 to n
         result *= i; // Multiply result by i to calculate the factorial
      }
      return result; // Return the factorial
   }
}
