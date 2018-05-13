import java.util.*

fun permutationEquation(p: Array<Int>): Array<Int> {

    var y = hashMapOf<Int, Int>()
    for (i in 1..p.size) {
        y[p[i-1]] = i
    }

    var result = arrayListOf<Int>()

    for (i in 1..p.size) {
        result.add(y[y[i]!!]!!)
    }

    return result.toTypedArray()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()
    val p = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = permutationEquation(p)
    println(result.joinToString("\n"))
}
