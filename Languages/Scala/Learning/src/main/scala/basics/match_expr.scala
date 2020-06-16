package basics
import scala.io.StdIn.readLine

object match_expr {

  def main(args: Array[String]): Unit = {

    println("Which figure do you want to calculate? Circle (C), Triangle (T), Rectangle (R)")
    val figure = readLine

    figure match {
      case "C" =>
        printf("You have selected circle. Enter the radius")
        val radius = readLine.toDouble
        println("Area = "+ math.Pi*math.pow(radius, 2) +"  Circumference = "+2*math.Pi*radius)
      case "T" =>
        printf("You have selected triangle. Enter the base and the height")
        val b = readLine.toDouble
        val h = readLine.toDouble
        println("Area = "+0.5*b*h)
      case "R" =>
        printf("You have selected rectangle. Enter the length and the width")
        val l = readLine.toDouble
        val w = readLine.toDouble
        println("Area = "+l*w + "Perimeter = "+ 2*(l+w))

    }
  }

}
