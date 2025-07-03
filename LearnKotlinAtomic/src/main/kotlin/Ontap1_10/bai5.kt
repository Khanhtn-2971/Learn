package org.example.Ontap1_10
/*
Yêu cầu:
Tạo lớp Item với private property name: String và price: Double.
Viết hàm getItemsMap(items: List<Item>) trả về Map<String, Double> ánh xạ name đến price, dùng entries để duyệt nếu cần.
Trong main, tạo listOf(Item("Pen", 2.0), Item("Book", 10.0)), gọi hàm, dùng destructuring trong forEach để in "Item: name, price.".

Đầu ra:
Item: Pen, 2.0.
Item: Book, 10.0.
 */

class Item(private val name: String, private val price: Double) {
    fun getName() = name
    fun getPrice() = price
}

fun getItemsMap(items: List<Item>): Map<String, Double> {
    var map = mutableMapOf<String, Double>()
    for (i in items) {
        map[i.getName()] = i.getPrice()
    }
    return map
}

fun main() {
    val list = listOf(Item("Pen", 2.0), Item("Book", 10.0))
    getItemsMap(list).forEach { (name, price) -> println("Item: $name, $price.") }
}