import java.io.*
import java.util.*

fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): Boolean {
    var kangaroo1 = x1
    var kangaroo2 = x2
    while (true) {
        kangaroo1 += v1
        kangaroo2 += v2

        if (kangaroo1 == kangaroo2) {
            return true
        } else if (kangaroo1 > kangaroo2) {
            return false
        }
    }
}

fun main(args: Array<String>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val sc = Scanner(System.`in`)
    val x1 = sc.nextInt()
    val v1 = sc.nextInt()
    val x2 = sc.nextInt()
    val v2 = sc.nextInt()

    if (kangaroo(x1, v1, x2, v2)) {
        println("YES")
    } else {
        println("NO")
    }
}