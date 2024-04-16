// Implementation of final keyword before a method.

class Parent {
    public final void finalMethod() {
        System.out.println("Final method in Parent class");
    }
}

class Child extends Parent {}

public class Problem2 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.finalMethod(); // Output: Final method in Parent class
        
        Child child = new Child();
        child.finalMethod(); // Output: Final method in Parent class
    }
}
