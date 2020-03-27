package topic1
import scala.collection.mutable.{Set => mutSet} // this is the way to put alias



// set: a collection of different elements of same datatype, cannot have duplicates
object set {
  def main(args: Array[String]): Unit = {

    // By default it immutable
    val numSet : Set[Int] = Set(1, 2, 3, 4, 5, 6) // If contains duplicate it removes it
    var names : Set[String] = Set("Tom", "Jerry", "Raju", "Raju") // One raju will be removed
    println(names)

    // To declare mutable set
    var numSet2 : mutSet[Int] = mutSet(1, 2, 3, 45)
    println(numSet2)
    numSet2[0] = 45
    println(numSet2)


  }

}
