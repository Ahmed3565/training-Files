// how to make class in kotlin that has a default constructor
class Person (val firstName: String = "peter", val lastName: String = "parker") {

    // assigning value to a class properties
//    val firstName: String = _first_name
//    val lastName: String = _last_name

    private var nickName: String? = null
//        set(value) {
//            field = value
//            println("the new of the nickName is $field")
//        }
//        get() {
//           println("the returned value is $field")
//            return field
//        }
    fun printInfo () {
        val nickNameToCheck = nickName ?: "no nickname"
        println("$firstName ($nickNameToCheck) $lastName")
    }

    // this how to make initial in kotlin
    // initial means that it will have the higher priority above all functions
//    init{
//        println("init 1")
//    }

    // how to make secondary constructor in kotlin
//    constructor(): this("peter", "parker") {
//        println("secondary constructor")
//    }
//
//    init{
//        println("init 2")
//    }

    // the second way of assigning a value to a class properties
//    init {
//        firstName = _first_name
//        lastName = _last_name
//    }
}