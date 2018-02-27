import java.io.*
import java.util.*

fun main(args: Array<String>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val clock = readLine()!!

    if(clock.contains("PM")) {
        print("PM")
    } else {
        print("AM")
    }

}