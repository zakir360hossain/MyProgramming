//Package specification should be at the top of the source file.
package basics
import kotlin.text.*;

//An entry point of a Kotlin application is the main function.
fun main() {
    println("Hello world!")
}

//main can take the args array argument; the latest main will be the entry point
// (above main is not executed)
fun main(args: Array<String>) {
    println(args.contentToString()) //print() does not add a new line

    //Variables
    val a: Int = 1  // immediate assignment
    val b = 2   // `Int` type is inferred
    val c: Int  // Type required when no initializer is provided
    c = 3       // deferred assignment

    var x = 5 // Variables that can be reassigned use the var keyword.
    x += 1

    //String templates
    println("The value of c is $c")


}

//Variables can be declared outside, but must be initialized and deferred is not allowed.
val a: Int = 1
val b = 2
var x = 5