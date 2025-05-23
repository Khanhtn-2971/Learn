package org.example.Ngay9

/*
Yêu cầu:
Viết extension function List<String>.joinWithSeparator(separator: String = ", ")
    trả về chuỗi nối các phần tử với separator mặc định là ", ".
Trong main, tạo listOf("Apple", "Banana"), gọi hàm với separator mặc định, in "Fruits: result.".
Đầu ra:
Fruits: Apple, Banana.
 */

fun List<String>.joinWithSeparator(separator: String = ", ") = this.joinToString(separator)
fun main() {
    val list = listOf("Apple", "Banana")
    println("Fruits: ${list.joinWithSeparator()}.")
}