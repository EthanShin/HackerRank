import java.util.*

fun cutTheSticks(arr: Array<Int>): Array<Int> {

    return arr
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()
    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    
    val result = cutTheSticks(arr)
    println(result.joinToString("\n"))
}