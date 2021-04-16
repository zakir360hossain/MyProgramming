fun main(args: Array<String>) {
    var name: String = "Roger";
    val number: Double = Math.PI; //val is immutable
    println(name);
    println(number);

    //Switch cases
    val num : Int = ((Math.random())*4).toInt()
    println(num)
    val numberGenerated = when(num)
    {
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        4 -> "Four"
        else -> "The number does not match the number generated"
    }
    println("The number generated is $numberGenerated")
}
