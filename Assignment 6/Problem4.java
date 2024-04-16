// Write a java program to implement the inheritance in interface.

// Base interface
interface Animal {
    void eat();
    void sleep();
}

// Derived interface inheriting from Animal
interface Dog extends Animal {
    void bark();
}

// Dog implementation class
class Labrador implements Dog {
    public void eat() {
        System.out.println("Labrador is eating");
    }

    public void sleep() {
        System.out.println("Labrador is sleeping");
    }

    public void bark() {
        System.out.println("Labrador is barking");
    }
}

// Main class
public class Problem4 {
    public static void main(String[] args) {
        Labrador dog = new Labrador();
        
        // Calling methods
        dog.eat();
        dog.sleep();
        dog.bark();
    }
}
