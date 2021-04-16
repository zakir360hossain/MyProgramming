// Expressions can have labels in Kotlin
fun main(args: Array<String>) {

    loop@ for (i in 1..10){
       for (j in 1..5){
           println(j)
           if ( i == 2) break@loop
       }
    }

    for (i in 1..3){
        if (i==2) continue
        println(i)
    }
}