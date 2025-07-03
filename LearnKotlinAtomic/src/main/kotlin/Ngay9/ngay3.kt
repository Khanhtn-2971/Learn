package org.example.Ngay9

/*
Yêu cầu:
Viết extension function String.toUpperIf(condition: Boolean) trả về chuỗi hoa nếu condition = true.

Viết hàm formatGreeting(name: String = "Guest", upperCase: Boolean = false) trả về chuỗi "Hello, name." (hoa toàn bộ nếu upperCase = true).
Trong main, gọi formatGreeting với name = "Alice" và upperCase = true, in "Greeting: result.".

Đầu ra:

Greeting: Hello, ALICE.
 */

fun formatGreeting(name: String = "Guest", upperCase: Boolean = false): String {
    return "Hello, ${name.toUpperIf(upperCase)}."
}

fun String.toUpperIf(condition: Boolean) = if (condition) this.uppercase() else this

fun main() {
    println("Greeting: ${formatGreeting(name = "Alice", upperCase = true)}.")
}