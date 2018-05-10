import java.util.*

fun circularArray(array: List<String>, k: Int): List<String> {

    return array
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val firstLine = scan.nextLine().split(" ")
    val n = firstLine[0].trim().toInt()
    val k = firstLine[1].trim().toInt()
    val q = firstLine[2].trim().toInt()

    val secondLine = scan.nextLine().split(" ")

    circularArray(secondLine, k)

    for (i in 1..q) {
        val m = scan.nextLine().trim().toInt()
        println(secondLine[m])
    }
}