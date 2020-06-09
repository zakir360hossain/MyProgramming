package concurrency;

/*
Implementing Producer Consumer pattern with wait-notify, BlockingQueue, and lock conditions
 */


import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumer {
    public static void main(String[] args) throws InterruptedException {

        //1. With Blocking Queue, thread-safe
        //The producing and consuming item is type of Integer
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

        //Producer
        final Runnable producer = () -> {
            while (true) {
                try {
                    queue.put(new Random().nextInt()); //thread is blocked if queue is full
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };
        new Thread(producer).start();
        new Thread(producer).start();

        //Consumer
        final Runnable consumer = () -> {
            while (true) {
                try {
                    Integer i = queue.take(); //takes the Integer created by Producer
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        new Thread(producer).start();
        new Thread(producer).start();

        Thread.sleep(1000);


    }

    //2. With Lock Condition
    static class WithLockCondition<E> {
        private Queue<E> queue;
        private int max = 16;
        private ReentrantLock lock = new ReentrantLock(true);
        private Condition notEmpty = lock.newCondition();
        private Condition notFull = lock.newCondition();

        public WithLockCondition(int size) {
            queue = new LinkedList<>();
            this.max = size;
        }

        public void put(E e) throws InterruptedException {
            lock.lock();
            try {
                //if it is full, wait until Consumer consumes it
                while (queue.size() == max) {
                    notFull.await();
                }
                queue.add(e);
                notEmpty.signalAll(); //announce that it is not full anymore
            } finally {
                lock.unlock();
            }
        }

        public E take() throws InterruptedException {
            try {
                //If it is empty, wait until Producer produces an item
                while (queue.size() == 0) {
                    notEmpty.await();
                }
                E item = queue.remove();
                notFull.signalAll(); // announce that it is not empty anymore
                return item;
            } finally {
                lock.unlock();
            }
        }
    }

    //3. With wait and notify
    static class WithWaitNotify<E> {
        private Queue<E> queue;
        private int max = 16;

        public synchronized void put(E e) throws InterruptedException {

            //if it is full, wait until Consumer consumes it
            while (queue.size() == max) {
                wait();
            }
            queue.add(e);
            notifyAll(); //announce that it is not full anymore
        }

        public synchronized E take() throws InterruptedException {

            //if it is full, wait until Consumer consumes it
            while (queue.size() == max) {
                wait();
            }
           E item = queue.remove();
            notifyAll(); //announce that it is not full anymore
            return item;
        }

    }
}

