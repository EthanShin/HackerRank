import java.io.*
import java.util.*

fun main(args: Array<String>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val integer = Integer.valueOf(readLine()!!)
    val numbers = readLine()!!.split(' ').map { it.toInt() }
    
    var positive = 0
    var negative = 0
    var zeroes = 0
    
    for (i in 0..integer-1) {
        when {
            numbers[i] > 0 -> positive += 1
            numbers[i] < 0 -> negative += 1
            else -> zeroes += 1
        }
    }
}