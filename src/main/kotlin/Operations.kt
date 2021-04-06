data class P(val name: String, val age: Int, val phone: String)

val pList: List<P> = listOf(
    P("Saro", 46, "12345678"),
    P("Mammu", 41, "87654321"),
    P("Sahana", 10, "87654321"),
    P("Shreya", 16, "87654321")
)

fun main() {
    val byPhone = pList.associateBy { it.phone }
    println(byPhone)

    val byAges = pList.associateBy(P::age, P::name)
    println(byAges)

    val grpPhone = pList.groupBy(P::phone, P::name)
    println(grpPhone)

    println(map)
    println(flatMap)
}

val colors = listOf("Red", "Blue", "Orange", "Green")
val products = listOf("Slipper", "Bag", "Cloth")
val cart = listOf(colors, products)
val map = cart.map { it }
val flatMap = cart.flatten()


