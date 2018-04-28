import java.util.*

fun utopianTree(cycles: Int): Int {
    if (cycles == 0) return 1

    if (cycles % 2 == 0) return utopianTree(cycles - 1) + 1
    else return utopianTree(cycles - 1) * 2
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val numbers = scan.nextInt()

    for (i in 1..numbers) {
        val cycles = scan.nextInt()
        val result = utopianTree(cycles)
        println(result)
    }
}