/*  Write a Java program for following grading system.

    Note: Percentage>=90% : Grade A

    Percentage>=80%: Grade B

    Percentage>=70%: Grade C

    Percentage>=60% : Grade D

    Percentage>=40% : Grade E

    Percentage<40%: Grade F*/

import java.util.*;

public class Problem_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the percentage marks:");
        double percent = sc.nextDouble();
        if (percent >= 90)
        {
            System.out.println("Grade is A");
        }
        else if (percent >= 80)
        {
            System.out.println("Grade is B");
        }
        else if (percent >= 70)
        {
            System.out.println("Grade is C");
        }
        else if (percent >= 60)
        {
            System.out.println("Grade is D");
        }
        else if (percent >= 40)
        {
            System.out.println("Grade is E");
        }
        else
        {
            System.out.println("Grade is F");
        }
        sc.close();
    }
}
