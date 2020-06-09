package concurrency;
/*
Java does not allow guaranteed or immediate stop of a thread, however one can tell a thread nicely to finish the task
that it is currently doing, but don't continue to the next task. This can be done through a cooperative mechanism called
interrupts, which indicate a stop signal to a thread. There are other ways to accomplish this, such as shutdown.
 */

public class ThreadInterruption {
    public static void main(String[] args) {

        Thread jobThread = new Thread(new Job());
        jobThread.start();
        System.out.println("Long running jobs has started");
        //I want to cancel doing the job, but there is no cancel or stop method
        jobThread.interrupt();


    }

    static class Job implements Runnable{

        @Override
        public void run() {
           for (int i = 0; i<1000; i++){
               //do some long running operations or some blocking operations in the subset

               //poll for interrupts
               if (Thread.currentThread().isInterrupted()){
                   System.out.println("Stopping the task");
                   return;
               }
           }
        }
    }
}
