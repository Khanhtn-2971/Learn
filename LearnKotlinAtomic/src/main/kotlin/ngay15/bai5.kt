package ngay15

data class Product(val name: String, val price: Double)

fun main() {
    val products = listOf(Product("Book", 15.0), Product("Pen", 2.0), Product("Notebook", 8.0))
    val filtered = products.filter{it.price > 5.0}
    println("Products > 5.0: ${filtered}")
    val upperNames = products.map { it.name.uppercase() }
    val uniquePrices = products.map { it.price }.toSet()
    println("Uppercase names: $upperNames")
    println("Unique prices: $uniquePrices")

}