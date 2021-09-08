// assinging prameters to the function
fun sayhello(greeting: String) = println("Hello $greeting")

// printing variable within a string
// also we can assign default values as an argument
fun sayGoodBay (goodBay: String = "kotlin") = println("GoodBay $goodBay")

fun main() {

    // in kotlin we can use what call a named argument
    // by specifying the variable name with = sign
    // and also the order of assigning the function parameters is not required
    sayhello(greeting = "Ahmed")
    sayGoodBay(goodBay = "Ahmed")
}