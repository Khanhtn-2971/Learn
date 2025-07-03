package org.example.Ontap1_10

/*
Viết hàm uniqueItems(items: List<String>) dùng toSet trả về Set chứa các phần tử duy nhất.
Trong main, tạo listOf("Apple", "Apple", "Banana"), gọi hàm, in "Unique: result." (dùng joinToString).

Đầu ra:

Unique: Apple, Banana.
 */

fun uniqueItems(items: List<String>): Set<String> {
    return items.toSet()
}

fun main() {
    val list = listOf("Apple", "Apple", "Banana")
    println("Unique: ${uniqueItems(list).joinToString(", ")}.")
}