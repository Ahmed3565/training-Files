/*
* vararg is used when multi strings needed and not assigning the parameter is needed
* this function has the ability to receive only one parameter (the first parameter)
*
 */
fun thankPeople (thanks: String, vararg people: String) {
    people.forEach{person ->
        println("$thanks $person")
    }
}

fun main() {
    // an array of the type String
    val people = arrayOf("ahmed", "mosa", "lucy", "ibrahim")

    // passing the array to the function as an Individual element
    // that mean the function will receive the arrays elements one by one
    thankPeople("thanks", *people)
}