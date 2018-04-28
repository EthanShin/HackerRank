import java.util.*

fun utopianTree(cycles: Int): Int {

    return 0
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val numbers = scan.nextInt()

    for (i in 0..numbers) {
        val cycles = scan.nextInt()
        val result = utopianTree(cycles)
        println(result)
    }
}