package org.example.Ontap1_10

/*
Yêu cầu:
Tạo data class Order(val id: Int, val product: String, val price: Double).
Viết extension function List<Order>.filterExpensive() dùng filter, when expression, và all trả về List với:
price > 100.
price ∈ [50, 100] và product có ít nhất 5 ký tự (dùng extension String.isLongName()).
Viết extension String.isLongName() trả về true nếu chuỗi dài ≥ 5 ký tự.
Trong main, tạo listOf(Order(1, "Pen", 30.0), Order(2, "Laptop", 1200.0), Order(3, "Notebook", 60.0)),
            gọi hàm, dùng destructuring và Triple để in "Order id: product, price.".
Đầu ra:
Order 2: Laptop, 1200.0.
Order 3: Notebook, 60.0.
Gợi ý:
Dùng filter với when (Atoms 2.9, 3.4).
Destructuring: val (id, product, price) = Triple(...) (Atom 3.7).
fun String.isLongName() = length >= 5
data class Order(val id: Int, val product: String, val price: Double)
 */

data class Order(val id: Int, val product: String, val price: Double)

fun String.isLongName(): Boolean = this.length >= 5

fun List<Order>.filterExpensive(): List<Order> {
    return filter {
        when {
            it.price > 100 -> true
            it.price in 50.0..100.0 && it.product.isLongName() -> true
            else -> false
        }
    }
}

fun main() {
    val list =
        listOf(
            Order(1, "Pen", 30.0),
            Order(2, "Laptop", 1200.0),
            Order(3, "Notebook", 60.0))
    for(order in list.filterExpensive()){
        val (id, product, price) = Triple(order.id, order.product, order.price)
        println("Order $id: $product, $price.")
    }
}

