import java.util.*

enum class EntityType {
    EASY, MEDIUM, HARD;

    fun getFormated (): String = name.toLowerCase().capitalize()
}

object EntityFactory {
    fun create (type: EntityType): Entitys {
        val id = UUID.randomUUID().toString()
        val name = when (type) {
            EntityType.EASY -> type.getFormated()
            EntityType.MEDIUM -> type.getFormated()
            EntityType.HARD -> type.getFormated()
        }
        return Entitys(id , name)
    }
}

class Entitys (val id: String, val name: String) {
    override fun toString(): String {
        return ("id:$id  name: $name")
    }
}

fun main() {
    val entity = EntityFactory.create(EntityType.EASY)
    println(entity)

    val mediumEntity = EntityFactory.create(EntityType.MEDIUM)
    println(mediumEntity)
}