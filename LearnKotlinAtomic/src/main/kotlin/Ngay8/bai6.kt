class Cart {
    private var items: MutableMap<String, Double> = mutableMapOf()

    var total: Double
        get() = String.format("%.2f", items.values.sum()).toDouble()
        set(_) {}

    fun addItems(vararg products: Pair<String, Double>) {
        for ((name, price) in products) {
            if (price > 0) {
                items[name] = price
            }
        }
    }

    fun getPrice(item: String): Double {
        return items.getValue(item)  // getValue sẽ ném NoSuchElementException nếu không tìm thấy
    }
}

fun main() {
    val cart = Cart()
    cart.addItems("Phone" to 599.99, "Case" to 19.99)
    println("Cart total: ${cart.total}.")

    try {
        val tabletPrice = cart.getPrice("Tablet")
        println("Tablet price: $tabletPrice")
    } catch (e: NoSuchElementException) {
        println("Error: Item not found.")
    }

    println("Cart total: ${cart.total}.")
}
