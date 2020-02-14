package basics

object HelloWorld {
  def main(args: Array[String]): Unit = {
    print("Hello World!")

    var i = 0

    // While loop
    println("With while loop")
    while (i <= 10) {
      println(i)
      i += 1
    }

    // for loop
    println("With for loop")
    for (i <- 1 to 10) {
      println(i)
    }
    val randomLetters = "ABCDE"
    for (letter <- 0 until randomLetters.length) {
      println(randomLetters(letter))
    }
    println("Looping List")
    // List
    val list = List(1, 2, 3, 4, 5)
    for (i <- list) {
      println(i)
    }
    println("loop with yield")

    var evenList = for {i <- 1 to 20 if (i % 2) == 0} yield i
    // Did not need bracket
    for (i <- evenList)
      println(i)

println("J is nested index of I")
    for (i <- 1 to 5; j <- 6 to 10) {
      println("I : " + i)
      println("J : " + j)
    }
  }

}
