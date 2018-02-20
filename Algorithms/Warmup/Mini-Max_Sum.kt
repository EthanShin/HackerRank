import java.io.*
import java.util.*

fun main(args: Array<String>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val numbers = readLine()!!.split(' ').map { it.toInt() }
    
    var minimal = 0
    var maximal = 0
    
    /*
        minimal = sum(numbers) - max(numbers)
        maximal = sum(numbers) - min(numbers)
    */

    print("$minimal $maxximal")
}