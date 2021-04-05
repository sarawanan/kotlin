data class User(val name: String, val id: Int)

fun main() {
    val user1 = User("Hello", 1)
    val user2 = User("Hello", 1)
    val user3 = User("Kotlin", 2)

    println("${user1 == user2}")
    println("${user1 == user3}")

    println(user1.hashCode())
    println(user2.hashCode())
    println(user3.hashCode())

    println(user1.copy())
    println(user1.copy(name = "World"))
    println(user1.copy(id = 5))

    println(user1.component1())
    println(user1.component2())
}