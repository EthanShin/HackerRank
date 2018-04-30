import java.util.*

fun angryProfessor(classInfo: List<String>, arriveTimes: List<String>): String {

    val students = classInfo[0].trim().toInt()
    val threshold = classInfo[1].trim().toInt()

    if (arriveTimes.count { e -> e <= 0.toString() } < threshold) {
        return "YES"
    }
    return "NO"
}

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)
    val testCases = scan.nextLine().trim().toInt()

    for (i in 1..testCases) {
        val classInfo = scan.nextLine().split(" ")
        val arriveTimes = scan.nextLine().split(" ")

        val result = angryProfessor(classInfo, arriveTimes)
        println(result)
    }
}