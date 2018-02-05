import java.io.*
import java.util.*

fun main(args: Array<String>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val integer: Int = Integer.valueOf(readLine()!!)    // warning: varable 'integer' is never used.
    val input = readLine()!!.split(' ')
    var sum = 0

    for (i in input) {
        sum += Integer.valueOf(i)
    }

    print("$sum")
}