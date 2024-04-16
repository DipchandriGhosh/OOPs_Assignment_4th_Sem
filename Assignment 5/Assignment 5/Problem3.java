// Write a java program to implement the single inheritance in java

// Parent class
class Parent {
    void displayParent() {
        System.out.println("Inside Parent class");
    }
}

// Child class inheriting from Parent class
class Child extends Parent {
    void displayChild() {
        System.out.println("Inside Child class");
    }
}

// Main class
public class Problem3 {
    public static void main(String[] args) {
        // Create an object of Child class
        Child childObj = new Child();

        // Call methods of both Parent and Child classes
        childObj.displayParent(); // Output: Inside Parent class
        childObj.displayChild();  // Output: Inside Child class
    }
}
