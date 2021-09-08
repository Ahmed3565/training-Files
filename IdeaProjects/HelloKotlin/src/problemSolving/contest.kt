package problemSolving

import java.util.*

fun main(args : Array<String>) {
    val input: Scanner = Scanner(System.`in`)

    val cases = input.nextInt()

    for (case : Int in 1 .. cases) {
        var before : Int = 0
        var counter : Int = 0
        val size = input.nextInt()
        val numbers = IntArray(size)
        val prefixSum = IntArray(numbers.size)
        var after : Int = 0

        for (i : Int in 0 until size) {
            numbers[i] = input.nextInt()
        }

        prefixSum[0] = numbers[0];

        for (i : Int in 1 until  numbers.size) {
            prefixSum[i] = prefixSum[i - 1] + numbers[i]
        }



        for (i : Int in numbers.indices) {
            if(numbers.size == 1) {
                before = 0
                after = 0
            } else {
                if (i == 0) {
                    before = 0
                    after = prefixSum.last() - numbers[i]
                } else if (i == numbers.size - 1) {
                    before = prefixSum[i - 1]
                    after = 0
                } else {
                    before = prefixSum[i - 1]
                    after = prefixSum.last() - prefixSum[i]
                }
            }

            if (before == after) {
                counter++
            }
        }

        if (counter > 0) {
            println("YES")
        } else {
            println("NO")
        }
    }



}















//    val cases : Int = input.nextInt()
//
//    for (case : Int in cases downTo 1) {
//        var result : Int = 1
//        val num : Int = input.nextInt()
//        for (i : Int in num downTo 1) {
//            result *= i
//        }
//        println(result)
//    }
//    val s : String = input.nextLine()
//    var newS = ""
//
//    for (i : Char in s) {
//        if ((i.toInt() in 65..90) || (i.toInt() in 97..122)) {
//            if(!newS.toLowerCase().contains(i.toLowerCase())) {
//                newS += i
//            }
//        }
//    }
//    if (newS.length == 26) {
//        println("yes")
//    } else {
//        println("no")
//    }
//    val input: Scanner = Scanner(System.`in`)
//    val s = input.next()
//    var newS = ""
//    var num1 : Int = 0
//    var num2 : Int = 0
//    var c : Char = ' '
//    var counter = 0
//
//    for (i : Char in "$s+") {
//        if(i != '+' && i != '-' && i != '*' && i != '/') {
//            newS += i
//        } else {
//            if(counter == 0) {
//                num1 = newS.toInt()
//                counter++
//                newS = ""
//            } else if(counter == 1) {
//                num2 = newS.toInt()
//                break
//            }
//            c = i
//        }
//    }
//
//    when(c) {
//        '+' -> println(num1 + num2)
//        '-' -> println(num1 - num2)
//        '*' -> println(num1 * num2)
//        '/' -> println(num1 / num2)
//    }
//    val input: Scanner = Scanner(System.`in`)
//    val amount = input.nextInt()
//    val page = input.nextInt()
//    var startCounter = 0
//    var endCounter = 0
//
//    if (page < amount) {
//        for (i : Int in 0 .. amount step 2) {
//            if (i != page && i + 1 != page) {
//                startCounter++
//            } else {
//                break
//            }
//        }
//
//        for (i : Int in amount downTo  0 step 2) {
//            if (i != page && i - 1 != page) {
//                endCounter++
//            } else {
//                break
//            }
//        }
//    }
//
//
//    if(startCounter > endCounter) {
//        println(endCounter)
//    } else {
//        println(startCounter)
//    }
//    var filmCounter: Int = 0

//
//    val s : String = input.next()
//    var counter : Int = 1
//
//    for (i : Char in s) {
//        if ((i.toInt()) >= 65 && (i.toInt()) <= 90) {
//            counter++
//        }
//    }
//
//    println(counter)
//
//    var filmPrice = input.nextInt()
//    val discount = input.nextInt()
//    val minPrice = input.nextInt()
//    var amount = input.nextInt()
//
//    while (amount >= filmPrice) {
//        amount -= filmPrice
//        if (filmPrice - discount >= minPrice) {
//            filmPrice -= discount
//        }
//        filmCounter++
//    }
//
//    println(filmCounter)
