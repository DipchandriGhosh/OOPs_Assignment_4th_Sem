//  Write a Java program to check whether a year is a leap year or not.

import java.util.*;
public class Problem_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int yr = sc.nextInt();

        boolean IsLeapYear = false;
        if ((yr % 4 == 0 && yr % 100 != 0) || (yr % 400 == 0))
        {
            IsLeapYear = true;
        }
        if (IsLeapYear)
        {
            System.out.println(yr + " is a Leap Year");
        }
        else
        {
            System.out.println(yr + " is not a Leap Year");
        }
        sc.close();
    }
}
