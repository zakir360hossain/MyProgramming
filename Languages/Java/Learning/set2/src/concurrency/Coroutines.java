package concurrency;

import com.sun.xml.internal.ws.api.pipe.Fiber;

/*
Coroutines, also called Java Fibers. It is an extra abstraction over thread.
Fibers -> Thread -> Task

Advantages:
-Very light weight, few KBs of stack compared to 1MB for thread.
-Do not block the underlying thread
-Can use same API as used with Threads
-Scheduling over kernel threads handled by Scheduler
-Can run millions of Fibers in an application
-Will enable servers handling thousands of concurrent connections

 */
public class Coroutines {
    public static void main(String[] args) {
       
    }
}
