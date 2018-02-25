import java.io.*
import java.util.*

fun main(args: Array<String>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val numbers = readLine()!!.split(' ').map { it.toLong() }

    var minimal: Long
    var maximal: Long

    val min = numbers.min()
    val max = numbers.max()

    minimal = numbers.sum() - max!!.toLong()
    maximal = numbers.sum() - min!!.toLong()

    print("$minimal $maximal")
}