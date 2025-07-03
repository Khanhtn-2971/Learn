package org.example.ngay10

/*
Tạo data class Item(val name: String, val quantity: Int).
Viết hàm copyItem(item: Item, newQuantity: Int = item.quantity)
    trả về bản sao của item với quantity mới (mặc định giữ nguyên).
Trong main, tạo Item("Pen", 5), dùng destructuring để lấy name, quantity, rồi gọi copyItem với newQuantity = 10, in "Item: name, quantity.".

Đầu ra:
Item: Pen, 10.
 */

data class Item(val name: String, val quantity: Int)

fun copyItem(item: Item, newQuantity: Int = item.quantity): Item {
    return item.copy(quantity = newQuantity)
}

fun main() {
    val item1 = Item("Pen", 5)
    val item2 = copyItem(item1, newQuantity = 10)
    println("Item: ${item2.name}, ${item2.quantity}.")
}