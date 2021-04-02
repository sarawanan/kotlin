class Customer(val name: String, var age: Int)

fun main() {
    val customer = Customer("Sarawanan", 46)
    println("${customer.name} ${customer.age}")

    customer.age = 45
    println("${customer.name} ${customer.age}")
}