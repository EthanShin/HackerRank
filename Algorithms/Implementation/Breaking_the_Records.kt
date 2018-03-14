import java.io.*
import java.util.*

fun main(args: Array<String>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val sc = Scanner(System.`in`)
    val input = sc.nextInt()

    var best = sc.nextInt()
    var worst = best

    var bestRecodeTime = 0
    var worstRecodeTime = 0

    for (i in 2..input) {
        val value = sc.nextInt()
        if (value > best) {
            best = value
            bestRecodeTime++
        } else if (value < worst) {
            worst = value
            worstRecodeTime++
        }
    }

    print("$bestRecodeTime $worstRecodeTime")
}