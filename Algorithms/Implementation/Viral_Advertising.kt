import java.util.*

fun viralAdvertising(days: Int): Int {
    var shared = 5
    var cumulative = 0

    for (i in 1..days) {
        var linked = shared / 2
        cumulative += linked
        shared = linked * 3
    }
    return cumulative
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val days = scan.nextLine().trim().toInt()

    val result = viralAdvertising(days)
    println(result)
}