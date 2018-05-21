import java.util.*

fun cutTheSticks(arr: Array<Int>): Array<Int> {

    var result = arrayListOf<Int>(arr.size)
    var cutLength = arr.toSet().sorted()

    do {
        var sum = 0
        for (i in arr) {
            if (i - cutLength.first() > 0) {
                sum++
            }
        }
        
        if (sum == 0) break;
        
        result.add(sum)
        cutLength = cutLength.drop(1)
    } while (true)

    return result.toTypedArray()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()
    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = cutTheSticks(arr)
    println(result.joinToString("\n"))
}