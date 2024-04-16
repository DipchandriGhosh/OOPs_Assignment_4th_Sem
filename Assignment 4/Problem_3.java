// Implementation of this keyword to invoke current class method.

public class Problem_3 {
    private int number;

    // Constructor
    public Problem_3(int number) {
        this.number = number;
    }

    // Method to set the number
    public void setNumber(int number) {
        this.number = number;
    }

    // Method to display the number
    public void displayNumber() {
        System.out.println("Number: " + getNumber());
    }

    // Getter method for number
    public int getNumber() {
        return this.number;
    }

    public static void main(String[] args) {
        Problem_3 obj = new Problem_3(10);
        obj.displayNumber(); // Output: Number: 10
    }
}
