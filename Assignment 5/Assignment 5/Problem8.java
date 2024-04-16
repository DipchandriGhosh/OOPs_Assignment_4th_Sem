// Implementation of dynamic method dispatch in java.

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
public class Problem8 {
    public static void main(String[] args) {
        // Create objects of Parent and Child classes
        Parent parentObj = new Parent();
        Child childObj = new Child();
        
        // Reference of Parent class pointing to Parent object
        Parent reference1 = parentObj;
        reference1.display(); // Output: Inside Parent class
        
        // Reference of Parent class pointing to Child object
        Parent reference2 = childObj;
        reference2.display(); // Output: Inside Child class
    }
}
