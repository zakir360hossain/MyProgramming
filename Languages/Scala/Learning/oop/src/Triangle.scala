class Triangle(var base:Double, var height:Double) extends Polygon {
  override def area: Double = 0.5*base*height
}
