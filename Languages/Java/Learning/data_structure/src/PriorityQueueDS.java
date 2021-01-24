/**
 * Stack:Remove the item most recently added.
 * Queue: Remove the item least recently added. Randomized queue. Remove a random item.
 * Priority queue: Remove the largest (or smallest) item.
 */

public class PriorityQueueDS {

}

//Unordered implementation of a priority queue
class UnorderedMaxPQ<T extends Comparable<? super T>>{
    private T[] pq;
    private int N;

    public UnorderedMaxPQ(int capacity) {
        pq = (T[]) new Comparable[capacity];
    }
    public boolean isEmpty() {return N == 0;}
    public void insertUnordered(T x){
        pq[N++] = x;
    }

    public T delMaxUnordered(){
        int max = 0;
        for(int i=0 ; i<N; i++)
            if(ComparableJ.less(max, i)) max = i;
        ComparableJ.exchange(pq, max, N-1);
        return pq[--N];
    }

    public int size(){ return N;}
}

//Implementation of a priority queue with Binary Heap
class MaxPQ<T extends Comparable<? super T>>{
    private T[] pq;
    private int N;

    public MaxPQ(int capacity) {
        pq = (T[]) new Comparable[capacity];
    }
    public boolean isEmpty() {return N == 0;}
    public void insert(T x){
        pq[N++] = x;
        swim(N);
    }
    public T delMax(){
        T max = pq[1];
        ComparableJ.exchange(pq,1,N--);
        sink(1);
        pq[N+1] = null;
        return max;

    }
    private void swim (int k){
        Heap.swim(pq, k, N);
    }
    private void sink (int k){
        Heap.sink(pq, k, N);
    }
    public int size(){ return N;}
}

//Binary Heap implementation
class Heap{
    public static<T extends Comparable<? super T>> void heapsort(T[] pq){
        int N = pq.length;
        for (int k = N/2; k>= 1; k--){
            sink(pq, k, N);
        }
        while(N > 1){
            ComparableJ.exchange(pq,1, N);
            sink(pq,1, --N);
        }
    }
    static<T extends Comparable<? super T>> void sink(T[] pq, int k, int N){
        while (2*k <= N ){
            int j = 2*k;
            if(j < N && ComparableJ.less(j, j+1)) j++;
            if (!ComparableJ.less(k, j)) break;
            ComparableJ.exchange(pq, k, j);
            k = j;
        }
    }
    //Promotion in a heap.
    // Eliminating the violation: child key becomes larger than its parent's key
    //This is package-private
    static<T extends Comparable<? super T>> void swim(T[] pq, int k, int N){
        while (k > 1 && ComparableJ.less(k/2, k)){
            ComparableJ.exchange(pq, k, k/2);
            k /=2;
        }
    }
}