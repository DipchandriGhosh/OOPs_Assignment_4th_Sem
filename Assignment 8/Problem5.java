// Write a java program to implement Java Nested try statement

public class Problem5 {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try block starts");

            try {
                System.out.println("Inner try block starts");
                int result = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException caught: " + e.getMessage());
            }

            int[] arr = {1, 2, 3};
            System.out.println("Value at index 3: " + arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }

        System.out.println("Program continues");
    }
}
