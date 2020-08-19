//This annotation is used when needed to provide a descriptive name when decompiling to Java
//default is file/class name + Kt
@file:JvmName("SomeFunctions")
fun main(args: Array<String>) {

    println(divOrMul(4, 5))

    println(findMax(34, 5))

    println(extractInitials("John", "Peterson"))

    println(calcAmount(100))
    println(calcAmount(100, 0.1))
    println(calcAmount(interestRate = .2, amt = 400)) // Kotlin provides named parameter

    //infix makes it like English language. () is not needed
    val str3 = "I like" concatenateTo "it"
    println(str3)

    //Able to replace "plus" to +
    println("Welcome" + "Back!")

}


fun divOrMul(a : Int, b : Int): Int{
    if (a %2==0 && b%2==0){
        return a*b
    }else{
        return (a/b)
    }
}
fun findMax(a:Int, b:Int) : Int = if(a>b) a else b
fun extractInitials(first: String, last: String):String = ("${first[0]}${last[0]}")

// default value
@JvmOverloads // This is because Java does not offer default values for function. So, this annotation will create 2
//methods.
fun calcAmount(amt : Int, interestRate: Double =0.04) : Int{
    return (amt + amt*interestRate).toInt()
}

//infix functions
infix fun String.concatenateTo(str: String):String = "$this $str"

//infix with operator overloading, which Java does not provide
operator infix fun String.plus(str:String):String = "$this $str"