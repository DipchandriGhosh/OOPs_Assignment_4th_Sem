// Write a java program to implement the sleep(n) method in thread programming

public class Problem6 {
    public static void main(String[] args) {
        // Creating a new thread
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                // Printing a message before the sleep
                System.out.println("Thread is going to sleep for 3 seconds...");

                try {
                    // Sleeping for 3 seconds
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    // Handling interruption exception
                    System.out.println("Thread was interrupted.");
                }

                // Printing a message after waking up from sleep
                System.out.println("Thread woke up from sleep.");
            }
        });

        // Starting the thread
        thread.start();
    }
}
