
// This is a class with primary constructor
class Employee(var name : String, var age : Int){

  // Auxiliary constructor; mimics as default
  def this() {
    this("Tom", 32) // will need to call the primary constructor
  }
  // Auxiliary constructor; parameterized (just for name, age is being pulled from the primary)
  def this(name: String) {
    this(name, 32)
  }
}

object employeeMain {
  def main(args: Array[String]): Unit = {
    var user1 = new Employee("John", 67) // Primary
    var user2 = new Employee() //Default
    var user3 = new Employee("William") // Parameterized one
    println(user3.name)
    user1.age = 32 // Can override because the user1 is var, not val

  }
}
