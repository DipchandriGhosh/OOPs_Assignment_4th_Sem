// Write a java program to implement the multilevel inheritance in java.\

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

// GrandChild class inheriting from Child class
class GrandChild extends Child {
    void displayGrandChild() {
        System.out.println("Inside GrandChild class");
    }
}

// Main class
public class Problem5{
    public static void main(String[] args) {
        // Create an object of GrandChild class
        GrandChild grandChildObj = new GrandChild();

        // Call methods of Parent, Child, and GrandChild classes
        grandChildObj.displayParent();    // Output: Inside Parent class
        grandChildObj.displayChild();     // Output: Inside Child class
        grandChildObj.displayGrandChild();// Output: Inside GrandChild class
    }
}
