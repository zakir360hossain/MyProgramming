package concurrency;

/*
Condition is an alternative to wait() and notify()
 */

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionClass {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    //For thread 1
    public void method1() throws InterruptedException{
        lock.lock();
        try {
            condition.await(); // wait until the condition is met. Suspends here
            //now can do dependent operations
        }finally {
            lock.unlock();
        }
    }

    //For thread 2
    public void method2(){
        lock.lock();
        try {
            //do some operations
            condition.signal();
        }finally {
            lock.unlock();
        }
    }
}
