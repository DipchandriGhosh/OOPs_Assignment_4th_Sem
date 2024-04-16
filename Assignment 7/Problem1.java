// Implementation of final keyword before a variable.

public class Problem1 {
    public static void main(String[] args) {
        final int NUM = 10; // Declare a final variable NUM and initialize it to 10
        // NUM = 20; // Error: Cannot assign a value to a final variable
        
        System.out.println("Value of NUM: " + NUM);
    }
}
