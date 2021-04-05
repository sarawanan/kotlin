import java.util.*

class Luck {
    fun getNumber() = Random().nextInt(100)
}

fun printMessage(message: String) {
    val finalMessage = object {
        val fullMessage = "Hello $message how are you?"
    }
    println(finalMessage.fullMessage)
}

object Log {
    fun info(message: String) {
        println(message)
    }
    fun debug(message: String) {
        println(message)
    }
}

class Display {
    companion object Log {
        fun info(msg: String) {
            println(msg)
        }
    }
}

fun main() {
    println(Luck().getNumber())
    println(Luck().getNumber())

    printMessage("World")

    Log.info("Hello World")
    Log.debug("Hello World")

    Display.info("Hello World")
}