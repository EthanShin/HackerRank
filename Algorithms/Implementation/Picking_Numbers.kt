import java.util.*

fun getNumbers(numbers: List<Int>): Int {

    println(numbers.groupingBy { it }.eachCount())

    return -1
}

fun main(args: Array<String>) {

    val n: Int = Integer.valueOf(readLine()!!)
    val input = readLine()!!.split(' ').map { it.toInt() }

    val pickingNumbers = getNumbers(input)

    println(pickingNumbers)
}