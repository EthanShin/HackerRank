import java.io.*
import java.util.*

fun chocolate(values: List<Int>): Int {
    var sum = 0

    for (element in values) {
        sum += element
    }

    return sum
}

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
    var result = 0

    for (i in 0..(input-month)) {
        if (day == chocolate(numbers.subList(i, i + month))) {
            result++
        }
    }

    println("$result")
}