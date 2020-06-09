package concurrency;

/*
Class: ReentrantLock
Implemented Interfaces:Serializable, Lock

Locks are used for synchronous and sequential programming. In multithreading environment,
conflicts are frequent, so to avoid it, locks are necessary so that a particular thread
can uninterruptedly do its job without any other thread interfering.
First thread will go first (fairness), Scheduler will manage the timing.

Reentrant locks: explicit
Synchronized keyword: implicit
locks can be acquired in one method and can be released in another method.
Otherwise they both do the same job. Locks has some extra features.
It has "reentrant" because the task that a thread is doing can go recursive due to certain conditions, so when it's
the method again, it will not require to lock again, it will be able to "reenter".

 Oracle Doc: https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/locks/ReentrantLock.html
 */

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockJ{

    //true: enables fairness. false: enables Barge-in
    private static ReentrantLock locker = new ReentrantLock(true);

    //Books a seat for this thread
    public static void bookSeat()  {
        //Only one user at a time can book the seat
        locker.lock();

        //This is to make sure that in case if lock is not acquired, do not block other thread
        //param timeout: true if lock is acquired during this time. If timeout > 0, it does not honor the fairness.
        try {
            if (locker.tryLock(0, TimeUnit.SECONDS)){
                try {
                    //enable accessing to book seat for this thread
                    System.out.println("Trying if could book seat");
                }finally {
                    locker.unlock();
                }
            }else {
                System.out.println("Lock is not acquired, doing something else");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        //# threads are trying to book the seat, only t2 will be able to book, the rest of the threads will go to
        //waiting time
        Thread t1 = new Thread(ReentrantLockJ::bookSeat); t1.start();
        Thread t2 = new Thread(ReentrantLockJ::bookSeat); t2.start();
        Thread t3 = new Thread(ReentrantLockJ::bookSeat); t3.start();
    }

}

