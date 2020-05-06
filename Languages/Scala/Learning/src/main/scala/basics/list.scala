package basics

// The element in a list is immutable
object list {
  def main(args: Array[String]): Unit = {
    var numList1: List[Int] = List(2, 4, 6, 7);
    var names:  List[String] = List("Harry", "Tom", "Johnny");

    println(numList1)
    // Pre-pending an element to the beginning (:: is called cons)
    numList1 = 1 :: numList1
    println(numList1)

    // With Nil
    var numList2 = (1:: 5:: 9:: 78:: 90:: 67:: Nil)
    println(numList2)
    // head => the first element. Tail => all elements except head
    for (name <-names){
      print(name + " ")
    }
    println()
    println(names.head)
    println(names.last)
    println(names.tail)
    println(names.isEmpty)
    println(numList2.reverse)

    // Uniform elements
    println(List.fill(5)(7)) // 5 elements of 7

    println(numList2.max)

    // Sum
    println(numList1.sum)

    // Summing by iterating
    var sum : Int = 0;
    numList2.foreach(sum += _)
    println(sum)
    numList2.foreach(sum += _*2)
    println(sum)


  }

}
