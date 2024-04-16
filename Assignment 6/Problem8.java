// Write a java program to implement super() method with parameter.

// Parent class
class Parent {
    private int number;

    // Constructor with parameter
    public Parent(int number) {
        this.number = number;
        System.out.println("Inside Parent constructor");
    }

    // Method to display the value of the number
    public void displayNumber() {
        System.out.println("Number in Parent class: " + number);
    }
}

// Child class inheriting from Parent
class Child extends Parent {
    private int childNumber;

    // Constructor with parameters
    public Child(int number, int childNumber) {
        super(number); // Calling the parameterized constructor of the parent class
        this.childNumber = childNumber;
        System.out.println("Inside Child constructor");
    }

    // Method to display the value of the childNumber
    public void displayChildNumber() {
        System.out.println("Number in Child class: " + childNumber);
    }
}

// Main class
public class Problem8 {
    public static void main(String[] args) {
        // Create an object of the Child class
        Child childObj = new Child(10, 20);

        // Call methods of both Parent and Child classes
        childObj.displayNumber();      // Output: Number in Parent class: 10
        childObj.displayChildNumber(); // Output: Number in Child class: 20
    }
}
