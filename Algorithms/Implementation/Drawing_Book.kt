import java.util.*

fun pageCount(n: Int, p: Int): Int {
    return Math.min(n/2 - p/2, p/2)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().trim().toInt()
    val p = scan.nextLine().trim().toInt()
    val result = pageCount(n, p)

    println(result)
}