package concurrency;

/*
Same as the Reentrant Lock, but it has a readLock functionality which allows multiple threads to access
the resources.
However, it only allows either readLock or writeLock, not both.
if readLock, multiple threads can go at the same time, if writeLock, only one thread can.

 */


import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockJ {
    private ReentrantReadWriteLock locker = new ReentrantReadWriteLock(true);

    private ReentrantReadWriteLock.ReadLock readLock = locker.readLock();
    private ReentrantReadWriteLock.WriteLock writeLock = locker.writeLock();

    private void readResource() {
        readLock.lock();
        //view the resource
        readLock.unlock();
    }

    private void writeResource() {
        writeLock.lock();
        ;
        //update the resource
        writeLock.unlock();
    }

    public static void main(String[] args) {
        //# threads are trying to book the seat, only t2 will be able to book, the rest of the threads will go to
        //waiting time
        ReadWriteLockJ obj = new ReadWriteLockJ();
        Thread t1 = new Thread(obj::readResource);
        t1.start();
        Thread t2 = new Thread(obj::readResource);
        t2.start();
        Thread t3 = new Thread(obj::writeResource);
        t3.start();
        Thread t4 = new Thread(obj::writeResource);
        t3.start();
    }
}
