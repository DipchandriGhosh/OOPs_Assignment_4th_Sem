// Multiple inheritance does not support in java – justify.

// First parent class
class ParentA {
    void display() {
        System.out.println("Inside ParentA");
    }
}

// Second parent class
class ParentB {
    void display() {
        System.out.println("Inside ParentB");
    }
}

// Child class inheriting from both ParentA and ParentB
class Child extends ParentA { // Java doesn't allow multiple inheritance, but let's demonstrate the issue
    void display() {
        System.out.println("Inside Child");
    }
}

// Main class
public class Problem6 {
    public static void main(String[] args) {
        Child child = new Child();
        child.display(); // Which display method should be called? ParentA or ParentB?
    }
}
