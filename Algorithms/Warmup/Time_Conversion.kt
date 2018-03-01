import java.io.*
import java.util.*

fun main(args: Array<String>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val clock = readLine()!!
    var clock2 = clock.split(':').map { }

    if(clock.contains("PM")) {
        print(clock2[0])
    }
}