// Write a java program to create Thread by implementing the Runnable interface

// Runnable task
class MyRunnable implements Runnable {
    public void run() {
        // Task to be executed by the thread
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread executing: " + i);
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

// Main class
public class Problem2 {
    public static void main(String[] args) {
        // Create an object of the MyRunnable class
        MyRunnable myRunnable = new MyRunnable();

        // Create a thread using the MyRunnable object
        Thread thread = new Thread(myRunnable);

        // Start the thread
        thread.start();

        // Main thread continues execution
        for (int i = 0; i < 3; i++) {
            System.out.println("Main thread executing: " + i);
            try {
                Thread.sleep(1500); // Pause for 1.5 seconds
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted.");
            }
        }
    }
}
