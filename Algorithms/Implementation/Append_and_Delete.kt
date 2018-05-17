import java.util.*

fun appendAndDelete(s: String, t: String, k: Int): String {

    var range = 0..(minOf(s.length, t.length) - 1)
    var location = 0

    if (k > s.length + t.length) {
        return "Yes"
    }
    
    for (i in range) {
        if (s[i] != t[i]) {
            location = i
            break;
        }
    }

    if (k == s.length + t.length - 2 * location) {
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