fun main() {
    val test : Int = pow(3, 2)

    println(test)

}

fun pow(base : Int, exponint : Int) : Int {
    var total : Int = 1
    for (i : Int in 1..exponint) {
        total *= base
    }
    return total
}