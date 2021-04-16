package concepts.oop//Every class needs a toString(), equals(), hashCode(), copy(), etc. and it's tedious having to create them

data class Laptop(val brand:String, val price:Double){
   fun show(){
       println("Fantastic Machine")
   }
}

fun main() {
    val lap1 = Laptop("Apple", 2600.00)
    val lap2 = lap1.copy()
    println(lap1.equals(lap2))
    println(lap2.toString())

    lap1.show()

}