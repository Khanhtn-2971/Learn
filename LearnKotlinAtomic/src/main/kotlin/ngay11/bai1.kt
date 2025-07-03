package org.example.ngay11

/*Viết hàm greet(name: String?) trả về
chuỗi "Hello, name!" nếu name không null, ngược lại "Hello, Guest!", dùng safe call và Elvis operator.
Trong main, tạo val username: String? = null và val realName: String? = "Kotlin", gọi hàm cho cả hai, in "Result: result.".

Đầu ra:
Result: Hello, Guest!.
Result: Hello, Kotlin!.
 */

fun greet(name: String?): String {
    return "Hello, ${name ?: "Guest"}"
}

fun main() {
    val userName: String? = null
    val realName: String? = "Kotlin"

    println("Result: ${greet(userName)}.")
    println("Result: ${greet(realName)}.")
}