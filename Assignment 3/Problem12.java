// Write a Java program to calculate sum of natural numbers upto a certain range.

import java.util.*;
public class Problem12 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range limit: ");
        int n = sc.nextInt();
        if (n <= 0){
            System.out.println("Invalid input");
        }
        else{
            int sum = ((n * (n + 1)) / 2);
            System.out.println("The sum of natural numbers from 1 to " + n + " is " + sum);
        }
        sc.close();
    }
}
