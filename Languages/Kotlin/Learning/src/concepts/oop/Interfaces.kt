// Just like Java, Kotlin allows multiple interface implementation.

interface A1 {
    fun show(){
        print("Hello!")
    }
    fun display(){
        print("Displaying from A1")
    }
}

interface A2{
    fun show()
    fun display(){
        print("Displaying from A2")
    }
}

class C1: A1, A2 {
    // This dhow is from A1 one
    override fun show() {
       super.show()

    }
    //To specifically indicate which show() to call
    override fun display() {
       super<A2>.display()
    }

}
fun main() {
    val c1 = C1()
    c1.show()
}