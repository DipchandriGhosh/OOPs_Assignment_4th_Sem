//  Write a Java program to find the sum of diagonal elements in a 2D array.

import java.util.*;

public class Problem3 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Get the dimensions of the array from the user
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();

        // Create the 2D array
        int[][] array = new int[rows][columns];
        System.out.println("Enter the elements for the array:");
        fillArray(sc, array);

        // Close the Scanner to prevent resource leak
        sc.close();

        // Calculate the sum of diagonal elements
        int diagonalSum = calculateDiagonalSum(array);

        // Display the result
        System.out.println("Sum of diagonal elements: " + diagonalSum);
    }

    // Function to fill a 2D array with user input
    public static void fillArray(Scanner sc, int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print("Element at position (" + (i + 1) + "," + (j + 1) + "): ");
                array[i][j] = sc.nextInt();
            }
        }
    }

    // Function to calculate the sum of diagonal elements in a 2D array
    public static int calculateDiagonalSum(int[][] array) {
        int sum = 0;

        // Check if the array is a square matrix (rows == columns)
        if (array.length != array[0].length) {
            System.out.println("The array is not a square matrix.");
            return 0;
        }

        for (int i = 0; i < array.length; i++) {
            sum += array[i][i]; // Add the diagonal element at position (i, i)
        }

        return sum;
    }
}

