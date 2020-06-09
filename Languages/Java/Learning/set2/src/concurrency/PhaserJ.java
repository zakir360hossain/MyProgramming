package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Phaser;

/*
A class that can act as a CountDownLatch, CyclicBarrier, plus more flexibility.

See Oracle Doc: https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/Phaser.html
 */
public class PhaserJ {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(4);

        Phaser phaser = new Phaser(3);
        executor.submit(new PhaserJ.DependentService(phaser));
        executor.submit(new PhaserJ.DependentService(phaser));
        executor.submit(new PhaserJ.DependentService(phaser));

        //For CountDownLatch
        phaser.awaitAdvance(1); //Similar to await

        //For CyclicBarrier
        Thread.sleep(3000);
    }

    static class DependentService implements Runnable{
        private Phaser phaser;

        public DependentService(Phaser phaser) {
            this.phaser = phaser;
        }

        @Override
        public void run() {
            //For CountDownLatch
            //startup tasks
            phaser.arrive();
            //continue with other operations

            //For CyclicBarrier
            while (true){
                phaser.arriveAndAwaitAdvance();//similar to barrier.await()
            }
        }
    }
}
