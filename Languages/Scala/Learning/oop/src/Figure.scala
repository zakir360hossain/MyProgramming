
abstract class Figure {
  def area:Double; // This is an abstract method. If no body = abstract
}

object Fig{
  def main(args: Array[String]): Unit = {
    var cir = new Circle(23)
    getArea(cir)
  }

  def getArea(f: Figure): Unit ={
    println(f.area)
  }
}
