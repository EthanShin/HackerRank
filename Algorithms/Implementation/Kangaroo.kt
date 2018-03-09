import java.io.*
import java.util.*

fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): Boolean {
    if (x1 >= x2 && v1 < v2) {
        return true
    } else if (x1 < x2 && v1 > v2) {
        return true
    }
    return false
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