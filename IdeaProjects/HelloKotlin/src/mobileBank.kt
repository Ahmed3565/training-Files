import java.util.*

class User {
    val accountNum: String = "2645613"
    val userName: String = "Ahmed Hassan Mohamed"
    val password: String = "1123"
    val oprations = mapOf(1 to "Recent Operations", 2 to "Transformation", 3 to "Withdrawal" , 4 to "Deposit")

    fun checkData (accountNun: String, password: String) {
        var i: Int = 3
        while (i > 0){
            if (this.accountNum == accountNum && this.password == password) {
                mainPage(this.userName)
                break
            } else {
                println("Invalid account number Or password")
                i--
            }
        }
    }

    fun mainPage (userName: String) {
        println("Hello $userName\n chose an operation number:")
        oprations.forEach { opNum, opName ->
            print("| $opNum->$opName ")
        }
        println()
    }

    fun choseOperation (op: Int) {
        println(when (op) {
            1 -> "Recent Operations"
            2 -> "Transformation"
            3 -> "Withdrawal"
            4 -> "Deposit"
            else -> "invalid number"
        })
    }
}


fun main(args : Array<String>) {
    val input = Scanner(System.`in`)
    val user = User()

    System.out.println("Enter the account number-> ")
    val accountNun = input.next()

    Runtime.getRuntime().exec("clear")

    System.out.println("Enter the password-> ")
    val password = input.next()

    user.checkData(accountNun, password)

    System.out.println("Enter the operation number-> ")
    val operation = readLine()!!.toInt()
    user.choseOperation(operation)

}