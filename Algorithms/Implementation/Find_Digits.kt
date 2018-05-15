import java.util.*

fun findDigits(n: Int): Int {

    var numbers = n.toString()
    var result = 0

    for (i in numbers) {
        if (i == '0') continue
        when (n % (i - '0')) {
            0 -> result++
        }
    }

    return result
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val n = scan.nextLine().trim().toInt()
        val result = findDigits(n)

        println(result)
    }
}