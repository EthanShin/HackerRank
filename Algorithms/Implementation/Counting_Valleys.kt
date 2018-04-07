import java.util.*

fun countValleys(steps: String): Int {

    var location = 0
    var isValley = false
    var count = 0

    for (i in steps) {
        when (i) {
            'U' -> location++
            'D' -> location--
        }

        if (location < 0 && isValley == false) {
            isValley = true
            count++
        } else if (location >= 0 && isValley == true) {
            isValley = false
        }
    }

    return count
}

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val steps = sc.next()

    var result = countValleys(steps)

    println(result)
}