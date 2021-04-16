package concepts.types

/*
the complete list of bitwise operations:

shl(bits) – signed shift left
shr(bits) – signed shift right
ushr(bits) – unsigned shift right
and(bits) – bitwise and
or(bits) – bitwise or
xor(bits) – bitwise xor
inv() – bitwise inversion
 */
fun main(args: Array<String>){
    val x = (1 shl 2) and 0x000FF000
}