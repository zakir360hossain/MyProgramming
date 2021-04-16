package concepts.types

/**
 * Due to different representations, smaller types are not subtypes of bigger ones.
 * Smaller types are NOT implicitly converted to bigger types.
 * This means that assigning a value of type Byte to an Int variable requires an explicit conversion.
 *
 * All number types support conversions to other types:
 * toByte(): Byte
 * toShort(): Short
 * toInt(): Int
 * toLong(): Long
 * toFloat(): Float
 * toDouble(): Double
 * toChar(): Char
 * */

fun main(args: Array<String>){
    val b: Byte = 1 // OK, literals are checked statically
// val i: Int = b // ERROR
    val i1: Int = b.toInt()

}