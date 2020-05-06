package set1

import scala.collection.mutable.{Set => mutSet} // this is the way to put alias



// set: a collection of different elements of same datatype, cannot have duplicates
// Does not have any order, thus does not have index
object set {
  def main(args: Array[String]): Unit = {

    // By default it is immutable
    var names : Set[String] = Set("Tom", "Jerry", "Raju", "Raju") // One raju will be removed
    println(names)
    for (name <- names){
      println(name)
    }

    val numSet : Set[Int] = Set(1, 2, 3, 4, 5, 6) // If contains duplicate it removes it
    val numSet2:  Set[Int] = Set(3, 4, 45, 12 ,4)
    println(numSet)
    println(numSet.head)
    println(numSet.tail) // Gives the rest of the elements except the head
    println(numSet.sum)
    println(numSet.isEmpty)
    println(numSet+50) // is an element now, randomly inserted to the set
    println(numSet(1)) // Checks if 1 exist in the set
    println(numSet ++ numSet2) // concatenates, duplicates are removed. Same as numSet.++numSet2
    println(numSet.&(numSet2)) // The intersection, common elements between the two sets. Same as numSet.intersect()





    // To declare mutable set
    var numSet3 : mutSet[Int] = mutSet(1, 2, 3, 45)
    println(numSet3)






  }

}
