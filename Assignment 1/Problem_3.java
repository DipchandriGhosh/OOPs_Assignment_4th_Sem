//  Write a Java program to display whether a number is odd or even.

import java.util.*;
class CheckOddOrEven{
    public static void OddOrEven(int num)
    {
        if (num % 2 == 0)
        {
            System.out.println("The given number " + num + " is Even");
        }
        else
        {
            System.out.println("The given number " + num + " is Odd");
        }
    }
}
public class Problem_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        CheckOddOrEven.OddOrEven(num);
        sc.close();
    }
}
