package org.example.ngay11

/*Yêu cầu:
Viết hàm getFirstLength(items: List<String?>)
trả về độ dài của phần tử đầu tiên không null trong danh sách, dùng non-null assertion sau khi kiểm tra.
Nếu danh sách rỗng hoặc phần tử đầu null, trả về 0.
Trong main, tạo listOf(null, "Kotlin", null) và listOf<String?>(), gọi hàm, in "Length: result.".

Đầu ra:
Length: 6.
Length: 0.
 */

fun getFirstLength(items: List<String?>) = items.firstOrNull { it != null }?.length ?: 0

fun main() {
    val list = listOf(null, "Kotlin", null)
    val listNull = listOf<String?>()
    println("Length: ${getFirstLength(list)}.")
    println("Length: ${getFirstLength(listNull)}.")
}