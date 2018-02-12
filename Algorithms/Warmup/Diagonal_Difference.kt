import java.io.*
import java.util.*

fun main(args: Array<String>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val integer: Int = Integer.valueOf(readLine()!!) - 1

    var matrix = mutableListOf<List<Int>>()
    for (i in 0..integer) {
        val integerList = readLine()!!.split(' ').map { it.toInt() }
        matrix.add(integerList)
    }

    var sum = 0
    for (i in 0..integer) {
        sum += matrix[i][i] - matrix[i][integer-i]
    }
    
    println(Math.abs(sum))
}