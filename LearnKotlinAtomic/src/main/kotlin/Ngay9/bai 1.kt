package org.example.Ngay9

/*Yêu cầu:
Viết extension function String.addSuffix(suffix: String) trả về chuỗi thêm hậu tố suffix.
Trong main, gọi hàm với "Kotlin" và hậu tố "!", in "Result: result.".
Đầu ra:
Result: Kotlin!.
 */

fun String.addSuffix(suffix: String) = this + suffix
fun main() {
    println("Result: ${"Kotlin".addSuffix("!")}")
}