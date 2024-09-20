package Assignment.Factorial.FactorialClasses;

public class FactorialIterationMethods {
    private int inputNumber;

    public FactorialIterationMethods(int inputNumber) {
        this.inputNumber = inputNumber;
    }

    public int getInputNumber() {
        return inputNumber;
    }

    public void setInputNumber(int inputNumber) {
        this.inputNumber = inputNumber;
    }

    public int computeFactorial() {
        return computeFactorialIteratively(inputNumber);
    }

    private int computeFactorialIteratively(int number) {
        int factorialResult = 1;
        for (int currentMultiplier = 1; currentMultiplier <= number; currentMultiplier++) {
            factorialResult *= currentMultiplier;
        }
        return factorialResult;
    }
}

