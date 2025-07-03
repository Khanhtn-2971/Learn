package org.example.Ontap1_11

/*
🧠 Bài 7 – Tính tổng số lẻ (1.14)
Viết hàm sumOddNumbers(n: Int): Int tính tổng các số lẻ từ 1 đến n.
Gợi ý: dùng if (i % 2 != 0) trong vòng lặp.
 */

fun sumOddNumbers(n: Int): Int {
    var sum: Int = 0
    for (i in 1..n) {
        if (i % 2 != 0) {
            sum += i
        }
    }
    return sum
}

fun main() {
    println(sumOddNumbers(5))
}
