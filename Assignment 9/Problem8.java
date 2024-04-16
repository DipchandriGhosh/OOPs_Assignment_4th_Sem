// Write a Java Program to Synchronize the Threads Acting on the Same Object. The
// Synchronized Block in the Program can be Executed by Only One Thread at a Time.

// Shared resource class
class SharedResource {
    // Method to perform some task, synchronized to allow only one thread at a time
    public void performTask(String threadName) {
        synchronized (this) {
            System.out.println("Thread " + threadName + " is executing synchronized block.");
            try {
                // Simulate some task execution time
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread " + threadName + " has finished executing synchronized block.");
        }
    }
}

// Worker thread class
class WorkerThread extends Thread {
    private SharedResource sharedResource;

    public WorkerThread(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    public void run() {
        // Call the synchronized method of the shared resource
        sharedResource.performTask(Thread.currentThread().getName());
    }
}

// Main class
public class Problem8 {
    public static void main(String[] args) {
        // Create a shared resource object
        SharedResource sharedResource = new SharedResource();

        // Create and start multiple worker threads
        WorkerThread thread1 = new WorkerThread(sharedResource);
        WorkerThread thread2 = new WorkerThread(sharedResource);
        WorkerThread thread3 = new WorkerThread(sharedResource);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
