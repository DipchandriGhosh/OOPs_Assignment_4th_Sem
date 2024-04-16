// Write a java program to implement the throws keyword.

import java.io.FileNotFoundException;

public class Problem7 {
    // Method that throws a checked exception
    public static void readFile() throws FileNotFoundException {
        // Simulating a file reading operation
        // We're throwing FileNotFoundException for demonstration
        throw new FileNotFoundException("File not found");
    }

    public static void main(String[] args) {
        try {
            // Call readFile method which may throw FileNotFoundException
            readFile();
        } catch (FileNotFoundException e) {
            // Catch the FileNotFoundException thrown by readFile method
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
