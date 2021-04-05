data class Item(val name: String, val price: Float)

data class Order(val items: Collection<Item>)

fun Order.maxPricedItemValue(): Float = this.items.maxOfOrNull { it.price } ?: 0F
fun Order.maxPricedItemName() = this.items.maxByOrNull { it.price }?.name ?: "NO_PRODUCTS"

val Order.commaDelimitedItemNames: String
        get() = items.joinToString { it.name }

fun main() {
    val order = Order(listOf(Item("Wine", 20.50F), Item("Whiskey", 250.00F)))
    println(order.maxPricedItemName())
    println(order.maxPricedItemValue())
    println(order.commaDelimitedItemNames)
}