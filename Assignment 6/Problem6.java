// Write a java program to implement super keyword in java.

// Parent class
class Parent {
    int x = 10;

    // Method in Parent class
    void display() {
        System.out.println("Parent's display method");
    }
}

// Child class inheriting from Parent class
class Child extends Parent {
    int x = 20;

    // Method in Child class
    void display() {
        System.out.println("Child's display method");
    }

    // Method using super keyword to access Parent class members
    void accessParentMembers() {
        // Accessing parent class variable using super keyword
        System.out.println("Value of parent class variable x: " + super.x);
        
        // Accessing parent class method using super keyword
        super.display();
    }
}

// Main class
public class Problem6 {
    public static void main(String[] args) {
        Child child = new Child();

        // Call Child's display method
        child.display();

        // Call accessParentMembers method which demonstrates the use of super keyword
        child.accessParentMembers();
    }
}
