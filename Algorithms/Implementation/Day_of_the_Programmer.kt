import java.io.*
import java.util.*

fun isLeapYear(year: Int): Boolean {
    return false
}

fun main(args: Array<String>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val sc = Scanner(System.`in`)
    val year = sc.nextInt()
    val month = "09"
    var day = 13

    isLeapYear(year)


    println("$day.$month.$year")
}