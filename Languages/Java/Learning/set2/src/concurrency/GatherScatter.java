package concurrency;


/*


Problem: Fetch prices of products from different websites.
1. Trigger threads, wait to complete N tasks
2. Add timeout, collect whatever prices are collected within the timeout and ignore the ones that are late.
 */

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.*;

public class GatherScatter {
    ExecutorService threadPool = Executors.newFixedThreadPool(4);
    //Let say getPrice returns a price from http call
    private Set<Integer> getPrice(int productId) throws InterruptedException {
        Set<Integer> prices = Collections.synchronizedSet(new HashSet<>());

        String [] urls = {"url1, url2, url3"}; //urls for the websites to call http requests

        CountDownLatch latch = new CountDownLatch(3);

        threadPool.submit(new Task(urls[0], productId, prices, latch));
        threadPool.submit(new Task(urls[1], productId, prices, latch));
        threadPool.submit(new Task(urls[2], productId, prices, latch));

        //'Thread.sleep(3*100);' This could work, it will wait for 3 secs, even if all prices have arrived,
        // however it is not efficient, so countDownLatch will work better
        latch.await(3, TimeUnit.SECONDS);
        return prices;
    }


     static class Task implements Runnable{
        private String url;
        private int productId;
        private Set<Integer> prices;
         private CountDownLatch latch;

         public Task(String url, int productId, Set<Integer> prices, CountDownLatch latch) {
             this.url = url;
             this.productId = productId;
             this.prices = prices;
             this.latch = latch;
         }
        @Override
        public void run() {
            int price = 0;
            //make http call to get the price
            prices.add(price);
            latch.countDown();
        }
    }
}
