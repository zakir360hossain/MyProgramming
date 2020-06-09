package concurrency;

/*
Used whenever need to restrict/manage the use of limited resources

See Conceptual Depiction/Semaphore.ppt

Oracle Doc: https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/Semaphore.html
 */

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.stream.IntStream;

public class SemaphoreJ {

    public static void main(String[] args){
         Semaphore semaphore = new Semaphore(4, true); //FIFO enabled
         ExecutorService service = Executors.newFixedThreadPool(50);

        IntStream.of(100).forEach(i -> service.execute(new Task(semaphore)));
    }

    static class Task implements Runnable{
        private final Semaphore semaphore;

        public Task(Semaphore semaphore){
            this.semaphore = semaphore;
        }

        @Override
        public void run() {
            //some processing

            try {
                semaphore.acquire(); //only 4 thread can acquire, 5th will be blocked
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            semaphore.release();
            //rest of the processing

            //multiple acquiring and release, does not require try/catch
            semaphore.acquireUninterruptibly(2); // 2 thread can acquire
            semaphore.release(2); //release must be 2 as well.
            //

            //rest of the processing
        }
    }
}
