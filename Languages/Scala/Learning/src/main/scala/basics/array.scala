package basics

// This has all the methods (concat, last, etc.) used.
import Array._

object array {
  def main(args: Array[String]): Unit = {

    // 1st way
    val arr: Array[Int] = new Array[Int](4);
    arr(0) = 20
    arr(1) = 30
    arr(2) = 40
    arr(3) = 50
    for(i <- arr){
      print(i +" ")
    }
    println()
    for (i <- arr.indices){ // can use length -1 as well.
      print(arr(i) +" ")
    }
    println()

    // 2nd way
    val arr2  = new Array[Int](4)
    var num = 0
    for (i <- arr2.indices){
      num+=1
      arr2(i) = num
      print(arr2(i)+ " ")
    }
    println()

    // 3rd way
    val arr3 = Array(3, 4, 5, 7)
    for (i <- arr3.indices){
      print(arr3(i)*3 + " ")
    }

    println()
    val arr_concat = concat(arr, arr2)
    for (i <- arr_concat.indices){
      print(arr_concat(i) + " ")
    }

    println()
    println(arr_concat.max, arr_concat.min, arr_concat.last, arr_concat.length) // size is also available
  }
}
