import java.util.*

fun main(args: Array<String>) {
    val nums = 1 .. 10 //range

    for (elem in nums){
        println(elem)
    }

    //step -> incremental
    for (elem in nums step 2){
        println(elem)
    }

    val nums2 = 10 downTo 1
    println(nums2.count())

    val nums3 = 1 until 16 // does not include 16
    for ((i,elem) in nums3.withIndex()){
        println("$i  :  $elem")
    }
    val chars = "A" .. "Z"

    val A = arrayOf(1, 2, 3, 5)
    val B = IntArray( 5, {i -> i*2+3})
    print(B.contentToString())
}