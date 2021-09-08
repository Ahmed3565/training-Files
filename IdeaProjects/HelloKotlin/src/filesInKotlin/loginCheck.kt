package filesInKotlin

import java.util.Scanner
import java.io.File
import java.io.IOException
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardOpenOption


fun main (args : Array<String>) {
    val input = Scanner(System.`in`)

    var finished = false
    while (!finished) {

        val fileURL = "db.txt"
        val file = File(fileURL)

        println("chose one of the following \\")
        println("1- sighUp\t\t 2- logIn")
        when(Integer.parseInt(readLine()) ) {
            1 -> {
                print("email please -> ")
                val email: String = input.next()
                print("password please -> ")
                val password: String = input.next()
                if (checkDataTrue(fileURL, email)) {
                    println("??? user Email Exist !!!")
                } else {
                    Files.write(file.toPath(), "$email/$password/".toByteArray(), StandardOpenOption.APPEND)
                    Files.write(file.toPath(), "\n".toByteArray(), StandardOpenOption.APPEND)
                    sortFile(fileURL)
                    println("SignUp succeed")
                }
            }
            2 -> {
                print("email-> ")
                val email: String = input.next()
                print("password-> ")
                val password: String = input.next()
                if (checkData(fileURL, email, password)) {
                    println("logIn succeed")
                } else {
                    println("??? Invalid email or password !!!")
                }
            }

        }
    }
}
fun sortFile(url : String) {
    val sorter = mutableListOf<String>()
    val file = File(url)
    File(url).forEachLine {
        sorter.add(it)
    }
    sorter.sort()
    File(url).writeText("")
    for (i : Int in 0 until sorter.size) {
        Files.write(file.toPath(), sorter[i].toByteArray(), StandardOpenOption.APPEND)
        Files.write(file.toPath(), "\n".toByteArray(), StandardOpenOption.APPEND)
    }
}
fun checkDataTrue ( url: String, email : String) : Boolean {
    val players : List<String>
    val file = File(url)
    var string : String = ""
    var emailCheck : Boolean = false


    for (line in file.readLines()) {
        for (i : Int in line.indices) {
            val c : Char = line[i]

            if (!isFileEmpty(url)) {
                if (c == '/') {
                    emailCheck =  string == email
                    return emailCheck
                } else {
                    string += c
                }
            }

        }
    }
    return emailCheck

}

fun checkData ( url: String, email : String , password : String) : Boolean {
    val players : List<String>
    val file = File(url)
    var string : String = ""
    var index = 0
    var emailCheck : Boolean = false
    var passwordCheck : Boolean = false


    for (line in file.readLines()) {
        for (i : Int in line.indices) {
            val c : Char = line[i]

            if (!isFileEmpty(url)) {
                if (c == '/' && index == 0) {
                    emailCheck =  string == email
                    string = ""
                    index++
                    continue
                } else if (c == line[line.length - 1] && index == 1) {
                    passwordCheck =  string == password
                } else {
                    string += c
                }
            }

        }
    }
    return emailCheck && passwordCheck

}
fun isFileEmpty (url : String) : Boolean {
    try {
        for (line : String in Files.readAllLines(Paths.get(url))) {
            if (line.trim().isNotEmpty()) {
                return false
            }
        }
    } catch (e : IOException) {
        e.printStackTrace()
    }
    return true
}