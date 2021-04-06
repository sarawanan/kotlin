val list = listOf(-3, -2, -1, 0, 1, 2, 3)
val lst = listOf("Hello", "World", "Kotlin", "one", "two", "one")

fun main() {
    println(list.filter { x -> x > 0 })
    println(list.filter { it < 0 })

    val square = list.map { it * 2 }
    println(square)

    val hasGT3 = list.any { it > 3 }
    println(hasGT3)

    val hasGT0 = list.any { it > 0 }
    println(hasGT0)

    val hasAllPositive = list.all { it > 0 }
    println(hasAllPositive)

    val hasNoNegative = list.none { it < 0 }
    println(hasNoNegative)

    println(list.find { it == 2 })
    println(list.findLast { it == 2 })
    println(lst.find { it.startsWith("one") })
    println(lst.findLast { it.startsWith("one") })
    println(lst.find { it.contains("two") })

    val first = list.first()
    println(first)

    val last = lst.last()
    println(last)

    println(list.firstOrNull { it == 1 })
    println(list.firstOrNull { it == 6 })
    println(list.lastOrNull { it == 3 })

    println(list.count())
}