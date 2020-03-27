package basics
import scala.io.StdIn.readLine

object input {

  def main(args: Array[String]): Unit = {
    var numberGuess = 0

    do{
      print("Guess a number")
      numberGuess = readLine.toInt
    }while(numberGuess!=15)

    printf("You guessed the secret number %d\n",  numberGuess)

  }

}
