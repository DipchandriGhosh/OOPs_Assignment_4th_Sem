// Write a java program to implement interface.

// Interface
interface Vehicle {
    // Abstract methods
    void start();
    void stop();
}

// Car class implementing the Vehicle interface
class Car implements Vehicle {
    // Implementing start method
    public void start() {
        System.out.println("Car started");
    }

    // Implementing stop method
    public void stop() {
        System.out.println("Car stopped");
    }
}

// Main class
public class Problem2 {
    public static void main(String[] args) {
        // Creating an object of Car
        Car car = new Car();

        // Calling start and stop methods of Car
        car.start();
        car.stop();
    }
}
