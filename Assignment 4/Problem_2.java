// Write a java program to implement of constructor overloading.

class Box {
    double width, height, depth;

    // Default constructor
    Box() {
        width = height = depth = 1;
    }

    // Constructor with parameters
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }
}

public class Problem_2 {
    public static void main(String[] args) {
        Box box1 = new Box();                   // Default constructor
        Box box2 = new Box(5, 5, 5);            // Constructor with parameters

        System.out.println("Volume of box1: " + box1.volume());
        System.out.println("Volume of box2: " + box2.volume());
    }
}
