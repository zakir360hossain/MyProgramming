package basics

object tuple {
  // The datatype of tuple is heterogeneous
  // The size is fixed


  def main(args: Array[String]): Unit = {
    val mixedData = (1, 2, 3, "Hello", true, 4.5, (3, 4, 6)) // With a sub-tuple
    println(mixedData)
    println(mixedData._1) // Gives first element
    println(mixedData._7._3) // Third element of the sub-tuple

    //Iteration
    mixedData.productIterator.foreach{i =>
      println(i)
    }

    // Another way to declare
    val mixedData2 = new Tuple6(1, 2, 4, 5, 62, true) // The 6 after the Tuple is the size of the tuple
    val names = new Tuple2("John", "Will")
    println(1 -> "Tom") // This is also a tuple, but it works only for two elements

  }
}
