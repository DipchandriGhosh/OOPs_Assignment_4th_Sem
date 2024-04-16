// Implementation of this keyword to pass as an argument in the method.

public class Problem_5 {
    private int number;

    public Problem_5(int number) {
        this.number = number;
    }

    public void displayNumber() {
        System.out.println("Number: " + this.number);
    }

    // Method that takes an object of Pr as an argument and modifies its number
    public void modifyNumber() {
        this.number *= 2; // Doubling the number of the current object
    }

    public static void main(String[] args) {
        Problem_5 obj1 = new Problem_5(10);
        obj1.displayNumber(); // Output: Number: 10

        // Calling modifyNumber on obj1, passing 'this' implicitly
        obj1.modifyNumber();

        obj1.displayNumber(); // Output: Number: 20
    }
}

