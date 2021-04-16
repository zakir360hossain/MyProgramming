/**
 * The main concept of memory management in JavaScript is reachability.
 * Simply put, “reachable” values are those that are accessible or usable somehow. 
 * They are guaranteed to be stored in memory.
 * 
 * Garbage Collector removes objects that are "unreachable"
 * It uses the "mark-and-sweep" algorithm
 * 
 * Optimizations:
 *  Generational Collection-"old" objects are examined less
 *  Incremental Collection- processes are reduced to smaller ones
 *  Idle-time Collection-tries to run when CPU is idle
 */

// user has a reference to the object
let user = {
  name: "John"
}
user = null; //reference has been removed. GC removes the object (name: "John")
