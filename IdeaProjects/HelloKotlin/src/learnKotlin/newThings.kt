
// now i can use the @JvmName in multiple files
// @file:JvmName("MyApp")
//@file:JvmMultifileClass

// the package name
package learnKotlin

import java.awt.desktop.SystemEventListener
import java.util.*

/*
class MyApp : person() {
    companion object {
        @JvmStatic fun main(args : Array<String>) {
            MyApp().run()
        }
    }
    fun run() {
        println("Hello World")
        println(this.name)
    }
}


open class person {
    var name = "ahmed hassan"
}

*/


// object name must be as same as file name of at least java @jvmName()
// readLine()!!.split(' ') // !! this operator use for NPE(NullPointerException).
fun main (vararg args : String) {

    val input = Scanner(System.`in`)
    println("Enter Two number")
    var a : Int  = input.nextInt()
    var b : Int = input.nextInt()
    println("Max number is : ${maxNum(a.toInt(), b.toInt())}")
}


fun maxNum(a: Int, b: Int): Int {
    var max = if (a > b) {
    println("The value of a is $a");
    a
    } else {
    println("The value of b is $b")
    b
    }
    return max;
}
