fun main() {
    for (n in 1..3) {
        print(n)
    }
    println("")

    for (n in 2..8 step 2) {
        print(n)
    }
    println("")

    for (n in 1 until 5) {
        print(n)
    }
    println("")

    for (n in 10 downTo 4) {
        print(n)
    }
    println("")

    for (c in 'a'..'d') {
        print(c)
    }
    println("")

    for (c in 'z' downTo 'a' step 2) {
        print(c)
    }
    println("")

    val n = 2
    if (n !in 4..5) {
        println("n is not within the range")
    }

    if (n in 1..5) {
        println("n is within the range")
    }
}