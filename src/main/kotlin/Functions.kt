fun printMessage(message: String, prefix: String = "Info") = println("$prefix: $message")

fun sum(x: Int, y: Int) = x + y

fun product(x: Int, y: Int) = x * y

//infix fun Int.times(str: String) = str.repeat(this)
operator fun Int.times(str: String) = str.repeat(this)

infix fun String.onto(str: String) = Pair(this, str)

operator fun String.get(range: IntRange) = substring(range)

fun printAll(vararg entries: String) {
    for (str in entries) print("$str ")
}

fun main() {
    printMessage("Program details")
    printMessage("expression & statement", "Debug")
    printMessage(prefix = "Error", message = "System exception")

    val sum = sum(10, 20)
    printMessage("$sum")
    printMessage("${product(10, 20)}")

//    printMessage(2 times "Hello, ")
    printMessage(2 * "Hello!")

    val pair = "Hello" to "World!"
    printMessage("$pair")
    printMessage("${"Hello" onto "World!"}")

    val hello = Person("Hello,")
    val world = Person("World!")
    hello likes world
    for (person in hello.likedPerson) { println(person.name) }

    val str = "Hello, World!"
    printMessage(str[7..11])

    printAll("Hello", "World", "Kotlin")
    val entries = arrayOf("Hello", "World", "Kotlin")
    printAll(*entries)
}

class Person(val name: String) {
    val likedPerson = mutableListOf<Person>()
    infix fun likes(other: Person) { likedPerson.add(other) }
}
