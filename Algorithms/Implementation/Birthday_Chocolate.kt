import java.io.*
import java.util.*

fun main(args: Array<String>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val sc = Scanner(System.`in`)
    val input = sc.nextInt()

    var numbers = mutableListOf<Int>()

    for (i in 1..input) {
        numbers.add(sc.nextInt())
    }

    var day = sc.nextInt()
    var month = sc.nextInt()

    println("$day $month")
}