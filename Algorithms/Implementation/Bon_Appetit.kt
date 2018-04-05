import java.util.*

fun checkBill(k: Int, c: List<Int>, b: Int) {

    var b_actual = (c.sum() - c[k]) / 2

    if(b_actual == b) {
        println("Bon Appetit")
    } else {
        println(b - b_actual)
    }
}

fun main(args: Array<String>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val k = sc.nextInt()
    val c = mutableListOf<Int>()

    for (i in 1..n) {
        c.add(sc.nextInt())
    }

    val b = sc.nextInt()

    checkBill(k, c, b)
}