package org.example.Ontap1_11

/*
 Bài 4 – Kiểm tra số bằng if expression (1.7)
Viết hàm describeNumber(n: Int): String trả về:
"Positive" nếu n > 0
"Negative" nếu n < 0
"Zero" nếu n == 0
 */
fun describeNumber(n: Int): String {
    return if (n > 0) "Positive"
    else if (n < 0) "Negative"
    else "Zero"
}

fun main() {
    println(describeNumber(3))
    println(describeNumber(-3))
    println(describeNumber(0))
}