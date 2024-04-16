//  Write a Java program to find the maximum of three numbers.

import java.util.*;
public class Problem_4 {
    public static long MaxOfThreeNumbers(int num1, int num2, int num3)
    {
        if ( num1 > num2 && num1 > num3)
        {
            return num1;
        }
        else if ( num2 > num1 && num2 > num3)
        {
            return num2;
        }
        else if ( num3 > num1 && num3 > num2)
        {
            return num3;
        }
        else
        {
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the third number:");
        int num3 = sc.nextInt();
        long max = MaxOfThreeNumbers(num1, num2, num3);
        if (max == -1)
        {
            System.out.println("The numbers are equal. ");
        }
        else
        {
            System.out.println("The maximum value is " + max);
        }
        sc.close();
    }
}
