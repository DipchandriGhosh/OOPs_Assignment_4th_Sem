//  Write a Java program to swap two numbers.

import java.util.*;
public class Problem_5 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int x = sc.nextInt();
        System.out.println("Enter the second number:");
        int y = sc.nextInt();
        System.out.println("The original values are : ");
        System.out.println("x = "+ x + " and " +  " y = "+ y);
        int z = x;
        x = y;
        y = z;
        System.out.println("\nAfter swapping, the values are : ");
        System.out.println("x = "+ x + " and " +  " y = "+ y);
        sc.close();
    }
}
