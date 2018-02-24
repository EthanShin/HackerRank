import java.io.*
import java.util.*

fun main(args: Array<String>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val integer: Int = Integer.valueOf(readLine()!!)
    val input = readLine()!!.split(' ').map { it.toInt() }
    val height = input.max()

    var output = 0

    for(i in input) {
        if(i == height) {
            output++
        }
    }

    print(output)
}