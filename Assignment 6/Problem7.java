// Write a java program to implement super() method without parameter.

// Parent class
class Parent {
    int x;

    // Constructor of Parent class
    Parent() {
        x = 10;
        System.out.println("Parent class constructor");
    }

    // Method in Parent class
    void display() {
        System.out.println("Parent's display method");
    }
}

// Child class inheriting from Parent class
class Child extends Parent {
    // Constructor of Child class
    Child() {
        // Calling the constructor of the superclass (Parent class)
        super();
        System.out.println("Child class constructor");
    }

    // Method in Child class
    void display() {
        System.out.println("Child's display method");
    }
}

// Main class
public class Problem7 {
    public static void main(String[] args) {
        Child child = new Child();
        
        // Call Child's display method
        child.display();
    }
}
