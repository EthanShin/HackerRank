import java.io.*
import java.util.*

fun checkValue(values: List<Int>, k: Int): Int {
    var sum = 0

    for (element1 in 0..(values.size-2)) {
        for (element2 in (element1+1)..(values.size-1)) {
            if ((values[element1] + values[element2] ) % k == 0) {
                sum ++
            }
        }
    }

    return sum
}

fun main(args: Array<String>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val sc = Scanner(System.`in`)
    val input = sc.nextInt()
    val k = sc.nextInt()
    var numbers = mutableListOf<Int>()

    for (i in 1..input) {
        numbers.add(sc.nextInt())
    }

    var result = checkValue(numbers, k)

    println("$result")
}