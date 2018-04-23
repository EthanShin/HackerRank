import java.util.*

fun getNumbers(numbers: List<Int>): Int {

    val mutableMap= numbers.groupingBy { it }.eachCount()
    var result = 0

    for (i in mutableMap.keys) {
        var downValue = mutableMap.get(i-1)?.let { it } ?: 0
        var sum = mutableMap.get(i)!! + downValue
        if (sum > result) result = sum
    }

    return result
}

fun main(args: Array<String>) {

    val n: Int = Integer.valueOf(readLine()!!)
    val input = readLine()!!.split(' ').map { it.toInt() }

    val pickingNumbers = getNumbers(input)

    println(pickingNumbers)
}