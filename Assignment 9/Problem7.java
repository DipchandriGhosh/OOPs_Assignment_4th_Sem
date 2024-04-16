// Create 4 threads with priority 1,3,5,7 respectively. Update a counter in each of the
// threads for 10 ms. Print the final value of count for each thread.

public class Problem7 {
    private static int count = 0;

    public static void main(String[] args) {
        // Create and start four threads with different priorities
        Thread thread1 = createThreadWithPriority(1);
        Thread thread2 = createThreadWithPriority(3);
        Thread thread3 = createThreadWithPriority(5);
        Thread thread4 = createThreadWithPriority(7);

        // Start all threads
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            // Wait for all threads to finish
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final value of count for each thread
        System.out.println("Final value of count for thread 1: " + getCount(thread1));
        System.out.println("Final value of count for thread 2: " + getCount(thread2));
        System.out.println("Final value of count for thread 3: " + getCount(thread3));
        System.out.println("Final value of count for thread 4: " + getCount(thread4));
    }

    private static Thread createThreadWithPriority(int priority) {
        return new Thread(() -> {
            long startTime = System.currentTimeMillis();
            while (System.currentTimeMillis() - startTime < 10) {
                // Update count for 10 ms
                synchronized (Problem7.class) {
                    count++;
                }
            }
        }, "Thread-priority-" + priority);
    }

    private static int getCount(Thread thread) {
        // Return the value of count for the given thread
        synchronized (Problem7.class) {
            return count;
        }
    }
}
