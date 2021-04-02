fun cases(obj: Any) {
    when (obj) {
        is Int -> println("Object is Int")
        1 -> println("One")
        2 -> println("Two")
        is Long -> println("Object is Long")
        is String -> println("Object is String")
        !is String -> println("Object is not a String")
        "Hello" -> println("Greet")
        else -> println("Unknown")
    }
}

fun whenAssign(obj: Any): Any {
    val result = when (obj) {
        1 -> "One"
        is Int -> "Obj is Int"
        else -> "Unknown"
    }
    return result
}

fun main() {
    cases(1)
    cases(2)
    cases(10.9)
    cases("Hello")
    cases("~!!!")

    println(whenAssign(1))
}