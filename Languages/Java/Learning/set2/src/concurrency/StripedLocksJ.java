package concurrency;
/*
As the number of threads increases, a single lock is not efficient to perform concurrent operations across threads.
If the number of thread is like a 1000, having a lock for each thread is also not efficient.
So, what is the middle ground?

Striped Lock: a lock that handles, not all the threads or a single thread, but a group of threads.
Each striped lock is assigned to a group of thread and the lock will only look after that group.
 */


public class StripedLocksJ {

}
