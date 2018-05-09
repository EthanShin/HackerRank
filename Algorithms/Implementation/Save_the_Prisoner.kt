import java.util.*

fun prisoner(input: List<String>): Int {
    val n = input[0].trim().toInt()
    val m = input[1].trim().toInt()
    val s = input[2].trim().toInt()

    var chair = (m + s - 1) % n
    if (chair == 0) {
        return n
    } else {
        return (m + s - 1) % n
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val case = scan.nextLine().trim().toInt()

    for (i in 1..case) {
        val input = scan.nextLine().split(" ")
        val result = prisoner(input)
        println(result)

    }
}