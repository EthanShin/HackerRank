import java.io.*
import java.util.*

fun isLeapYear(year: Int, day: Int) {
    if (year == 1918) {
        println("26.09.1918")
    } else if (year < 1918 && year % 4 == 0) {
        println("12.09.$year")
    } else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
        println("12.09.$year")
    } else {
        println("13.09.$year")
    }
}

fun main(args: Array<String>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val sc = Scanner(System.`in`)
    val year = sc.nextInt()
    val day = 256

    isLeapYear(year, day)
}