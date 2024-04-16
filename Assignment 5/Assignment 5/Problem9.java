// Write a java program to stop method overriding.

// Parent class
class Parent {
    // Final method to display a message
    final void display() {
        System.out.println("Inside Parent class");
    }
}

// Child class inheriting from Parent
class Child extends Parent {
    // This will result in a compilation error as display method in Parent is final
    // @Override
    // void display() {
    //     System.out.println("Inside Child class");
    // }
}

// Main class
public class Problem9 {
    public static void main(String[] args) {
        // Create object of Parent class
        Parent parentObj = new Parent();
        
        // Call display method of Parent class
        parentObj.display(); // Output: Inside Parent class
    }
}
