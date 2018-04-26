import java.util.*

fun climbingLeaderboard(scores: Array<Int>, alice: Array<Int>): Array<Int> {
    var rankList = mutableListOf<Int>()

    var setScores = scores.toSet().toTypedArray()
    var rank = setScores.size

    for (i in alice) {
        for (j in (0..rank - 1).reversed()) {
            if (i >= setScores[j]) {
                rank = j
            } else {
                rankList.add(rank + 1)
                break;
            }
        }
        if (rank == 0) {
            rankList.add(1)
        }
    }

    return rankList.toTypedArray()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val scoresCount = scan.nextLine().trim().toInt()
    val scores = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val aliceCount = scan.nextLine().trim().toInt()
    val alice = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = climbingLeaderboard(scores, alice)
    println(result.joinToString("\n"))
}
