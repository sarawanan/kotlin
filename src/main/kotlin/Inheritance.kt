import kotlin.math.min

open class Car {
    open fun print() {
        println("print() in Car")
    }
}

class Ford: Car() {
    override fun print() {
        println("print() in Ford")
    }
}

class Mini: Car()

open class Train(val name: String, val origin: String) {
    open fun print() {
        println("This train: $name is from $origin")
    }
}

class TGV(name: String) : Train(name = name, origin = "France")

fun main() {
    val ford: Car = Ford()
    println(ford.print())

    val mini: Car = Mini()
    println(mini.print())

    val tgv = TGV("TGV")
    println(tgv.print())
}
