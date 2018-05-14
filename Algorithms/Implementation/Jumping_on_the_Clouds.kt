import java.util.*

fun jumpingOnClouds(c: Array<Int>, k: Int): Int {
    
    return 0
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