package basics

object StringInter {
  def main(args: Array[String]): Unit = {
    val name = "Mark"
    val age = 29
    // This is String Interpolation. This not type safe
    println(s"$name is $age years old")
    // The other way
    println(f"$name is $age years old")

    // With declaring types (s=string, d=integer, f=float or double)
    val name2 = "William"
    val age2 = 56
    val score = 23.46
    println(f"$name2%s is $age2%d years old and has a score of $score%f.")

    // Raw interpolation
    println(s"Hello \nWorld") // backslash is counted. Not raw
    print(raw"Hello \nWorld") // backslash is also string. whatever is inside the quote is string, this is raw.
  }

}
