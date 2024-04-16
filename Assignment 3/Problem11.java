// Write a Java program to check whether a number is Armstrong Number or not.

import java.util.*;

public class Problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int sum = 0;
        int n = num;
        while (n != 0) {
            int r = n % 10;
            sum +=(int) Math.pow(r, 3);
            n /= 10;
        }
        if (sum == num) {
            System.out.println(num + " is an Armstrong number");
        }
        else {
            System.out.println(num + " is not an Armstrong number");
        }
        sc.close();
    }
}
