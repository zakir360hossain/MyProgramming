

fun main(args: Array<String>) {
    val a = Alien()
    a.skill = "Java"
    a.show()

    val b = Alien()
    b.skill = "Kotlin"

    val c = b.add(a)
    c.show()

}
//A third person will have both skills
//extension function.
fun Alien.add(a: Alien):Alien{
    val newAlien  = Alien()
    newAlien.skill = this.skill + a.skill
    return newAlien
}


class Alien{
    var skill : String = ""

    fun show(){
        println("Skill: $skill")
    }
}
