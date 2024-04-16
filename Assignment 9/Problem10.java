// Write a Java Program to Get the Name of a Running Thread.

public class Problem10 {
    public static void main(String[] args) {
        // Create a thread and start it
        Thread thread = new Thread(() -> {
            // Print the name of the current thread
            System.out.println("Current thread name: " + Thread.currentThread().getName());
        });
        thread.start();

        // Wait for the thread to finish execution
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the name of the main thread
        System.out.println("Main thread name: " + Thread.currentThread().getName());
    }
}
