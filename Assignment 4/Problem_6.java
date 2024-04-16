// Implementation of this keyword to pass as argument in the constructor call.

public class Problem_6 {
    private int number;
    private String message;

    public Problem_6(int number) {
        this(number, "Default Message");
    }

    public Problem_6(int number, String message) {
        this.number = number;
        this.message = message;
    }

    public void displayInfo() {
        System.out.println("Number: " + number);
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        Problem_6 obj1 = new Problem_6(10);
        obj1.displayInfo(); // Output: Number: 10, Message: Default Message

        Problem_6 obj2 = new Problem_6(20, "Custom Message");
        obj2.displayInfo(); // Output: Number: 20, Message: Custom Message
    }
}
