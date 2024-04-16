// Write a java program to implement multiple inheritance using interface.

// Interface for one functionality
interface Parent1 {
    void method1();
}

// Interface for another functionality
interface Parent2 {
    void method2();
}

// Interface inheriting from both Parent1 and Parent2
interface Child extends Parent1, Parent2 {
    void method3();
}

// Class implementing Child interface
class MyClass implements Child {
    // Implementation of method1 from Parent1
    public void method1() {
        System.out.println("Method 1");
    }

    // Implementation of method2 from Parent2
    public void method2() {
        System.out.println("Method 2");
    }

    // Implementation of method3 from Child
    public void method3() {
        System.out.println("Method 3");
    }
}

// Main class
public class Problem5 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        // Calling methods
        obj.method1();
        obj.method2();
        obj.method3();
    }
}
