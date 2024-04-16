// Write a java program to implement the yield( ) method in thread programming.

// Runnable task
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread executing: " + i);
            // Yield control to other threads
            Thread.yield();
        }
    }
}

// Main class
public class Problem3{
    public static void main(String[] args) {
        // Create an object of the MyRunnable class
        MyRunnable myRunnable = new MyRunnable();

        // Create multiple threads using the MyRunnable object
        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);

        // Start the threads
        thread1.start();
        thread2.start();
    }
}
