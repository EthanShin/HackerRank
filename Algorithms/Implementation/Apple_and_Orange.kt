import java.io.*
import java.util.*

fun checkRegion(base: Int, distance: Int): Int {
    return base + distance
}

fun main(args: Array<String>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val sc = Scanner(System.`in`)

    var s = sc.nextInt()
    var t = sc.nextInt()

    var a = sc.nextInt()
    var b = sc.nextInt()

    val m = sc.nextInt() - 1
    val n = sc.nextInt() - 1

    var larry = 0
    var rob = 0

    for (i in 0..m) {
        if (checkRegion(a, sc.nextInt()) in s..t) {
            larry++
        }
    }

    for (i in 0..n) {
        if (checkRegion(b, sc.nextInt()) in s..t) {
            rob++
        }
    }

    print("$larry\n$rob")
}