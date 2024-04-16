// Write a java program to implement the sleep(n) method in thread programming.

// Runnable task
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                // Pause execution for 1 second (1000 milliseconds)
                Thread.sleep(1000);
                System.out.println("Thread executing: " + i);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

// Main class
public class Problem4 {
    public static void main(String[] args) {
        // Create an object of the MyRunnable class
        MyRunnable myRunnable = new MyRunnable();

        // Create a thread using the MyRunnable object
        Thread thread = new Thread(myRunnable);

        // Start the thread
        thread.start();
    }
}
