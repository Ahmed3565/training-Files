package problemSolving

import java.util.Scanner
import java.io.BufferedReader
import java.io.File

fun main() {
    val input = Scanner(System.`in`)

    val l1 = input.nextInt()
    val r1 = input.nextInt()
    val l2 = input.nextInt()
    val r2 = input.nextInt()
    var text = ""

    for (i : Int in l1..r1) {
        if(i == l2) {
            text += "$i "
        }
    }
    for (i : Int in l2..r2) {
        if(i == r1) {
            text += "$i"
        }
    }

    if (text == "") {
        println("-1")
    } else {
        println(text)
    }

}
