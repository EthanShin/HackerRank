import java.util.*

fun angryProfessor(classInfo: List<String>, arriveTimes: List<String>): String {

    val students = classInfo[0].trim().toInt()
    val threshold = classInfo[1].trim().toInt()

    return "NO"
}

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)
    val testCases = scan.nextInt()

    for (i in 1..testCases) {
        val classInfo = scan.nextLine().split(" ")


        val arriveTimes = scan.nextLine().split(" ")

        val result = angryProfessor(classInfo, arriveTimes)
        println(result)
    }
}