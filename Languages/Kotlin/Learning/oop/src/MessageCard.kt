import java.time.LocalDateTime;

// Primary Constructor is already defined when the properties are inside the parenthesis
class MessageCard(var body: String, val time : LocalDateTime = LocalDateTime.now()) {
    var like : Boolean = false
    var love : Boolean = false

    fun like(){this.like = true}
    fun love(){this.love = true}
    fun isLiked(): Boolean {return this.like}
    fun isLoved(): Boolean{return this.love}

}

fun main(args: Array<String>) {
    var m1 = MessageCard("Hey There! This is my first text to you since yesterday")
    println("Text Body: ${m1.body}")
    m1.like()
    println(m1.isLiked())
    println(m1.isLoved())
    // Works like ternary. Checking if this message is given a like and a love
    val isBoth: Boolean = if(m1.isLiked() && m1.isLoved())
        true
    else
        false

    println(isBoth)
    println(m1.time.month)
}