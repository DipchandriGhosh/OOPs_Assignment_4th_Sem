// Abstract class
abstract class Shape {
    // Abstract method (does not have a body)
    public abstract void draw();
}

// Rectangle class (inherits from Shape)
class Rectangle extends Shape {
    // Implementation of draw method
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

// Circle class (inherits from Shape)
class Circle extends Shape {
    // Implementation of draw method
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

// Main class
public class Problem1 {
    public static void main(String[] args) {
        // Creating objects of Rectangle and Circle
        Shape rectangle = new Rectangle();
        Shape circle = new Circle();

        // Calling draw method of Rectangle
        rectangle.draw();

        // Calling draw method of Circle
        circle.draw();
    }
}
