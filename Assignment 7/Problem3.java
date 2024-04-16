// Implementation of final keyword before a class


// Define a final class
final class FinalClass {
    // Class members and methods
    public void display() {
        System.out.println("This is a final class");
    }
}

// Attempting to create a subclass of FinalClass will result in a compilation error
// class SubClass extends FinalClass {}

public class Problem3 {
    public static void main(String[] args) {
        // Create an instance of FinalClass
        FinalClass finalObj = new FinalClass();
        // Call the display method
        finalObj.display(); // Output: This is a final class
    }
}
