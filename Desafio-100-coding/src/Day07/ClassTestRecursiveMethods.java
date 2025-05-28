package Day07;

public class ClassTestRecursiveMethods {
    public static void main(String[] args) {

        int resultNotRecursive = RecursiveMethods.CalculateFactorial(5);
        System.out.println(resultNotRecursive);
        int resultRecursive = RecursiveMethods.Fatorial(5);
        System.out.println(resultRecursive);
        int resultnthTermFibonacci = RecursiveMethods.nthTermFibonacci(25);
        System.out.println(resultnthTermFibonacci);
        int ResultSumNumber1ToN = RecursiveMethods.calculateNumbersN(25);
        System.out.println(ResultSumNumber1ToN);

        //extra
        RecursiveMethods.applyPoison(100,12,5);
    }
}
