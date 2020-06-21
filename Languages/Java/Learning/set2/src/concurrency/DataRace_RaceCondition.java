package concurrency;
/*
Data Race:
1. Multiple threads access shared variable at the same time
2. At least one thread is writing/updating
3. No synchronization

If such variable is int, Java Language Specifications mandates that it supports atomicity.
So, if the variable is iny, it guarantees atomic writes.
However, JLS does not guarantees support of atomicity to double/long.

Race Condition occurs at 2 conditions:
1. Checks and update. Threads are "racing" to perform some operations
2. Read and update

Locks are often a solution for these problems. Atomic type and possibly volatility are also options.

 */

import java.util.concurrent.atomic.AtomicLong;

public class DataRace_RaceCondition {
    public static void main(String[] args) {

    }
}
