fun main() {

    // the first way to create arrays in kotlin
    val interrestingThings = arrayOf("kotlin", "programming", "learning")

    // printing the size of the array
    println(interrestingThings.size)

    // printing the first element of the array using [] method
    println(interrestingThings[0])

    // printing the first element of the array using get() method
    println(interrestingThings.get(0))

    println() // making new line
    // how to loop in kotlin with the for loop
    for (interrestingThing in interrestingThings) {
        println(interrestingThing)
    }


    println() // making new line
    // how to loop in kotlin with for each
    interrestingThings.forEach { interrestingThing ->
        println(interrestingThing)
    }

    println() // making new line
    // if we want to know the index of each element while printing it we can use
    interrestingThings.forEachIndexed { index, interrestingThing ->
        println("$interrestingThing is in the $index index")
    }

    /*
    * we can use list the same way we use the array
    * only one different that is list can be grow
    *  */
    // lists in kotlin
    val players = mutableListOf("ahmed" , "mohamed", "essa")
    players.add("mosa")
    players.remove("ahmed")

    players.forEach { player ->
        println(player)
    }


    /*
    * we can use maps the same way we use the array
    * only one different that is map index is an element
    * when we use the immutable map we write in map
  
    *  */
    // maps in kotlin
    val phoneNumbers = mutableMapOf("ahmed" to "77673","essa" to "66353")


    phoneNumbers.forEach{ personName, personNumber ->
        println("$personName number is $personNumber")
    }
    
    // assigning a collection as a parameter
    fun greetPlayers(greeting: String, players: Array<String>) {
        players.forEach{player ->
            println("$greeting $player")
        }
    }
    greetPlayers("hi", interrestingThings)

}