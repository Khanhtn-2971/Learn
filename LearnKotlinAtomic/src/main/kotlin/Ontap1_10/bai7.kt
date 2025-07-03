package org.example.Ontap1_10

/*Yêu cầu:
Viết overloaded hàm summarize:
summarize(prices: List<Double>): Tính tổng giá, dùng sumOf.
summarize(prices: List<Double>, discount: Double = 0.0): Tính tổng giá sau giảm (giá mỗi món ).
Trong main, tạo listOf(10.0, 20.0), gọi cả hai hàm (thứ hai với discount = 0.1),
in "Total: result." và "Discounted: result.".

Đầu ra:
Total: 30.0.
Discounted: 27.0.

 */

fun summarize(prices: List<Double>): Double {
    return prices.sumOf { it }
}

fun summarize(prices: List<Double>, discount: Double = 0.0): Double {
    return prices.sumOf { it * (1 - discount) }
}

fun main() {
    val list = listOf(10.0, 20.0)
    println("Total: ${summarize(list)}")
    println("Discounted: ${summarize(list, 0.1)}")
}