fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

fun main() {
    println(calculate(10, 5, ::sum))
    println(calculate(10, 5, ::product))
    println(calculate(10, 5) { x, y -> x * y })
    println(calculate(10, 5) { x, y -> x - y })
}
