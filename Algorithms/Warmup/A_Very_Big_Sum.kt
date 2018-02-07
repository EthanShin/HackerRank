import java.io.*
import java.util.*

fun main(args: Array<String>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val integer: Int = Integer.valueOf(readLine()!!)
    val integerList = readLine()!!.split(' ').map { it.toLong() }   // Long type
    
    var sum: Long = 0   //Long type: the resulting sum might exceed the above 32-bit integer range.
    for (i in integerList) {
        sum += i
    }
    
    print(sum)
}