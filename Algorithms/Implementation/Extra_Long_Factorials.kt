import java.util.*
import java.math.BigInteger

fun extraLongFactorials(n: Int): Unit {

    var result = BigInteger.valueOf(1)
    for (i in 2..n) {
        result *= BigInteger.valueOf(i.toLong())
    }

    println(result)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    extraLongFactorials(n)
}