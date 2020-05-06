package set1

object functions {
  def main(args: Array[String]): Unit = {
    println(deposit(46567, 45657))
    println(isEven(10))
    println(isEven(9))
    println(power(2, 4))

    // Accessing functions from an object
    println(Operation.add(23545, 3645))
    println(Operation add(3454, 4655)) // Same, does not need dot.
    println(Operation self_pow 3) // Even this way is valid, if the parameter is ONE

    // Default one
    println(sum()) // the default values are summed and returned
    println(sum(3456)) // Assigned to the 1st parameter, 2nd is still default
    println(sum(45646, 123))

    //Anonymous function. Functions are first-class citizen in Scala
    val product = (x:Int, y:Int) => x+y
    println(product(45, 4)) // product is a variable in here, not the name of the function

    // Higher order
    val quotient = mathematics(54, 234, (x, y) => x+y)
    println(quotient)
    val diff = mathematics(54, 234, (x, y) => x-y)
    println(diff)
    println(mathematics(34, 56, (x, y) => x.max(y))) // The maximum.
    println(mathematics(34, 56, (x, y) => x min y)) // The minimum. Can be done with both syntaxes.
    println(mathematics(45, 456, _+_))
    // This is wild card. Here, something to be added with something. The operators are also functions.
    println(mathematics(345, 576, _-_)) // first - last
    println(mathematics(345, 576, _ max _)) //



    // Partially Applied Functions
    val anonymousFunc = (a:Int, b: Int, c:Int) => a+b+c // This is anonymous
    val partially = anonymousFunc(10, 20, _ : Int) // This is partially applied. Can skip more than one.
    // I will fill the 3rd parameter when I call the "partially"
    println(partially(60))

  }




  def deposit(currentBalance: Double, deposit: Double): Double ={ // Need to declare the type of the function
    return currentBalance+deposit

  }

  def isEven(n:Int):Boolean = {
    if (n%2==0){
      return true
    }
    else {
      false
      // Don't need to say return, in Scala the last line is considered as the return value
    }
  }

  def power(base:Int, exp:Int): Double = math.pow(base, exp) // much shorter, no bracket and no return e word

  // Functions can be defined inside object, does not need to declared any class first
  object Operation{
    def add(a:Int, b:Int):Int =a+b
    def self_pow(x:Int): Int = x*x
  }


  //  With default value
  def sum(a:Double = 34.567, b:Double = 1.23 ):Double = a+b

  // If the function does not need return anything
  def func(x:Int, y:Int):Unit = {
  }


  // Higher order functions. Takes functions as args and return function
  def mathematics(x : Double, y : Double, function : (Double, Double) => Double): Double = function(x, y)


}
