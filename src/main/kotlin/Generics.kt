class MutableStack<E>(vararg items: E) {
    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)

    fun peek(): E = elements.last()

    fun pop(): E = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString(): String {
        return "MutableStack(${elements.joinToString()})"
    }
}

fun <E> mutableStackOf(vararg items: E) = MutableStack<E>(*items)

fun main() {
    val intStack = MutableStack(1, 2)
    intStack.push(3)
    println(intStack.peek())
    println(intStack.isEmpty())
    println(intStack.size())
    println(intStack.toString())
    println(intStack.pop())
    println(intStack.peek())
    println(intStack.isEmpty())
    println(intStack.size())
    println(intStack.toString())

    val strStack = MutableStack("Hello", "World")
    strStack.push("Kotlin")
    println(strStack.peek())
    println(strStack.isEmpty())
    println(strStack.size())
    println(strStack.toString())
    println(strStack.pop())
    println(strStack.peek())
    println(strStack.isEmpty())
    println(strStack.size())
    println(strStack.toString())

    val floatStack = mutableStackOf(12.0, 13.5, 15.5)
    println(floatStack.toString())
}