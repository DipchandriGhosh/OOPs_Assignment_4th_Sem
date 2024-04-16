//  Write a Java program to find the sum of even integers in an array.

import java.util.*;
public class Problem1 {
    public static int SumofEvenIntegers(int[] arr)
    {
        int sum = 0;
        for( int num : arr)
        {
            if (num % 2 ==0)
            {
                sum += num;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements:\n ");
        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int sum = SumofEvenIntegers(arr);
        System.out.println("\nSum of Even Integers is " +sum);
        sc.close();
    }
}
