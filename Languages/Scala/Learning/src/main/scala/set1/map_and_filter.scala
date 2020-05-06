package set1

/*
Map : use to iterate over a collection (list, tuple, set) and then apply a function to each of the element
of the collection

filter takes a function as a predicate and returns Boolean


 */
object map_and_filter {
  def main(args: Array[String]): Unit = {
    val num = List(1, 2, 3, 4, 5, 6, 7, 8, 8)
    val names = Map(1->"John", 2->"Will", 3->"Zack")

    println(num.map(_ *2)) // multiply every element by 2
    println(num.map(x => x*2)) // Will do the same thing

    println(names.map(x => "Tuple Pair" + x))
    println(names.view.mapValues(x => "Student "+ x)) // [names.mapValue is deprecated] This will apply to the values only.

    // Can apply to string
    println("henderson high school".map(_.toUpper))

    // List of Lists
    println(List(List(1, 2, 3), List(3, 4, 5), List(6, 7, 8, 9)))
    println(List(List(1, 2, 3), List(3, 4, 5), List(6, 7, 8, 9)).flatten) // It joins all the sub lists into a single list

    // flatMap
    println(num.flatMap(x => List(x, 2*x, x^2))) // The flatten method is applied in here
    // a list is created for each of the element with three values based on the element, and then flattened all the lists
    // into a single one. If it was just map, then it would return all the lists



    // Filter
    println(num.filter(x => x % 2 ==0)) // returned numbers that are even
    println(names.values.filter(name => name.equalsIgnoreCase("Will")))



  }

}
