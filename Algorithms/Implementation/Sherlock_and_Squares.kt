import java.util.*

fun squares(a: Int, b: Int): Int {

    return 0
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val ab = scan.nextLine().split(" ")
        val a = ab[0].trim().toInt()
        val b = ab[1].trim().toInt()

        val result = squares(a, b)
        println(result)
    }
}