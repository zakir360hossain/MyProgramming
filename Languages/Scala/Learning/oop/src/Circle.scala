class Circle(var radius:Double) extends Figure {
  override def area: Double = math.Pi * math.pow(radius, 2)
}
