import java.io.*
import java.util.*

fun main(args: Array<String>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val integer: Int = Integer.valueOf(readLine()!!)

    var matrix = mutableListOf<List<Int>>()
    for (i in 1..integer) {
        val integerList = readLine()!!.split(' ').map { it.toInt() }
        matrix.add(integerList)
    }
}