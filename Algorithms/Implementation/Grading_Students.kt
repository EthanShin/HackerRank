import java.io.*
import java.util.*

fun roundGrade(score: Int): Int {
    if (score < 38) {
        return score
    } else {
        val reminder = score.rem(5)

        if (reminder > 2) {
            return score + (5 - reminder)
        }
        return score
    }
}

fun main(args: Array<String>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val sc = Scanner(System.`in`)
    val num = sc.nextInt() - 1

    for (i in 0..num) {
        println(roundGrade(sc.nextInt()))
    }
}