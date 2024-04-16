/*      Create a general class ThreeDObject and derive the classes Box, Cube, Cylinder
    and Cone from it. The class ThreeDObject has methods wholeSurfaceArea ( ) and
volume ( ). Override these two methods in each of the derived classes to calculate
the volume and whole surface area of each type of three-dimensional objects. The
dimensions of the objects are to be taken from the users and passed through the
respective constructors of each derived class. Write a Problem10 method to test these
classes.    */

import java.util.Scanner;

class ThreeDObject {
    public double wholeSurfaceArea() {
        return 0;
    }

    public double volume() {
        return 0;
    }
}

class Box extends ThreeDObject {
    private double length, width, height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double wholeSurfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }

    @Override
    public double volume() {
        return length * width * height;
    }
}

class Cylinder extends ThreeDObject {
    private double radius, height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double wholeSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

public class Problem10 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter dimensions of Box (length, width, height):");
        Box box = new Box(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
        System.out.println("Volume of Box: " + box.volume());
        System.out.println("Whole Surface Area of Box: " + box.wholeSurfaceArea());

        System.out.println("\nEnter dimensions of Cylinder (radius, height):");
        Cylinder cylinder = new Cylinder(scanner.nextDouble(), scanner.nextDouble());
        System.out.println("Volume of Cylinder: " + cylinder.volume());
        System.out.println("Whole Surface Area of Cylinder: " + cylinder.wholeSurfaceArea());

        scanner.close();
    }
}
