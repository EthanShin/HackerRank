import java.util.*

fun PDFViewer(maximum: List<Int>, heights: String): Int {
    return 0
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    
    val heights = scan.nextLine().split(' ').map { it.toInt() }
    val letters = scan.nextLine()
    
    val result = PDFViewer(heights, letters)
    println(result)
}