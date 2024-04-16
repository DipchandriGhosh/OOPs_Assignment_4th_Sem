// Write a java program to implement the static method in java

public class Problem2 {
    // Static method to find the maximum of two numbers
    static int findMax(int num1, int num2) {
        return num1 > num2 ? num1 : num2;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        // Call the static method directly using the class name
        int max = Problem2.findMax(a, b);
        System.out.println("Maximum of " + a + " and " + b + " is: " + max);
    }
}
