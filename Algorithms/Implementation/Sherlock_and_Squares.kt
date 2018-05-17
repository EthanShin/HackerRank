import java.util.*
import kotlin.math.sqrt

fun squares(a: Int, b: Int): Int {

    val sqrtA = sqrt(a.toDouble())
    val sqrtB = sqrt(b.toDouble())

    val intSqrtA = sqrtA.toInt()
    val intSqrtB = sqrtB.toInt()

    return if (sqrtA - intSqrtA > 0) {
        intSqrtB - intSqrtA
    } else {
        intSqrtB - intSqrtA + 1
    }
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