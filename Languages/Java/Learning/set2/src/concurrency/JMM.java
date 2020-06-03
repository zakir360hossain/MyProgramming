package concurrency;

/*
Must understand topics:
1. Out of Order Execution - when JVM internally tries to optimize operations without changing semantics
2. Field Visibility - thread(s) knowing, partially or entirely, what the other thread(s) doing.

JMM, Java Memory Model, is a specification which guarantees visibility of fields (aka happens before)
amidst reordering of instructions. JMM rules have to be implemented by all JVM throughout platforms.

 */
public class JMM {
    //making the x volatile will make sure that the update to x done by writer is visible to the reader.
    //How? x will be flushed to the shared cache of both cores from the local cache of the core1 in which
    //writerThread is. Then, from the shared cache, x will be loaded to the local cache of core in which
    //readerThread is. Then r2 is properly updated.

    volatile int x = 0;

    int a=0, b=0;
    public void writerThread(){
        //a and b are updated
        a=3;
        b=4;
        x=1;
    }
    public void readerThread(){
        int r2 = x;
        //the updates of a and b will be visible after the above line ("int r2 = x;").
        //In fact, whatever happens before the line "x=1;" in writerThread() will be visible
        //after the above line. This is called "Happens Before"
        //This rule of Happens Before is not just used in volatile, but also in synchronized, locks,
        //concurrent collection, thread operations (join, start,)
    }
}
