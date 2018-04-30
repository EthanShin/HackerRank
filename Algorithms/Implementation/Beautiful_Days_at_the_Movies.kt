import java.util.*

fun beautifulDays(input: List<String>): Int {

    val firstDay = input[0].trim().toInt()
    val lastDay = input[1].trim().toInt()
    val divideNumber = input[2].trim().toInt()

    return 0
}

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)
    val input = scan.nextLine().split(" ")

    val result = beautifulDays(input)
    println(result)
}