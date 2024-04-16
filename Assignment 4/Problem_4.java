// Implementation of this keyword to invoke current class constructor.

public class Problem_4 {
    private int number;
    private String message;

    // Constructor with one parameter
    public Problem_4(int number) {
        this(number, "Default Message");
    }

    // Constructor with two parameters
    public Problem_4(int number, String message) {
        this.number = number;
        this.message = message;
    }

    // Method to display number and message
    public void displayInfo() {
        System.out.println("Number: " + number);
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        Problem_4 obj1 = new Problem_4(10);
        obj1.displayInfo(); // Output: Number: 10, Message: Default Message

        Problem_4 obj2 = new Problem_4(20, "Custom Message");
        obj2.displayInfo(); // Output: Number: 20, Message: Custom Message
    }
}
