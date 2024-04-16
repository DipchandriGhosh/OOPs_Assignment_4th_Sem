// Implementation of method overriding in java

// Parent class
class Parent {
    // Method to display a message
    void display() {
        System.out.println("Inside Parent class");
    }
}

// Child class inheriting from Parent
class Child extends Parent {
    // Override the display method of the Parent class
    @Override
    void display() {
        System.out.println("Inside Child class");
    }
}

// Main class
public class Problem7 {
    public static void main(String[] args) {
        // Create objects of Parent and Child classes
        Parent parentObj = new Parent();
        Child childObj = new Child();
        
        // Call display method of Parent class
        parentObj.display(); // Output: Inside Parent class
        
        // Call display method of Child class
        childObj.display(); // Output: Inside Child class
    }
}
