package filesInKotlin

import java.io.File // kotlin way of writing on files
import java.io.PrintWriter // java of writing on files
import java.nio.file.Files // importing files to our project
import java.nio.file.StandardOpenOption // importing StandardOpenOption() to our project

fun main() {
    val content = "hi this will be saved in the file.\n"
    val anotherContent = "hi again from the file\n"

    // kotlin writeText() function
    File("db.txt").writeText(content)

    // kotlin bufferedWriter() function
    File("db.txt").bufferedWriter().use { out ->
        out.write(content)
    }
    // kotlin printWriter() function
    File("db.txt").printWriter().use { out ->
        out.println(content)
    }

    // java PrintWriter class
    val writer = PrintWriter("db.txt")
    writer.append(content)

    // new way of writing to file
    Files.write(File("db.txt").toPath(), content.toByteArray(), StandardOpenOption.APPEND)
    Files.write(File("db.txt").toPath(), anotherContent.toByteArray(), StandardOpenOption.APPEND)
    Files.write(File("db.txt").toPath(), content.toByteArray(), StandardOpenOption.APPEND)


    // this is how we read lines from the file
    val lines = File("db.txt").readLines()

    // or
    File("db.txt").useLines { line ->
        line.forEach { println(it) } }

    // also to read from files we have multiple ways
    val inputStream = File("db.txt").inputStream()
    inputStream.bufferedReader().use { it.readText() }

    // or

    File("db.txt").bufferedReader().use { it.readText() }

    // to get each line by itself
    inputStream.bufferedReader().useLines { line ->
        line.forEach {
        println(it)
    } }

    var i = 1
    lines.forEach {
        print(i++)
        println(": $it")
    }

}