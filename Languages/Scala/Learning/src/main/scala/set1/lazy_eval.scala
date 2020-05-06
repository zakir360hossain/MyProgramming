package set1

/*
Something is assign to it's identifier once it is used, not assigned during declaration.
 */

class Strict {
  val e: Int = {
    println("Strict");
    9
  }
}

class LazyEval {
  lazy val l: Int =  {
    println("Lazy")
    9
  }
}
object lazy_eval {
  def main(args: Array[String]): Unit = {
    // Only Strict will be printed because the other one is contained lazy
    val x = new Strict;
    val y = new LazyEval;
    println("After")
    println(x.e)
    println(y.l)

    val add = (a : Int, b :Int) => {
      println("Add")
      a + b
    }
    method1(add(5, 6))
    method2(add(5, 6))
  }


  // Can also be done with method name
  def method1(n: Int): Unit ={
    println("Method 1")
    println(n)
  }

  def method2(n: => Int): Unit ={   // '=>' for a method called by name. "Method 2" will be printed first.
    println("Method 2")
    println(n)
  }
}
