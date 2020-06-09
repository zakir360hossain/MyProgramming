package concurrency;

/*
What is it used for?
Performs possible asynchronous (non-blocking) computation and trigger dependant computations which could also be
asynchronous.

The Future class gives a placeholder for a promise from a task.
If multiple Futures are created, the rest of the futures will be blocked if the first Future has not
fetched the result yet. This means Future is synchronized. There is only one sequential flow.

However, CompletableFuture scales this up. Each task can be independently done, fetching results to Futures
independently. Thus, Completable is asynchronous.
 */
public class CompletableFutureJ {
    public static void main(String[] args) {
        
    }


}
