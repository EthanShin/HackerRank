import java.util.*

fun climbingLeaderboard(scores: Array<Int>, alice: Array<Int>): Array<Int> {
    var rankList = mutableListOf<Int>()

    var setScores = scores.toSet().toTypedArray()
    var rank = setScores.size + 1

    for (i in alice) {

        if (i >= setScores[0]) {
            rankList.add(1)
        } else {
            for (j in (0..setScores.size - 1).reversed()) {

                if (i >= setScores[j]) {
                    rank = j + 1
                } else {
                    setScores = setScores.sliceArray(0..j)
                    rankList.add(rank)
                    break;
                }
            }
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
