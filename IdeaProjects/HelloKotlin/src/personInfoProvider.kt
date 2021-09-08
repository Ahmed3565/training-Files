// making interface in kotlin
interface personInfoProvider {

    val providerInfo: String

    // interface method
    fun printInfo(person: Person) {
        println(providerInfo)
        person.printInfo()
    }
}

interface sessionProvider {
    fun getSessionId(): String
}

open class basicInfoProvider: personInfoProvider, sessionProvider {

    // overriding providerInfo property
    override val providerInfo: String
        get() = "basicInfoProvider"

    protected open val sessionIdPrefex = "session"

    // overriding printInfo method
    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("some other statements")
    }

    override fun getSessionId(): String {
        return sessionIdPrefex
    }

}


fun main() {
//    val provider = FancyInfoProvider()

    val provider = object : personInfoProvider {
        override val providerInfo: String
            get() = "New Info Provider"

        fun getSessionId (): String = "new session"
    }
    provider.printInfo(Person())
    println(provider.getSessionId())

    checkTypes(provider)
}

fun checkTypes(infoProvider: personInfoProvider) {
    if(infoProvider !is sessionProvider) {
        println("is not a session info provider")
    } else {
        println("is a session info provider")

        // how to implicit infoProvider as sessionProvider
        // first way is (infoProvider as sessionProvider).getSessionId()

        infoProvider.getSessionId()
    }

}