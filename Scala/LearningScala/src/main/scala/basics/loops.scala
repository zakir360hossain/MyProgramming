package basics

object loops {
  def main(args: Array[String]): Unit = {
    // for loop
    println("With for loop")
    for (i <- 1 to 10) {
      println(i)
    }

    val randomLetters = "ABCDE"
    for (letter <- 0 until randomLetters.length) {
      println(randomLetters(letter))
    }

    // Looping List
    val list = List(1, 2, 3, 4, 5)
    for (i <- list) {
      println(i)
    }

    // While loop
    var i = 0
    println("With while loop")
    while (i <= 10) {
      println(i)
      i += 1
    }

    // Loop with yield, and without needing brackets.
    val evenList = for {i <- 1 to 20 if (i % 2) == 0} yield i
    for (i <- evenList)
      println(i)

    println("J is nested of I")
    for (i <- 1 to 5; j <- 6 to 10) {
      println("I : " + i)
      println("J : " + j)
    }

  }
}
