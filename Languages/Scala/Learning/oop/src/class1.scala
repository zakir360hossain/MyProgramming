
// This is class with primary constructor
class User(var name : String, var age : Int){

  // Auxiliary constructor / default
  def this() {
    this("Tom", 32) // need to call the primary constructor
  }
  // Auxiliary constructor / parameterized (just for name, age is being pulled from the primary)
  def this(name: String) {
    this(name, 32)
  }

}

object classes {
  def main(args: Array[String]): Unit = {
    var user1  = new User ("John", 67) // Primary
    var user2 = new User() //Default
    var user3 = new User("William") // Parameterized one
    println(user1.name)
    user1.age = 20 // Can override because the name is var, not val

  }
}
