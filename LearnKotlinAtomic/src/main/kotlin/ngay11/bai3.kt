package org.example.ngay11

/*
Viết hàm filterValidNames(names: List<String?>) dùng filter và safe call
    trả về List chứa các tên không null, dài hơn 3 ký tự, và tất cả ký tự là chữ cái (dùng any).
Trong main, tạo listOf("Alice", null, "Bob", "123", "Kotlin"), gọi hàm,
    in "Valid names: result." (dùng joinToString).

Đầu ra:
Valid names: Alice, Kotlin.
 */

fun filterValidNames(names: List<String?>): List<String> =
    names.filterNotNull().filter { it != null && it.length > 3 && it.all { it.isLetter() } }

fun main() {
    val list = listOf("Alice", null, "Bob", "123", "Kotlin")
    println("Valid names: ${filterValidNames(list).joinToString()}.")
}