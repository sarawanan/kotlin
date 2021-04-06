val muteList: MutableList<Int> = mutableListOf(1, 2, 3)
val readOnlyList: List<Int> = muteList

val muteSet: MutableSet<String> = mutableSetOf("Hello", "World", "Kotlin")
val readOnlySet: Set<String> = muteSet

val muteMap: MutableMap<Int, String> = mutableMapOf(1 to "Hello", 2 to "World", 3 to "Kotlin")
val readOnlyMap: Map<Int, String> = muteMap

fun main() {
    println(muteList.toString())
    muteList.add(4)
    println(readOnlyList.toString())

    println(muteSet.toString())
    muteSet.add("!")
    println(readOnlySet.toString())

    println(muteMap.containsKey(1))
    muteMap.forEach { (k, v) -> println("$k: $v") }
    muteMap[4] = "!"
    readOnlyMap.forEach { (k, v) -> println("$k: $v") }
}