import java.io.*
import java.util.*

var s = 0
var t = 0
var a = 0
var b = 0

fun checkRegion(distance: Int): Boolean {
    return false
}

fun main(args: Array<String>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val sc = Scanner(System.`in`)

    s = sc.nextInt()
    t = sc.nextInt()

    a = sc.nextInt()
    b = sc.nextInt()

    val m = sc.nextInt() - 1
    val n = sc.nextInt() - 1

    var larry = 0
    var rob = 0

    for (i in 0..m) {
        if (checkRegion(sc.nextInt())) {
            larry++
        }
    }

    for (i in 0..n) {
        if (checkRegion(sc.nextInt())) {
            rob++
        }
    }

    print("$larry $rob")
}
