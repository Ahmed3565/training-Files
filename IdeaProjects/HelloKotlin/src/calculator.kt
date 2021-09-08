// main function

fun main() {
    println(calculator(10.0, 30.0, '/'))
    println(reminder(1, 3))
}

fun calculator(n1: Double, n2: Double, c: Char): Double {
    return when (c) {
        '+' -> (n1 + n2)
        '-' -> (n1 - n2)
        '*' -> (n1 * n2)
        '/' -> (n1 / n2)
        else -> 0.0
    }
}

// single line function that return the reminder of n1 / n2
fun reminder(n1: Int , n2: Int): Int = n1 % n2