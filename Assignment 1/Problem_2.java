// Write a Java program to calculate factorial value of a variable by taking input from command line.

import java.util.*;
class factorial{

    public static long calculateFactorial(int n){
        if(n<0)
        {
            System.out.println("Factorial is not defined for negative(ns)");
        }
        if (n == 0 || n == 1) {
            return 1;
        } else {
            // Recursive case: n! = n * (n-1)!
            return n * calculateFactorial(n - 1);
        }
    }
}
public class Problem_2
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        long fact = factorial.calculateFactorial(n);
        System.out.println("Factorial of " + n + " is: " + fact);
        sc.close();
    }
}
