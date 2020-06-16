package concurrency;

/*
Adder:
Adder is often used to resolve contention between threads. It is implemented to do synchronized operations, but in
unique fashion. With Adder, each thread will have local variable(s) and each thread will update their own variable(s).
At the end, the result from each thread will be summed to produce the final result.

See docs:
1. https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/atomic/LongAdder.html
2. https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/atomic/DoubleAdder.html

Accumulator:
It is a more generic version of Adder
 */

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.concurrent.atomic.LongAdder;

public class AdderAccumulator {
    public static void main(String[] args) throws InterruptedException {
        LongAdder counter = new LongAdder();
        //x: intermediate value, y: passed value, identity: initial value of x
        LongAccumulator counter2 = new LongAccumulator((x, y)-> x*y, 2);

        CountDownLatch latch = new CountDownLatch(100);
        ExecutorService service = Executors.newFixedThreadPool(16);
        for (int i = 0; i<100; i++){
            service.submit(new Task(counter, counter2));
        }
        latch.await();
        //Summing the results of all the 16 local counters that were in the 16 thread, 1 at each.
        long SumCounter = counter.sum();
        long SumCounter2 = counter2.get();
    }

    private static class Task implements Runnable{
        private final LongAdder counter;
        private final LongAccumulator counter2;

        private Task(LongAdder counter, LongAccumulator counter2) {
            this.counter = counter;
            this.counter2 = counter2;
        }

        @Override
        public void run() {
            counter.increment();
            counter2.accumulate(2);// this is y in terms of the instantiation in the main
            /*few iterations (initial value for x = 2)
            1. (x=2, y=2) -> 2*2 = 4  <-- this 4 becomes the new x
            2. (x=4, y=2) -> 4*2 = 8  <-- new x
            3. (x=8, y=2) -> 8*2 = 16
            ....
             */
        }
    }
}
