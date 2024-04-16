// Write a Java Program to Check a Thread is Alive or Not.

public class Problem9 {
    public static void main(String[] args) {
        // Create a thread
        Thread thread = new Thread(() -> {
            // Perform some task
            try {
                Thread.sleep(2000); // Simulate some task execution time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start the thread
        thread.start();

        // Check if the thread is alive
        if (thread.isAlive()) {
            System.out.println("Thread is alive.");
        } else {
            System.out.println("Thread is not alive.");
        }

        // Wait for the thread to finish execution
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Check if the thread is alive after joining
        if (thread.isAlive()) {
            System.out.println("Thread is still alive after joining.");
        } else {
            System.out.println("Thread is not alive after joining.");
        }
    }
}
