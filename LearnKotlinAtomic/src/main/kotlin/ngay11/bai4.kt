package org.example.ngay11

/*
Tạo data class Product(val name: String?, val price: Double?).
Viết hàm getPriceMap(products: List<Product>)
dùng safe call, Elvis, và groupBy trả về Map<String, Double>
ánh xạ tên sản phẩm (không null) đến giá (không null, mặc định 0.0 nếu null).

Trong main, tạo listOf(Product("Pen", 2.0), Product(null, 5.0), Product("Book", null)),
    gọi hàm, dùng destructuring trong forEach để in "Product: name, price.".

Đầu ra:
Product: Pen, 2.0.
Product: Book, 0.0.
 */

data class Product(val name: String?, val price: Double?)

fun getPriceMap(products: List<Product>): Map<String, Double> {
    return products.filter { it.name != null }
        .groupBy { it.name!! }.mapValues { it.value[0].price ?: 0.0 }
}

fun main() {
    val list = listOf(Product("Pen", 2.0), Product(null, 5.0), Product("Book", null))
    val map = getPriceMap(list)
    map.forEach { (name, value) -> println("Product: $name, $value.") }
}