package basics

import scala.io.StdIn.readLine;

object statements {
  def main(args: Array[String]): Unit = {

    val x= 20
    // Basic
    if(x ==20){
      println("X is 20")
    }


    printf("Enter a number")
    val a = readLine.toInt
    val even_odd = if(a%2==0) "EVEN" else "EVEN" // This is possible in Scala. The result will be assign to 'even_odd'
    println(even_odd)
    println(if(a%2==0) "EVEN" else "EVEN") // Same

  }

}
