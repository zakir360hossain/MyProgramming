// By default, all classes are final in Kotlin
// Just like Java, Kotlin doesn't allow multiple inheritance

//Classes and methods need to be 'open' for it to be inheritable and overridable.
open class A(num: Int) {
    // Primary constructor block
    init {
       println(num)
    }

   open fun something(){
        println("This is an object of only class A")
    }
}

class B(num: Int) : A(num) {
    init {
        println(num)
    }
    override fun something(){
        println("This is an object of class B that extends class A")
    }
}

fun main() {
    val a: A = A(20) //Explicit type is not needed, but it's there.
    a.something()

    val b = B(20)
    b.something()
}