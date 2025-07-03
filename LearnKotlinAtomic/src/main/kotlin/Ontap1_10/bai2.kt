package org.example.Ontap1_10

/*
Yêu cầu:
Viết hàm checkNumbers(numbers: List<Int>) dùng if expression và any trả về true nếu có ít nhất một số chẵn lớn hơn 10.
Trong main, tạo listOf(5, 12, 15), gọi hàm, in "Has even > 10: result.".

Đầu ra:
Has even > 10: true.
 */

fun checkNumbers(numbers: List<Int>) = numbers.any { it % 2 == 0 && it > 10 }

fun main() {
    val list = listOf(5, 12, 15)
    println("Has even > 10: ${checkNumbers(list)}.")
}