//  Write a Java program to calculate Sum of two 2-Dimensional arrays.

import java.util.*;
public class Problem2 {
    public static void main(String[] args) 
    {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Get the dimensions of the arrays from the user
        System.out.println("Enter the number of rows of the arrays:");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns of the arrays:");
        int col = sc.nextInt();

        // Create the first 2D array
        int[][] arr1 = new int[row][col];
        System.out.println("Enter elements of First Array: ");
        fillArray(sc, arr1);

        // Create the second 2D array
        int[][] arr2 = new int[row][col];
        System.out.println("\n Enter elements of Second Array: \n");
        fillArray(sc, arr2);

        // Calculate the sum of the arrays
        int sum[][] = calculateSumOfArrays(arr1, arr2);

        // Display the result
        System.out.println("Sum of the arrays:");
        displayArray(sum);

        // Close the Scanner to prevent resource leak
        sc.close();
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

    // Function to calculate the sum of two 2D arrays
    public static int[][] calculateSumOfArrays(int[][] array1, int[][] array2) {
        int rows = array1.length;
        int columns = array1[0].length;
        int[][] sumArray = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sumArray[i][j] = array1[i][j] + array2[i][j];
            }
        }

        return sumArray;
    }

    // Function to display a 2D array
    public static void displayArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
