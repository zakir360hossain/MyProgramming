package multithreading;

/*
Synchronization is often employed to resolve the issue of interference or interleaving of one thread to another.
If two threads do an operation by accessing the field at the same time, the effect of the operation will not take twice.

The synchronized keyword allows to program concurrently.
 */
class Counter{
    int count;
    //synchronized is to make sure that if thread 1 is accessing increment(), t2 should not interfere.
    //In other word, to make it thread-safe.
    // The Scheduler will let thread 2 do task once thread 1 is done, and vice versa.
    public synchronized void increment(){count++;}
}
public class Synchronized {
    public static void main(String[] args) throws Exception {
        Counter c = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i=1; i<=50; i++){
                c.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i=1; i<=50; i++){
                c.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(c.count);
    }
}
