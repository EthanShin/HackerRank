import java.io.*
import java.util.*

fun main(args: Array<String>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val integer = Integer.valueOf(readLine()!!)
    
    for (i in 1..integer) {
        for (j in integer downTo 1) {
            when {
                i >= j -> print("#")
                else -> print(" ")
            }
        }
        println()
    }
}