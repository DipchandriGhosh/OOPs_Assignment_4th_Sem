// Write a java program to create Thread by extending the Thread class.

// Custom thread class extending Thread
class MyThread extends Thread {
    public void run() {
        // Code inside the run method represents the task that the thread will execute
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread running: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class Problem1 {
    public static void main(String[] args) {
        // Creating an instance of the custom thread class
        MyThread thread = new MyThread();
        
        // Starting the thread
        thread.start();
        
        // Code after starting the thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main thread running: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted");
            }
        }
    }
}
