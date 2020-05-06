package set1

/*
Options - a container which can give two values, it can an instance of sum or it can give an instance of None
 */
object options {
  def main(args: Array[String]): Unit = {
    val num = List(1, 2, 3)

    val student = Map(1->"John", 2->"William", 3->"Chris")

    println(num.find(_ >1)) // anything greater than 6
    // This will return an Option, either the first value that satisfies the condition or None.
    // It will return Some(2), saying that there are more options.
    println(num.find(_ > 1).get) // this will return exactly 2

    println(num.find(_ > 6)) // Will return None
    println(num.find(_ >6).getOrElse("There are no values greater than 6 in the list")) // To avoid the exception

    println(student.get(1))


    // Defining option
    val opt : Option[Int] = None
    println(opt.isEmpty)

    val opt2 : Option[Int] = Some(5)
    println(opt2.isEmpty)
    println(opt2.get)



  }

}
