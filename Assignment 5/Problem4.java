// Write a java program to implement the hierarchical inheritance in java.

// Parent class
class Parent {
    void displayParent() {
        System.out.println("Inside Parent class");
    }
}

// Child1 class inheriting from Parent class
class Child1 extends Parent {
    void displayChild1() {
        System.out.println("Inside Child1 class");
    }
}

// Child2 class inheriting from Parent class
class Child2 extends Parent {
    void displayChild2() {
        System.out.println("Inside Child2 class");
    }
}

// Main class
public class Problem4 {
    public static void main(String[] args) {
        // Create objects of Child1 and Child2 classes
        Child1 child1Obj = new Child1();
        Child2 child2Obj = new Child2();

        // Call methods of Parent, Child1, and Child2 classes
        child1Obj.displayParent(); // Output: Inside Parent class
        child1Obj.displayChild1(); // Output: Inside Child1 class

        child2Obj.displayParent(); // Output: Inside Parent class
        child2Obj.displayChild2(); // Output: Inside Child2 class
    }
}
