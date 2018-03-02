import java.io.*
import java.util.*

fun roundGrade(score: Int): Int {
    score.rem(5)
}

fun main(args: Array<String>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val sc = Scanner(System.`in`)
    val num = sc.nextInt() - 1

    var gradeList = mutableListOf<Int>()

    for (i in 0..num) {
        gradeList.add(roundGrade(sc.nextInt()))
    }

    println(gradeList)
}