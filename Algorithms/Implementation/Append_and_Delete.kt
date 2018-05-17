import java.util.*

fun appendAndDelete(s: String, t: String, k: Int): String {
    
    val totalLength = s.length + t.length
    if (k > totalLength) return "Yes"
    
    var location = minOf(s.length, t.length)
    val range = 0..(location - 1)
    
    for (i in range) {
        if (s[i] != t[i]) {
            location = i
            break;
        }
    }

    var result = k - (totalLength - 2 * location)
    if (result == 0 || (result > 0 && result % 2 == 0)) {
        return "Yes"
    }

    return "No"
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()
    val t = scan.nextLine()
    val k = scan.nextLine().trim().toInt()

    val result = appendAndDelete(s, t, k)
    println(result)
}