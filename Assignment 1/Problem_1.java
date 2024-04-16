// Write a Java program to calculate factorial value of a declared variable creating seperate class and method for factorial segment.


class factorial{

    public static long calculateFactorial(int n){
        if(n<0)
        {
            System.out.println("Factorial is not defined for negative(ns)");
        }
        if (n == 0 || n == 1) {
            return n;
        } else {
            // Recursive case: n! = n * (n-1)!
            return n * calculateFactorial(n - 1);
        }
    }
}
public class Problem_1
{
    public static void main(String[] args) {
        int n = 5;
        long fact = factorial.calculateFactorial(n);
        System.out.println("Factorial of " + n + " is: " + fact);
    }
}
