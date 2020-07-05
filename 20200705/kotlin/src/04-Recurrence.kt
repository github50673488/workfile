import java.lang.Exception

fun Recurrence(num: Int): Int {
    if (num == 1) {
        return 1
    }
    return num * Recurrence(num - 1)
}

fun main() {
    println("please input a num:")
    val numStr = readLine()
    try {
        println("The result is:${Recurrence(numStr!!.toInt())}")
    } catch (e: Exception) {
        println("error input")
    }


}


