package org.example.ngay10

/*
Yêu cầu:
Tạo data class Order(val id: Int, val product: String, val price: Double).
Viết hàm processOrder(order: Order) dùng when expression trả về:
"Expensive" nếu price > 100.
"Affordable" nếu price ∈ [50, 100].
"Cheap" nếu price < 50.
Trong main, tạo listOf(Order(1, "Laptop", 1200.0), Order(2, "Book", 20.0)),
 dùng destructuring trong forEach để in "Order id: product is status.".

Đầu ra:
Order 1: Laptop is Expensive.
Order 2: Book is Cheap.
 */

data class Order(val id: Int, val product: String, val price: Double) {
}

fun processOrder(order: Order): String {
    return when {
        order.price > 100.0 -> "Expensive"
        order.price in 50.0..100.0 -> "Affordable"
        else -> "Cheap"
    }
}

fun main() {
    val list = listOf(Order(1, "Laptop", 1200.0), Order(2, "Book", 20.0))

    list.forEach { (id, product, price) ->
        val order = Order(id, product, price)
        println("Order $id: $product is ${processOrder(order)}.")
    }
}



