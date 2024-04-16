// Write a java program to implement the suspend( ) & resume( ) method in thread programming.

// Runnable task
class MyRunnable implements Runnable {
    private volatile boolean suspended = false;

    // Method to suspend the thread
    public void suspendThread() {
        suspended = true;
    }

    // Method to resume the thread
    public void resumeThread() {
        suspended = false;
        synchronized (this) {
            notify();
        }
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("Thread executing: " + i);
                Thread.sleep(1000);

                // Check if the thread is suspended
                synchronized (this) {
                    while (suspended) {
                        wait(); // Wait until resumed
                    }
                }
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

// Main class
public class Problem5 {
    public static void main(String[] args) {
        // Create an object of the MyRunnable class
        MyRunnable myRunnable = new MyRunnable();

        // Create a thread using the MyRunnable object
        Thread thread = new Thread(myRunnable);

        // Start the thread
        thread.start();

        // Suspend the thread after 3 seconds
        try {
            Thread.sleep(3000);
            myRunnable.suspendThread();
            System.out.println("Thread suspended.");
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        // Resume the thread after 3 seconds
        try {
            Thread.sleep(3000);
            myRunnable.resumeThread();
            System.out.println("Thread resumed.");
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
    }
}
