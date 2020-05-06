
/*
Unlike like Python or C++ some other, Scala does not allow multiple inheritance (a class cannot extends to more than
one parent class), just like Java, and Java has interface instead. So, in Scala, Traits are partially implemented
interface

It can have abstract and non-abstract methods. It least one should be abstract.
 */
trait ShapeTrait {

  // All three are abstract (does not have body). Could have used the key word abstract before def
  def surface_area:Double;
  def volume:Double;
  def isInscribe: Boolean;
}

abstract class Shape(){
  def isPI:Boolean; // If the pi is involved with this shape
}

class Sphere(var radius:Double) extends Shape with ShapeTrait{
  override def surface_area: Double = 4*math.Pi*math.pow(radius, 2)

  override def volume: Double = (4*math.Pi*math.pow(radius, 3))/3

  override def isInscribe: Boolean = 2*radius >= 60

  override def isPI: Boolean = true

}

object Trait{
  def main(args: Array[String]): Unit = {
    var s = new Sphere(12)
    println(s.radius)
    println(s.surface_area)
    println(s.volume)
    println(s.isInscribe)
    println(s.isPI)
  }
}

// Now this trait can be inherited by a class that has already inherited a parent class.