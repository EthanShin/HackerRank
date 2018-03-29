import java.util.*

fun isLeapYear(inputYear: Int, inputDay: Int) {

    var daysOfMonth = mutableListOf<Int>(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    var month = 1
    var day = inputDay

    if (inputYear == 1918) {
        daysOfMonth.set(1, 15)
    } else if (inputYear < 1918 && inputYear % 4 == 0) {
        daysOfMonth.set(1, 29)
    } else if ((inputYear % 4 == 0 && inputYear % 100 != 0) || inputYear % 400 == 0) {
        daysOfMonth.set(1, 29)
    } else {
        daysOfMonth.set(1, 28)
    }

    for (i in daysOfMonth) {
        if (day < i) {
            println(String.format("%02d.%02d.%d", day, month, inputYear))
            break;
        } else {
            day -= i
            month++
        }
    }

}

fun main(args: Array<String>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val sc = Scanner(System.`in`)
    val year = sc.nextInt()
    val day = 256

    isLeapYear(year, day)
}