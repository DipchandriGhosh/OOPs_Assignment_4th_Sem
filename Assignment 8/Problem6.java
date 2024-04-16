// Write a java program to implement the throw keyword.

public class Problem6 {
    // Method to check if a given age is valid
    public static void checkAge(int age) {
        if (age < 0) {
            // Throw an IllegalArgumentException if age is negative
            throw new IllegalArgumentException("Age cannot be negative");
        }
        System.out.println("Age is valid: " + age);
    }

    public static void main(String[] args) {
        try {
            // Call checkAge method with a negative age
            checkAge(-5);
        } catch (IllegalArgumentException e) {
            // Catch the IllegalArgumentException thrown by checkAge method
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
