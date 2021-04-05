sealed class CatFamily(val name: String)

class Lion(lionName: String, val origin: String): CatFamily(lionName)
class Tiger(tigerName: String): CatFamily(tigerName)

fun describe(catFamily: CatFamily): String {
    return when (catFamily) {
        is Lion -> "This ${catFamily.name} is from ${catFamily.origin}"
        is Tiger -> "This ${catFamily.name} is very powerful."
    }
}

fun main() {
    println(describe(Tiger("Indian Tiger")))
    println(describe(Lion("Lion", "Africa")))
}