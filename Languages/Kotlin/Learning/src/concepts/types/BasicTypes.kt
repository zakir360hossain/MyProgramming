package concepts.types

/*
NaN is considered equal to itself
NaN is considered greater than any other element including POSITIVE_INFINITY
-0.0 is considered less than 0.0

corresponding unsigned types:
UByte: an unsigned 8-bit integer, ranges from 0 to 255
UShort: an unsigned 16-bit integer, ranges from 0 to 65535
UInt: an unsigned 32-bit integer, ranges from 0 to 2^32 - 1
ULong: an unsigned 64-bit integer, ranges from 0 to 2^64 - 1
UByteArray: an array of unsigned bytes
UShortArray: an array of unsigned shorts
UIntArray: an array of unsigned ints
ULongArray: an array of unsigned longs
 */
fun main() {
    val one = 1 // Int
    val threeBillion = 3000000000 // Long
    val oneLong = 1L // Long
    val oneByte: Byte = 1
    val unsigned: UInt = 3u
    val letter: Char = 'A'

    val pi = 3.14 // Double
    // val one: Double = 1 // Error: type mismatch
    val oneDouble = 1.0 // Double
    val aFloat = 34.565f //F also works

    //Literal constants
    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010

    val l = 1L + 3 // Long + Int => Long

    val x = 5 / 2
//println(x == 2.5) // ERROR: Operator '==' cannot be applied to 'Int' and 'Double'
    println(x == 2)

    val y = 5L / 2
    println(y == 2L)
}