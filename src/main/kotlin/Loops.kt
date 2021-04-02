fun main() {
    val list = listOf("Hello ", "World ", "Kotlin!")
    for (l in list) {
        print(l)
    }

    var n = 0
    while (n < 5) {
        println("Hello")
        n++
    }

    do {
        println("World")
        n--
    } while (n > 0)
}

