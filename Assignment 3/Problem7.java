// Write a java program to reverse a number.

import java.util.*;
public class Problem7 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int rev = 0;
        while (num != 0)
        {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        System.out.println("Reversed Number is : " + rev);
        sc.close();
    }
}