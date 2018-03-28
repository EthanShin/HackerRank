import java.io.*
import java.util.*

fun isLeapYear(year: Int): Boolean {
    if (year < 1918 && year % 4 == 0) {
        return true
    }
    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
        return true
    }
    return false
}

fun main(args: Array<String>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val sc = Scanner(System.`in`)
    val year = sc.nextInt()
    val month = "09"
    var day = 13

    if (isLeapYear(year)) {
        day = 12
    }


    println("$day.$month.$year")
}