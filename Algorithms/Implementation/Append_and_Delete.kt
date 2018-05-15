import java.util.*

fun appendAndDelete(s: String, t: String, k: Int): String {

    return '0'.toString()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()
    val t = scan.nextLine()
    val k = scan.nextLine().trim().toInt()

    val result = appendAndDelete(s, t, k)
    println(result)
}