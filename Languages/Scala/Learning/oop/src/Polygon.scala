
class Polygon {

  def area: Double = 0.0;
}

object Poly {
  def main(args: Array[String]): Unit = {
    var figure = new Polygon;
    var rect = new Rectangle(2.3, 4.6 );
    var tri = new Triangle(34.6, 8)
    getArea(figure)
    getArea(rect) // This will go to the parent class for the area method (MRO).
    getArea(tri)
  }

  def getArea(p: Polygon): Unit ={
    println(p.area)
  }
}
