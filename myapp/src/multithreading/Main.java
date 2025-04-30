
public class Main {
  public static void main(String[] args) throws InterruptedException {
    /*
     * - multithreading = Process of executing multiple threads simultaneously.
     * - Helps maximum utilization of CPU. Threads are independent, they don't
     * affect
     * the execution of other threads.
     * - An exception in one thread will not interrupt other threads.
     * - Useful for serving multiple clients, multiplayer games or other mutually
     * independent tasks.
     * 
     */
    // Creates a subclass of Thread
    MyThread thread1 = new MyThread();

    // or

    // Implements 'Runnable' interface and pass instance as an arguments to
    // Thread().
    MyRunnable runnable1 = new MyRunnable();
    Thread thread2 = new Thread(runnable1);

    thread1.start();
    thread1.join(); // once thread1 ends then thread2 runs.
    thread2.start();
  }
}
