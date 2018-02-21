import java.io.*
import java.util.*

fun main(args: Array<String>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val numbers = readLine()!!.split(' ').map { it.toLong() }
    
    var minimal: Long
    var maximal: Long
    
    var min = numbers.first()
    var max = numbers.first()
    
    for(i in numbers) {
        if(i < min) {
            min = i
        }
        
        if(i > max) {
            max = i
        }
    }
    
    minimal = numbers.sum() - max
    maximal = numbers.sum() - min

    print("$minimal $maximal")
}