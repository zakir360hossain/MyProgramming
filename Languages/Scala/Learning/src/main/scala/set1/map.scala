package set1

object map {

  // This is like a dictionary. Key duplication is not possible. If there is duplicate key, it will take the last one
  val student : Map[Int, String] = Map(1->"Max", 2->"Tom", 3->"Jason", 4->"William")
  val specialStudent : Map[Int, String] = Map(5->"Arul", 6->"Zakir", 7->"Vijay")
  def main(args: Array[String]): Unit = {
    println(student)
    println(student(2)) // given key, value is returned
    println(student.keys) // This is a set
    println(student.values) // This is an iterable
    println(student.isEmpty)
    println(student.contains(4)) // Checks if the given key is contained in the map
    println(student ++ specialStudent) // Concatenation

    student.keys.foreach{ key =>
      println("Key: "+ key + "  Value: "+student(key))
    }


  }
}
