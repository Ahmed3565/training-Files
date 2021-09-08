// defining a string with null as a default value
// to do that we must to add the ? sign after the data type
val nullString: String? = null
fun main() {
    // val is used when no changing in the variable is needed called (immutable)
    val name = setNames("ahmed" + " Hassan")

    // printing a name

    println(name)

    // printing null String
    // checking if the string is null or not
    if (nullString != null) {
        println(nullString)
    } else { println("your String is null!") }

    println(gender(3))

}

// functions in kotlin

fun setNames(n: String): String {
    return n
}

// switch concept in kotlin

fun gender(n: Int): String {
    // when statement = switch statement
    return when(n) {
        // -> used in kotlin instead of : and no break needed
        1 -> ("male")
        2 -> ("female")
        else -> ("Invalid number")
    }
}