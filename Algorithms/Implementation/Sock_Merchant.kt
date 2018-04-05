import java.util.*

fun checkPair(c: List<Int>) {

    var isPair = mutableListOf<Int>()
    var pairs = 0

    for (i in c) {
        if (isPair.contains(i)) {
            pairs++
            isPair.remove(i)
        } else {
            isPair.add(i)
        }
    }
    
    println(pairs)
}

fun main(args: Array<String>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val c = mutableListOf<Int>()

    for (i in 1..n) {
        c.add(sc.nextInt())
    }

    checkPair(c)
}