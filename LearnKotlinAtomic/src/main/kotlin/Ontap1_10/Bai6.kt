package org.example.Ontap1_10

/*
Yêu cầu:
Tạo enum class Type với FOOD, CLOTHING.
Tạo data class Product(val type: Type, val name: String, val quantity: Int).
Viết hàm getLowStock(products: List<Product>) dùng filter và take(2) trả về tối đa 2 sản phẩm có quantity < 5.
Trong main, tạo listOf(Product(Type.FOOD, "Apple", 3), Product(Type.CLOTHING, "Shirt", 2), Product(Type.FOOD, "Bread", 10)),
gọi hàm, in "Low stock: names." (dùng map, joinToString).
Xử lý exception nếu danh sách rỗng, trả về emptyList().

Đầu ra:
Low stock: Apple, Shirt.
 */

enum class Type {
    FOOD, CLOTHING
}

data class Product(val type: Type, val name: String, val quantity: Int)

fun getLowStock(products: List<Product>): List<Product> {
    return if (products.isEmpty()) emptyList()
    else products.filter { it.quantity < 5 }.take(2)
}

fun main() {
    val list = listOf(
        Product(Type.FOOD, "Apple", 3), Product(Type.CLOTHING, "Shirt", 2), Product(Type.FOOD, "Bread", 10)
    )
    val lowStock = getLowStock(list)
    println("Low stock: ${lowStock.map { it.name }.joinToString()}.")
}