import java.lang.NumberFormatException

fun main(args: Array<String>) {
    val str : String? = readLine()

    var num : Int = try {
        str?.toInt()
    }
    catch (e : NumberFormatException){
        println("Only number string can be converted to integer, such as '5' ")
    }finally {
        println("Program ends")

    } as Int
    println(num)
}