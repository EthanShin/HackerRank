import java.io.*
import java.util.*

fun main(args: Array<String>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val alice = readLine()!!.split(' ').map { it.toInt() }
    val bob = readLine()!!.split(' ').map { it.toInt() }
    
    var aliceScore = 0
    var bobScore = 0

    for (i in alice.indices) {
        if (alice.elementAt(i) > bob.elementAt(i)) {
            aliceScore++
        } else if (alice.elementAt(i) < bob.elementAt(i)) {
            bobScore++
        }
    }
    
    print("$aliceScore $bobScore")
}