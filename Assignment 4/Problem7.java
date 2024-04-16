// Implement - this keyword can be used to return current class instance.

public class Problem7 {
    private int number;
    private String message;

    public Problem7(int number, String message) {
        this.number = number;
        this.message = message;
    }

    // Method chaining to set the number and return current instance
    public Problem7 setNumber(int number) {
        this.number = number;
        return this;
    }

    // Method chaining to set the message and return current instance
    public Problem7 setMessage(String message) {
        this.message = message;
        return this;
    }

    // Method to display number and message
    public void displayInfo() {
        System.out.println("Number: " + number);
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        Problem7 obj = new Problem7(10, "Initial Message");
        obj.displayInfo(); // Output: Number: 10, Message: Initial Message

        // Method chaining to set values and display
        obj.setNumber(20).setMessage("Updated Message").displayInfo();
        // Output: Number: 20, Message: Updated Message
    }
}

