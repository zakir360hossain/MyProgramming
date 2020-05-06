package set1

/*
Reduce, fold, or scan (right/left)
 Apply binary operator
 */
object reduce_fold_scan {
  def main(args: Array[String]): Unit = {
    val num = List(3, 1, 78, 90, 64, 31, 13, 82)
    val alpha = List('A', 'B', 'C', 'D')

    println("Reduce : ")
    println(num.reduceLeft(_ + _)) // This will add all the elements, just like sum
    // Begin to reduce from the left (3+1 =4, 4+78 = 82, 82+90 = 172, etc)
    println(num.reduceLeft((x, y) => {println(x+ ", "+ y); x+y})) // This does the same thing, but step by step, like
    // the comment

    println(num.reduceRight(_ * _)) // This will multiple all, just like product.
    println(num.reduceRight((x, y) => {println(x+ " , "+y); x*y}) + "\n")


    println("Fold")
    // Fold. Difference from Reduce is that Fold can have initial argument
    println(num.foldLeft(2)(_ + _)) // Will add 2 to the sum of all the element
    println(num.foldLeft(2)((x, y) => {println(x +" , "+ y); x+y}) +"\n")


    println("Scan")
    // Similar to Fold, but scan returns value in the list format
    println(num.scanLeft(2)(_ + _))
    println(alpha.scanLeft("z")(_ + _))
    println(alpha.scanRight("z")(_ + _))







  }

}
