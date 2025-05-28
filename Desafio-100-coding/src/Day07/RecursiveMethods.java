package Day07;

public class RecursiveMethods {

    // Non-Recursive Method
    public static int CalculateFactorial(int number){
        int factorial = 1;
        for (int i = number; i > 1; i--) {
            factorial *= i;
        }
        return factorial;
    }

    // Recursive Method
    public static int Fatorial(int number){
        if (number == 0) {
            return 1;
        }
        return number * Fatorial(number - 1);
    }

    //chalenges

    //nth term of the Fibonacci sequence
    //Recursive:
    //The recursive method calls itself to calculate the terms.
    // Although it is easy to implement, it can become slow for larger values
    // of n due to the repetition of calculations.
    public static int nthTermFibonacci(int n){
        if (n < 2){
            return n;
        }
        return nthTermFibonacci(n-1) + nthTermFibonacci(n-2);
    }

    // recursive method that calculates the sum of numbers from 1 to N:
    public static int calculateNumbersN(int n){
        if (n <= 0) {
            throw new IllegalArgumentException("n must be a positive integer");
        }

        if (n == 1) {
            return 1;
        }
        return n + calculateNumbersN(n-1);
    }

    // method extra
    public static void applyPoison(int life, int damagePerTurn, int remaningShifts) {
        if ( remaningShifts == 0 || life <= 0) {
            System.out.println("The poison's effect has worn off. Final Life: " + Math.max(life, 0));
            return;
        }
        life -= damagePerTurn;
        System.out.println("Turn " + remaningShifts + " remaining life:" + Math.max(life, 0));

        applyPoison(life, damagePerTurn, remaningShifts - 1);
    }
}
