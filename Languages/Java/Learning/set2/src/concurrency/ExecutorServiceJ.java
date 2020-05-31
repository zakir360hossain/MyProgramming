package concurrency;

/*
Every time when a thread is created, it uses one core from CPU. So, creating many threads will be very costly.
ExecutorService creates a fixed number of threads (thread pool), and all the tasks will be picked by those
number of threads, one after another.

ExecutorService is an interface.
Superinterfaces: Executor
Sub_interfaces: ScheduledExecutorService
Implementing Classes: AbstractExecutorService, ForkJoinPool, ScheduledThreadPoolExecutor, ThreadPoolExecutor


Types of thread pool:
1. FixedThreadPool (LinkedBlockingQueue)->
   tasks are done one after another.

2. CashedThreadPool (SynchronousQueue-hold only 1 task)->
   does not have specified thread pool size.
   If all the threads are busy, then creates a new thread for the coming task and places it in the pool.
   If a thread is idle for more than 60 seconds (no tasks to execute) then the thread is disposed, or killed.

3. ScheduledThreadPool (DelayWorkQueue)->
   schedule threads with specified rate and delays.

4.SingleThreadedExecutor (LinkedBlockingQueue)->
  Same as the fixed thread pool, but this has only 1 thread. If the thread is killed, it recreates it
  if there are tasks to be executed. This type of pool is often used when one wants to ensure that
  task A runs before task B or task B runs before task C.

 5. Custom (ArrayBlockingQueue)

An ideal pool size (for ones that take size) depends on the magnitude of task
A thumbs up: pool size = available cores in the CPU. However, if it is IO intensive, a greater
pool size is better, but still costly.

Policies:
1. AbortPolicy
   Submitting new tasks throws RejectedExecutionException (Runtime exception)

2. DiscardPolicy
   If new task is assigned, it will silently discards it; there will be no notification or warning

3. DiscardOldestPolicy
   Submitting new tasks drops the existing oldest task, and new task is added to the queue

4. CallerRunsPolicy
   Submitting new tasks will execute the task on the caller thread itself. This can create feedback loop
   where caller thread is bsy executing the task and cannot submit new tasks at fast pace.
 */


import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class ExecutorServiceJ {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // Fixed Thread Pool
        ExecutorService service = Executors.newFixedThreadPool(5);
        //submit the tasks for execution
        for (int i = 0; i < 50; i++) {
            service.execute(new Task1());
        }

        //Cashed Thread Pool
        ExecutorService service1 = Executors.newCachedThreadPool();
        for (int i = 0; i < 50; i++) {
            service1.execute(new Task1());
        }

        //Scheduled Thread Pool
        ScheduledExecutorService service2 = Executors.newScheduledThreadPool(10);
        //task to run after 10 seconds
        service2.schedule(new Task1(), 10, TimeUnit.SECONDS);
        //First waits for 15 secs, then run the task repeatedly every 10 seconds
        service2.scheduleAtFixedRate(new Task1(), 15, 10, TimeUnit.SECONDS);
        //task to run repeatedly 10 seconds after previous task completes. Note: it will wait until
        // the task is complete, and then wait for 10 secs, and then trigger the task again
        service2.scheduleWithFixedDelay(new Task1(), 15, 10, TimeUnit.SECONDS);

        //Single Threaded Pool
        ExecutorService service3 = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 50; i++) {
            service3.execute(new Task1());
        }


        //Common Live Cycle methods
        //initiate shutdown. Will execute the current and the queued tasks, but not the new submission of task
        service3.shutdown();
        service3.execute(new Task1());// shutdown is initiated, RejectionExecutionException

        //Returns true if shutdown has been initiated
        service3.isShutdown();

        //Returns true if all tasks are completed, including the queued ones.
        service3.isTerminated();

        //Does not allow additional task submission until all the queued tasks are completed, or until the
        //given time out
        service3.awaitTermination(10, TimeUnit.SECONDS);

        //Initiates shutdown, completes the current task, but does not complete the queued tasks.
        //returns the queued tasks, which are not executed, as a list of Runnable
        List<Runnable> queuedTasks = service3.shutdownNow();

        //execute() is for tasks implemented Runnable, submit() is for tasks implemented Callable()
        //Recall that Future is a type of the data resulted from a task execution
        Future<Integer> future = service3.submit(new Task2());
        Integer result = future.get();


    }

    static class Task1 implements Runnable {
        public void run() {
            System.out.println("Thread Name: " + Thread.currentThread().getName());
        }
    }

    //When task implements Runnable, it off course does not return anything because the run() method
    //is a void method, and Runnable is a functional interface. But what if every execution needs
    // to return something. For such purpose, there is Callable

    static class Task2 implements Callable<Integer> {

        @Override
        public Integer call() throws Exception {
            return new Random().nextInt();
        }
    }
}
