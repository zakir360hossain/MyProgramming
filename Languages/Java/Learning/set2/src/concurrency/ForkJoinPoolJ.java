package concurrency;

/*
ForkJoinPool: an internally built class.
Very similar to ExecutorService. Submit the task, execute the task, and if it is Callable, return the results in the
form of Future.

How is it different from ES?:
1. It deals with task which produces its own task aka ForkJoin
2. Per-thread queueing: All the sub-tasks from a task will be installed on its own deque.
3. Work-stealing: A thread helps another thread. If thread 1 still have jobs, and thread 0 is free, thread 0 will "steal"
   some tasks from thread 1 and get it done. In a way, it's like "helping"

Ideal ForkJoinTasks:
1. Avoid synchronization
2. Do not use shared variables across tasks
3. Do not perform Blocking IO operations
4. Are pure functions
5. Are isolated
 */

import java.util.concurrent.RecursiveTask;

public class ForkJoinPoolJ {

    //Recursive task implements ForkJoinTask
    static class Fibonacci extends RecursiveTask<Integer> {
        final int n;

        public Fibonacci(int n) {
            this.n = n;
        }

        public Integer compute() {
            if (n <= 1) {
                return n;
            }
            Fibonacci f1 = new Fibonacci(n - 1);
            f1.fork();
            Fibonacci f2 = new Fibonacci(n - 2);
            f2.fork();
            return f2.join() + f1.join();
        }
    }

    public static void main(String[] args) {

    }
}

