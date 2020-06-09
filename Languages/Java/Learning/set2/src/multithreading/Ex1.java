package multithreading;

/*
 * It is nothing but doing multiple tasks at the same time. Every time when we write a java program, it uses one thread
 * (the main thread)

 * Oracle Doc: https://docs.oracle.com/javase/7/docs/api/java/lang/Thread.html
 */

class Valediction extends Thread {
    // Overriding run() from Thread
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Bye dear!");

            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Greeting extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Welcome dear!");
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    ;
}

public class Ex1 {

    // This is one thread
    public static void main(String[] args) throws Exception{
        //Before extending to Thread, welcome() will have to wait until farewell() is completely done.
        Valediction obj1 = new Valediction();
        Greeting obj2 = new Greeting();

        // The output will be at random because we are using only one core.
        obj1.start();
        obj2.start();
        obj1.run();
        obj2.run();
        System.out.println("\n=====With Runnable");

        // With lambda and Runnable, a functional interface with the run() method.
        Thread t1 = new Thread(() ->
        {
            // Thread 1 (t1) is doing this
            for (int i = 0; i < 5; i++) {
                System.out.println("Bye dear!");
                try { Thread.sleep(400); } catch (Exception e) {}
            }
            System.out.println(Thread.currentThread().getPriority());
        }, "Bye"); //Bye is the thread name

        Thread t2 = new Thread(() ->
        {
            // Thread 2 (t2) is doing this
            for (int i = 0; i < 5; i++) {
                System.out.println("Welcome dear!");
                try { Thread.sleep(400); } catch (Exception e) {}
            }
        });
        System.out.println(t1.getName());
        System.out.println(t2.getName());

        //Thread names can be set
        t2.setName("Welcome");

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(Thread.MIN_PRIORITY);
        System.out.println(Thread.MAX_PRIORITY);
        //Priorities can be set
        t1.start();
        t2.start();

        System.out.println(t1.isAlive()); // Checks if thread is still on work
        //Main thread is doing the below
        //joins are to make sure that Main thread waits until both t1 and t2 completes their jobs
        t1.join();
        t2.join();
        System.out.println(t2.isAlive());// Now it will be false, due to join
        System.out.println("This is a task done by Main thread");
    }
}

