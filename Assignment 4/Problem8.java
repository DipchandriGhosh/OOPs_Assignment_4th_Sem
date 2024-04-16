// Prove that this keyword refers to the current class instance variable.

public class Problem8 {
    private int number;

    public Problem8(int number) {
        // Using 'this' to refer to the current instance variable
        this.number = number;
    }

    public void displayNumber() {
        // Using 'this' to access the instance variable in a method
        System.out.println("Number: " + this.number);
    }

    public static void main(String[] args) {
        Problem8 obj1 = new Problem8(10);
        obj1.displayNumber(); // Output: Number: 10

        Problem8 obj2 = new Problem8(20);
        obj2.displayNumber(); // Output: Number: 20
    }
}
