import java.util.*

fun jumpingOnClouds(c: Array<Int>, k: Int): Int {

    var i = 0
    var energy = 100 - c.size / k

    while (i < c.size) {
        if (c[i] == 1) {
            energy -= 2
        }
        i += k
    }

    return energy
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nk = scan.nextLine().split(" ")
    val n = nk[0].trim().toInt()
    val k = nk[1].trim().toInt()

    val c = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    val result = jumpingOnClouds(c, k)

    println(result)
}