package set1

// A technique of transforming a function that takes a multiple arguments into a function that takes a single
// argument.

object currying {

  def main(args: Array[String]): Unit = {
    println(add(45, 6))

    println(add2(45)(7))

    println(add3(45)(8))

    // Can apply Partially
    val sum = add2(45)
    println(sum(9))

    // Partially for the simpler syntax one
    val sum2 = add3(45)_
    println(sum2(10))
  }
  def add(x:Int, y:Int):Int ={
    return x+y
  }

  // Currying
  def add2(x:Int): Int => Int = (y : Int) => x+y;

  // with a simpler syntax
  def add3(x:Int)(y:Int): Int = x+y



}
