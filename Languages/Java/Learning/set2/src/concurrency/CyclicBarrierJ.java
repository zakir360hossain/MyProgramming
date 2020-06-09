package concurrency;

import java.util.concurrent.*;

public class CyclicBarrierJ {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(4);
        CyclicBarrier barrier = new CyclicBarrier(3);
        executor.submit(new Task(barrier));
        executor.submit(new Task(barrier));
        executor.submit(new Task(barrier));

        Thread.sleep(2000);
    }

    static class Task implements Runnable {
        CyclicBarrier barrier;

        public Task(CyclicBarrier barrier) {
            this.barrier = barrier;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    barrier.await();
                } catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                }
                //send messages to corresponding system
            }
        }
    }
}
