package concurrency;

/*
This is basically timing (count down) a task, if the task is incomplete on the given count down, it is ignored.
 */
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchJ {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(4);

        CountDownLatch latch = new CountDownLatch(3); //count of 3, because 3 Dependent services.
        executor.submit(new DependentService(latch));
        executor.submit(new DependentService(latch));
        executor.submit(new DependentService(latch));

        latch.await(); //this will be released as count become 0
        System.out.println("All dependent services initialized");
        //program initialized, perform other operations

    }

    static class DependentService implements Runnable{
        private CountDownLatch latch;

        public DependentService(CountDownLatch latch) {
            this.latch = latch;
        }

        @Override
        public void run() {
            //startup tasks
            latch.countDown();
            //continue with other operations
        }
    }
}
