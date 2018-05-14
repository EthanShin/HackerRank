import java.util.*

fun jumpingOnClouds(c: Array<Int>, k: Int): Int {

    var i = 0
    var energy = 100
    while (true) {
        energy -= 1
        
        if (c[i] == 1) {
            energy -= 2
        }
        i += k

        if (i == c.size) {
            if (c[0] == 1) {
                energy -= 2
            }
            break
        }
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