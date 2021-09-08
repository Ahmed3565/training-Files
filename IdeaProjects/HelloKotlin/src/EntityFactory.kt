interface IdProvider {
    fun getId(): String
}

class Entity private constructor (val Id : String){
    companion object Factory : IdProvider {
        const val id : String = "id"

        fun create () = Entity(getId())

        override fun getId(): String {
            return id
        }
    }
}

fun main() {
    val entity = Entity.create()
    entity.Id
}