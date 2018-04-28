import java.util.*

fun PDFViewer(heights: List<Int>, letters: String): Int {
    var max = 0

    for (c in letters) {
        val height = heights.get(c.toInt() - 'a'.toInt())
        if (height > max) {
            max = height
        }
    }

    return max * letters.length
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val heights = scan.nextLine().split(' ').map { it.toInt() }
    val letters = scan.nextLine()

    val result = PDFViewer(heights, letters)
    println(result)
}