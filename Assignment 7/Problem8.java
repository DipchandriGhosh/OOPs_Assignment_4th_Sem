// Write a java program to observe the utility of public access specifier.


// Class with public access specifier
public class Problem8 {
    // Public method
    public void publicMethod() {
        System.out.println("This is a public method.");
    }

    // Main method
    public static void main(String[] args) {
        // Creating an object of Problem8 class
        Problem8 obj = new Problem8();

        // Accessing the public method
        obj.publicMethod(); // Output: This is a public method.
    }
}

// Another class in the same package
class AnotherClass {
    // Main method
    public static void main(String[] args) {
        // Creating an object of Problem8 class
        Problem8 obj = new Problem8();

        // Accessing the public method
        obj.publicMethod(); // Output: This is a public method.
    }
}
