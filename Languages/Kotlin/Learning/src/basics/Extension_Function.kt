package basics

fun main(args: Array<String>) {
    val a = Person()
    a.skill = "Java"
    a.show()

    val b = Person()
    b.skill = "Kotlin"

    val c = b.add(a)
    c.show()

}
//A third person will have both skills
//extension function.
fun Person.add(a: Person):Person{
    val newPerson  = Person()
    newPerson.skill = this.skill + a.skill
    return newPerson
}


class Person{
    var skill : String = ""

    fun show(){
        println("Skill: $skill")
    }
}
