import java.util.*

fun hurdleRace(maximum: Int, heights: List<Int>): Int {
    var drink = heights.max()!! - maximum
    if (drink > 0) return drink
    else return 0
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val firstLine = scan.nextLine()
    val jumps = firstLine.split(' ').first().toInt()
    val maximum = firstLine.split(' ').last().toInt()
    val heights = scan.nextLine()!!.split(' ').map { it.toInt() }

    val result = hurdleRace(maximum, heights)
    println(result)
}