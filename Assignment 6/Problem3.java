// Write a java program to implement multi level inheritance with the help of interface.

// Interface for Vehicle
interface Vehicle {
    void start();
    void stop();
}

// Interface for FourWheeler
interface FourWheeler extends Vehicle {
    void drive();
}

// Car class implementing FourWheeler interface
class Car implements FourWheeler {
    public void start() {
        System.out.println("Car started");
    }

    public void stop() {
        System.out.println("Car stopped");
    }

    public void drive() {
        System.out.println("Car is being driven");
    }
}

// Main class
public class Problem3 {
    public static void main(String[] args) {
        // Create an object of Car
        Car car = new Car();

        // Call methods
        car.start();
        car.drive();
        car.stop();
    }
}
