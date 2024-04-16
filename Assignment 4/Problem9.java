// Implementation of this keyword as local variable suppressor.

public class Problem9 {
    private int number;

    public Problem9(int number) {
        // Using 'this' to refer to the instance variable
        this.number = number;
    }

    public void displayNumber(int number) {
        // Using 'this' to distinguish between instance variable and local variable
        System.out.println("Instance variable (this.number): " + this.number);
        System.out.println("Local variable (number): " + number);
    }

    public static void main(String[] args) {
        Problem9 obj = new Problem9(10);
        obj.displayNumber(20);
    }
}
