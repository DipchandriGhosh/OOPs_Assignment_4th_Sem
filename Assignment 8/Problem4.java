// Write a java program to implement Java Multi catch block
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int num = Integer.parseInt(scanner.nextLine());
            int result = 100 / num;
            int[] arr = new int[5];
            arr[num] = 10; // Accessing array index based on user input
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            // Handling both ArithmeticException and ArrayIndexOutOfBoundsException together
            System.out.println("Exception caught: " + e);
        } catch (NumberFormatException e) {
            // Handling NumberFormatException separately
            System.out.println("Invalid input: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
