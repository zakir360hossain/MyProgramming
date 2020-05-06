package set1

object closure {

  def main(args: Array[String]): Unit = {
    println(func(45, 56))

    println(func2(1, 2))
  }


  // Impure closure, being var rather than val. var can be changed
  var num = 68
  def func(x: Int, y: Int): Int= {
    return x+y+num // Uses variable from outside scope
  }

  // Pure, with val. num2 to cannot be changed.
  val num2 = 68
  def func2(x:Int, y:Int):Int = {
    return x+y+num2
  }

}
